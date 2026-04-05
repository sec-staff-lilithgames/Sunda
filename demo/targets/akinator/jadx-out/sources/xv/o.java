package xv;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Comparator;
import java.util.LinkedHashMap;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final a f93769b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f93770c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f93771d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f93772e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f93773f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f93774g;

    /* renamed from: h, reason: collision with root package name */
    public static final o f93775h;

    /* renamed from: i, reason: collision with root package name */
    public static final o f93776i;

    /* renamed from: j, reason: collision with root package name */
    public static final o f93777j;

    /* renamed from: k, reason: collision with root package name */
    public static final o f93778k;

    /* renamed from: l, reason: collision with root package name */
    public static final o f93779l;

    /* renamed from: m, reason: collision with root package name */
    public static final o f93780m;

    /* renamed from: n, reason: collision with root package name */
    public static final o f93781n;

    /* renamed from: o, reason: collision with root package name */
    public static final o f93782o;

    /* renamed from: p, reason: collision with root package name */
    public static final o f93783p;

    /* renamed from: q, reason: collision with root package name */
    public static final o f93784q;

    /* renamed from: r, reason: collision with root package name */
    public static final o f93785r;

    /* renamed from: s, reason: collision with root package name */
    public static final o f93786s;

    /* renamed from: t, reason: collision with root package name */
    public static final o f93787t;

    /* renamed from: a, reason: collision with root package name */
    public final String f93788a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static String a(String str) {
            if (sv.k0.startsWith$default(str, "TLS_", false, 2, null)) {
                StringBuilder sb2 = new StringBuilder("SSL_");
                String strSubstring = str.substring(4);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                return sb2.toString();
            }
            if (!sv.k0.startsWith$default(str, "SSL_", false, 2, null)) {
                return str;
            }
            StringBuilder sb3 = new StringBuilder("TLS_");
            String strSubstring2 = str.substring(4);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb3.append(strSubstring2);
            return sb3.toString();
        }

        public static final o access$init(a aVar, String str, int i10) {
            aVar.getClass();
            o oVar = new o(str, null);
            o.f93771d.put(str, oVar);
            return oVar;
        }

        public final synchronized o forJavaName(String javaName) {
            o oVar;
            try {
                kotlin.jvm.internal.e0.checkNotNullParameter(javaName, "javaName");
                oVar = (o) o.f93771d.get(javaName);
                if (oVar == null) {
                    oVar = (o) o.f93771d.get(a(javaName));
                    if (oVar == null) {
                        oVar = new o(javaName, null);
                    }
                    o.f93771d.put(javaName, oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return oVar;
        }

        public final Comparator<String> getORDER_BY_NAME$okhttp() {
            return o.f93770c;
        }
    }

    static {
        a aVar = new a(null);
        f93769b = aVar;
        f93770c = new n();
        f93771d = new LinkedHashMap();
        a.access$init(aVar, "SSL_RSA_WITH_NULL_MD5", 1);
        a.access$init(aVar, "SSL_RSA_WITH_NULL_SHA", 2);
        a.access$init(aVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        a.access$init(aVar, "SSL_RSA_WITH_RC4_128_MD5", 4);
        a.access$init(aVar, "SSL_RSA_WITH_RC4_128_SHA", 5);
        a.access$init(aVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        a.access$init(aVar, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        f93772e = a.access$init(aVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        a.access$init(aVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        a.access$init(aVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        a.access$init(aVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        a.access$init(aVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        a.access$init(aVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        a.access$init(aVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        a.access$init(aVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        a.access$init(aVar, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        a.access$init(aVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        a.access$init(aVar, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        a.access$init(aVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        a.access$init(aVar, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        a.access$init(aVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        a.access$init(aVar, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        a.access$init(aVar, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        a.access$init(aVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        a.access$init(aVar, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        a.access$init(aVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        a.access$init(aVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        a.access$init(aVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        a.access$init(aVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f93773f = a.access$init(aVar, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        a.access$init(aVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        a.access$init(aVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        a.access$init(aVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f93774g = a.access$init(aVar, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        a.access$init(aVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        a.access$init(aVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        a.access$init(aVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        a.access$init(aVar, "TLS_RSA_WITH_NULL_SHA256", 59);
        a.access$init(aVar, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        a.access$init(aVar, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        a.access$init(aVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        a.access$init(aVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        a.access$init(aVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        a.access$init(aVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        a.access$init(aVar, GalEuEfxjome.beZ, 103);
        a.access$init(aVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        a.access$init(aVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        a.access$init(aVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        a.access$init(aVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        a.access$init(aVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
        a.access$init(aVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        a.access$init(aVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
        a.access$init(aVar, "TLS_PSK_WITH_RC4_128_SHA", 138);
        a.access$init(aVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        a.access$init(aVar, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        a.access$init(aVar, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        a.access$init(aVar, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f93775h = a.access$init(aVar, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f93776i = a.access$init(aVar, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        a.access$init(aVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        a.access$init(aVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        a.access$init(aVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        a.access$init(aVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        a.access$init(aVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        a.access$init(aVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        a.access$init(aVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        a.access$init(aVar, "TLS_FALLBACK_SCSV", 22016);
        a.access$init(aVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        a.access$init(aVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        a.access$init(aVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        a.access$init(aVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        a.access$init(aVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        a.access$init(aVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        a.access$init(aVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        a.access$init(aVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        a.access$init(aVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        a.access$init(aVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        a.access$init(aVar, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        a.access$init(aVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        a.access$init(aVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        a.access$init(aVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        a.access$init(aVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        a.access$init(aVar, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        a.access$init(aVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        a.access$init(aVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f93777j = a.access$init(aVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f93778k = a.access$init(aVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        a.access$init(aVar, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        a.access$init(aVar, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        a.access$init(aVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        a.access$init(aVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        a.access$init(aVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        a.access$init(aVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        a.access$init(aVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        a.access$init(aVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        a.access$init(aVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        a.access$init(aVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        a.access$init(aVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        a.access$init(aVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        a.access$init(aVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f93779l = a.access$init(aVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f93780m = a.access$init(aVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        a.access$init(aVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        a.access$init(aVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f93781n = a.access$init(aVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f93782o = a.access$init(aVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        a.access$init(aVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        a.access$init(aVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        a.access$init(aVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        a.access$init(aVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f93783p = a.access$init(aVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f93784q = a.access$init(aVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        a.access$init(aVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        a.access$init(aVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f93785r = a.access$init(aVar, "TLS_AES_128_GCM_SHA256", 4865);
        f93786s = a.access$init(aVar, "TLS_AES_256_GCM_SHA384", 4866);
        f93787t = a.access$init(aVar, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        a.access$init(aVar, "TLS_AES_128_CCM_SHA256", 4868);
        a.access$init(aVar, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public o(String str, kotlin.jvm.internal.u uVar) {
        this.f93788a = str;
    }

    public static final synchronized o forJavaName(String str) {
        return f93769b.forJavaName(str);
    }

    @tu.f
    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m7978deprecated_javaName() {
        return this.f93788a;
    }

    public final String javaName() {
        return this.f93788a;
    }

    public String toString() {
        return this.f93788a;
    }
}
