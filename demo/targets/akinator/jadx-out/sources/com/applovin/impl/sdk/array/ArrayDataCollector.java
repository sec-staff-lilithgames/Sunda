package com.applovin.impl.sdk.array;

import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ArrayDataCollector {
    private static final String TAG = "ArrayService";
    private final o logger;
    private final k sdk;

    public ArrayDataCollector(k kVar) {
        this.sdk = kVar;
        this.logger = kVar.O();
    }

    public long collectAppHubVersionCode(IAppHubService iAppHubService) {
        try {
            return iAppHubService.getAppHubVersionCode();
        } catch (Throwable th2) {
            if (!o.a()) {
                return -1L;
            }
            this.logger.a(TAG, "Failed to collect version code", th2);
            return -1L;
        }
    }

    public Boolean collectDirectDownloadEnabled(IAppHubService iAppHubService) {
        try {
            return Boolean.valueOf(iAppHubService.getEnabledFeatures().getBoolean("DIRECT_DOWNLOAD"));
        } catch (Throwable th2) {
            if (!o.a()) {
                return null;
            }
            this.logger.a(TAG, "Failed to collect enabled features", th2);
            return null;
        }
    }

    public String collectRandomUserToken(IAppHubService iAppHubService) {
        try {
            return iAppHubService.getRandomUserToken();
        } catch (Throwable th2) {
            if (!o.a()) {
                return null;
            }
            this.logger.a(TAG, "Failed to collect random user token", th2);
            return null;
        }
    }
}
