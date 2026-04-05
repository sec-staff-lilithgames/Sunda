package nh;

import java.util.PrimitiveIterator;
import java.util.Spliterators;
import java.util.function.Consumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class nh extends Spliterators.AbstractSpliterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f76514a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(long j10, int i10, PrimitiveIterator.OfInt ofInt) {
        super(j10, i10);
        this.f76514a = ofInt;
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer<Object> consumer) {
        PrimitiveIterator.OfInt ofInt = this.f76514a;
        if (!ofInt.hasNext()) {
            return false;
        }
        ofInt.nextInt();
        throw null;
    }
}
