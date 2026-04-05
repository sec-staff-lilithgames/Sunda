package x7;

import z.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f91784b = new h();

    /* renamed from: a, reason: collision with root package name */
    public final b0 f91785a = new b0(20);

    public static h getInstance() {
        return f91784b;
    }

    public void clear() {
        this.f91785a.evictAll();
    }

    public r7.h get(String str) {
        if (str == null) {
            return null;
        }
        return (r7.h) this.f91785a.get(str);
    }

    public void put(String str, r7.h hVar) {
        if (str == null) {
            return;
        }
        this.f91785a.put(str, hVar);
    }

    public void resize(int i10) {
        this.f91785a.resize(i10);
    }
}
