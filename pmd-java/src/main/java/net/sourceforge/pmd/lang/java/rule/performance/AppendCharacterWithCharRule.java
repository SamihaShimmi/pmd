/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.rule.performance;

import net.sourceforge.pmd.lang.java.ast.ASTLiteral;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;

/**
 * This rule finds the following:
 *
 * <pre>
 * StringBuffer.append(&quot;c&quot;); // appends a single character
 * </pre>
 *
 * <p>It is preferable to use</p>
 *
 * <pre>StringBuffer.append('c'); // appends a single character</pre>
 *
 * @see <a href="https://sourceforge.net/p/pmd/feature-requests/381/">feature request #381 Single character StringBuffer.append </a>
 */
public class AppendCharacterWithCharRule extends AbstractJavaRule {

    public AppendCharacterWithCharRule() {
        addRuleChainVisit(ASTLiteral.class);
    }

    @Override
    public Object visit(ASTLiteral node, Object data) {
        // REVERT ME
        //        ASTBlockStatement bs = node.getFirstParentOfType(ASTBlockStatement.class);
        //        if (bs == null) {
        //            return data;
        //        }
        //
        //        if (node.isSingleCharacterStringLiteral()) {
        //            if (!InefficientStringBufferingRule.isInStringBufferOperationChain(node, "append")) {
        //                return data;
        //            }
        //
        //            // ignore, if the literal is part of an expression, such as "X".repeat(5)
        //            final ASTPrimaryExpression primaryExpression = (ASTPrimaryExpression) node.getNthParent(2);
        //            if (primaryExpression != null && primaryExpression.getFirstChildOfType(ASTPrimarySuffix.class) != null) {
        //                return data;
        //            }
        //            // ignore, if this literal is part of a different expression, e.g. "X" + something else
        //            if (primaryExpression != null && !(primaryExpression.getNthParent(2) instanceof ASTArgumentList)) {
        //                return data;
        //            }
        //            // ignore if this string literal is used as a constructor argument
        //            if (primaryExpression != null && primaryExpression.getNthParent(4) instanceof ASTAllocationExpression) {
        //                return data;
        //            }
        //
        //            addViolation(data, node);
        //        }
        return data;
    }
}
