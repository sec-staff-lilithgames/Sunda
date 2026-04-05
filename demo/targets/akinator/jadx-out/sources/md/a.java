package md;

import j1.o2;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f74249a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f74250b = o2.s(1, ui.e.builder("window"));

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f74251c = o2.s(2, ui.e.builder("logSourceMetrics"));

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f74252d = o2.s(3, ui.e.builder("globalMetrics"));

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f74253e = o2.s(4, ui.e.builder("appNamespace"));

    @Override // ui.f, ui.b
    public void encode(qd.b bVar, ui.g gVar) throws IOException {
        gVar.add(f74250b, bVar.getWindowInternal());
        gVar.add(f74251c, bVar.getLogSourceMetricsList());
        gVar.add(f74252d, bVar.getGlobalMetricsInternal());
        gVar.add(f74253e, bVar.getAppNamespace());
    }
}
