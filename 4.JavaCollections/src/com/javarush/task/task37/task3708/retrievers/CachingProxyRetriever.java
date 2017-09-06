package com.javarush.task.task37.task3708.retrievers;

import com.javarush.task.task37.task3708.storage.Storage;

public class CachingProxyRetriever implements Retriever{
    public CachingProxyRetriever(Storage storage) {

    }

    @Override
    public Object retrieve(long id) {
        return null;
    }
}
