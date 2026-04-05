package io.ktor.http;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UrlKt {
    @f
    public static final Url copy(Url url, URLProtocol protocol, String host, int i10, String encodedPath, Parameters parameters, String fragment, String str, String str2, boolean z10) {
        e0.checkNotNullParameter(url, "<this>");
        e0.checkNotNullParameter(protocol, "protocol");
        e0.checkNotNullParameter(host, "host");
        e0.checkNotNullParameter(encodedPath, "encodedPath");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(fragment, "fragment");
        throw new IllegalStateException("Please use URLBuilder(url)");
    }

    public static /* synthetic */ Url copy$default(Url url, URLProtocol uRLProtocol, String str, int i10, String str2, Parameters parameters, String str3, String str4, String str5, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            uRLProtocol = url.getProtocol();
        }
        if ((i11 & 2) != 0) {
            str = url.getHost();
        }
        if ((i11 & 4) != 0) {
            i10 = url.getSpecifiedPort();
        }
        if ((i11 & 8) != 0) {
            str2 = url.getEncodedPath();
        }
        if ((i11 & 16) != 0) {
            parameters = url.getParameters();
        }
        if ((i11 & 32) != 0) {
            str3 = url.getFragment();
        }
        if ((i11 & 64) != 0) {
            str4 = url.getUser();
        }
        if ((i11 & 128) != 0) {
            str5 = url.getPassword();
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            z10 = url.getTrailingQuery();
        }
        String str6 = str5;
        boolean z11 = z10;
        String str7 = str3;
        String str8 = str4;
        Parameters parameters2 = parameters;
        int i12 = i10;
        return copy(url, uRLProtocol, str, i12, str2, parameters2, str7, str8, str6, z11);
    }

    public static final String getAuthority(Url url) {
        e0.checkNotNullParameter(url, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getEncodedUserAndPassword(url));
        if (url.getSpecifiedPort() == 0 || url.getSpecifiedPort() == url.getProtocol().getDefaultPort()) {
            sb2.append(url.getHost());
        } else {
            sb2.append(URLUtilsKt.getHostWithPort(url));
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String getEncodedUserAndPassword(Url url) {
        e0.checkNotNullParameter(url, "<this>");
        StringBuilder sb2 = new StringBuilder();
        URLUtilsKt.appendUserAndPassword(sb2, url.getEncodedUser(), url.getEncodedPassword());
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String getProtocolWithAuthority(Url url) {
        e0.checkNotNullParameter(url, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(url.getProtocol().getName());
        sb2.append("://");
        sb2.append(getEncodedUserAndPassword(url));
        if (url.getSpecifiedPort() == 0 || url.getSpecifiedPort() == url.getProtocol().getDefaultPort()) {
            sb2.append(url.getHost());
        } else {
            sb2.append(URLUtilsKt.getHostWithPort(url));
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
