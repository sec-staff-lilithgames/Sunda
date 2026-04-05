package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78490i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(2, dVar);
        this.f78490i = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new r9(this.f78490i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        SplashscreenActivity splashscreenActivity = this.f78490i;
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        try {
            splashscreenActivity.r();
        } catch (Exception e10) {
            Timber.Forest.tag("SplashscreenActivity").e(e10);
        }
        splashscreenActivity.F = true;
        splashscreenActivity.goToHomeScreen();
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((r9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
