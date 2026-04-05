package io.ktor.http.content;

import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.g;
import sv.k0;
import sv.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TextContent extends OutgoingContent.ByteArrayContent {
    private final byte[] bytes;
    private final ContentType contentType;
    private final HttpStatusCode status;
    private final String text;

    public /* synthetic */ TextContent(String str, ContentType contentType, HttpStatusCode httpStatusCode, int i10, u uVar) {
        this(str, contentType, (i10 & 4) != 0 ? null : httpStatusCode);
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

    public final String getText() {
        return this.text;
    }

    public String toString() {
        return "TextContent[" + getContentType() + "] \"" + p0.take(this.text, 30) + AbstractJsonLexerKt.STRING;
    }

    public TextContent(String text, ContentType contentType, HttpStatusCode httpStatusCode) {
        byte[] bArrEncodeToByteArray;
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(contentType, "contentType");
        this.text = text;
        this.contentType = contentType;
        this.status = httpStatusCode;
        Charset charset = ContentTypesKt.charset(getContentType());
        charset = charset == null ? g.f86134b : charset;
        if (e0.areEqual(charset, g.f86134b)) {
            bArrEncodeToByteArray = k0.encodeToByteArray(text);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, text, 0, text.length());
        }
        this.bytes = bArrEncodeToByteArray;
    }
}
