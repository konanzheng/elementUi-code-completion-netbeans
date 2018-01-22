package org.netbeans.modules.vuecodecompletion;

import java.net.URL;

import javax.swing.Action;

import org.netbeans.spi.editor.completion.CompletionDocumentation;

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

    /**
     * Returns documentation text from VueData class displayed in
 documentation popup.
     *
     * @return String documentation text or "No documentation available."
     * message
     */
    @Override
    public String getText() {
        String docLocation = "http://element-cn.eleme.io/#/zh-CN/component/"+item.getTag().substring(3);
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
        documentation +="<p><b>网页文档</b></p><p><a href=\""+docLocation+"\">"+docLocation+"</a></p>";
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
        return null;
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
