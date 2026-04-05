package nh;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.function.Function;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class w0 implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76728a;

    public /* synthetic */ w0(int i10) {
        this.f76728a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f76728a) {
            case 0:
                return ((h6) obj).build();
            case 1:
                return ((x4) obj).build();
            case 2:
                return ((k6) obj).build();
            case 3:
                return d5.copyOf((fc) obj);
            case 4:
                return d6.g(((ud) obj).entrySet());
            case 5:
                return o6.copyOf((fc) obj);
            case 6:
                EnumMap enumMap = ((g1) obj).f76278b;
                return enumMap == null ? m5.of() : v4.i(enumMap);
            case 7:
                return ((q4) obj).buildOrThrow();
            case 8:
                return ((g5) obj).buildOrThrow();
            case 9:
                return ((t6) obj).build();
            case 10:
                return ((c5) obj).build();
            case 11:
                return ((m6) obj).build();
            case 12:
                return m5.copyOf((Map) obj);
            case 13:
                return ((r6) obj).buildOrThrow();
            case 14:
                return s6.copyOfSorted((TreeMap) obj);
            case 15:
                h1 h1Var = (h1) obj;
                EnumSet enumSet = h1Var.f76314a;
                if (enumSet == null) {
                    return l6.of();
                }
                l6 l6VarJ = w4.j(enumSet);
                h1Var.f76314a = null;
                return l6VarJ;
            case 16:
                return OptionalInt.of(((Integer) obj).intValue());
            case 17:
                return OptionalDouble.of(((Double) obj).doubleValue());
            case 18:
                return (Spliterator.OfDouble) obj;
            case 19:
                return (Spliterator.OfLong) obj;
            case 20:
                return (Spliterator) obj;
            case 21:
                return OptionalLong.of(((Long) obj).longValue());
            case 22:
                return (Spliterator.OfInt) obj;
            default:
                return ((rc.m) obj).getFullName();
        }
    }
}
