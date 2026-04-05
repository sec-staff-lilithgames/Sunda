package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78546i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f78547j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78548k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(SplashscreenActivity splashscreenActivity, boolean z10, zu.d dVar) {
        super(2, dVar);
        this.f78547j = z10;
        this.f78548k = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new s9(this.f78548k, this.f78547j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78546i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            boolean z10 = this.f78547j;
            SplashscreenActivity splashscreenActivity = this.f78548k;
            if (z10) {
                z9.e.getInstance().requestInappDetailsUpdate(new z8(splashscreenActivity));
            } else if (splashscreenActivity.F) {
                splashscreenActivity.goToHomeScreen();
            } else {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                r9 r9Var = new r9(splashscreenActivity, null);
                this.f78546i = 1;
                if (BuildersKt.withContext(main, r9Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((s9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
