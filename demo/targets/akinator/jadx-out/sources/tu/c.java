package tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {
    public c(kotlin.jvm.internal.u uVar) {
    }

    public abstract Object callRecursive(Object obj, zu.d<Object> dVar);

    public abstract <U, S> Object callRecursive(a aVar, U u10, zu.d<? super S> dVar);

    @f
    public final Void invoke(a aVar, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}
