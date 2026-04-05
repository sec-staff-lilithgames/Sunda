package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f73673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f73674f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z10, long j10) {
        super(1);
        this.f73673e = z10;
        this.f73674f = j10;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e2.u0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(e2.u0 semantics) {
        kotlin.jvm.internal.e0.checkNotNullParameter(semantics, "$this$semantics");
        semantics.set(e0.getSelectionHandleInfoKey(), new d0(this.f73673e ? l0.q.f72149c : l0.q.f72150e, this.f73674f, null));
    }
}
