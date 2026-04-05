package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f1 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.s f4729a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f4730b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f4731c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4732d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4733e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4734f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4735g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final a1 f4736h = new a1(this);

    public f1(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b1 b1Var = new b1(this);
        w3.i.checkNotNull(toolbar);
        androidx.appcompat.widget.s sVar = new androidx.appcompat.widget.s(toolbar, false);
        this.f4729a = sVar;
        this.f4730b = (Window.Callback) w3.i.checkNotNull(callback);
        sVar.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(b1Var);
        sVar.setWindowTitle(charSequence);
        this.f4731c = new e1(this);
    }

    @Override // androidx.appcompat.app.a
    public final void a() {
        this.f4729a.getViewGroup().removeCallbacks(this.f4736h);
    }

    @Override // androidx.appcompat.app.a
    public void addOnMenuVisibilityListener(b bVar) {
        this.f4735g.add(bVar);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.b bVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public boolean closeOptionsMenu() {
        return this.f4729a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.a
    public boolean collapseActionView() {
        androidx.appcompat.widget.s sVar = this.f4729a;
        if (!sVar.hasExpandedActionView()) {
            return false;
        }
        sVar.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void dispatchMenuVisibilityChanged(boolean z10) {
        if (z10 == this.f4734f) {
            return;
        }
        this.f4734f = z10;
        ArrayList arrayList = this.f4735g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // androidx.appcompat.app.a
    public View getCustomView() {
        return this.f4729a.getCustomView();
    }

    @Override // androidx.appcompat.app.a
    public int getDisplayOptions() {
        return this.f4729a.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.a
    public float getElevation() {
        return z1.getElevation(this.f4729a.getViewGroup());
    }

    @Override // androidx.appcompat.app.a
    public int getHeight() {
        return this.f4729a.getHeight();
    }

    @Override // androidx.appcompat.app.a
    public int getNavigationItemCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public int getNavigationMode() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public int getSelectedNavigationIndex() {
        return -1;
    }

    @Override // androidx.appcompat.app.a
    public a.b getSelectedTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public CharSequence getSubtitle() {
        return this.f4729a.getSubtitle();
    }

    @Override // androidx.appcompat.app.a
    public a.b getTabAt(int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public int getTabCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public Context getThemedContext() {
        return this.f4729a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public CharSequence getTitle() {
        return this.f4729a.getTitle();
    }

    @Override // androidx.appcompat.app.a
    public void hide() {
        this.f4729a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean invalidateOptionsMenu() {
        androidx.appcompat.widget.s sVar = this.f4729a;
        ViewGroup viewGroup = sVar.getViewGroup();
        a1 a1Var = this.f4736h;
        viewGroup.removeCallbacks(a1Var);
        z1.postOnAnimation(sVar.getViewGroup(), a1Var);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean isShowing() {
        return this.f4729a.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.a
    public boolean isTitleTruncated() {
        return super.isTitleTruncated();
    }

    @Override // androidx.appcompat.app.a
    public a.b newTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.appcompat.app.a
    public boolean onKeyShortcut(int i10, KeyEvent keyEvent) {
        boolean z10 = this.f4733e;
        androidx.appcompat.widget.s sVar = this.f4729a;
        if (!z10) {
            sVar.setMenuCallbacks(new c1(this), new d1(this));
            this.f4733e = true;
        }
        Menu menu = sVar.getMenu();
        if (menu == null) {
            return false;
        }
        menu.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean openOptionsMenu() {
        return this.f4729a.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.a
    public void removeAllTabs() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void removeOnMenuVisibilityListener(b bVar) {
        this.f4735g.remove(bVar);
    }

    @Override // androidx.appcompat.app.a
    public void removeTab(a.b bVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void removeTabAt(int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public boolean requestFocus() {
        ViewGroup viewGroup = this.f4729a.getViewGroup();
        if (viewGroup == null || viewGroup.hasFocus()) {
            return false;
        }
        viewGroup.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void selectTab(a.b bVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void setBackgroundDrawable(Drawable drawable) {
        this.f4729a.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(View view) {
        setCustomView(view, new a.C0002a(-2, -2));
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayHomeAsUpEnabled(boolean z10) {
        setDisplayOptions(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayOptions(int i10) {
        setDisplayOptions(i10, -1);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowCustomEnabled(boolean z10) {
        setDisplayOptions(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowHomeEnabled(boolean z10) {
        setDisplayOptions(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowTitleEnabled(boolean z10) {
        setDisplayOptions(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayUseLogoEnabled(boolean z10) {
        setDisplayOptions(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.a
    public void setElevation(float f10) {
        z1.setElevation(this.f4729a.getViewGroup(), f10);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.f4729a.setNavigationContentDescription(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.f4729a.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setIcon(int i10) {
        this.f4729a.setIcon(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, c cVar) {
        this.f4729a.setDropdownParams(spinnerAdapter, new z0(cVar));
    }

    @Override // androidx.appcompat.app.a
    public void setLogo(int i10) {
        this.f4729a.setLogo(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setNavigationMode(int i10) {
        if (i10 == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f4729a.setNavigationMode(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setSelectedNavigationItem(int i10) {
        androidx.appcompat.widget.s sVar = this.f4729a;
        if (sVar.getNavigationMode() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        sVar.setDropdownSelectedPosition(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setSubtitle(CharSequence charSequence) {
        this.f4729a.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void setTitle(CharSequence charSequence) {
        this.f4729a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void setWindowTitle(CharSequence charSequence) {
        this.f4729a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void show() {
        this.f4729a.setVisibility(0);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.b bVar, boolean z10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(View view, a.C0002a c0002a) {
        if (view != null) {
            view.setLayoutParams(c0002a);
        }
        this.f4729a.setCustomView(view);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayOptions(int i10, int i11) {
        androidx.appcompat.widget.s sVar = this.f4729a;
        sVar.setDisplayOptions((i10 & i11) | ((~i11) & sVar.getDisplayOptions()));
    }

    @Override // androidx.appcompat.app.a
    public void setHomeActionContentDescription(int i10) {
        this.f4729a.setNavigationContentDescription(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeAsUpIndicator(int i10) {
        this.f4729a.setNavigationIcon(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setIcon(Drawable drawable) {
        this.f4729a.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setLogo(Drawable drawable) {
        this.f4729a.setLogo(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setSubtitle(int i10) {
        androidx.appcompat.widget.s sVar = this.f4729a;
        sVar.setSubtitle(i10 != 0 ? sVar.getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.app.a
    public void setTitle(int i10) {
        androidx.appcompat.widget.s sVar = this.f4729a;
        sVar.setTitle(i10 != 0 ? sVar.getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.b bVar, int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.b bVar, int i10, boolean z10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(int i10) {
        androidx.appcompat.widget.s sVar = this.f4729a;
        setCustomView(LayoutInflater.from(sVar.getContext()).inflate(i10, sVar.getViewGroup(), false));
    }

    @Override // androidx.appcompat.app.a
    public void setDefaultDisplayHomeAsUpEnabled(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void setHomeButtonEnabled(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void setShowHideAnimationEnabled(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public void setStackedBackgroundDrawable(Drawable drawable) {
    }
}
