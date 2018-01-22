package org.netbeans.modules.vuecodecompletion;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;

import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.openide.util.Exceptions;

/**
 * The basic implementation for providing code completion items. provide items
 * that are available to users when they invoke code completion in a text
 * document. The registered implementation will be used for documents that are
 * of the specified mime-type. In this case "text/html".
 *
 * @author Artur Wiśniewski
 */
@MimeRegistration(mimeType = "text/html", service = CompletionProvider.class)
public class VueCompletionProvider implements CompletionProvider {

    /**
     * Creates a task that performs a query of the given type on the given
     * component. If query is not of COMPLETION_QUERY_TYPE returns null For more
     * check CopletionProvider javadoc.
     *
     * @param queryType Type of the query. It can be one of the
     * COMPLETION_QUERY_TYPE, COMPLETION_ALL_QUERY_TYPE,
     * DOCUMENTATION_QUERY_TYPE, or TOOLTIP_QUERY_TYPE (but not their
     * combination).
     * @param jTextComponent A text component where the query should be
     * performed.
     * @return A task performing the query.
     */
    @Override
    public CompletionTask createTask(int queryType, JTextComponent jTextComponent) {
        if (queryType != CompletionProvider.COMPLETION_QUERY_TYPE && queryType!=CompletionProvider.COMPLETION_ALL_QUERY_TYPE) {
            return null;
        }
        return new AsyncCompletionTask(getAsyncCompletionQuery(), jTextComponent);
    }

    /**
     * Determines whether text typed in a document should automatically pop up
     * the code completion window. This method is called by the code completion
     * infrastructure only to check whether text that has just been typed into a
     * text component triggers an automatic query invocation. For more check
     * CopletionProvider javadoc.
     *
     * @param jTextComponent A component in which the text was typed.
     * @param typedText Typed text.
     * @return Any combination of the COMPLETION_QUERY_TYPE,
     * COMPLETION_ALL_QUERY_TYPE, DOCUMENTATION_QUERY_TYPE, and
     * TOOLTIP_QUERY_TYPE values, or zero if no query should be automatically
     * invoked.
     */
    @Override
    public int getAutoQueryTypes(JTextComponent jTextComponent, String typedText) {
        return 0;
    }

    /**
     * Logic behind adding completion items (attributes) to hint list
     *
     * @return
     */
    private AsyncCompletionQuery getAsyncCompletionQuery() {
        return new AsyncCompletionQuery() {
            @Override
            protected void query(CompletionResultSet completionResultSet, Document document, int caretOffset) {

                final StyledDocument styledDocument = (StyledDocument) document;

                try {
                    int startOffset = caretOffset - 1;
                    String filter = null;
                    final String currentTag = CompletionUtils.getCurrentTagName(styledDocument, caretOffset);
                   
                    final int lineStartOffset = CompletionUtils.getRowFirstNonWhite(styledDocument, caretOffset);
                    final char[] line = styledDocument.getText(lineStartOffset, caretOffset - lineStartOffset).toCharArray();
                    final int whiteOffset = CompletionUtils.getIndexOfLastSpace(line);
                    filter = new String(line, whiteOffset + 1, line.length - whiteOffset - 1);
                    if (whiteOffset > 0) {
                        startOffset = lineStartOffset + whiteOffset + 1;
                    } else {
                        startOffset = lineStartOffset;
                    }
                    if (currentTag.isEmpty()||!currentTag.endsWith(" ")) {
                        //没有标签
                        if(!filter.endsWith(">")){
                            String prefix="<";
                            if(filter.startsWith(prefix)){
                                filter = filter.substring(1);
                            }
                            for (String tag : VueData.getVueTags()) {
                                if (tag.startsWith(filter) || tag.startsWith("el-"+filter)) {
                                    completionResultSet.addItem(new VueCompletionItem(tag,tag, startOffset, caretOffset));
                                }
                            }
                        }
                    }else{
                        //标签内属性
                        if (!CompletionUtils.insideAttribute((StyledDocument) document, caretOffset)) {
                            String prefix = "";
                            if(filter.startsWith(":")||filter.startsWith("@")){
                                prefix = filter.substring(0, 1);
                                filter = filter.substring(1);
                            }
                            for (String attribute : VueData.getVueAttributes(currentTag.trim())) {
                                if (attribute.startsWith(filter)) {
                                    completionResultSet.addItem(new VueCompletionItem(currentTag.trim(),prefix+attribute, startOffset, caretOffset));
                                }

                            }
                        }
                    }
                    
                } catch (BadLocationException ex) {
                    Exceptions.printStackTrace(ex);
                }
                
                completionResultSet.finish();
            }


             
        };
    }
}
