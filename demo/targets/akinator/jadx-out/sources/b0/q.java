package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.p f8478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i10, kv.p pVar) {
        super(3);
        this.f8478e = pVar;
        this.f8479f = i10;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((c0) obj, (p0.w) obj2, ((Number) obj3).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(c0 AnimatedVisibility, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if ((i10 & 81) == 16 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
        } else {
            this.f8478e.invoke(wVar, Integer.valueOf((this.f8479f >> 15) & 14));
        }
    }
}
