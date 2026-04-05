package io.ktor.client.plugins.cache;

import io.ktor.http.Url;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InvalidCacheStateException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCacheStateException(Url requestUrl) {
        super("The entry for url: " + requestUrl + " was removed from cache");
        e0.checkNotNullParameter(requestUrl, "requestUrl");
    }
}
