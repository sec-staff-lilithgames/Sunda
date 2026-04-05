package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class z {

    /* renamed from: b, reason: collision with root package name */
    public static final x f30071b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ z[] f30072c;

    static {
        x xVar = new x();
        f30071b = xVar;
        f30072c = new z[]{xVar, new z() { // from class: com.google.gson.y
            @Override // com.google.gson.z
            public q serialize(Long l9) {
                return l9 == null ? s.f30067b : new v(l9.toString());
            }
        }};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f30072c.clone();
    }

    public abstract q serialize(Long l9);
}
