package j1;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f68862a;

    static {
        new d1(null);
    }

    public /* synthetic */ e1(float[] fArr) {
        this.f68862a = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ e1 m4730boximpl(float[] fArr) {
        return new e1(fArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m4731constructorimpl(float[] values) {
        kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
        return values;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m4732constructorimpl$default(float[] fArr, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m4731constructorimpl(fArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4733equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof e1) && kotlin.jvm.internal.e0.areEqual(fArr, ((e1) obj).m4753unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4734equalsimpl0(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.e0.areEqual(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m4735getimpl(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 4) + i11];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4736hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl, reason: not valid java name */
    public static final void m4737invertimpl(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 == 0.0f) {
            return;
        }
        float f39 = 1.0f / f38;
        fArr[0] = b0.e2.a(f17, f35, (f15 * f37) - (f16 * f36), f39);
        fArr[1] = e3.g.c(f13, f35, (f12 * f36) + ((-f11) * f37), f39);
        fArr[2] = b0.e2.a(f25, f29, (f23 * f31) - (f24 * f30), f39);
        fArr[3] = e3.g.c(f21, f29, (f20 * f30) + ((-f19) * f31), f39);
        float f40 = -f14;
        fArr[4] = e3.g.c(f17, f33, (f16 * f34) + (f40 * f37), f39);
        fArr[5] = b0.e2.a(f13, f33, (f37 * f10) - (f12 * f34), f39);
        float f41 = -f22;
        fArr[6] = e3.g.c(f25, f27, (f24 * f28) + (f41 * f31), f39);
        fArr[7] = b0.e2.a(f21, f27, (f18 * f31) - (f20 * f28), f39);
        fArr[8] = b0.e2.a(f17, f32, (f14 * f36) - (f15 * f34), f39);
        fArr[9] = e3.g.c(f13, f32, (f34 * f11) + ((-f10) * f36), f39);
        fArr[10] = b0.e2.a(f25, f26, (f22 * f30) - (f23 * f28), f39);
        fArr[11] = e3.g.c(f21, f26, (f19 * f28) + ((-f18) * f30), f39);
        fArr[12] = e3.g.c(f16, f32, (f15 * f33) + (f40 * f35), f39);
        fArr[13] = b0.e2.a(f12, f32, (f10 * f35) - (f11 * f33), f39);
        fArr[14] = e3.g.c(f24, f26, (f23 * f27) + (f41 * f29), f39);
        fArr[15] = b0.e2.a(f20, f26, (f18 * f29) - (f19 * f27), f39);
    }

    /* renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m4738mapMKHz9U(float[] fArr, long j10) {
        float fM4185getXimpl = i1.h.m4185getXimpl(j10);
        float fM4186getYimpl = i1.h.m4186getYimpl(j10);
        float f10 = 1 / (((fArr[7] * fM4186getYimpl) + (fArr[3] * fM4185getXimpl)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        return i1.i.Offset(((fArr[4] * fM4186getYimpl) + (fArr[0] * fM4185getXimpl) + fArr[12]) * f10, ((fArr[5] * fM4186getYimpl) + (fArr[1] * fM4185getXimpl) + fArr[13]) * f10);
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final i1.j m4739mapimpl(float[] fArr, i1.j rect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        long jM4738mapMKHz9U = m4738mapMKHz9U(fArr, i1.i.Offset(rect.getLeft(), rect.getTop()));
        long jM4738mapMKHz9U2 = m4738mapMKHz9U(fArr, i1.i.Offset(rect.getLeft(), rect.getBottom()));
        long jM4738mapMKHz9U3 = m4738mapMKHz9U(fArr, i1.i.Offset(rect.getRight(), rect.getTop()));
        long jM4738mapMKHz9U4 = m4738mapMKHz9U(fArr, i1.i.Offset(rect.getRight(), rect.getBottom()));
        return new i1.j(Math.min(Math.min(i1.h.m4185getXimpl(jM4738mapMKHz9U), i1.h.m4185getXimpl(jM4738mapMKHz9U2)), Math.min(i1.h.m4185getXimpl(jM4738mapMKHz9U3), i1.h.m4185getXimpl(jM4738mapMKHz9U4))), Math.min(Math.min(i1.h.m4186getYimpl(jM4738mapMKHz9U), i1.h.m4186getYimpl(jM4738mapMKHz9U2)), Math.min(i1.h.m4186getYimpl(jM4738mapMKHz9U3), i1.h.m4186getYimpl(jM4738mapMKHz9U4))), Math.max(Math.max(i1.h.m4185getXimpl(jM4738mapMKHz9U), i1.h.m4185getXimpl(jM4738mapMKHz9U2)), Math.max(i1.h.m4185getXimpl(jM4738mapMKHz9U3), i1.h.m4185getXimpl(jM4738mapMKHz9U4))), Math.max(Math.max(i1.h.m4186getYimpl(jM4738mapMKHz9U), i1.h.m4186getYimpl(jM4738mapMKHz9U2)), Math.max(i1.h.m4186getYimpl(jM4738mapMKHz9U3), i1.h.m4186getYimpl(jM4738mapMKHz9U4))));
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m4741resetimpl(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    /* renamed from: rotateX-impl, reason: not valid java name */
    public static final void m4742rotateXimpl(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[13];
        float f18 = fArr[14];
        fArr[1] = (f11 * fCos) - (f12 * fSin);
        fArr[2] = (f12 * fCos) + (f11 * fSin);
        fArr[5] = (f13 * fCos) - (f14 * fSin);
        fArr[6] = (f14 * fCos) + (f13 * fSin);
        fArr[9] = (f15 * fCos) - (f16 * fSin);
        fArr[10] = (f16 * fCos) + (f15 * fSin);
        fArr[13] = (f17 * fCos) - (f18 * fSin);
        fArr[14] = (f18 * fCos) + (f17 * fSin);
    }

    /* renamed from: rotateY-impl, reason: not valid java name */
    public static final void m4743rotateYimpl(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = fArr[8];
        float f16 = fArr[10];
        float f17 = fArr[12];
        float f18 = fArr[14];
        fArr[0] = (f12 * fSin) + (f11 * fCos);
        fArr[2] = (f12 * fCos) + ((-f11) * fSin);
        fArr[4] = (f14 * fSin) + (f13 * fCos);
        fArr[6] = (f14 * fCos) + ((-f13) * fSin);
        fArr[8] = (f16 * fSin) + (f15 * fCos);
        fArr[10] = (f16 * fCos) + ((-f15) * fSin);
        fArr[12] = (f18 * fSin) + (f17 * fCos);
        fArr[14] = (f18 * fCos) + ((-f17) * fSin);
    }

    /* renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m4744rotateZimpl(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = (fSin * f12) + (fCos * f11);
        float f14 = -fSin;
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = (fSin * f16) + (fCos * f15);
        float f18 = fArr[2];
        float f19 = fArr[6];
        float f20 = (fSin * f19) + (fCos * f18);
        float f21 = fArr[3];
        float f22 = fArr[7];
        fArr[0] = f13;
        fArr[1] = f17;
        fArr[2] = f20;
        fArr[3] = (fSin * f22) + (fCos * f21);
        fArr[4] = (f12 * fCos) + (f11 * f14);
        fArr[5] = (f16 * fCos) + (f15 * f14);
        fArr[6] = (f19 * fCos) + (f18 * f14);
        fArr[7] = (fCos * f22) + (f14 * f21);
    }

    /* renamed from: scale-impl, reason: not valid java name */
    public static final void m4745scaleimpl(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    /* renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4746scaleimpl$default(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 1.0f;
        }
        m4745scaleimpl(fArr, f10, f11, f12);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m4747setimpl(float[] fArr, int i10, int i11, float f10) {
        fArr[(i10 * 4) + i11] = f10;
    }

    /* renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m4748setFrom58bKbWc(float[] fArr, float[] matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        for (int i10 = 0; i10 < 16; i10++) {
            fArr[i10] = matrix[i10];
        }
    }

    /* renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m4749timesAssign58bKbWc(float[] fArr, float[] m9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(m9, "m");
        float fM4755access$dotp89u6pk = f1.m4755access$dotp89u6pk(fArr, 0, m9, 0);
        float fM4755access$dotp89u6pk2 = f1.m4755access$dotp89u6pk(fArr, 0, m9, 1);
        float fM4755access$dotp89u6pk3 = f1.m4755access$dotp89u6pk(fArr, 0, m9, 2);
        float fM4755access$dotp89u6pk4 = f1.m4755access$dotp89u6pk(fArr, 0, m9, 3);
        float fM4755access$dotp89u6pk5 = f1.m4755access$dotp89u6pk(fArr, 1, m9, 0);
        float fM4755access$dotp89u6pk6 = f1.m4755access$dotp89u6pk(fArr, 1, m9, 1);
        float fM4755access$dotp89u6pk7 = f1.m4755access$dotp89u6pk(fArr, 1, m9, 2);
        float fM4755access$dotp89u6pk8 = f1.m4755access$dotp89u6pk(fArr, 1, m9, 3);
        float fM4755access$dotp89u6pk9 = f1.m4755access$dotp89u6pk(fArr, 2, m9, 0);
        float fM4755access$dotp89u6pk10 = f1.m4755access$dotp89u6pk(fArr, 2, m9, 1);
        float fM4755access$dotp89u6pk11 = f1.m4755access$dotp89u6pk(fArr, 2, m9, 2);
        float fM4755access$dotp89u6pk12 = f1.m4755access$dotp89u6pk(fArr, 2, m9, 3);
        float fM4755access$dotp89u6pk13 = f1.m4755access$dotp89u6pk(fArr, 3, m9, 0);
        float fM4755access$dotp89u6pk14 = f1.m4755access$dotp89u6pk(fArr, 3, m9, 1);
        float fM4755access$dotp89u6pk15 = f1.m4755access$dotp89u6pk(fArr, 3, m9, 2);
        float fM4755access$dotp89u6pk16 = f1.m4755access$dotp89u6pk(fArr, 3, m9, 3);
        fArr[0] = fM4755access$dotp89u6pk;
        fArr[1] = fM4755access$dotp89u6pk2;
        fArr[2] = fM4755access$dotp89u6pk3;
        fArr[3] = fM4755access$dotp89u6pk4;
        fArr[4] = fM4755access$dotp89u6pk5;
        fArr[5] = fM4755access$dotp89u6pk6;
        fArr[6] = fM4755access$dotp89u6pk7;
        fArr[7] = fM4755access$dotp89u6pk8;
        fArr[8] = fM4755access$dotp89u6pk9;
        fArr[9] = fM4755access$dotp89u6pk10;
        fArr[10] = fM4755access$dotp89u6pk11;
        fArr[11] = fM4755access$dotp89u6pk12;
        fArr[12] = fM4755access$dotp89u6pk13;
        fArr[13] = fM4755access$dotp89u6pk14;
        fArr[14] = fM4755access$dotp89u6pk15;
        fArr[15] = fM4755access$dotp89u6pk16;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4750toStringimpl(float[] fArr) {
        return sv.d0.trimIndent("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl, reason: not valid java name */
    public static final void m4751translateimpl(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[8] * f12) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f14 = (fArr[9] * f12) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f15 = (fArr[10] * f12) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f16 = (fArr[11] * f12) + (fArr[7] * f11) + (fArr[3] * f10) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    /* renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4752translateimpl$default(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        m4751translateimpl(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return m4733equalsimpl(this.f68862a, obj);
    }

    public final float[] getValues() {
        return this.f68862a;
    }

    public int hashCode() {
        return m4736hashCodeimpl(this.f68862a);
    }

    public String toString() {
        return m4750toStringimpl(this.f68862a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m4753unboximpl() {
        return this.f68862a;
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final void m4740mapimpl(float[] fArr, i1.e rect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        long jM4738mapMKHz9U = m4738mapMKHz9U(fArr, i1.i.Offset(rect.getLeft(), rect.getTop()));
        long jM4738mapMKHz9U2 = m4738mapMKHz9U(fArr, i1.i.Offset(rect.getLeft(), rect.getBottom()));
        long jM4738mapMKHz9U3 = m4738mapMKHz9U(fArr, i1.i.Offset(rect.getRight(), rect.getTop()));
        long jM4738mapMKHz9U4 = m4738mapMKHz9U(fArr, i1.i.Offset(rect.getRight(), rect.getBottom()));
        rect.setLeft(Math.min(Math.min(i1.h.m4185getXimpl(jM4738mapMKHz9U), i1.h.m4185getXimpl(jM4738mapMKHz9U2)), Math.min(i1.h.m4185getXimpl(jM4738mapMKHz9U3), i1.h.m4185getXimpl(jM4738mapMKHz9U4))));
        rect.setTop(Math.min(Math.min(i1.h.m4186getYimpl(jM4738mapMKHz9U), i1.h.m4186getYimpl(jM4738mapMKHz9U2)), Math.min(i1.h.m4186getYimpl(jM4738mapMKHz9U3), i1.h.m4186getYimpl(jM4738mapMKHz9U4))));
        rect.setRight(Math.max(Math.max(i1.h.m4185getXimpl(jM4738mapMKHz9U), i1.h.m4185getXimpl(jM4738mapMKHz9U2)), Math.max(i1.h.m4185getXimpl(jM4738mapMKHz9U3), i1.h.m4185getXimpl(jM4738mapMKHz9U4))));
        rect.setBottom(Math.max(Math.max(i1.h.m4186getYimpl(jM4738mapMKHz9U), i1.h.m4186getYimpl(jM4738mapMKHz9U2)), Math.max(i1.h.m4186getYimpl(jM4738mapMKHz9U3), i1.h.m4186getYimpl(jM4738mapMKHz9U4))));
    }
}
