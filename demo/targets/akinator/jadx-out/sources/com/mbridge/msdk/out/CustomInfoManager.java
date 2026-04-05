package com.mbridge.msdk.out;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.j0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.system.NoProGuard;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class CustomInfoManager implements NoProGuard {
    private static CustomInfoManager INSTANCE = null;
    private static String TAG = "CustomInfoManager";
    public static final int TYPE_BID = 6;
    public static final int TYPE_BIDLOAD = 7;
    public static final int TYPE_LOAD = 8;
    private ConcurrentHashMap<String, String> infoMap = new ConcurrentHashMap<>();

    private CustomInfoManager() {
    }

    public static synchronized CustomInfoManager getInstance() {
        try {
            if (INSTANCE == null) {
                synchronized (CustomInfoManager.class) {
                    try {
                        if (INSTANCE == null) {
                            INSTANCE = new CustomInfoManager();
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return INSTANCE;
    }

    public String getCustomInfoByType(String str, int i10) {
        return TextUtils.isEmpty(str) ? "" : getCustomInfoByUnitId(str, i10);
    }

    public String getCustomInfoByUnitId(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str2);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                if (!TextUtils.isEmpty(host) && host.contains(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(path) && path.contains("bid")) {
                    return getCustomInfoByUnitId(str, 6);
                }
                if (!TextUtils.isEmpty(host) && host.contains(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(path) && path.contains("load")) {
                    return getCustomInfoByUnitId(str, 7);
                }
                if (!TextUtils.isEmpty(path) && path.contains("v3")) {
                    return getCustomInfoByUnitId(str, 8);
                }
            }
        } catch (Throwable th2) {
            p0.b(TAG, "Exception", th2);
        }
        return "";
    }

    public void setCustomInfo(String str, int i10, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        String strB = j0.b(str2);
        if (i10 == 6) {
            this.infoMap.put(str + "_bid", strB);
            return;
        }
        if (i10 != 7) {
            if (i10 != 8) {
                return;
            }
            this.infoMap.put(str, strB);
        } else {
            this.infoMap.put(str + "_bidload", strB);
        }
    }

    public String getCustomInfoByUnitId(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i10 == 6) {
            return this.infoMap.get(str + "_bid");
        }
        if (i10 != 7) {
            return i10 != 8 ? "" : this.infoMap.get(str);
        }
        return this.infoMap.get(str + "_bidload");
    }
}
