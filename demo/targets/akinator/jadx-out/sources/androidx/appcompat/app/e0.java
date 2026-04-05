package androidx.appcompat.app;

import android.view.Window;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 implements p.z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f4726b;

    public e0(t0 t0Var) {
        this.f4726b = t0Var;
    }

    @Override // p.z
    public void onCloseMenu(p.m mVar, boolean z10) {
        this.f4726b.j(mVar);
    }

    @Override // p.z
    public boolean onOpenSubMenu(p.m mVar) {
        Window.Callback callback = this.f4726b.f4860n.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }
}
