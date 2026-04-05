package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f78186i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78187j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(HomeActivity homeActivity, zu.d dVar, boolean z10) {
        super(2, dVar);
        this.f78186i = z10;
        this.f78187j = homeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new h2(this.f78187j, dVar, this.f78186i);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        if (!this.f78186i) {
            return bv.b.boxInt(this.f78187j.getIntent().getIntExtra("startSessionStatus", -1));
        }
        lb.s0 s0VarSharedInstance = lb.s0.f72971j.sharedInstance();
        String currentLanguage = ca.m.sharedInstance().getCurrentLanguage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(currentLanguage, "getCurrentLanguage(...)");
        lb.y0 y0VarStartSession = s0VarSharedInstance.startSession(currentLanguage, ca.m.sharedInstance().getCurrentSubject(), ca.o.sharedInstance().isPrio(), ca.m.sharedInstance().isChildProtectEnabled());
        ca.o.sharedInstance().setCurrentSession(y0VarStartSession.f73052b);
        return bv.b.boxInt(y0VarStartSession.f73051a);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((h2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
