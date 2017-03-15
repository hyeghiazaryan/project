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
public class Parser {
    private HttpClient httpClient;
    private StringParser stringParser;
    private UrlRepository urlRepository;

    public Parser(HttpClient httpClient, StringParser stringParser, UrlRepository urlRepository) {
        this.httpClient = httpClient;
        this.stringParser = stringParser;
        this.urlRepository = urlRepository;
        
    }
    
    

    
    public void parse(String url, int depth){
        parse(url, depth, 0);
    }
    
    private void parse(String url, int depth, int currentDepth){
        try{
            handleUrl(url);
        }
        catch(AlreadyHandledUrlException e){
            System.out.println("already handled " + url);
            return;
        }
        
        if(currentDepth == depth){
            return;
        }
        
        String content;
        
        try {
            content = httpClient.getContent(url);
            int i = 1;
        } catch (Exception e) {
            //TODO handle exception
            return;
        }
        
        stringParser.getUrls(content).stream().forEach((newUrl) -> {
            parse(newUrl, depth, currentDepth + 1);
        });
    }
    
    private void handleUrl(String url) throws AlreadyHandledUrlException{
        if(urlRepository.exists(url)){
            throw new AlreadyHandledUrlException();
        }
        
        urlRepository.addUrl(url);
        
        System.out.println(url);
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public StringParser getStringParser() {
        return stringParser;
    }

    public void setStringParser(StringParser stringParser) {
        this.stringParser = stringParser;
    }
}
