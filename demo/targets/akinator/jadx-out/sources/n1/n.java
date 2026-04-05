package n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f75472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar) {
        super(1);
        this.f75472e = qVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.i) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(l1.i iVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "$this$null");
        this.f75472e.getRoot().draw(iVar);
    }
}
