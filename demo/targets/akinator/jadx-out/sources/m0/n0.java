package m0;

import c0.h3;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0.s f73796a = new c0.s(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final c0.n2 f73797b = h3.TwoWayConverter(f0.f73708e, g0.f73715e);

    /* renamed from: c, reason: collision with root package name */
    public static final long f73798c;

    /* renamed from: d, reason: collision with root package name */
    public static final c0.i1 f73799d;

    static {
        long jOffset = i1.i.Offset(0.01f, 0.01f);
        f73798c = jOffset;
        f73799d = new c0.i1(0.0f, 0.0f, i1.h.m4174boximpl(jOffset), 3, null);
    }

    public static final v5 access$rememberAnimatedMagnifierPosition(kv.a aVar, p0.w wVar, int i10) {
        wVar.startReplaceableGroup(-1589795249);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = z4.derivedStateOf(aVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        v5 v5Var = (v5) objRememberedValue;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = new c0.e(i1.h.m4174boximpl(((i1.h) v5Var.getValue()).m4195unboximpl()), f73797b, i1.h.m4174boximpl(f73798c));
            wVar.updateRememberedValue(objRememberedValue2);
        }
        wVar.endReplaceableGroup();
        c0.e eVar = (c0.e) objRememberedValue2;
        p0.k1.LaunchedEffect(tu.x0.f87415a, new m0(v5Var, eVar, null), wVar, 0);
        v5 v5VarAsState = eVar.asState();
        wVar.endReplaceableGroup();
        return v5VarAsState;
    }

    public static final e1.v animatedSelectionMagnifier(e1.v vVar, kv.a magnifierCenter, kv.l platformMagnifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformMagnifier, "platformMagnifier");
        return e1.o.composed$default(vVar, null, new i0(magnifierCenter, platformMagnifier), 1, null);
    }
}
