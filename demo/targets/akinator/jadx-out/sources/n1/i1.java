package n1;

import a2.a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i1 {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RenderVectorGroup(n1.v0 r23, java.util.Map<java.lang.String, ? extends n1.t0> r24, p0.w r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.i1.RenderVectorGroup(n1.v0, java.util.Map, p0.w, int, int):void");
    }

    public static final c1 rememberVectorPainter(c image, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        wVar.startReplaceableGroup(1413834416);
        c1 c1VarM5725rememberVectorPaintervIP8VLU = m5725rememberVectorPaintervIP8VLU(image.m5710getDefaultWidthD9Ej5fM(), image.m5709getDefaultHeightD9Ej5fM(), image.getViewportWidth(), image.getViewportHeight(), image.getName(), image.m5712getTintColor0d7_KjU(), image.m5711getTintBlendMode0nO6VwU(), image.getAutoMirror(), z0.u.composableLambda(wVar, 1873274766, true, new h1(image)), wVar, 100663296, 0);
        wVar.endReplaceableGroup();
        return c1VarM5725rememberVectorPaintervIP8VLU;
    }

    @tu.f
    /* renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final c1 m5724rememberVectorPaintermlNsNFs(float f10, float f11, float f12, float f13, String str, long j10, int i10, kv.r content, p0.w wVar, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        wVar.startReplaceableGroup(-964365210);
        c1 c1VarM5725rememberVectorPaintervIP8VLU = m5725rememberVectorPaintervIP8VLU(f10, f11, (i12 & 4) != 0 ? Float.NaN : f12, (i12 & 8) != 0 ? Float.NaN : f13, (i12 & 16) != 0 ? "VectorRootGroup" : str, (i12 & 32) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j10, (i12 & 64) != 0 ? j1.x.f69020b.m5060getSrcIn0nO6VwU() : i10, false, content, wVar, (i11 & 14) | 12582912 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | ((i11 << 3) & 234881024), 0);
        wVar.endReplaceableGroup();
        return c1VarM5725rememberVectorPaintervIP8VLU;
    }

    /* renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    public static final c1 m5725rememberVectorPaintervIP8VLU(float f10, float f11, float f12, float f13, String str, long j10, int i10, boolean z10, kv.r content, p0.w wVar, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        wVar.startReplaceableGroup(1068590786);
        float f14 = (i12 & 4) != 0 ? Float.NaN : f12;
        float f15 = (i12 & 8) == 0 ? f13 : Float.NaN;
        String str2 = (i12 & 16) != 0 ? "VectorRootGroup" : str;
        long jM4835getUnspecified0d7_KjU = (i12 & 32) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j10;
        int iM5060getSrcIn0nO6VwU = (i12 & 64) != 0 ? j1.x.f69020b.m5060getSrcIn0nO6VwU() : i10;
        boolean z11 = (i12 & 128) != 0 ? false : z10;
        s2.e eVar = (s2.e) wVar.consume(a3.getLocalDensity());
        float fMo3425toPx0680j_4 = eVar.mo3425toPx0680j_4(f10);
        float fMo3425toPx0680j_42 = eVar.mo3425toPx0680j_4(f11);
        if (Float.isNaN(f14)) {
            f14 = fMo3425toPx0680j_4;
        }
        if (Float.isNaN(f15)) {
            f15 = fMo3425toPx0680j_42;
        }
        j1.m0 m0VarM4848boximpl = j1.m0.m4848boximpl(jM4835getUnspecified0d7_KjU);
        j1.x xVarM5067boximpl = j1.x.m5067boximpl(iM5060getSrcIn0nO6VwU);
        int i13 = i11 >> 15;
        wVar.startReplaceableGroup(511388516);
        boolean zChanged = wVar.changed(m0VarM4848boximpl) | wVar.changed(xVarM5067boximpl);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (zChanged || objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = !j1.m0.m4859equalsimpl0(jM4835getUnspecified0d7_KjU, j1.m0.f68918b.m4835getUnspecified0d7_KjU()) ? j1.n0.f68934b.m4875tintxETnrds(jM4835getUnspecified0d7_KjU, iM5060getSrcIn0nO6VwU) : null;
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        j1.n0 n0Var = (j1.n0) objRememberedValue;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = new c1();
            wVar.updateRememberedValue(objRememberedValue2);
        }
        wVar.endReplaceableGroup();
        c1 c1Var = (c1) objRememberedValue2;
        c1Var.m5716setSizeuvyYCjk$ui_release(i1.p.Size(fMo3425toPx0680j_4, fMo3425toPx0680j_42));
        c1Var.setAutoMirror$ui_release(z11);
        c1Var.setIntrinsicColorFilter$ui_release(n0Var);
        c1Var.RenderVector$ui_release(str2, f14, f15, content, wVar, ((i11 >> 12) & 14) | 32768 | (i13 & 7168));
        wVar.endReplaceableGroup();
        return c1Var;
    }
}
