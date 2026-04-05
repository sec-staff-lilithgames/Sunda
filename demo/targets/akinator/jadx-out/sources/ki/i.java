package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final i f71279a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71280b = ui.e.of("arch");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71281c = ui.e.of("model");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71282d = ui.e.of("cores");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71283e = ui.e.of("ram");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71284f = ui.e.of("diskSpace");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f71285g = ui.e.of("simulator");

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f71286h = ui.e.of("state");

    /* renamed from: i, reason: collision with root package name */
    public static final ui.e f71287i = ui.e.of("manufacturer");

    /* renamed from: j, reason: collision with root package name */
    public static final ui.e f71288j = ui.e.of("modelClass");

    @Override // ui.f, ui.b
    public void encode(f2.e.c cVar, ui.g gVar) throws IOException {
        gVar.add(f71280b, cVar.getArch());
        gVar.add(f71281c, cVar.getModel());
        gVar.add(f71282d, cVar.getCores());
        gVar.add(f71283e, cVar.getRam());
        gVar.add(f71284f, cVar.getDiskSpace());
        gVar.add(f71285g, cVar.isSimulator());
        gVar.add(f71286h, cVar.getState());
        gVar.add(f71287i, cVar.getManufacturer());
        gVar.add(f71288j, cVar.getModelClass());
    }
}
