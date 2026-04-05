package xv;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final List f93819e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f93820f;

    /* renamed from: g, reason: collision with root package name */
    public static final s f93821g;

    /* renamed from: h, reason: collision with root package name */
    public static final s f93822h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f93823a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93824b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f93825c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f93826d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new b(null);
        o oVar = o.f93785r;
        o oVar2 = o.f93786s;
        o oVar3 = o.f93787t;
        o oVar4 = o.f93779l;
        o oVar5 = o.f93781n;
        o oVar6 = o.f93780m;
        o oVar7 = o.f93782o;
        o oVar8 = o.f93784q;
        o oVar9 = o.f93783p;
        List listListOf = uu.p0.listOf((Object[]) new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9});
        f93819e = listListOf;
        List listListOf2 = uu.p0.listOf((Object[]) new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, o.f93777j, o.f93778k, o.f93775h, o.f93776i, o.f93773f, o.f93774g, o.f93772e});
        f93820f = listListOf2;
        a aVar = new a(true);
        o[] oVarArr = (o[]) listListOf.toArray(new o[0]);
        a aVarCipherSuites = aVar.cipherSuites((o[]) Arrays.copyOf(oVarArr, oVarArr.length));
        a1 a1Var = a1.f93568e;
        a1 a1Var2 = a1.f93569f;
        aVarCipherSuites.tlsVersions(a1Var, a1Var2).supportsTlsExtensions(true).build();
        a aVar2 = new a(true);
        o[] oVarArr2 = (o[]) listListOf2.toArray(new o[0]);
        f93821g = aVar2.cipherSuites((o[]) Arrays.copyOf(oVarArr2, oVarArr2.length)).tlsVersions(a1Var, a1Var2).supportsTlsExtensions(true).build();
        a aVar3 = new a(true);
        o[] oVarArr3 = (o[]) listListOf2.toArray(new o[0]);
        aVar3.cipherSuites((o[]) Arrays.copyOf(oVarArr3, oVarArr3.length)).tlsVersions(a1Var, a1Var2, a1.f93570g, a1.f93571h).supportsTlsExtensions(true).build();
        f93822h = new a(false).build();
    }

    public s(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f93823a = z10;
        this.f93824b = z11;
        this.f93825c = strArr;
        this.f93826d = strArr2;
    }

    @tu.f
    /* renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final List<o> m7984deprecated_cipherSuites() {
        return cipherSuites();
    }

    @tu.f
    /* renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name */
    public final boolean m7985deprecated_supportsTlsExtensions() {
        return this.f93824b;
    }

    @tu.f
    /* renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final List<a1> m7986deprecated_tlsVersions() {
        return tlsVersions();
    }

    public final void apply$okhttp(SSLSocket sslSocket, boolean z10) {
        String[] enabledProtocols;
        kotlin.jvm.internal.e0.checkNotNullParameter(sslSocket, "sslSocket");
        String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        kotlin.jvm.internal.e0.checkNotNull(enabledCipherSuites);
        String[] strArrEffectiveCipherSuites = yv.a.effectiveCipherSuites(this, enabledCipherSuites);
        String[] strArr = this.f93826d;
        if (strArr != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = yv.h.intersect(enabledProtocols2, strArr, xu.d.naturalOrder());
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.e0.checkNotNull(supportedCipherSuites);
        int iIndexOf = yv.h.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", o.f93769b.getORDER_BY_NAME$okhttp());
        if (z10 && iIndexOf != -1) {
            String str = supportedCipherSuites[iIndexOf];
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "get(...)");
            strArrEffectiveCipherSuites = yv.h.concat(strArrEffectiveCipherSuites, str);
        }
        s sVarBuild = new a(this).cipherSuites((String[]) Arrays.copyOf(strArrEffectiveCipherSuites, strArrEffectiveCipherSuites.length)).tlsVersions((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).build();
        if (sVarBuild.tlsVersions() != null) {
            sslSocket.setEnabledProtocols(sVarBuild.f93826d);
        }
        if (sVarBuild.cipherSuites() != null) {
            sslSocket.setEnabledCipherSuites(sVarBuild.f93825c);
        }
    }

    public final List<o> cipherSuites() {
        String[] strArr = this.f93825c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(o.f93769b.forJavaName(str));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        s sVar = (s) obj;
        boolean z10 = sVar.f93823a;
        boolean z11 = this.f93823a;
        if (z11 != z10) {
            return false;
        }
        return !z11 || (Arrays.equals(this.f93825c, sVar.f93825c) && Arrays.equals(this.f93826d, sVar.f93826d) && this.f93824b == sVar.f93824b);
    }

    public final String[] getCipherSuitesAsString$okhttp() {
        return this.f93825c;
    }

    public int hashCode() {
        if (!this.f93823a) {
            return 17;
        }
        String[] strArr = this.f93825c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f93826d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f93824b ? 1 : 0);
    }

    public final boolean isCompatible(SSLSocket socket) {
        kotlin.jvm.internal.e0.checkNotNullParameter(socket, "socket");
        if (!this.f93823a) {
            return false;
        }
        String[] strArr = this.f93826d;
        if (strArr != null && !yv.h.hasIntersection(strArr, socket.getEnabledProtocols(), xu.d.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f93825c;
        return strArr2 == null || yv.h.hasIntersection(strArr2, socket.getEnabledCipherSuites(), o.f93769b.getORDER_BY_NAME$okhttp());
    }

    public final boolean isTls() {
        return this.f93823a;
    }

    public final boolean supportsTlsExtensions() {
        return this.f93824b;
    }

    public final List<a1> tlsVersions() {
        String[] strArr = this.f93826d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a1.f93567c.forJavaName(str));
        }
        return arrayList;
    }

    public String toString() {
        if (!this.f93823a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(cipherSuites(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(tlsVersions(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return a.b.p(sb2, this.f93824b, ')');
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f93827a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f93828b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f93829c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f93830d;

        public a(boolean z10) {
            this.f93827a = z10;
        }

        public final a allEnabledCipherSuites() {
            if (!this.f93827a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            this.f93828b = null;
            return this;
        }

        public final a allEnabledTlsVersions() {
            if (!this.f93827a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            this.f93829c = null;
            return this;
        }

        public final s build() {
            return new s(this.f93827a, this.f93830d, this.f93828b, this.f93829c);
        }

        public final a cipherSuites(o... cipherSuites) {
            kotlin.jvm.internal.e0.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f93827a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (o oVar : cipherSuites) {
                arrayList.add(oVar.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final String[] getCipherSuites$okhttp() {
            return this.f93828b;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.f93830d;
        }

        public final boolean getTls$okhttp() {
            return this.f93827a;
        }

        public final String[] getTlsVersions$okhttp() {
            return this.f93829c;
        }

        public final void setCipherSuites$okhttp(String[] strArr) {
            this.f93828b = strArr;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z10) {
            this.f93830d = z10;
        }

        public final void setTls$okhttp(boolean z10) {
            this.f93827a = z10;
        }

        public final void setTlsVersions$okhttp(String[] strArr) {
            this.f93829c = strArr;
        }

        @tu.f
        public final a supportsTlsExtensions(boolean z10) {
            if (!this.f93827a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f93830d = z10;
            return this;
        }

        public final a tlsVersions(a1... tlsVersions) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f93827a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (a1 a1Var : tlsVersions) {
                arrayList.add(a1Var.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(s connectionSpec) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f93827a = connectionSpec.isTls();
            this.f93828b = connectionSpec.getCipherSuitesAsString$okhttp();
            this.f93829c = connectionSpec.f93826d;
            this.f93830d = connectionSpec.supportsTlsExtensions();
        }

        public final a cipherSuites(String... cipherSuites) {
            kotlin.jvm.internal.e0.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (this.f93827a) {
                if (!(cipherSuites.length == 0)) {
                    Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f93828b = (String[]) objArrCopyOf;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final a tlsVersions(String... tlsVersions) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (this.f93827a) {
                if (!(tlsVersions.length == 0)) {
                    Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f93829c = (String[]) objArrCopyOf;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
    }
}
