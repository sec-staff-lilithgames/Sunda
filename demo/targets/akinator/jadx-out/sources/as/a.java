package as;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_STREAM(1, 2, -1),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_VERSION(1, 4, -1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_IN_USE(1, 8, -1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_1_1_REQUIRED(13, -1, -1),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_CREDENTIALS(-1, 10, -1);


    /* renamed from: b, reason: collision with root package name */
    public final int f7938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7939c;

    /* renamed from: e, reason: collision with root package name */
    public final int f7940e;

    a(int i10, int i11, int i12) {
        this.f7938b = i10;
        this.f7939c = i11;
        this.f7940e = i12;
    }

    public static a fromHttp2(int i10) {
        for (a aVar : values()) {
            if (aVar.f7938b == i10) {
                return aVar;
            }
        }
        return null;
    }

    public static a fromSpdy3Rst(int i10) {
        for (a aVar : values()) {
            if (aVar.f7939c == i10) {
                return aVar;
            }
        }
        return null;
    }

    public static a fromSpdyGoAway(int i10) {
        for (a aVar : values()) {
            if (aVar.f7940e == i10) {
                return aVar;
            }
        }
        return null;
    }
}
