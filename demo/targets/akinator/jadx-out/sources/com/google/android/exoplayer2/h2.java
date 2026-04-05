package com.google.android.exoplayer2;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h2 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27515b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27516c;

    public h2(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f27515b = z10;
        this.f27516c = i10;
    }

    public static h2 createForMalformedContainer(String str, Throwable th2) {
        return new h2(str, th2, true, 1);
    }

    public static h2 createForMalformedDataOfUnknownType(String str, Throwable th2) {
        return new h2(str, th2, true, 0);
    }

    public static h2 createForMalformedManifest(String str, Throwable th2) {
        return new h2(str, th2, true, 4);
    }

    public static h2 createForManifestWithUnsupportedFeature(String str, Throwable th2) {
        return new h2(str, th2, false, 4);
    }

    public static h2 createForUnsupportedContainerFeature(String str) {
        return new h2(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f27515b);
        sb2.append(", dataType=");
        return a.b.f(this.f27516c, "}", sb2);
    }
}
