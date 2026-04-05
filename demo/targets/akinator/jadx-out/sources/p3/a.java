package p3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static void applyTheme(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean canApplyTheme(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static void clearColorFilter(Drawable drawable) {
        drawable.clearColorFilter();
    }

    @Deprecated
    public static int getAlpha(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter getColorFilter(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static int getLayoutDirection(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    @Deprecated
    public static boolean isAutoMirrored(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void jumpToCurrentState(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @Deprecated
    public static void setAutoMirrored(Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void setHotspot(Drawable drawable, float f10, float f11) {
        drawable.setHotspot(f10, f11);
    }

    public static void setHotspotBounds(Drawable drawable, int i10, int i11, int i12, int i13) {
        drawable.setHotspotBounds(i10, i11, i12, i13);
    }

    public static boolean setLayoutDirection(Drawable drawable, int i10) {
        return drawable.setLayoutDirection(i10);
    }

    public static void setTint(Drawable drawable, int i10) {
        drawable.setTint(i10);
    }

    public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(Drawable drawable) {
        return drawable instanceof c ? (T) ((d) ((c) drawable)).a() : drawable;
    }

    public static Drawable wrap(Drawable drawable) {
        return drawable;
    }
}
