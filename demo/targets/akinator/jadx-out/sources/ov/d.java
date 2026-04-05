package ov;

import java.util.Random;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends Random {

    /* renamed from: b, reason: collision with root package name */
    public final g f79857b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f79858c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public d(g impl) {
        e0.checkNotNullParameter(impl, "impl");
        this.f79857b = impl;
    }

    public final g getImpl() {
        return this.f79857b;
    }

    @Override // java.util.Random
    public final int next(int i10) {
        return this.f79857b.nextBits(i10);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f79857b.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        this.f79857b.nextBytes(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f79857b.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f79857b.nextFloat();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f79857b.nextInt();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f79857b.nextLong();
    }

    @Override // java.util.Random
    public void setSeed(long j10) {
        if (this.f79858c) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f79858c = true;
    }

    @Override // java.util.Random
    public int nextInt(int i10) {
        return this.f79857b.nextInt(i10);
    }
}
