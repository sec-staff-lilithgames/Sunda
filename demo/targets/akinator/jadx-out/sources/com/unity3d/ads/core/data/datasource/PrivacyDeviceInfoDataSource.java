package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface PrivacyDeviceInfoDataSource {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ PiiOuterClass.Pii fetch$default(PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, AllowedPiiOuterClass.AllowedPii allowedPii, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i10 & 1) != 0) {
                allowedPii = AllowedPiiOuterClass.AllowedPii.getDefaultInstance();
                e0.checkNotNullExpressionValue(allowedPii, "getDefaultInstance()");
            }
            return privacyDeviceInfoDataSource.fetch(allowedPii);
        }
    }

    PiiOuterClass.Pii fetch(AllowedPiiOuterClass.AllowedPii allowedPii);
}
