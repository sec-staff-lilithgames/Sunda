package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h extends z {

    /* renamed from: a, reason: collision with root package name */
    private final String f43390a;

    /* renamed from: b, reason: collision with root package name */
    private final long f43391b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.e f43392c;

    public h(String str, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        this.f43390a = str;
        this.f43391b = j10;
        this.f43392c = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public long h() {
        return this.f43391b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public com.mbridge.msdk.thrid.okio.e k() {
        return this.f43392c;
    }
}
