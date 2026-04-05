package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f11565e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar) {
            super(1);
            this.f11565e = lVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [R, java.lang.Object] */
        public final R invoke(long j10) {
            return this.f11565e.invoke(Long.valueOf(j10 / 1000000));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }

    public static final <R> Object withInfiniteAnimationFrameMillis(kv.l lVar, zu.d<? super R> dVar) {
        return withInfiniteAnimationFrameNanos(new a(lVar), dVar);
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(kv.l lVar, zu.d<? super R> dVar) {
        if (dVar.getContext().get(a2.o3.f3743b) == null) {
            return p0.e2.withFrameNanos(lVar, dVar);
        }
        throw new ClassCastException();
    }
}
