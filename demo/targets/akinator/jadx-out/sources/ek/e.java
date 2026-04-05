package ek;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f54499a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f54500b = ui.e.of("performance");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f54501c = ui.e.of("crashlytics");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f54502d = ui.e.of("sessionSamplingRate");

    @Override // ui.f, ui.b
    public void encode(n nVar, ui.g gVar) throws IOException {
        gVar.add(f54500b, nVar.getPerformance());
        gVar.add(f54501c, nVar.getCrashlytics());
        gVar.add(f54502d, nVar.getSessionSamplingRate());
    }
}
