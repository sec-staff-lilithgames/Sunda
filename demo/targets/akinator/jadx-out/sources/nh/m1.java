package nh;

import java.util.Spliterator;
import java.util.function.DoubleConsumer;
import java.util.function.Function;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m1 extends r1 implements Spliterator.OfDouble {
    public m1(Spliterator.OfDouble ofDouble, Spliterator spliterator, Function function, int i10, long j10) {
        super(ofDouble, spliterator, function, new li.a(29), i10, j10);
    }

    @Override // java.util.Spliterator.OfDouble
    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble
    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // nh.r1, nh.l1, java.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
        return (Spliterator.OfDouble) trySplit();
    }
}
