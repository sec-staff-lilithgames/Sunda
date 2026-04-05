package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1 f73827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(h1 h1Var) {
        super(1);
        this.f73827e = h1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return tu.x0.f87415a;
    }

    public final void invoke(long j10) {
        Long lValueOf = Long.valueOf(j10);
        h1 h1Var = this.f73827e;
        if (h1Var.f73722a.getSubselections().containsKey(lValueOf)) {
            h1Var.onRelease();
            h1Var.setSelection(null);
        }
    }
}
