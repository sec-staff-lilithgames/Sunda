package hj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f58968a;

    public k(ru.a aVar) {
        this.f58968a = aVar;
    }

    public static k create(ru.a aVar) {
        return new k(aVar);
    }

    public static j newInstance(com.bumptech.glide.u uVar) {
        return new j(uVar);
    }

    @Override // gj.c, gj.f, ru.a
    public j get() {
        return newInstance((com.bumptech.glide.u) this.f58968a.get());
    }
}
