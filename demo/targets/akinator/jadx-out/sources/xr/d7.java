package xr;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f92422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wr.f0 f92423c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u8 f92424e;

    public d7(u8 u8Var, Runnable runnable, wr.f0 f0Var) {
        this.f92424e = u8Var;
        this.f92422b = runnable;
        this.f92423c = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        u8 u8Var = this.f92424e;
        bu.s0 s0Var = u8Var.f93131x;
        Runnable runnable = this.f92422b;
        Executor executor = u8Var.f93119l;
        wr.f0 f0Var = this.f92423c;
        s0Var.getClass();
        mh.p1.checkNotNull(runnable, "callback");
        mh.p1.checkNotNull(executor, "executor");
        mh.p1.checkNotNull(f0Var, "source");
        b2 b2Var = new b2(runnable, executor);
        if (((wr.f0) s0Var.f10942b) != f0Var) {
            executor.execute(runnable);
        } else {
            ((ArrayList) s0Var.f10941a).add(b2Var);
        }
    }
}
