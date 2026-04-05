package v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f89047a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89048b;

    public a(String workSpecId, String prerequisiteId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        kotlin.jvm.internal.e0.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.f89047a = workSpecId;
        this.f89048b = prerequisiteId;
    }

    public final String getPrerequisiteId() {
        return this.f89048b;
    }

    public final String getWorkSpecId() {
        return this.f89047a;
    }
}
