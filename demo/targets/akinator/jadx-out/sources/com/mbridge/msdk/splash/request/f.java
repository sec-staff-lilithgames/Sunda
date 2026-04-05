package com.mbridge.msdk.splash.request;

import e3.g;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private int f42965a;

    /* renamed from: b, reason: collision with root package name */
    private String f42966b;

    /* renamed from: c, reason: collision with root package name */
    private int f42967c;

    /* renamed from: d, reason: collision with root package name */
    private int f42968d;

    /* renamed from: e, reason: collision with root package name */
    private int f42969e;

    public void a(String str) {
        this.f42966b = str;
    }

    public int b() {
        return this.f42968d;
    }

    public int c() {
        return this.f42967c;
    }

    public int d() {
        return this.f42965a;
    }

    public String e() {
        return this.f42966b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NativeAdvancedV3ParamsEntity{reqType=");
        sb2.append(this.f42965a);
        sb2.append(", session_id='");
        sb2.append(this.f42966b);
        sb2.append("', offset=");
        sb2.append(this.f42967c);
        sb2.append(", expectWidth=");
        sb2.append(this.f42968d);
        sb2.append(", expectHeight=");
        return g.m(sb2, this.f42969e, AbstractJsonLexerKt.END_OBJ);
    }

    public int a() {
        return this.f42969e;
    }

    public void b(int i10) {
        this.f42968d = i10;
    }

    public void c(int i10) {
        this.f42967c = i10;
    }

    public void d(int i10) {
        this.f42965a = i10;
    }

    public void a(int i10) {
        this.f42969e = i10;
    }
}
