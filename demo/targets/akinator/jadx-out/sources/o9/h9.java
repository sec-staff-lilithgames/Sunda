package o9;

import android.content.pm.PackageInfo;
import java.util.Arrays;
import jb.h;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PackageInfo f78202i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(PackageInfo packageInfo, zu.d dVar) {
        super(2, dVar);
        this.f78202i = packageInfo;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new h9(this.f78202i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        try {
            if (ca.m.sharedInstance().mustReinitNbSessions()) {
                h.a aVar = jb.h.f69257d;
                aVar.sharedInstance().reinitCompteur("nb_sessions", 1);
                aVar.sharedInstance().createOrUpdateMetricValeur("delai_session", "0");
                aVar.sharedInstance().createOrUpdateMetricValeur("delai_session_1", "0");
                ca.m.sharedInstance().setMustReinitNbSessions(false);
            }
            h.a aVar2 = jb.h.f69257d;
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("shop_click");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("how_to_get_geniz");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("popu_block");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("popu_unlockable");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("popu_unlocked");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("pub_close");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("gz_gain_video");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("gz_gain_inapp");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("sharing_bd");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("sharing_badge");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("sharing_fb");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("sharing_character");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("sharing_twitter");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("sharing_unguessed");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("added_questions");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("added_photo");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("badges_quest");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("video_views");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("recommandation_demand");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("game_reports");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("added_characters");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("child_filter_used");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("tyf_adds");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("tyf_used");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("nb_sessions");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("btn_last_enigme_played");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("pt_full");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("pt_rewarded_video");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("total_games");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("total_games_account");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("games_24h");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("games_48h");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("games_7d");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("games_15d");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("games_30d");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("succes_games");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("gz_gain_playing");
            aVar2.sharedInstance().initValueIfNotExist("delai_question", "0");
            if (aVar2.sharedInstance().mustIncNbJours()) {
                aVar2.sharedInstance().incMetricCompteur("nb_jours");
                aVar2.sharedInstance().setMustIncNbJours(false);
                PackageInfo packageInfo = this.f78202i;
                if (packageInfo != null) {
                    jb.h hVarSharedInstance = aVar2.sharedInstance();
                    String str = packageInfo.versionName;
                    if (str == null) {
                        str = "n/a";
                    }
                    hVarSharedInstance.initValueIfNotExist("app_version_origine", str);
                }
            } else if (aVar2.sharedInstance().getMetricValeur("app_version_origine").length() == 0) {
                aVar2.sharedInstance().initValueIfNotExist("app_version_origine", "< 5.0");
            }
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("enigmes_hits");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("enigmes_completes");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("lsa_proposed");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("lsa_added");
            aVar2.sharedInstance().initCompteurToZeroIfNotExist("dc_rules");
            jb.h hVarSharedInstance2 = aVar2.sharedInstance();
            String str2 = String.format("%s_displayed", Arrays.copyOf(new Object[]{"lsa"}, 1));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "format(...)");
            hVarSharedInstance2.initCompteurToZeroIfNotExist(str2);
            jb.h hVarSharedInstance3 = aVar2.sharedInstance();
            String str3 = String.format("%s_displayed", Arrays.copyOf(new Object[]{"dc"}, 1));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "format(...)");
            hVarSharedInstance3.initCompteurToZeroIfNotExist(str3);
            jb.h hVarSharedInstance4 = aVar2.sharedInstance();
            String str4 = String.format("%s_displayed", Arrays.copyOf(new Object[]{"character"}, 1));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "format(...)");
            hVarSharedInstance4.initCompteurToZeroIfNotExist(str4);
            jb.h hVarSharedInstance5 = aVar2.sharedInstance();
            String str5 = String.format("%s_displayed", Arrays.copyOf(new Object[]{"classement"}, 1));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str5, "format(...)");
            hVarSharedInstance5.initCompteurToZeroIfNotExist(str5);
            jb.h hVarSharedInstance6 = aVar2.sharedInstance();
            String str6 = String.format("%s_displayed", Arrays.copyOf(new Object[]{"podium"}, 1));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str6, "format(...)");
            hVarSharedInstance6.initCompteurToZeroIfNotExist(str6);
            jb.h hVarSharedInstance7 = aVar2.sharedInstance();
            String str7 = String.format("%s_displayed", Arrays.copyOf(new Object[]{"myworld"}, 1));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str7, "format(...)");
            hVarSharedInstance7.initCompteurToZeroIfNotExist(str7);
            jb.h hVarSharedInstance8 = aVar2.sharedInstance();
            String str8 = String.format("%s_displayed", Arrays.copyOf(new Object[]{"morefun"}, 1));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str8, "format(...)");
            hVarSharedInstance8.initCompteurToZeroIfNotExist(str8);
            aVar2.sharedInstance().initValueIfNotExist("rating_app", "0");
            aVar2.sharedInstance().initCompteurIfNotExist("classement_veille", 0);
            aVar2.sharedInstance().initCompteurIfNotExist("nb_unlocked_clues_geniz", 0);
            aVar2.sharedInstance().initCompteurIfNotExist("nb_unlocked_clues_rv", 0);
            aVar2.sharedInstance().initValueIfNotExist("utm_source", "");
            aVar2.sharedInstance().initValueIfNotExist("geoloc_activated", "0");
        } catch (Exception unused) {
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((h9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
