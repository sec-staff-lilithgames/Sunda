package o9;

import android.util.Pair;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i9 extends bv.n implements kv.p {
    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new i9(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        ca.r.sharedInstance().clearIdSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("hat", "turban"));
        arrayList.add(new Pair("cloth", "orient"));
        arrayList.add(new Pair("cloth", "yukata"));
        arrayList.add(new Pair("bg", "orient"));
        arrayList.add(new Pair("bg", "japon"));
        ca.r.sharedInstance().setItemsBought(arrayList);
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((i9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
