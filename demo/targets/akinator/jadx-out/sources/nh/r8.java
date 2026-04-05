package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface r8 {
    boolean areEqual();

    Map<Object, q8> entriesDiffering();

    Map<Object, Object> entriesInCommon();

    Map<Object, Object> entriesOnlyOnLeft();

    Map<Object, Object> entriesOnlyOnRight();

    boolean equals(Object obj);

    int hashCode();
}
