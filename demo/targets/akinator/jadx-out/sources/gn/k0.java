package gn;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public Uri f57974a;

    /* renamed from: b, reason: collision with root package name */
    public String f57975b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f57976c;

    public l0 build() {
        return new l0(this);
    }

    public k0 setExtras(Bundle bundle) {
        this.f57976c = bundle;
        return this;
    }

    public k0 setMediaUri(Uri uri) {
        this.f57974a = uri;
        return this;
    }

    public k0 setSearchQuery(String str) {
        this.f57975b = str;
        return this;
    }
}
