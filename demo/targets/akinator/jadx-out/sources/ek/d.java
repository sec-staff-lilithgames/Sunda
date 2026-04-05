package ek;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final d f54487a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f54488b = ui.e.of("appId");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f54489c = ui.e.of("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f54490d = ui.e.of("sessionSdkVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f54491e = ui.e.of("osVersion");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f54492f = ui.e.of("logEnvironment");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f54493g = ui.e.of("androidAppInfo");

    @Override // ui.f, ui.b
    public void encode(b bVar, ui.g gVar) throws IOException {
        gVar.add(f54488b, bVar.getAppId());
        gVar.add(f54489c, bVar.getDeviceModel());
        gVar.add(f54490d, bVar.getSessionSdkVersion());
        gVar.add(f54491e, bVar.getOsVersion());
        gVar.add(f54492f, bVar.getLogEnvironment());
        gVar.add(f54493g, bVar.getAndroidAppInfo());
    }
}
