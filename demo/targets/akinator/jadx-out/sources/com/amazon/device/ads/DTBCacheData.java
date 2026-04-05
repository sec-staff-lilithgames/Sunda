package com.amazon.device.ads;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBCacheData {
    public static long ADMOB_AUTO_REFRESH_TIME_LIMIT_MS = 30000;
    public DTBAdRequest cachingLoader;
    public DTBAdResponse cachingResponse;
    public String requestId;
    public boolean isBidRequestFailed = false;
    public long responseTimeStamp = e2.c();

    public DTBCacheData(String str, DTBAdRequest dTBAdRequest) {
        this.requestId = str;
        this.cachingLoader = dTBAdRequest;
    }

    public void addResponse(DTBAdResponse dTBAdResponse) {
        this.cachingResponse = dTBAdResponse;
        this.responseTimeStamp = e2.c();
    }

    public DTBAdResponse getAdResponse() {
        if (e2.c() - this.responseTimeStamp <= ADMOB_AUTO_REFRESH_TIME_LIMIT_MS) {
            return this.cachingResponse;
        }
        this.cachingResponse = null;
        return null;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public long getResponseTimeStamp() {
        return this.responseTimeStamp;
    }

    public boolean isBidRequestFailed() {
        return this.isBidRequestFailed;
    }

    public void setBidRequestFailed(boolean z10) {
        this.isBidRequestFailed = z10;
    }

    public void updateResponse(DTBAdResponse dTBAdResponse) {
        this.cachingResponse = dTBAdResponse;
    }
}
