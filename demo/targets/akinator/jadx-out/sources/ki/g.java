package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final g f71253a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71254b = ui.e.of("identifier");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71255c = ui.e.of("version");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71256d = ui.e.of("displayVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71257e = ui.e.of("organization");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71258f = ui.e.of("installationUuid");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f71259g = ui.e.of("developmentPlatform");

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f71260h = ui.e.of("developmentPlatformVersion");

    @Override // ui.f, ui.b
    public void encode(f2.e.a aVar, ui.g gVar) throws IOException {
        gVar.add(f71254b, aVar.getIdentifier());
        gVar.add(f71255c, aVar.getVersion());
        gVar.add(f71256d, aVar.getDisplayVersion());
        gVar.add(f71257e, aVar.getOrganization());
        gVar.add(f71258f, aVar.getInstallationUuid());
        gVar.add(f71259g, aVar.getDevelopmentPlatform());
        gVar.add(f71260h, aVar.getDevelopmentPlatformVersion());
    }
}
