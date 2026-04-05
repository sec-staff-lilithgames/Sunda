package o9;

import android.database.sqlite.SQLiteException;
import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(2, dVar);
        this.f78034i = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new a9(this.f78034i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws SQLiteException {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        ca.m.sharedInstance();
        ca.o.sharedInstance();
        ca.t.sharedInstance();
        ca.r.sharedInstance();
        z9.e eVar = z9.e.getInstance();
        SplashscreenActivity splashscreenActivity = this.f78034i;
        eVar.init(splashscreenActivity, new z8(splashscreenActivity));
        lb.s0 s0VarSharedInstance = lb.s0.f72971j.sharedInstance();
        AkApplication.a aVar = AkApplication.f21719f;
        lb.s0.init$default(s0VarSharedInstance, aVar.getAppContext(), false, 2, null);
        lb.b1.f72741d.sharedInstance().init(aVar.getAppContext());
        aa.a.sharedInstance().init(aVar.getAppContext());
        jb.c.f69226m.sharedInstance().init(aVar.getAppContext());
        jb.h.f69257d.sharedInstance().init(aVar.getAppContext());
        aVar.getApp().populateTypefaces();
        splashscreenActivity.N = true;
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((a9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
