package md;

import j1.o2;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f74255a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f74256b = o2.s(1, ui.e.builder("storageMetrics"));

    @Override // ui.f, ui.b
    public void encode(qd.d dVar, ui.g gVar) throws IOException {
        gVar.add(f74256b, dVar.getStorageMetricsInternal());
    }
}
