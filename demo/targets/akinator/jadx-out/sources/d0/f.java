package d0;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f51362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f51363f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x1.q1 q1Var, int i10) {
        super(1);
        this.f51362e = q1Var;
        this.f51363f = i10;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        int i10 = this.f51363f;
        q1.a.place$default(layout, this.f51362e, i10 / 2, i10 / 2, 0.0f, 4, null);
    }
}
