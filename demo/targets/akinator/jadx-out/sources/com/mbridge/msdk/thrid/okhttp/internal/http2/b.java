package com.mbridge.msdk.thrid.okhttp.internal.http2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* renamed from: a, reason: collision with root package name */
    public final int f43438a;

    b(int i10) {
        this.f43438a = i10;
    }

    public static b a(int i10) {
        for (b bVar : values()) {
            if (bVar.f43438a == i10) {
                return bVar;
            }
        }
        return null;
    }
}
