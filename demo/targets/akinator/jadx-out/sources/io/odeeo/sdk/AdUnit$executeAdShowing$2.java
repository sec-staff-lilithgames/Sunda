package io.odeeo.sdk;

import io.odeeo.sdk.callbackData.AdData;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "io.odeeo.sdk.AdUnit$executeAdShowing$2", f = "AdUnit.kt", i = {}, l = {689}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class AdUnit$executeAdShowing$2 extends bv.n implements kv.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f67868a;

    /* renamed from: b, reason: collision with root package name */
    public Object f67869b;

    /* renamed from: c, reason: collision with root package name */
    public Object f67870c;

    /* renamed from: d, reason: collision with root package name */
    public int f67871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.odeeo.internal.z0.f f67873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.odeeo.internal.e1.c f67874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ io.odeeo.internal.b.o f67875h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnit$executeAdShowing$2(AdUnit adUnit, io.odeeo.internal.z0.f fVar, io.odeeo.internal.e1.c cVar, io.odeeo.internal.b.o oVar, zu.d<? super AdUnit$executeAdShowing$2> dVar) {
        super(2, dVar);
        this.f67872e = adUnit;
        this.f67873f = fVar;
        this.f67874g = cVar;
        this.f67875h = oVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new AdUnit$executeAdShowing$2(this.f67872e, this.f67873f, this.f67874g, this.f67875h, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f67871d;
        x0 x0Var = x0.f87415a;
        try {
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                AdUnit adUnit = this.f67872e;
                adUnit.O = adUnit.getActivityLifecycleListener$odeeoSdk_release(this.f67873f);
                this.f67872e.f67821b.getApplication().registerActivityLifecycleCallbacks(this.f67872e.O);
                AdUnit adUnit2 = this.f67872e;
                io.odeeo.internal.b.o oVar = this.f67875h;
                io.odeeo.internal.z0.f fVar = this.f67873f;
                this.f67868a = adUnit2;
                this.f67869b = oVar;
                this.f67870c = fVar;
                this.f67871d = 1;
                zu.o oVar2 = new zu.o(av.b.intercepted(this));
                adUnit2.executeAdShowingInternal$odeeoSdk_release(oVar2, oVar, fVar);
                Object orThrow = oVar2.getOrThrow();
                if (orThrow == av.e.getCOROUTINE_SUSPENDED()) {
                    bv.h.probeCoroutineSuspended(this);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            AdUnitBase adUnit$odeeoSdk_release = this.f67872e.getAdUnit$odeeoSdk_release();
            if (adUnit$odeeoSdk_release != null) {
                adUnit$odeeoSdk_release.setRootViewChecker$odeeoSdk_release(this.f67872e.createRootChecker$odeeoSdk_release());
            }
            if (!this.f67874g.getSkipCoverageLogic()) {
                this.f67872e.runRootViewChecker$odeeoSdk_release();
            }
            AdListener adListener$odeeoSdk_release = this.f67872e.getAdListener$odeeoSdk_release();
            if (adListener$odeeoSdk_release == null) {
                return null;
            }
            adListener$odeeoSdk_release.onAvailabilityChanged(false, new AdData(this.f67872e.f67822c, null, null, null, 0.0d, null, null, 126, null));
            return x0Var;
        } catch (Exception e10) {
            this.f67872e.a(e10);
            return x0Var;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((AdUnit$executeAdShowing$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
