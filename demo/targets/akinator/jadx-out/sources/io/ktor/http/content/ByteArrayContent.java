package io.ktor.http.content;

import io.ktor.http.ContentType;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ByteArrayContent extends OutgoingContent.ByteArrayContent {
    private final byte[] bytes;
    private final ContentType contentType;
    private final HttpStatusCode status;

    public /* synthetic */ ByteArrayContent(byte[] bArr, ContentType contentType, HttpStatusCode httpStatusCode, int i10, u uVar) {
        this(bArr, (i10 & 2) != 0 ? null : contentType, (i10 & 4) != 0 ? null : httpStatusCode);
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    public byte[] bytes() {
        return this.bytes;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return Long.valueOf(this.bytes.length);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public HttpStatusCode getStatus() {
        return this.status;
    }

    public ByteArrayContent(byte[] bytes, ContentType contentType, HttpStatusCode httpStatusCode) {
        e0.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
        this.contentType = contentType;
        this.status = httpStatusCode;
    }
}
