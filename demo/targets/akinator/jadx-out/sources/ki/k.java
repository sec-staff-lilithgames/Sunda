package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final k f71315a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71316b = ui.e.of("execution");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71317c = ui.e.of("customAttributes");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71318d = ui.e.of("internalKeys");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71319e = ui.e.of("background");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71320f = ui.e.of("currentProcessDetails");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f71321g = ui.e.of("appProcessDetails");

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f71322h = ui.e.of("uiOrientation");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.a aVar, ui.g gVar) throws IOException {
        gVar.add(f71316b, aVar.getExecution());
        gVar.add(f71317c, aVar.getCustomAttributes());
        gVar.add(f71318d, aVar.getInternalKeys());
        gVar.add(f71319e, aVar.getBackground());
        gVar.add(f71320f, aVar.getCurrentProcessDetails());
        gVar.add(f71321g, aVar.getAppProcessDetails());
        gVar.add(f71322h, aVar.getUiOrientation());
    }
}
