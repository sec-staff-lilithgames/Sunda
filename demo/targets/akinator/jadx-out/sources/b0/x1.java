package b0;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f8552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f8553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8554g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(x1.q1 q1Var, long j10, long j11) {
        super(1);
        this.f8552e = q1Var;
        this.f8553f = j10;
        this.f8554g = j11;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        long j10 = this.f8553f;
        int iM6930getXimpl = s2.q.m6930getXimpl(j10);
        long j11 = this.f8554g;
        q1.a.place$default(layout, this.f8552e, s2.q.m6930getXimpl(j11) + iM6930getXimpl, s2.q.m6931getYimpl(j11) + s2.q.m6931getYimpl(j10), 0.0f, 4, null);
    }
}
