package ca;

import com.digidust.elokence.akinator.activities.StoreItemsActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import java.util.Iterator;
import jb.h;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends bv.n implements kv.p {
    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new e(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        h.a aVar = jb.h.f69257d;
        aVar.sharedInstance().createOrUpdateMetricValeur("gz_counter", String.valueOf(r.sharedInstance().getGenizBalance()));
        try {
            aVar.sharedInstance().createOrUpdateMetricValeur("badges_standard", String.valueOf(aa.a.sharedInstance().getNbCharactersPlayedForAwardLevelAllLanguages(1)));
            aVar.sharedInstance().createOrUpdateMetricValeur("badges_bronze", String.valueOf(aa.a.sharedInstance().getNbCharactersPlayedForAwardLevelAllLanguages(2)));
            aVar.sharedInstance().createOrUpdateMetricValeur("badges_silver", String.valueOf(aa.a.sharedInstance().getNbCharactersPlayedForAwardLevelAllLanguages(3)));
            aVar.sharedInstance().createOrUpdateMetricValeur("badges_gold", String.valueOf(aa.a.sharedInstance().getNbCharactersPlayedForAwardLevelAllLanguages(4)));
            aVar.sharedInstance().createOrUpdateMetricValeur("badges_platinum", String.valueOf(aa.a.sharedInstance().getNbCharactersPlayedForAwardLevelAllLanguages(5)));
            aVar.sharedInstance().createOrUpdateMetricValeur("badges_black", String.valueOf(aa.a.sharedInstance().getNbCharactersPlayedForAwardLevelAllLanguages(6)));
        } catch (Exception e10) {
            Timber.Forest.tag("AkApplication").e(e10, "Exception on sendAnalytics", new Object[0]);
        }
        Iterator it = kotlin.jvm.internal.i.iterator(StoreItemsActivity.U);
        int i10 = 0;
        while (it.hasNext()) {
            if (r.sharedInstance().isItemBought("hat", (String) it.next())) {
                i10++;
            }
        }
        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("unlocked_hats", String.valueOf(i10 - 1));
        Iterator it2 = kotlin.jvm.internal.i.iterator(StoreItemsActivity.W);
        int i11 = 0;
        while (it2.hasNext()) {
            if (r.sharedInstance().isItemBought("cloth", (String) it2.next())) {
                i11++;
            }
        }
        h.a aVar2 = jb.h.f69257d;
        aVar2.sharedInstance().createOrUpdateMetricValeur("unlocked_clothes", String.valueOf(i11 - 2));
        switch (r.sharedInstance().getCurrentHatIndex()) {
            case 0:
                str = "delai_session_1";
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "TU");
                break;
            case 1:
                str = "delai_session_1";
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "RP");
                break;
            case 2:
                str = "delai_session_1";
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "SB");
                break;
            case 3:
                str = "delai_session_1";
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "CH");
                break;
            case 4:
                str = "delai_session_1";
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "EL");
                break;
            case 5:
                str = "delai_session_1";
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "CB");
                break;
            case 6:
                str = "delai_session_1";
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "MX");
                break;
            case 7:
                str = "delai_session_1";
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "DI");
                break;
            case 8:
                str = "delai_session_1";
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "IN");
                break;
            case 9:
                str = "delai_session_1";
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "PU");
                break;
            case 10:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "PT");
                str = "delai_session_1";
                break;
            default:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_hat", "TU");
                str = "delai_session_1";
                break;
        }
        switch (r.sharedInstance().getCurrentClothIndex()) {
            case 0:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "TU");
                break;
            case 1:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "YK");
                break;
            case 2:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "RP");
                break;
            case 3:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "CH");
                break;
            case 4:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "SB");
                break;
            case 5:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "MX");
                break;
            case 6:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "CB");
                break;
            case 7:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "DI");
                break;
            case 8:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "CA");
                break;
            case 9:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "IN");
                break;
            case 10:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "DR");
                break;
            case 11:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "SH");
                break;
            case 12:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "PT");
                break;
            default:
                aVar2.sharedInstance().createOrUpdateMetricValeur("active_cloth", "TU");
                break;
        }
        aVar2.sharedInstance().createOrUpdateMetricValeur("music", m.sharedInstance().isMusicEnabled() ? "1" : "0");
        aVar2.sharedInstance().createOrUpdateMetricValeur("sounds", m.sharedInstance().isSoundEnabled() ? "1" : "0");
        aVar2.sharedInstance().createOrUpdateMetricValeur("child_filter_activated", m.sharedInstance().isChildProtectEnabled() ? "1" : "0");
        try {
            try {
                aVar2.sharedInstance().createOrUpdateMetricValeur("played_characters", aa.a.sharedInstance().getAllBaseIdAndBaseLogiqueId());
            } catch (Exception e11) {
                Timber.Forest.tag("AkApplication").e(e11, "Exception on getAllBaseIdAndBaseLogiqueId", new Object[0]);
                jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("played_characters", "");
            }
            if (m.sharedInstance().isWifiConnected()) {
                jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("reseau", "WIFI");
            } else {
                jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("reseau", "GSM");
            }
            int totalSessionActuelle = u.sharedInstance().getTotalSessionActuelle();
            int timeOfLastScreenOnPause = (int) ((u.sharedInstance().getTimeOfLastScreenOnPause() - u.sharedInstance().getTimeOfCurrentSessionStart()) / 1000);
            int lastSessionAdded = (totalSessionActuelle - u.sharedInstance().getLastSessionAdded()) + timeOfLastScreenOnPause;
            try {
                h.a aVar3 = jb.h.f69257d;
                int metricCompteur = lastSessionAdded / aVar3.sharedInstance().getMetricCompteur("nb_sessions");
                aVar3.sharedInstance().createOrUpdateMetricValeur("delai_session", String.valueOf(metricCompteur));
                u.sharedInstance().setLastSessionAdded(timeOfLastScreenOnPause);
                u.sharedInstance().setNewTotalSession(lastSessionAdded);
                if (aVar3.sharedInstance().getMetricCompteur("nb_sessions") == 1) {
                    str2 = str;
                    try {
                        aVar3.sharedInstance().createOrUpdateMetricValeur(str2, String.valueOf(metricCompteur));
                    } catch (ArithmeticException unused) {
                        h.a aVar4 = jb.h.f69257d;
                        aVar4.sharedInstance().reinitCompteur("nb_sessions", 1);
                        aVar4.sharedInstance().createOrUpdateMetricValeur("delai_session", "0");
                        aVar4.sharedInstance().createOrUpdateMetricValeur(str2, "0");
                        u.sharedInstance().setNewTotalSession(0);
                        u.sharedInstance().setLastSessionAdded(0);
                        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("geoloc_activated", "0");
                        jb.c.f69226m.sharedInstance().push(null, AkApplication.f21721h);
                        u.sharedInstance().setAnalyticsSend(true);
                        return x0.f87415a;
                    }
                } else {
                    str2 = str;
                }
                if (metricCompteur < 0 || metricCompteur > 86400) {
                    aVar3.sharedInstance().reinitCompteur("nb_sessions", 1);
                    aVar3.sharedInstance().createOrUpdateMetricValeur("delai_session", "0");
                    aVar3.sharedInstance().createOrUpdateMetricValeur(str2, "0");
                    u.sharedInstance().setNewTotalSession(0);
                    u.sharedInstance().setLastSessionAdded(0);
                }
            } catch (ArithmeticException unused2) {
                str2 = str;
            }
            jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("geoloc_activated", "0");
            jb.c.f69226m.sharedInstance().push(null, AkApplication.f21721h);
            u.sharedInstance().setAnalyticsSend(true);
            return x0.f87415a;
        } catch (Throwable th2) {
            jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("played_characters", "");
            throw th2;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
