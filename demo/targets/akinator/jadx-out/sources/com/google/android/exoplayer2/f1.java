package com.google.android.exoplayer2;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public Uri f27463a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27464b;

    public f1(Uri uri) {
        this.f27463a = uri;
    }

    public g1 build() {
        return new g1(this);
    }

    public f1 setAdTagUri(Uri uri) {
        this.f27463a = uri;
        return this;
    }

    public f1 setAdsId(Object obj) {
        this.f27464b = obj;
        return this;
    }
}
