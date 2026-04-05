package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f11453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f11454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f11455g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f11456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(double d10, double d11, double d12, double d13) {
        super(1);
        this.f11453e = d10;
        this.f11454f = d11;
        this.f11455g = d12;
        this.f11456h = d13;
    }

    public final Double invoke(double d10) {
        double d11 = this.f11453e;
        double d12 = this.f11454f;
        double dExp = Math.exp(d12 * d10) * d11 * d12;
        double d13 = this.f11455g;
        double d14 = this.f11456h;
        return Double.valueOf((Math.exp(d14 * d10) * d13 * d14) + dExp);
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
