package bu;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m5 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.b0 f10641b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10642c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10643e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f10644f;

    public m5(mt.b0 b0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f10641b = b0Var;
        this.f10642c = j10;
        this.f10643e = timeUnit;
        this.f10644f = m0Var;
    }

    @Override // java.util.concurrent.Callable
    public ju.a call() {
        return this.f10641b.replay(this.f10642c, this.f10643e, this.f10644f);
    }
}
