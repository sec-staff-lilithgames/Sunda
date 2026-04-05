package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.amazon.device.ads.DTBMetricReport;
import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.u;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.thrid.okio.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f43472f = com.mbridge.msdk.thrid.okhttp.internal.c.a(DTBMetricReport.CONNECTION, "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f43473g = com.mbridge.msdk.thrid.okhttp.internal.c.a(DTBMetricReport.CONNECTION, "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    private final r.a f43474a;

    /* renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g f43475b;

    /* renamed from: c, reason: collision with root package name */
    private final g f43476c;

    /* renamed from: d, reason: collision with root package name */
    private i f43477d;

    /* renamed from: e, reason: collision with root package name */
    private final u f43478e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.mbridge.msdk.thrid.okio.h {

        /* renamed from: b, reason: collision with root package name */
        boolean f43479b;

        /* renamed from: c, reason: collision with root package name */
        long f43480c;

        public a(s sVar) {
            super(sVar);
            this.f43479b = false;
            this.f43480c = 0L;
        }

        private void a(IOException iOException) throws IOException {
            if (this.f43479b) {
                return;
            }
            this.f43479b = true;
            f fVar = f.this;
            fVar.f43475b.a(false, fVar, this.f43480c, iOException);
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = d().b(cVar, j10);
                if (jB <= 0) {
                    return jB;
                }
                this.f43480c += jB;
                return jB;
            } catch (IOException e10) {
                a(e10);
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.h, com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            a(null);
        }
    }

    public f(t tVar, r.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, g gVar2) {
        this.f43474a = aVar;
        this.f43475b = gVar;
        this.f43476c = gVar2;
        List<u> listU = tVar.u();
        u uVar = u.H2_PRIOR_KNOWLEDGE;
        this.f43478e = listU.contains(uVar) ? uVar : u.HTTP_2;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public com.mbridge.msdk.thrid.okio.r a(w wVar, long j10) {
        return this.f43477d.d();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f43476c.flush();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        i iVar = this.f43477d;
        if (iVar != null) {
            iVar.c(b.CANCEL);
        }
    }

    public static List<c> b(w wVar) {
        p pVarC = wVar.c();
        ArrayList arrayList = new ArrayList(pVarC.b() + 4);
        arrayList.add(new c(c.f43441f, wVar.e()));
        arrayList.add(new c(c.f43442g, com.mbridge.msdk.thrid.okhttp.internal.http.i.a(wVar.g())));
        String strA = wVar.a("Host");
        if (strA != null) {
            arrayList.add(new c(c.f43444i, strA));
        }
        arrayList.add(new c(c.f43443h, wVar.g().l()));
        int iB = pVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            com.mbridge.msdk.thrid.okio.f fVarC = com.mbridge.msdk.thrid.okio.f.c(pVarC.a(i10).toLowerCase(Locale.US));
            if (!f43472f.contains(fVarC.h())) {
                arrayList.add(new c(fVarC, pVarC.b(i10)));
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(w wVar) throws IOException {
        if (this.f43477d != null) {
            return;
        }
        i iVarA = this.f43476c.a(b(wVar), wVar.a() != null);
        this.f43477d = iVarA;
        com.mbridge.msdk.thrid.okio.t tVarH = iVarA.h();
        long jB = this.f43474a.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarH.a(jB, timeUnit);
        this.f43477d.l().a(this.f43474a.c(), timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f43477d.d().close();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public y.a a(boolean z10) throws NumberFormatException, IOException {
        y.a aVarA = a(this.f43477d.j(), this.f43478e);
        if (z10 && com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(aVarA) == 100) {
            return null;
        }
        return aVarA;
    }

    public static y.a a(p pVar, u uVar) throws NumberFormatException, IOException {
        p.a aVar = new p.a();
        int iB = pVar.b();
        com.mbridge.msdk.thrid.okhttp.internal.http.k kVarA = null;
        for (int i10 = 0; i10 < iB; i10++) {
            String strA = pVar.a(i10);
            String strB = pVar.b(i10);
            if (strA.equals(Header.RESPONSE_STATUS_UTF8)) {
                kVarA = com.mbridge.msdk.thrid.okhttp.internal.http.k.a("HTTP/1.1 " + strB);
            } else if (!f43473g.contains(strA)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(aVar, strA, strB);
            }
        }
        if (kVarA != null) {
            return new y.a().a(uVar).a(kVarA.f43399b).a(kVarA.f43400c).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public z a(y yVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f43475b;
        gVar.f43360f.responseBodyStart(gVar.f43359e);
        return new com.mbridge.msdk.thrid.okhttp.internal.http.h(yVar.b("Content-Type"), com.mbridge.msdk.thrid.okhttp.internal.http.e.a(yVar), com.mbridge.msdk.thrid.okio.l.a(new a(this.f43477d.e())));
    }
}
