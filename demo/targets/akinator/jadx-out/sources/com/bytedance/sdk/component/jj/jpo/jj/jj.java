package com.bytedance.sdk.component.jj.jpo.jj;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import ao.kwoC.zAQQWzBxnS;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jj implements my {
    private Context jpo;

    public jj(Context context) {
        this.jpo = context;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj.my
    public void jd(cm cmVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", cmVar.jpo());
        contentValues.put("url", cmVar.jd());
        contentValues.put("replaceholder", Integer.valueOf(cmVar.wqx() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(cmVar.cm()));
        contentValues.put("error_code", cmVar.qk());
        contentValues.put("error_msg", cmVar.zz());
        contentValues.put("url_type", Integer.valueOf(cmVar.my()));
        contentValues.put("ad_id", cmVar.jj());
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(this.jpo, "trackurl", contentValues, "id=?", new String[]{cmVar.jpo()});
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj.my
    public List<cm> jpo() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorJpo = com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(this.jpo, "trackurl", null, null, null, null, null, null);
        if (cursorJpo != null) {
            while (cursorJpo.moveToNext()) {
                try {
                    try {
                        String string = cursorJpo.getString(cursorJpo.getColumnIndex("id"));
                        String string2 = cursorJpo.getString(cursorJpo.getColumnIndex("url"));
                        boolean z10 = cursorJpo.getInt(cursorJpo.getColumnIndex("replaceholder")) > 0;
                        int i10 = cursorJpo.getInt(cursorJpo.getColumnIndex("retry"));
                        int i11 = cursorJpo.getInt(cursorJpo.getColumnIndex("url_type"));
                        String string3 = cursorJpo.getString(cursorJpo.getColumnIndex("ad_id"));
                        String string4 = cursorJpo.getString(cursorJpo.getColumnIndex("error_code"));
                        String string5 = cursorJpo.getString(cursorJpo.getColumnIndex("error_msg"));
                        cm cmVar = new cm(string, string2, z10, i11, string3);
                        cmVar.jpo(i10);
                        if (!TextUtils.isEmpty(string4)) {
                            cmVar.jpo(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            cmVar.jd(string5);
                        }
                        linkedList.add(cmVar);
                    } catch (Throwable unused) {
                    }
                } finally {
                    cursorJpo.close();
                }
            }
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj.my
    public void wqx(cm cmVar) {
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(this.jpo, "trackurl", "id=?", new String[]{cmVar.jpo()});
    }

    public static String jd() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj.my
    public cm jpo(String str) {
        Cursor cursorJpo = com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(this.jpo, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorJpo != null && cursorJpo.moveToFirst()) {
            try {
                String string = cursorJpo.getString(cursorJpo.getColumnIndex("id"));
                String string2 = cursorJpo.getString(cursorJpo.getColumnIndex("url"));
                boolean z10 = cursorJpo.getInt(cursorJpo.getColumnIndex("replaceholder")) > 0;
                int i10 = cursorJpo.getInt(cursorJpo.getColumnIndex("retry"));
                int i11 = cursorJpo.getInt(cursorJpo.getColumnIndex("url_type"));
                String string3 = cursorJpo.getString(cursorJpo.getColumnIndex("ad_id"));
                String string4 = cursorJpo.getString(cursorJpo.getColumnIndex("error_code"));
                String string5 = cursorJpo.getString(cursorJpo.getColumnIndex("error_msg"));
                cm cmVar = new cm(string, string2, z10, i11, string3);
                cmVar.jpo(i10);
                if (!TextUtils.isEmpty(string4)) {
                    cmVar.jpo(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    cmVar.jd(string5);
                }
                return cmVar;
            } catch (Throwable th2) {
                try {
                    th2.getMessage();
                    cursorJpo.close();
                    cursorJpo = null;
                } finally {
                    cursorJpo.close();
                }
            }
        }
        if (cursorJpo != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jj.my
    public void jpo(cm cmVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", cmVar.jpo());
        contentValues.put("url", cmVar.jd());
        contentValues.put("replaceholder", Integer.valueOf(cmVar.wqx() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(cmVar.cm()));
        contentValues.put("url_type", Integer.valueOf(cmVar.my()));
        contentValues.put("ad_id", cmVar.jj());
        contentValues.put("error_code", cmVar.qk());
        contentValues.put(zAQQWzBxnS.qjtSXpHQwScJuX, cmVar.zz());
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(this.jpo, "trackurl", contentValues);
    }
}
