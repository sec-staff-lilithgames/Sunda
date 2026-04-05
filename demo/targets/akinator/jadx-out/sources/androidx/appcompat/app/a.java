package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public abstract CharSequence getContentDescription();

        public abstract View getCustomView();

        public abstract Drawable getIcon();

        public abstract int getPosition();

        public abstract Object getTag();

        public abstract CharSequence getText();

        public abstract void select();

        public abstract b setContentDescription(int i10);

        public abstract b setContentDescription(CharSequence charSequence);

        public abstract b setCustomView(int i10);

        public abstract b setCustomView(View view);

        public abstract b setIcon(int i10);

        public abstract b setIcon(Drawable drawable);

        public abstract b setTabListener(d dVar);

        public abstract b setTag(Object obj);

        public abstract b setText(int i10);

        public abstract b setText(CharSequence charSequence);
    }

    public abstract void addOnMenuVisibilityListener(androidx.appcompat.app.b bVar);

    @Deprecated
    public abstract void addTab(b bVar);

    @Deprecated
    public abstract void addTab(b bVar, int i10);

    @Deprecated
    public abstract void addTab(b bVar, int i10, boolean z10);

    @Deprecated
    public abstract void addTab(b bVar, boolean z10);

    public boolean closeOptionsMenu() {
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    public abstract View getCustomView();

    public abstract int getDisplayOptions();

    public float getElevation() {
        return 0.0f;
    }

    public abstract int getHeight();

    public int getHideOffset() {
        return 0;
    }

    @Deprecated
    public abstract int getNavigationItemCount();

    @Deprecated
    public abstract int getNavigationMode();

    @Deprecated
    public abstract int getSelectedNavigationIndex();

    @Deprecated
    public abstract b getSelectedTab();

    public abstract CharSequence getSubtitle();

    @Deprecated
    public abstract b getTabAt(int i10);

    @Deprecated
    public abstract int getTabCount();

    public Context getThemedContext() {
        return null;
    }

    public abstract CharSequence getTitle();

    public abstract void hide();

    public boolean invalidateOptionsMenu() {
        return false;
    }

    public boolean isHideOnContentScrollEnabled() {
        return false;
    }

    public abstract boolean isShowing();

    public boolean isTitleTruncated() {
        return false;
    }

    @Deprecated
    public abstract b newTab();

    public boolean onKeyShortcut(int i10, KeyEvent keyEvent) {
        return false;
    }

    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean openOptionsMenu() {
        return false;
    }

    @Deprecated
    public abstract void removeAllTabs();

    public abstract void removeOnMenuVisibilityListener(androidx.appcompat.app.b bVar);

    @Deprecated
    public abstract void removeTab(b bVar);

    @Deprecated
    public abstract void removeTabAt(int i10);

    @Deprecated
    public abstract void selectTab(b bVar);

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCustomView(int i10);

    public abstract void setCustomView(View view);

    public abstract void setCustomView(View view, C0002a c0002a);

    public abstract void setDisplayHomeAsUpEnabled(boolean z10);

    public abstract void setDisplayOptions(int i10);

    public abstract void setDisplayOptions(int i10, int i11);

    public abstract void setDisplayShowCustomEnabled(boolean z10);

    public abstract void setDisplayShowHomeEnabled(boolean z10);

    public abstract void setDisplayShowTitleEnabled(boolean z10);

    public abstract void setDisplayUseLogoEnabled(boolean z10);

    public void setElevation(float f10) {
        if (f10 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void setHideOffset(int i10) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public void setHomeActionContentDescription(int i10) {
    }

    public void setHomeAsUpIndicator(int i10) {
    }

    public abstract void setIcon(int i10);

    public abstract void setIcon(Drawable drawable);

    @Deprecated
    public abstract void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, c cVar);

    public abstract void setLogo(int i10);

    public abstract void setLogo(Drawable drawable);

    @Deprecated
    public abstract void setNavigationMode(int i10);

    @Deprecated
    public abstract void setSelectedNavigationItem(int i10);

    public abstract void setSubtitle(int i10);

    public abstract void setSubtitle(CharSequence charSequence);

    public abstract void setTitle(int i10);

    public abstract void setTitle(CharSequence charSequence);

    public abstract void show();

    public o.c startActionMode(o.b bVar) {
        return null;
    }

    public void setHomeActionContentDescription(CharSequence charSequence) {
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0002a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f4717a;

        public C0002a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4717a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f69978b);
            this.f4717a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0002a(int i10, int i11) {
            super(i10, i11);
            this.f4717a = 8388627;
        }

        public C0002a(int i10, int i11, int i12) {
            super(i10, i11);
            this.f4717a = i12;
        }

        public C0002a(int i10) {
            this(-2, -1, i10);
        }

        public C0002a(C0002a c0002a) {
            super((ViewGroup.MarginLayoutParams) c0002a);
            this.f4717a = 0;
            this.f4717a = c0002a.f4717a;
        }

        public C0002a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4717a = 0;
        }
    }

    public void a() {
    }

    public void dispatchMenuVisibilityChanged(boolean z10) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void setDefaultDisplayHomeAsUpEnabled(boolean z10) {
    }

    public void setHomeButtonEnabled(boolean z10) {
    }

    public void setShowHideAnimationEnabled(boolean z10) {
    }

    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    public void setStackedBackgroundDrawable(Drawable drawable) {
    }

    public void setWindowTitle(CharSequence charSequence) {
    }
}
