package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78644i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(HomeActivity homeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78644i = homeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new w2(this.f78644i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        HomeActivity homeActivity = this.f78644i;
        HomeActivity.access$getInstancesForCurrentLanguage(homeActivity, arrayList);
        try {
            ca.t.sharedInstance().loadSubjectsBackgrounds(arrayList, homeActivity.K, null);
        } catch (OutOfMemoryError unused) {
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((w2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
