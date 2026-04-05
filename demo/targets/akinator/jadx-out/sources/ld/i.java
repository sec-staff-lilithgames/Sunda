package ld;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final i f73233a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f73234b = ui.e.of("eventTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f73235c = ui.e.of("eventCode");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f73236d = ui.e.of("complianceData");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f73237e = ui.e.of("eventUptimeMs");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f73238f = ui.e.of("sourceExtension");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f73239g = ui.e.of("sourceExtensionJsonProto3");

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f73240h = ui.e.of("timezoneOffsetSeconds");

    /* renamed from: i, reason: collision with root package name */
    public static final ui.e f73241i = ui.e.of("networkConnectionInfo");

    /* renamed from: j, reason: collision with root package name */
    public static final ui.e f73242j = ui.e.of("experimentIds");

    @Override // ui.f, ui.b
    public void encode(o0 o0Var, ui.g gVar) throws IOException {
        gVar.add(f73234b, o0Var.getEventTimeMs());
        gVar.add(f73235c, o0Var.getEventCode());
        gVar.add(f73236d, o0Var.getComplianceData());
        gVar.add(f73237e, o0Var.getEventUptimeMs());
        gVar.add(f73238f, o0Var.getSourceExtension());
        gVar.add(f73239g, o0Var.getSourceExtensionJsonProto3());
        gVar.add(f73240h, o0Var.getTimezoneOffsetSeconds());
        gVar.add(f73241i, o0Var.getNetworkConnectionInfo());
        gVar.add(f73242j, o0Var.getExperimentIds());
    }
}
