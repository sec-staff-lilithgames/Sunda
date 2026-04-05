package com.vungle.ads.internal.util;

import android.os.CountDownTimer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.a;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SuspendableTimer {
    private final double durationSecs;
    private boolean isCanceled;
    private boolean isPaused;
    private double nextDurationSecs;
    private final a onFinish;
    private final a onTick;
    private final boolean repeats;
    private long startTimeMillis;
    private CountDownTimer timer;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.util.SuspendableTimer$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3670invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3670invoke();
            return x0.f87415a;
        }
    }

    public SuspendableTimer(double d10, boolean z10, a onTick, a onFinish) {
        e0.checkNotNullParameter(onTick, "onTick");
        e0.checkNotNullParameter(onFinish, "onFinish");
        this.durationSecs = d10;
        this.repeats = z10;
        this.onTick = onTick;
        this.onFinish = onFinish;
        this.nextDurationSecs = d10;
    }

    private final CountDownTimer createCountdown(long j10) {
        return new CountDownTimer(j10, this) { // from class: com.vungle.ads.internal.util.SuspendableTimer.createCountdown.1
            final /* synthetic */ SuspendableTimer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(j10, j10);
                this.this$0 = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                SuspendableTimer suspendableTimer = this.this$0;
                suspendableTimer.onFinish.invoke();
                if (!suspendableTimer.repeats || suspendableTimer.isCanceled) {
                    suspendableTimer.cancel();
                } else {
                    suspendableTimer.setNextDurationSecs$vungle_ads_release(suspendableTimer.durationSecs);
                    suspendableTimer.start();
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j11) {
                this.this$0.onTick.invoke();
            }
        };
    }

    private final long getDurationMillis() {
        return (long) (this.durationSecs * 1000);
    }

    private final double getElapsedSecs() {
        return getElapsedMillis$vungle_ads_release() / 1000;
    }

    private final long getNextDurationMillis() {
        return (long) (this.nextDurationSecs * 1000);
    }

    public final void cancel() {
        this.isPaused = false;
        this.isCanceled = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final long getElapsedMillis$vungle_ads_release() {
        long jCurrentTimeMillis;
        long nextDurationMillis;
        if (this.isPaused) {
            jCurrentTimeMillis = getDurationMillis();
            nextDurationMillis = getNextDurationMillis();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            nextDurationMillis = this.startTimeMillis;
        }
        return jCurrentTimeMillis - nextDurationMillis;
    }

    public final double getNextDurationSecs$vungle_ads_release() {
        return this.nextDurationSecs;
    }

    public final long getStartTimeMillis$vungle_ads_release() {
        return this.startTimeMillis;
    }

    public final CountDownTimer getTimer$vungle_ads_release() {
        return this.timer;
    }

    public final void pause() {
        if (this.timer == null) {
            return;
        }
        this.nextDurationSecs -= getElapsedSecs();
        this.isPaused = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void resume() {
        if (this.isPaused) {
            this.isPaused = false;
            start();
        }
    }

    public final void setNextDurationSecs$vungle_ads_release(double d10) {
        this.nextDurationSecs = d10;
    }

    public final void setStartTimeMillis$vungle_ads_release(long j10) {
        this.startTimeMillis = j10;
    }

    public final void setTimer$vungle_ads_release(CountDownTimer countDownTimer) {
        this.timer = countDownTimer;
    }

    public final void start() {
        this.startTimeMillis = System.currentTimeMillis();
        CountDownTimer countDownTimerCreateCountdown = createCountdown(getNextDurationMillis());
        this.timer = countDownTimerCreateCountdown;
        if (countDownTimerCreateCountdown != null) {
            countDownTimerCreateCountdown.start();
        }
    }

    public /* synthetic */ SuspendableTimer(double d10, boolean z10, a aVar, a aVar2, int i10, u uVar) {
        this(d10, z10, (i10 & 4) != 0 ? AnonymousClass1.INSTANCE : aVar, aVar2);
    }

    public static /* synthetic */ void getElapsedMillis$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getNextDurationSecs$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getStartTimeMillis$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTimer$vungle_ads_release$annotations() {
    }
}
