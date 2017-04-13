package edu.jpa.blog.service;

import edu.jpa.blog.service.dto.BlogDTO;

import java.util.List;


public interface BlogService {
    List<BlogDTO> getBlogs();
    BlogDTO getBlog(int id);
    void removeBlog(int id);
    void modifyBlog(BlogDTO blog);
}
