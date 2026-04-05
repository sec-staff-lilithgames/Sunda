package tm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 implements um.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f87036a;

    public f0(l0 l0Var) {
        this.f87036a = l0Var;
    }

    @Override // um.x
    public void onTimerFinish() {
        l0 l0Var = this.f87036a;
        um.v vVar = l0Var.H;
        if (vVar != null) {
            vVar.detach();
        }
        if (l0Var.f87077k.isOpenNotified() || !l0Var.f87092z || l0Var.f87088v <= 0.0f) {
            return;
        }
        l0Var.g();
    }

    @Override // um.x
    public void onTimerTick(float f10, long j10, long j11) {
        int i10 = (int) (j11 / 1000);
        int i11 = (int) (j10 / 1000);
        um.v vVar = this.f87036a.H;
        if (vVar != null) {
            vVar.changePercentage(f10, i11, i10);
        }
    }
}
