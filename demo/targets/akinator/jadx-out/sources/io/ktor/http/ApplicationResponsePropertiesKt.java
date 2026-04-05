package io.ktor.http;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ApplicationResponsePropertiesKt {
    public static final void etag(HeadersBuilder headersBuilder, String entityTag) {
        e0.checkNotNullParameter(headersBuilder, "<this>");
        e0.checkNotNullParameter(entityTag, "entityTag");
        headersBuilder.set(HttpHeaders.INSTANCE.getETag(), entityTag);
    }
}
