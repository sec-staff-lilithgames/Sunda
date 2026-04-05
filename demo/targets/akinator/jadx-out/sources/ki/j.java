package ki;

import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final j f71294a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71295b = ui.e.of("generator");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71296c = ui.e.of("identifier");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71297d = ui.e.of("appQualitySessionId");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71298e = ui.e.of("startedAt");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71299f = ui.e.of("endedAt");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f71300g = ui.e.of("crashed");

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f71301h = ui.e.of(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

    /* renamed from: i, reason: collision with root package name */
    public static final ui.e f71302i = ui.e.of("user");

    /* renamed from: j, reason: collision with root package name */
    public static final ui.e f71303j = ui.e.of("os");

    /* renamed from: k, reason: collision with root package name */
    public static final ui.e f71304k = ui.e.of(C3191e4.h.G);

    /* renamed from: l, reason: collision with root package name */
    public static final ui.e f71305l = ui.e.of("events");

    /* renamed from: m, reason: collision with root package name */
    public static final ui.e f71306m = ui.e.of("generatorType");

    @Override // ui.f, ui.b
    public void encode(f2.e eVar, ui.g gVar) throws IOException {
        gVar.add(f71295b, eVar.getGenerator());
        gVar.add(f71296c, eVar.getIdentifierUtf8Bytes());
        gVar.add(f71297d, eVar.getAppQualitySessionId());
        gVar.add(f71298e, eVar.getStartedAt());
        gVar.add(f71299f, eVar.getEndedAt());
        gVar.add(f71300g, eVar.isCrashed());
        gVar.add(f71301h, eVar.getApp());
        gVar.add(f71302i, eVar.getUser());
        gVar.add(f71303j, eVar.getOs());
        gVar.add(f71304k, eVar.getDevice());
        gVar.add(f71305l, eVar.getEvents());
        gVar.add(f71306m, eVar.getGeneratorType());
    }
}
