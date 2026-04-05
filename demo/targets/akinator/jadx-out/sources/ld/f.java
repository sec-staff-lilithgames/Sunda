package ld;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f73224a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f73225b = ui.e.of("clearBlob");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f73226c = ui.e.of("encryptedBlob");

    @Override // ui.f, ui.b
    public void encode(l0 l0Var, ui.g gVar) throws IOException {
        gVar.add(f73225b, l0Var.getClearBlob());
        gVar.add(f73226c, l0Var.getEncryptedBlob());
    }
}
