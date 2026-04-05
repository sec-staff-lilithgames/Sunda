package d0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g3 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v5 f51381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(v5 v5Var) {
        super(1);
        this.f51381e = v5Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e2.u0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(e2.u0 semantics) {
        kotlin.jvm.internal.e0.checkNotNullParameter(semantics, "$this$semantics");
        semantics.set(y2.getMagnifierPositionInRoot(), new f3(this.f51381e));
    }
}
