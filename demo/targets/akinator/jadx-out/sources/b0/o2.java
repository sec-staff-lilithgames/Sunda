package b0;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f8458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f8459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8460g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(q2 q2Var, x1.q1 q1Var, long j10) {
        super(1);
        this.f8458e = q2Var;
        this.f8459f = q1Var;
        this.f8460g = j10;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        q2 q2Var = this.f8458e;
        q1.a.m7842placeWithLayeraW9wM$default(layout, this.f8459f, ((s2.q) q2Var.getLazyAnimation().animate(q2Var.getTransitionSpec(), new n2(q2Var, this.f8460g)).getValue()).m6939unboximpl(), 0.0f, null, 6, null);
    }
}
