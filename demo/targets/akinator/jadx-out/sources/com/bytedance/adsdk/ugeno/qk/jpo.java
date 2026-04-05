package com.bytedance.adsdk.ugeno.qk;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.qk.jpo$jpo, reason: collision with other inner class name */
    public static class C0066jpo {

        /* renamed from: jd, reason: collision with root package name */
        public int[] f17957jd;
        public GradientDrawable.Orientation jpo;
        public float[] wqx;
    }

    public static GradientDrawable.Orientation cm(String str) {
        try {
            int i10 = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            return i10 == 90 ? GradientDrawable.Orientation.LEFT_RIGHT : i10 == 180 ? GradientDrawable.Orientation.TOP_BOTTOM : i10 == 270 ? GradientDrawable.Orientation.RIGHT_LEFT : i10 == 135 ? GradientDrawable.Orientation.TL_BR : i10 == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static C0066jpo jd(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            int iJpo = jpo(strSubstring, '%');
            int iIndexOf = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0066jpo c0066jpo = new C0066jpo();
            c0066jpo.jpo = cm(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[iJpo];
            float[] fArr = new float[iJpo];
            for (int i10 = 0; i10 < iJpo; i10++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(" ")) + 1;
                iArr[i10] = jpo(strTrim.substring(0, iIndexOf3).trim());
                fArr[i10] = wqx.jpo(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
                int i11 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i11) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i11);
            }
            if (iJpo < 2) {
                return null;
            }
            c0066jpo.f17957jd = iArr;
            c0066jpo.wqx = fArr;
            return c0066jpo;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int jpo(String str) {
        return jpo(str, -16777216);
    }

    public static boolean wqx(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static int jpo(String str, int i10) throws NumberFormatException {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(C3191e4.h.T)) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb2 = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i11 = 1; i11 < charArray.length; i11++) {
                    sb2.append(charArray[i11]);
                    sb2.append(charArray[i11]);
                }
                return Color.parseColor(sb2.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
            if (strArrSplit != null && strArrSplit.length == 4) {
                return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
            }
        }
        return i10;
    }

    public static int jpo(String str, char c10) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        return i10;
    }

    public static int jpo(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i11 = 255;
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
