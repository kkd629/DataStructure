package namoosori.elephant.datastructure.list.array;

import java.util.ArrayList;
import java.util.Collection;

import namoosori.elephant.datastructure.tree.facade.TreeNode;

public class MyStringArrayTreeNode implements TreeNode{
	
	private String data;
	private TreeNode parent;
	private ArrayList<TreeNode> children;
	private int treeSize = 0;
	
	public MyStringArrayTreeNode(String data) {
		
		this.data = data;
		this.parent = null;
		this.children = new ArrayList<TreeNode>();
	}
	

	@Override
	public boolean isLeaf() {
		// 자식 노드가 없는 노드
		if(children == null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isRoot() {
		// TODO Auto-generated method stub
		if(parent == null) {
			return true;
		}
		return false;
	}

	@Override
	public void addChild(TreeNode child) {
		// 
		if(treeSize == 0) {
			
			child.setParent(this);
		}
		children.add(child);
	}


	@Override
	public void addChild(String value) {
		// TODO Auto-generated method stub
		TreeNode child = new MyStringArrayTreeNode(value);
		child.setParent(this);
		children.add(child);
	}

	@Override
	public TreeNode getChildByValue(String value) {
		// TODO Auto-generated method stub
		TreeNode target = null;
		for(TreeNode node : children) {
			if(node.getValue().equals(value)) {
				target = node;
				break;
			}
		}
		return target;
	}

	@Override
	public Collection<TreeNode> getChildren() {
		// TODO Auto-generated method stub
		return children;
	}

	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	@Override
	public int countChild() {
		// TODO Auto-generated method stub
		return children.size();
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public String getParentPath() {
		// TODO Auto-generated method stub
		TreeNode node = parent;
	      StringBuilder builder = new StringBuilder();
	      builder.append("[");
	      while(true) {
	         builder.insert(1, node.getValue());
	         node = node.getParent();
	         if(node !=null) {
	            builder.insert(1, ", ");
	         }else {
	            break;
	         }
	      }
	      builder.append("]");
	      return builder.toString();
	}

	@Override
	public void setParent(TreeNode myTreeNode) {
		// TODO Auto-generated method stub
		myTreeNode.addChild(this);
		this.parent = myTreeNode;
	}

}
