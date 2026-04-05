package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.n;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g implements r.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<r> f43378a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.g f43379b;

    /* renamed from: c, reason: collision with root package name */
    private final c f43380c;

    /* renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.c f43381d;

    /* renamed from: e, reason: collision with root package name */
    private final int f43382e;

    /* renamed from: f, reason: collision with root package name */
    private final w f43383f;

    /* renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f43384g;

    /* renamed from: h, reason: collision with root package name */
    private final n f43385h;

    /* renamed from: i, reason: collision with root package name */
    private final int f43386i;

    /* renamed from: j, reason: collision with root package name */
    private final int f43387j;

    /* renamed from: k, reason: collision with root package name */
    private final int f43388k;

    /* renamed from: l, reason: collision with root package name */
    private int f43389l;

    public g(List<r> list, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2, int i10, w wVar, com.mbridge.msdk.thrid.okhttp.d dVar, n nVar, int i11, int i12, int i13) {
        this.f43378a = list;
        this.f43381d = cVar2;
        this.f43379b = gVar;
        this.f43380c = cVar;
        this.f43382e = i10;
        this.f43383f = wVar;
        this.f43384g = dVar;
        this.f43385h = nVar;
        this.f43386i = i11;
        this.f43387j = i12;
        this.f43388k = i13;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r.a
    public int a() {
        return this.f43386i;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r.a
    public int b() {
        return this.f43387j;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r.a
    public int c() {
        return this.f43388k;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r.a
    public w d() {
        return this.f43383f;
    }

    public com.mbridge.msdk.thrid.okhttp.d e() {
        return this.f43384g;
    }

    public com.mbridge.msdk.thrid.okhttp.g f() {
        return this.f43381d;
    }

    public n g() {
        return this.f43385h;
    }

    public c h() {
        return this.f43380c;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.g i() {
        return this.f43379b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r.a
    public y a(w wVar) throws IOException {
        return a(wVar, this.f43379b, this.f43380c, this.f43381d);
    }

    public y a(w wVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2) throws IOException {
        if (this.f43382e < this.f43378a.size()) {
            this.f43389l++;
            if (this.f43380c != null && !this.f43381d.a(wVar.g())) {
                throw new IllegalStateException("network interceptor " + this.f43378a.get(this.f43382e - 1) + " must retain the same host and port");
            }
            if (this.f43380c != null && this.f43389l > 1) {
                throw new IllegalStateException("network interceptor " + this.f43378a.get(this.f43382e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.f43378a, gVar, cVar, cVar2, this.f43382e + 1, wVar, this.f43384g, this.f43385h, this.f43386i, this.f43387j, this.f43388k);
            r rVar = this.f43378a.get(this.f43382e);
            y yVarA = rVar.a(gVar2);
            if (cVar != null && this.f43382e + 1 < this.f43378a.size() && gVar2.f43389l != 1) {
                throw new IllegalStateException("network interceptor " + rVar + " must call proceed() exactly once");
            }
            if (yVarA != null) {
                if (yVarA.d() != null) {
                    return yVarA;
                }
                throw new IllegalStateException("interceptor " + rVar + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + rVar + " returned null");
        }
        throw new AssertionError();
    }
}
