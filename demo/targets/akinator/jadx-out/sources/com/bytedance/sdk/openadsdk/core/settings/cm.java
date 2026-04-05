package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* renamed from: cm, reason: collision with root package name */
    private static volatile int f20856cm = 0;

    /* renamed from: jd, reason: collision with root package name */
    private static volatile String f20857jd = "";
    private static volatile String jpo = "";
    private static String wqx;

    public static String cm() {
        if (TextUtils.isEmpty(wqx)) {
            wqx = sq.jpo().getPackageManager().getInstallerPackageName(tic.jj());
        }
        if (wqx == null) {
            wqx = "";
        }
        return wqx;
    }

    public static String wqx() {
        if (f20856cm != 0) {
            return f20857jd;
        }
        jpo();
        return f20857jd;
    }

    public static String jd() {
        if (f20856cm != 0) {
            return jpo;
        }
        jpo();
        return jpo;
    }

    public static void jpo() {
        try {
            AppSet.getClient(sq.jpo()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = cm.jpo = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = cm.f20857jd = appSetIdInfo.getId();
                    int unused3 = cm.f20856cm = 1;
                }
            });
        } catch (Throwable unused) {
            f20856cm = 2;
        }
    }
}
