package com.facebook.ads.redexgen.core;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public abstract class V8 {
    public static String[] A00 = {"TYvyTugW0LIK7CMS2wYs9G2uUGgA7Dke", "WsEiqL7ZS4BTI966aPHoJ2dPx2Ea0F4I", "bsmL1TSWcO8d5RdSDpnXrtDP3Rd3pXtR", "xkYelsmw9O3RFB2zMTQOqufEggZJfpsf", "Ou1dyJktpNGGcf9tDpPKvHuJxEoqg2O4", "MwtSqX2RTtZq4kMpP", "Xg7OrQNETkr2DWt43s", "zI20iJtpElrzvKbVLZsd1iWpdjTxU8BC"};

    public static V6 A00(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (C1641Wm.A04(i10, screenHeight)) {
            return V6.A0I;
        }
        if (screenHeight > i10) {
            V6 v62 = V6.A0K;
            String[] strArr = A00;
            String str = strArr[5];
            String str2 = strArr[6];
            int screenHeight2 = str.length();
            int screenWidth2 = str2.length();
            if (screenHeight2 == screenWidth2) {
                throw new RuntimeException();
            }
            A00[7] = "zEjIxhk858iOsdYr9SgRsiKXnD8rO3VU";
            return v62;
        }
        return V6.A0H;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, V4 v42) {
        int iCeil;
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = v42.A04();
        if (i10 >= screenWidth) {
            iCeil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = v42.A04();
            iCeil = (int) Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = v42.A03();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iCeil, (int) Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
