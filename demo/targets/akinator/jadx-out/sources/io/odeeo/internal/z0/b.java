package io.odeeo.internal.z0;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f67787b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static long f67788c;

    /* renamed from: a, reason: collision with root package name */
    public long f67789a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public final long getAdFrequencyMillis$odeeoSdk_release() {
            return b.f67788c;
        }

        public final void setAdFrequencyMillis$odeeoSdk_release(long j10) {
            b.f67788c = j10;
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public final long a() {
        return getCurrentTime() - this.f67789a;
    }

    public long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public final int getPacingDelayInSeconds$odeeoSdk_release() {
        return (int) (Math.max((f67788c - 10000) - a(), 0L) / 1000);
    }

    public final long getPacingRemainingTime$odeeoSdk_release() {
        return f67788c - a();
    }

    public final long getStartPlayingTime$odeeoSdk_release() {
        return this.f67789a;
    }

    public final boolean isPacingTimeElapsed$odeeoSdk_release() {
        long jA = a();
        return jA < 0 || jA >= f67788c;
    }

    public final void setStartPlayingTime$odeeoSdk_release(long j10) {
        this.f67789a = j10;
    }

    public final void startCountingPacingTime$odeeoSdk_release() {
        this.f67789a = getCurrentTime();
    }
}
