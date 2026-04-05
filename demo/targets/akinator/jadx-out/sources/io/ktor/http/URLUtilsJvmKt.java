package io.ktor.http;

import com.unity3d.services.core.network.model.HttpRequest;
import io.bidmachine.protobuf.EventTypeExtended;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import kotlin.jvm.internal.e0;
import sv.n0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class URLUtilsJvmKt {
    public static final Url Url(URI uri) {
        e0.checkNotNullParameter(uri, "uri");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null), uri).build();
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, URI uri) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(uri, "uri");
        String scheme = uri.getScheme();
        if (scheme != null) {
            uRLBuilder.setProtocol(URLProtocol.Companion.createOrDefault(scheme));
            uRLBuilder.setPort(uRLBuilder.getProtocol().getDefaultPort());
        }
        if (uri.getPort() > 0) {
            uRLBuilder.setPort(uri.getPort());
        } else {
            String scheme2 = uri.getScheme();
            if (e0.areEqual(scheme2, "http")) {
                uRLBuilder.setPort(80);
            } else if (e0.areEqual(scheme2, HttpRequest.DEFAULT_SCHEME)) {
                uRLBuilder.setPort(443);
            }
        }
        if (uri.getRawUserInfo() != null) {
            String rawUserInfo = uri.getRawUserInfo();
            e0.checkNotNullExpressionValue(rawUserInfo, "uri.rawUserInfo");
            if (rawUserInfo.length() > 0) {
                String rawUserInfo2 = uri.getRawUserInfo();
                e0.checkNotNullExpressionValue(rawUserInfo2, "uri.rawUserInfo");
                List listSplit$default = n0.split$default((CharSequence) rawUserInfo2, new String[]{":"}, false, 0, 6, (Object) null);
                uRLBuilder.setEncodedUser((String) y0.first(listSplit$default));
                uRLBuilder.setEncodedPassword((String) y0.getOrNull(listSplit$default, 1));
            }
        }
        String host = uri.getHost();
        if (host != null) {
            uRLBuilder.setHost(host);
        }
        String rawPath = uri.getRawPath();
        e0.checkNotNullExpressionValue(rawPath, "uri.rawPath");
        URLBuilderKt.setEncodedPath(uRLBuilder, rawPath);
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null) {
            ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
            parametersBuilderParametersBuilder$default.appendAll(QueryKt.parseQueryString$default(rawQuery, 0, 0, false, 6, null));
            uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        }
        String query = uri.getQuery();
        if (query != null && query.length() == 0) {
            uRLBuilder.setTrailingQuery(true);
        }
        String rawFragment = uri.getRawFragment();
        if (rawFragment != null) {
            uRLBuilder.setEncodedFragment(rawFragment);
        }
        return uRLBuilder;
    }

    public static final URI toURI(Url url) {
        e0.checkNotNullParameter(url, "<this>");
        return new URI(url.toString());
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, URL url) throws URISyntaxException {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(url, "url");
        String host = url.getHost();
        e0.checkNotNullExpressionValue(host, "url.host");
        if (n0.contains$default((CharSequence) host, '_', false, 2, (Object) null)) {
            String string = url.toString();
            e0.checkNotNullExpressionValue(string, "url.toString()");
            return URLParserKt.takeFrom(uRLBuilder, string);
        }
        URI uri = url.toURI();
        e0.checkNotNullExpressionValue(uri, "url.toURI()");
        return takeFrom(uRLBuilder, uri);
    }
}
