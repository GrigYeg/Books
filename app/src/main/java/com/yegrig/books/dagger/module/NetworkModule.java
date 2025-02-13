package com.yegrig.books.dagger.module;

import com.yegrig.books.dagger.network.NetworkUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }

}
