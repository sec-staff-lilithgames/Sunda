package ki;

import com.ironsource.C3191e4;
import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final s f71439a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71440b = ui.e.of(C3191e4.i.Y);

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71441c = ui.e.of("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71442d = ui.e.of("proximityOn");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71443e = ui.e.of("orientation");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71444f = ui.e.of("ramUsed");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f71445g = ui.e.of("diskUsed");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.c cVar, ui.g gVar) throws IOException {
        gVar.add(f71440b, cVar.getBatteryLevel());
        gVar.add(f71441c, cVar.getBatteryVelocity());
        gVar.add(f71442d, cVar.isProximityOn());
        gVar.add(f71443e, cVar.getOrientation());
        gVar.add(f71444f, cVar.getRamUsed());
        gVar.add(f71445g, cVar.getDiskUsed());
    }
}
