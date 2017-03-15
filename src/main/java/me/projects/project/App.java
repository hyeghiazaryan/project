package me.projects.project;

import me.projects.project.array.QuickSort;
import me.projects.project.parser.HttpClient;
import me.projects.project.parser.HttpClientImpl;
import me.projects.project.parser.Parser;
import me.projects.project.parser.StringParser;
import me.projects.project.parser.StringParserImpl;
import me.projects.project.parser.UrlRepository;
import me.projects.project.parser.UrlRepositoryInMemory;

/**
 *
 * @author hrachyay
 */
public class App {
    public static void main(String ... args){
        App app = new App();
        app.quickSortTest();

    }
    
    public void parserTest(){
        HttpClient httpClient = new HttpClientImpl();
        StringParser stringParser = new StringParserImpl();
        UrlRepository urlRepository = new UrlRepositoryInMemory();
        Parser parser = new Parser(httpClient, stringParser, urlRepository);
        
        parser.parse("http://jobdepot.us", 5);
    }
    
    public void quickSortTest(){
        int[] arr = {7, 4, 6, 9, 8, 1};
        QuickSort.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
