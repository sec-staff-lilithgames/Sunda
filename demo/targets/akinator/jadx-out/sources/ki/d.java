package ki;

import com.ironsource.Q6;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final d f71184a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71185b = ui.e.of("sdkVersion");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71186c = ui.e.of("gmpAppId");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71187d = ui.e.of(Q6.H);

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71188e = ui.e.of("installationUuid");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71189f = ui.e.of("firebaseInstallationId");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f71190g = ui.e.of("firebaseAuthenticationToken");

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f71191h = ui.e.of("appQualitySessionId");

    /* renamed from: i, reason: collision with root package name */
    public static final ui.e f71192i = ui.e.of("buildVersion");

    /* renamed from: j, reason: collision with root package name */
    public static final ui.e f71193j = ui.e.of("displayVersion");

    /* renamed from: k, reason: collision with root package name */
    public static final ui.e f71194k = ui.e.of("session");

    /* renamed from: l, reason: collision with root package name */
    public static final ui.e f71195l = ui.e.of("ndkPayload");

    /* renamed from: m, reason: collision with root package name */
    public static final ui.e f71196m = ui.e.of("appExitInfo");

    @Override // ui.f, ui.b
    public void encode(f2 f2Var, ui.g gVar) throws IOException {
        gVar.add(f71185b, f2Var.getSdkVersion());
        gVar.add(f71186c, f2Var.getGmpAppId());
        gVar.add(f71187d, f2Var.getPlatform());
        gVar.add(f71188e, f2Var.getInstallationUuid());
        gVar.add(f71189f, f2Var.getFirebaseInstallationId());
        gVar.add(f71190g, f2Var.getFirebaseAuthenticationToken());
        gVar.add(f71191h, f2Var.getAppQualitySessionId());
        gVar.add(f71192i, f2Var.getBuildVersion());
        gVar.add(f71193j, f2Var.getDisplayVersion());
        gVar.add(f71194k, f2Var.getSession());
        gVar.add(f71195l, f2Var.getNdkPayload());
        gVar.add(f71196m, f2Var.getAppExitInfo());
    }
}
