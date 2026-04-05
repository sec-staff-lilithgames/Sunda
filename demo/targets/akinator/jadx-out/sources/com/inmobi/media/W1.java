package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class W1 {

    /* renamed from: a, reason: collision with root package name */
    public String f32425a;

    /* renamed from: b, reason: collision with root package name */
    public long f32426b;

    /* renamed from: c, reason: collision with root package name */
    public int f32427c;

    /* renamed from: d, reason: collision with root package name */
    public String f32428d;

    public W1(String eventType, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        this.f32425a = eventType;
        this.f32428d = str;
        this.f32426b = System.currentTimeMillis();
    }

    public final String a() {
        String str = this.f32428d;
        return str == null ? "" : str;
    }
}
