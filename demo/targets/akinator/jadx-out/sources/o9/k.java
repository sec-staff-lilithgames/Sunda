package o9;

import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AccountDatabase f78281i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f78282j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AccountDatabase accountDatabase, int i10, zu.d dVar) {
        super(2, dVar);
        this.f78281i = accountDatabase;
        this.f78282j = i10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new k(this.f78281i, this.f78282j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return this.f78281i.getDao().getCharactersPlayedForAwardLevel(this.f78282j, ca.m.sharedInstance().getCurrentSubject(), ca.m.sharedInstance().getCurrentLanguage());
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super List<ba.a>> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
