package n0;

import g0.f2;
import g0.i2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f74975a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final i2 f74976b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f74977c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f74978d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f74979e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f74980f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f74981g;

    /* renamed from: h, reason: collision with root package name */
    public static final i2 f74982h;

    static {
        float fM6817constructorimpl = s2.i.m6817constructorimpl(16);
        float f10 = 8;
        float fM6817constructorimpl2 = s2.i.m6817constructorimpl(f10);
        i2 i2VarM3873PaddingValuesa9UjIt4 = f2.m3873PaddingValuesa9UjIt4(fM6817constructorimpl, fM6817constructorimpl2, fM6817constructorimpl, fM6817constructorimpl2);
        f74976b = i2VarM3873PaddingValuesa9UjIt4;
        f74977c = s2.i.m6817constructorimpl(64);
        f74978d = s2.i.m6817constructorimpl(36);
        f74979e = s2.i.m6817constructorimpl(18);
        f74980f = s2.i.m6817constructorimpl(f10);
        f74981g = s2.i.m6817constructorimpl(1);
        float fM6817constructorimpl3 = s2.i.m6817constructorimpl(f10);
        f74982h = f2.m3873PaddingValuesa9UjIt4(fM6817constructorimpl3, i2VarM3873PaddingValuesa9UjIt4.mo3844calculateTopPaddingD9Ej5fM(), fM6817constructorimpl3, i2VarM3873PaddingValuesa9UjIt4.mo3841calculateBottomPaddingD9Ej5fM());
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final a m5643buttonColorsro_MJ88(long j10, long j11, long j12, long j13, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(1870371134);
        int i12 = i11 & 1;
        i0 i0Var = i0.f75090a;
        long jM5677getPrimary0d7_KjU = i12 != 0 ? i0Var.getColors(wVar, 6).m5677getPrimary0d7_KjU() : j10;
        q qVar = new q(jM5677getPrimary0d7_KjU, (i11 & 2) != 0 ? k.m5695contentColorForek8zF_U(jM5677getPrimary0d7_KjU, wVar, i10 & 14) : j11, (i11 & 4) != 0 ? j1.o0.m4886compositeOverOWjLjI(j1.m0.m4857copywmQWz5c$default(i0Var.getColors(wVar, 6).m5676getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), i0Var.getColors(wVar, 6).m5681getSurface0d7_KjU()) : j12, (i11 & 8) != 0 ? j1.m0.m4857copywmQWz5c$default(i0Var.getColors(wVar, 6).m5676getOnSurface0d7_KjU(), l.f75121a.getDisabled(wVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13, null);
        wVar.endReplaceableGroup();
        return qVar;
    }

    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final c m5644elevationR_JCAzs(float f10, float f11, float f12, float f13, float f14, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(-737170518);
        if ((i11 & 1) != 0) {
            f10 = s2.i.m6817constructorimpl(2);
        }
        float f15 = f10;
        if ((i11 & 2) != 0) {
            f11 = s2.i.m6817constructorimpl(8);
        }
        float f16 = f11;
        if ((i11 & 4) != 0) {
            f12 = s2.i.m6817constructorimpl(0);
        }
        float f17 = f12;
        if ((i11 & 8) != 0) {
            f13 = s2.i.m6817constructorimpl(4);
        }
        float f18 = f13;
        if ((i11 & 16) != 0) {
            f14 = s2.i.m6817constructorimpl(4);
        }
        float f19 = f14;
        Object[] objArr = {s2.i.m6815boximpl(f15), s2.i.m6815boximpl(f16), s2.i.m6815boximpl(f17), s2.i.m6815boximpl(f18), s2.i.m6815boximpl(f19)};
        wVar.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 5; i12++) {
            zChanged |= wVar.changed(objArr[i12]);
        }
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            v vVar = new v(f15, f16, f17, f18, f19, null);
            wVar.updateRememberedValue(vVar);
            objRememberedValue = vVar;
        }
        wVar.endReplaceableGroup();
        v vVar2 = (v) objRememberedValue;
        wVar.endReplaceableGroup();
        return vVar2;
    }

    @tu.f
    /* renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ c m5645elevationyajeYGU(float f10, float f11, float f12, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(1428576874);
        if ((i11 & 1) != 0) {
            f10 = s2.i.m6817constructorimpl(2);
        }
        float f13 = f10;
        if ((i11 & 2) != 0) {
            f11 = s2.i.m6817constructorimpl(8);
        }
        float f14 = f11;
        if ((i11 & 4) != 0) {
            f12 = s2.i.m6817constructorimpl(0);
        }
        float f15 = 4;
        c cVarM5644elevationR_JCAzs = m5644elevationR_JCAzs(f13, f14, f12, s2.i.m6817constructorimpl(f15), s2.i.m6817constructorimpl(f15), wVar, (i10 & 14) | 27648 | (i10 & 112) | (i10 & 896) | ((i10 << 6) & 458752), 0);
        wVar.endReplaceableGroup();
        return cVarM5644elevationR_JCAzs;
    }

    public final i2 getContentPadding() {
        return f74976b;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5646getIconSizeD9Ej5fM() {
        return f74979e;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m5647getIconSpacingD9Ej5fM() {
        return f74980f;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m5648getMinHeightD9Ej5fM() {
        return f74978d;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m5649getMinWidthD9Ej5fM() {
        return f74977c;
    }

    public final d0.v getOutlinedBorder(p0.w wVar, int i10) {
        wVar.startReplaceableGroup(-2091313033);
        d0.v vVarM3734BorderStrokecXLIe8U = d0.w.m3734BorderStrokecXLIe8U(f74981g, j1.m0.m4857copywmQWz5c$default(i0.f75090a.getColors(wVar, 6).m5676getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        wVar.endReplaceableGroup();
        return vVarM3734BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m5650getOutlinedBorderSizeD9Ej5fM() {
        return f74981g;
    }

    public final i2 getTextButtonContentPadding() {
        return f74982h;
    }

    /* renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final a m5651outlinedButtonColorsRGew2ao(long j10, long j11, long j12, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(-2124406093);
        int i12 = i11 & 1;
        i0 i0Var = i0.f75090a;
        long jM5681getSurface0d7_KjU = i12 != 0 ? i0Var.getColors(wVar, 6).m5681getSurface0d7_KjU() : j10;
        q qVar = new q(jM5681getSurface0d7_KjU, (i11 & 2) != 0 ? i0Var.getColors(wVar, 6).m5677getPrimary0d7_KjU() : j11, jM5681getSurface0d7_KjU, (i11 & 4) != 0 ? j1.m0.m4857copywmQWz5c$default(i0Var.getColors(wVar, 6).m5676getOnSurface0d7_KjU(), l.f75121a.getDisabled(wVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12, null);
        wVar.endReplaceableGroup();
        return qVar;
    }

    /* renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final a m5652textButtonColorsRGew2ao(long j10, long j11, long j12, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(182742216);
        long jM4834getTransparent0d7_KjU = (i11 & 1) != 0 ? j1.m0.f68918b.m4834getTransparent0d7_KjU() : j10;
        int i12 = i11 & 2;
        i0 i0Var = i0.f75090a;
        q qVar = new q(jM4834getTransparent0d7_KjU, i12 != 0 ? i0Var.getColors(wVar, 6).m5677getPrimary0d7_KjU() : j11, jM4834getTransparent0d7_KjU, (i11 & 4) != 0 ? j1.m0.m4857copywmQWz5c$default(i0Var.getColors(wVar, 6).m5676getOnSurface0d7_KjU(), l.f75121a.getDisabled(wVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12, null);
        wVar.endReplaceableGroup();
        return qVar;
    }
}
