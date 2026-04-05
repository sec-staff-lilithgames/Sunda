package com.bytedance.adsdk.jd.my;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr implements roc<com.bytedance.adsdk.jd.wqx.jd.cm> {
    private int jpo;

    public prr(int i10) {
        this.jpo = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.jd.my.roc
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.adsdk.jd.wqx.jd.cm jd(android.util.JsonReader r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.my.prr.jd(android.util.JsonReader, float):com.bytedance.adsdk.jd.wqx.jd.cm");
    }

    private com.bytedance.adsdk.jd.wqx.jd.cm jpo(com.bytedance.adsdk.jd.wqx.jd.cm cmVar, List<Float> list) {
        int i10 = this.jpo * 4;
        if (list.size() <= i10) {
            return cmVar;
        }
        float[] fArrJpo = cmVar.jpo();
        int[] iArrJd = cmVar.jd();
        int size = (list.size() - i10) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i11 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                fArr[i11] = list.get(i10).floatValue();
            } else {
                fArr2[i11] = list.get(i10).floatValue();
                i11++;
            }
            i10++;
        }
        float[] fArrJpo2 = jpo(cmVar.jpo(), fArr);
        int length = fArrJpo2.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            float f10 = fArrJpo2[i12];
            int iBinarySearch = Arrays.binarySearch(fArrJpo, f10);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f10);
            if (iBinarySearch >= 0 && iBinarySearch2 <= 0) {
                iArr[i12] = jpo(f10, iArrJd[iBinarySearch], fArr, fArr2);
            } else {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i12] = jpo(f10, fArr2[iBinarySearch2], fArrJpo, iArrJd);
            }
        }
        return new com.bytedance.adsdk.jd.wqx.jd.cm(fArrJpo2, iArr);
    }

    public int jpo(float f10, float f11, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f10 != fArr[0]) {
            for (int i10 = 1; i10 < fArr.length; i10++) {
                float f12 = fArr[i10];
                if (f12 >= f10 || i10 == fArr.length - 1) {
                    int i11 = i10 - 1;
                    float f13 = fArr[i11];
                    float f14 = (f10 - f13) / (f12 - f13);
                    int i12 = iArr[i10];
                    int i13 = iArr[i11];
                    return Color.argb((int) (f11 * 255.0f), com.bytedance.adsdk.jd.jj.jd.jpo(f14, Color.red(i13), Color.red(i12)), com.bytedance.adsdk.jd.jj.jd.jpo(f14, Color.green(i13), Color.green(i12)), com.bytedance.adsdk.jd.jj.jd.jpo(f14, Color.blue(i13), Color.blue(i12)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int jpo(float f10, int i10, float[] fArr, float[] fArr2) {
        float fJpo;
        if (fArr2.length >= 2 && f10 > fArr[0]) {
            for (int i11 = 1; i11 < fArr.length; i11++) {
                float f11 = fArr[i11];
                if (f11 >= f10 || i11 == fArr.length - 1) {
                    if (f11 <= f10) {
                        fJpo = fArr2[i11];
                    } else {
                        int i12 = i11 - 1;
                        float f12 = fArr[i12];
                        fJpo = com.bytedance.adsdk.jd.jj.my.jpo(fArr2[i12], fArr2[i11], (f10 - f12) / (f11 - f12));
                    }
                    return Color.argb((int) (fJpo * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static float[] jpo(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            float f10 = i11 < fArr.length ? fArr[i11] : Float.NaN;
            float f11 = i12 < fArr2.length ? fArr2[i12] : Float.NaN;
            if (!Float.isNaN(f11) && f10 >= f11) {
                if (!Float.isNaN(f10) && f11 >= f10) {
                    fArr3[i13] = f10;
                    i11++;
                    i12++;
                    i10++;
                } else {
                    fArr3[i13] = f11;
                    i12++;
                }
            } else {
                fArr3[i13] = f10;
                i11++;
            }
        }
        return i10 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i10);
    }
}
