package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3354n4 implements InterfaceC3299k5<C8> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3139b6 f37950a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37951b;

    /* renamed from: c, reason: collision with root package name */
    private final C7 f37952c;

    /* renamed from: d, reason: collision with root package name */
    private final kv.l f37953d;

    /* renamed from: e, reason: collision with root package name */
    private C8 f37954e;

    public C3354n4(InterfaceC3139b6 fileUrl, String destinationPath, C7 downloadManager, kv.l onFinish) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fileUrl, "fileUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(destinationPath, "destinationPath");
        kotlin.jvm.internal.e0.checkNotNullParameter(downloadManager, "downloadManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(onFinish, "onFinish");
        this.f37950a = fileUrl;
        this.f37951b = destinationPath;
        this.f37952c = downloadManager;
        this.f37953d = onFinish;
        this.f37954e = new C8(c());
    }

    @Override // com.ironsource.Pc
    public void a(C8 file) {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        i().invoke(tu.z.m7130boximpl(tu.z.m7131constructorimpl(file)));
    }

    @Override // com.ironsource.InterfaceC3299k5
    public void b(C8 c82) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c82, "<set-?>");
        this.f37954e = c82;
    }

    @Override // com.ironsource.InterfaceC3299k5
    public String c() {
        return this.f37951b;
    }

    @Override // com.ironsource.InterfaceC3299k5
    public InterfaceC3139b6 d() {
        return this.f37950a;
    }

    @Override // com.ironsource.InterfaceC3299k5
    public kv.l i() {
        return this.f37953d;
    }

    @Override // com.ironsource.InterfaceC3299k5
    public C8 k() {
        return this.f37954e;
    }

    @Override // com.ironsource.InterfaceC3299k5
    public C7 l() {
        return this.f37952c;
    }

    @Override // com.ironsource.Pc
    public void a(C8 c82, C3477u8 error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        kv.l lVarI = i();
        int i10 = tu.z.f87419c;
        lVarI.invoke(tu.z.m7130boximpl(tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception(a.b.k("Unable to download mobileController.html: ", error.b()))))));
    }
}
