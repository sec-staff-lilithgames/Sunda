package nh;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ih extends Spliterators.AbstractSpliterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f76369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f76370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiFunction f76371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(long j10, int i10, Iterator it, Iterator it2, BiFunction biFunction) {
        super(j10, i10);
        this.f76369a = it;
        this.f76370b = it2;
        this.f76371c = biFunction;
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer<Object> consumer) {
        Iterator it = this.f76369a;
        if (!it.hasNext()) {
            return false;
        }
        Iterator it2 = this.f76370b;
        if (!it2.hasNext()) {
            return false;
        }
        consumer.accept(this.f76371c.apply(it.next(), it2.next()));
        return true;
    }
}
