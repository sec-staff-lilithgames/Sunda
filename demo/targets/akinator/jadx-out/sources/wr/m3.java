package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final l3 f91026a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91027b;

    public m3(l3 l3Var, String str) {
        this.f91026a = l3Var;
        this.f91027b = str;
    }

    public static m3 channelBuilder(l3 l3Var) {
        return new m3((l3) mh.p1.checkNotNull(l3Var), null);
    }

    public static m3 error(String str) {
        return new m3(null, (String) mh.p1.checkNotNull(str));
    }

    public l3 getChannelBuilder() {
        return this.f91026a;
    }

    public String getError() {
        return this.f91027b;
    }
}
