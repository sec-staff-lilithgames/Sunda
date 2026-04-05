package mh;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h1 {
    public static boolean equal(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int hashCode(Object... objArr) {
        return Objects.hash(objArr);
    }
}
