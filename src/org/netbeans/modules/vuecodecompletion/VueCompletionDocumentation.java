package org.netbeans.modules.vuecodecompletion;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Action;

import org.netbeans.spi.editor.completion.CompletionDocumentation;
import org.openide.util.Exceptions;

/**
 * Class responsible for displaying documentation in the documentation popup.
 *
 * @author Artur Wiśniewski
 */
public class VueCompletionDocumentation implements CompletionDocumentation {

    /**
     * Completion Item containing Thymeleaf attribute.
     */
    private final VueCompletionItem item;

    /**
     *
     * @param item item in code completion window list
     */
    public VueCompletionDocumentation(VueCompletionItem item) {
        this.item = item;
    }
    
    public String getDocLocation(){
    
        return "http://element-cn.eleme.io/#/zh-CN/component/"+item.getTag().substring(3);
    }

    /**
     * Returns documentation text from VueData class displayed in
 documentation popup.
     *
     * @return String documentation text or "No documentation available."
     * message
     */
    @Override
    public String getText() {
        String docLocation = getDocLocation();
        String tagDoc = VueData.getDoc(item.getTag());
        String documentation = "<h1>ElementUi </h1><h2>"+item.getTag()+"组件</h2>"+tagDoc;
        if(item.getAttribute()!=null){
            String attrDoc = VueData.getDoc(item.getAttribute());
            if(attrDoc == null){
                attrDoc = VueData.getDoc(item.getTag().substring(3)+"/"+item.getAttribute());
                if(attrDoc==null){
                    attrDoc = "没有属性文档";
                }
            }
            documentation += "<h3>"+item.getAttribute()+"属性</h3>"+attrDoc;
        }
        documentation +="<p><b>在线文档</b></p><p><a href=\""+docLocation+"\">地址:"+docLocation+"</a></p>";
        documentation +="<iframe src=\""+docLocation+"\"></iframe>";
        return documentation ;
    }

    /**
     * Returns a URL of the item's external representation that can be displayed
     * in an external browser or null if the item has no external
     * representation.
     *
     * @return null - not implemented
     */
    @Override
    public URL getURL() {
         URL url=null;
        try {
           url = new URL(getDocLocation());
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
        return url;
    }

    /**
     * Returns a documentation item representing an object linked from the
     * item's HTML text.
     *
     * @param link
     * @return null - not implemented
     */
    @Override
    public CompletionDocumentation resolveLink(String link) {
        if(java.awt.Desktop.isDesktopSupported()){
            try{
                //创建一个URI实例,注意不是URL
                java.net.URI uri=java.net.URI.create(link);
                //获取当前系统桌面扩展
                java.awt.Desktop dp=java.awt.Desktop.getDesktop();
                //判断系统桌面是否支持要执行的功能
                if(dp.isSupported(java.awt.Desktop.Action.BROWSE)){
                    //获取系统默认浏览器打开链接
                    dp.browse(uri);
                }
            }catch(java.lang.NullPointerException e){
                //此为uri为空时抛出异常
            }catch(java.io.IOException e){
                //此为无法获取系统默认浏览器
            }
        }
        return null;
    }

    /**
     * Returns an action that opens the item's source representation in the
     * editor or null if the item has no source representation.
     *
     * @return null - not implemented
     */
    @Override
    public Action getGotoSourceAction() {
        return null;
    }

}
