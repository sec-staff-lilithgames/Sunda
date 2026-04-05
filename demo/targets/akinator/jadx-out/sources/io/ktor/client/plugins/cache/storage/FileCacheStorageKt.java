package io.ktor.client.plugins.cache.storage;

import java.io.File;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FileCacheStorageKt {
    public static final CacheStorage FileStorage(File directory, CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(directory, "directory");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        return new CachingCacheStorage(new FileCacheStorage(directory, dispatcher));
    }

    public static /* synthetic */ CacheStorage FileStorage$default(File file, CoroutineDispatcher coroutineDispatcher, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        return FileStorage(file, coroutineDispatcher);
    }
}
