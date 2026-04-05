package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlinx.coroutines.CoroutineScope;
import qa.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78051i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(2, dVar);
        this.f78051i = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new b9(this.f78051i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        int largeurPhoto = this.f78051i.getLargeurPhoto();
        d.a aVar = qa.d.f82654j;
        aVar.sharedInstance().init(largeurPhoto);
        aVar.sharedInstance().callWebservice();
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((b9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
