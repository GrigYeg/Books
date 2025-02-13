package com.yegrig.books.dagger.module;

import com.yegrig.books.dagger.storage.DatabaseHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }

}
