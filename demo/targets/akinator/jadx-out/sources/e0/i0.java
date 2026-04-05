package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.p f53101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(kv.p pVar) {
        super(1);
        this.f53101e = pVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((u1.c0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(u1.c0 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this.f53101e.invoke(it, i1.h.m4174boximpl(u1.n.positionChange(it)));
        it.consume();
    }
}
