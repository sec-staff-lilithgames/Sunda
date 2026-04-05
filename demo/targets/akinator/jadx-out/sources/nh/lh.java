package nh;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.function.Consumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class lh extends Spliterators.AbstractSpliterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f76459a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(long j10, int i10, Iterator it) {
        super(j10, i10);
        this.f76459a = it;
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer<Object> consumer) {
        Iterator it = this.f76459a;
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        throw null;
    }
}
