package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.digidust.elokence.akinator.freemium.R;
import java.lang.reflect.InvocationTargetException;
import q.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f4722a;

    public c0(t0 t0Var) {
        this.f4722a = t0Var;
    }

    @Override // androidx.appcompat.app.e
    public Context getActionBarThemedContext() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t0 t0Var = this.f4722a;
        a supportActionBar = t0Var.getSupportActionBar();
        Context themedContext = supportActionBar != null ? supportActionBar.getThemedContext() : null;
        return themedContext == null ? t0Var.f4859m : themedContext;
    }

    @Override // androidx.appcompat.app.e
    public Drawable getThemeUpIndicator() {
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(getActionBarThemedContext(), (AttributeSet) null, new int[]{R.attr.homeAsUpIndicator});
        Drawable drawable = n3VarObtainStyledAttributes.getDrawable(0);
        n3VarObtainStyledAttributes.recycle();
        return drawable;
    }

    @Override // androidx.appcompat.app.e
    public boolean isNavigationVisible() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a supportActionBar = this.f4722a.getSupportActionBar();
        return (supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) ? false : true;
    }

    @Override // androidx.appcompat.app.e
    public void setActionBarDescription(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a supportActionBar = this.f4722a.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setHomeActionContentDescription(i10);
        }
    }

    @Override // androidx.appcompat.app.e
    public void setActionBarUpIndicator(Drawable drawable, int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a supportActionBar = this.f4722a.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setHomeAsUpIndicator(drawable);
            supportActionBar.setHomeActionContentDescription(i10);
        }
    }
}
