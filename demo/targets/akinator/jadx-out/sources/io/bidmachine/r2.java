package io.bidmachine;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ApiRequest;
import io.bidmachine.protobuf.InitRequest;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f61994b;

    public r2(s2 s2Var) {
        this.f61994b = s2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ConnectionType connectionType;
        String[] list;
        ApiRequest.Builder builder = new ApiRequest.Builder();
        s2 s2Var = this.f61994b;
        LinkedList linkedList = s2Var.f62011f;
        if (linkedList.isEmpty()) {
            linkedList.addAll(s2Var.f62010e);
        }
        ApiRequest.Builder dataBinder = builder.url((String) linkedList.poll()).setDataBinder(new ApiRequest.ApiInitDataBinder());
        Context context = s2Var.f62006a;
        d0.b(context);
        n1 n1VarA = n1.a();
        f4 f4Var = n1VarA.f61923f;
        TargetingParams targetingParams = n1VarA.f61935r;
        InitRequest.Builder builderNewBuilder = InitRequest.newBuilder();
        String packageName = context.getPackageName();
        if (packageName != null) {
            builderNewBuilder.setBundle(packageName);
        }
        builderNewBuilder.setSellerId(s2Var.f62007b);
        builderNewBuilder.setOs(OS.OS_ANDROID);
        builderNewBuilder.setOsv(pr.d.getOsVersion());
        String appVersion = nm.j.getAppVersion(context);
        if (appVersion != null) {
            builderNewBuilder.setAppVer(appVersion);
        }
        builderNewBuilder.setSdk(BidMachine.NAME);
        builderNewBuilder.setSdkver("3.4.0");
        builderNewBuilder.setIfa(d0.a(context, !f4Var.canSendIfa()));
        String ifv = n1VarA.f61931n.getIfv();
        if (!TextUtils.isEmpty(ifv)) {
            builderNewBuilder.setIfv(ifv);
        }
        builderNewBuilder.setBmIfv(n1VarA.d(context));
        builderNewBuilder.setSessionId(SessionManager.get().getSessionId());
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(context);
        String str = deviceInfoObtain.manufacturer;
        if (str != null) {
            builderNewBuilder.setMake(str);
        }
        String str2 = deviceInfoObtain.model;
        if (str2 != null) {
            builderNewBuilder.setModel(str2);
        }
        String hwv = deviceInfoObtain.getHWV();
        if (hwv != null) {
            builderNewBuilder.setHwv(hwv);
        }
        builderNewBuilder.setDeviceType(deviceInfoObtain.isTablet ? DeviceType.DEVICE_TYPE_TABLET : DeviceType.DEVICE_TYPE_PHONE_DEVICE);
        if (f4Var.canSendDeviceInfo()) {
            connectionType = pr.d.getConnectionType(context);
            builderNewBuilder.setContype(connectionType);
        } else {
            connectionType = null;
        }
        if (f4Var.canSendGeoPosition()) {
            Context.Geo.Builder builderCreateGeoBuilderWithLocation = pr.i.createGeoBuilderWithLocation(context, targetingParams.getDeviceLocation(), null, true);
            targetingParams.build(builderCreateGeoBuilderWithLocation);
            builderNewBuilder.setGeo(builderCreateGeoBuilderWithLocation);
        }
        builderNewBuilder.setContext(RequestDataRetriever.collectContext(s2Var.f62006a, n1VarA, f4Var, targetingParams, connectionType, null));
        PlatformData platformData = PlatformData.get(context);
        final InitRequest.AndroidPlatformData.Builder builderNewBuilder2 = InitRequest.AndroidPlatformData.newBuilder();
        Integer minSdkVersion = platformData.getMinSdkVersion();
        Objects.requireNonNull(builderNewBuilder2);
        final int i10 = 0;
        nm.j.ifNotNull(minSdkVersion, new Executable() { // from class: io.bidmachine.o2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i10) {
                    case 0:
                        builderNewBuilder2.setMinApiLevel(((Integer) obj).intValue());
                        break;
                    default:
                        builderNewBuilder2.setKotlinVersion((String) obj);
                        break;
                }
            }
        });
        final int i11 = 1;
        nm.j.ifNotNull(platformData.kotlinVersion, new Executable() { // from class: io.bidmachine.o2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i11) {
                    case 0:
                        builderNewBuilder2.setMinApiLevel(((Integer) obj).intValue());
                        break;
                    default:
                        builderNewBuilder2.setKotlinVersion((String) obj);
                        break;
                }
            }
        });
        builderNewBuilder.setAndroid(builderNewBuilder2.build());
        Struct.Builder builderNewBuilder3 = Struct.newBuilder();
        Value.Builder builderNewBuilder4 = Value.newBuilder();
        ListValue.Builder builderNewBuilder5 = ListValue.newBuilder();
        ConcurrentHashMap concurrentHashMap = g3.f60365a;
        if (concurrentHashMap.isEmpty() && concurrentHashMap.isEmpty()) {
            try {
                AssetManager assets = context.getAssets();
                if (assets != null && (list = assets.list("bm_networks")) != null) {
                    for (String str3 : list) {
                        g3.a(assets, str3);
                    }
                }
            } catch (Exception unused) {
            }
        }
        for (h3 h3Var : concurrentHashMap.values()) {
            builderNewBuilder5.addValues(s2.a(h3Var.getName(), h3Var.getSdkVersion(), h3Var.getAdapterVersion()));
        }
        builderNewBuilder5.addValues(s2.a(CampaignEx.JSON_KEY_MRAID, "3.4.0", "3.4.0.1"));
        builderNewBuilder5.addValues(s2.a("vast", "3.4.0", "3.4.0.1"));
        builderNewBuilder5.addValues(s2.a("nast", APSAnalytics.DEFAULT_SDK_VERSION, "3.4.0.1"));
        builderNewBuilder5.addValues(s2.a("adaptive_rendering", "3.4.0", "3.4.0.1"));
        builderNewBuilder3.putFields("networks_info", builderNewBuilder4.setListValue(builderNewBuilder5).build());
        builderNewBuilder.setExt(builderNewBuilder3.build());
        dataBinder.setRequestData(builderNewBuilder.build()).setCallback(new q2(this)).request();
    }
}
