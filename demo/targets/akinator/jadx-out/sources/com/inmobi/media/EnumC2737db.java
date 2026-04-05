package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.db, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC2737db {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2737db f32782b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2737db f32783c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2737db[] f32784d;

    /* renamed from: a, reason: collision with root package name */
    public final int f32785a;

    static {
        EnumC2737db enumC2737db = new EnumC2737db(0, 0, "HIGHEST");
        f32782b = enumC2737db;
        EnumC2737db enumC2737db2 = new EnumC2737db(1, 1, "HIGH");
        EnumC2737db enumC2737db3 = new EnumC2737db(2, 2, "MEDIUM");
        f32783c = enumC2737db3;
        EnumC2737db[] enumC2737dbArr = {enumC2737db, enumC2737db2, enumC2737db3, new EnumC2737db(3, 3, "LOW"), new EnumC2737db(4, 4, "LOWEST")};
        f32784d = enumC2737dbArr;
        cv.b.enumEntries(enumC2737dbArr);
    }

    public EnumC2737db(int i10, int i11, String str) {
        this.f32785a = i11;
    }

    public static EnumC2737db valueOf(String str) {
        return (EnumC2737db) Enum.valueOf(EnumC2737db.class, str);
    }

    public static EnumC2737db[] values() {
        return (EnumC2737db[]) f32784d.clone();
    }
}
