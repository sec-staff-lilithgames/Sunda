package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.t4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC3000t4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC3000t4[] f33385a;

    static {
        EnumC3000t4[] enumC3000t4Arr = {new EnumC3000t4(0, -100, "PING_V2_DISABLED", "Ping V2 is disabled from SDK config"), new EnumC3000t4(1, -101, "PING_ID_MISSING", "Ping ID is missing"), new EnumC3000t4(2, -102, "PING_URL_INVALID", "Ping url is invalid"), new EnumC3000t4(3, -103, "PING_URL_MISSING", "Ping URL is missing"), new EnumC3000t4(4, -104, "PING_JSON_INVALID", "Ping JSON is invalid"), new EnumC3000t4(5, -105, "PING_ARRAY_EMPTY", "Ping array is empty"), new EnumC3000t4(6, -106, "PING_UNKNOWN_RESPONSE", "Ping response is unknown"), new EnumC3000t4(7, -107, "PING_EXCEPTION", "Ping exception occurred")};
        f33385a = enumC3000t4Arr;
        cv.b.enumEntries(enumC3000t4Arr);
    }

    public EnumC3000t4(int i10, int i11, String str, String str2) {
    }

    public static EnumC3000t4 valueOf(String str) {
        return (EnumC3000t4) Enum.valueOf(EnumC3000t4.class, str);
    }

    public static EnumC3000t4[] values() {
        return (EnumC3000t4[]) f33385a.clone();
    }
}
