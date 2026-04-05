package io.ktor.http.content;

import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface Version {
    void appendHeadersTo(HeadersBuilder headersBuilder);

    VersionCheckResult check(Headers headers);
}
