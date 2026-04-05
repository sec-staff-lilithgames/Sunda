package io.ktor.client.request.forms;

import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.HttpUrlEncodedKt;
import io.ktor.http.Parameters;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.e0;
import sv.g;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FormDataContent extends OutgoingContent.ByteArrayContent {
    private final byte[] content;
    private final long contentLength;
    private final ContentType contentType;
    private final Parameters formData;

    public FormDataContent(Parameters formData) {
        byte[] bArrEncodeToByteArray;
        e0.checkNotNullParameter(formData, "formData");
        this.formData = formData;
        String strFormUrlEncode = HttpUrlEncodedKt.formUrlEncode(formData);
        Charset charset = g.f86134b;
        if (e0.areEqual(charset, charset)) {
            bArrEncodeToByteArray = k0.encodeToByteArray(strFormUrlEncode);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, strFormUrlEncode, 0, strFormUrlEncode.length());
        }
        this.content = bArrEncodeToByteArray;
        this.contentLength = bArrEncodeToByteArray.length;
        this.contentType = ContentTypesKt.withCharset(ContentType.Application.INSTANCE.getFormUrlEncoded(), charset);
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    public byte[] bytes() {
        return this.content;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return Long.valueOf(this.contentLength);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    public final Parameters getFormData() {
        return this.formData;
    }
}
