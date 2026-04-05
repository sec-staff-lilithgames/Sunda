package e4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {
    public static ColorStateList getImageTintList(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static PorterDuff.Mode getImageTintMode(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void setImageTintList(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void setImageTintMode(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
