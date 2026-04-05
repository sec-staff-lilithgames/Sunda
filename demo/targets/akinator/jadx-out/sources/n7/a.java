package n7;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.b1;
import androidx.lifecycle.r;
import p7.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a implements e, f, r {

    /* renamed from: b, reason: collision with root package name */
    public boolean f75821b;

    public final void a() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f75821b) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void b(Drawable drawable) {
        Object drawable2 = getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        setDrawable(drawable);
        a();
    }

    @Override // p7.f
    public abstract Drawable getDrawable();

    @Override // n7.e, p7.f
    public abstract /* synthetic */ View getView();

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onCreate(b1 b1Var) {
        super.onCreate(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onDestroy(b1 b1Var) {
        super.onDestroy(b1Var);
    }

    @Override // n7.e, n7.d
    public void onError(Drawable drawable) {
        b(drawable);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onPause(b1 b1Var) {
        super.onPause(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onResume(b1 b1Var) {
        super.onResume(b1Var);
    }

    @Override // n7.e, n7.d
    public void onStart(Drawable drawable) {
        b(drawable);
    }

    @Override // androidx.lifecycle.r
    public void onStop(b1 b1Var) {
        this.f75821b = false;
        a();
    }

    @Override // n7.e, n7.d
    public void onSuccess(Drawable drawable) {
        b(drawable);
    }

    public abstract void setDrawable(Drawable drawable);

    @Override // androidx.lifecycle.r
    public void onStart(b1 b1Var) {
        this.f75821b = true;
        a();
    }
}
