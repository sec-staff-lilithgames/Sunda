package ca;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Date;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class v {

    /* renamed from: f, reason: collision with root package name */
    public static v f12034f;

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f12035a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f12036b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f12037c = new Bundle();

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f12038d = new Bundle();

    /* renamed from: e, reason: collision with root package name */
    public Date f12039e;

    public static v sharedInstance() {
        if (f12034f == null) {
            f12034f = new v();
        }
        return f12034f;
    }

    public void abortGameEvents(FirebaseAnalytics firebaseAnalytics) {
        try {
            long time = this.f12039e != null ? (new Date().getTime() - this.f12039e.getTime()) / 1000 : 0L;
            boolean zIsChildProtectEnabled = m.sharedInstance().isChildProtectEnabled();
            Bundle bundle = this.f12036b;
            if (zIsChildProtectEnabled) {
                bundle.putInt("elok_childmode", 1);
            } else {
                bundle.putInt("elok_childmode", 0);
            }
            bundle.putString("elok_lang", b1.sharedInstance().getApplicationLanguage());
            lb.c currentInstance = m.sharedInstance().getCurrentInstance();
            if (currentInstance != null) {
                bundle.putInt("elok_theme", currentInstance.getSubjectId());
                bundle.putInt("elok_base_logique_id", currentInstance.getBaseLogiqueId());
            }
            bundle.putInt("elok_game_questions_nb", o.sharedInstance().getCurrentSession().getCurrentSessionProgression().getStep());
            bundle.putInt("elok_game_proposals_nb", o.sharedInstance().getCurrentSession().getNbProposal());
            bundle.putLong("elok_game_duration", time);
            if (u.sharedInstance().isPotionBoughtInSession()) {
                bundle.putInt("elok_game_inapp_deblock", 1);
            } else {
                bundle.putInt("elok_game_inapp_deblock", 0);
            }
            bundle.putString("elok_game_abortion_type", "volontaire");
            firebaseAnalytics.logEvent("elok_game_abort", bundle);
            bundle.remove("elok_childmode");
            bundle.remove("elok_lang");
            bundle.remove("elok_theme");
            bundle.remove("elok_game_duration");
            bundle.remove("elok_childmode");
            bundle.remove("elok_game_questions_nb");
            bundle.remove("elok_game_proposals_nb");
            bundle.remove("elok_game_inapp_deblock");
            bundle.remove("elok_game_abortion_type");
        } catch (Exception unused) {
        }
    }

    public void activateAccount(FirebaseAnalytics firebaseAnalytics) {
        long time = m.sharedInstance().getFirstLaunchDate() != null ? (new Date().getTime() - m.sharedInstance().getFirstLaunchDate().getTime()) / 1000 : 0L;
        int nbGames = o.sharedInstance().getNbGames();
        Bundle bundle = this.f12038d;
        bundle.putInt("elok_ngame", nbGames);
        bundle.putLong("elok_delay", time);
        firebaseAnalytics.logEvent("elok_activ_compte", bundle);
        bundle.remove("elok_ngame");
        bundle.remove("elok_delay");
    }

    public void confirmeCreateAccount(FirebaseAnalytics firebaseAnalytics) {
        long time = m.sharedInstance().getFirstLaunchDate() != null ? (new Date().getTime() - m.sharedInstance().getFirstLaunchDate().getTime()) / 1000 : 0L;
        int nbGames = o.sharedInstance().getNbGames();
        Bundle bundle = this.f12038d;
        bundle.putInt("elok_ngame", nbGames);
        bundle.putLong("elok_delay", time);
        firebaseAnalytics.logEvent("elok_crea_compte", bundle);
        bundle.remove("elok_ngame");
        bundle.remove("elok_delay");
    }

    public void deleteAccount(FirebaseAnalytics firebaseAnalytics) {
        long time = m.sharedInstance().getFirstLaunchDate() != null ? (new Date().getTime() - m.sharedInstance().getFirstLaunchDate().getTime()) / 1000 : 0L;
        int nbGames = o.sharedInstance().getNbGames();
        Bundle bundle = this.f12038d;
        bundle.putInt("elok_ngame", nbGames);
        bundle.putLong("elok_delay", time);
        firebaseAnalytics.logEvent("elok_suppr_compte", bundle);
        bundle.remove("elok_ngame");
        bundle.remove("elok_delay");
    }

    public void doublePoints(FirebaseAnalytics firebaseAnalytics) {
        firebaseAnalytics.logEvent("elok_game_double_pts", null);
    }

    public void firstConnexion(FirebaseAnalytics firebaseAnalytics) {
        long time = m.sharedInstance().getFirstLaunchDate() != null ? (new Date().getTime() - m.sharedInstance().getFirstLaunchDate().getTime()) / 1000 : 0L;
        int nbGames = o.sharedInstance().getNbGames();
        Bundle bundle = this.f12038d;
        bundle.putInt("elok_ngame", nbGames);
        bundle.putLong("elok_delay", time);
        firebaseAnalytics.logEvent("elok_first_connect", bundle);
        bundle.remove("elok_ngame");
        bundle.remove("elok_delay");
    }

    public void passedThroughInapp(FirebaseAnalytics firebaseAnalytics) {
        firebaseAnalytics.logEvent("elok_game_deblock_inapp", this.f12038d);
    }

    public void passedThroughRewarded(FirebaseAnalytics firebaseAnalytics) {
        firebaseAnalytics.logEvent("elok_game_deblock_rewarded", this.f12038d);
    }

    public void proposeCreateAccount(FirebaseAnalytics firebaseAnalytics) {
        long time = m.sharedInstance().getFirstLaunchDate() != null ? (new Date().getTime() - m.sharedInstance().getFirstLaunchDate().getTime()) / 1000 : 0L;
        int nbGames = o.sharedInstance().getNbGames();
        Bundle bundle = this.f12038d;
        bundle.putInt("elok_ngame", nbGames);
        bundle.putLong("elok_delay", time);
        firebaseAnalytics.logEvent("elok_prop_compte", bundle);
        bundle.remove("elok_ngame");
        bundle.remove("elok_delay");
    }

    public void proposeCreatePseudo(FirebaseAnalytics firebaseAnalytics) {
        long time = m.sharedInstance().getFirstLaunchDate() != null ? (new Date().getTime() - m.sharedInstance().getFirstLaunchDate().getTime()) / 1000 : 0L;
        int nbGames = o.sharedInstance().getNbGames();
        Bundle bundle = this.f12038d;
        bundle.putInt("elok_ngame", nbGames);
        bundle.putLong("elok_delay", time);
        firebaseAnalytics.logEvent("elok_crea_pseudo_seul", bundle);
        bundle.remove("elok_ngame");
        bundle.remove("elok_delay");
    }

    public void startGameEvents(FirebaseAnalytics firebaseAnalytics) {
        this.f12039e = new Date();
        boolean zIsChildProtectEnabled = m.sharedInstance().isChildProtectEnabled();
        Bundle bundle = this.f12035a;
        if (zIsChildProtectEnabled) {
            bundle.putInt("elok_childmode", 1);
        } else {
            bundle.putInt("elok_childmode", 0);
        }
        bundle.putString("elok_lang", b1.sharedInstance().getApplicationLanguage());
        lb.c currentInstance = m.sharedInstance().getCurrentInstance();
        if (currentInstance != null) {
            bundle.putInt("elok_theme", currentInstance.getSubjectId());
            bundle.putInt("elok_base_logique_id", currentInstance.getBaseLogiqueId());
        }
        bundle.putInt("elok_game_tts", m.sharedInstance().isTTSEnabled() ? 1 : 0);
        firebaseAnalytics.logEvent("elok_game_start", bundle);
        if (m.sharedInstance().isTTSEnabled()) {
            firebaseAnalytics.logEvent("elok_game_start_tts", null);
        }
        bundle.remove("elok_childmode");
        bundle.remove("elok_lang");
        bundle.remove("elok_theme");
        bundle.remove("elok_base_logique_id");
    }

    public void stopGameEvents(int i10, FirebaseAnalytics firebaseAnalytics) {
        long time = this.f12039e != null ? (new Date().getTime() - this.f12039e.getTime()) / 1000 : 0L;
        boolean zIsChildProtectEnabled = m.sharedInstance().isChildProtectEnabled();
        Bundle bundle = this.f12037c;
        if (zIsChildProtectEnabled) {
            bundle.putInt("elok_childmode", 1);
        } else {
            bundle.putInt("elok_childmode", 0);
        }
        bundle.putString("elok_lang", b1.sharedInstance().getApplicationLanguage());
        lb.c currentInstance = m.sharedInstance().getCurrentInstance();
        if (currentInstance != null) {
            bundle.putInt("elok_theme", currentInstance.getSubjectId());
            bundle.putInt("elok_base_logique_id", currentInstance.getBaseLogiqueId());
        }
        bundle.putLong("elok_game_duration", time);
        bundle.putInt("elok_game_questions_nb", o.sharedInstance().getCurrentSession().getCurrentSessionProgression().getStep());
        bundle.putInt("elok_game_proposals_nb", o.sharedInstance().getCurrentSession().getNbProposal());
        if (u.sharedInstance().isPotionBoughtInSession()) {
            bundle.putInt("elok_game_inapp_deblock", 1);
        } else {
            bundle.putInt("elok_game_inapp_deblock", 0);
        }
        bundle.putString("elok_game_objectid", u.sharedInstance().getPersoPropose().getIdBase());
        bundle.putInt("elok_game_rankobject", u.sharedInstance().getPersoPropose().getRankingLimit());
        if (i10 == 0) {
            bundle.putInt("elok_game_withaward", u.sharedInstance().getStats().getAwardType());
            if (u.sharedInstance().getStats().getAwardType() == 6 || u.sharedInstance().getStats().getAwardType() == 7) {
                bundle.putInt("elok_dailychallenge_id", aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi());
            }
        }
        if (i10 == 0) {
            bundle.putString("elok_game_ended_type", "proposal_validation");
        } else if (i10 == 1) {
            bundle.putString("elok_game_ended_type", "1st_list");
        } else if (i10 == 2) {
            bundle.putString("elok_game_ended_type", "after_search");
        } else if (i10 == 3) {
            bundle.putString("elok_game_ended_type", "object_added");
        }
        firebaseAnalytics.logEvent("elok_game_end", bundle);
        bundle.remove("elok_childmode");
        bundle.remove("elok_lang");
        bundle.remove("elok_theme");
        bundle.remove("elok_game_duration");
        bundle.remove("elok_childmode");
        bundle.remove("elok_game_questions_nb");
        bundle.remove("elok_game_proposals_nb");
        bundle.remove("elok_game_inapp_deblock");
        bundle.remove("elok_game_objectid");
        bundle.remove("elok_game_rankobject");
        bundle.remove("elok_game_withaward");
        bundle.remove("elok_dailychallenge_id");
        bundle.remove("elok_game_ended_type");
    }
}
