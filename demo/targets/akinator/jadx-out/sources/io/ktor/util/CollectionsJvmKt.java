package io.ktor.util;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CollectionsJvmKt {
    public static final <T> Set<T> unmodifiable(Set<? extends T> set) {
        e0.checkNotNullParameter(set, "<this>");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(set);
        e0.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(this)");
        return setUnmodifiableSet;
    }
}
