package o9;

import android.view.View;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import jb.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b5 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78049c;

    public /* synthetic */ b5(QuestionActivity questionActivity, int i10) {
        this.f78048b = i10;
        this.f78049c = questionActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f78048b;
        e.g gVar = null;
        boolean zIsAwardAlreadyWonForCharacter = true;
        QuestionActivity questionActivity = this.f78049c;
        switch (i10) {
            case 0:
                if (!questionActivity.X) {
                    if (view != null) {
                        view.setSelected(true);
                    }
                    questionActivity.H(3);
                    break;
                }
                break;
            case 1:
                if (!questionActivity.X) {
                    if (view != null) {
                        view.setSelected(true);
                    }
                    questionActivity.H(4);
                    break;
                }
                break;
            case 2:
                if (!questionActivity.X) {
                    questionActivity.X = true;
                    if (ca.m.sharedInstance().isTTSEnabled()) {
                        w9.e.getInstance().stop();
                    }
                    if (ca.m.sharedInstance().hasAlreadyBeenBlockedInCurrentGame()) {
                        ca.r.sharedInstance().addToSetIdUnlocked(ca.u.sharedInstance().getPersoPropose().getIdBase());
                    }
                    ca.u.sharedInstance().setImagePerso(AkActivity.k(questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage));
                    h.a aVar = jb.h.f69257d;
                    aVar.sharedInstance().createOrUpdateMetricValeur("delai_question", String.valueOf(ca.o.sharedInstance().getDelaiMoyen()));
                    ca.o.sharedInstance().setDelaiMoyen(0);
                    ca.o.sharedInstance().setAkinatorStatus(2);
                    ca.o.sharedInstance().addOneWonGame();
                    na.b.playWin();
                    e.g gVar2 = questionActivity.R;
                    if (gVar2 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("proposedCharacter");
                    } else {
                        gVar = gVar2;
                    }
                    ca.u.sharedInstance().setCharacterNameProposed(gVar.getName());
                    if (ca.o.sharedInstance().winFirstTry()) {
                        aVar.sharedInstance().incMetricCompteur("succes_games");
                        aVar.sharedInstance().createOrUpdateMetricValeur("last_game", "S");
                    }
                    if (ca.o.sharedInstance().winFirstTry()) {
                        try {
                            lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
                            aa.a aVarSharedInstance = aa.a.sharedInstance();
                            kotlin.jvm.internal.e0.checkNotNull(currentInstance);
                            zIsAwardAlreadyWonForCharacter = aVarSharedInstance.isAwardAlreadyWonForCharacter(currentInstance.getLanguage(), currentInstance.getBaseLogiqueId(), gVar.getIdBase());
                        } catch (Exception e10) {
                            Timber.Forest.tag("QuestionActivity").e(e10);
                        }
                    }
                    ca.o.sharedInstance().addOneCelebCharacterPlayed();
                    questionActivity.y(zIsAwardAlreadyWonForCharacter);
                    break;
                }
                break;
            case 3:
                if (!questionActivity.X) {
                    questionActivity.X = true;
                    if (ca.m.sharedInstance().isTTSEnabled()) {
                        w9.e.getInstance().stop();
                    }
                    na.b.playBip();
                    ca.u.sharedInstance().showPubTemp(true);
                    if (!ca.u.sharedInstance().getNoMoreQuestionsStatus()) {
                        questionActivity.w();
                        break;
                    } else {
                        questionActivity.G();
                        break;
                    }
                }
                break;
            case 4:
                int i11 = QuestionActivity.f21703n0;
                if (ca.m.sharedInstance().isTTSEnabled()) {
                    w9.e.getInstance().stop();
                }
                na.b.playBip();
                questionActivity.x();
                break;
            case 5:
                int i12 = QuestionActivity.f21703n0;
                Timber.Forest.tag("QuestionActivity").d("Yes Continue to play proposal Click Listener called", new Object[0]);
                lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
                kotlin.jvm.internal.e0.checkNotNull(currentSession);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(questionActivity), null, null, new c6(questionActivity, currentSession.getCurrentSessionProgression(), null), 3, null);
                break;
            case 6:
                questionActivity.E(questionActivity.V);
                break;
            case 7:
                int i13 = QuestionActivity.f21703n0;
                questionActivity.getClass();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(questionActivity), null, null, new g5(questionActivity, null), 3, null);
                break;
            case 8:
                int i14 = QuestionActivity.f21703n0;
                questionActivity.v();
                break;
            case 9:
                if (!questionActivity.X) {
                    if (view != null) {
                        view.setSelected(true);
                    }
                    questionActivity.H(0);
                    break;
                }
                break;
            case 10:
                if (!questionActivity.X) {
                    if (view != null) {
                        view.setSelected(true);
                    }
                    questionActivity.H(2);
                    break;
                }
                break;
            default:
                if (!questionActivity.X) {
                    if (view != null) {
                        view.setSelected(true);
                    }
                    questionActivity.H(1);
                    break;
                }
                break;
        }
    }
}
