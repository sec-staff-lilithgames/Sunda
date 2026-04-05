package com.google.android.exoplayer2;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public Uri f28014a;

    /* renamed from: b, reason: collision with root package name */
    public String f28015b;

    /* renamed from: c, reason: collision with root package name */
    public String f28016c;

    /* renamed from: d, reason: collision with root package name */
    public int f28017d;

    /* renamed from: e, reason: collision with root package name */
    public int f28018e;

    /* renamed from: f, reason: collision with root package name */
    public String f28019f;

    /* renamed from: g, reason: collision with root package name */
    public String f28020g;

    public s1(Uri uri) {
        this.f28014a = uri;
    }

    public t1 build() {
        return new t1(this);
    }

    public s1 setId(String str) {
        this.f28020g = str;
        return this;
    }

    public s1 setLabel(String str) {
        this.f28019f = str;
        return this;
    }

    public s1 setLanguage(String str) {
        this.f28016c = str;
        return this;
    }

    public s1 setMimeType(String str) {
        this.f28015b = str;
        return this;
    }

    public s1 setRoleFlags(int i10) {
        this.f28018e = i10;
        return this;
    }

    public s1 setSelectionFlags(int i10) {
        this.f28017d = i10;
        return this;
    }

    public s1 setUri(Uri uri) {
        this.f28014a = uri;
        return this;
    }
}
