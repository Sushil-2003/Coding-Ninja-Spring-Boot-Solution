package com.sushil3.SocialMediaApplication;

import java.util.ArrayList;

public class SimplePostList implements PostList {
	
	ArrayList<Post> postList;
	public void init() {
		Post post = new SimplePost();
		post.setMessage("from DB");
		postList.add(post);
	}
	public void destroy() {
		System.out.println("Post List are destroy");
	}

	
	public SimplePostList() {
		this.postList = new ArrayList<Post>();
	}

	@Override
	public ArrayList<Post> getAllPost() {
		// TODO Auto-generated method stub
		return this.postList;
	}

	@Override
	public Post getPost(int i) {
		// TODO Auto-generated method stub
		return this.postList.get(i);
	}

	@Override
	public void setPost(Post post) {
		// TODO Auto-generated method stub
		this.postList.add(post);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.postList.size();
	}

}
