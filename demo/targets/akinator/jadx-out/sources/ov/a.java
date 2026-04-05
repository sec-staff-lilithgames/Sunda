package ov;

import java.util.Random;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a extends g {
    public abstract Random getImpl();

    @Override // ov.g
    public int nextBits(int i10) {
        return h.takeUpperBits(getImpl().nextInt(), i10);
    }

    @Override // ov.g
    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    @Override // ov.g
    public byte[] nextBytes(byte[] array) {
        e0.checkNotNullParameter(array, "array");
        getImpl().nextBytes(array);
        return array;
    }

    @Override // ov.g
    public double nextDouble() {
        return getImpl().nextDouble();
    }

    @Override // ov.g
    public float nextFloat() {
        return getImpl().nextFloat();
    }

    @Override // ov.g
    public int nextInt() {
        return getImpl().nextInt();
    }

    @Override // ov.g
    public long nextLong() {
        return getImpl().nextLong();
    }

    @Override // ov.g
    public int nextInt(int i10) {
        return getImpl().nextInt(i10);
    }
}
