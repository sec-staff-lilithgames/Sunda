package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum j6 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* renamed from: b, reason: collision with root package name */
    public final int f91004b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f91005c;

    j6(int i10) {
        this.f91004b = i10;
        this.f91005c = Integer.toString(i10).getBytes(mh.h0.f74626a);
    }

    public m6 toStatus() {
        return (m6) m6.f91036d.get(this.f91004b);
    }

    public int value() {
        return this.f91004b;
    }
}
