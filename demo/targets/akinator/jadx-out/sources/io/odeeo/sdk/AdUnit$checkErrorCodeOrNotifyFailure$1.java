package io.odeeo.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "io.odeeo.sdk.AdUnit", f = "AdUnit.kt", i = {}, l = {500}, m = "checkErrorCodeOrNotifyFailure", n = {}, s = {})
/* loaded from: classes10.dex */
public final class AdUnit$checkErrorCodeOrNotifyFailure$1 extends bv.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f67865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67866b;

    /* renamed from: c, reason: collision with root package name */
    public int f67867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnit$checkErrorCodeOrNotifyFailure$1(AdUnit adUnit, zu.d<? super AdUnit$checkErrorCodeOrNotifyFailure$1> dVar) {
        super(dVar);
        this.f67866b = adUnit;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f67865a = obj;
        this.f67867c |= Integer.MIN_VALUE;
        return this.f67866b.a(this);
    }
}
