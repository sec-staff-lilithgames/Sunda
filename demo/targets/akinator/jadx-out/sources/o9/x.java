package o9;

import com.digidust.elokence.akinator.activities.ConfirmationMailActivity;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;
import com.digidust.elokence.akinator.activities.PostProposeActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.activities.rarecharacter.OptionRareCharacterActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78655b;

    public /* synthetic */ x(int i10) {
        this.f78655b = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int iExcludeProposition = 400;
        switch (this.f78655b) {
            case 0:
                return Integer.valueOf(ca.o.sharedInstance().deleteAccount(ca.m.sharedInstance().getKeyUser()));
            case 1:
                int i10 = ConfirmationMailActivity.G;
                return Integer.valueOf(ca.o.sharedInstance().sendConfirmationMail(ca.m.sharedInstance().getMailUser(), ca.m.sharedInstance().getCurrentLanguage()));
            case 2:
                int i11 = ConnectActivity.U;
                return Integer.valueOf(ca.o.sharedInstance().getGlobalUserInfos(ca.m.sharedInstance().getUidUser()));
            case 3:
                int[] iArr = DefiDuJourActivity.P;
                return Integer.valueOf(ca.o.sharedInstance().updateUserInfos(3, ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getKeyUser(), String.valueOf(ca.m.sharedInstance().getCurrentSubject())));
            case 4:
                int i12 = GameOverSliderActivity.L;
                return lb.s0.f72971j.sharedInstance().startSession(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getCurrentSubject(), ca.o.sharedInstance().isPrio(), ca.m.sharedInstance().isChildProtectEnabled());
            case 5:
                int i13 = GameOverSliderActivity.L;
                return Integer.valueOf(ca.o.sharedInstance().updateJoueurId(ca.m.sharedInstance().getKeyUser()));
            case 6:
                int i14 = OneCharacterProposalActivity.S;
                return lb.s0.f72971j.sharedInstance().startSession(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getCurrentSubject(), ca.o.sharedInstance().isPrio(), ca.m.sharedInstance().isChildProtectEnabled());
            case 7:
                int i15 = OneCharacterProposalActivity.S;
                if (ca.o.sharedInstance().getCurrentSession() != null) {
                    return Integer.valueOf(ca.o.sharedInstance().getCurrentSession().excludeProposition());
                }
                return 400;
            case 8:
                int i16 = OneCharacterProposalActivity.S;
                return Integer.valueOf(ca.o.sharedInstance().checkLogin(ca.m.sharedInstance().getKeyUser()));
            case 9:
                int i17 = PopPedagogiqueActivity.V;
                return Integer.valueOf(ca.o.sharedInstance().updateUserInfosGeniz(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getKeyUser(), String.valueOf(ca.m.sharedInstance().getCurrentSubject()), IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, true));
            case 10:
                int i18 = PostProposeActivity.Z;
                return Integer.valueOf(ca.o.sharedInstance().updateJoueurId(ca.m.sharedInstance().getKeyUser()));
            case 11:
                int i19 = QuestionActivity.f21703n0;
                if (ca.o.sharedInstance().getCurrentSession() != null) {
                    lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
                    kotlin.jvm.internal.e0.checkNotNull(currentSession);
                    iExcludeProposition = currentSession.excludeProposition();
                }
                return Integer.valueOf(iExcludeProposition);
            case 12:
                int i20 = QuestionActivity.f21703n0;
                lb.s0 s0VarSharedInstance = lb.s0.f72971j.sharedInstance();
                String currentLanguage = ca.m.sharedInstance().getCurrentLanguage();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(currentLanguage, "getCurrentLanguage(...)");
                return s0VarSharedInstance.startSession(currentLanguage, ca.m.sharedInstance().getCurrentSubject(), ca.o.sharedInstance().isPrio(), ca.m.sharedInstance().isChildProtectEnabled());
            case 13:
                int i21 = ra.h.f84068k;
                return Integer.valueOf(ca.o.sharedInstance().importUserData(ca.m.sharedInstance().getKeyUser()));
            default:
                int i22 = OptionRareCharacterActivity.N;
                return Integer.valueOf(ca.o.sharedInstance().updateUserJoker(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getKeyUser(), String.valueOf(ca.m.sharedInstance().getCurrentSubject())));
        }
    }
}
