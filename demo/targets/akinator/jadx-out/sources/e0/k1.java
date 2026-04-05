package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v1.f f53139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y0 f53140f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(v1.f fVar, kotlin.jvm.internal.y0 y0Var) {
        super(2);
        this.f53139e = fVar;
        this.f53140f = y0Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((u1.c0) obj, ((Number) obj2).floatValue());
        return tu.x0.f87415a;
    }

    public final void invoke(u1.c0 event, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        v1.g.addPointerInputChange(this.f53139e, event);
        event.consume();
        this.f53140f.f71865b = f10;
    }
}
