package n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.r f75273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c1 f75274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(kv.r rVar, c1 c1Var) {
        super(2);
        this.f75273e = rVar;
        this.f75274f = c1Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
            return;
        }
        c1 c1Var = this.f75274f;
        this.f75273e.invoke(Float.valueOf(c1Var.f75337j.getViewportWidth()), Float.valueOf(c1Var.f75337j.getViewportHeight()), wVar, 0);
    }
}
