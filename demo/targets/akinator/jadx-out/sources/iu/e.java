package iu;

import java.util.concurrent.atomic.AtomicLong;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e {
    public static long add(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, addCap(j11, j10)));
        return j11;
    }

    public static long addCancel(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, addCap(j11, j10)));
        return j11;
    }

    public static long addCap(long j10, long j11) {
        long j12 = j10 + j11;
        if (j12 < 0) {
            return Long.MAX_VALUE;
        }
        return j12;
    }

    public static long multiplyCap(long j10, long j11) {
        long j12 = j10 * j11;
        if (((j10 | j11) >>> 31) == 0 || j12 / j10 == j11) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static long produced(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                mu.a.onError(new IllegalStateException(o2.m(j12, "More produced than requested: ")));
                j12 = 0;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }

    public static long producedCancel(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                mu.a.onError(new IllegalStateException(o2.m(j12, "More produced than requested: ")));
                j12 = 0;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }
}
