package io.odeeo.sdk;

import io.odeeo.internal.w1.j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "io.odeeo.sdk.AdUnit$runRootViewChecker$1", f = "AdUnit.kt", i = {}, l = {647}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class AdUnit$runRootViewChecker$1 extends bv.n implements kv.p {

    /* renamed from: a, reason: collision with root package name */
    public int f67908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdUnitBase f67909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnit$runRootViewChecker$1(AdUnitBase adUnitBase, AdUnit adUnit, zu.d<? super AdUnit$runRootViewChecker$1> dVar) {
        super(2, dVar);
        this.f67909b = adUnitBase;
        this.f67910c = adUnit;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new AdUnit$runRootViewChecker$1(this.f67909b, this.f67910c, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Flow<j.a> coverageStatusStateFlow;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f67908a;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            io.odeeo.internal.w1.j rootViewChecker$odeeoSdk_release = this.f67909b.getRootViewChecker$odeeoSdk_release();
            if (rootViewChecker$odeeoSdk_release != null && (coverageStatusStateFlow = rootViewChecker$odeeoSdk_release.getCoverageStatusStateFlow()) != null) {
                final AdUnit adUnit = this.f67910c;
                FlowCollector<? super j.a> flowCollector = new FlowCollector() { // from class: io.odeeo.sdk.AdUnit$runRootViewChecker$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, zu.d dVar) {
                        return emit((j.a) obj2, (zu.d<? super x0>) dVar);
                    }

                    public final Object emit(j.a aVar, zu.d<? super x0> dVar) {
                        adUnit.processCoverageStatus$odeeoSdk_release(aVar);
                        return x0.f87415a;
                    }
                };
                this.f67908a = 1;
                if (coverageStatusStateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((AdUnit$runRootViewChecker$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
