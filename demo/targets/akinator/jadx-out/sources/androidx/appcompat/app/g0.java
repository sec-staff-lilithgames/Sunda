package androidx.appcompat.app;

import android.view.Menu;
import android.view.MenuItem;
import x3.m2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g0 implements o.b {

    /* renamed from: a, reason: collision with root package name */
    public final o.b f4738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f4739b;

    public g0(t0 t0Var, o.b bVar) {
        this.f4739b = t0Var;
        this.f4738a = bVar;
    }

    @Override // o.b
    public boolean onActionItemClicked(o.c cVar, MenuItem menuItem) {
        return this.f4738a.onActionItemClicked(cVar, menuItem);
    }

    @Override // o.b
    public boolean onCreateActionMode(o.c cVar, Menu menu) {
        return this.f4738a.onCreateActionMode(cVar, menu);
    }

    @Override // o.b
    public void onDestroyActionMode(o.c cVar) {
        this.f4738a.onDestroyActionMode(cVar);
        t0 t0Var = this.f4739b;
        if (t0Var.f4871y != null) {
            t0Var.f4860n.getDecorView().removeCallbacks(t0Var.f4872z);
        }
        if (t0Var.f4870x != null) {
            m2 m2Var = t0Var.A;
            if (m2Var != null) {
                m2Var.cancel();
            }
            m2 m2VarAlpha = z1.animate(t0Var.f4870x).alpha(0.0f);
            t0Var.A = m2VarAlpha;
            m2VarAlpha.setListener(new f0(this));
        }
        p pVar = t0Var.f4862p;
        if (pVar != null) {
            pVar.onSupportActionModeFinished(t0Var.f4869w);
        }
        t0Var.f4869w = null;
        z1.requestApplyInsets(t0Var.D);
        t0Var.z();
    }

    @Override // o.b
    public boolean onPrepareActionMode(o.c cVar, Menu menu) {
        z1.requestApplyInsets(this.f4739b.D);
        return this.f4738a.onPrepareActionMode(cVar, menu);
    }
}
