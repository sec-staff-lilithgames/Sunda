package ek;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final c f54470a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f54471b = ui.e.of(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f54472c = ui.e.of("versionName");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f54473d = ui.e.of("appBuildVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f54474e = ui.e.of("deviceManufacturer");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f54475f = ui.e.of("currentProcessDetails");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f54476g = ui.e.of("appProcessDetails");

    @Override // ui.f, ui.b
    public void encode(a aVar, ui.g gVar) throws IOException {
        gVar.add(f54471b, aVar.getPackageName());
        gVar.add(f54472c, aVar.getVersionName());
        gVar.add(f54473d, aVar.getAppBuildVersion());
        gVar.add(f54474e, aVar.getDeviceManufacturer());
        gVar.add(f54475f, aVar.getCurrentProcessDetails());
        gVar.add(f54476g, aVar.getAppProcessDetails());
    }
}
