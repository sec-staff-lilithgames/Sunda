package nh;

import java.util.Collection;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class z0 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f76804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f76805c;

    public /* synthetic */ z0(Function function, Function function2, int i10) {
        this.f76803a = i10;
        this.f76804b = function;
        this.f76805c = function2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f76803a) {
            case 0:
                ((q4) obj).put(this.f76804b.apply(obj2), this.f76805c.apply(obj2));
                break;
            case 1:
                Collection<Object> collection = ((fc) obj).get(this.f76804b.apply(obj2));
                Stream stream = (Stream) this.f76805c.apply(obj2);
                Objects.requireNonNull(collection);
                stream.forEachOrdered(new ca.p(collection, 2));
                break;
            case 2:
                ((g1) obj).a((Enum) mh.p1.checkNotNull((Enum) this.f76804b.apply(obj2), "Null key for input %s", obj2), mh.p1.checkNotNull(this.f76805c.apply(obj2), "Null value for input %s", obj2));
                break;
            case 3:
                ((g5) obj).put(this.f76804b.apply(obj2), this.f76805c.apply(obj2));
                break;
            case 4:
                ((c5) obj).put(this.f76804b.apply(obj2), this.f76805c.apply(obj2));
                break;
            case 5:
                ((m6) obj).put(this.f76804b.apply(obj2), this.f76805c.apply(obj2));
                break;
            case 6:
                ((g1) obj).a((Enum) mh.p1.checkNotNull((Enum) this.f76804b.apply(obj2), "Null key for input %s", obj2), mh.p1.checkNotNull(this.f76805c.apply(obj2), "Null value for input %s", obj2));
                break;
            case 7:
                ((fc) obj).put(this.f76804b.apply(obj2), this.f76805c.apply(obj2));
                break;
            default:
                ((r6) obj).put(this.f76804b.apply(obj2), this.f76805c.apply(obj2));
                break;
        }
    }
}
