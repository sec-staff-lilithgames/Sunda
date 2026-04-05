package ki;

import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final t f71451a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71452b = ui.e.of("timestamp");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71453c = ui.e.of("type");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71454d = ui.e.of(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71455e = ui.e.of(C3191e4.h.G);

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71456f = ui.e.of("log");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f71457g = ui.e.of("rollouts");

    @Override // ui.f, ui.b
    public void encode(f2.e.d dVar, ui.g gVar) throws IOException {
        gVar.add(f71452b, dVar.getTimestamp());
        gVar.add(f71453c, dVar.getType());
        gVar.add(f71454d, dVar.getApp());
        gVar.add(f71455e, dVar.getDevice());
        gVar.add(f71456f, dVar.getLog());
        gVar.add(f71457g, dVar.getRollouts());
    }
}
