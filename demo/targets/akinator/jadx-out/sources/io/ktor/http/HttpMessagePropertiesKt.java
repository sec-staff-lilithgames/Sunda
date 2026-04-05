package io.ktor.http;

import com.ironsource.G5;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.n0;
import tu.f;
import tu.x0;
import uu.o0;
import uu.p0;
import uu.q0;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpMessagePropertiesKt {
    public static final List<HeaderValue> cacheControl(HttpMessage httpMessage) {
        List<HeaderValue> headerValue;
        e0.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getCacheControl());
        return (str == null || (headerValue = HttpHeaderValueParserKt.parseHeaderValue(str)) == null) ? p0.emptyList() : headerValue;
    }

    @f
    public static final x0 charset(HttpMessageBuilder httpMessageBuilder, Charset charset) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        ContentType contentType = contentType(httpMessageBuilder);
        if (contentType == null) {
            return null;
        }
        contentType(httpMessageBuilder, ContentTypesKt.withCharset(contentType, charset));
        return x0.f87415a;
    }

    @f
    public static final void contentLength(HttpMessageBuilder httpMessageBuilder, int i10) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getContentLength(), String.valueOf(i10));
    }

    public static final void contentType(HttpMessageBuilder httpMessageBuilder, ContentType type) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(type, "type");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getContentType(), type.toString());
    }

    public static final List<Cookie> cookies(HttpMessageBuilder httpMessageBuilder) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        List<String> all = httpMessageBuilder.getHeaders().getAll(HttpHeaders.INSTANCE.getSetCookie());
        if (all == null) {
            return p0.emptyList();
        }
        List<String> list = all;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CookieKt.parseServerSetCookieHeader((String) it.next()));
        }
        return arrayList;
    }

    public static final String etag(HttpMessageBuilder httpMessageBuilder) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        return httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getETag());
    }

    public static final void ifNoneMatch(HttpMessageBuilder httpMessageBuilder, String value) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(value, "value");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getIfNoneMatch(), value);
    }

    public static final void maxAge(HttpMessageBuilder httpMessageBuilder, int i10) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        httpMessageBuilder.getHeaders().append(HttpHeaders.INSTANCE.getCacheControl(), "max-age=" + i10);
    }

    public static final List<Cookie> setCookie(HttpMessage httpMessage) {
        e0.checkNotNullParameter(httpMessage, "<this>");
        List<String> all = httpMessage.getHeaders().getAll(HttpHeaders.INSTANCE.getSetCookie());
        if (all == null) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, splitSetCookieHeader((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(CookieKt.parseServerSetCookieHeader((String) it2.next()));
        }
        return arrayList2;
    }

    public static final List<String> splitSetCookieHeader(String str) {
        int i10;
        String str2;
        int i11;
        int i12;
        e0.checkNotNullParameter(str, "<this>");
        int iIndexOf$default = n0.indexOf$default((CharSequence) str, AbstractJsonLexerKt.COMMA, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return o0.listOf(str);
        }
        ArrayList arrayList = new ArrayList();
        String str3 = str;
        int iIndexOf$default2 = n0.indexOf$default((CharSequence) str3, G5.T, iIndexOf$default, false, 4, (Object) null);
        int iIndexOf$default3 = n0.indexOf$default((CharSequence) str3, ';', iIndexOf$default, false, 4, (Object) null);
        int i13 = 0;
        int i14 = iIndexOf$default;
        int iIndexOf$default4 = iIndexOf$default3;
        while (i13 < str3.length() && i14 > 0) {
            if (iIndexOf$default2 < i14) {
                String str4 = str3;
                int iIndexOf$default5 = n0.indexOf$default((CharSequence) str4, G5.T, i14, false, 4, (Object) null);
                i10 = i14;
                str2 = str4;
                i11 = iIndexOf$default5;
            } else {
                String str5 = str3;
                i10 = i14;
                str2 = str5;
                i11 = iIndexOf$default2;
            }
            String str6 = str2;
            int iIndexOf$default6 = n0.indexOf$default((CharSequence) str6, AbstractJsonLexerKt.COMMA, i10 + 1, false, 4, (Object) null);
            while (true) {
                i12 = i10;
                i10 = iIndexOf$default6;
                if (i10 < 0 || i10 >= i11) {
                    break;
                }
                iIndexOf$default6 = n0.indexOf$default((CharSequence) str6, AbstractJsonLexerKt.COMMA, i10 + 1, false, 4, (Object) null);
            }
            if (iIndexOf$default4 < i12) {
                iIndexOf$default4 = n0.indexOf$default((CharSequence) str6, ';', i12, false, 4, (Object) null);
            }
            if (i11 < 0) {
                String strSubstring = str6.substring(i13);
                e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                arrayList.add(strSubstring);
                return arrayList;
            }
            if (iIndexOf$default4 == -1 || iIndexOf$default4 > i11) {
                String strSubstring2 = str6.substring(i13, i12);
                e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                i13 = i12 + 1;
            }
            i14 = i10;
            str3 = str6;
            iIndexOf$default2 = i11;
        }
        String str7 = str3;
        if (i13 < str7.length()) {
            String strSubstring3 = str7.substring(i13);
            e0.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(strSubstring3);
        }
        return arrayList;
    }

    public static final void userAgent(HttpMessageBuilder httpMessageBuilder, String content) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(content, "content");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getUserAgent(), content);
    }

    public static final List<String> vary(HttpMessageBuilder httpMessageBuilder) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        List<String> all = httpMessageBuilder.getHeaders().getAll(HttpHeaders.INSTANCE.getVary());
        if (all == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            List listSplit$default = n0.split$default((CharSequence) it.next(), new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it2 = listSplit$default.iterator();
            while (it2.hasNext()) {
                arrayList2.add(n0.trim((String) it2.next()).toString());
            }
            v0.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static final Charset charset(HttpMessageBuilder httpMessageBuilder) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        ContentType contentType = contentType(httpMessageBuilder);
        if (contentType != null) {
            return ContentTypesKt.charset(contentType);
        }
        return null;
    }

    public static final Long contentLength(HttpMessageBuilder httpMessageBuilder) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final ContentType contentType(HttpMessageBuilder httpMessageBuilder) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return ContentType.Companion.parse(str);
        }
        return null;
    }

    public static final String etag(HttpMessage httpMessage) {
        e0.checkNotNullParameter(httpMessage, "<this>");
        return httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getETag());
    }

    public static final Charset charset(HttpMessage httpMessage) {
        e0.checkNotNullParameter(httpMessage, "<this>");
        ContentType contentType = contentType(httpMessage);
        if (contentType != null) {
            return ContentTypesKt.charset(contentType);
        }
        return null;
    }

    public static final Long contentLength(HttpMessage httpMessage) {
        e0.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final ContentType contentType(HttpMessage httpMessage) {
        e0.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return ContentType.Companion.parse(str);
        }
        return null;
    }

    public static final List<String> vary(HttpMessage httpMessage) {
        e0.checkNotNullParameter(httpMessage, "<this>");
        List<String> all = httpMessage.getHeaders().getAll(HttpHeaders.INSTANCE.getVary());
        if (all == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            List listSplit$default = n0.split$default((CharSequence) it.next(), new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it2 = listSplit$default.iterator();
            while (it2.hasNext()) {
                arrayList2.add(n0.trim((String) it2.next()).toString());
            }
            v0.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }
}
