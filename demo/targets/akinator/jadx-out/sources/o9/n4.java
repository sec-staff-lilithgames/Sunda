package o9;

import android.app.Dialog;
import android.content.Intent;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.PostHomeSliderActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.paid.databinding.ActivityPostHomeSliderBinding;
import kotlinx.coroutines.CoroutineScope;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n4 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78389i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ lb.y0 f78390j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ PostHomeSliderActivity f78391k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w0 f78392l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(lb.y0 y0Var, PostHomeSliderActivity postHomeSliderActivity, kotlin.jvm.internal.w0 w0Var, zu.d dVar) {
        super(2, dVar);
        this.f78390j = y0Var;
        this.f78391k = postHomeSliderActivity;
        this.f78392l = w0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new n4(this.f78390j, this.f78391k, this.f78392l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        PostHomeSliderActivity postHomeSliderActivity = this.f78391k;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78389i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            ca.o oVarSharedInstance = ca.o.sharedInstance();
            lb.y0 y0Var = this.f78390j;
            oVarSharedInstance.setCurrentSession(y0Var.f73052b);
            ActivityPostHomeSliderBinding activityPostHomeSliderBinding = null;
            try {
                if (postHomeSliderActivity.F != null) {
                    Dialog dialog = postHomeSliderActivity.F;
                    kotlin.jvm.internal.e0.checkNotNull(dialog);
                    if (dialog.isShowing()) {
                        Dialog dialog2 = postHomeSliderActivity.F;
                        kotlin.jvm.internal.e0.checkNotNull(dialog2);
                        dialog2.dismiss();
                    }
                }
            } catch (Exception unused) {
                postHomeSliderActivity.F = null;
            }
            int i11 = y0Var.f73051a;
            if (i11 == 0 || i11 == 800) {
                ca.o.sharedInstance().setAkinatorStatus(0);
                Timber.Tree treeTag = Timber.Forest.tag("QuestionActivity");
                e.i currentSessionProgression = y0Var.f73052b.getCurrentSessionProgression();
                treeTag.d("launchMyGame OK and " + (currentSessionProgression != null ? currentSessionProgression.getTrouvitudes() : null), new Object[0]);
                postHomeSliderActivity.startActivity(new Intent(postHomeSliderActivity, (Class<?>) QuestionActivity.class));
                postHomeSliderActivity.finish();
            } else if (i11 == 500) {
                Toast.makeText(postHomeSliderActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("TROP_NOMBREUX_A_JOUER_RELANCE"), 1).show();
                ActivityPostHomeSliderBinding activityPostHomeSliderBinding2 = postHomeSliderActivity.C;
                if (activityPostHomeSliderBinding2 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityPostHomeSliderBinding = activityPostHomeSliderBinding2;
                }
                activityPostHomeSliderBinding.overlayCachePostHome.setVisibility(8);
            } else if (i11 == -1 || i11 == 600) {
                this.f78392l.f71863b = false;
                da.o oVar = da.q.f51970b;
                this.f78389i = 1;
                if (oVar.await(postHomeSliderActivity, 1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Toast.makeText(postHomeSliderActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                postHomeSliderActivity.goToHome(false);
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((n4) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
