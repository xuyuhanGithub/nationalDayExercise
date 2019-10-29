package hundsun;

/**
 * @author xuyuhan
 * @date 2019-10-29 20:15
 */

public class 二叉树查询 {
    public class TagNode {
        int iKey;

        TagNode pLChild;

        TagNode pRChild;

    }

    public static TagNode searchTree(TagNode pRoot, int iKey) {

        if (pRoot == null) {

            return null;

        }

        if (pRoot.iKey > iKey) {

            return searchTree(pRoot.pLChild, iKey);

        } else if (pRoot.iKey < iKey) {

            return searchTree(pRoot.pRChild, iKey);

        }

        return pRoot;

    }

}