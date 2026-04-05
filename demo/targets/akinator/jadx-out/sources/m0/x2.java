package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f73858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(o oVar) {
        super(1);
        this.f73858e = oVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((u1.c0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(u1.c0 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        if (this.f73858e.mo5286onExtendDragk4lQ0M(it.m7295getPositionF1C5BW0())) {
            it.consume();
        }
    }
}
