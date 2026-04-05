package x3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public ClipData f91596a;

    /* renamed from: b, reason: collision with root package name */
    public int f91597b;

    /* renamed from: c, reason: collision with root package name */
    public int f91598c;

    /* renamed from: d, reason: collision with root package name */
    public Uri f91599d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f91600e;

    @Override // x3.i
    public n build() {
        return new n(new m(this));
    }

    @Override // x3.i
    public void setClip(ClipData clipData) {
        this.f91596a = clipData;
    }

    @Override // x3.i
    public void setExtras(Bundle bundle) {
        this.f91600e = bundle;
    }

    @Override // x3.i
    public void setFlags(int i10) {
        this.f91598c = i10;
    }

    @Override // x3.i
    public void setLinkUri(Uri uri) {
        this.f91599d = uri;
    }

    @Override // x3.i
    public void setSource(int i10) {
        this.f91597b = i10;
    }
}
