package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u5 {

    /* renamed from: a, reason: collision with root package name */
    public final j5 f91154a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91155b;

    public u5(j5 j5Var, String str) {
        this.f91154a = j5Var;
        this.f91155b = str;
    }

    public static u5 error(String str) {
        return new u5(null, (String) mh.p1.checkNotNull(str));
    }

    public static u5 serverBuilder(j5 j5Var) {
        return new u5((j5) mh.p1.checkNotNull(j5Var), null);
    }

    public String getError() {
        return this.f91155b;
    }

    public j5 getServerBuilder() {
        return this.f91154a;
    }
}
