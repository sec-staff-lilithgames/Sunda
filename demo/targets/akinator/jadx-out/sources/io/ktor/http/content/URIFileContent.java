package io.ktor.http.content;

import io.ktor.http.ContentType;
import io.ktor.http.FileContentTypeKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.ReadingKt;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class URIFileContent extends OutgoingContent.ReadChannelContent {
    private final Long contentLength;
    private final ContentType contentType;
    private final URI uri;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ URIFileContent(URI uri, ContentType contentType, Long l9, int i10, u uVar) {
        if ((i10 & 2) != 0) {
            ContentType.Companion companion = ContentType.Companion;
            String path = uri.getPath();
            e0.checkNotNullExpressionValue(path, "uri.path");
            contentType = FileContentTypeKt.defaultForFilePath(companion, path);
        }
        this(uri, contentType, (i10 & 4) != 0 ? null : l9);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.contentLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    public final URI getUri() {
        return this.uri;
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public ByteReadChannel readFrom() throws IOException {
        InputStream inputStreamOpenStream = this.uri.toURL().openStream();
        e0.checkNotNullExpressionValue(inputStreamOpenStream, "uri.toURL().openStream()");
        return ReadingKt.toByteReadChannel$default(inputStreamOpenStream, null, ByteBufferPoolKt.getKtorDefaultPool(), 1, null);
    }

    public URIFileContent(URI uri, ContentType contentType, Long l9) {
        e0.checkNotNullParameter(uri, "uri");
        e0.checkNotNullParameter(contentType, "contentType");
        this.uri = uri;
        this.contentType = contentType;
        this.contentLength = l9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ URIFileContent(URL url, ContentType contentType, int i10, u uVar) {
        if ((i10 & 2) != 0) {
            ContentType.Companion companion = ContentType.Companion;
            String path = url.getPath();
            e0.checkNotNullExpressionValue(path, "url.path");
            contentType = FileContentTypeKt.defaultForFilePath(companion, path);
        }
        this(url, contentType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public URIFileContent(URL url, ContentType contentType) throws URISyntaxException {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(contentType, "contentType");
        URI uri = url.toURI();
        e0.checkNotNullExpressionValue(uri, "url.toURI()");
        this(uri, contentType, null, 4, null);
    }
}
