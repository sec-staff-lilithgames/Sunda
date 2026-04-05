package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class F extends kotlin.jvm.internal.a0 implements kv.a {
    public F(J j10) {
        super(0, j10, J.class, "calculateMetrics", "calculateMetrics()V", 0);
    }

    @Override // kv.a
    public final Object invoke() {
        J j10 = (J) this.receiver;
        j10.getClass();
        j10.f31896n = C2925od.m();
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        D runnable = j10.f31895m;
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.removeCallbacks(runnable);
        executorC3020u7.f33447a.postAtFrontOfQueue(runnable);
        return tu.x0.f87415a;
    }
}
