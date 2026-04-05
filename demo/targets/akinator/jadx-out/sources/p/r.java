package p;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends x3.e implements ActionProvider.VisibilityListener {

    /* renamed from: d, reason: collision with root package name */
    public x3.d f80112d;

    /* renamed from: e, reason: collision with root package name */
    public final ActionProvider f80113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f80114f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, Context context, ActionProvider actionProvider) {
        super(context);
        this.f80114f = vVar;
        this.f80113e = actionProvider;
    }

    @Override // x3.e
    public boolean hasSubMenu() {
        return this.f80113e.hasSubMenu();
    }

    @Override // x3.e
    public boolean isVisible() {
        return this.f80113e.isVisible();
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public void onActionProviderVisibilityChanged(boolean z10) {
        x3.d dVar = this.f80112d;
        if (dVar != null) {
            ((p) dVar).onActionProviderVisibilityChanged(z10);
        }
    }

    @Override // x3.e
    public View onCreateActionView(MenuItem menuItem) {
        return this.f80113e.onCreateActionView(menuItem);
    }

    @Override // x3.e
    public boolean onPerformDefaultAction() {
        return this.f80113e.onPerformDefaultAction();
    }

    @Override // x3.e
    public void onPrepareSubMenu(SubMenu subMenu) {
        this.f80114f.getClass();
        this.f80113e.onPrepareSubMenu(subMenu);
    }

    @Override // x3.e
    public boolean overridesItemVisibility() {
        return this.f80113e.overridesItemVisibility();
    }

    @Override // x3.e
    public void refreshVisibility() {
        this.f80113e.refreshVisibility();
    }

    @Override // x3.e
    public void setVisibilityListener(x3.d dVar) {
        this.f80112d = dVar;
        this.f80113e.setVisibilityListener(dVar != null ? this : null);
    }

    @Override // x3.e
    public View onCreateActionView() {
        return this.f80113e.onCreateActionView();
    }
}
