package ln;

import java.util.Map;
import mh.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements u {

    /* renamed from: b, reason: collision with root package name */
    public g0 f73502b;

    /* renamed from: c, reason: collision with root package name */
    public q1 f73503c;

    /* renamed from: d, reason: collision with root package name */
    public String f73504d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f73507g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f73508h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f73509i;

    /* renamed from: a, reason: collision with root package name */
    public final y f73501a = new y();

    /* renamed from: e, reason: collision with root package name */
    public int f73505e = 8000;

    /* renamed from: f, reason: collision with root package name */
    public int f73506f = 8000;

    public o setAllowCrossProtocolRedirects(boolean z10) {
        this.f73507g = z10;
        return this;
    }

    public o setConnectTimeoutMs(int i10) {
        this.f73505e = i10;
        return this;
    }

    public o setContentTypePredicate(q1 q1Var) {
        this.f73503c = q1Var;
        return this;
    }

    public o setCrossProtocolRedirectsForceOriginal(boolean z10) {
        this.f73508h = z10;
        return this;
    }

    @Override // ln.u
    public /* bridge */ /* synthetic */ u setDefaultRequestProperties(Map map) {
        return setDefaultRequestProperties((Map<String, String>) map);
    }

    public o setKeepPostFor302Redirects(boolean z10) {
        this.f73509i = z10;
        return this;
    }

    public o setReadTimeoutMs(int i10) {
        this.f73506f = i10;
        return this;
    }

    public o setTransferListener(g0 g0Var) {
        this.f73502b = g0Var;
        return this;
    }

    public o setUserAgent(String str) {
        this.f73504d = str;
        return this;
    }

    @Override // ln.u
    public o setDefaultRequestProperties(Map<String, String> map) {
        this.f73501a.clearAndSet(map);
        return this;
    }

    @Override // ln.u, ln.h
    public r createDataSource() {
        r rVar = new r(this.f73504d, this.f73505e, this.f73506f, this.f73507g, this.f73508h, this.f73501a, this.f73503c, this.f73509i);
        g0 g0Var = this.f73502b;
        if (g0Var != null) {
            rVar.addTransferListener(g0Var);
        }
        return rVar;
    }
}
