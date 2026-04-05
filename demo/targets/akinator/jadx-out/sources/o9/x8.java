package o9;

import android.content.Intent;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x8 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z0 f78679i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78680j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(kotlin.jvm.internal.z0 z0Var, SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(2, dVar);
        this.f78679i = z0Var;
        this.f78680j = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new x8(this.f78679i, this.f78680j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        if (this.f78679i.f71866b == -60) {
            ca.m.sharedInstance().setUserConnectionStatus(false);
            ca.m.sharedInstance().setHasBeenForcedToDisconnect(true);
            SplashscreenActivity splashscreenActivity = this.f78680j;
            Intent intent = new Intent(splashscreenActivity.getApplicationContext(), (Class<?>) ConnectActivity.class);
            intent.putExtra("comingFromGame", false);
            splashscreenActivity.startActivity(intent);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((x8) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
