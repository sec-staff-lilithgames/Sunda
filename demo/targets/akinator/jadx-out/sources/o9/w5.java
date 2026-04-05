package o9;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w5 implements Animation.AnimationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f78648c;

    public w5(QuestionActivity questionActivity, String str) {
        this.f78647b = questionActivity;
        this.f78648c = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        Bitmap bitmapCreateBitmap;
        QuestionActivity questionActivity = this.f78647b;
        Intent intent = new Intent(questionActivity, (Class<?>) DefiDuJourActivity.class);
        intent.putExtra("keyPersoTrouve", this.f78648c);
        if (((BitmapDrawable) questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.getDrawable()) != null) {
            Drawable drawable = questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().proposalImage.getDrawable();
            kotlin.jvm.internal.e0.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            bitmapCreateBitmap = Bitmap.createBitmap(((BitmapDrawable) drawable).getBitmap());
        } else {
            bitmapCreateBitmap = null;
        }
        ca.u.sharedInstance().setImageDefi(bitmapCreateBitmap);
        questionActivity.startActivity(intent);
        questionActivity.finish();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
