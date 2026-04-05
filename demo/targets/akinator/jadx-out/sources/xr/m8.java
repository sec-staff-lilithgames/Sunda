package xr;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p8 f92792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q8 f92793c;

    public m8(q8 q8Var, p8 p8Var) {
        this.f92793c = q8Var;
        this.f92792b = p8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        q8 q8Var = this.f92793c;
        u8 u8Var = q8Var.f92927d;
        Object obj = q8Var.f92924a.get();
        a7 a7Var = u8.f93095r0;
        p8 p8Var = this.f92792b;
        if (obj != a7Var) {
            p8Var.d();
            return;
        }
        if (u8Var.I == null) {
            u8Var.I = new LinkedHashSet();
            u8Var.f93112h0.updateObjectInUse(u8Var.J, true);
        }
        u8Var.I.add(p8Var);
    }
}
