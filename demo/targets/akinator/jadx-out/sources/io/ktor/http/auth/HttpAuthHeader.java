package io.ktor.http.auth;

import a.b;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.ktor.http.CodecsKt;
import io.ktor.http.HeaderValueParam;
import io.ktor.http.HeaderValueWithParametersKt;
import io.ktor.http.parsing.ParseException;
import io.ktor.util.CryptoKt;
import io.ktor.util.Hash;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.k0;
import tu.t;
import uu.o1;
import uu.p0;
import uu.p1;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class HttpAuthHeader {
    public static final Companion Companion = new Companion(null);
    private final String authScheme;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ HttpAuthHeader bearerAuthChallenge$default(Companion companion, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return companion.bearerAuthChallenge(str, str2);
        }

        public static /* synthetic */ Parameterized digestAuthChallenge$default(Companion companion, String str, String str2, List list, String str3, Boolean bool, String str4, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = CryptoKt.generateNonce();
            }
            String str5 = str2;
            if ((i10 & 4) != 0) {
                list = p0.emptyList();
            }
            List list2 = list;
            String str6 = (i10 & 8) != 0 ? null : str3;
            Boolean bool2 = (i10 & 16) != 0 ? null : bool;
            if ((i10 & 32) != 0) {
                str4 = SameMD5.TAG;
            }
            return companion.digestAuthChallenge(str, str5, list2, str6, bool2, str4);
        }

        public final Parameterized basicAuthChallenge(String realm, Charset charset) {
            e0.checkNotNullParameter(realm, "realm");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Parameters.Realm, realm);
            if (charset != null) {
                linkedHashMap.put("charset", CharsetJVMKt.getName(charset));
            }
            return new Parameterized(AuthScheme.Basic, linkedHashMap, (HeaderValueEncoding) null, 4, (u) null);
        }

        public final HttpAuthHeader bearerAuthChallenge(String scheme, String str) {
            e0.checkNotNullParameter(scheme, "scheme");
            return new Parameterized(scheme, str == null ? p1.emptyMap() : o1.mapOf(tu.e0.to(Parameters.Realm, str)), (HeaderValueEncoding) null, 4, (u) null);
        }

        public final Parameterized digestAuthChallenge(String realm, String nonce, List<String> domain, String str, Boolean bool, String algorithm) {
            e0.checkNotNullParameter(realm, "realm");
            e0.checkNotNullParameter(nonce, "nonce");
            e0.checkNotNullParameter(domain, "domain");
            e0.checkNotNullParameter(algorithm, "algorithm");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Parameters.Realm, realm);
            linkedHashMap.put("nonce", nonce);
            if (!domain.isEmpty()) {
                linkedHashMap.put(C3191e4.i.D, y0.joinToString$default(domain, " ", null, null, 0, null, null, 62, null));
            }
            if (str != null) {
                linkedHashMap.put("opaque", str);
            }
            if (bool != null) {
                linkedHashMap.put("stale", bool.toString());
            }
            linkedHashMap.put("algorithm", algorithm);
            return new Parameterized(AuthScheme.Digest, linkedHashMap, HeaderValueEncoding.QUOTED_ALWAYS);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Parameters {
        public static final String Charset = "charset";
        public static final Parameters INSTANCE = new Parameters();
        public static final String OAuthCallback = "oauth_callback";
        public static final String OAuthCallbackConfirmed = "oauth_callback_confirmed";
        public static final String OAuthConsumerKey = "oauth_consumer_key";
        public static final String OAuthNonce = "oauth_nonce";
        public static final String OAuthSignature = "oauth_signature";
        public static final String OAuthSignatureMethod = "oauth_signature_method";
        public static final String OAuthTimestamp = "oauth_timestamp";
        public static final String OAuthToken = "oauth_token";
        public static final String OAuthTokenSecret = "oauth_token_secret";
        public static final String OAuthVerifier = "oauth_verifier";
        public static final String OAuthVersion = "oauth_version";
        public static final String Realm = "realm";

        private Parameters() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Single extends HttpAuthHeader {
        private final String blob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Single(String authScheme, String blob) {
            super(authScheme, null);
            e0.checkNotNullParameter(authScheme, "authScheme");
            e0.checkNotNullParameter(blob, "blob");
            this.blob = blob;
            if (!HttpAuthHeaderKt.token68Pattern.matches(blob)) {
                throw new ParseException("Invalid blob value: it should be token68", null, 2, null);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Single)) {
                return false;
            }
            Single single = (Single) obj;
            return k0.equals(single.getAuthScheme(), getAuthScheme(), true) && k0.equals(single.blob, this.blob, true);
        }

        public final String getBlob() {
            return this.blob;
        }

        public int hashCode() {
            Hash hash = Hash.INSTANCE;
            String authScheme = getAuthScheme();
            Locale locale = Locale.ROOT;
            String lowerCase = authScheme.toLowerCase(locale);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = this.blob.toLowerCase(locale);
            e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return hash.combine(lowerCase, lowerCase2);
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public String render() {
            return getAuthScheme() + ' ' + this.blob;
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public String render(HeaderValueEncoding encoding) {
            e0.checkNotNullParameter(encoding, "encoding");
            return render();
        }
    }

    public /* synthetic */ HttpAuthHeader(String str, u uVar) {
        this(str);
    }

    public final String getAuthScheme() {
        return this.authScheme;
    }

    public abstract String render();

    public abstract String render(HeaderValueEncoding headerValueEncoding);

    public String toString() {
        return render();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Parameterized extends HttpAuthHeader {
        private final HeaderValueEncoding encoding;
        private final List<HeaderValueParam> parameters;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HeaderValueEncoding.values().length];
                try {
                    iArr[HeaderValueEncoding.QUOTED_WHEN_REQUIRED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HeaderValueEncoding.QUOTED_ALWAYS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HeaderValueEncoding.URI_ENCODE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Parameterized(String str, List list, HeaderValueEncoding headerValueEncoding, int i10, u uVar) {
            this(str, (List<HeaderValueParam>) list, (i10 & 4) != 0 ? HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String encode(String str, HeaderValueEncoding headerValueEncoding) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[headerValueEncoding.ordinal()];
            if (i10 == 1) {
                return HeaderValueWithParametersKt.escapeIfNeeded(str);
            }
            if (i10 == 2) {
                return HeaderValueWithParametersKt.quote(str);
            }
            if (i10 == 3) {
                return CodecsKt.encodeURLParameter$default(str, false, 1, null);
            }
            throw new t();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Parameterized)) {
                return false;
            }
            Parameterized parameterized = (Parameterized) obj;
            return k0.equals(parameterized.getAuthScheme(), getAuthScheme(), true) && e0.areEqual(parameterized.parameters, this.parameters);
        }

        public final HeaderValueEncoding getEncoding() {
            return this.encoding;
        }

        public final List<HeaderValueParam> getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            Hash hash = Hash.INSTANCE;
            String lowerCase = getAuthScheme().toLowerCase(Locale.ROOT);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return hash.combine(lowerCase, this.parameters);
        }

        public final String parameter(String name) {
            Object next;
            e0.checkNotNullParameter(name, "name");
            Iterator<T> it = this.parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (e0.areEqual(((HeaderValueParam) next).getName(), name)) {
                    break;
                }
            }
            HeaderValueParam headerValueParam = (HeaderValueParam) next;
            if (headerValueParam != null) {
                return headerValueParam.getValue();
            }
            return null;
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public String render(HeaderValueEncoding encoding) {
            e0.checkNotNullParameter(encoding, "encoding");
            if (this.parameters.isEmpty()) {
                return getAuthScheme();
            }
            return y0.joinToString$default(this.parameters, ", ", getAuthScheme() + ' ', null, 0, null, new HttpAuthHeader$Parameterized$render$1(this, encoding), 28, null);
        }

        public final Parameterized withParameter(String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            return new Parameterized(getAuthScheme(), (List<HeaderValueParam>) y0.plus((Collection<? extends HeaderValueParam>) this.parameters, new HeaderValueParam(name, value)), this.encoding);
        }

        public final Parameterized withReplacedParameter(String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            Iterator<HeaderValueParam> it = this.parameters.iterator();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                if (e0.areEqual(it.next().getName(), name)) {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                return withParameter(name, value);
            }
            List<HeaderValueParam> list = this.parameters;
            ArrayList arrayList = new ArrayList();
            for (HeaderValueParam headerValueParam : list) {
                if (e0.areEqual(headerValueParam.getName(), name)) {
                    if (z10) {
                        headerValueParam = null;
                    } else {
                        headerValueParam = new HeaderValueParam(name, value);
                        z10 = true;
                    }
                }
                if (headerValueParam != null) {
                    arrayList.add(headerValueParam);
                }
            }
            return new Parameterized(getAuthScheme(), arrayList, this.encoding);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Parameterized(String authScheme, List<HeaderValueParam> parameters, HeaderValueEncoding encoding) {
            super(authScheme, null);
            e0.checkNotNullParameter(authScheme, "authScheme");
            e0.checkNotNullParameter(parameters, "parameters");
            e0.checkNotNullParameter(encoding, "encoding");
            this.parameters = parameters;
            this.encoding = encoding;
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                if (!HttpAuthHeaderKt.token68Pattern.matches(((HeaderValueParam) it.next()).getName())) {
                    throw new ParseException("Parameter name should be a token", null, 2, null);
                }
            }
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public String render() {
            return render(this.encoding);
        }

        public /* synthetic */ Parameterized(String str, Map map, HeaderValueEncoding headerValueEncoding, int i10, u uVar) {
            this(str, (Map<String, String>) map, (i10 & 4) != 0 ? HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        public Parameterized(String authScheme, Map<String, String> parameters, HeaderValueEncoding encoding) {
            e0.checkNotNullParameter(authScheme, "authScheme");
            e0.checkNotNullParameter(parameters, "parameters");
            e0.checkNotNullParameter(encoding, "encoding");
            Set<Map.Entry<String, String>> setEntrySet = parameters.entrySet();
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(setEntrySet, 10));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new HeaderValueParam((String) entry.getKey(), (String) entry.getValue()));
            }
            this(authScheme, arrayList, encoding);
        }
    }

    private HttpAuthHeader(String str) {
        this.authScheme = str;
        if (!HttpAuthHeaderKt.token68Pattern.matches(str)) {
            throw new ParseException(b.k("Invalid authScheme value: it should be token, but instead it is ", str), null, 2, null);
        }
    }
}
