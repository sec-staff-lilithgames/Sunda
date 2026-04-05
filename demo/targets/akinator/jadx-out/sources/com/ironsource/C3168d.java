package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3168d implements InterfaceC3139b6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3200ed f36207a;

    public C3168d(C3200ed folderRootUrl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.f36207a = folderRootUrl;
    }

    @Override // com.ironsource.InterfaceC3139b6
    public String value() {
        return j1.o2.l(this.f36207a.a(), "/abTestMap.json");
    }
}
