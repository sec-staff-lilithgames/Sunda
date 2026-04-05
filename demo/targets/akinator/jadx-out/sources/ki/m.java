package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final m f71342a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71343b = ui.e.of("threads");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71344c = ui.e.of("exception");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71345d = ui.e.of("appExitInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71346e = ui.e.of("signal");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71347f = ui.e.of("binaries");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.a.b bVar, ui.g gVar) throws IOException {
        gVar.add(f71343b, bVar.getThreads());
        gVar.add(f71344c, bVar.getException());
        gVar.add(f71345d, bVar.getAppExitInfo());
        gVar.add(f71346e, bVar.getSignal());
        gVar.add(f71347f, bVar.getBinaries());
    }
}
