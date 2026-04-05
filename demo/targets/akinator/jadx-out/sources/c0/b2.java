package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1 f11417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f11418f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(z1 z1Var, float f10) {
        super(1);
        this.f11417e = z1Var;
        this.f11418f = f10;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return tu.x0.f87415a;
    }

    public final void invoke(long j10) {
        z1 z1Var = this.f11417e;
        if (z1Var.isSeeking()) {
            return;
        }
        z1Var.onFrame$animation_core_release(j10, this.f11418f);
    }
}
