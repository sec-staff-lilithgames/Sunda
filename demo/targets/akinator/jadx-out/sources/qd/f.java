package qd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum f implements xi.d {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: b, reason: collision with root package name */
    public final int f82764b;

    f(int i10) {
        this.f82764b = i10;
    }

    @Override // xi.d
    public int getNumber() {
        return this.f82764b;
    }
}
