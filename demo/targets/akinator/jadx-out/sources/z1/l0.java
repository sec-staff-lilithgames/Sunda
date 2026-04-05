package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f97338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0.c f97339f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b0 b0Var, r0.c cVar) {
        super(2);
        this.f97338e = b0Var;
        this.f97339f = cVar;
    }

    @Override // kv.p
    public final k1 invoke(k1 lastProvider, e1.u mod) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lastProvider, "lastProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(mod, "mod");
        boolean z10 = mod instanceof y1.b;
        b0 b0Var = this.f97338e;
        if (z10) {
            b0.access$addModifierLocalConsumer(b0Var, (y1.b) mod, lastProvider, this.f97339f);
        }
        return mod instanceof y1.d ? b0.access$addModifierLocalProvider(b0Var, (y1.d) mod, lastProvider) : lastProvider;
    }
}
