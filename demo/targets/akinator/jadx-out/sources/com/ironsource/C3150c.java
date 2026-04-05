package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3150c implements InterfaceC3299k5<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3139b6 f36104a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36105b;

    /* renamed from: c, reason: collision with root package name */
    private final C7 f36106c;

    /* renamed from: d, reason: collision with root package name */
    private final kv.l f36107d;

    /* renamed from: e, reason: collision with root package name */
    private C8 f36108e;

    public C3150c(InterfaceC3139b6 fileUrl, String destinationPath, C7 downloadManager, kv.l onFinish) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fileUrl, "fileUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(destinationPath, "destinationPath");
        kotlin.jvm.internal.e0.checkNotNullParameter(downloadManager, "downloadManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(onFinish, "onFinish");
        this.f36104a = fileUrl;
        this.f36105b = destinationPath;
        this.f36106c = downloadManager;
        this.f36107d = onFinish;
        this.f36108e = new C8(c(), C3191e4.f36346h);
    }

    @Override // com.ironsource.Pc
    public void a(C8 file) {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        if (kotlin.jvm.internal.e0.areEqual(file.getName(), C3191e4.f36346h)) {
            try {
                i().invoke(tu.z.m7130boximpl(tu.z.m7131constructorimpl(c(file))));
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                kv.l lVarI = i();
                int i10 = tu.z.f87419c;
                lVarI.invoke(tu.z.m7130boximpl(tu.z.m7131constructorimpl(tu.a0.createFailure(e10))));
            }
        }
    }

    @Override // com.ironsource.InterfaceC3299k5
    public void b(C8 c82) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c82, "<set-?>");
        this.f36108e = c82;
    }

    @Override // com.ironsource.InterfaceC3299k5
    public String c() {
        return this.f36105b;
    }

    @Override // com.ironsource.InterfaceC3299k5
    public InterfaceC3139b6 d() {
        return this.f36104a;
    }

    @Override // com.ironsource.InterfaceC3299k5
    public kv.l i() {
        return this.f36107d;
    }

    @Override // com.ironsource.InterfaceC3299k5
    public C8 k() {
        return this.f36108e;
    }

    @Override // com.ironsource.InterfaceC3299k5
    public C7 l() {
        return this.f36106c;
    }

    private final JSONObject c(C8 c82) {
        return new JSONObject(IronSourceStorageUtils.readFile(c82));
    }

    @Override // com.ironsource.Pc
    public void a(C8 c82, C3477u8 error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        kv.l lVarI = i();
        int i10 = tu.z.f87419c;
        lVarI.invoke(tu.z.m7130boximpl(tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception(a.b.k("Unable to download abTestMap.json: ", error.b()))))));
    }
}
