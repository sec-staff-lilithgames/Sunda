package androidx.appcompat.app;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f4727a;

    public e1(f1 f1Var) {
        this.f4727a = f1Var;
    }

    @Override // androidx.appcompat.app.d0
    public View onCreatePanelView(int i10) {
        if (i10 == 0) {
            return new View(this.f4727a.f4729a.getContext());
        }
        return null;
    }

    @Override // androidx.appcompat.app.d0
    public boolean onPreparePanel(int i10) {
        if (i10 != 0) {
            return false;
        }
        f1 f1Var = this.f4727a;
        if (f1Var.f4732d) {
            return false;
        }
        f1Var.f4729a.setMenuPrepared();
        f1Var.f4732d = true;
        return false;
    }
}
