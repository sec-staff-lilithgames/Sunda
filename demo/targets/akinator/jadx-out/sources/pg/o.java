package pg;

import android.graphics.drawable.Drawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class o implements xg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f81231a;

    public o(FloatingActionButton floatingActionButton) {
        this.f81231a = floatingActionButton;
    }

    @Override // xg.b
    public float getRadius() {
        return this.f81231a.getSizeDimension() / 2.0f;
    }

    @Override // xg.b
    public boolean isCompatPaddingEnabled() {
        return this.f81231a.f29265m;
    }

    @Override // xg.b
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null) {
            super/*android.view.View*/.setBackgroundDrawable(drawable);
        }
    }

    @Override // xg.b
    public void setShadowPadding(int i10, int i11, int i12, int i13) {
        FloatingActionButton floatingActionButton = this.f81231a;
        floatingActionButton.f29266n.set(i10, i11, i12, i13);
        int i14 = floatingActionButton.f29263k;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }
}
