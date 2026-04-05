package ld;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final g f73229a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f73230b = ui.e.of("originAssociatedProductId");

    @Override // ui.f, ui.b
    public void encode(m0 m0Var, ui.g gVar) throws IOException {
        gVar.add(f73230b, m0Var.getOriginAssociatedProductId());
    }
}
