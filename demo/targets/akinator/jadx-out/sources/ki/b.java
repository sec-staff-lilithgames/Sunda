package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f71128a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71129b = ui.e.of("pid");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71130c = ui.e.of("processName");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71131d = ui.e.of("reasonCode");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71132e = ui.e.of("importance");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71133f = ui.e.of("pss");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f71134g = ui.e.of("rss");

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f71135h = ui.e.of("timestamp");

    /* renamed from: i, reason: collision with root package name */
    public static final ui.e f71136i = ui.e.of("traceFile");

    /* renamed from: j, reason: collision with root package name */
    public static final ui.e f71137j = ui.e.of("buildIdMappingForArch");

    @Override // ui.f, ui.b
    public void encode(f2.a aVar, ui.g gVar) throws IOException {
        gVar.add(f71129b, aVar.getPid());
        gVar.add(f71130c, aVar.getProcessName());
        gVar.add(f71131d, aVar.getReasonCode());
        gVar.add(f71132e, aVar.getImportance());
        gVar.add(f71133f, aVar.getPss());
        gVar.add(f71134g, aVar.getRss());
        gVar.add(f71135h, aVar.getTimestamp());
        gVar.add(f71136i, aVar.getTraceFile());
        gVar.add(f71137j, aVar.getBuildIdMappingForArch());
    }
}
