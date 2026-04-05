package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d3 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(p0.j2 j2Var) {
        super(1);
        this.f51356e = j2Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((x1.d0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(x1.d0 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this.f51356e.setValue(i1.h.m4174boximpl(x1.e0.positionInRoot(it)));
    }
}
