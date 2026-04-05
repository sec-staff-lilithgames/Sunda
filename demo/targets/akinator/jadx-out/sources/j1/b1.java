package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b1 {
    /* renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final y0 m4693ImageBitmapx__hDU(int i10, int i11, int i12, boolean z10, k1.g colorSpace) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorSpace, "colorSpace");
        return g.m4757ActualImageBitmapx__hDU(i10, i11, i12, z10, colorSpace);
    }

    /* renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ y0 m4694ImageBitmapx__hDU$default(int i10, int i11, int i12, boolean z10, k1.g gVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = a1.f68819b.m5083getArgb8888_sVssgQ();
        }
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        if ((i13 & 16) != 0) {
            gVar = k1.k.f70039a.getSrgb();
        }
        return m4693ImageBitmapx__hDU(i10, i11, i12, z10, gVar);
    }

    public static final s1 toPixelMap(y0 y0Var, int i10, int i11, int i12, int i13, int[] buffer, int i14, int i15) {
        kotlin.jvm.internal.e0.checkNotNullParameter(y0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        y0Var.readPixels(buffer, i10, i11, i12, i13, i14, i15);
        return new s1(buffer, i12, i13, i14, i15);
    }

    public static /* synthetic */ s1 toPixelMap$default(y0 y0Var, int i10, int i11, int i12, int i13, int[] iArr, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = 0;
        }
        if ((i16 & 2) != 0) {
            i11 = 0;
        }
        if ((i16 & 4) != 0) {
            i12 = y0Var.getWidth();
        }
        if ((i16 & 8) != 0) {
            i13 = y0Var.getHeight();
        }
        if ((i16 & 16) != 0) {
            iArr = new int[i12 * i13];
        }
        if ((i16 & 32) != 0) {
            i14 = 0;
        }
        if ((i16 & 64) != 0) {
            i15 = i12;
        }
        return toPixelMap(y0Var, i10, i11, i12, i13, iArr, i14, i15);
    }
}
