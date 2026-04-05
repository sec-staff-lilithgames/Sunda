package o9;

import android.content.Intent;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.activities.SelectLanguageActivity;
import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78080i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78081j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(2, dVar);
        this.f78081j = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new c9(this.f78081j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78080i;
        tu.x0 x0Var = tu.x0.f87415a;
        SplashscreenActivity splashscreenActivity = this.f78081j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            ca.m.sharedInstance().setVersionCode(splashscreenActivity.K);
            splashscreenActivity.G = true;
            if (SplashscreenActivity.access$verifyResetPasswor(splashscreenActivity) || SplashscreenActivity.access$handleMarketingDeeplink(splashscreenActivity)) {
                return x0Var;
            }
            if (splashscreenActivity.H) {
                splashscreenActivity.startActivity(new Intent(splashscreenActivity, (Class<?>) SelectLanguageActivity.class));
                return x0Var;
            }
            ca.m.sharedInstance().setFirstLaunch(false);
            BuildersKt__Builders_commonKt.launch$default(AkApplication.f21719f.getAppScope(), null, null, new b9(splashscreenActivity, null), 3, null);
            ca.m.sharedInstance().setHasBeenForcedToDisconnect(false);
            if (ca.m.sharedInstance().isUserConnected()) {
                this.f78080i = 1;
                if (splashscreenActivity.checkIfUserIsStillLoggedCustom(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        Intent intent = new Intent(splashscreenActivity, (Class<?>) HomeActivity.class);
        intent.putExtra("intentShorcutName", splashscreenActivity.L);
        intent.putExtra("startSessionStatus", splashscreenActivity.M);
        intent.putExtra("ShowAdOnGameOver", false);
        intent.putExtra("frgfx", true);
        splashscreenActivity.startActivity(intent);
        return x0Var;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((c9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
