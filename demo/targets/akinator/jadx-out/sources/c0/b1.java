package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f11413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f11414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f11415g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f11416h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(double d10, double d11, double d12, double d13) {
        super(1);
        this.f11413e = d10;
        this.f11414f = d11;
        this.f11415g = d12;
        this.f11416h = d13;
    }

    public final Double invoke(double d10) {
        return Double.valueOf((Math.exp(this.f11415g * d10) * ((this.f11414f * d10) + this.f11413e)) + this.f11416h);
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
