package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e2.m f51659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f51660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.a f51661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f51662h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f51663i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.a f51664j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(e2.m mVar, String str, kv.a aVar, String str2, boolean z10, kv.a aVar2) {
        super(1);
        this.f51659e = mVar;
        this.f51660f = str;
        this.f51661g = aVar;
        this.f51662h = str2;
        this.f51663i = z10;
        this.f51664j = aVar2;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e2.u0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(e2.u0 semantics) {
        kotlin.jvm.internal.e0.checkNotNullParameter(semantics, "$this$semantics");
        e2.m mVar = this.f51659e;
        if (mVar != null) {
            e2.r0.m3830setRolekuIjeqM(semantics, mVar.m3827unboximpl());
        }
        e2.r0.onClick(semantics, this.f51660f, new v0(this.f51664j));
        kv.a aVar = this.f51661g;
        if (aVar != null) {
            e2.r0.onLongClick(semantics, this.f51662h, new w0(aVar));
        }
        if (this.f51663i) {
            return;
        }
        e2.r0.disabled(semantics);
    }
}
