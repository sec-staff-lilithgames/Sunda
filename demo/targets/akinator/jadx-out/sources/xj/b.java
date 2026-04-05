package xj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public static b f92025a;

    public static b getInstance() {
        if (f92025a == null) {
            f92025a = new b();
        }
        return f92025a;
    }

    @Override // xj.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
