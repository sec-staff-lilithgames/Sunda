package o9;

import android.graphics.Typeface;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78298i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78299j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f78300k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(QuestionActivity questionActivity, kotlin.jvm.internal.b1 b1Var, zu.d dVar) {
        super(2, dVar);
        this.f78299j = questionActivity;
        this.f78300k = b1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new k6(this.f78299j, this.f78300k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        QuestionActivity questionActivity = this.f78299j;
        Typeface typeface = questionActivity.f21686i;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78298i;
        oa.l lVar = null;
        kotlin.jvm.internal.b1 b1Var = this.f78300k;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            oa.l lVar2 = questionActivity.F;
            if (lVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akinatorPlayer");
                lVar2 = null;
            }
            Job jobPlaySequence = lVar2.playSequence(questionActivity.L, (List) b1Var.f71816b);
            this.f78298i = 1;
            if (jobPlaySequence.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutProposal.setAlpha(1.0f);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalGroup.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalButtons.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().yesProposalButton.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().noProposalButton.setVisibility(8);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().replayButton.setVisibility(8);
        ka.a aVar = ka.a.f70689u;
        b1Var.f71816b = uu.p0.mutableListOf(new ka.b(aVar, 2));
        oa.l lVar3 = questionActivity.F;
        if (lVar3 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akinatorPlayer");
        } else {
            lVar = lVar3;
        }
        lVar.playSequence(ka.a.f70679k, (List) b1Var.f71816b);
        questionActivity.L = aVar;
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().avoidedTrapGroup.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().approvedText.setTypeface(questionActivity.f21689l);
        TextView textView = questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().approvedText;
        b1.a aVar2 = lb.b1.f72741d;
        textView.setText(aVar2.sharedInstance().getTraductionFromToken("PIEGE_TEST_APPROUVE"));
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().explicationPiege.setTypeface(typeface);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().explicationPiege.setTextColor(-16777216);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().explicationPiege.setText(aVar2.sharedInstance().getTraductionFromToken("PIEGE_EXPLICATION"));
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bravoMessage.setTypeface(typeface);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bravoMessage.setTextColor(-16777216);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().bravoMessage.setText(aVar2.sharedInstance().getTraductionFromToken("BRAVO_TU_N_ES_PAS_TOMBE_PIEGE"));
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().okButton.setText(aVar2.sharedInstance().getTraductionFromToken("OK"));
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().okButton.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().okButton.setEnabled(true);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().okButton.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f(7, questionActivity, b1Var));
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((k6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
