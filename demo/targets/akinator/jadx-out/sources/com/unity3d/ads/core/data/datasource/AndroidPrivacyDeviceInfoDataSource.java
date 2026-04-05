package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.OpenAdvertisingId;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;
import java.util.UUID;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.j0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidPrivacyDeviceInfoDataSource implements PrivacyDeviceInfoDataSource {
    private final AndroidAppSetIdDataSource appSetIdDataSource;
    private final Context context;
    private final FIdDataSource fIdDataSource;
    private final MutableStateFlow<Boolean> idfaInitialized;

    public AndroidPrivacyDeviceInfoDataSource(Context context, FIdDataSource fIdDataSource, AndroidAppSetIdDataSource appSetIdDataSource) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(fIdDataSource, "fIdDataSource");
        e0.checkNotNullParameter(appSetIdDataSource, "appSetIdDataSource");
        this.context = context;
        this.fIdDataSource = fIdDataSource;
        this.appSetIdDataSource = appSetIdDataSource;
        this.idfaInitialized = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    private final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource
    public PiiOuterClass.Pii fetch(AllowedPiiOuterClass.AllowedPii allowed) {
        String appSetId;
        String strInvoke;
        e0.checkNotNullParameter(allowed, "allowed");
        if (!this.idfaInitialized.getValue().booleanValue()) {
            this.idfaInitialized.setValue(Boolean.TRUE);
            AdvertisingId.init(this.context);
            OpenAdvertisingId.init(this.context);
        }
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builderNewBuilder = PiiOuterClass.Pii.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        final PiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        if (allowed.getIdfa()) {
            String advertisingTrackingId = getAdvertisingTrackingId();
            if (advertisingTrackingId.length() > 0) {
                UUID uuidFromString = UUID.fromString(advertisingTrackingId);
                e0.checkNotNullExpressionValue(uuidFromString, "fromString(adId)");
                dsl_create.setAdvertisingId(ProtobufExtensionsKt.toByteString(uuidFromString));
            }
            String openAdvertisingTrackingId = getOpenAdvertisingTrackingId();
            if (openAdvertisingTrackingId.length() > 0) {
                UUID uuidFromString2 = UUID.fromString(openAdvertisingTrackingId);
                e0.checkNotNullExpressionValue(uuidFromString2, "fromString(openAdId)");
                dsl_create.setOpenAdvertisingTrackingId(ProtobufExtensionsKt.toByteString(uuidFromString2));
            }
        }
        if (allowed.getFid() && (strInvoke = this.fIdDataSource.invoke()) != null) {
            if (strInvoke.length() <= 0) {
                strInvoke = null;
            }
            if (strInvoke != null) {
                new j0(dsl_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$3
                    @Override // kotlin.jvm.internal.j0, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((PiiKt.Dsl) this.receiver).getFid();
                    }

                    @Override // kotlin.jvm.internal.j0, kotlin.reflect.KMutableProperty0
                    public void set(Object obj) {
                        ((PiiKt.Dsl) this.receiver).setFid((String) obj);
                    }
                }.set(strInvoke);
            }
        }
        if (allowed.getAppsetId() && (appSetId = this.appSetIdDataSource.getAppSetId()) != null) {
            String str = appSetId.length() > 0 ? appSetId : null;
            if (str != null) {
                new j0(dsl_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$6
                    @Override // kotlin.jvm.internal.j0, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((PiiKt.Dsl) this.receiver).getAppsetId();
                    }

                    @Override // kotlin.jvm.internal.j0, kotlin.reflect.KMutableProperty0
                    public void set(Object obj) {
                        ((PiiKt.Dsl) this.receiver).setAppsetId((String) obj);
                    }
                }.set(str);
            }
        }
        return dsl_create._build();
    }
}
