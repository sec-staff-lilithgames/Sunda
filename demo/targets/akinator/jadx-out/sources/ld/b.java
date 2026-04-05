package ld;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3191e4;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f73186a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f73187b = ui.e.of("sdkVersion");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f73188c = ui.e.of("model");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f73189d = ui.e.of("hardware");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f73190e = ui.e.of(C3191e4.h.G);

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f73191f = ui.e.of(AppLovinEventTypes.USER_VIEWED_PRODUCT);

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f73192g = ui.e.of("osBuild");

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f73193h = ui.e.of("manufacturer");

    /* renamed from: i, reason: collision with root package name */
    public static final ui.e f73194i = ui.e.of("fingerprint");

    /* renamed from: j, reason: collision with root package name */
    public static final ui.e f73195j = ui.e.of("locale");

    /* renamed from: k, reason: collision with root package name */
    public static final ui.e f73196k = ui.e.of("country");

    /* renamed from: l, reason: collision with root package name */
    public static final ui.e f73197l = ui.e.of("mccMnc");

    /* renamed from: m, reason: collision with root package name */
    public static final ui.e f73198m = ui.e.of("applicationBuild");

    @Override // ui.f, ui.b
    public void encode(a aVar, ui.g gVar) throws IOException {
        gVar.add(f73187b, aVar.getSdkVersion());
        gVar.add(f73188c, aVar.getModel());
        gVar.add(f73189d, aVar.getHardware());
        gVar.add(f73190e, aVar.getDevice());
        gVar.add(f73191f, aVar.getProduct());
        gVar.add(f73192g, aVar.getOsBuild());
        gVar.add(f73193h, aVar.getManufacturer());
        gVar.add(f73194i, aVar.getFingerprint());
        gVar.add(f73195j, aVar.getLocale());
        gVar.add(f73196k, aVar.getCountry());
        gVar.add(f73197l, aVar.getMccMnc());
        gVar.add(f73198m, aVar.getApplicationBuild());
    }
}
