package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f3725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(i0 i0Var) {
        super(1);
        this.f3725e = i0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((p4) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(p4 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        i0.access$sendScrollEventIfNeeded(this.f3725e, it);
    }
}
