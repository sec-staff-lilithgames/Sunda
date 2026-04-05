package nh;

import java.util.Spliterator;
import java.util.function.Function;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface k1 {
    Spliterator<?> newFlatMapSpliterator(Spliterator<?> spliterator, Spliterator<Object> spliterator2, Function<Object, Spliterator<?>> function, int i10, long j10);
}
