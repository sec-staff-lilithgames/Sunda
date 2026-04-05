package oa;

import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78744i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f78745j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r7.h f78746k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f78747l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f78748m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f78749n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, r7.h hVar, Long l9, boolean z10, float f10, zu.d dVar) {
        super(2, dVar);
        this.f78745j = lVar;
        this.f78746k = hVar;
        this.f78747l = l9;
        this.f78748m = z10;
        this.f78749n = f10;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new h(this.f78745j, this.f78746k, this.f78747l, this.f78748m, this.f78749n, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78744i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            this.f78744i = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            float coeffAnimationSpeed = ca.m.sharedInstance().getCoeffAnimationSpeed();
            l lVar = this.f78745j;
            LottieAnimationView lottieAnimationView = lVar.f78768a;
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.removeAllAnimatorListeners();
            r7.h composition = lVar.f78768a.getComposition();
            r7.h hVar = this.f78746k;
            if (!e0.areEqual(composition, hVar)) {
                lottieAnimationView.setComposition(hVar);
            }
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.setMinAndMaxProgress(0.0f, 1.0f);
            Long l9 = this.f78747l;
            if (l9 != null && l9.longValue() > 0) {
                coeffAnimationSpeed *= hVar.getDuration() / l9.longValue();
            }
            if (this.f78748m) {
                lottieAnimationView.setProgress(1.0f - this.f78749n);
                lottieAnimationView.setSpeed(-Math.abs(coeffAnimationSpeed));
            } else {
                lottieAnimationView.setProgress(0.0f);
                lottieAnimationView.setSpeed(Math.abs(coeffAnimationSpeed));
            }
            g gVar = new g(cancellableContinuationImpl);
            lottieAnimationView.addAnimatorListener(gVar);
            cancellableContinuationImpl.invokeOnCancellation(new f(lottieAnimationView, gVar));
            lottieAnimationView.playAnimation();
            Object result = cancellableContinuationImpl.getResult();
            if (result == av.e.getCOROUTINE_SUSPENDED()) {
                bv.h.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
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
        return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
