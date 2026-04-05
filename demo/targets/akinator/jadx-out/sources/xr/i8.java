package xr;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8 f92635b;

    public i8(q8 q8Var) {
        this.f92635b = q8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        q8 q8Var = this.f92635b;
        u8 u8Var = q8Var.f92927d;
        AtomicReference atomicReference = q8Var.f92924a;
        if (u8Var.I == null) {
            if (atomicReference.get() == u8.f93095r0) {
                atomicReference.set(null);
            }
            q8Var.f92927d.M.a(u8.f93092o0);
        }
    }
}
