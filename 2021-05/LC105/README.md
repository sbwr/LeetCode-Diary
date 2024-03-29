# 105. 从前序与中序遍历序列构造二叉树
根据一棵树的前序遍历与中序遍历构造二叉树。

注意:
你可以假设树中没有重复的元素。

例如，给出

前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7

## 思路
前序遍历的首位永远是当前树的根节点，而其在中序遍历中的左侧为左子树，右侧为右子树。
因此可以递归调用一个方法，其功能为：
1. 由前序遍历序列preorder中确定当前根节点；
2. 根据根节点数值找到其在中序遍历inorder中的位置，由此划分中序遍历；
3. 根据划分出的左右子树大小，划分前序序列；
4. 继续在左右子树区间调用该方法。

* 优化：每次在inorder序列中查找根节点时需要遍历整个序列，可以通过建立HashMap存储等方法优化查找效率。