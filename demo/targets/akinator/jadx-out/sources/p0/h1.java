package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kv.a f80232a;

        public a(kv.a aVar) {
            this.f80232a = aVar;
        }

        @Override // p0.g1
        public void dispose() {
            this.f80232a.invoke();
        }
    }

    public final g1 onDispose(kv.a aVar) {
        return new a(aVar);
    }
}
