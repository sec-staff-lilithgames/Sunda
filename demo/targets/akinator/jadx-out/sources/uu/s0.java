package uu;

import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class s0 extends q0 {
    public static final <T> Iterator<T> iterator(Enumeration<T> enumeration) {
        kotlin.jvm.internal.e0.checkNotNullParameter(enumeration, "<this>");
        return new r0(enumeration);
    }
}
