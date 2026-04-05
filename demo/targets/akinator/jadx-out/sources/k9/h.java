package k9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f70669a = new a();

    public static <T extends f> w3.f simple(int i10, d dVar) {
        return new e(new w3.g(i10), dVar, f70669a);
    }

    public static <T extends f> w3.f threadSafe(int i10, d dVar) {
        return new e(new w3.h(i10), dVar, f70669a);
    }

    public static <T> w3.f threadSafeList() {
        return threadSafeList(20);
    }

    public static <T> w3.f threadSafeList(int i10) {
        return new e(new w3.h(i10), new b(), new c());
    }

    public static <T extends f> w3.f threadSafe(int i10, d dVar, g gVar) {
        return new e(new w3.h(i10), dVar, gVar);
    }
}
