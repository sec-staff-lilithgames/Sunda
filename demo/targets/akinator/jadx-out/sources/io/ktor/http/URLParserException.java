package io.ktor.http;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class URLParserException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLParserException(String urlString, Throwable cause) {
        super("Fail to parse url: " + urlString, cause);
        e0.checkNotNullParameter(urlString, "urlString");
        e0.checkNotNullParameter(cause, "cause");
    }
}
