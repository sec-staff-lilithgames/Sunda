package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    private static final f[] f43271e;

    /* renamed from: f, reason: collision with root package name */
    private static final f[] f43272f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f43273g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f43274h;

    /* renamed from: i, reason: collision with root package name */
    public static final i f43275i;

    /* renamed from: j, reason: collision with root package name */
    public static final i f43276j;

    /* renamed from: a, reason: collision with root package name */
    final boolean f43277a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f43278b;

    /* renamed from: c, reason: collision with root package name */
    final String[] f43279c;

    /* renamed from: d, reason: collision with root package name */
    final String[] f43280d;

    static {
        f fVar = f.f43232n1;
        f fVar2 = f.f43235o1;
        f fVar3 = f.f43238p1;
        f fVar4 = f.f43241q1;
        f fVar5 = f.f43244r1;
        f fVar6 = f.Z0;
        f fVar7 = f.f43202d1;
        f fVar8 = f.f43193a1;
        f fVar9 = f.f43205e1;
        f fVar10 = f.f43223k1;
        f fVar11 = f.f43220j1;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
        f43271e = fVarArr;
        f[] fVarArr2 = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, f.K0, f.L0, f.f43216i0, f.f43219j0, f.G, f.K, f.f43221k};
        f43272f = fVarArr2;
        a aVarA = new a(true).a(fVarArr);
        b0 b0Var = b0.TLS_1_3;
        b0 b0Var2 = b0.TLS_1_2;
        f43273g = aVarA.a(b0Var, b0Var2).a(true).a();
        a aVarA2 = new a(true).a(fVarArr2);
        b0 b0Var3 = b0.TLS_1_1;
        b0 b0Var4 = b0.TLS_1_0;
        f43274h = aVarA2.a(b0Var, b0Var2, b0Var3, b0Var4).a(true).a();
        f43275i = new a(true).a(fVarArr2).a(b0Var4).a(true).a();
        f43276j = new a(false).a();
    }

    public i(a aVar) {
        this.f43277a = aVar.f43281a;
        this.f43279c = aVar.f43282b;
        this.f43280d = aVar.f43283c;
        this.f43278b = aVar.f43284d;
    }

    public List<f> a() {
        String[] strArr = this.f43279c;
        if (strArr != null) {
            return f.a(strArr);
        }
        return null;
    }

    public boolean b() {
        return this.f43277a;
    }

    public boolean c() {
        return this.f43278b;
    }

    public List<b0> d() {
        String[] strArr = this.f43280d;
        if (strArr != null) {
            return b0.a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z10 = this.f43277a;
        if (z10 != iVar.f43277a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f43279c, iVar.f43279c) && Arrays.equals(this.f43280d, iVar.f43280d) && this.f43278b == iVar.f43278b);
    }

    public int hashCode() {
        if (this.f43277a) {
            return ((((Arrays.hashCode(this.f43279c) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f43280d)) * 31) + (!this.f43278b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.f43277a) {
            return a.b.q(b3.h.b("ConnectionSpec(cipherSuites=", this.f43279c != null ? a().toString() : "[all enabled]", ", tlsVersions=", this.f43280d != null ? d().toString() : "[all enabled]", ", supportsTlsExtensions="), this.f43278b, ")");
        }
        return "ConnectionSpec()";
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f43281a;

        /* renamed from: b, reason: collision with root package name */
        String[] f43282b;

        /* renamed from: c, reason: collision with root package name */
        String[] f43283c;

        /* renamed from: d, reason: collision with root package name */
        boolean f43284d;

        public a(boolean z10) {
            this.f43281a = z10;
        }

        public a a(f... fVarArr) {
            if (!this.f43281a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[fVarArr.length];
            for (int i10 = 0; i10 < fVarArr.length; i10++) {
                strArr[i10] = fVarArr[i10].f43261a;
            }
            return a(strArr);
        }

        public a b(String... strArr) {
            if (!this.f43281a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f43283c = (String[]) strArr.clone();
            return this;
        }

        public a(i iVar) {
            this.f43281a = iVar.f43277a;
            this.f43282b = iVar.f43279c;
            this.f43283c = iVar.f43280d;
            this.f43284d = iVar.f43278b;
        }

        public a a(String... strArr) {
            if (this.f43281a) {
                if (strArr.length != 0) {
                    this.f43282b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(b0... b0VarArr) {
            if (this.f43281a) {
                String[] strArr = new String[b0VarArr.length];
                for (int i10 = 0; i10 < b0VarArr.length; i10++) {
                    strArr[i10] = b0VarArr[i10].f43160a;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(boolean z10) {
            if (this.f43281a) {
                this.f43284d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public i a() {
            return new i(this);
        }
    }

    private i b(SSLSocket sSLSocket, boolean z10) {
        String[] strArrA = this.f43279c != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(f.f43194b, sSLSocket.getEnabledCipherSuites(), this.f43279c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrA2 = this.f43280d != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.f43303q, sSLSocket.getEnabledProtocols(), this.f43280d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(f.f43194b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && iA != -1) {
            strArrA = com.mbridge.msdk.thrid.okhttp.internal.c.a(strArrA, supportedCipherSuites[iA]);
        }
        return new a(this).a(strArrA).b(strArrA2).a();
    }

    public void a(SSLSocket sSLSocket, boolean z10) {
        i iVarB = b(sSLSocket, z10);
        String[] strArr = iVarB.f43280d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = iVarB.f43279c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f43277a) {
            return false;
        }
        String[] strArr = this.f43280d;
        if (strArr != null && !com.mbridge.msdk.thrid.okhttp.internal.c.b(com.mbridge.msdk.thrid.okhttp.internal.c.f43303q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f43279c;
        return strArr2 == null || com.mbridge.msdk.thrid.okhttp.internal.c.b(f.f43194b, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
