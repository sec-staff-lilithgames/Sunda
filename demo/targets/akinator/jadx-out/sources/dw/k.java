package dw;

import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import cw.q;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import xv.h0;
import xv.i0;
import xv.o0;
import xv.p;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f52916a;

    /* renamed from: b, reason: collision with root package name */
    public final List f52917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52918c;

    /* renamed from: d, reason: collision with root package name */
    public final cw.i f52919d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f52920e;

    /* renamed from: f, reason: collision with root package name */
    public final int f52921f;

    /* renamed from: g, reason: collision with root package name */
    public final int f52922g;

    /* renamed from: h, reason: collision with root package name */
    public final int f52923h;

    /* renamed from: i, reason: collision with root package name */
    public int f52924i;

    public k(q call, List<? extends i0> interceptors, int i10, cw.i iVar, o0 request, int i11, int i12, int i13) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(interceptors, "interceptors");
        e0.checkNotNullParameter(request, "request");
        this.f52916a = call;
        this.f52917b = interceptors;
        this.f52918c = i10;
        this.f52919d = iVar;
        this.f52920e = request;
        this.f52921f = i11;
        this.f52922g = i12;
        this.f52923h = i13;
    }

    public static /* synthetic */ k copy$okhttp$default(k kVar, int i10, cw.i iVar, o0 o0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = kVar.f52918c;
        }
        if ((i14 & 2) != 0) {
            iVar = kVar.f52919d;
        }
        if ((i14 & 4) != 0) {
            o0Var = kVar.f52920e;
        }
        if ((i14 & 8) != 0) {
            i11 = kVar.f52921f;
        }
        if ((i14 & 16) != 0) {
            i12 = kVar.f52922g;
        }
        if ((i14 & 32) != 0) {
            i13 = kVar.f52923h;
        }
        int i15 = i12;
        int i16 = i13;
        return kVar.copy$okhttp(i10, iVar, o0Var, i11, i15, i16);
    }

    @Override // xv.h0
    public xv.j call() {
        return this.f52916a;
    }

    @Override // xv.h0
    public int connectTimeoutMillis() {
        return this.f52921f;
    }

    @Override // xv.h0
    public p connection() {
        cw.i iVar = this.f52919d;
        if (iVar != null) {
            return iVar.getConnection$okhttp();
        }
        return null;
    }

    public final k copy$okhttp(int i10, cw.i iVar, o0 request, int i11, int i12, int i13) {
        e0.checkNotNullParameter(request, "request");
        return new k(this.f52916a, this.f52917b, i10, iVar, request, i11, i12, i13);
    }

    public final q getCall$okhttp() {
        return this.f52916a;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.f52921f;
    }

    public final cw.i getExchange$okhttp() {
        return this.f52919d;
    }

    public final int getReadTimeoutMillis$okhttp() {
        return this.f52922g;
    }

    public final o0 getRequest$okhttp() {
        return this.f52920e;
    }

    public final int getWriteTimeoutMillis$okhttp() {
        return this.f52923h;
    }

    @Override // xv.h0
    public int readTimeoutMillis() {
        return this.f52922g;
    }

    @Override // xv.h0
    public o0 request() {
        return this.f52920e;
    }

    @Override // xv.h0
    public h0 withConnectTimeout(int i10, TimeUnit unit) {
        e0.checkNotNullParameter(unit, "unit");
        if (this.f52919d == null) {
            return copy$okhttp$default(this, 0, null, null, yv.i.checkDuration("connectTimeout", i10, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // xv.h0
    public h0 withReadTimeout(int i10, TimeUnit unit) {
        e0.checkNotNullParameter(unit, "unit");
        if (this.f52919d == null) {
            return copy$okhttp$default(this, 0, null, null, 0, yv.i.checkDuration("readTimeout", i10, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // xv.h0
    public h0 withWriteTimeout(int i10, TimeUnit unit) {
        e0.checkNotNullParameter(unit, "unit");
        if (this.f52919d == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, yv.i.checkDuration("writeTimeout", i10, unit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // xv.h0
    public int writeTimeoutMillis() {
        return this.f52923h;
    }

    @Override // xv.h0
    public v0 proceed(o0 request) throws IOException {
        e0.checkNotNullParameter(request, "request");
        List list = this.f52917b;
        int size = list.size();
        int i10 = this.f52918c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f52924i++;
        cw.i iVar = this.f52919d;
        if (iVar != null) {
            if (!iVar.getFinder$okhttp().getRoutePlanner().sameHostAndPort(request.url())) {
                throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f52924i != 1) {
                throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        k kVarCopy$okhttp$default = copy$okhttp$default(this, i11, null, request, 0, 0, 0, 58, null);
        i0 i0Var = (i0) list.get(i10);
        v0 v0VarIntercept = i0Var.intercept(kVarCopy$okhttp$default);
        if (v0VarIntercept == null) {
            throw new NullPointerException("interceptor " + i0Var + PcrIk.axOfoQEjdXHkm);
        }
        if (iVar == null || i11 >= list.size() || kVarCopy$okhttp$default.f52924i == 1) {
            return v0VarIntercept;
        }
        throw new IllegalStateException(("network interceptor " + i0Var + " must call proceed() exactly once").toString());
    }
}
