package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f11422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f11423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f11424g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(double d10, double d11, double d12) {
        super(1);
        this.f11422e = d10;
        this.f11423f = d11;
        this.f11424g = d12;
    }

    public final Double invoke(double d10) {
        double d11 = this.f11423f;
        return Double.valueOf(Math.exp(d11 * d10) * ((this.f11424g * d11) + (((d11 * d10) + 1) * this.f11422e)));
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
