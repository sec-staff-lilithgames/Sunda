package o9;

import android.view.View;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OneCharacterProposalActivity f78047b;

    public b4(OneCharacterProposalActivity oneCharacterProposalActivity) {
        this.f78047b = oneCharacterProposalActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean zIsAwardAlreadyWonForCharacter;
        if (ca.m.sharedInstance().isTTSEnabled()) {
            w9.e.getInstance().stop();
        }
        if (ca.m.sharedInstance().hasAlreadyBeenBlockedInCurrentGame()) {
            ca.r.sharedInstance().addToSetIdUnlocked(ca.u.sharedInstance().getPersoPropose().getIdBase());
        }
        ca.u uVarSharedInstance = ca.u.sharedInstance();
        OneCharacterProposalActivity oneCharacterProposalActivity = this.f78047b;
        uVarSharedInstance.setImagePerso(AkActivity.k(oneCharacterProposalActivity.C));
        jb.h.sharedInstance().createOrUpdateMetricValeur("delai_question", String.valueOf(ca.o.sharedInstance().getDelaiMoyen()));
        ca.o.sharedInstance().setDelaiMoyen(0);
        ca.o.sharedInstance().setAkinatorStatus(2);
        ca.o.sharedInstance().addOneWonGame();
        na.b.playWin();
        e.g gVar = oneCharacterProposalActivity.E;
        ca.u.sharedInstance().setCharacterNameProposed(gVar.getName());
        if (ca.o.sharedInstance().winFirstTry()) {
            jb.h.sharedInstance().incMetricCompteur("succes_games");
            jb.h.sharedInstance().createOrUpdateMetricValeur("last_game", "S");
        }
        if (ca.o.sharedInstance().winFirstTry()) {
            try {
                lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
                zIsAwardAlreadyWonForCharacter = aa.a.sharedInstance().isAwardAlreadyWonForCharacter(currentInstance.getLanguage(), currentInstance.getBaseLogiqueId(), gVar.getIdBase());
            } catch (Exception e10) {
                Timber.tag("OneCharacterProposal").e(e10);
            }
        } else {
            zIsAwardAlreadyWonForCharacter = true;
        }
        ca.o.sharedInstance().addOneCelebCharacterPlayed();
        oneCharacterProposalActivity.v(zIsAwardAlreadyWonForCharacter);
    }
}
