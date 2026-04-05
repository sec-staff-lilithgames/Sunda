package com.bytedance.sdk.openadsdk.core.zz.jpo;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static float jd(Context context) {
        return va.wqx(context, va.au(context));
    }

    public static Pair<Float, Float> jpo(Window window, int i10) {
        View decorView = window.getDecorView();
        float[] fArrJpo = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrJpo[0] = va.wqx(window.getContext(), fArrJpo[0]);
        float fWqx = va.wqx(window.getContext(), fArrJpo[1]);
        fArrJpo[1] = fWqx;
        if (fArrJpo[0] < 10.0f || fWqx < 10.0f) {
            fArrJpo = jpo(window.getContext(), va.wqx(window.getContext(), va.jpo()), i10);
        }
        float fMax = Math.max(fArrJpo[0], fArrJpo[1]);
        float fMin = Math.min(fArrJpo[0], fArrJpo[1]);
        if (i10 == 1) {
            fArrJpo[0] = fMin;
            fArrJpo[1] = fMax;
        } else {
            fArrJpo[0] = fMax;
            fArrJpo[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrJpo[0]), Float.valueOf(fArrJpo[1]));
    }

    private static float[] jpo(Context context, int i10, int i11) {
        float fJpo = jpo(context);
        float fJd = jd(context);
        if ((i11 == 1) != (fJpo > fJd)) {
            float f10 = fJpo + fJd;
            fJd = f10 - fJd;
            fJpo = f10 - fJd;
        }
        if (i11 == 1) {
            fJpo -= i10;
        } else {
            fJd -= i10;
        }
        return new float[]{fJd, fJpo};
    }

    public static float jpo(Context context) {
        return va.wqx(context, va.m499if(context));
    }
}
