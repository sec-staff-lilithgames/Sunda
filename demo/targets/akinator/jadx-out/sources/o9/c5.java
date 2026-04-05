package o9;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import lb.b1;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78069c;

    public /* synthetic */ c5(QuestionActivity questionActivity, int i10) {
        this.f78068b = i10;
        this.f78069c = questionActivity;
    }

    @Override // st.g
    public final void accept(Object obj) {
        int i10 = this.f78068b;
        int i11 = 1;
        QuestionActivity questionActivity = this.f78069c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                int i12 = QuestionActivity.f21703n0;
                if (num == null || num.intValue() != 0) {
                    if ((num == null || num.intValue() != -1) && ((num == null || num.intValue() != 610) && (num == null || num.intValue() != 600))) {
                        Toast.makeText(questionActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        questionActivity.goToHome(false);
                        break;
                    } else {
                        da.q.f51970b.show(questionActivity, 1, new e5(questionActivity, i11));
                        break;
                    }
                } else {
                    ca.o.sharedInstance().setWinFirstTry(false);
                    jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("last_game", "E");
                    ca.o.sharedInstance().setAkinatorStatus(1);
                    na.b.playBip();
                    lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
                    kotlin.jvm.internal.e0.checkNotNull(currentSession);
                    e.i currentSessionProgression = currentSession.getCurrentSessionProgression();
                    kotlin.jvm.internal.e0.checkNotNull(currentSessionProgression);
                    if (currentSessionProgression.getStep() >= 79) {
                        questionActivity.G();
                        break;
                    } else {
                        questionActivity.getClass();
                        Timber.Forest.tag("QuestionActivity").d("Show Process Screen called", new Object[0]);
                        AkinatorSmallButton yesProposalButton = questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(yesProposalButton, "yesProposalButton");
                        questionActivity.markTextviewForUpdate(yesProposalButton);
                        AkinatorSmallButton noProposalButton = questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(noProposalButton, "noProposalButton");
                        questionActivity.markTextviewForUpdate(noProposalButton);
                        TextView bulleProposalText1 = questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bulleProposalText1;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bulleProposalText1, "bulleProposalText1");
                        questionActivity.markTextviewForUpdate(bulleProposalText1);
                        TextView bulleContinueText = questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bulleContinueText;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bulleContinueText, "bulleContinueText");
                        questionActivity.markTextviewForUpdate(bulleContinueText);
                        questionActivity.updateTextViewsSize();
                        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalGroup.setVisibility(8);
                        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bulleContinueText.setVisibility(0);
                        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bulleContinueText.setTypeface(questionActivity.f21686i);
                        AkinatorSmallButton akinatorSmallButton = questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton;
                        b1.a aVar = lb.b1.f72741d;
                        akinatorSmallButton.setText(aVar.sharedInstance().getTraductionFromToken("OUI"));
                        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton.setText(aVar.sharedInstance().getTraductionFromToken("NON"));
                        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bulleContinueText.setText(aVar.sharedInstance().getTraductionFromToken("ON_CONTINUE"));
                        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton.setOnClickListener(questionActivity.f21714k0);
                        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton.setOnClickListener(questionActivity.f21715l0);
                        break;
                    }
                }
                break;
            case 1:
                Integer num2 = (Integer) obj;
                int i13 = QuestionActivity.f21703n0;
                if (num2 == null || num2.intValue() != 0) {
                    if ((num2 == null || num2.intValue() != -1) && ((num2 == null || num2.intValue() != 610) && (num2 == null || num2.intValue() != 600))) {
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(questionActivity), null, null, new s5(questionActivity, null), 3, null);
                        break;
                    } else {
                        da.q.f51970b.show(questionActivity, 1, new e5(questionActivity, 3));
                        questionActivity.X = false;
                        break;
                    }
                } else {
                    ca.u uVarSharedInstance = ca.u.sharedInstance();
                    e.g gVar = questionActivity.U;
                    if (gVar == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("potentialTrap");
                        gVar = null;
                    }
                    uVarSharedInstance.setPersoPropose(gVar);
                    new da.r(questionActivity);
                    Timber.Forest.tag("QuestionActivity").d("Show Avoided Trap Animation called", new Object[0]);
                    questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutProposal.setAlpha(0.5f);
                    questionActivity.z(false);
                    kotlin.jvm.internal.b1 b1Var = new kotlin.jvm.internal.b1();
                    b1Var.f71816b = uu.p0.mutableListOf(new ka.b(ka.a.f70679k, 5));
                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(questionActivity), null, null, new k6(questionActivity, b1Var, null), 3, null);
                    questionActivity.X = false;
                    break;
                }
                break;
            case 2:
                lb.y0 y0Var = (lb.y0) obj;
                int i14 = QuestionActivity.f21703n0;
                ca.o oVarSharedInstance = ca.o.sharedInstance();
                kotlin.jvm.internal.e0.checkNotNull(y0Var);
                oVarSharedInstance.setCurrentSession(y0Var.f73052b);
                int i15 = y0Var.f73051a;
                if (i15 != 0 && i15 != 800) {
                    if (i15 != 500) {
                        if (i15 != -1 && i15 != 610 && i15 != 600) {
                            Toast.makeText(questionActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            questionActivity.goToHome(false);
                            break;
                        } else {
                            da.q.f51970b.show(questionActivity, 1, new e5(questionActivity, 4));
                            break;
                        }
                    } else {
                        Toast.makeText(questionActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("TROP_NOMBREUX_A_JOUER_RELANCE"), 1).show();
                        break;
                    }
                } else if (!ca.m.sharedInstance().isPaid() && ((!ca.m.sharedInstance().isFreemium() || !ca.o.sharedInstance().isUnlocked()) && !questionActivity.W)) {
                    questionActivity.W = true;
                    break;
                } else {
                    questionActivity.getClass();
                    questionActivity.startActivity(new Intent(questionActivity, (Class<?>) QuestionActivity.class));
                    questionActivity.finish();
                    break;
                }
                break;
            case 3:
                Bitmap bitmap = (Bitmap) obj;
                int i16 = QuestionActivity.f21703n0;
                questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().loadingBarAward.setVisibility(8);
                if (questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage != null) {
                    if (bitmap == null) {
                        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setBackgroundColor(-16777216);
                        break;
                    } else {
                        try {
                            questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.getWidth();
                            float height = questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.getHeight();
                            float width = bitmap.getWidth();
                            float height2 = bitmap.getHeight();
                            float f10 = height / height2;
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width * f10), (int) (height2 * f10), true);
                            questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setImageBitmap(bitmapCreateScaledBitmap);
                            questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setVisibility(0);
                            ca.u.sharedInstance().setImagePerso(bitmapCreateScaledBitmap);
                            ObjectAnimator duration = ObjectAnimator.ofFloat(questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(1000L);
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(duration, "setDuration(...)");
                            duration.start();
                            break;
                        } catch (IllegalArgumentException unused) {
                            questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setBackgroundColor(-16777216);
                            return;
                        } catch (OutOfMemoryError unused2) {
                            questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setBackgroundColor(-16777216);
                            return;
                        }
                    }
                }
                break;
            default:
                int i17 = QuestionActivity.f21703n0;
                questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().loadingBarAward.setVisibility(8);
                questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.setBackgroundColor(-16777216);
                break;
        }
    }
}
