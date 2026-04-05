package sq;

import android.graphics.Bitmap;
import br.u;
import kotlin.jvm.internal.e0;
import qv.m;
import qv.v;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u algorithmParams) {
        super(algorithmParams);
        e0.checkNotNullParameter(algorithmParams, "algorithmParams");
    }

    @Override // sq.a
    public Boolean a(Bitmap bitmap) {
        float f10;
        float f11;
        Bitmap image = bitmap;
        e0.checkNotNullParameter(image, "image");
        m mVarUntil = v.until(0, image.getWidth());
        m mVarUntil2 = v.until(0, image.getHeight());
        int iCount = y0.count(mVarUntil2) * y0.count(mVarUntil);
        int[] iArr = new int[image.getWidth()];
        int first = mVarUntil2.getFirst();
        int last = mVarUntil2.getLast();
        if (first <= last) {
            int i10 = first;
            f10 = 0.0f;
            f11 = 0.0f;
            while (true) {
                int[] iArr2 = iArr;
                image.getPixels(iArr2, 0, image.getWidth(), 0, i10, image.getWidth(), 1);
                int first2 = mVarUntil.getFirst();
                int last2 = mVarUntil.getLast();
                if (first2 <= last2) {
                    while (true) {
                        float fA = a(iArr2[first2]);
                        f10 += fA;
                        f11 += fA * fA;
                        if (first2 == last2) {
                            break;
                        }
                        first2++;
                    }
                }
                if (i10 == last) {
                    break;
                }
                i10++;
                image = bitmap;
                iArr = iArr2;
            }
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        float f12 = iCount;
        float f13 = f10 / f12;
        float f14 = (f11 / f12) - (f13 * f13);
        float fSqrt = f14 >= 0.0f ? (float) Math.sqrt(f14) : 0.0f;
        boolean z10 = fSqrt <= a().getThreshold();
        a(Float.valueOf(fSqrt), Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }
}
