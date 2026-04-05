package nh;

import java.util.PrimitiveIterator;
import java.util.Spliterators;
import java.util.function.Consumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ph extends Spliterators.AbstractSpliterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f76570a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(long j10, int i10, PrimitiveIterator.OfLong ofLong) {
        super(j10, i10);
        this.f76570a = ofLong;
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer<Object> consumer) {
        PrimitiveIterator.OfLong ofLong = this.f76570a;
        if (!ofLong.hasNext()) {
            return false;
        }
        ofLong.nextLong();
        throw null;
    }
}
