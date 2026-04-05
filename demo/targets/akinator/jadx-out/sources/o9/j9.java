package o9;

import android.app.ActivityManager;
import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78279i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(2, dVar);
        this.f78279i = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new j9(this.f78279i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        SplashscreenActivity splashscreenActivity = this.f78279i;
        ActivityManager activityManager = (ActivityManager) splashscreenActivity.getSystemService("activity");
        if (activityManager != null) {
            ca.t.sharedInstance().updateMaxMemory(activityManager.getMemoryClass());
        }
        return bv.b.boxBoolean(ca.t.sharedInstance().initDefault(splashscreenActivity.getScreenWidth()));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
        return ((j9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
