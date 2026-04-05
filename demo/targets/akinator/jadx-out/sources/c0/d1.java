package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f11431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f11432f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f11433g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f11434h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f11435i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(double d10, double d11, double d12, double d13, double d14) {
        super(1);
        this.f11431e = d10;
        this.f11432f = d11;
        this.f11433g = d12;
        this.f11434h = d13;
        this.f11435i = d14;
    }

    public final Double invoke(double d10) {
        return Double.valueOf((Math.exp(this.f11434h * d10) * this.f11433g) + (Math.exp(this.f11432f * d10) * this.f11431e) + this.f11435i);
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
