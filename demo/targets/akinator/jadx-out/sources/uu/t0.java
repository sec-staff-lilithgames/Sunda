package uu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class t0 extends s0 {
    public static final <T> void forEach(Iterator<? extends T> it, kv.l operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        while (it.hasNext()) {
            operation.invoke(it.next());
        }
    }

    public static final <T> Iterator<g1> withIndex(Iterator<? extends T> it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "<this>");
        return new i1(it);
    }
}
