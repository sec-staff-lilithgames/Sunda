package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78406i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(2, dVar);
        this.f78406i = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new n9(this.f78406i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        lb.s0 s0VarSharedInstance = lb.s0.f72971j.sharedInstance();
        String currentLanguage = ca.m.sharedInstance().getCurrentLanguage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(currentLanguage, "getCurrentLanguage(...)");
        lb.y0 y0VarStartSession = s0VarSharedInstance.startSession(currentLanguage, ca.m.sharedInstance().getCurrentSubject(), ca.o.sharedInstance().isPrio(), ca.m.sharedInstance().isChildProtectEnabled());
        ca.o.sharedInstance().setCurrentSession(y0VarStartSession.f73052b);
        this.f78406i.M = y0VarStartSession.f73051a;
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((n9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
