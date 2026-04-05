package com.bytedance.adsdk.jd.wqx.jd;

import a.b;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* renamed from: jd, reason: collision with root package name */
    private final int[] f17454jd;
    private final float[] jpo;

    public cm(float[] fArr, int[] iArr) {
        this.jpo = fArr;
        this.f17454jd = iArr;
    }

    public int[] jd() {
        return this.f17454jd;
    }

    public float[] jpo() {
        return this.jpo;
    }

    public int wqx() {
        return this.f17454jd.length;
    }

    public void jpo(cm cmVar, cm cmVar2, float f10) {
        if (cmVar.f17454jd.length != cmVar2.f17454jd.length) {
            StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb2.append(cmVar.f17454jd.length);
            sb2.append(" vs ");
            throw new IllegalArgumentException(b.f(cmVar2.f17454jd.length, ")", sb2));
        }
        for (int i10 = 0; i10 < cmVar.f17454jd.length; i10++) {
            this.jpo[i10] = com.bytedance.adsdk.jd.jj.my.jpo(cmVar.jpo[i10], cmVar2.jpo[i10], f10);
            this.f17454jd[i10] = com.bytedance.adsdk.jd.jj.jd.jpo(f10, cmVar.f17454jd[i10], cmVar2.f17454jd[i10]);
        }
    }

    public cm jpo(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = jpo(fArr[i10]);
        }
        return new cm(fArr, iArr);
    }

    private int jpo(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.jpo, f10);
        if (iBinarySearch >= 0) {
            return this.f17454jd[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f17454jd[0];
        }
        int[] iArr = this.f17454jd;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.jpo;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.bytedance.adsdk.jd.jj.jd.jpo((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }
}
