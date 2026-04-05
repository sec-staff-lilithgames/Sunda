package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e2 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.l f80195b;

        public a(kv.l lVar) {
            this.f80195b = lVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [R, java.lang.Object] */
        public final R invoke(long j10) {
            return this.f80195b.invoke(Long.valueOf(j10 / 1000000));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }

    public static final d2 getMonotonicFrameClock(zu.m mVar) {
        d2 d2Var = (d2) mVar.get(c2.f80168b);
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final <R> Object withFrameMillis(d2 d2Var, kv.l lVar, zu.d<? super R> dVar) {
        return d2Var.withFrameNanos(new a(lVar), dVar);
    }

    public static final <R> Object withFrameNanos(kv.l lVar, zu.d<? super R> dVar) {
        return getMonotonicFrameClock(dVar.getContext()).withFrameNanos(lVar, dVar);
    }

    public static final <R> Object withFrameMillis(kv.l lVar, zu.d<? super R> dVar) {
        return getMonotonicFrameClock(dVar.getContext()).withFrameNanos(new a(lVar), dVar);
    }

    public static /* synthetic */ void getMonotonicFrameClock$annotations(zu.m mVar) {
    }
}
