package o9;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Animation;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e4 implements Animation.AnimationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f78114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OneCharacterProposalActivity f78115c;

    public e4(OneCharacterProposalActivity oneCharacterProposalActivity, String str) {
        this.f78115c = oneCharacterProposalActivity;
        this.f78114b = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        OneCharacterProposalActivity oneCharacterProposalActivity = this.f78115c;
        Intent intent = new Intent(oneCharacterProposalActivity, (Class<?>) DefiDuJourActivity.class);
        intent.putExtra("keyPersoTrouve", this.f78114b);
        ca.u.sharedInstance().setImageDefi(((BitmapDrawable) oneCharacterProposalActivity.C.getDrawable()) != null ? Bitmap.createBitmap(((BitmapDrawable) oneCharacterProposalActivity.C.getDrawable()).getBitmap()) : null);
        oneCharacterProposalActivity.startActivity(intent);
        oneCharacterProposalActivity.finish();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
