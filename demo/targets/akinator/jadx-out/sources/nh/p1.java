package nh;

import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p1 extends r1 implements Spliterator.OfLong {
    public p1(Spliterator.OfLong ofLong, Spliterator spliterator, Function function, int i10, long j10) {
        super(ofLong, spliterator, function, new n1(1), i10, j10);
    }

    @Override // java.util.Spliterator.OfLong
    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong
    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // nh.r1, nh.l1, java.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) trySplit();
    }
}
