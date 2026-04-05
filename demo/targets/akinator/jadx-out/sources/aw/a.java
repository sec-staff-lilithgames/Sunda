package aw;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import aw.e;
import cw.q;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.k0;
import xv.b0;
import xv.f0;
import xv.h0;
import xv.i0;
import xv.n0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0009a f8237b = new C0009a(null);

    /* renamed from: a, reason: collision with root package name */
    public final xv.e f8238a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: aw.a$a, reason: collision with other inner class name */
    public static final class C0009a {
        public C0009a(u uVar) {
        }

        public static final f0 access$combine(C0009a c0009a, f0 f0Var, f0 f0Var2) {
            c0009a.getClass();
            f0.a aVar = new f0.a();
            int size = f0Var.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strName = f0Var.name(i10);
                String strValue = f0Var.value(i10);
                if ((!k0.equals("Warning", strName, true) || !k0.startsWith$default(strValue, "1", false, 2, null)) && (k0.equals("Content-Length", strName, true) || k0.equals("Content-Encoding", strName, true) || k0.equals("Content-Type", strName, true) || !a(strName) || f0Var2.get(strName) == null)) {
                    aVar.addLenient$okhttp(strName, strValue);
                }
            }
            int size2 = f0Var2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strName2 = f0Var2.name(i11);
                if (!k0.equals("Content-Length", strName2, true) && !k0.equals("Content-Encoding", strName2, true) && !k0.equals("Content-Type", strName2, true) && a(strName2)) {
                    aVar.addLenient$okhttp(strName2, f0Var2.value(i11));
                }
            }
            return aVar.build();
        }

        public static boolean a(String str) {
            return (k0.equals(QFzuMMDfrzagDN.bBanIftjjAJOtW, str, true) || k0.equals("Keep-Alive", str, true) || k0.equals("Proxy-Authenticate", str, true) || k0.equals("Proxy-Authorization", str, true) || k0.equals("TE", str, true) || k0.equals("Trailers", str, true) || k0.equals("Transfer-Encoding", str, true) || k0.equals("Upgrade", str, true)) ? false : true;
        }
    }

    public a(xv.e eVar) {
        this.f8238a = eVar;
    }

    public final xv.e getCache$okhttp() {
        return this.f8238a;
    }

    @Override // xv.i0
    public v0 intercept(h0 chain) throws IOException {
        b0 eventListener$okhttp;
        e0.checkNotNullParameter(chain, "chain");
        xv.j jVarCall = chain.call();
        xv.e eVar = this.f8238a;
        v0 v0Var = eVar != null ? eVar.get$okhttp(c.access$requestForCache(chain.request())) : null;
        e eVarCompute = new e.b(System.currentTimeMillis(), chain.request(), v0Var).compute();
        o0 networkRequest = eVarCompute.getNetworkRequest();
        v0 cacheResponse = eVarCompute.getCacheResponse();
        if (eVar != null) {
            eVar.trackResponse$okhttp(eVarCompute);
        }
        q qVar = jVarCall instanceof q ? (q) jVarCall : null;
        if (qVar == null || (eventListener$okhttp = qVar.getEventListener$okhttp()) == null) {
            eventListener$okhttp = b0.f93576a;
        }
        if (v0Var != null && cacheResponse == null) {
            yv.h.closeQuietly(v0Var.body());
        }
        if (networkRequest == null && cacheResponse == null) {
            v0 v0VarBuild = new v0.a().request(chain.request()).protocol(n0.f93760f).code(504).message("Unsatisfiable Request (only-if-cached)").sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener$okhttp.satisfactionFailure(jVarCall, v0VarBuild);
            return v0VarBuild;
        }
        if (networkRequest == null) {
            e0.checkNotNull(cacheResponse);
            v0 v0VarBuild2 = cacheResponse.newBuilder().cacheResponse(yv.c.stripBody(cacheResponse)).build();
            eventListener$okhttp.cacheHit(jVarCall, v0VarBuild2);
            return v0VarBuild2;
        }
        if (cacheResponse != null) {
            eventListener$okhttp.cacheConditionalHit(jVarCall, cacheResponse);
        } else if (eVar != null) {
            eventListener$okhttp.cacheMiss(jVarCall);
        }
        try {
            v0 v0VarProceed = chain.proceed(networkRequest);
            if (v0VarProceed == null && v0Var != null) {
            }
            if (cacheResponse != null) {
                if (v0VarProceed != null && v0VarProceed.code() == 304) {
                    v0 v0VarBuild3 = cacheResponse.newBuilder().headers(C0009a.access$combine(f8237b, cacheResponse.headers(), v0VarProceed.headers())).sentRequestAtMillis(v0VarProceed.sentRequestAtMillis()).receivedResponseAtMillis(v0VarProceed.receivedResponseAtMillis()).cacheResponse(yv.c.stripBody(cacheResponse)).networkResponse(yv.c.stripBody(v0VarProceed)).build();
                    v0VarProceed.body().close();
                    e0.checkNotNull(eVar);
                    eVar.trackConditionalCacheHit$okhttp();
                    eVar.update$okhttp(cacheResponse, v0VarBuild3);
                    eventListener$okhttp.cacheHit(jVarCall, v0VarBuild3);
                    return v0VarBuild3;
                }
                yv.h.closeQuietly(cacheResponse.body());
            }
            e0.checkNotNull(v0VarProceed);
            v0 v0VarBuild4 = v0VarProceed.newBuilder().cacheResponse(cacheResponse != null ? yv.c.stripBody(cacheResponse) : null).networkResponse(yv.c.stripBody(v0VarProceed)).build();
            if (eVar != null) {
                o0 o0VarAccess$requestForCache = c.access$requestForCache(networkRequest);
                if (dw.i.promisesBody(v0VarBuild4) && e.f8243c.isCacheable(v0VarBuild4, o0VarAccess$requestForCache)) {
                    d dVarPut$okhttp = eVar.put$okhttp(v0VarBuild4.newBuilder().request(o0VarAccess$requestForCache).build());
                    if (dVarPut$okhttp != null) {
                        v0VarBuild4 = v0VarBuild4.newBuilder().body(new dw.l(v0.header$default(v0VarBuild4, "Content-Type", null, 2, null), v0VarBuild4.body().contentLength(), pw.h0.buffer(new b(v0VarBuild4.body().source(), dVarPut$okhttp, pw.h0.buffer(dVarPut$okhttp.body()))))).build();
                    }
                    if (cacheResponse != null) {
                        eventListener$okhttp.cacheMiss(jVarCall);
                    }
                    return v0VarBuild4;
                }
                if (dw.j.invalidatesCache(networkRequest.method())) {
                    try {
                        eVar.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return v0VarBuild4;
        } finally {
            if (v0Var != null) {
                yv.h.closeQuietly(v0Var.body());
            }
        }
    }
}
