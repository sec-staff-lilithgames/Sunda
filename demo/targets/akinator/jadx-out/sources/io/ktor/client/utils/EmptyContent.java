package io.ktor.client.utils;

import io.ktor.http.content.OutgoingContent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class EmptyContent extends OutgoingContent.NoContent {
    public static final EmptyContent INSTANCE = new EmptyContent();
    private static final long contentLength = 0;

    private EmptyContent() {
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return Long.valueOf(contentLength);
    }

    public String toString() {
        return "EmptyContent";
    }
}
