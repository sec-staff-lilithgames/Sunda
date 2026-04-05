package fg;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a extends f6.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCheckBox f55706b;

    public a(MaterialCheckBox materialCheckBox) {
        this.f55706b = materialCheckBox;
    }

    @Override // f6.c
    public void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        ColorStateList colorStateList = this.f55706b.f29093q;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // f6.c
    public void onAnimationStart(Drawable drawable) {
        super.onAnimationStart(drawable);
        MaterialCheckBox materialCheckBox = this.f55706b;
        ColorStateList colorStateList = materialCheckBox.f29093q;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.f29097u, colorStateList.getDefaultColor()));
        }
    }
}
