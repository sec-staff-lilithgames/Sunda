package io.odeeo.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "io.odeeo.sdk.AdUnit", f = "AdUnit.kt", i = {0}, l = {487, 491}, m = "isAdShowAllowedOrNotifyFailure", n = {"this"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class AdUnit$isAdShowAllowedOrNotifyFailure$1 extends bv.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f67882a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f67883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67884c;

    /* renamed from: d, reason: collision with root package name */
    public int f67885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnit$isAdShowAllowedOrNotifyFailure$1(AdUnit adUnit, zu.d<? super AdUnit$isAdShowAllowedOrNotifyFailure$1> dVar) {
        super(dVar);
        this.f67884c = adUnit;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f67883b = obj;
        this.f67885d |= Integer.MIN_VALUE;
        return this.f67884c.b(this);
    }
}
