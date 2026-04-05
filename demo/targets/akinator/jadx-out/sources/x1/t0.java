package x1;

import java.util.List;
import z1.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 extends b0.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f91439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.p f91440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(r0 r0Var, kv.p pVar, String str) {
        super(str);
        this.f91439b = r0Var;
        this.f91440c = pVar;
    }

    @Override // z1.b0.b, x1.x0
    /* renamed from: measure-3p2s80s */
    public y0 mo79measure3p2s80s(a1 measure, List<? extends w0> measurables, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        r0 r0Var = this.f91439b;
        r0Var.f91415f.setLayoutDirection(measure.getLayoutDirection());
        r0Var.f91415f.setDensity(measure.getDensity());
        r0Var.f91415f.setFontScale(measure.getFontScale());
        r0Var.f91412c = 0;
        return new s0((y0) this.f91440c.invoke(r0Var.f91415f, s2.c.m6744boximpl(j10)), r0Var, r0Var.f91412c);
    }
}
