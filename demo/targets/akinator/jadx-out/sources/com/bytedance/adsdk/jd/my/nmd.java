package com.bytedance.adsdk.jd.my;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class nmd {

    /* renamed from: jd, reason: collision with root package name */
    private static SparseArray<WeakReference<Interpolator>> f17404jd;
    private static final Interpolator jpo = new LinearInterpolator();

    /* JADX WARN: Removed duplicated region for block: B:127:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> com.bytedance.adsdk.jd.qk.jpo<T> jd(com.bytedance.adsdk.jd.qk r24, android.util.JsonReader r25, float r26, com.bytedance.adsdk.jd.my.roc<T> r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.my.nmd.jd(com.bytedance.adsdk.jd.qk, android.util.JsonReader, float, com.bytedance.adsdk.jd.my.roc):com.bytedance.adsdk.jd.qk.jpo");
    }

    private static SparseArray<WeakReference<Interpolator>> jpo() {
        if (f17404jd == null) {
            f17404jd = new SparseArray<>();
        }
        return f17404jd;
    }

    private static WeakReference<Interpolator> jpo(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (nmd.class) {
            weakReference = jpo().get(i10);
        }
        return weakReference;
    }

    private static void jpo(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (nmd.class) {
            f17404jd.put(i10, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.jd.qk.jpo<T> jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar, float f10, roc<T> rocVar, boolean z10, boolean z11) throws IOException {
        if (z10 && z11) {
            return jd(qkVar, jsonReader, f10, rocVar);
        }
        if (z10) {
            return jpo(qkVar, jsonReader, f10, rocVar);
        }
        return jpo(jsonReader, f10, rocVar);
    }

    private static <T> com.bytedance.adsdk.jd.qk.jpo<T> jpo(com.bytedance.adsdk.jd.qk qkVar, JsonReader jsonReader, float f10, roc<T> rocVar) throws IOException {
        Interpolator interpolatorJpo;
        jsonReader.beginObject();
        PointF pointFJd = null;
        T tJd = null;
        T tJd2 = null;
        PointF pointFJd2 = null;
        PointF pointFJd3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFJd4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tJd = rocVar.jd(jsonReader, f10);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case "i":
                    pointFJd4 = jr.jd(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFJd = jr.jd(jsonReader, 1.0f);
                    break;
                case "s":
                    tJd2 = rocVar.jd(jsonReader, f10);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFJd3 = jr.jd(jsonReader, f10);
                    break;
                case "to":
                    pointFJd2 = jr.jd(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z10) {
            if (pointFJd != null && pointFJd4 != null) {
                interpolatorJpo = jpo(pointFJd, pointFJd4);
            }
            com.bytedance.adsdk.jd.qk.jpo<T> jpoVar = new com.bytedance.adsdk.jd.qk.jpo<>(qkVar, tJd2, tJd, interpolatorJpo, fNextDouble, null);
            jpoVar.xyk = pointFJd2;
            jpoVar.zz = pointFJd3;
            return jpoVar;
        }
        tJd = tJd2;
        interpolatorJpo = jpo;
        com.bytedance.adsdk.jd.qk.jpo<T> jpoVar2 = new com.bytedance.adsdk.jd.qk.jpo<>(qkVar, tJd2, tJd, interpolatorJpo, fNextDouble, null);
        jpoVar2.xyk = pointFJd2;
        jpoVar2.zz = pointFJd3;
        return jpoVar2;
    }

    private static Interpolator jpo(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.jd.jj.my.jd(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.jd.jj.my.jd(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.jd.jj.my.jd(pointF2.x, -1.0f, 1.0f);
        float fJd = com.bytedance.adsdk.jd.jj.my.jd(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fJd;
        int iJpo = com.bytedance.adsdk.jd.jj.jj.jpo(pointF.x, pointF.y, pointF2.x, fJd);
        WeakReference<Interpolator> weakReferenceJpo = com.bytedance.adsdk.jd.my.jpo() ? null : jpo(iJpo);
        Interpolator interpolator = weakReferenceJpo != null ? weakReferenceJpo.get() : null;
        if (weakReferenceJpo != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.jd.sq.jpo(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.jd.sq.jpo(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.jd.my.jpo()) {
            try {
                jpo(iJpo, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.jd.qk.jpo<T> jpo(JsonReader jsonReader, float f10, roc<T> rocVar) throws IOException {
        return new com.bytedance.adsdk.jd.qk.jpo<>(rocVar.jd(jsonReader, f10));
    }
}
