package tf;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final a f86847a;

    /* renamed from: b, reason: collision with root package name */
    public final a f86848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86849c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86850d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final b[] f86851a;

        public a(b... bVarArr) {
            this.f86851a = bVarArr;
        }

        public b getSubMesh(int i10) {
            return this.f86851a[i10];
        }

        public int getSubMeshCount() {
            return this.f86851a.length;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f86852a;

        /* renamed from: b, reason: collision with root package name */
        public final int f86853b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f86854c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f86855d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f86852a = i10;
            com.google.android.exoplayer2.util.a.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f86854c = fArr;
            this.f86855d = fArr2;
            this.f86853b = i11;
        }

        public int getVertexCount() {
            return this.f86854c.length / 3;
        }
    }

    public f(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public static f createEquirectangular(int i10) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public f(a aVar, a aVar2, int i10) {
        this.f86847a = aVar;
        this.f86848b = aVar2;
        this.f86849c = i10;
        this.f86850d = aVar == aVar2;
    }

    public static f createEquirectangular(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        int i14 = i10;
        com.google.android.exoplayer2.util.a.checkArgument(f10 > 0.0f);
        com.google.android.exoplayer2.util.a.checkArgument(i14 >= 1);
        com.google.android.exoplayer2.util.a.checkArgument(i11 >= 1);
        com.google.android.exoplayer2.util.a.checkArgument(f11 > 0.0f && f11 <= 180.0f);
        com.google.android.exoplayer2.util.a.checkArgument(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f13 = radians / i14;
        float f14 = radians2 / i11;
        int i15 = i11 + 1;
        int iB = o2.B(i15, 2, 2, i14);
        float[] fArr = new float[iB * 3];
        float[] fArr2 = new float[iB * 2];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i14) {
            float f15 = radians / 2.0f;
            float f16 = (i16 * f13) - f15;
            int i19 = i16 + 1;
            float f17 = (i19 * f13) - f15;
            int i20 = 0;
            while (i20 < i15) {
                float f18 = radians;
                float f19 = radians2;
                int i21 = 0;
                int i22 = 2;
                while (i21 < i22) {
                    float f20 = f13;
                    float f21 = i20 * f14;
                    float f22 = f14;
                    float f23 = f16;
                    double d10 = f10;
                    double d11 = (f21 + 3.1415927f) - (f19 / 2.0f);
                    double d12 = i21 == 0 ? f16 : f17;
                    fArr[i17] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                    fArr[i17 + 1] = (float) (Math.sin(d12) * d10);
                    int i23 = i17 + 3;
                    fArr[i17 + 2] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                    fArr2[i18] = f21 / f19;
                    int i24 = i18 + 2;
                    fArr2[i18 + 1] = ((i16 + i21) * f20) / f18;
                    if ((i20 == 0 && i21 == 0) || (i20 == i11 && i21 == 1)) {
                        System.arraycopy(fArr, i17, fArr, i23, 3);
                        i17 += 6;
                        i13 = 2;
                        System.arraycopy(fArr2, i18, fArr2, i24, 2);
                        i18 += 4;
                    } else {
                        i13 = 2;
                        i17 = i23;
                        i18 = i24;
                    }
                    i21++;
                    i22 = i13;
                    f13 = f20;
                    f14 = f22;
                    f16 = f23;
                }
                i20++;
                radians2 = f19;
                radians = f18;
                f13 = f13;
            }
            i14 = i10;
            i16 = i19;
        }
        return new f(new a(new b(0, fArr, fArr2, 1)), i12);
    }
}
