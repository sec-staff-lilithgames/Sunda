package j1;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f68874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i2 f68875f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(x1.q1 q1Var, i2 i2Var) {
        super(1);
        this.f68874e = q1Var;
        this.f68875f = i2Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        q1.a.placeWithLayer$default(layout, this.f68874e, 0, 0, 0.0f, this.f68875f.f68898u, 4, null);
    }
}
