package com.mbridge.msdk.video.dynview.util.drawable;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.mbridge.msdk.foundation.tools.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {
    public static void a(View view, int i10, int i11, String str, String str2) {
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(u0.a(view.getContext(), i11));
            gradientDrawable.setStroke(u0.a(view.getContext(), i10), Color.parseColor(str));
            view.setBackground(gradientDrawable);
        }
    }

    public static void a(View view, float f10, float f11, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view == null || strArr == null) {
            return;
        }
        int[] iArr = new int[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            iArr[i10] = Color.parseColor(strArr[i10]);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(u0.a(view.getContext(), f11));
        gradientDrawable.setStroke(u0.a(view.getContext(), f10), Color.parseColor(str));
        view.setBackground(gradientDrawable);
    }
}
