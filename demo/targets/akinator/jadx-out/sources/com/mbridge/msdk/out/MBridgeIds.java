package com.mbridge.msdk.out;

import android.text.TextUtils;
import com.mbridge.msdk.system.NoProGuard;
import j1.o2;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBridgeIds implements Serializable, NoProGuard {
    private String bidToken = "";
    private boolean isCache = false;
    private String placementId;
    private String requestId;
    private String unitId;

    public MBridgeIds() {
    }

    public String getBidToken() {
        if (TextUtils.isEmpty(this.bidToken)) {
            this.bidToken = "";
        }
        return this.bidToken;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getRequestId() {
        return TextUtils.isEmpty(this.requestId) ? "" : this.requestId;
    }

    public String getUnitId() {
        return this.unitId;
    }

    public boolean isCache() {
        return this.isCache;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public void setCache(boolean z10) {
        this.isCache = z10;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MBridgeIds{placementId='");
        sb2.append(this.placementId);
        sb2.append("', unitId='");
        sb2.append(this.unitId);
        sb2.append("', bidToken='");
        return o2.o(sb2, this.bidToken, "'}");
    }

    public MBridgeIds(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
    }

    public MBridgeIds(String str, String str2, String str3) {
        this.placementId = str;
        this.unitId = str2;
        this.requestId = str3;
    }
}
