package j1;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f69055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f69056f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x1.q1 q1Var, a0 a0Var) {
        super(1);
        this.f69055e = q1Var;
        this.f69056f = a0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        q1.a.placeWithLayer$default(layout, this.f69055e, 0, 0, 0.0f, this.f69056f.f68818e, 4, null);
    }
}
