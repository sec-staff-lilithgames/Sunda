package nh;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public Spliterator f76434a;

    /* renamed from: b, reason: collision with root package name */
    public final Spliterator f76435b;

    /* renamed from: c, reason: collision with root package name */
    public final Function f76436c;

    /* renamed from: d, reason: collision with root package name */
    public final k1 f76437d;

    /* renamed from: e, reason: collision with root package name */
    public int f76438e;

    /* renamed from: f, reason: collision with root package name */
    public long f76439f;

    public l1(Spliterator spliterator, Spliterator spliterator2, Function function, k1 k1Var, int i10, long j10) {
        this.f76434a = spliterator;
        this.f76435b = spliterator2;
        this.f76436c = function;
        this.f76437d = k1Var;
        this.f76438e = i10;
        this.f76439f = j10;
    }

    @Override // java.util.Spliterator
    public final int characteristics() {
        return this.f76438e;
    }

    @Override // java.util.Spliterator
    public final long estimateSize() {
        Spliterator spliterator = this.f76434a;
        if (spliterator != null) {
            this.f76439f = Math.max(this.f76439f, spliterator.estimateSize());
        }
        return Math.max(this.f76439f, 0L);
    }

    @Override // java.util.Spliterator
    public void forEachRemaining(Consumer<Object> consumer) {
        Spliterator spliterator = this.f76434a;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            this.f76434a = null;
        }
        this.f76435b.forEachRemaining(new j1(this, consumer, 0));
        this.f76439f = 0L;
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer<Object> consumer) {
        do {
            Spliterator spliterator = this.f76434a;
            if (spliterator != null && spliterator.tryAdvance(consumer)) {
                long j10 = this.f76439f;
                if (j10 == Long.MAX_VALUE) {
                    return true;
                }
                this.f76439f = j10 - 1;
                return true;
            }
            this.f76434a = null;
        } while (this.f76435b.tryAdvance(new ca.p(this, 3)));
        return false;
    }

    @Override // java.util.Spliterator
    public final Spliterator<Object> trySplit() {
        Spliterator<Object> spliteratorTrySplit = this.f76435b.trySplit();
        if (spliteratorTrySplit == null) {
            Spliterator<Object> spliterator = this.f76434a;
            if (spliterator == null) {
                return null;
            }
            this.f76434a = null;
            return spliterator;
        }
        int i10 = this.f76438e & (-65);
        long jEstimateSize = estimateSize();
        if (jEstimateSize < Long.MAX_VALUE) {
            jEstimateSize /= 2;
            this.f76439f -= jEstimateSize;
            this.f76438e = i10;
        }
        Spliterator<?> spliteratorNewFlatMapSpliterator = this.f76437d.newFlatMapSpliterator(this.f76434a, spliteratorTrySplit, this.f76436c, i10, jEstimateSize);
        this.f76434a = null;
        return spliteratorNewFlatMapSpliterator;
    }
}
