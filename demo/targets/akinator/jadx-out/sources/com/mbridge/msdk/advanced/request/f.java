package com.mbridge.msdk.advanced.request;

import e3.g;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private int f39582a;

    /* renamed from: b, reason: collision with root package name */
    private String f39583b;

    /* renamed from: c, reason: collision with root package name */
    private int f39584c;

    /* renamed from: d, reason: collision with root package name */
    private int f39585d;

    /* renamed from: e, reason: collision with root package name */
    private int f39586e;

    public void a(String str) {
        this.f39583b = str;
    }

    public int b() {
        return this.f39585d;
    }

    public int c() {
        return this.f39584c;
    }

    public int d() {
        return this.f39582a;
    }

    public String e() {
        return this.f39583b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NativeAdvancedV3ParamsEntity{reqType=");
        sb2.append(this.f39582a);
        sb2.append(", session_id='");
        sb2.append(this.f39583b);
        sb2.append("', offset=");
        sb2.append(this.f39584c);
        sb2.append(", expectWidth=");
        sb2.append(this.f39585d);
        sb2.append(", expectHeight=");
        return g.m(sb2, this.f39586e, AbstractJsonLexerKt.END_OBJ);
    }

    public int a() {
        return this.f39586e;
    }

    public void b(int i10) {
        this.f39585d = i10;
    }

    public void c(int i10) {
        this.f39584c = i10;
    }

    public void d(int i10) {
        this.f39582a = i10;
    }

    public void a(int i10) {
        this.f39586e = i10;
    }
}
