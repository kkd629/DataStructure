package namoosori.elephant.datastructure.tree.facade;

import java.util.Collection;

public interface TreeNode {
	//
	boolean isLeaf(); 
	boolean isRoot(); 
	void addChild(TreeNode child); 
	void addChild(String value); 
	TreeNode getChildByValue(String value); 
	Collection<TreeNode> getChildren(); 
	TreeNode getParent(); 
	int countChild(); 
	String getValue();
	String getParentPath(); 
	void setParent(TreeNode myTreeNode);   

}
