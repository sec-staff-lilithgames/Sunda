package pv;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends ov.a {
    @Override // ov.a
    public Random getImpl() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        e0.checkNotNullExpressionValue(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }

    @Override // ov.g
    public double nextDouble(double d10) {
        return ThreadLocalRandom.current().nextDouble(d10);
    }

    @Override // ov.g
    public int nextInt(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // ov.g
    public long nextLong(long j10) {
        return ThreadLocalRandom.current().nextLong(j10);
    }

    @Override // ov.g
    public long nextLong(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }
}
