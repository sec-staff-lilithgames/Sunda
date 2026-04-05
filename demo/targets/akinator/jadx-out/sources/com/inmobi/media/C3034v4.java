package com.inmobi.media;

import pw.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.v4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3034v4 implements Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC2983s4 f33484a;

    public C3034v4(String url, EnumC2983s4 errorCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        this.f33484a = errorCode;
        l.a aVar = pw.l.f81911f;
    }

    @Override // com.inmobi.media.Y9
    public final int a() {
        return this.f33484a.f33364a;
    }

    @Override // com.inmobi.media.Y9
    public final String b() {
        return this.f33484a.name();
    }
}
