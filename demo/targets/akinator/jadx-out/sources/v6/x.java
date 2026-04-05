package v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f89164a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.b f89165b;

    public x(String workSpecId, androidx.work.b progress) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
        this.f89164a = workSpecId;
        this.f89165b = progress;
    }

    public final androidx.work.b getProgress() {
        return this.f89165b;
    }

    public final String getWorkSpecId() {
        return this.f89164a;
    }
}
