package uu;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r {
    public r(kotlin.jvm.internal.u uVar) {
    }

    public final boolean setEquals$kotlin_stdlib(Set<?> c10, Set<?> other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c10, "c");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        if (c10.size() != other.size()) {
            return false;
        }
        return c10.containsAll(other);
    }

    public final int unorderedHashCode$kotlin_stdlib(Collection<?> c10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c10, "c");
        Iterator<?> it = c10.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
