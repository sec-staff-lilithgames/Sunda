package j9;

import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final double f69189a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double getElapsedMillis(long j10) {
        return (getLogTime() - j10) * f69189a;
    }

    public static long getLogTime() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
