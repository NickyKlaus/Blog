package edu.jpa.blog.service;

import edu.jpa.blog.service.dto.BlogPostDTO;
import edu.jpa.blog.service.dto.SearchCriteriaDTO;

import java.util.List;


public interface BlogPostService {
    List<BlogPostDTO> getBlogPosts(int id);

    BlogPostDTO getBlogPost(int id);

    void modifyBlogPost(BlogPostDTO post);

    void removePost(int id);

    List<BlogPostDTO> findBlogPosts(SearchCriteriaDTO criteria);
}
