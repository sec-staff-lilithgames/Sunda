package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r {
    public static final <T> T getOrNull(p pVar, t0 key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return (T) pVar.getOrElseNullable(key, q.f53604e);
    }
}
