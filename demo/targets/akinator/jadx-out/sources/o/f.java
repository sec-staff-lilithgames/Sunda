package o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p.i0;
import p.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f extends c implements p.k {

    /* renamed from: e, reason: collision with root package name */
    public final Context f77228e;

    /* renamed from: f, reason: collision with root package name */
    public final ActionBarContextView f77229f;

    /* renamed from: g, reason: collision with root package name */
    public final b f77230g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference f77231h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f77232i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f77233j;

    /* renamed from: k, reason: collision with root package name */
    public final p.m f77234k;

    public f(Context context, ActionBarContextView actionBarContextView, b bVar, boolean z10) {
        this.f77228e = context;
        this.f77229f = actionBarContextView;
        this.f77230g = bVar;
        p.m defaultShowAsAction = new p.m(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f77234k = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f77233j = z10;
    }

    @Override // o.c
    public void finish() {
        if (this.f77232i) {
            return;
        }
        this.f77232i = true;
        this.f77230g.onDestroyActionMode(this);
    }

    @Override // o.c
    public View getCustomView() {
        WeakReference weakReference = this.f77231h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.c
    public Menu getMenu() {
        return this.f77234k;
    }

    @Override // o.c
    public MenuInflater getMenuInflater() {
        return new h(this.f77229f.getContext());
    }

    @Override // o.c
    public CharSequence getSubtitle() {
        return this.f77229f.getSubtitle();
    }

    @Override // o.c
    public CharSequence getTitle() {
        return this.f77229f.getTitle();
    }

    @Override // o.c
    public void invalidate() {
        this.f77230g.onPrepareActionMode(this, this.f77234k);
    }

    @Override // o.c
    public boolean isTitleOptional() {
        return this.f77229f.isTitleOptional();
    }

    @Override // o.c
    public boolean isUiFocusable() {
        return this.f77233j;
    }

    @Override // p.k
    public boolean onMenuItemSelected(p.m mVar, MenuItem menuItem) {
        return this.f77230g.onActionItemClicked(this, menuItem);
    }

    @Override // p.k
    public void onMenuModeChange(p.m mVar) {
        invalidate();
        this.f77229f.showOverflowMenu();
    }

    public boolean onSubMenuSelected(i0 i0Var) {
        if (!i0Var.hasVisibleItems()) {
            return true;
        }
        new y(this.f77229f.getContext(), i0Var).show();
        return true;
    }

    @Override // o.c
    public void setCustomView(View view) {
        this.f77229f.setCustomView(view);
        this.f77231h = view != null ? new WeakReference(view) : null;
    }

    @Override // o.c
    public void setSubtitle(CharSequence charSequence) {
        this.f77229f.setSubtitle(charSequence);
    }

    @Override // o.c
    public void setTitle(CharSequence charSequence) {
        this.f77229f.setTitle(charSequence);
    }

    @Override // o.c
    public void setTitleOptionalHint(boolean z10) {
        super.setTitleOptionalHint(z10);
        this.f77229f.setTitleOptional(z10);
    }

    @Override // o.c
    public void setSubtitle(int i10) {
        setSubtitle(this.f77228e.getString(i10));
    }

    @Override // o.c
    public void setTitle(int i10) {
        setTitle(this.f77228e.getString(i10));
    }

    public void onCloseSubMenu(i0 i0Var) {
    }

    public void onCloseMenu(p.m mVar, boolean z10) {
    }
}
