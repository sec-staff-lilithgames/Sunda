package com.bytedance.adsdk.jd.jj;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.jd.wqx.jd.oya;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {
    private static final PointF jpo = new PointF();

    private static int jd(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static int jpo(int i10, int i11, float f10) {
        return (int) ((f10 * (i11 - i10)) + i10);
    }

    public static boolean wqx(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static PointF jpo(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float jd(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static void jpo(oya oyaVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFJpo = oyaVar.jpo();
        path.moveTo(pointFJpo.x, pointFJpo.y);
        jpo.set(pointFJpo.x, pointFJpo.y);
        int i10 = 0;
        while (i10 < oyaVar.wqx().size()) {
            com.bytedance.adsdk.jd.wqx.jpo jpoVar = oyaVar.wqx().get(i10);
            PointF pointFJpo2 = jpoVar.jpo();
            PointF pointFJd = jpoVar.jd();
            PointF pointFWqx = jpoVar.wqx();
            PointF pointF = jpo;
            if (pointFJpo2.equals(pointF) && pointFJd.equals(pointFWqx)) {
                path.lineTo(pointFWqx.x, pointFWqx.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFJpo2.x, pointFJpo2.y, pointFJd.x, pointFJd.y, pointFWqx.x, pointFWqx.y);
            }
            pointF.set(pointFWqx.x, pointFWqx.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (oyaVar.jd()) {
            path3.close();
        }
    }

    public static float jpo(float f10, float f11, float f12) {
        return o2.a(f11, f10, f12, f10);
    }

    public static int jpo(float f10, float f11) {
        return jpo((int) f10, (int) f11);
    }

    private static int jpo(int i10, int i11) {
        return i10 - (i11 * jd(i10, i11));
    }

    public static int jpo(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }
}
