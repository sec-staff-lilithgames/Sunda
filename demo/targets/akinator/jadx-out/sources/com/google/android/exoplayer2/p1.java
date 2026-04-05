package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public Uri f27901a;

    /* renamed from: b, reason: collision with root package name */
    public String f27902b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f27903c;

    public q1 build() {
        return new q1(this);
    }

    public p1 setExtras(Bundle bundle) {
        this.f27903c = bundle;
        return this;
    }

    public p1 setMediaUri(Uri uri) {
        this.f27901a = uri;
        return this;
    }

    public p1 setSearchQuery(String str) {
        this.f27902b = str;
        return this;
    }
}
