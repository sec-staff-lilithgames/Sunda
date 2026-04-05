package eg;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f54348a;

    /* renamed from: b, reason: collision with root package name */
    public final float f54349b;

    /* renamed from: c, reason: collision with root package name */
    public int f54350c;

    /* renamed from: d, reason: collision with root package name */
    public int f54351d;

    /* renamed from: e, reason: collision with root package name */
    public final float f54352e;

    /* renamed from: f, reason: collision with root package name */
    public final float f54353f;

    /* renamed from: g, reason: collision with root package name */
    public final int f54354g;

    /* renamed from: h, reason: collision with root package name */
    public final float f54355h;

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r4, float r5, float r6, float r7, int r8, float r9, int r10, float r11, int r12, float r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.a.<init>(int, float, float, float, int, float, int, float, int, float):void");
    }

    public static a findLowestCostArrangement(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    float f16 = aVar2.f54355h;
                    if (aVar == null || f16 < aVar.f54355h) {
                        if (f16 == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f54348a + ", smallCount=" + this.f54350c + ", smallSize=" + this.f54349b + ", mediumCount=" + this.f54351d + ", mediumSize=" + this.f54352e + ", largeCount=" + this.f54354g + ", largeSize=" + this.f54353f + ", cost=" + this.f54355h + C3191e4.i.f36531e;
    }
}
