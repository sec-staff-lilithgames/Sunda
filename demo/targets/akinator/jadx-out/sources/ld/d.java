package ld;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final d f73215a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f73216b = ui.e.of("clientType");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f73217c = ui.e.of("androidClientInfo");

    @Override // ui.f, ui.b
    public void encode(h0 h0Var, ui.g gVar) throws IOException {
        gVar.add(f73216b, h0Var.getClientType());
        gVar.add(f73217c, h0Var.getAndroidClientInfo());
    }
}
