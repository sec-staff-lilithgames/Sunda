package com.bytedance.sdk.openadsdk.hmu;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo {
    private static int jpo(int i10) {
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    i11 = 5;
                    if (i10 != 5 && i10 != 15) {
                        return -1;
                    }
                }
            }
        }
        return i11;
    }

    public static List<String> jpo(List<String> list, boolean z10) {
        String strJpo = Cif.jpo(sq.jpo());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strJpo)) {
                next = next.replace("{UID}", strJpo).replace("__UID__", strJpo);
            }
            if (z10) {
                next = jpo(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String jpo(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception e10) {
                nmd.wqx("TrackAdUrlUtils", e10.getMessage());
            }
        }
        return str;
    }

    public static List<String> jpo(List<String> list, boolean z10, dt dtVar) {
        String strJpo = Cif.jpo(sq.jpo());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strJpo)) {
                next = next.replace("{UID}", strJpo).replace("__UID__", strJpo);
            }
            String str = KGUkpTlXZlJLy.KKIM;
            if (next.contains(str) && dtVar != null && !TextUtils.isEmpty(dtVar.fc())) {
                next = next.replace(str, dtVar.fc());
            }
            if (next.contains("__CTYPE__") && dtVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(jpo(dtVar.iqh())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jd());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(tic.cm()));
            }
            if (z10) {
                next = jpo(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
