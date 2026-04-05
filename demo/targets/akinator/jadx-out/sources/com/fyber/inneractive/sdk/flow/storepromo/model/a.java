package com.fyber.inneractive.sdk.flow.storepromo.model;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final b f23863a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23864b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23865c;

    public a(String str, b bVar) {
        this.f23864b = str;
        this.f23863a = bVar;
        this.f23865c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f23865c - ((a) obj).f23865c;
    }

    public a(String str, b bVar, int i10) {
        this.f23864b = str;
        this.f23863a = bVar;
        this.f23865c = i10;
    }
}
