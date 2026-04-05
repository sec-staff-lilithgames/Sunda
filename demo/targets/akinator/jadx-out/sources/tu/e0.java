package tu;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e0 {
    public static final <A, B> v to(A a10, B b10) {
        return new v(a10, b10);
    }

    public static final <T> List<T> toList(v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        return uu.p0.listOf(vVar.getFirst(), vVar.getSecond());
    }

    public static final <T> List<T> toList(d0 d0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<this>");
        return uu.p0.listOf(d0Var.getFirst(), d0Var.getSecond(), d0Var.getThird());
    }
}
