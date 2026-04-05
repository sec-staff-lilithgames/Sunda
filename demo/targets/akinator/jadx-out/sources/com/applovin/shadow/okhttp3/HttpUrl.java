package com.applovin.shadow.okhttp3;

import a.b;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import com.applovin.shadow.okio.Buffer;
import com.explorestack.protobuf.openrtb.LossReason;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.beta.xyn.RnJusJ;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import dv.d;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import qv.k;
import qv.v;
import sv.k0;
import sv.n0;
import sv.p0;
import sv.x;
import tu.f;
import uu.c2;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i10, int i11) throws NumberFormatException {
                int i12;
                try {
                    i12 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i10, i11, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i12 || i12 >= 65536) {
                    return -1;
                }
                return i12;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 < i11) {
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((e0.compare((int) cCharAt, 97) >= 0 && e0.compare((int) cCharAt, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) <= 0) || (e0.compare((int) cCharAt, 65) >= 0 && e0.compare((int) cCharAt, 90) <= 0)) {
                    while (true) {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i10 = this.port;
            if (i10 != -1) {
                return i10;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            e0.checkNotNull(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return e0.areEqual(str, ".") || k0.equals(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return e0.areEqual(str, "..") || k0.equals(str, "%2e.", true) || k0.equals(str, ".%2e", true) || k0.equals(str, "%2e%2e", true);
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final void push(String str, int i10, int i11, boolean z10, boolean z11) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            if (((CharSequence) o2.g(1, this.encodedPathSegments)).length() == 0) {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (z10) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            e0.checkNotNull(list);
            int size = list.size() - 2;
            int progressionLastElement = d.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                e0.checkNotNull(list2);
                if (e0.areEqual(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    e0.checkNotNull(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    e0.checkNotNull(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    e0.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == progressionLastElement) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void resolvePath(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i10++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i12, i11);
                boolean z10 = iDelimiterOffset < i11;
                String str2 = str;
                push(str2, i12, iDelimiterOffset, z10, true);
                if (z10) {
                    i12 = iDelimiterOffset + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iDelimiterOffset;
                }
            }
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            e0.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            e0.checkNotNullParameter(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String str) {
            e0.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            e0.checkNotNull(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            e0.checkNotNull(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null) : null);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            e0.checkNotNullParameter(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            e0.checkNotNullParameter(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        public final Builder addQueryParameter(String name, String str) {
            e0.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            e0.checkNotNull(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            e0.checkNotNull(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            e0.checkNotNullParameter(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            e0.checkNotNullParameter(encodedPath, "encodedPath");
            if (!k0.startsWith$default(encodedPath, "/", false, 2, null)) {
                throw new IllegalArgumentException(b.k("unexpected encodedPath: ", encodedPath).toString());
            }
            resolvePath(encodedPath, 0, encodedPath.length());
            return this;
        }

        public final Builder encodedQuery(String str) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null)) == null) ? null : companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            e0.checkNotNullParameter(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String host) {
            e0.checkNotNullParameter(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException(b.k("unexpected host: ", host));
            }
            this.host = canonicalHost;
            return this;
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) throws NumberFormatException {
            String str2;
            int iDelimiterOffset;
            int i10;
            String str3;
            int i11;
            String str4;
            boolean z10;
            char c10;
            int i12;
            int i13;
            char c11;
            int i14;
            String input = str;
            e0.checkNotNullParameter(input, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z11 = true;
            char c12 = 65535;
            if (iSchemeDelimiterOffset != -1) {
                if (k0.startsWith(input, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = HttpRequest.DEFAULT_SCHEME;
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!k0.startsWith(input, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iSchemeDelimiterOffset);
                        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    if (input.length() > 6) {
                        str2 = p0.take(input, 6) + APSSharedUtil.TRUNCATE_SEPARATOR;
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException(b.k("Expected URL scheme 'http' or 'https' but no scheme was found for ", str2));
                }
                this.scheme = httpUrl.scheme();
            }
            int iSlashCount = companion.slashCount(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c13 = '?';
            char c14 = '#';
            if (iSlashCount >= 2 || httpUrl == null || !e0.areEqual(httpUrl.scheme(), this.scheme)) {
                int i15 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(input, "@/\\?#", i15, iIndexOfLastNonAsciiWhitespace$default);
                    char cCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? input.charAt(iDelimiterOffset) : c12;
                    if (cCharAt == c12 || cCharAt == c14 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c13) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z12) {
                            i11 = iIndexOfLastNonAsciiWhitespace$default;
                            str4 = str5;
                            z10 = z11;
                            c10 = c12;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            input = str;
                            i12 = iDelimiterOffset;
                            sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i15, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null));
                            this.encodedPassword = sb3.toString();
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(input, AbstractJsonLexerKt.COLON, i15, iDelimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            str4 = str5;
                            c10 = c12;
                            i11 = iIndexOfLastNonAsciiWhitespace$default;
                            z10 = z11;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i15, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
                            if (z13) {
                                strCanonicalize$okhttp$default = b.o(new StringBuilder(), this.encodedUsername, "%40", strCanonicalize$okhttp$default);
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                i13 = iDelimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, iDelimiterOffset2 + 1, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
                                z12 = z10;
                            } else {
                                i13 = iDelimiterOffset;
                            }
                            input = str;
                            i12 = i13;
                            z13 = z10;
                        }
                        i15 = i12 + 1;
                        c12 = c10;
                        iIndexOfLastNonAsciiWhitespace$default = i11;
                        str5 = str4;
                        z11 = z10;
                        c13 = '?';
                        c14 = '#';
                    }
                }
                i10 = iIndexOfLastNonAsciiWhitespace$default;
                String str6 = str5;
                char c15 = c12;
                Companion companion3 = Companion;
                int iPortColonOffset = companion3.portColonOffset(input, i15, iDelimiterOffset);
                int i16 = iPortColonOffset + 1;
                if (i16 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, input, i15, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(input, i16, iDelimiterOffset);
                    this.port = port;
                    if (port == c15) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i16, iDelimiterOffset);
                        e0.checkNotNullExpressionValue(strSubstring2, str6);
                        sb4.append(strSubstring2);
                        sb4.append(AbstractJsonLexerKt.STRING);
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str3 = str6;
                } else {
                    str3 = str6;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i15, iPortColonOffset, false, 4, null));
                    String str7 = this.scheme;
                    e0.checkNotNull(str7);
                    this.port = companion4.defaultPort(str7);
                }
                if (this.host == null) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i15, iPortColonOffset);
                    e0.checkNotNullExpressionValue(strSubstring3, str3);
                    sb5.append(strSubstring3);
                    sb5.append(AbstractJsonLexerKt.STRING);
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || input.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i10 = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i17 = i10;
            int iDelimiterOffset3 = Util.delimiterOffset(input, "?#", iIndexOfFirstNonAsciiWhitespace$default, i17);
            resolvePath(input, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 >= i17 || input.charAt(iDelimiterOffset3) != '?') {
                c11 = '#';
                i14 = iDelimiterOffset3;
            } else {
                c11 = '#';
                int iDelimiterOffset4 = Util.delimiterOffset(input, '#', iDelimiterOffset3, i17);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                i14 = iDelimiterOffset4;
            }
            if (i14 < i17 && input.charAt(i14) == c11) {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i14 + 1, i17, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String password) {
            e0.checkNotNullParameter(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int i10) {
            if (1 > i10 || i10 >= 65536) {
                throw new IllegalArgumentException(b.e(i10, "unexpected port: ").toString());
            }
            this.port = i10;
            return this;
        }

        public final Builder query(String str) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null)) == null) ? null : companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new x("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.encodedPathSegments;
                list.set(i10, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i10), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = list2.get(i11);
                    list2.set(i11, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            e0.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null));
            return this;
        }

        public final Builder removePathSegment(int i10) {
            this.encodedPathSegments.remove(i10);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            e0.checkNotNullParameter(scheme, "scheme");
            if (k0.equals(scheme, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (!k0.equals(scheme, HttpRequest.DEFAULT_SCHEME, true)) {
                throw new IllegalArgumentException(b.k("unexpected scheme: ", scheme));
            }
            this.scheme = HttpRequest.DEFAULT_SCHEME;
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            e0.checkNotNullParameter(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i10, String encodedPathSegment) {
            e0.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i10, strCanonicalize$okhttp$default);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException(b.k("unexpected path segment: ", encodedPathSegment).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String str) {
            e0.checkNotNullParameter(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            e0.checkNotNullParameter(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i10, String pathSegment) {
            e0.checkNotNullParameter(pathSegment, "pathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException(b.k("unexpected path segment: ", pathSegment).toString());
            }
            this.encodedPathSegments.set(i10, strCanonicalize$okhttp$default);
            return this;
        }

        public final void setPort$okhttp(int i10) {
            this.port = i10;
        }

        public final Builder setQueryParameter(String name, String str) {
            e0.checkNotNullParameter(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L69
                kotlin.jvm.internal.e0.checkNotNull(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = sv.n0.contains$default(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L69:
                int r1 = r6.port
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.effectivePort()
                java.lang.String r3 = r6.scheme
                if (r3 == 0) goto L85
                com.applovin.shadow.okhttp3.HttpUrl$Companion r4 = com.applovin.shadow.okhttp3.HttpUrl.Companion
                kotlin.jvm.internal.e0.checkNotNull(r3)
                int r3 = r4.defaultPort(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                com.applovin.shadow.okhttp3.HttpUrl$Companion r1 = com.applovin.shadow.okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto La3
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.e0.checkNotNull(r2)
                r1.toQueryString$okhttp(r2, r0)
            La3:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String username) {
            e0.checkNotNullParameter(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z10) {
            boolean z11;
            Builder builder;
            String str2;
            boolean z12;
            int i10 = 0;
            while (true) {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i10, str.length());
                if (iDelimiterOffset < str.length()) {
                    z11 = true;
                    str2 = str;
                    z12 = z10;
                    builder = this;
                } else {
                    z11 = false;
                    builder = this;
                    str2 = str;
                    z12 = z10;
                }
                builder.push(str2, i10, iDelimiterOffset, z11, z12);
                i10 = iDelimiterOffset + 1;
                if (i10 > str2.length()) {
                    return builder;
                }
                str = str2;
                z10 = z12;
            }
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            e0.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedName, 0, 0, RnJusJ.YXUDRJzjtu, true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null));
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z10 = false;
            }
            if ((i12 & 16) != 0) {
                z11 = false;
            }
            if ((i12 & 32) != 0) {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z13 = false;
            }
            if ((i12 & 128) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(str, i10, i11, str2, z10, z11, z12, z13, charset);
        }

        private final boolean isPercentEncoded(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && Util.parseHexDigit(str.charAt(i10 + 1)) != -1 && Util.parseHexDigit(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return companion.percentDecode$okhttp(str, i10, i11, z10);
        }

        private final void writeCanonicalized(Buffer buffer, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            int iCharCount = i10;
            Buffer buffer2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        buffer.writeUtf8(z10 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z13)) {
                            if (!n0.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null) && (iCodePointAt != 37 || (z10 && (!z11 || isPercentEncoded(str, iCharCount, i11))))) {
                                buffer.writeUtf8CodePoint(iCodePointAt);
                            }
                        }
                        if (buffer2 == null) {
                            buffer2 = new Buffer();
                        }
                        if (charset == null || e0.areEqual(charset, StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(iCodePointAt);
                        } else {
                            buffer2.writeString(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!buffer2.exhausted()) {
                            byte b10 = buffer2.readByte();
                            int i12 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            buffer.writeByte(37);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[(i12 >> 4) & 15]);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[b10 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i10 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i12));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((hexDigit << 4) + hexDigit2);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    buffer.writeByte(32);
                    i10++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        @f
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m281deprecated_get(String url) {
            e0.checkNotNullParameter(url, "url");
            return get(url);
        }

        @f
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m284deprecated_parse(String url) {
            e0.checkNotNullParameter(url, "url");
            return parse(url);
        }

        public final String canonicalize$okhttp(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            e0.checkNotNullParameter(str, "<this>");
            e0.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || n0.contains$default((CharSequence) encodeSet, (char) iCodePointAt, false, 2, (Object) null) || ((iCodePointAt == 37 && (!z10 || (z11 && !isPercentEncoded(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i10, iCharCount);
                    writeCanonicalized(buffer, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                    return buffer.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int defaultPort(String scheme) {
            e0.checkNotNullParameter(scheme, "scheme");
            if (e0.areEqual(scheme, "http")) {
                return 80;
            }
            return e0.areEqual(scheme, HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
        }

        public final HttpUrl get(String str) {
            e0.checkNotNullParameter(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            e0.checkNotNullParameter(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i10, int i11, boolean z10) {
            e0.checkNotNullParameter(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i10, i12);
                    writePercentDecoded(buffer, str, i12, i11, z10);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = str.substring(i10, i11);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder out) {
            e0.checkNotNullParameter(list, "<this>");
            e0.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append(list.get(i10));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            e0.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iIndexOf$default = n0.indexOf$default((CharSequence) str2, '&', i10, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str2.length();
                }
                int iIndexOf$default2 = n0.indexOf$default((CharSequence) str2, G5.T, i10, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > iIndexOf$default) {
                    String strSubstring = str2.substring(i10, iIndexOf$default);
                    e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iIndexOf$default2);
                    e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iIndexOf$default2 + 1, iIndexOf$default);
                    e0.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iIndexOf$default + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder out) {
            e0.checkNotNullParameter(list, "<this>");
            e0.checkNotNullParameter(out, "out");
            k kVarStep = v.step(v.until(0, list.size()), 2);
            int first = kVarStep.getFirst();
            int last = kVarStep.getLast();
            int step = kVarStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append(G5.T);
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        private Companion() {
        }

        @f
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m283deprecated_get(URL url) {
            e0.checkNotNullParameter(url, "url");
            return get(url);
        }

        public final HttpUrl get(URL url) {
            e0.checkNotNullParameter(url, "<this>");
            String string = url.toString();
            e0.checkNotNullExpressionValue(string, "toString()");
            return parse(string);
        }

        @f
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m282deprecated_get(URI uri) {
            e0.checkNotNullParameter(uri, "uri");
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            e0.checkNotNullParameter(uri, "<this>");
            String string = uri.toString();
            e0.checkNotNullExpressionValue(string, "toString()");
            return parse(string);
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i10, List<String> pathSegments, List<String> list, String str, String url) {
        e0.checkNotNullParameter(scheme, "scheme");
        e0.checkNotNullParameter(username, "username");
        e0.checkNotNullParameter(password, "password");
        e0.checkNotNullParameter(host, "host");
        e0.checkNotNullParameter(pathSegments, "pathSegments");
        e0.checkNotNullParameter(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i10;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = e0.areEqual(scheme, HttpRequest.DEFAULT_SCHEME);
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    @f
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m262deprecated_encodedFragment() {
        return encodedFragment();
    }

    @f
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m263deprecated_encodedPassword() {
        return encodedPassword();
    }

    @f
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m264deprecated_encodedPath() {
        return encodedPath();
    }

    @f
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m265deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @f
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m266deprecated_encodedQuery() {
        return encodedQuery();
    }

    @f
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m267deprecated_encodedUsername() {
        return encodedUsername();
    }

    @f
    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m268deprecated_fragment() {
        return this.fragment;
    }

    @f
    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m269deprecated_host() {
        return this.host;
    }

    @f
    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m270deprecated_password() {
        return this.password;
    }

    @f
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m271deprecated_pathSegments() {
        return this.pathSegments;
    }

    @f
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m272deprecated_pathSize() {
        return pathSize();
    }

    @f
    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m273deprecated_port() {
        return this.port;
    }

    @f
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m274deprecated_query() {
        return query();
    }

    @f
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m275deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @f
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m276deprecated_querySize() {
        return querySize();
    }

    @f
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m277deprecated_scheme() {
        return this.scheme;
    }

    @f
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m278deprecated_uri() {
        return uri();
    }

    @f
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m279deprecated_url() {
        return url();
    }

    @f
    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m280deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(n0.indexOf$default((CharSequence) this.url, '#', 0, false, 6, (Object) null) + 1);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String strSubstring = this.url.substring(n0.indexOf$default((CharSequence) this.url, AbstractJsonLexerKt.COLON, this.scheme.length() + 3, false, 4, (Object) null) + 1, n0.indexOf$default((CharSequence) this.url, '@', 0, false, 6, (Object) null));
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedPath() {
        int iIndexOf$default = n0.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        String strSubstring = this.url.substring(iIndexOf$default, Util.delimiterOffset(str, "?#", iIndexOf$default, str.length()));
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iIndexOf$default = n0.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iDelimiterOffset) {
            int i10 = iIndexOf$default + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i10, iDelimiterOffset);
            String strSubstring = this.url.substring(i10, iDelimiterOffset2);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iIndexOf$default = n0.indexOf$default((CharSequence) this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iIndexOf$default, Util.delimiterOffset(str, '#', iIndexOf$default, str.length()));
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && e0.areEqual(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    public final String queryParameter(String name) {
        e0.checkNotNullParameter(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        k kVarStep = v.step(v.until(0, list.size()), 2);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!e0.areEqual(name, this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    public final String queryParameterName(int i10) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i10 * 2);
        e0.checkNotNull(str);
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return c2.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k kVarStep = v.step(v.until(0, this.queryNamesAndValues.size()), 2);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                String str = this.queryNamesAndValues.get(first);
                e0.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        e0.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int i10) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i10 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        e0.checkNotNullParameter(name, "name");
        if (this.queryNamesAndValues == null) {
            return uu.p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        k kVarStep = v.step(v.until(0, this.queryNamesAndValues.size()), 2);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (e0.areEqual(name, this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        e0.checkNotNull(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String link) {
        e0.checkNotNullParameter(link, "link");
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new x("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                e0.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public final Builder newBuilder(String link) {
        e0.checkNotNullParameter(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
