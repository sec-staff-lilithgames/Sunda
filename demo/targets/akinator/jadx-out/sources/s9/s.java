package s9;

import com.digidust.elokence.akinator.activities.AkActivity;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import lb.e;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f85557i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e.g f85558j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g gVar, e.g gVar2, zu.d dVar) {
        super(2, dVar);
        this.f85557i = gVar;
        this.f85558j = gVar2;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new s(this.f85557i, this.f85558j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        int iVoteForDuelPhoto;
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        g gVar = this.f85557i;
        AkActivity akActivity = gVar.f85527e;
        e0.checkNotNull(akActivity);
        akActivity.displayLoader();
        if (ca.o.sharedInstance().getCurrentSession() == null || gVar.f85530h == null) {
            iVoteForDuelPhoto = -1;
        } else {
            lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
            e0.checkNotNull(currentSession);
            String idBase = this.f85558j.getIdBase();
            String str = gVar.f85530h;
            e0.checkNotNull(str);
            iVoteForDuelPhoto = currentSession.voteForDuelPhoto(idBase, str);
        }
        AkActivity akActivity2 = gVar.f85527e;
        e0.checkNotNull(akActivity2);
        akActivity2.hideLoader();
        return bv.b.boxInt(iVoteForDuelPhoto);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((s) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
