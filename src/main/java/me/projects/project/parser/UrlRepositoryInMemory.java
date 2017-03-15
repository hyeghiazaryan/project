/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.projects.project.parser;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hrachya.y
 */
public class UrlRepositoryInMemory implements UrlRepository {
    private Map<String, Date> urls = new HashMap<>();

    @Override
    public void addUrl(String url) {
        urls.put(url, new Date());
    }

    @Override
    public boolean exists(String url) {
        return urls.containsKey(url);
    }
}
