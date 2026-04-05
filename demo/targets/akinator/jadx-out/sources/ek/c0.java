package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c0 implements hk.b {
    public static c0 create() {
        return b0.f54463a;
    }

    public static z1 timeProvider() {
        return (z1) hk.d.checkNotNullFromProvides(w.f54661a.timeProvider());
    }

    @Override // hk.b, hk.e, ru.a
    public z1 get() {
        return timeProvider();
    }
}
