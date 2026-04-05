package o9;

import android.widget.Toast;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f78686c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AkActivity f78687e;

    public /* synthetic */ y3(AkActivity akActivity, boolean z10, int i10) {
        this.f78685b = i10;
        this.f78687e = akActivity;
        this.f78686c = z10;
    }

    @Override // st.g
    public final void accept(Object obj) {
        int i10 = this.f78685b;
        boolean z10 = this.f78686c;
        AkActivity akActivity = this.f78687e;
        switch (i10) {
            case 0:
                OneCharacterProposalActivity oneCharacterProposalActivity = (OneCharacterProposalActivity) akActivity;
                Integer num = (Integer) obj;
                int i11 = OneCharacterProposalActivity.S;
                try {
                    da.k kVar = oneCharacterProposalActivity.L;
                    if (kVar != null && kVar.isShowing()) {
                        oneCharacterProposalActivity.L.dismiss();
                    }
                } catch (Exception unused) {
                    oneCharacterProposalActivity.L = null;
                }
                if (num.intValue() != 0) {
                    if (num.intValue() != -1 && num.intValue() != 610 && num.intValue() != 600) {
                        Toast.makeText(oneCharacterProposalActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        oneCharacterProposalActivity.goToHome(false);
                        break;
                    } else {
                        da.q.show(oneCharacterProposalActivity, 1, new com.google.firebase.messaging.c0(oneCharacterProposalActivity, 2, z10));
                        break;
                    }
                } else {
                    ca.u.sharedInstance().setStats(oneCharacterProposalActivity.J);
                    ca.v.sharedInstance().stopGameEvents(0, oneCharacterProposalActivity.D);
                    oneCharacterProposalActivity.goToCharacterFound();
                    break;
                }
                break;
            default:
                QuestionActivity questionActivity = (QuestionActivity) akActivity;
                Integer num2 = (Integer) obj;
                int i12 = QuestionActivity.f21703n0;
                if (num2 == null || num2.intValue() != 0) {
                    if ((num2 == null || num2.intValue() != -1) && ((num2 == null || num2.intValue() != 610) && (num2 == null || num2.intValue() != 600))) {
                        Toast.makeText(questionActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        questionActivity.X = false;
                        questionActivity.goToHome(false);
                        break;
                    } else {
                        da.q.f51970b.show(questionActivity, 1, new com.google.firebase.messaging.c0(questionActivity, 3, z10));
                        questionActivity.X = false;
                        break;
                    }
                } else {
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("QuestionActivity").d("Validation OK, show triomphe and award animation", new Object[0]);
                    ca.u uVarSharedInstance = ca.u.sharedInstance();
                    e.c cVar = questionActivity.T;
                    if (cVar == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akiStats");
                        cVar = null;
                    }
                    uVarSharedInstance.setStats(cVar);
                    Timber.Tree treeTag = forest.tag("QuestionActivity");
                    e.c cVar2 = questionActivity.T;
                    if (cVar2 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akiStats");
                        cVar2 = null;
                    }
                    treeTag.d(a.b.e(cVar2.getAwardType(), "stats award type : "), new Object[0]);
                    ca.v vVarSharedInstance = ca.v.sharedInstance();
                    FirebaseAnalytics firebaseAnalytics = questionActivity.E;
                    if (firebaseAnalytics == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("firebaseAnalytics");
                        firebaseAnalytics = null;
                    }
                    vVarSharedInstance.stopGameEvents(0, firebaseAnalytics);
                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(questionActivity), null, null, new t5(questionActivity, z10, null), 3, null);
                    break;
                }
                break;
        }
    }
}
