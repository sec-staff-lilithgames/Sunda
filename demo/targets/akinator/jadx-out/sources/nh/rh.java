package nh;

import java.util.PrimitiveIterator;
import java.util.Spliterators;
import java.util.function.Consumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class rh extends Spliterators.AbstractSpliterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f76613a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(long j10, int i10, PrimitiveIterator.OfDouble ofDouble) {
        super(j10, i10);
        this.f76613a = ofDouble;
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer<Object> consumer) {
        PrimitiveIterator.OfDouble ofDouble = this.f76613a;
        if (!ofDouble.hasNext()) {
            return false;
        }
        ofDouble.nextDouble();
        throw null;
    }
}
