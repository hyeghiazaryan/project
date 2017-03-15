/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.projects.project.parser;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hrachya.y
 */
public class StringParserImpl implements StringParser{

    @Override
    public List<String> getUrls(String text) {
        List<String> urls = new ArrayList<>();
        urls.add("http://www.news.am");
        urls.add("http://www.sayat-nova.am");
        return urls;
    }  
}
