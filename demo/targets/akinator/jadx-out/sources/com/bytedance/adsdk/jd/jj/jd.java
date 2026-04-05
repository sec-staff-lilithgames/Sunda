package com.bytedance.adsdk.jd.jj;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static float jd(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float jpo(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int jpo(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float f12 = ((i11 >> 24) & 255) / 255.0f;
        float fJd = jd(((i10 >> 16) & 255) / 255.0f);
        float fJd2 = jd(((i10 >> 8) & 255) / 255.0f);
        float fJd3 = jd((i10 & 255) / 255.0f);
        float fJd4 = jd(((i11 >> 16) & 255) / 255.0f);
        float fJd5 = jd(((i11 >> 8) & 255) / 255.0f);
        float fJd6 = jd((i11 & 255) / 255.0f);
        float fA = o2.a(f12, f11, f10, f11);
        float fA2 = o2.a(fJd4, fJd, f10, fJd);
        float fA3 = o2.a(fJd5, fJd2, f10, fJd2);
        float fA4 = o2.a(fJd6, fJd3, f10, fJd3);
        float fJpo = jpo(fA2) * 255.0f;
        float fJpo2 = jpo(fA3) * 255.0f;
        return Math.round(jpo(fA4) * 255.0f) | (Math.round(fJpo) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fJpo2) << 8);
    }
}
