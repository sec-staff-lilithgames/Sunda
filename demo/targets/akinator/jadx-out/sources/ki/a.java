package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f71117a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71118b = ui.e.of("arch");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71119c = ui.e.of("libraryName");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71120d = ui.e.of("buildId");

    @Override // ui.f, ui.b
    public void encode(f2.a.AbstractC0714a abstractC0714a, ui.g gVar) throws IOException {
        gVar.add(f71118b, abstractC0714a.getArch());
        gVar.add(f71119c, abstractC0714a.getLibraryName());
        gVar.add(f71120d, abstractC0714a.getBuildId());
    }
}
