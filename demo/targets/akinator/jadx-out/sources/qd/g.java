package qd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f82765c = new e().build();

    /* renamed from: a, reason: collision with root package name */
    public final long f82766a;

    /* renamed from: b, reason: collision with root package name */
    public final f f82767b;

    public g(long j10, f fVar) {
        this.f82766a = j10;
        this.f82767b = fVar;
    }

    public static g getDefaultInstance() {
        return f82765c;
    }

    public static e newBuilder() {
        return new e();
    }

    public long getEventsDroppedCount() {
        return this.f82766a;
    }

    public f getReason() {
        return this.f82767b;
    }
}
