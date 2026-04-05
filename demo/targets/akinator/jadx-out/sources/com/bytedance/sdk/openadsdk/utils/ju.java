package com.bytedance.sdk.openadsdk.utils;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju {
    private static final Map<String, Pair<? extends Drawable, Integer>> jpo = new HashMap();

    /* renamed from: jd, reason: collision with root package name */
    private static Integer f21582jd = null;

    public static Drawable jpo(Context context, String str) {
        return jpo(context, str, true);
    }

    public static Drawable jpo(Context context, String str, boolean z10) {
        Pair<? extends Drawable, Integer> pair;
        f21582jd = Integer.valueOf(com.bytedance.sdk.openadsdk.core.sq.cm().kb());
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = jpo;
        map.size();
        if (!map.containsKey(str) || (pair = map.get(str)) == null) {
            jpo();
            return jpo(str, context, z10);
        }
        Drawable drawable = (Drawable) pair.first;
        map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
        return drawable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.drawable.Drawable jpo(java.lang.String r34, android.content.Context r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 3676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.ju.jpo(java.lang.String, android.content.Context, boolean):android.graphics.drawable.Drawable");
    }

    private static void jpo() {
        Map<String, Pair<? extends Drawable, Integer>> map = jpo;
        if (map.size() < f21582jd.intValue()) {
            return;
        }
        String key = null;
        int iIntValue = Integer.MAX_VALUE;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        jpo.remove(key);
    }

    private static GradientDrawable jpo(int i10, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i10);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i11, i11, i12, i12, i13, i13, i14, i14});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    private static StateListDrawable jpo(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static Drawable jpo(Context context, int i10) {
        return jpo(context, Color.parseColor("#1A73E8"), i10);
    }

    public static Drawable jpo(Context context, int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(va.jd(context, i11));
        return gradientDrawable;
    }
}
