package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e0 implements hk.b {
    public static e0 create() {
        return d0.f54494a;
    }

    public static b2 uuidGenerator() {
        return (b2) hk.d.checkNotNullFromProvides(w.f54661a.uuidGenerator());
    }

    @Override // hk.b, hk.e, ru.a
    public b2 get() {
        return uuidGenerator();
    }
}
