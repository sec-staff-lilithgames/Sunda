package nj;

import android.os.Bundle;
import bj.z1;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.inappmessaging.CampaignAnalytics;
import com.google.firebase.inappmessaging.ClientAppInfo;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class n0 {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f76977h;

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f76978i;

    /* renamed from: a, reason: collision with root package name */
    public final m0 f76979a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.g f76980b;

    /* renamed from: c, reason: collision with root package name */
    public final tj.f f76981c;

    /* renamed from: d, reason: collision with root package name */
    public final qj.a f76982d;

    /* renamed from: e, reason: collision with root package name */
    public final yh.d f76983e;

    /* renamed from: f, reason: collision with root package name */
    public final k f76984f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f76985g;

    static {
        HashMap map = new HashMap();
        f76977h = map;
        HashMap map2 = new HashMap();
        f76978i = map2;
        map.put(bj.a1.f9605b, z1.UNSPECIFIED_RENDER_ERROR);
        map.put(bj.a1.f9606c, z1.IMAGE_FETCH_ERROR);
        map.put(bj.a1.f9607e, z1.IMAGE_DISPLAY_ERROR);
        map.put(bj.a1.f9608f, z1.IMAGE_UNSUPPORTED_FORMAT);
        map2.put(bj.z0.f9690c, bj.g0.AUTO);
        map2.put(bj.z0.f9691e, bj.g0.CLICK);
        map2.put(bj.z0.f9692f, bj.g0.SWIPE);
        map2.put(bj.z0.f9689b, bj.g0.UNKNOWN_DISMISS_TYPE);
    }

    public n0(m0 m0Var, yh.d dVar, com.google.firebase.g gVar, tj.f fVar, qj.a aVar, k kVar, Executor executor) {
        this.f76979a = m0Var;
        this.f76983e = dVar;
        this.f76980b = gVar;
        this.f76981c = fVar;
        this.f76982d = aVar;
        this.f76984f = kVar;
        this.f76985g = executor;
    }

    public static boolean b(rj.b bVar) {
        return (bVar == null || bVar.getActionUrl() == null || bVar.getActionUrl().isEmpty()) ? false : true;
    }

    public final bj.b a(rj.o oVar, String str) {
        bj.b fiamSdkVersion = CampaignAnalytics.newBuilder().setFiamSdkVersion("22.0.1");
        com.google.firebase.g gVar = this.f76980b;
        return fiamSdkVersion.setProjectNumber(gVar.getOptions().getGcmSenderId()).setCampaignId(oVar.getCampaignMetadata().getCampaignId()).setClientApp(ClientAppInfo.newBuilder().setGoogleAppId(gVar.getOptions().getApplicationId()).setFirebaseInstanceId(str)).setClientTimestampMillis(this.f76982d.now());
    }

    public final void c(rj.o oVar, String str, boolean z10) {
        String campaignId = oVar.getCampaignMetadata().getCampaignId();
        String campaignName = oVar.getCampaignMetadata().getCampaignName();
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", campaignId);
        bundle.putString("_nmn", campaignName);
        try {
            bundle.putInt("_ndt", (int) (this.f76982d.now() / 1000));
        } catch (NumberFormatException e10) {
            j0.logw("Error while parsing use_device_time in FIAM event: " + e10.getMessage());
        }
        j0.logd("Sending event=" + str + " params=" + bundle);
        yh.d dVar = this.f76983e;
        if (dVar == null) {
            j0.logw("Unable to log event: analytics library is missing");
            return;
        }
        dVar.logEvent(AppMeasurement.FIAM_ORIGIN, str, bundle);
        if (z10) {
            dVar.setUserProperty(AppMeasurement.FIAM_ORIGIN, "_ln", "fiam:" + campaignId);
        }
    }
}
