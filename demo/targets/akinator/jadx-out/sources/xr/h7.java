package xr;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8 f92586b;

    public h7(u8 u8Var) {
        this.f92586b = u8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        u8 u8Var = this.f92586b;
        if (u8Var.N.get()) {
            return;
        }
        if (u8Var.D) {
            u8Var.g();
        }
        Iterator it = u8Var.H.iterator();
        while (it.hasNext()) {
            i6 i6Var = (i6) it.next();
            i6Var.f92620m.execute(new r5(i6Var));
        }
        Iterator it2 = u8Var.K.iterator();
        while (it2.hasNext()) {
            ((ea) it2.next()).resetConnectBackoff();
        }
    }
}
