package o9;

import bp.oM.DwaEpyvxz;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.ironsource.Hc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlinx.coroutines.CoroutineScope;
import o9.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class m extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f78332i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar, zu.d dVar) {
        super(2, dVar);
        this.f78332i = jVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new m(this.f78332i, dVar);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super j.a> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        if (ca.m.sharedInstance().isUserConnected()) {
            AccountDatabase accountDatabase = (AccountDatabase) o5.s0.databaseBuilder(AkApplication.f21719f.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration().build();
            ba.b dao = accountDatabase.getDao();
            j jVar = this.f78332i;
            j.a aVar = new j.a(dao.getNbAwardForSpecificThemeAndLevel(j.access$lang(jVar), j.access$subj(jVar), "0"), accountDatabase.getDao().getNbAwardForSpecificThemeAndLevel(j.access$lang(jVar), j.access$subj(jVar), "1"), accountDatabase.getDao().getNbAwardForSpecificThemeAndLevel(j.access$lang(jVar), j.access$subj(jVar), DwaEpyvxz.sjv), accountDatabase.getDao().getNbAwardForSpecificThemeAndLevel(j.access$lang(jVar), j.access$subj(jVar), "3"), accountDatabase.getDao().getNbAwardForSpecificThemeAndLevel(j.access$lang(jVar), j.access$subj(jVar), "4"), accountDatabase.getDao().getNbAwardForSpecificThemeAndLevel(j.access$lang(jVar), j.access$subj(jVar), CampaignEx.CLICKMODE_ON), accountDatabase.getDao().getNbAwardForSpecificThemeAndLevel(j.access$lang(jVar), j.access$subj(jVar), "6"), accountDatabase.getDao().getNbAwardForSpecificThemeAndLevel(j.access$lang(jVar), j.access$subj(jVar), Hc.f34588e));
            accountDatabase.close();
            return aVar;
        }
        return new j.a(aa.a.sharedInstance().getNbCharactersPlayedForAwardLevel(1), aa.a.sharedInstance().getNbCharactersPlayedForAwardLevel(2), aa.a.sharedInstance().getNbCharactersPlayedForAwardLevel(3), aa.a.sharedInstance().getNbCharactersPlayedForAwardLevel(4), aa.a.sharedInstance().getNbCharactersPlayedForAwardLevel(5), aa.a.sharedInstance().getNbCharactersPlayedForAwardLevel(6), 0, 0);
    }
}
