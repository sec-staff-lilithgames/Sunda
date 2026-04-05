package o9;

import android.os.Bundle;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f78534i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f78535j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j8 f78536k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(String str, ArrayList arrayList, j8 j8Var, zu.d dVar) {
        super(2, dVar);
        this.f78534i = str;
        this.f78535j = arrayList;
        this.f78536k = j8Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new s7(this.f78534i, this.f78535j, this.f78536k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
        kotlin.jvm.internal.e0.checkNotNull(currentSession);
        String str = this.f78534i;
        kotlin.jvm.internal.e0.checkNotNull(str);
        ArrayList<e.b> arrayList = this.f78535j;
        currentSession.getObjectsFromString(str, arrayList);
        Bundle bundle = new Bundle();
        bundle.putSerializable("several", arrayList);
        this.f78536k.setArguments(bundle);
        return bv.b.boxInt(0);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((s7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
