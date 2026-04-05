package o9;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.ContinueProcessActivity;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.PostProposeActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.activities.SeveralCharactersProposalActivity;
import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.CoroutineScope;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78183c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f78184e;

    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
        this.f78182b = i10;
        this.f78183c = obj;
        this.f78184e = obj2;
    }

    @Override // st.g
    public final void accept(Object obj) {
        Intent intent;
        int i10 = this.f78182b;
        Object obj2 = this.f78184e;
        Object obj3 = this.f78183c;
        switch (i10) {
            case 0:
                ContinueProcessActivity continueProcessActivity = (ContinueProcessActivity) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Integer num = (Integer) obj;
                int i11 = ContinueProcessActivity.H;
                if (num.intValue() != 0) {
                    if (num.intValue() != -1 && num.intValue() != 610 && num.intValue() != 600) {
                        Toast.makeText(continueProcessActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        continueProcessActivity.goToHome(false);
                        break;
                    } else {
                        da.q.show(continueProcessActivity, 1, new ha.a(continueProcessActivity, 28));
                        break;
                    }
                } else {
                    if (arrayList.isEmpty()) {
                        intent = new Intent(continueProcessActivity, (Class<?>) SoundlikeActivity.class);
                    } else {
                        intent = new Intent(continueProcessActivity, (Class<?>) SoundlikeActivity.class);
                        intent.putExtra("several", arrayList);
                    }
                    continueProcessActivity.startActivity(intent);
                    continueProcessActivity.finish();
                    break;
                }
                break;
            case 1:
                OneCharacterProposalActivity oneCharacterProposalActivity = (OneCharacterProposalActivity) obj3;
                String str = (String) obj2;
                if (!oneCharacterProposalActivity.M) {
                    RelativeLayout relativeLayout = (RelativeLayout) oneCharacterProposalActivity.findViewById(R.id.layoutOneCharacterFound);
                    relativeLayout.setVisibility(0);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(500L);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setAnimationListener(new d4(oneCharacterProposalActivity, str));
                    relativeLayout.startAnimation(alphaAnimation);
                    break;
                } else {
                    oneCharacterProposalActivity.startActivity(new Intent(oneCharacterProposalActivity, (Class<?>) PostProposeActivity.class));
                    oneCharacterProposalActivity.finish();
                    break;
                }
            case 2:
                QuestionActivity questionActivity = (QuestionActivity) obj3;
                String str2 = (String) obj2;
                if (!questionActivity.Z) {
                    questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutOneCharacterFound.setVisibility(0);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation2.setDuration(500L);
                    alphaAnimation2.setFillAfter(true);
                    alphaAnimation2.setAnimationListener(new w5(questionActivity, str2));
                    questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutOneCharacterFound.startAnimation(alphaAnimation2);
                    break;
                } else {
                    questionActivity.startActivity(new Intent(questionActivity, (Class<?>) PostProposeActivity.class));
                    questionActivity.finish();
                    break;
                }
            case 3:
                QuestionActivity questionActivity2 = (QuestionActivity) obj3;
                Object obj4 = (CoroutineScope) obj2;
                Integer num2 = (Integer) obj;
                Timber.Forest forest = Timber.Forest;
                forest.tag("QuestionActivity").d("getObjectsWithListSize result : " + num2, new Object[0]);
                if (num2 == null || num2.intValue() != 0) {
                    if ((num2 == null || num2.intValue() != -1) && ((num2 == null || num2.intValue() != 610) && (num2 == null || num2.intValue() != 600))) {
                        forest.tag("QuestionActivity").d("manage fin de partie erreur inconnnnnnnnnnnnnuuuuuuuuuue", new Object[0]);
                        Toast.makeText(questionActivity2, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        questionActivity2.X = false;
                        questionActivity2.goToHome(false);
                        break;
                    } else {
                        forest.tag("QuestionActivity").d("getObjectsWithListSize KO", new Object[0]);
                        da.o oVar = da.q.f51970b;
                        kotlin.jvm.internal.e0.checkNotNull(obj4, "null cannot be cast to non-null type android.content.Context");
                        oVar.show((Context) obj4, 1, new e5(questionActivity2, 6));
                        questionActivity2.X = false;
                        break;
                    }
                } else {
                    forest.tag("QuestionActivity").d("getObjectsWithListSize OK", new Object[0]);
                    Intent intent2 = new Intent(questionActivity2, (Class<?>) SoundlikeActivity.class);
                    intent2.putExtra("several", questionActivity2.S);
                    questionActivity2.X = false;
                    questionActivity2.startActivity(intent2);
                    questionActivity2.finish();
                    break;
                }
                break;
            case 4:
                SeveralCharactersProposalActivity severalCharactersProposalActivity = (SeveralCharactersProposalActivity) obj3;
                e.c cVar = (e.c) obj2;
                Integer num3 = (Integer) obj;
                int i12 = SeveralCharactersProposalActivity.N;
                try {
                    da.k kVar = severalCharactersProposalActivity.I;
                    if (kVar != null && kVar.isShowing()) {
                        severalCharactersProposalActivity.I.dismiss();
                    }
                } catch (IllegalArgumentException unused) {
                    severalCharactersProposalActivity.I = null;
                }
                if (num3.intValue() != 0) {
                    Toast.makeText(severalCharactersProposalActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                    severalCharactersProposalActivity.goToHome(false);
                    break;
                } else {
                    ca.u.sharedInstance().setPersoPropose(severalCharactersProposalActivity.J);
                    ca.u.sharedInstance().setStats(cVar);
                    na.b.playWin();
                    ca.o.sharedInstance().addOneLostGame();
                    ca.o.sharedInstance().setAkinatorStatus(1);
                    Intent intent3 = new Intent(severalCharactersProposalActivity, (Class<?>) GameOverSliderActivity.class);
                    intent3.putExtra("keyComeFromSeveral", true);
                    ca.o.sharedInstance().setGameOverActivityState(11);
                    severalCharactersProposalActivity.startActivity(intent3);
                    severalCharactersProposalActivity.finish();
                    break;
                }
            default:
                p8 p8Var = ((n8) obj3).f78405b;
                ReentrantLock reentrantLock = p8Var.f78447i;
                if (((Editable) obj2).length() < 3) {
                    p8Var.f78444f.setVisibility(8);
                } else {
                    p8Var.f78444f.setVisibility(0);
                }
                ArrayList arrayList2 = p8Var.f78445g;
                if (reentrantLock.tryLock()) {
                    p8Var.f78446h.clear();
                    arrayList2.removeAll(Collections.singleton(null));
                    p8Var.f78446h.addAll(arrayList2);
                    reentrantLock.unlock();
                    break;
                }
                break;
        }
    }
}
