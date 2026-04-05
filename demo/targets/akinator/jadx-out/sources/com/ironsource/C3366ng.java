package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ng, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3366ng implements InterfaceC3139b6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3200ed f37998a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37999b;

    public C3366ng(C3200ed folderRootUrl, String version) {
        kotlin.jvm.internal.e0.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(version, "version");
        this.f37998a = folderRootUrl;
        this.f37999b = version;
    }

    public final String a() {
        return this.f37999b;
    }

    @Override // com.ironsource.InterfaceC3139b6
    public String value() {
        return e3.g.k(this.f37998a.a(), "/versions/", this.f37999b, "/mobileController.html");
    }
}
