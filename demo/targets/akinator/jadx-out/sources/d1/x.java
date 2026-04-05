package d1;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f51717a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f51718b;

    /* renamed from: c, reason: collision with root package name */
    public final String f51719c;

    /* renamed from: d, reason: collision with root package name */
    public final String f51720d;

    /* renamed from: e, reason: collision with root package name */
    public final List f51721e;

    /* renamed from: f, reason: collision with root package name */
    public final String f51722f;

    /* renamed from: g, reason: collision with root package name */
    public final List f51723g;

    /* renamed from: h, reason: collision with root package name */
    public final String f51724h;

    public x(boolean z10, boolean z11, String str, String str2, List<t> list, String str3, List<q> list2, String str4) {
        this.f51717a = z10;
        this.f51718b = z11;
        this.f51719c = str;
        this.f51720d = str2;
        this.f51721e = list;
        this.f51722f = str3;
        this.f51723g = list2;
        this.f51724h = str4;
    }

    public final String getFunctionName() {
        return this.f51719c;
    }

    public final List<q> getLocations() {
        return this.f51723g;
    }

    public final String getPackageHash() {
        return this.f51722f;
    }

    public final List<t> getParameters() {
        return this.f51721e;
    }

    public final String getRawData() {
        return this.f51724h;
    }

    public final String getSourceFile() {
        return this.f51720d;
    }

    public final boolean isCall() {
        return this.f51717a;
    }

    public final boolean isInline() {
        return this.f51718b;
    }
}
