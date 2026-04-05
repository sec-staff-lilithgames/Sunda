package com.amazon.device.ads;

import com.amazon.aps.ads.model.ApsAdNetwork;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBAdNetworkInfo {
    public static final String LOGTAG = "DTBAdNetworkInfo";
    public final String adNetworkName;
    public final HashMap<String, String> adNetworkProperties;

    public DTBAdNetworkInfo(DTBAdNetwork dTBAdNetwork) {
        this.adNetworkName = dTBAdNetwork != null ? dTBAdNetwork.toString() : DTBAdNetwork.UNKNOWN.toString();
        this.adNetworkProperties = new HashMap<>();
    }

    public String getAdNetworkName() {
        return this.adNetworkName;
    }

    public String getAdNetworkProperties(String str) {
        if (this.adNetworkProperties.containsKey(str)) {
            return this.adNetworkProperties.get(str);
        }
        DtbLog.error(LOGTAG, "DTB Ad NetworkProperties not found");
        return null;
    }

    public DTBAdNetworkInfo setAdNetworkProperties(String str, String str2) {
        this.adNetworkProperties.put(str, str2);
        return this;
    }

    public DTBAdNetworkInfo(ApsAdNetwork apsAdNetwork) {
        String string;
        if (apsAdNetwork != null) {
            string = apsAdNetwork.toString();
        } else {
            string = ApsAdNetwork.UNKNOWN.toString();
        }
        this.adNetworkName = string;
        this.adNetworkProperties = new HashMap<>();
    }
}
