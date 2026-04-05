package xr;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p8 f92849b;

    public o8(p8 p8Var) {
        this.f92849b = p8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p8 p8Var = this.f92849b;
        q8 q8Var = p8Var.f92880p;
        q8 q8Var2 = p8Var.f92880p;
        LinkedHashSet linkedHashSet = q8Var.f92927d.I;
        if (linkedHashSet != null) {
            linkedHashSet.remove(p8Var);
            if (q8Var2.f92927d.I.isEmpty()) {
                u8 u8Var = q8Var2.f92927d;
                u8Var.f93112h0.updateObjectInUse(u8Var.J, false);
                u8 u8Var2 = q8Var2.f92927d;
                u8Var2.I = null;
                if (u8Var2.N.get()) {
                    q8Var2.f92927d.M.a(u8.f93092o0);
                }
            }
        }
    }
}
