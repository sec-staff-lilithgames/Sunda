package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f97578a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f97579b;

    public d(float[] fArr, int[] iArr) {
        this.f97578a = fArr;
        this.f97579b = iArr;
    }

    public final void a(d dVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.f97579b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f97578a[i10] = dVar.f97578a[i10];
            this.f97579b[i10] = iArr[i10];
            i10++;
        }
    }

    public d copyWithPositions(float[] fArr) {
        int iEvaluate;
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f10 = fArr[i10];
            float[] fArr2 = this.f97578a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f97579b;
            if (iBinarySearch >= 0) {
                iEvaluate = iArr2[iBinarySearch];
            } else {
                int i11 = -(iBinarySearch + 1);
                if (i11 == 0) {
                    iEvaluate = iArr2[0];
                } else if (i11 == iArr2.length - 1) {
                    iEvaluate = iArr2[iArr2.length - 1];
                } else {
                    int i12 = i11 - 1;
                    float f11 = fArr2[i12];
                    iEvaluate = e8.c.evaluate((f10 - f11) / (fArr2[i11] - f11), iArr2[i12], iArr2[i11]);
                }
            }
            iArr[i10] = iEvaluate;
        }
        return new d(fArr, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f97578a, dVar.f97578a) && Arrays.equals(this.f97579b, dVar.f97579b)) {
                return true;
            }
        }
        return false;
    }

    public int[] getColors() {
        return this.f97579b;
    }

    public float[] getPositions() {
        return this.f97578a;
    }

    public int getSize() {
        return this.f97579b.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f97579b) + (Arrays.hashCode(this.f97578a) * 31);
    }

    public void lerp(d dVar, d dVar2, float f10) {
        int[] iArr;
        float[] fArr;
        boolean zEquals = dVar.equals(dVar2);
        int[] iArr2 = dVar.f97579b;
        if (zEquals) {
            a(dVar);
            return;
        }
        if (f10 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f10 >= 1.0f) {
            a(dVar2);
            return;
        }
        int length = iArr2.length;
        int[] iArr3 = dVar2.f97579b;
        int[] iArr4 = dVar2.f97579b;
        if (length != iArr3.length) {
            StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb2.append(iArr2.length);
            sb2.append(" vs ");
            throw new IllegalArgumentException(a.b.f(iArr4.length, ")", sb2));
        }
        int i10 = 0;
        while (true) {
            int length2 = iArr2.length;
            iArr = this.f97579b;
            fArr = this.f97578a;
            if (i10 >= length2) {
                break;
            }
            fArr[i10] = e8.j.lerp(dVar.f97578a[i10], dVar2.f97578a[i10], f10);
            iArr[i10] = e8.c.evaluate(f10, iArr2[i10], iArr4[i10]);
            i10++;
        }
        for (int length3 = iArr2.length; length3 < fArr.length; length3++) {
            fArr[length3] = fArr[iArr2.length - 1];
            iArr[length3] = iArr[iArr2.length - 1];
        }
    }
}
