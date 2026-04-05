package io.ktor.client.plugins.logging;

import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class LoggedContent extends OutgoingContent.ReadChannelContent {
    private final ByteReadChannel channel;
    private final Long contentLength;
    private final ContentType contentType;
    private final Headers headers;
    private final OutgoingContent originalContent;
    private final HttpStatusCode status;

    public LoggedContent(OutgoingContent originalContent, ByteReadChannel channel) {
        e0.checkNotNullParameter(originalContent, "originalContent");
        e0.checkNotNullParameter(channel, "channel");
        this.originalContent = originalContent;
        this.channel = channel;
        this.contentType = originalContent.getContentType();
        this.contentLength = originalContent.getContentLength();
        this.status = originalContent.getStatus();
        this.headers = originalContent.getHeaders();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.contentLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Headers getHeaders() {
        return this.headers;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> T getProperty(AttributeKey<T> key) {
        e0.checkNotNullParameter(key, "key");
        return (T) this.originalContent.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public ByteReadChannel readFrom() {
        return this.channel;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(AttributeKey<T> key, T t10) {
        e0.checkNotNullParameter(key, "key");
        this.originalContent.setProperty(key, t10);
    }
}
