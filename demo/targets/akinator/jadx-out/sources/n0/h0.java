package n0;

import m0.s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h0 {
    public static final float a(long j10, long j11, long j12, float f10) {
        long jM4886compositeOverOWjLjI = j1.o0.m4886compositeOverOWjLjI(j1.m0.m4857copywmQWz5c$default(j10, f10, 0.0f, 0.0f, 0.0f, 14, null), j12);
        return m5666calculateContrastRatioOWjLjI(j1.o0.m4886compositeOverOWjLjI(j11, jM4886compositeOverOWjLjI), jM4886compositeOverOWjLjI);
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m5666calculateContrastRatioOWjLjI(long j10, long j11) {
        float fM4892luminance8_81llA = j1.o0.m4892luminance8_81llA(j10) + 0.05f;
        float fM4892luminance8_81llA2 = j1.o0.m4892luminance8_81llA(j11) + 0.05f;
        return Math.max(fM4892luminance8_81llA, fM4892luminance8_81llA2) / Math.min(fM4892luminance8_81llA, fM4892luminance8_81llA2);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m5667calculateSelectionBackgroundColorysEtTa8(long j10, long j11, long j12) {
        float f10;
        float fA = a(j10, j11, j12, 0.4f);
        float fA2 = a(j10, j11, j12, 0.2f);
        float f11 = 0.4f;
        if (fA >= 4.5f) {
            f10 = 0.4f;
        } else {
            float f12 = 0.2f;
            if (fA2 < 4.5f) {
                f10 = 0.2f;
            } else {
                float f13 = 0.4f;
                for (int i10 = 0; i10 < 7; i10++) {
                    float fA3 = (a(j10, j11, j12, f13) / 4.5f) - 1.0f;
                    if (0.0f <= fA3 && fA3 <= 0.01f) {
                        break;
                    }
                    if (fA3 < 0.0f) {
                        f11 = f13;
                    } else {
                        f12 = f13;
                    }
                    f13 = (f11 + f12) / 2.0f;
                }
                f10 = f13;
            }
        }
        return j1.m0.m4857copywmQWz5c$default(j10, f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final s2 rememberTextSelectionColors(i colors, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        wVar.startReplaceableGroup(-721696685);
        long jM5677getPrimary0d7_KjU = colors.m5677getPrimary0d7_KjU();
        long jM5670getBackground0d7_KjU = colors.m5670getBackground0d7_KjU();
        wVar.startReplaceableGroup(35572910);
        long jM5694contentColorFor4WTKRHQ = k.m5694contentColorFor4WTKRHQ(colors, jM5670getBackground0d7_KjU);
        if (jM5694contentColorFor4WTKRHQ == j1.m0.f68918b.m4835getUnspecified0d7_KjU()) {
            jM5694contentColorFor4WTKRHQ = ((j1.m0) wVar.consume(p.getLocalContentColor())).m4868unboximpl();
        }
        long j10 = jM5694contentColorFor4WTKRHQ;
        wVar.endReplaceableGroup();
        long jM4857copywmQWz5c$default = j1.m0.m4857copywmQWz5c$default(j10, l.f75121a.getMedium(wVar, 6), 0.0f, 0.0f, 0.0f, 14, null);
        j1.m0 m0VarM4848boximpl = j1.m0.m4848boximpl(jM5677getPrimary0d7_KjU);
        j1.m0 m0VarM4848boximpl2 = j1.m0.m4848boximpl(jM5670getBackground0d7_KjU);
        j1.m0 m0VarM4848boximpl3 = j1.m0.m4848boximpl(jM4857copywmQWz5c$default);
        wVar.startReplaceableGroup(1618982084);
        boolean zChanged = wVar.changed(m0VarM4848boximpl) | wVar.changed(m0VarM4848boximpl2) | wVar.changed(m0VarM4848boximpl3);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            s2 s2Var = new s2(colors.m5677getPrimary0d7_KjU(), m5667calculateSelectionBackgroundColorysEtTa8(jM5677getPrimary0d7_KjU, jM4857copywmQWz5c$default, jM5670getBackground0d7_KjU), null);
            wVar.updateRememberedValue(s2Var);
            objRememberedValue = s2Var;
        }
        wVar.endReplaceableGroup();
        s2 s2Var2 = (s2) objRememberedValue;
        wVar.endReplaceableGroup();
        return s2Var2;
    }
}
