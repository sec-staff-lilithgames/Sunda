package e4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {
    @Deprecated
    public static Drawable getCheckMarkDrawable(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    public static ColorStateList getCheckMarkTintList(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkTintList();
    }

    public static PorterDuff.Mode getCheckMarkTintMode(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkTintMode();
    }

    public static void setCheckMarkTintList(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        checkedTextView.setCheckMarkTintList(colorStateList);
    }

    public static void setCheckMarkTintMode(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        checkedTextView.setCheckMarkTintMode(mode);
    }
}
