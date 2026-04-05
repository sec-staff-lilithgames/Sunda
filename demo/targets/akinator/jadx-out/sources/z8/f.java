package z8;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j9.q;
import p8.r0;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class f implements v0, r0 {

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f97696b;

    public f(Drawable drawable) {
        this.f97696b = (Drawable) q.checkNotNull(drawable);
    }

    @Override // p8.v0
    public abstract /* synthetic */ Class getResourceClass();

    @Override // p8.v0
    public abstract /* synthetic */ int getSize();

    public void initialize() {
        Drawable drawable = this.f97696b;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof b9.d) {
            ((b9.d) drawable).getFirstFrame().prepareToDraw();
        }
    }

    @Override // p8.v0
    public abstract /* synthetic */ void recycle();

    @Override // p8.v0
    public final Drawable get() {
        Drawable drawable = this.f97696b;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
