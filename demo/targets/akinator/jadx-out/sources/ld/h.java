package ld;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final h f73231a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f73232b = ui.e.of("prequest");

    @Override // ui.f, ui.b
    public void encode(n0 n0Var, ui.g gVar) throws IOException {
        gVar.add(f73232b, n0Var.getPrequest());
    }
}
