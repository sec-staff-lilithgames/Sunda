package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o5 extends k5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wr.m2 f92846c;

    public /* synthetic */ o5(wr.m2 m2Var, int i10) {
        this.f92845b = i10;
        this.f92846c = m2Var;
    }

    @Override // xr.k5
    public final void a() {
        switch (this.f92845b) {
            case 0:
                i6 i6Var = (i6) this.f92846c;
                i6Var.f92612e.w(i6Var);
                break;
            case 1:
                ((u8) this.f92846c).e();
                break;
            default:
                ((yr.d0) this.f92846c).f94856h.transportInUse(true);
                break;
        }
    }

    @Override // xr.k5
    public final void b() {
        switch (this.f92845b) {
            case 0:
                i6 i6Var = (i6) this.f92846c;
                i6Var.f92612e.x(i6Var);
                break;
            case 1:
                u8 u8Var = (u8) this.f92846c;
                if (!u8Var.N.get()) {
                    u8Var.h();
                    break;
                }
                break;
            default:
                ((yr.d0) this.f92846c).f94856h.transportInUse(false);
                break;
        }
    }
}
