package q5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface f extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    <R> Object useConnection(boolean z10, kv.p pVar, zu.d<? super R> dVar);
}
