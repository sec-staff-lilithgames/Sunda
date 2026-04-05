package gn;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public Uri f58020a;

    /* renamed from: b, reason: collision with root package name */
    public String f58021b;

    /* renamed from: c, reason: collision with root package name */
    public String f58022c;

    /* renamed from: d, reason: collision with root package name */
    public int f58023d;

    /* renamed from: e, reason: collision with root package name */
    public int f58024e;

    /* renamed from: f, reason: collision with root package name */
    public String f58025f;

    /* renamed from: g, reason: collision with root package name */
    public String f58026g;

    public n0(Uri uri) {
        this.f58020a = uri;
    }

    public o0 build() {
        return new o0(this);
    }

    public n0 setId(String str) {
        this.f58026g = str;
        return this;
    }

    public n0 setLabel(String str) {
        this.f58025f = str;
        return this;
    }

    public n0 setLanguage(String str) {
        this.f58022c = str;
        return this;
    }

    public n0 setMimeType(String str) {
        this.f58021b = x0.normalizeMimeType(str);
        return this;
    }

    public n0 setRoleFlags(int i10) {
        this.f58024e = i10;
        return this;
    }

    public n0 setSelectionFlags(int i10) {
        this.f58023d = i10;
        return this;
    }

    public n0 setUri(Uri uri) {
        this.f58020a = uri;
        return this;
    }
}
