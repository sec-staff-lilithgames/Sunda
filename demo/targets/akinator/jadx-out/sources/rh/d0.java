package rh;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f84357a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(d0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = c0.f84355b;
        }
        f84357a = comparator;
    }
}
