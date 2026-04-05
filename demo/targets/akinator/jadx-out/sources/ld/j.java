package ld;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final j f73245a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f73246b = ui.e.of("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f73247c = ui.e.of("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f73248d = ui.e.of("clientInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f73249e = ui.e.of("logSource");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f73250f = ui.e.of("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f73251g = ui.e.of("logEvent");

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f73252h = ui.e.of("qosTier");

    @Override // ui.f, ui.b
    public void encode(p0 p0Var, ui.g gVar) throws IOException {
        gVar.add(f73246b, p0Var.getRequestTimeMs());
        gVar.add(f73247c, p0Var.getRequestUptimeMs());
        gVar.add(f73248d, p0Var.getClientInfo());
        gVar.add(f73249e, p0Var.getLogSource());
        gVar.add(f73250f, p0Var.getLogSourceName());
        gVar.add(f73251g, p0Var.getLogEvents());
        gVar.add(f73252h, p0Var.getQosTier());
    }
}
