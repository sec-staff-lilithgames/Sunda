package androidx.appcompat.app;

import android.view.Window;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 implements p.z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f4840b;

    public s0(t0 t0Var) {
        this.f4840b = t0Var;
    }

    @Override // p.z
    public void onCloseMenu(p.m mVar, boolean z10) {
        r0 r0Var;
        p.m rootMenu = mVar.getRootMenu();
        int i10 = 0;
        boolean z11 = rootMenu != mVar;
        if (z11) {
            mVar = rootMenu;
        }
        t0 t0Var = this.f4840b;
        r0[] r0VarArr = t0Var.O;
        int length = r0VarArr != null ? r0VarArr.length : 0;
        while (true) {
            if (i10 < length) {
                r0Var = r0VarArr[i10];
                if (r0Var != null && r0Var.f4831h == mVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                r0Var = null;
                break;
            }
        }
        if (r0Var != null) {
            if (!z11) {
                t0Var.k(r0Var, z10);
            } else {
                t0Var.i(r0Var.f4824a, r0Var, rootMenu);
                t0Var.k(r0Var, true);
            }
        }
    }

    @Override // p.z
    public boolean onOpenSubMenu(p.m mVar) {
        Window.Callback callback;
        if (mVar != mVar.getRootMenu()) {
            return true;
        }
        t0 t0Var = this.f4840b;
        if (!t0Var.I || (callback = t0Var.f4860n.getCallback()) == null || t0Var.T) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }
}
