package o9;

import android.animation.Animator;
import android.graphics.Typeface;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m0 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefiDuJourActivity f78333a;

    public m0(DefiDuJourActivity defiDuJourActivity) {
        this.f78333a = defiDuJourActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int[] iArr = DefiDuJourActivity.P;
        DefiDuJourActivity defiDuJourActivity = this.f78333a;
        Typeface typeface = defiDuJourActivity.f21686i;
        try {
            jb.h hVarSharedInstance = jb.h.sharedInstance();
            int[] iArr2 = DefiDuJourActivity.P;
            hVarSharedInstance.createOrUpdateMetricCompteur("gz_gain_playing", iArr2[defiDuJourActivity.K - 1]);
            if (ca.m.sharedInstance().isUserConnected()) {
                DefiDuJourActivity.v(iArr2[defiDuJourActivity.K - 1]);
            } else {
                ca.r.sharedInstance().depositGenizWithoutNotif(iArr2[defiDuJourActivity.K - 1]);
            }
        } catch (Exception unused) {
        }
        defiDuJourActivity.E.setVisibility(8);
        defiDuJourActivity.C.setEnabled(true);
        if (defiDuJourActivity.K == defiDuJourActivity.J) {
            defiDuJourActivity.C.setEnabled(false);
            RelativeLayout relativeLayout = (RelativeLayout) defiDuJourActivity.findViewById(R.id.layoutFireworks);
            defiDuJourActivity.H = relativeLayout;
            relativeLayout.setVisibility(0);
            TextView textView = (TextView) defiDuJourActivity.findViewById(R.id.textFelicitations);
            textView.setTypeface(typeface);
            textView.setText(lb.b1.sharedInstance().getTraductionFromToken("FELICITATIONS"));
            TextView textView2 = (TextView) defiDuJourActivity.findViewById(R.id.textRemporte);
            textView2.setTypeface(typeface);
            textView2.setText(lb.b1.sharedInstance().getTraductionFromToken("TU_REMPORTES"));
            TextView textView3 = (TextView) defiDuJourActivity.findViewById(R.id.textGz);
            textView3.setTypeface(typeface);
            textView3.setText("+1000GZ");
            defiDuJourActivity.markTextviewForUpdate(textView);
            defiDuJourActivity.markTextviewForUpdate(textView2);
            defiDuJourActivity.markTextviewForUpdate(textView3);
            defiDuJourActivity.updateTextViewsSize();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setAnimationListener(new n0(defiDuJourActivity));
            defiDuJourActivity.H.startAnimation(alphaAnimation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
