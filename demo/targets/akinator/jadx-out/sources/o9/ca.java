package o9;

import android.animation.Animator;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.VoteActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ca implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VoteActivity f78082a;

    public ca(VoteActivity voteActivity) {
        this.f78082a = voteActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        VoteActivity voteActivity = this.f78082a;
        TextView textView = voteActivity.G;
        StringBuilder sb2 = new StringBuilder("");
        int i10 = voteActivity.D + 1;
        voteActivity.D = i10;
        sb2.append(i10);
        textView.setText(sb2.toString());
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
