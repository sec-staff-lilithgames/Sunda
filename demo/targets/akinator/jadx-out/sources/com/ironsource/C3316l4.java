package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3316l4 implements InterfaceC3544y7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f37153a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37154b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37155c;

    /* renamed from: d, reason: collision with root package name */
    private final C3200ed f37156d;

    public C3316l4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC3544y7
    public String a() {
        return this.f37153a;
    }

    @Override // com.ironsource.InterfaceC3544y7
    public boolean b() {
        return this.f37155c;
    }

    @Override // com.ironsource.InterfaceC3544y7
    public C3200ed c() {
        return this.f37156d;
    }

    @Override // com.ironsource.InterfaceC3544y7
    public String d() {
        return this.f37154b;
    }

    public C3316l4(String controllerUrl, String cacheFolder, boolean z10, C3200ed rootFolder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(cacheFolder, "cacheFolder");
        kotlin.jvm.internal.e0.checkNotNullParameter(rootFolder, "rootFolder");
        this.f37153a = controllerUrl;
        this.f37154b = cacheFolder;
        this.f37155c = z10;
        this.f37156d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3316l4(String str, String str2, boolean z10, C3200ed c3200ed, int i10, kotlin.jvm.internal.u uVar) {
        str = (i10 & 1) != 0 ? "" : str;
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new C3200ed(str) : c3200ed);
    }
}
