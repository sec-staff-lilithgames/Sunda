package nh;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class qh extends wh implements DoubleConsumer {
    @Override // nh.wh
    public final wh a(Spliterator spliterator, long j10) {
        return new qh((Spliterator.OfDouble) spliterator, j10);
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer<Object> consumer) {
        if (!((Spliterator.OfDouble) this.f76746a).tryAdvance((DoubleConsumer) this)) {
            return false;
        }
        this.f76747b++;
        throw null;
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d10) {
    }
}
