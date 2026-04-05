package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1.b0 f51593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f51594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f51595g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l1.j f51596h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j1.b0 b0Var, long j10, long j11, l1.j jVar) {
        super(1);
        this.f51593e = b0Var;
        this.f51594f = j10;
        this.f51595g = j11;
        this.f51596h = jVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.e) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(l1.e onDrawWithContent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        l1.i.m5410drawRectAsUm42w$default(onDrawWithContent, this.f51593e, this.f51594f, this.f51595g, 0.0f, this.f51596h, null, 0, 104, null);
    }
}
