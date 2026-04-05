package com.mbridge.msdk.click.entity;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f39685a;

    /* renamed from: b, reason: collision with root package name */
    public String f39686b;

    /* renamed from: c, reason: collision with root package name */
    public String f39687c;

    /* renamed from: d, reason: collision with root package name */
    public String f39688d;

    /* renamed from: e, reason: collision with root package name */
    public int f39689e;

    /* renamed from: f, reason: collision with root package name */
    public int f39690f;

    /* renamed from: g, reason: collision with root package name */
    public String f39691g;

    /* renamed from: h, reason: collision with root package name */
    public String f39692h;

    public String a() {
        return "statusCode=" + this.f39690f + ", location=" + this.f39685a + ", contentType=" + this.f39686b + ", contentLength=" + this.f39689e + ", contentEncoding=" + this.f39687c + ", referer=" + this.f39688d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClickResponseHeader{location='");
        sb2.append(this.f39685a);
        sb2.append("', contentType='");
        sb2.append(this.f39686b);
        sb2.append("', contentEncoding='");
        sb2.append(this.f39687c);
        sb2.append("', referer='");
        sb2.append(this.f39688d);
        sb2.append("', contentLength=");
        sb2.append(this.f39689e);
        sb2.append(", statusCode=");
        sb2.append(this.f39690f);
        sb2.append(", url='");
        sb2.append(this.f39691g);
        sb2.append("', exception='");
        return o2.o(sb2, this.f39692h, "'}");
    }
}
