package io.ktor.http;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpMessagePropertiesJvmKt {
    public static final Date date(HttpMessage httpMessage) {
        e0.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getDate());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    public static final Date expires(HttpMessageBuilder httpMessageBuilder) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getExpires());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    private static final String formatHttpDate(Date date) {
        String str = getHTTP_DATE_FORMAT().format(date);
        e0.checkNotNullExpressionValue(str, "HTTP_DATE_FORMAT.format(date)");
        return str;
    }

    private static final SimpleDateFormat getHTTP_DATE_FORMAT() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static final void ifModifiedSince(HttpMessageBuilder httpMessageBuilder, Date date) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(date, "date");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getIfModifiedSince(), formatHttpDate(date));
    }

    public static final Date lastModified(HttpMessageBuilder httpMessageBuilder) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getLastModified());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    private static final Date parseHttpDate(String str) throws ParseException {
        Date date = getHTTP_DATE_FORMAT().parse(str);
        e0.checkNotNullExpressionValue(date, "HTTP_DATE_FORMAT.parse(date)");
        return date;
    }

    public static final Date expires(HttpMessage httpMessage) {
        e0.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getExpires());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    public static final Date lastModified(HttpMessage httpMessage) {
        e0.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getLastModified());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }
}
