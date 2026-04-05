package io.ktor.client.utils;

import io.ktor.util.InternalAPI;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CoroutineDispatcherUtilsKt {
    @InternalAPI
    public static final CoroutineDispatcher clientDispatcher(Dispatchers dispatchers, int i10, String dispatcherName) {
        e0.checkNotNullParameter(dispatchers, "<this>");
        e0.checkNotNullParameter(dispatcherName, "dispatcherName");
        return Dispatchers.getIO().limitedParallelism(i10);
    }

    public static /* synthetic */ CoroutineDispatcher clientDispatcher$default(Dispatchers dispatchers, int i10, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "ktor-client-dispatcher";
        }
        return clientDispatcher(dispatchers, i10, str);
    }
}
