package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.w3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3506w3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f39161a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39162b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39163c;

    /* renamed from: d, reason: collision with root package name */
    private final C3343md f39164d;

    public AbstractC3506w3(int i10, String placementName, boolean z10, C3343md c3343md) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        this.f39161a = i10;
        this.f39162b = placementName;
        this.f39163c = z10;
        this.f39164d = c3343md;
    }

    public final C3343md a() {
        return this.f39164d;
    }

    public final int b() {
        return this.f39161a;
    }

    public final String c() {
        return this.f39162b;
    }

    public final boolean d() {
        return this.f39163c;
    }

    public String toString() {
        return a.b.k("placement name: ", this.f39162b);
    }

    public final boolean a(int i10) {
        return this.f39161a == i10;
    }

    public /* synthetic */ AbstractC3506w3(int i10, String str, boolean z10, C3343md c3343md, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10, str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? null : c3343md);
    }
}
