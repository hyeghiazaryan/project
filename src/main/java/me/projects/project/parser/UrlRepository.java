/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.projects.project.parser;

/**
 *
 * @author hrachya.y
 */
public interface UrlRepository {
    public void addUrl(String url);
    public boolean exists(String url);
}
