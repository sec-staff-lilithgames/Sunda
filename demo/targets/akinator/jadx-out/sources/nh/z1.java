package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z1 extends b2 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f76806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f2 f76807h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(f2 f2Var, int i10) {
        super(f2Var);
        this.f76806g = i10;
        this.f76807h = f2Var;
    }

    @Override // nh.b2
    public final Object a(int i10) {
        switch (this.f76806g) {
            case 0:
                return this.f76807h.r()[i10];
            case 1:
                return new d2(this.f76807h, i10);
            default:
                return this.f76807h.s()[i10];
        }
    }
}
