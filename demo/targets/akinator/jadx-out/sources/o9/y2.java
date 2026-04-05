package o9;

import android.os.CountDownTimer;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.paid.databinding.ActivityHomeBinding;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y2 extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78684a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(HomeActivity homeActivity, long j10) {
        super(j10, 1000L);
        this.f78684a = homeActivity;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        HomeActivity homeActivity = this.f78684a;
        HomeActivity.access$openOrCloseBanner(homeActivity);
        ActivityHomeBinding activityHomeBinding = homeActivity.D;
        if (activityHomeBinding == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding = null;
        }
        activityHomeBinding.timerTextView.setText("0");
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j10) {
        HomeActivity homeActivity = this.f78684a;
        ActivityHomeBinding activityHomeBinding = homeActivity.D;
        ActivityHomeBinding activityHomeBinding2 = null;
        if (activityHomeBinding == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding = null;
        }
        activityHomeBinding.countdownTimer.setProgress((int) j10);
        ActivityHomeBinding activityHomeBinding3 = homeActivity.D;
        if (activityHomeBinding3 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
        } else {
            activityHomeBinding2 = activityHomeBinding3;
        }
        activityHomeBinding2.timerTextView.setText(String.valueOf(j10 / 1000));
    }
}
