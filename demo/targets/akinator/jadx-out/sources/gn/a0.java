package gn;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public Uri f57728a;

    /* renamed from: b, reason: collision with root package name */
    public Object f57729b;

    public a0(Uri uri) {
        this.f57728a = uri;
    }

    public b0 build() {
        return new b0(this);
    }

    public a0 setAdTagUri(Uri uri) {
        this.f57728a = uri;
        return this;
    }

    public a0 setAdsId(Object obj) {
        this.f57729b = obj;
        return this;
    }
}
