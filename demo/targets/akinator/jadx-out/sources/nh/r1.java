package nh;

import java.util.Spliterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class r1 extends l1 implements Spliterator.OfPrimitive {
    @Override // java.util.Spliterator.OfPrimitive
    public final void forEachRemaining(Object obj) {
        Spliterator spliterator = this.f76434a;
        if (spliterator != null) {
            ((Spliterator.OfPrimitive) spliterator).forEachRemaining((Spliterator.OfPrimitive) obj);
            this.f76434a = null;
        }
        this.f76435b.forEachRemaining(new j1(this, obj, 1));
        this.f76439f = 0L;
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(Object obj) {
        do {
            Spliterator spliterator = this.f76434a;
            if (spliterator != null && ((Spliterator.OfPrimitive) spliterator).tryAdvance((Spliterator.OfPrimitive) obj)) {
                long j10 = this.f76439f;
                if (j10 == Long.MAX_VALUE) {
                    return true;
                }
                this.f76439f = j10 - 1;
                return true;
            }
            this.f76434a = null;
        } while (this.f76435b.tryAdvance(new ca.p(this, 4)));
        return false;
    }

    @Override // nh.l1, java.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return (Spliterator.OfPrimitive) trySplit();
    }
}
