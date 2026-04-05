package io.odeeo.internal.b;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f62707a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62708b;

    public g0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f62707a = z10;
        this.f62708b = i10;
    }

    public static g0 createForMalformedContainer(String str, Throwable th2) {
        return new g0(str, th2, true, 1);
    }

    public static g0 createForMalformedDataOfUnknownType(String str, Throwable th2) {
        return new g0(str, th2, true, 0);
    }

    public static g0 createForMalformedManifest(String str, Throwable th2) {
        return new g0(str, th2, true, 4);
    }

    public static g0 createForManifestWithUnsupportedFeature(String str, Throwable th2) {
        return new g0(str, th2, false, 4);
    }

    public static g0 createForUnsupportedContainerFeature(String str) {
        return new g0(str, null, false, 1);
    }
}
