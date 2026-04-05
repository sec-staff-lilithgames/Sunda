package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.Campaign;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class m extends a<Campaign> {

    /* renamed from: a, reason: collision with root package name */
    private static m f40478a;

    private m(f fVar) {
        super(fVar);
    }

    public static synchronized m a(f fVar) {
        try {
            if (f40478a == null) {
                f40478a = new m(fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40478a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #6 {all -> 0x007e, blocks: (B:10:0x001a, B:12:0x0020, B:13:0x0025, B:15:0x002b, B:39:0x00a6, B:41:0x00aa), top: B:68:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.mbridge.msdk.foundation.entity.m b(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.m.b(java.lang.String):com.mbridge.msdk.foundation.entity.m");
    }

    public synchronized void a(String str) {
        String[] strArr;
        try {
            strArr = new String[]{str};
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("VideoDao", e10.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("video", "video_url = ? ", strArr);
    }

    public synchronized void a(String str, long j10) {
        ContentValues contentValues;
        if (j10 == 0) {
            return;
        }
        try {
            contentValues = new ContentValues();
            contentValues.put("video_download_start", Long.valueOf(j10 / 1000));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("VideoDao", e10.getLocalizedMessage());
            }
        }
        if (a(str, "")) {
            getWritableDatabase().update("video", contentValues, "video_url = ? ", new String[]{str});
            return;
        }
        return;
    }

    public synchronized long a(CampaignEx campaignEx, long j10, String str, int i10) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("unitid", campaignEx.getCampaignUnitId());
                contentValues.put("id", campaignEx.getId());
                contentValues.put("package_name", campaignEx.getPackageName());
                contentValues.put("app_name", campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put("video_url", campaignEx.getVideoUrlEncode());
                contentValues.put("total_size", Long.valueOf(j10));
                contentValues.put("video_state", Integer.valueOf(i10));
                contentValues.put("video_download_start", Long.valueOf(System.currentTimeMillis() / 1000));
                contentValues.put("ad_bid_token", campaignEx.getBidToken());
                if (!TextUtils.isEmpty(str)) {
                    contentValues.put("video_path", str);
                }
                if (a(campaignEx.getVideoUrlEncode(), campaignEx.getId())) {
                    return 0L;
                }
                return getWritableDatabase().insert("video", null, contentValues);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("VideoDao", e10.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized com.mbridge.msdk.foundation.entity.m b(String str, String str2) {
        Cursor cursorRawQuery = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m();
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM video WHERE video_url = ? ", new String[]{str});
                if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                    while (cursorRawQuery.moveToNext()) {
                        mVar.b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("video_url")));
                        mVar.a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("video_state")));
                        mVar.b(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("pregeress_size")));
                        mVar.b(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("total_size")));
                        mVar.a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("video_path")));
                        mVar.a(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("video_download_start")) * 1000);
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("VideoDao", e10.getLocalizedMessage());
                }
                if (cursorRawQuery != null) {
                }
            }
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused) {
                }
            }
            return mVar;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    public synchronized long b(String str, long j10) {
        int iUpdate = -1;
        try {
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("VideoDao", e10.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("total_size", Long.valueOf(j10));
        if (a(str, "")) {
            String[] strArr = {str};
            synchronized (new Object()) {
                iUpdate = getWritableDatabase().update("video", contentValues, "video_url = ? ", strArr);
            }
        }
        return iUpdate;
    }

    public synchronized boolean a(String str, String str2) {
        String[] strArr;
        String str3;
        try {
            if (TextUtils.isEmpty(str2)) {
                str3 = "SELECT id FROM video WHERE video_url = ? ";
                strArr = new String[]{str};
            } else {
                strArr = new String[]{str, str2};
                str3 = "SELECT id FROM video WHERE video_url = ? AND id = ? ";
            }
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, strArr);
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("VideoDao", e10.getLocalizedMessage());
                    }
                }
                return true;
            }
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("VideoDao", e11.getLocalizedMessage());
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    public synchronized long a(String str, long j10, int i10) {
        int iUpdate = -1;
        try {
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("VideoDao", e10.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("pregeress_size", Long.valueOf(j10));
        contentValues.put("video_state", Integer.valueOf(i10));
        if (a(str, "")) {
            String[] strArr = {str};
            synchronized (new Object()) {
                iUpdate = getWritableDatabase().update("video", contentValues, "video_url = ? ", strArr);
            }
        }
        return iUpdate;
    }
}
