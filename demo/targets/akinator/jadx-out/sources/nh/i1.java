package nh;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Collector f76343a = Collector.of(new v0(10), new x0(0), new y0(0), new w0(1), new Collector.Characteristics[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final Collector f76344b = Collector.of(new v0(1), new x0(1), new y0(1), new w0(2), new Collector.Characteristics[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final Collector f76345c = Collector.of(new v0(2), new x0(2), new y0(15), new w0(0), new Collector.Characteristics[0]);

    public static Collector a(Function function, Function function2, Supplier supplier) {
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        mh.p1.checkNotNull(supplier);
        return Collector.of(supplier, new z0(function, function2, 1), new y0(2), new Collector.Characteristics[0]);
    }

    public static Collector b(Function function, ToIntFunction toIntFunction) {
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(toIntFunction);
        return Collector.of(new v0(3), new c1(0, function, toIntFunction), new y0(3), new w0(4), new Collector.Characteristics[0]);
    }
}
