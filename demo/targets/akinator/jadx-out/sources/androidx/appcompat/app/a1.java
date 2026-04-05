package androidx.appcompat.app;

import android.view.Menu;
import android.view.Window;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f4719b;

    public a1(f1 f1Var) {
        this.f4719b = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        f1 f1Var = this.f4719b;
        Window.Callback callback = f1Var.f4730b;
        androidx.appcompat.widget.s sVar = f1Var.f4729a;
        if (!f1Var.f4733e) {
            sVar.setMenuCallbacks(new c1(f1Var), new d1(f1Var));
            f1Var.f4733e = true;
        }
        Menu menu = sVar.getMenu();
        p.m mVar = menu instanceof p.m ? (p.m) menu : null;
        if (mVar != null) {
            mVar.stopDispatchingItemsChanged();
        }
        try {
            menu.clear();
            if (!callback.onCreatePanelMenu(0, menu) || !callback.onPreparePanel(0, null, menu)) {
                menu.clear();
            }
            if (mVar != null) {
                mVar.startDispatchingItemsChanged();
            }
        } catch (Throwable th2) {
            if (mVar != null) {
                mVar.startDispatchingItemsChanged();
            }
            throw th2;
        }
    }
}
