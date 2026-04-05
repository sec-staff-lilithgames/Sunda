package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78450i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78451j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f78452k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(SplashscreenActivity splashscreenActivity, boolean z10, zu.d dVar) {
        super(2, dVar);
        this.f78451j = splashscreenActivity;
        this.f78452k = z10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new p9(this.f78451j, this.f78452k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78450i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f78450i = 1;
            if (SplashscreenActivity.access$restorePurchases(this.f78451j, this.f78452k, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((p9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
