package o9;

import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import java.util.concurrent.Callable;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78660b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f78661c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AkActivity f78662e;

    public /* synthetic */ x3(OneCharacterProposalActivity oneCharacterProposalActivity, boolean z10) {
        this.f78662e = oneCharacterProposalActivity;
        this.f78661c = z10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int iValidateObjectWithIdWithJackpot;
        int i10 = this.f78660b;
        AkActivity akActivity = this.f78662e;
        boolean z10 = this.f78661c;
        switch (i10) {
            case 0:
                OneCharacterProposalActivity oneCharacterProposalActivity = (OneCharacterProposalActivity) akActivity;
                e.c cVar = oneCharacterProposalActivity.J;
                if (z10) {
                    return Integer.valueOf(ca.o.sharedInstance().getCurrentSession().validateObjectWithId(oneCharacterProposalActivity.E.getIdSession(), cVar));
                }
                return Integer.valueOf(ca.o.sharedInstance().getCurrentSession().validateObjectWithIdWithJackpot(oneCharacterProposalActivity.E.getIdSession(), ca.m.sharedInstance().isUserConnected() ? ca.r.sharedInstance().getIdJoueurAccount() : ca.r.sharedInstance().getIdJoueur(), cVar));
            default:
                QuestionActivity questionActivity = (QuestionActivity) akActivity;
                int i11 = QuestionActivity.f21703n0;
                e.c cVar2 = null;
                if (z10) {
                    Timber.Forest.tag("QuestionActivity").d("no jackpot in dovalidate object", new Object[0]);
                    lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
                    kotlin.jvm.internal.e0.checkNotNull(currentSession);
                    e.g gVar = questionActivity.R;
                    if (gVar == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("proposedCharacter");
                        gVar = null;
                    }
                    int idSession = gVar.getIdSession();
                    e.c cVar3 = questionActivity.T;
                    if (cVar3 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akiStats");
                    } else {
                        cVar2 = cVar3;
                    }
                    iValidateObjectWithIdWithJackpot = currentSession.validateObjectWithId(idSession, cVar2);
                } else {
                    Timber.Forest.tag("QuestionActivity").d("JACKPOT in dovalidate object", new Object[0]);
                    lb.e currentSession2 = ca.o.sharedInstance().getCurrentSession();
                    kotlin.jvm.internal.e0.checkNotNull(currentSession2);
                    e.g gVar2 = questionActivity.R;
                    if (gVar2 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("proposedCharacter");
                        gVar2 = null;
                    }
                    int idSession2 = gVar2.getIdSession();
                    String idJoueurAccount = ca.m.sharedInstance().isUserConnected() ? ca.r.sharedInstance().getIdJoueurAccount() : ca.r.sharedInstance().getIdJoueur();
                    e.c cVar4 = questionActivity.T;
                    if (cVar4 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akiStats");
                    } else {
                        cVar2 = cVar4;
                    }
                    iValidateObjectWithIdWithJackpot = currentSession2.validateObjectWithIdWithJackpot(idSession2, idJoueurAccount, cVar2);
                }
                return Integer.valueOf(iValidateObjectWithIdWithJackpot);
        }
    }

    public /* synthetic */ x3(QuestionActivity questionActivity, boolean z10) {
        this.f78661c = z10;
        this.f78662e = questionActivity;
    }
}
