package com.explorestack.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ha {

    /* renamed from: b, reason: collision with root package name */
    public static final ha f22204b;

    /* renamed from: c, reason: collision with root package name */
    public static final ha f22205c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ha[] f22206e;

    static {
        ha haVar = new ha("PROTO2", 0);
        f22204b = haVar;
        ha haVar2 = new ha("PROTO3", 1);
        f22205c = haVar2;
        f22206e = new ha[]{haVar, haVar2};
    }

    public static ha valueOf(String str) {
        return (ha) Enum.valueOf(ha.class, str);
    }

    public static ha[] values() {
        return (ha[]) f22206e.clone();
    }
}
