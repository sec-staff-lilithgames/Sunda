package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f1 {
    /* renamed from: access$dot-p89u6pk, reason: not valid java name */
    public static final float m4755access$dotp89u6pk(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    /* renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m4756isIdentity58bKbWc(float[] isIdentity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(isIdentity, "$this$isIdentity");
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                if (isIdentity[(i10 * 4) + i11] != (i10 == i11 ? 1.0f : 0.0f)) {
                    return false;
                }
                i11++;
            }
            i10++;
        }
        return true;
    }
}
