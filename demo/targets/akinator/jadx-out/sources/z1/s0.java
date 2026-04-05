package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final s0 f97401e = new s0(1);

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((u0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(u0 wrapper) {
        kotlin.jvm.internal.e0.checkNotNullParameter(wrapper, "wrapper");
        p1 layer = wrapper.getLayer();
        if (layer != null) {
            layer.invalidate();
        }
    }
}
