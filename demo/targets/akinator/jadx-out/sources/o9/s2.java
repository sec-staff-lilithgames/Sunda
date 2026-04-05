package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78514i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f78515j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(HomeActivity homeActivity, ArrayList arrayList, zu.d dVar) {
        super(2, dVar);
        this.f78514i = homeActivity;
        this.f78515j = arrayList;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new s2(this.f78514i, this.f78515j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        HomeActivity homeActivity = this.f78514i;
        homeActivity.getMThemesList().clear();
        List<kb.d> mThemesList = homeActivity.getMThemesList();
        ArrayList arrayList = this.f78515j;
        kotlin.jvm.internal.e0.checkNotNull(arrayList);
        mThemesList.addAll(arrayList);
        y9.n mThemeAdapter = homeActivity.getMThemeAdapter();
        kotlin.jvm.internal.e0.checkNotNull(mThemeAdapter);
        mThemeAdapter.notifyDataSetChanged();
        try {
            if (homeActivity.L != null) {
                da.k kVar = homeActivity.L;
                kotlin.jvm.internal.e0.checkNotNull(kVar);
                if (kVar.isShowing()) {
                    da.k kVar2 = homeActivity.L;
                    kotlin.jvm.internal.e0.checkNotNull(kVar2);
                    kVar2.dismiss();
                }
            }
        } catch (Exception unused) {
            homeActivity.L = null;
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((s2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
