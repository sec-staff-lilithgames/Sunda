package ld;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final k f73253a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f73254b = ui.e.of("networkType");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f73255c = ui.e.of("mobileSubtype");

    @Override // ui.f, ui.b
    public void encode(r0 r0Var, ui.g gVar) throws IOException {
        gVar.add(f73254b, r0Var.getNetworkType());
        gVar.add(f73255c, r0Var.getMobileSubtype());
    }
}
