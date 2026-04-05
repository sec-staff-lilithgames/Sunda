package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i0 extends m implements SubMenu {
    public final m B;
    public final q C;

    public i0(Context context, m mVar, q qVar) {
        super(context);
        this.B = mVar;
        this.C = qVar;
    }

    @Override // p.m
    public final boolean b(m mVar, q qVar) {
        return super.b(mVar, qVar) || this.B.b(mVar, qVar);
    }

    @Override // p.m
    public boolean collapseItemActionView(q qVar) {
        return this.B.collapseItemActionView(qVar);
    }

    @Override // p.m
    public boolean expandItemActionView(q qVar) {
        return this.B.expandItemActionView(qVar);
    }

    @Override // p.m
    public String getActionViewStatesKey() {
        q qVar = this.C;
        int itemId = qVar != null ? qVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return a.b.e(itemId, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    public Menu getParentMenu() {
        return this.B;
    }

    @Override // p.m
    public m getRootMenu() {
        return this.B.getRootMenu();
    }

    @Override // p.m
    public boolean isGroupDividerEnabled() {
        return this.B.isGroupDividerEnabled();
    }

    @Override // p.m
    public boolean isQwertyMode() {
        return this.B.isQwertyMode();
    }

    @Override // p.m
    public boolean isShortcutsVisible() {
        return this.B.isShortcutsVisible();
    }

    @Override // p.m
    public void setCallback(k kVar) {
        this.B.setCallback(kVar);
    }

    @Override // p.m, q3.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        f(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        f(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        f(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    @Override // p.m, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.B.setQwertyMode(z10);
    }

    @Override // p.m
    public void setShortcutsVisible(boolean z10) {
        this.B.setShortcutsVisible(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        f(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        f(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.C.setIcon(i10);
        return this;
    }
}
