package o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: b, reason: collision with root package name */
    public Object f77220b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f77221c;

    public abstract void finish();

    public abstract View getCustomView();

    public abstract Menu getMenu();

    public abstract MenuInflater getMenuInflater();

    public abstract CharSequence getSubtitle();

    public Object getTag() {
        return this.f77220b;
    }

    public abstract CharSequence getTitle();

    public boolean getTitleOptionalHint() {
        return this.f77221c;
    }

    public abstract void invalidate();

    public boolean isTitleOptional() {
        return false;
    }

    public boolean isUiFocusable() {
        return true;
    }

    public abstract void setCustomView(View view);

    public abstract void setSubtitle(int i10);

    public abstract void setSubtitle(CharSequence charSequence);

    public void setTag(Object obj) {
        this.f77220b = obj;
    }

    public abstract void setTitle(int i10);

    public abstract void setTitle(CharSequence charSequence);

    public void setTitleOptionalHint(boolean z10) {
        this.f77221c = z10;
    }
}
