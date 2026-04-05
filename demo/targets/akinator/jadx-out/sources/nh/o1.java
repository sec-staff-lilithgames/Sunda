package nh;

import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o1 extends r1 implements Spliterator.OfInt {
    public o1(Spliterator.OfInt ofInt, Spliterator spliterator, Function function, int i10, long j10) {
        super(ofInt, spliterator, function, new n1(0), i10, j10);
    }

    @Override // java.util.Spliterator.OfInt
    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt
    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // nh.r1, nh.l1, java.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }
}
