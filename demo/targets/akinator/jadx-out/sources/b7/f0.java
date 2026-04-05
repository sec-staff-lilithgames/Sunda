package b7;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import l7.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8842a = s2.c.f85320b.m6738fixedJhjzzOo(0, 0);

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final float m134constrainHeightK40F9xA(long j10, float f10) {
        return qv.v.coerceIn(f10, s2.c.m6756getMinHeightimpl(j10), s2.c.m6754getMaxHeightimpl(j10));
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final float m135constrainWidthK40F9xA(long j10, float f10) {
        return qv.v.coerceIn(f10, s2.c.m6757getMinWidthimpl(j10), s2.c.m6755getMaxWidthimpl(j10));
    }

    public static final long getZeroConstraints() {
        return f8842a;
    }

    public static final kv.l onStateOf(kv.l lVar, kv.l lVar2, kv.l lVar3) {
        if (lVar == null && lVar2 == null && lVar3 == null) {
            return null;
        }
        return new d0(lVar, lVar2, lVar3);
    }

    public static final l7.i requestOf(Object obj, p0.w wVar, int i10) {
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(1151830858, i10, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        return obj instanceof l7.i ? (l7.i) obj : new i.a((Context) wVar.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(obj).build();
    }

    public static final float takeOrElse(float f10, kv.a aVar) {
        return (Float.isInfinite(f10) || Float.isNaN(f10)) ? ((Number) aVar.invoke()).floatValue() : f10;
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m136toIntSizeuvyYCjk(long j10) {
        return s2.w.IntSize(mv.d.roundToInt(i1.o.m4252getWidthimpl(j10)), mv.d.roundToInt(i1.o.m4249getHeightimpl(j10)));
    }

    public static final m7.i toScale(x1.r rVar) {
        x1.q qVar = x1.r.f91409a;
        return kotlin.jvm.internal.e0.areEqual(rVar, qVar.getFit()) ? true : kotlin.jvm.internal.e0.areEqual(rVar, qVar.getInside()) ? m7.i.f74063c : m7.i.f74062b;
    }

    public static final kv.l transformOf(m1.e eVar, m1.e eVar2, m1.e eVar3) {
        return (eVar == null && eVar2 == null && eVar3 == null) ? i.f8845w.getDefaultTransform() : new e0(eVar, eVar3, eVar2);
    }
}
