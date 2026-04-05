package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f73862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f73863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(o oVar, b0 b0Var) {
        super(1);
        this.f73862e = oVar;
        this.f73863f = b0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((u1.c0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(u1.c0 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        if (this.f73862e.mo5284onDrag3MmeM6k(it.m7295getPositionF1C5BW0(), this.f73863f)) {
            it.consume();
        }
    }
}
