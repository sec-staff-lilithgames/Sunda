package com.bytedance.adsdk.jd;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class hna implements Interpolator {

    /* renamed from: jd, reason: collision with root package name */
    private final float[] f17231jd;
    private final float[] jpo;

    public hna(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = (int) (length / 0.002f);
        int i11 = i10 + 1;
        this.jpo = new float[i11];
        this.f17231jd = new float[i11];
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < i11; i12++) {
            pathMeasure.getPosTan((i12 * length) / i10, fArr, null);
            this.jpo[i12] = fArr[0];
            this.f17231jd[i12] = fArr[1];
        }
    }

    private static Path jpo(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.jpo.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.jpo[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.jpo;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f17231jd[i10];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.f17231jd;
        float f15 = fArr2[i10];
        return o2.a(fArr2[length], f15, f14, f15);
    }

    public hna(float f10, float f11, float f12, float f13) {
        this(jpo(f10, f11, f12, f13));
    }
}
