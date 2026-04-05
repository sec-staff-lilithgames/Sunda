package sq;

import android.graphics.Bitmap;
import br.u;
import java.util.HashMap;
import kotlin.jvm.internal.e0;
import qv.m;
import qv.v;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u algorithmParams) {
        super(algorithmParams);
        e0.checkNotNullParameter(algorithmParams, "algorithmParams");
    }

    @Override // sq.a
    public Boolean a(Bitmap bitmap) {
        float fIntValue;
        int i10;
        int i11;
        int i12;
        Bitmap image = bitmap;
        e0.checkNotNullParameter(image, "image");
        float threshold = a().getThreshold();
        if (threshold > 0.5f) {
            m mVarUntil = v.until(0, image.getWidth());
            m mVarUntil2 = v.until(0, image.getHeight());
            int iCount = y0.count(mVarUntil2) * y0.count(mVarUntil);
            int[] iArr = new int[image.getWidth()];
            int first = mVarUntil2.getFirst();
            int last = mVarUntil2.getLast();
            if (first <= last) {
                int i13 = first;
                i11 = 0;
                int i14 = 0;
                while (true) {
                    image.getPixels(iArr, 0, image.getWidth(), 0, i13, image.getWidth(), 1);
                    int first2 = mVarUntil.getFirst();
                    int last2 = mVarUntil.getLast();
                    if (first2 <= last2) {
                        int i15 = i14;
                        while (true) {
                            int i16 = iArr[first2];
                            if (i11 == 0) {
                                i15 = i16;
                                i11 = 1;
                            } else {
                                i11 = i16 == i15 ? i11 + 1 : i11 - 1;
                            }
                            if (first2 == last2) {
                                break;
                            }
                            first2++;
                        }
                        i14 = i15;
                    }
                    if (i13 == last) {
                        break;
                    }
                    i13++;
                    image = bitmap;
                }
                i10 = i14;
            } else {
                i10 = 0;
                i11 = 0;
            }
            float f10 = iCount;
            if (i11 < ((2 * threshold) - 1) * f10) {
                fIntValue = 0.0f;
            } else {
                int first3 = mVarUntil2.getFirst();
                int last3 = mVarUntil2.getLast();
                if (first3 <= last3) {
                    int i17 = first3;
                    i12 = 0;
                    while (true) {
                        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i17, bitmap.getWidth(), 1);
                        int first4 = mVarUntil.getFirst();
                        int last4 = mVarUntil.getLast();
                        if (first4 <= last4) {
                            while (true) {
                                if (iArr[first4] == i10) {
                                    i12++;
                                }
                                if (first4 == last4) {
                                    break;
                                }
                                first4++;
                            }
                        }
                        if (i17 == last3) {
                            break;
                        }
                        i17++;
                    }
                } else {
                    i12 = 0;
                }
                fIntValue = i12 / f10;
            }
        } else {
            m mVarUntil3 = v.until(0, bitmap.getWidth());
            m mVarUntil4 = v.until(0, bitmap.getHeight());
            int iCount2 = y0.count(mVarUntil4) * y0.count(mVarUntil3);
            int[] iArr2 = new int[bitmap.getWidth()];
            HashMap map = new HashMap();
            int first5 = mVarUntil4.getFirst();
            int last5 = mVarUntil4.getLast();
            if (first5 <= last5) {
                int i18 = first5;
                while (true) {
                    bitmap.getPixels(iArr2, 0, bitmap.getWidth(), 0, i18, bitmap.getWidth(), 1);
                    int first6 = mVarUntil3.getFirst();
                    int last6 = mVarUntil3.getLast();
                    if (first6 <= last6) {
                        while (true) {
                            int i19 = iArr2[first6];
                            Integer numValueOf = Integer.valueOf(i19);
                            Integer num = (Integer) map.get(Integer.valueOf(i19));
                            map.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                            if (first6 == last6) {
                                break;
                            }
                            first6++;
                        }
                    }
                    if (i18 == last5) {
                        break;
                    }
                    i18++;
                }
            }
            fIntValue = (((Integer) y0.maxOrNull((Iterable) map.values())) != null ? r1.intValue() : 0) / iCount2;
        }
        boolean z10 = fIntValue >= threshold;
        a(Float.valueOf(fIntValue), Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }
}
