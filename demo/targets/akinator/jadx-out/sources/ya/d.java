package ya;

import io.bidmachine.protobuf.EventTypeExtended;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum d {
    ENCRYPTION_EXCEPTION(1100),
    RAW_ONE_DT_ERROR(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE),
    ONE_DT_PARSE_ERROR(1102),
    ONE_DT_AUTHENTICATION_ERROR(1103),
    ONE_DT_BROADCAST_ERROR(1104),
    ONE_DT_REQUEST_ERROR(1105),
    ONE_DT_GENERAL_ERROR(1106);


    /* renamed from: b, reason: collision with root package name */
    public final int f94276b;

    d(int i10) {
        this.f94276b = i10;
    }

    public final int a() {
        return this.f94276b;
    }
}
