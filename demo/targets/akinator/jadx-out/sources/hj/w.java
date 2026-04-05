package hj;

import android.os.CountDownTimer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public CountDownTimer f58992a;

    public void cancel() {
        CountDownTimer countDownTimer = this.f58992a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f58992a = null;
        }
    }

    public void start(v vVar, long j10, long j11) {
        this.f58992a = new u(vVar, j10, j11).start();
    }
}
