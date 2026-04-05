package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi {
    private static List<String> jd() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }

    public static void jpo() {
        Context contextJpo = com.bytedance.sdk.openadsdk.core.sq.jpo();
        if (contextJpo != null && com.bytedance.sdk.component.utils.prr.cm()) {
            String packageName = contextJpo.getPackageName();
            int i10 = contextJpo.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = contextJpo.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> listJd = jd();
                for (String str : strArr) {
                    if (str != null) {
                        listJd.remove(str);
                    }
                }
                if (listJd.isEmpty()) {
                    return;
                }
                for (String str2 : listJd) {
                }
            } catch (Throwable unused) {
            }
        }
    }
}
