package b7;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements p7.f {
    @Override // p7.f
    public Drawable getDrawable() {
        return null;
    }

    @Override // p7.f
    public /* bridge */ /* synthetic */ View getView() {
        return (View) m140getView();
    }

    @Override // p7.f, n7.d
    public void onError(Drawable drawable) {
        p7.e.onError(this, drawable);
    }

    @Override // p7.f, n7.d
    public void onStart(Drawable drawable) {
        p7.e.onStart(this, drawable);
    }

    @Override // p7.f, n7.d
    public void onSuccess(Drawable drawable) {
        p7.e.onSuccess(this, drawable);
    }

    /* renamed from: getView, reason: collision with other method in class */
    public Void m140getView() {
        throw new UnsupportedOperationException();
    }
}
