package io.ktor.client.engine;

import java.io.Closeable;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class HttpClientEngineBaseKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final void close(CoroutineDispatcher coroutineDispatcher) {
        try {
            if (coroutineDispatcher instanceof ExecutorCoroutineDispatcher) {
                ((ExecutorCoroutineDispatcher) coroutineDispatcher).close();
            } else if (coroutineDispatcher instanceof Closeable) {
                ((Closeable) coroutineDispatcher).close();
            }
        } catch (Throwable unused) {
        }
    }
}
