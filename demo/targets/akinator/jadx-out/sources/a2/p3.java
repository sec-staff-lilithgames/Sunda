package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p3 {
    public static final <R> Object withInfiniteAnimationFrameNanos(kv.l lVar, zu.d<? super R> dVar) {
        if (dVar.getContext().get(o3.f3743b) == null) {
            return p0.e2.withFrameNanos(lVar, dVar);
        }
        throw new ClassCastException();
    }
}
