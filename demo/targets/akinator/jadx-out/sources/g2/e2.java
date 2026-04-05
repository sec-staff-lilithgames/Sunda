package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e2 {
    public static final f0 access$createPlatformTextStyleInternal(d0 d0Var, c0 c0Var) {
        if (d0Var == null && c0Var == null) {
            return null;
        }
        return a.createPlatformTextStyle(d0Var, c0Var);
    }

    public static final c2 lerp(c2 start, c2 stop, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(stop, "stop");
        return new c2(t1.lerp(start.toSpanStyle(), stop.toSpanStyle(), f10), y.lerp(start.toParagraphStyle(), stop.toParagraphStyle(), f10));
    }

    public static final c2 resolveDefaults(c2 style, s2.x direction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
        return new c2(t1.resolveSpanStyleDefaults(style.getSpanStyle$ui_text_release()), y.resolveParagraphStyleDefaults(style.getParagraphStyle$ui_text_release(), direction), style.getPlatformStyle());
    }

    /* renamed from: resolveTextDirection-Yj3eThk, reason: not valid java name */
    public static final int m3991resolveTextDirectionYj3eThk(s2.x layoutDirection, r2.p pVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        r2.o oVar = r2.p.f83714b;
        if (pVar == null ? false : r2.p.m6087equalsimpl0(pVar.m6090unboximpl(), oVar.m6079getContents_7Xco())) {
            int i10 = d2.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i10 == 1) {
                return oVar.m6080getContentOrLtrs_7Xco();
            }
            if (i10 == 2) {
                return oVar.m6081getContentOrRtls_7Xco();
            }
            throw new tu.t();
        }
        if (pVar != null) {
            return pVar.m6090unboximpl();
        }
        int i11 = d2.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i11 == 1) {
            return oVar.m6082getLtrs_7Xco();
        }
        if (i11 == 2) {
            return oVar.m6083getRtls_7Xco();
        }
        throw new tu.t();
    }
}
