package io.ktor.http.content;

import av.e;
import io.ktor.http.ContentType;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ChannelWriterContent extends OutgoingContent.WriteChannelContent {
    private final p body;
    private final Long contentLength;
    private final ContentType contentType;
    private final HttpStatusCode status;

    public /* synthetic */ ChannelWriterContent(p pVar, ContentType contentType, HttpStatusCode httpStatusCode, Long l9, int i10, u uVar) {
        this(pVar, contentType, (i10 & 4) != 0 ? null : httpStatusCode, (i10 & 8) != 0 ? null : l9);
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
    public HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public Object writeTo(ByteWriteChannel byteWriteChannel, d<? super x0> dVar) {
        Object objInvoke = this.body.invoke(byteWriteChannel, dVar);
        return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
    }

    public ChannelWriterContent(p body, ContentType contentType, HttpStatusCode httpStatusCode, Long l9) {
        e0.checkNotNullParameter(body, "body");
        this.body = body;
        this.contentType = contentType;
        this.status = httpStatusCode;
        this.contentLength = l9;
    }
}
