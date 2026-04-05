package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.z0;
import java.net.URLEncoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class n extends a<com.mbridge.msdk.foundation.entity.n> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40489a = "com.mbridge.msdk.foundation.db.n";

    /* renamed from: b, reason: collision with root package name */
    private static n f40490b;

    private n(f fVar) {
        super(fVar);
    }

    public static n a(f fVar) {
        if (f40490b == null) {
            synchronized (n.class) {
                try {
                    if (f40490b == null) {
                        f40490b = new n(fVar);
                    }
                } finally {
                }
            }
        }
        return f40490b;
    }

    public synchronized int a() {
        int i10;
        i10 = 0;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("select count(*) from reward_report", null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    i10 = cursorRawQuery.getInt(0);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorRawQuery != null) {
                }
            }
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x033c A[EXC_TOP_SPLITTER, PHI: r10 r21
      0x033c: PHI (r10v3 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v14 android.database.Cursor) binds: [B:105:0x033a, B:99:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x033c: PHI (r21v3 java.util.List<com.mbridge.msdk.foundation.entity.n>) = 
      (r21v2 java.util.List<com.mbridge.msdk.foundation.entity.n>)
      (r21v6 java.util.List<com.mbridge.msdk.foundation.entity.n>)
     binds: [B:105:0x033a, B:99:0x0321] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.mbridge.msdk.foundation.entity.n> a(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a(java.lang.String):java.util.List");
    }

    public synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        try {
            if (nVar != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C3191e4.h.W, nVar.n());
                    contentValues.put("networkType", Integer.valueOf(nVar.q()));
                    contentValues.put("network_str", nVar.r());
                    contentValues.put("isCompleteView", Integer.valueOf(nVar.m()));
                    contentValues.put("watchedMillis", Integer.valueOf(nVar.F()));
                    contentValues.put("videoLength", Integer.valueOf(nVar.C()));
                    if (!TextUtils.isEmpty(nVar.s())) {
                        contentValues.put("offerUrl", nVar.s());
                    }
                    if (!TextUtils.isEmpty(nVar.t())) {
                        contentValues.put("reason", URLEncoder.encode(nVar.t(), G5.N));
                    }
                    contentValues.put("result", Integer.valueOf(nVar.x()));
                    contentValues.put(IronSourceConstants.EVENTS_DURATION, nVar.g());
                    contentValues.put("videoSize", Long.valueOf(nVar.D()));
                    contentValues.put("type", nVar.h());
                    String strI = nVar.i();
                    if (!TextUtils.isEmpty(strI)) {
                        contentValues.put(CampaignEx.ENDCARD_URL, strI);
                    }
                    String strE = nVar.E();
                    if (!TextUtils.isEmpty(strE)) {
                        contentValues.put("video_url", strE);
                    }
                    String strU = nVar.u();
                    if (!TextUtils.isEmpty(strU)) {
                        contentValues.put("rid", strU);
                    }
                    String strV = nVar.v();
                    if (!TextUtils.isEmpty(strV)) {
                        contentValues.put("rid_n", strV);
                    }
                    String strZ = nVar.z();
                    if (!TextUtils.isEmpty(strZ)) {
                        contentValues.put("template_url", strZ);
                    }
                    String strL = nVar.l();
                    if (!TextUtils.isEmpty(strL)) {
                        contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, strL);
                    }
                    String strA = nVar.a();
                    if (!TextUtils.isEmpty(strA)) {
                        contentValues.put("ad_type", URLEncoder.encode(strA, G5.N));
                    }
                    contentValues.put("unitId", nVar.B());
                    contentValues.put("campaignId", nVar.d());
                    if ("2000039".equals(nVar.n())) {
                        String strB = o.b(nVar);
                        if (z0.b(strB)) {
                            contentValues.put("h5_click_data", strB);
                        }
                    }
                    String strW = nVar.w();
                    if (!TextUtils.isEmpty(strW)) {
                        contentValues.put("resource_type", URLEncoder.encode(strW, G5.N));
                    }
                    String strF = nVar.f();
                    if (!TextUtils.isEmpty(strF)) {
                        contentValues.put("device_id", URLEncoder.encode(strF, G5.N));
                    }
                    String strE2 = nVar.e();
                    if (!TextUtils.isEmpty(strE2)) {
                        contentValues.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, URLEncoder.encode(strE2, G5.N));
                    }
                    contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.b()));
                    return getWritableDatabase().insert("reward_report", null, contentValues);
                } catch (Exception e10) {
                    p0.b(f40489a, e10.getMessage());
                }
            }
            return -1L;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
