package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final o f71380a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71381b = ui.e.of("name");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71382c = ui.e.of("code");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71383d = ui.e.of("address");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.a.b.AbstractC0723d abstractC0723d, ui.g gVar) throws IOException {
        gVar.add(f71381b, abstractC0723d.getName());
        gVar.add(f71382c, abstractC0723d.getCode());
        gVar.add(f71383d, abstractC0723d.getAddress());
    }
}
