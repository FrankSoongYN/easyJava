package com.frankTest.easyJave.netty;

public class MyFetcher implements Fetcher {  
    
    final Data data;  
      
    public MyFetcher(Data data){  
        this.data = data;  
    }  
  
    public void fetchData(FetcherCallback callback) {  
        try {  
            callback.onData(data);  
        } catch (Exception e) {  
            callback.onError(e);  
        }  
    }  
  
}  
