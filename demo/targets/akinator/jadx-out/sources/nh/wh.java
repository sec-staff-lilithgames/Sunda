package nh;

import java.util.Spliterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class wh implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f76746a;

    /* renamed from: b, reason: collision with root package name */
    public long f76747b;

    public wh(Spliterator spliterator, long j10) {
        this.f76746a = spliterator;
        this.f76747b = j10;
    }

    public abstract wh a(Spliterator spliterator, long j10);

    @Override // java.util.Spliterator
    public int characteristics() {
        return this.f76746a.characteristics() & 16464;
    }

    @Override // java.util.Spliterator
    public long estimateSize() {
        return this.f76746a.estimateSize();
    }

    @Override // java.util.Spliterator
    public wh trySplit() {
        Spliterator spliteratorTrySplit = this.f76746a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        wh whVarA = a(spliteratorTrySplit, this.f76747b);
        this.f76747b = spliteratorTrySplit.getExactSizeIfKnown() + this.f76747b;
        return whVarA;
    }
}
