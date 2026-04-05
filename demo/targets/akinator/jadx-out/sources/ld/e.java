package ld;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f73219a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f73220b = ui.e.of("privacyContext");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f73221c = ui.e.of("productIdOrigin");

    @Override // ui.f, ui.b
    public void encode(j0 j0Var, ui.g gVar) throws IOException {
        gVar.add(f73220b, j0Var.getPrivacyContext());
        gVar.add(f73221c, j0Var.getProductIdOrigin());
    }
}
