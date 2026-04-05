package x9;

import android.content.Intent;
import android.util.Log;
import ca.m;
import ca.o;
import ca.r;
import ca.u;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import jb.c;
import jb.h;
import o9.u6;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final QuestionActivity f91889a;

    public b(QuestionActivity questionActivity) {
        this.f91889a = questionActivity;
    }

    public void listWsTransition() {
        QuestionActivity questionActivity = this.f91889a;
        Intent intent = new Intent(questionActivity, (Class<?>) OneCharacterProposalActivity.class);
        questionActivity.closeOptionsMenu();
        questionActivity.startActivity(intent);
        Log.i("Akinator", "QUESTION ACTIVITY FINISH");
        questionActivity.finish();
    }

    public u6 listWsTransitionAnimated() {
        if (u.sharedInstance().getPersoPropose().getAwardId() < m.sharedInstance().getLimitAwardIdRare() || o.sharedInstance().isUnlocked() || m.sharedInstance().hasAlreadyBeenBlockedInCurrentGame() || r.sharedInstance().isIdAlreadyUnlocked(u.sharedInstance().getPersoPropose().getIdBase())) {
            Timber.tag("QuestionActivity").d("Question Transition: Not rare character, go to proposal", new Object[0]);
            return u6.f78591b;
        }
        String campaign = c.sharedInstance().getCampaign("PopularityTresholdRule");
        if (campaign != null && campaign.contains("PROG_")) {
            String[] strArrSplit = campaign.split("_");
            if (strArrSplit.length == 2) {
                try {
                    m.sharedInstance().updateCustomMaxRanking(Integer.parseInt(strArrSplit[1]));
                } catch (NumberFormatException unused) {
                }
            }
        }
        h.sharedInstance().createOrUpdateMetricValeur("last_game", "B");
        m.sharedInstance().setHasAlreadyBeenBlockedInCurrentGame(true);
        if (r.sharedInstance().isIdAlreadyUnlocked(u.sharedInstance().getPersoPropose().getIdBase())) {
            Timber.tag("QuestionActivity").d("Question Transition: Unlocked Rare character, go to rare character", new Object[0]);
            return u6.f78593e;
        }
        Timber.tag("QuestionActivity").d("Question Transition: Locked Rare character, go to rare character", new Object[0]);
        return u6.f78592c;
    }
}
