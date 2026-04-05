package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f93293a = (String) mh.p1.checkNotNull("gRPC Java", "userAgentName");

    /* renamed from: b, reason: collision with root package name */
    public final String f93294b = (String) mh.p1.checkNotNull("1.62.2", "implementationVersion");

    public String getImplementationVersion() {
        return this.f93294b;
    }

    public String getUserAgent() {
        return this.f93293a;
    }

    public String toString() {
        return this.f93293a + " " + this.f93294b;
    }
}
