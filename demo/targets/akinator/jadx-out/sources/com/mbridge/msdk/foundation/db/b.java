package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f40443a;

    public b(f fVar) {
        super(fVar);
    }

    public static b a(Context context) {
        if (f40443a == null) {
            synchronized (b.class) {
                try {
                    if (f40443a == null) {
                        f40443a = new b(g.a(context));
                    }
                } finally {
                }
            }
        }
        return f40443a;
    }

    public int b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_replace", (Integer) 1);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = ? AND expect_bid_token = ?", new String[]{str2, str});
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public void a(String str, List<CampaignEx> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        try {
            String requestId = list.get(0).getRequestId();
            String encryptPrice = list.get(0).getEncryptPrice();
            String campaignUnitId = list.get(0).getCampaignUnitId();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("bid_unit_id", campaignUnitId);
            contentValues.put("expect_bid_token", str);
            contentValues.put("expect_encrypt_price", "");
            contentValues.put("real_request_id", requestId);
            contentValues.put("real_encrypt_price", encryptPrice);
            contentValues.put("real_token_rule", (Integer) 1);
            contentValues.put("is_replace", (Integer) 0);
            writableDatabase.insert("bid_replace_campaign", null, contentValues);
            p0.b("HBOPTIMIZE", "插入数据到对应关系表 期望 bidToken 值" + str + "+ 用于替换期望Offer 的RequestId " + requestId);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public List<com.mbridge.msdk.foundation.entity.d> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Cursor cursorRawQuery = null;
            try {
                try {
                    synchronized (new Object()) {
                        cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM bid_replace_campaign WHERE bid_unit_id = ? AND real_request_id = ?", new String[]{str, str2});
                    }
                    if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                        while (cursorRawQuery.moveToNext()) {
                            com.mbridge.msdk.foundation.entity.d dVar = new com.mbridge.msdk.foundation.entity.d();
                            String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("bid_unit_id"));
                            String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("expect_bid_token"));
                            String string3 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("expect_encrypt_price"));
                            String string4 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("real_request_id"));
                            String string5 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("real_encrypt_price"));
                            int i10 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("real_token_rule"));
                            int i11 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("is_replace"));
                            dVar.a(string);
                            dVar.b(string2);
                            dVar.c(string3);
                            dVar.e(string4);
                            dVar.d(string5);
                            dVar.b(i10);
                            dVar.a(i11);
                            arrayList.add(dVar);
                        }
                    }
                } catch (Exception e10) {
                    p0.b("BidReplaceCampaignDao", e10.getLocalizedMessage());
                    if (0 != 0) {
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
        }
        return arrayList;
    }

    public int a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            return writableDatabase.delete("bid_replace_campaign", "is_replace = 0", null);
        } catch (Exception e10) {
            p0.b("BidReplaceCampaignDao", e10.getLocalizedMessage());
            return 0;
        }
    }

    public int a(String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            return writableDatabase.delete("bid_replace_campaign", "real_request_id = ? AND is_replace = 1", new String[]{str});
        } catch (Exception e10) {
            p0.b("BidReplaceCampaignDao", e10.getLocalizedMessage());
            return 0;
        }
    }

    public int a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("expect_encrypt_price", str3);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = ? AND expect_bid_token = ?", new String[]{str2, str});
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}
