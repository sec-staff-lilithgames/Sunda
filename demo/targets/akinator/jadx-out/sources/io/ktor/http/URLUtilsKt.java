package io.ktor.http;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import io.ktor.util.StringValuesKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import sv.k0;
import sv.n0;
import tu.v;
import uu.o0;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class URLUtilsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.URLUtilsKt$appendUrlFullPath$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kv.l
        public final CharSequence invoke(v it) {
            e0.checkNotNullParameter(it, "it");
            String str = (String) it.getFirst();
            if (it.getSecond() == null) {
                return str;
            }
            return str + G5.T + String.valueOf(it.getSecond());
        }
    }

    public static final URLBuilder URLBuilder(String urlString) {
        e0.checkNotNullParameter(urlString, "urlString");
        return URLParserKt.takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null), urlString);
    }

    public static final Url Url(String urlString) {
        e0.checkNotNullParameter(urlString, "urlString");
        return URLBuilder(urlString).build();
    }

    public static final void appendUrlFullPath(Appendable appendable, String encodedPath, String encodedQuery, boolean z10) throws IOException {
        e0.checkNotNullParameter(appendable, "<this>");
        e0.checkNotNullParameter(encodedPath, "encodedPath");
        e0.checkNotNullParameter(encodedQuery, "encodedQuery");
        if (!n0.isBlank(encodedPath) && !k0.startsWith$default(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (encodedQuery.length() > 0 || z10) {
            appendable.append("?");
        }
        appendable.append(encodedQuery);
    }

    public static final void appendUserAndPassword(StringBuilder sb2, String str, String str2) {
        e0.checkNotNullParameter(sb2, "<this>");
        if (str == null) {
            return;
        }
        sb2.append(str);
        if (str2 != null) {
            sb2.append(AbstractJsonLexerKt.COLON);
            sb2.append(str2);
        }
        sb2.append("@");
    }

    public static final String getFullPath(Url url) throws IOException {
        e0.checkNotNullParameter(url, "<this>");
        StringBuilder sb2 = new StringBuilder();
        appendUrlFullPath(sb2, url.getEncodedPath(), url.getEncodedQuery(), url.getTrailingQuery());
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String getHostWithPort(Url url) {
        e0.checkNotNullParameter(url, "<this>");
        return url.getHost() + AbstractJsonLexerKt.COLON + url.getPort();
    }

    public static final boolean isAbsolutePath(Url url) {
        e0.checkNotNullParameter(url, "<this>");
        return e0.areEqual(y0.firstOrNull((List) url.getPathSegments()), "");
    }

    public static final boolean isRelativePath(Url url) {
        e0.checkNotNullParameter(url, "<this>");
        return !isAbsolutePath(url);
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, URLBuilder url) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(url, "url");
        uRLBuilder.setProtocol(url.getProtocol());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        uRLBuilder.setEncodedPathSegments(url.getEncodedPathSegments());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        StringValuesKt.appendAll(parametersBuilderParametersBuilder$default, url.getEncodedParameters());
        uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }

    public static final URLBuilder URLBuilder(Url url) {
        e0.checkNotNullParameter(url, "url");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null), url);
    }

    public static final Url Url(URLBuilder builder) {
        e0.checkNotNullParameter(builder, "builder");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null), builder).build();
    }

    public static final boolean isAbsolutePath(URLBuilder uRLBuilder) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        return e0.areEqual(y0.firstOrNull((List) uRLBuilder.getPathSegments()), "");
    }

    public static final boolean isRelativePath(URLBuilder uRLBuilder) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        return !isAbsolutePath(uRLBuilder);
    }

    public static final URLBuilder URLBuilder(URLBuilder builder) {
        e0.checkNotNullParameter(builder, "builder");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null), builder);
    }

    public static final void appendUrlFullPath(Appendable appendable, String encodedPath, ParametersBuilder encodedQueryParameters, boolean z10) {
        List listListOf;
        e0.checkNotNullParameter(appendable, "<this>");
        e0.checkNotNullParameter(encodedPath, "encodedPath");
        e0.checkNotNullParameter(encodedQueryParameters, "encodedQueryParameters");
        if (!n0.isBlank(encodedPath) && !k0.startsWith$default(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z10) {
            appendable.append("?");
        }
        Set<Map.Entry<String, List<String>>> setEntries = encodedQueryParameters.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listListOf = o0.listOf(tu.e0.to(str, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(tu.e0.to(str, (String) it2.next()));
                }
                listListOf = arrayList2;
            }
            v0.addAll(arrayList, listListOf);
        }
        y0.joinTo(arrayList, appendable, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 2) != 0 ? ", " : C3191e4.i.f36527c, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 4) != 0 ? "" : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 8) == 0 ? null : "", (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 16) != 0 ? -1 : 0, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 32) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 64) != 0 ? null : AnonymousClass2.INSTANCE);
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, Url url) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(url, "url");
        uRLBuilder.setProtocol(url.getProtocol());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        URLBuilderKt.setEncodedPath(uRLBuilder, url.getEncodedPath());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        parametersBuilderParametersBuilder$default.appendAll(QueryKt.parseQueryString$default(url.getEncodedQuery(), 0, 0, false, 6, null));
        uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }
}
