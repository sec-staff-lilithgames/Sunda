package v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f89159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89160b;

    public t(String name, String workSpecId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        this.f89159a = name;
        this.f89160b = workSpecId;
    }

    public final String getName() {
        return this.f89159a;
    }

    public final String getWorkSpecId() {
        return this.f89160b;
    }
}
