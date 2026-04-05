package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final h1 f97314e = new h1(1);

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((i1) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(i1 node) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        node.notifyConsumerOfChanges();
    }
}
