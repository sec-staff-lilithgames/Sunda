package com.explorestack.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class jd {

    /* renamed from: b, reason: collision with root package name */
    public static final jd f22280b;

    /* renamed from: c, reason: collision with root package name */
    public static final jd f22281c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ jd[] f22282e;

    static {
        jd jdVar = new jd("ASCENDING", 0);
        f22280b = jdVar;
        jd jdVar2 = new jd("DESCENDING", 1);
        f22281c = jdVar2;
        f22282e = new jd[]{jdVar, jdVar2};
    }

    public static jd valueOf(String str) {
        return (jd) Enum.valueOf(jd.class, str);
    }

    public static jd[] values() {
        return (jd[]) f22282e.clone();
    }
}
