package io.ktor.client.request;

import androidx.core.app.NotificationCompat;
import io.ktor.http.ContentType;
import io.ktor.http.Cookie;
import io.ktor.http.CookieKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.util.Base64Kt;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UtilsKt {
    public static final void accept(HttpMessageBuilder httpMessageBuilder, ContentType contentType) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(contentType, "contentType");
        httpMessageBuilder.getHeaders().append(HttpHeaders.INSTANCE.getAccept(), contentType.toString());
    }

    public static final void basicAuth(HttpMessageBuilder httpMessageBuilder, String username, String password) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(username, "username");
        e0.checkNotNullParameter(password, "password");
        String authorization = HttpHeaders.INSTANCE.getAuthorization();
        StringBuilder sb2 = new StringBuilder("Basic ");
        sb2.append(Base64Kt.encodeBase64(username + AbstractJsonLexerKt.COLON + password));
        header(httpMessageBuilder, authorization, sb2.toString());
    }

    public static final void bearerAuth(HttpMessageBuilder httpMessageBuilder, String token) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(token, "token");
        header(httpMessageBuilder, HttpHeaders.INSTANCE.getAuthorization(), "Bearer " + token);
    }

    public static final void cookie(HttpMessageBuilder httpMessageBuilder, String name, String value, int i10, GMTDate gMTDate, String str, String str2, boolean z10, boolean z11, Map<String, String> extensions) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(extensions, "extensions");
        String strRenderCookieHeader = CookieKt.renderCookieHeader(new Cookie(name, value, null, i10, gMTDate, str, str2, z10, z11, extensions, 4, null));
        HeadersBuilder headers = httpMessageBuilder.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (!headers.contains(httpHeaders.getCookie())) {
            httpMessageBuilder.getHeaders().append(httpHeaders.getCookie(), strRenderCookieHeader);
            return;
        }
        httpMessageBuilder.getHeaders().set(httpHeaders.getCookie(), httpMessageBuilder.getHeaders().get(httpHeaders.getCookie()) + "; " + strRenderCookieHeader);
    }

    public static /* synthetic */ void cookie$default(HttpMessageBuilder httpMessageBuilder, String str, String str2, int i10, GMTDate gMTDate, String str3, String str4, boolean z10, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            gMTDate = null;
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        if ((i11 & 32) != 0) {
            str4 = null;
        }
        if ((i11 & 64) != 0) {
            z10 = false;
        }
        if ((i11 & 128) != 0) {
            z11 = false;
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            map = p1.emptyMap();
        }
        cookie(httpMessageBuilder, str, str2, i10, gMTDate, str3, str4, z10, z11, map);
    }

    public static final String getHost(HttpRequestBuilder httpRequestBuilder) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        return httpRequestBuilder.getUrl().getHost();
    }

    public static final int getPort(HttpRequestBuilder httpRequestBuilder) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        return httpRequestBuilder.getUrl().getPort();
    }

    public static final void header(HttpMessageBuilder httpMessageBuilder, String key, Object obj) {
        e0.checkNotNullParameter(httpMessageBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        if (obj != null) {
            httpMessageBuilder.getHeaders().append(key, obj.toString());
        }
    }

    public static final void parameter(HttpRequestBuilder httpRequestBuilder, String key, Object obj) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        if (obj != null) {
            httpRequestBuilder.getUrl().getParameters().append(key, obj.toString());
        }
    }

    public static final void setHost(HttpRequestBuilder httpRequestBuilder, String value) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(value, "value");
        httpRequestBuilder.getUrl().setHost(value);
    }

    public static final void setPort(HttpRequestBuilder httpRequestBuilder, int i10) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        httpRequestBuilder.getUrl().setPort(i10);
    }
}
