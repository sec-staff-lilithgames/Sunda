package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonAlternativeFlowReader implements AlternativeFlowReader {
    private final ConfigurationReader configurationReader;
    private final MutableStateFlow<Boolean> isAlternativeFlowEnabled;
    private final MutableStateFlow<Boolean> isAlternativeFlowRead;
    private final MediationTraitsMetadataReader mediationMetadataReader;
    private final SessionRepository sessionRepository;

    public CommonAlternativeFlowReader(ConfigurationReader configurationReader, SessionRepository sessionRepository, MediationTraitsMetadataReader mediationMetadataReader) {
        e0.checkNotNullParameter(configurationReader, "configurationReader");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(mediationMetadataReader, "mediationMetadataReader");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        this.mediationMetadataReader = mediationMetadataReader;
        this.isAlternativeFlowRead = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.isAlternativeFlowEnabled = StateFlowKt.MutableStateFlow(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    @Override // com.unity3d.ads.core.configuration.AlternativeFlowReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean invoke() {
        /*
            r4 = this;
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r4.isAlternativeFlowRead
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1b
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r4.isAlternativeFlowEnabled
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1b:
            com.unity3d.ads.core.configuration.MediationTraitsMetadataReader r0 = r4.mediationMetadataReader
            com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
            java.lang.String r0 = r0.getKey()
            java.lang.Object r0 = r1.get(r0)
            r1 = 0
            if (r0 == 0) goto L39
            java.lang.String r2 = "get(key)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r2)
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L36
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 != 0) goto L3a
        L39:
            r0 = r1
        L3a:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L5d
            java.lang.String r2 = "boldSdkEnabled"
            boolean r3 = r0.has(r2)
            if (r3 == 0) goto L47
            r1 = r0
        L47:
            if (r1 == 0) goto L5d
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r4.isAlternativeFlowEnabled
            boolean r1 = r1.optBoolean(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        L5d:
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r4.isAlternativeFlowRead
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto La1
            com.unity3d.services.core.configuration.ConfigurationReader r0 = r4.configurationReader
            com.unity3d.services.core.configuration.Configuration r0 = r0.getCurrentConfiguration()
            com.unity3d.services.core.configuration.IExperiments r0 = r0.getExperiments()
            boolean r0 = r0.isBoldSdkNextSessionEnabled()
            if (r0 != 0) goto L83
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r4.isAlternativeFlowEnabled
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            goto L9a
        L83:
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r4.isAlternativeFlowEnabled
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r4.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r1 = r1.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlags r1 = r1.getFeatureFlags()
            boolean r1 = r1.getBoldSdkNextSessionEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
        L9a:
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        La1:
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r4.isAlternativeFlowEnabled
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.CommonAlternativeFlowReader.invoke():boolean");
    }
}
