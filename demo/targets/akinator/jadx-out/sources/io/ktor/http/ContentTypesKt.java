package io.ktor.http;

import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ContentTypesKt {
    public static final Charset charset(HeaderValueWithParameters headerValueWithParameters) {
        e0.checkNotNullParameter(headerValueWithParameters, "<this>");
        String strParameter = headerValueWithParameters.parameter("charset");
        if (strParameter == null) {
            return null;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final ContentType withCharset(ContentType contentType, Charset charset) {
        e0.checkNotNullParameter(contentType, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        return contentType.withParameter("charset", CharsetJVMKt.getName(charset));
    }

    public static final ContentType withCharsetIfNeeded(ContentType contentType, Charset charset) {
        e0.checkNotNullParameter(contentType, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        String lowerCase = contentType.getContentType().toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return !e0.areEqual(lowerCase, "text") ? contentType : contentType.withParameter("charset", CharsetJVMKt.getName(charset));
    }
}
