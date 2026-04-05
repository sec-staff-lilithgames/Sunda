package xr;

import java.util.concurrent.Executor;
import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s7 extends wr.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final wr.j2 f92983a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.j f92984b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f92985c;

    /* renamed from: d, reason: collision with root package name */
    public final wr.k4 f92986d;

    /* renamed from: e, reason: collision with root package name */
    public final wr.u0 f92987e;

    /* renamed from: f, reason: collision with root package name */
    public wr.i f92988f;

    /* renamed from: g, reason: collision with root package name */
    public wr.p f92989g;

    public s7(wr.j2 j2Var, h8 h8Var, Executor executor, wr.k4 k4Var, wr.i iVar) {
        this.f92983a = j2Var;
        this.f92984b = h8Var;
        this.f92986d = k4Var;
        executor = iVar.getExecutor() != null ? iVar.getExecutor() : executor;
        this.f92985c = executor;
        this.f92988f = iVar.withExecutor(executor);
        this.f92987e = wr.u0.current();
    }

    @Override // wr.x4
    public final wr.p a() {
        return this.f92989g;
    }

    @Override // wr.i1, wr.x4, wr.p
    public void cancel(String str, Throwable th2) {
        wr.p pVar = this.f92989g;
        if (pVar != null) {
            pVar.cancel(str, th2);
        }
    }

    @Override // wr.i1, wr.p
    public void start(p.a aVar, wr.e4 e4Var) {
        wr.i iVar = this.f92988f;
        wr.k4 k4Var = this.f92986d;
        wr.i2 i2VarSelectConfig = this.f92983a.selectConfig(new va(k4Var, e4Var, iVar));
        wr.m6 status = i2VarSelectConfig.getStatus();
        if (!status.isOk()) {
            this.f92985c.execute(new r7(this, aVar, c5.replaceInappropriateControlPlaneStatus(status)));
            this.f92989g = u8.f93096s0;
            return;
        }
        wr.q interceptor = i2VarSelectConfig.getInterceptor();
        f9 f9Var = (f9) i2VarSelectConfig.getConfig();
        d9 d9Var = (d9) f9Var.f92508b.get(k4Var.getFullMethodName());
        if (d9Var == null) {
            d9Var = (d9) f9Var.f92509c.get(k4Var.getServiceName());
        }
        if (d9Var == null) {
            d9Var = f9Var.f92507a;
        }
        if (d9Var != null) {
            this.f92988f = this.f92988f.withOption(d9.f92427g, d9Var);
        }
        wr.j jVar = this.f92984b;
        if (interceptor != null) {
            this.f92989g = interceptor.interceptCall(k4Var, this.f92988f, jVar);
        } else {
            this.f92989g = jVar.newCall(k4Var, this.f92988f);
        }
        this.f92989g.start(aVar, e4Var);
    }
}
