/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.projects.project.parser;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author hrachya.y
 */
public interface HttpClient {
    String getContent(String url) throws MalformedURLException, IOException;
}
