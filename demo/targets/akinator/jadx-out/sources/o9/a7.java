package o9;

import com.digidust.elokence.akinator.activities.SelectLanguageActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SelectLanguageActivity f78031i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(SelectLanguageActivity selectLanguageActivity, zu.d dVar) {
        super(2, dVar);
        this.f78031i = selectLanguageActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new a7(this.f78031i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        SelectLanguageActivity selectLanguageActivity = this.f78031i;
        int i10 = selectLanguageActivity.getScreenWidth() < 481 ? 50 : selectLanguageActivity.getScreenWidth() < 721 ? 150 : selectLanguageActivity.getScreenWidth() < 1081 ? 250 : 400;
        qa.d dVarSharedInstance = qa.d.f82654j.sharedInstance();
        dVarSharedInstance.init(i10);
        dVarSharedInstance.callWebservice();
        return dVarSharedInstance;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super qa.d> dVar) {
        return ((a7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
