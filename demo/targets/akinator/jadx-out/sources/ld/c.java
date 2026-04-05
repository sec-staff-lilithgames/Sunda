package ld;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final c f73206a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f73207b = ui.e.of("logRequest");

    @Override // ui.f, ui.b
    public void encode(g0 g0Var, ui.g gVar) throws IOException {
        gVar.add(f73207b, g0Var.getLogRequests());
    }
}
