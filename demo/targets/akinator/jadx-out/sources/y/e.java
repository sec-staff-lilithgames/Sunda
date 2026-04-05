package y;

import android.content.Context;
import android.content.res.ColorStateList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface e {
    ColorStateList getBackgroundColor(d dVar);

    float getElevation(d dVar);

    float getMaxElevation(d dVar);

    float getMinHeight(d dVar);

    float getMinWidth(d dVar);

    float getRadius(d dVar);

    void initStatic();

    void initialize(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12);

    void onCompatPaddingChanged(d dVar);

    void onPreventCornerOverlapChanged(d dVar);

    void setBackgroundColor(d dVar, ColorStateList colorStateList);

    void setElevation(d dVar, float f10);

    void setMaxElevation(d dVar, float f10);

    void setRadius(d dVar, float f10);

    void updatePadding(d dVar);
}
