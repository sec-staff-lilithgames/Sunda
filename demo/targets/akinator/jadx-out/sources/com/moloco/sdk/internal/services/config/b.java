package com.moloco.sdk.internal.services.config;

import com.moloco.sdk.ConfigsOuterClass$Configs;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.o0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f46965a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f46966b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final List f46967c = o0.listOf(new com.moloco.sdk.internal.services.config.handlers.b());

    @Override // com.moloco.sdk.internal.services.config.a
    public void a(Init$SDKInitResponse sdkInitResponse) {
        e0.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        b(sdkInitResponse);
        c(sdkInitResponse);
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public String b(String featureFlagName) {
        e0.checkNotNullParameter(featureFlagName, "featureFlagName");
        return (String) this.f46966b.get(featureFlagName);
    }

    public final void c(Init$SDKInitResponse init$SDKInitResponse) {
        List<Init$SDKInitResponse.ExperimentalFeatureFlag> experimentalFeatureFlagsList = init$SDKInitResponse.getExperimentalFeatureFlagsList();
        e0.checkNotNullExpressionValue(experimentalFeatureFlagsList, "getExperimentalFeatureFlagsList(...)");
        for (Init$SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag : experimentalFeatureFlagsList) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "RemoteConfigService", "Adding ExperimentalFeatureFlag: " + experimentalFeatureFlag.getName(), null, false, 12, null);
            String name = experimentalFeatureFlag.getName();
            String value = experimentalFeatureFlag.getValue();
            this.f46966b.put(name, (value == null || value.length() == 0) ? null : experimentalFeatureFlag.getValue());
        }
    }

    public final j d(Init$SDKInitResponse init$SDKInitResponse) {
        j jVar;
        List<Init$SDKInitResponse.ExperimentalFeatureFlag> experimentalFeatureFlagsList = init$SDKInitResponse.getExperimentalFeatureFlagsList();
        e0.checkNotNullExpressionValue(experimentalFeatureFlagsList, "getExperimentalFeatureFlagsList(...)");
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(experimentalFeatureFlagsList, 10));
        Iterator<T> it = experimentalFeatureFlagsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Init$SDKInitResponse.ExperimentalFeatureFlag) it.next()).getName());
        }
        boolean zContains = arrayList.contains("ANDROID_STREAMING_ENABLED");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "RemoteConfigService", o2.n("Adding StreamingEnabled: ", zContains), null, false, 12, null);
        if (init$SDKInitResponse.hasConfigs() && init$SDKInitResponse.getConfigs().hasCommonConfigs() && init$SDKInitResponse.getConfigs().getCommonConfigs().hasMediaConfig()) {
            ConfigsOuterClass$Configs.CommonConfigs.MediaConfig mediaConfig = init$SDKInitResponse.getConfigs().getCommonConfigs().getMediaConfig();
            jVar = new j(((int) init$SDKInitResponse.getConfigs().getCommonConfigs().getMediaConfig().getStreamingChunkSizeKilobytes()) > 0 ? ((int) mediaConfig.getStreamingChunkSizeKilobytes()) * 1024 : k.a().e(), zContains, init$SDKInitResponse.getConfigs().getCommonConfigs().getMediaConfig().getMinStreamingPlayableDurationOnTimeoutSecs() > 0.0d ? mediaConfig.getMinStreamingPlayableDurationOnTimeoutSecs() : k.a().g(), k.a().f());
        } else {
            jVar = new j(k.a().e(), zContains, k.a().g(), k.a().f());
        }
        MolocoLogger.debug$default(molocoLogger, "RemoteConfigService", "Parsed and adding MediaConfig: " + jVar.e() + ", " + jVar.h() + ", " + jVar.g() + ", " + jVar.f() + ' ', false, 4, null);
        return jVar;
    }

    public final void b(Init$SDKInitResponse init$SDKInitResponse) {
        Iterator it = this.f46967c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.f46965a;
            if (!zHasNext) {
                linkedHashMap.put(j.class.getName(), d(init$SDKInitResponse));
                return;
            }
            com.moloco.sdk.internal.services.config.handlers.a aVar = (com.moloco.sdk.internal.services.config.handlers.a) it.next();
            linkedHashMap.put(aVar.a().getName(), aVar.a(init$SDKInitResponse));
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "RemoteConfigService", "Adding config: ".concat(aVar.a().getName()), null, false, 12, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public <T> T a(Class<T> configType, T t10) {
        e0.checkNotNullParameter(configType, "configType");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RemoteConfigService", a.b.i(configType, "Retrieving config: "), false, 4, null);
        T t11 = (T) this.f46965a.get(configType.getName());
        return t11 == null ? t10 : t11;
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public boolean a(String featureFlagName) {
        e0.checkNotNullParameter(featureFlagName, "featureFlagName");
        return this.f46966b.containsKey(featureFlagName);
    }
}
