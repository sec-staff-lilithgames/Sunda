package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f54597b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final sj.c f54598a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public o(sj.c transportFactoryProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.f54598a = transportFactoryProvider;
    }

    @Override // ek.p
    public void log(y0 sessionEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionEvent, "sessionEvent");
        ((md.f0) ((md.e0) ((jd.l) this.f54598a.get())).getTransport("FIREBASE_APPQUALITY_SESSION", y0.class, jd.e.of("json"), new af.g(this, 24))).send(jd.f.ofData(sessionEvent));
    }
}
