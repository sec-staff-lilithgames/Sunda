package com.explorestack.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d5 {

    /* renamed from: b, reason: collision with root package name */
    public static final d5 f22050b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d5[] f22051c;

    /* JADX INFO: Fake field, exist only in values array */
    d5 EF0;

    static {
        d5 d5Var = new d5("PROTO1", 0);
        d5 d5Var2 = new d5("PROTO2", 1);
        f22050b = d5Var2;
        f22051c = new d5[]{d5Var, d5Var2};
    }

    public static d5 valueOf(String str) {
        return (d5) Enum.valueOf(d5.class, str);
    }

    public static d5[] values() {
        return (d5[]) f22051c.clone();
    }
}
