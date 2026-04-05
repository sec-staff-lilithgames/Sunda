package com.google.android.gms.common.internal;

import a.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.DeviceProperties;
import p3.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException(b.e(i10, "Unknown color scheme: "));
    }

    public final void zaa(Resources resources, int i10, int i11) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i12 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i12);
        setMinWidth(i12);
        int i13 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i14 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int iZab = zab(i11, i13, i14, i14);
        int i15 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i16 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int iZab2 = zab(i11, i15, i16, i16);
        if (i10 == 0 || i10 == 1) {
            iZab = iZab2;
        } else if (i10 != 2) {
            throw new IllegalStateException(b.e(i10, "Unknown button size: "));
        }
        Drawable drawableWrap = a.wrap(resources.getDrawable(iZab));
        a.setTintList(drawableWrap, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        a.setTintMode(drawableWrap, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableWrap);
        int i17 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i18 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i11, i17, i18, i18))));
        if (i10 == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i10 == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(b.e(i10, "Unknown button size: "));
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
