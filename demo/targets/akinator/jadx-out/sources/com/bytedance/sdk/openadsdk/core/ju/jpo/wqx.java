package com.bytedance.sdk.openadsdk.core.ju.jpo;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.sq;
import i2.hQ.aTNDubNmpwAqdU;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class wqx {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile wqx f20555jd = null;
    public static int jpo = 20;
    private final Object wqx = new Object();

    /* renamed from: cm, reason: collision with root package name */
    private final LruCache<String, jpo> f20556cm = new LruCache<String, jpo>(jpo) { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.wqx.1
        @Override // android.util.LruCache
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, jpo jpoVar) {
            return 1;
        }
    };

    private wqx() {
    }

    public static String cm() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public static wqx jpo() {
        if (f20555jd == null) {
            synchronized (wqx.class) {
                try {
                    if (f20555jd == null) {
                        f20555jd = new wqx();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f20555jd;
    }

    public static String wqx() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    public List<jpo> jd() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.wqx wqxVar = new com.bytedance.sdk.openadsdk.multipro.aidl.wqx(com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(sq.jpo(), "ugen_template", null, null, null, null, null, null));
        try {
            if (wqxVar.moveToFirst()) {
                do {
                    int columnIndex = wqxVar.getColumnIndex("id");
                    int columnIndex2 = wqxVar.getColumnIndex("md5");
                    int columnIndex3 = wqxVar.getColumnIndex("url");
                    int columnIndex4 = wqxVar.getColumnIndex("data");
                    int columnIndex5 = wqxVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = wqxVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? wqxVar.getString(columnIndex6) : null;
                        String string2 = wqxVar.getString(columnIndex);
                        String string3 = wqxVar.getString(columnIndex2);
                        String string4 = wqxVar.getString(columnIndex3);
                        jpo jpoVarJpo = new jpo().jpo(string2).jd(string3).wqx(string4).cm(wqxVar.getString(columnIndex4)).my(string).jpo(Long.valueOf(wqxVar.getLong(columnIndex5)));
                        arrayList.add(jpoVarJpo);
                        synchronized (this.wqx) {
                            this.f20556cm.put(string2, jpoVarJpo);
                        }
                    }
                } while (wqxVar.moveToNext());
            }
            return arrayList;
        } catch (Throwable th2) {
            try {
                nmd.jpo("UGTmplDbHelper", "getUgenTemplate error", th2);
                return arrayList;
            } finally {
                wqxVar.close();
            }
        }
    }

    public jpo jpo(String str, String str2) {
        jpo jpoVar;
        jpo jpoVarJpo;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.wqx) {
            jpoVar = this.f20556cm.get(str);
        }
        if (jpoVar != null) {
            if (TextUtils.equals(str2, jpoVar.jd())) {
                return jpoVar;
            }
            jd(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.wqx wqxVar = new com.bytedance.sdk.openadsdk.multipro.aidl.wqx(com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(sq.jpo(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (wqxVar.moveToFirst()) {
                do {
                    int columnIndex = wqxVar.getColumnIndex("id");
                    int columnIndex2 = wqxVar.getColumnIndex("md5");
                    int columnIndex3 = wqxVar.getColumnIndex("url");
                    int columnIndex4 = wqxVar.getColumnIndex("data");
                    int columnIndex5 = wqxVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = wqxVar.getColumnIndex("rit");
                        String string = wqxVar.getString(columnIndex);
                        String string2 = wqxVar.getString(columnIndex2);
                        String string3 = wqxVar.getString(columnIndex3);
                        String string4 = wqxVar.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            return null;
                        }
                        jpoVarJpo = new jpo().jpo(string).jd(string2).cm(string4).wqx(string3).my(columnIndex6 != -1 ? wqxVar.getString(columnIndex6) : null).jpo(Long.valueOf(wqxVar.getLong(columnIndex5)));
                        synchronized (this.wqx) {
                            this.f20556cm.put(string, jpoVarJpo);
                        }
                    }
                    return null;
                } while (wqxVar.moveToNext());
                return jpoVarJpo;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    private void jd(String str) {
        if (!TextUtils.isEmpty(str) && this.f20556cm.size() > 0) {
            synchronized (this.wqx) {
                this.f20556cm.remove(str);
            }
        }
    }

    public void jpo(jpo jpoVar) {
        if (jpoVar == null || TextUtils.isEmpty(jpoVar.jpo())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.wqx wqxVar = new com.bytedance.sdk.openadsdk.multipro.aidl.wqx(com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(sq.jpo(), "ugen_template", null, "id=?", new String[]{jpoVar.jpo()}, null, null, null));
        boolean z10 = wqxVar.getCount() > 0;
        try {
            wqxVar.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", jpoVar.jpo());
            contentValues.put("md5", jpoVar.jd());
            contentValues.put(aTNDubNmpwAqdU.zWmIRkGpn, jpoVar.wqx());
            contentValues.put("data", jpoVar.my());
            contentValues.put("rit", jpoVar.jj());
            contentValues.put("update_time", jpoVar.cm());
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(sq.jpo(), "ugen_template", contentValues, "id=?", new String[]{jpoVar.jpo()});
            } else {
                com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(sq.jpo(), "ugen_template", contentValues);
            }
            synchronized (this.wqx) {
                this.f20556cm.put(jpoVar.jpo(), jpoVar);
            }
        } catch (Throwable unused) {
        }
    }

    public Set<jpo> jpo(String str) {
        jpo jpoVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.wqx wqxVar = new com.bytedance.sdk.openadsdk.multipro.aidl.wqx(com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(sq.jpo(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (wqxVar.moveToFirst()) {
                do {
                    int columnIndex = wqxVar.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = wqxVar.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.wqx) {
                                jpoVar = this.f20556cm.get(string);
                            }
                            if (jpoVar != null) {
                                hashSet.add(jpoVar);
                            } else {
                                jpo jpoVar2 = new jpo();
                                int columnIndex2 = wqxVar.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = wqxVar.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        jpoVar2.cm(string2);
                                        jpoVar2.jpo(string);
                                        jpoVar2.my(str);
                                        int columnIndex3 = wqxVar.getColumnIndex("md5");
                                        int columnIndex4 = wqxVar.getColumnIndex("url");
                                        int columnIndex5 = wqxVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            jpoVar2.jd(wqxVar.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            jpoVar2.wqx(wqxVar.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            jpoVar2.jpo(Long.valueOf(wqxVar.getLong(columnIndex5)));
                                        }
                                        hashSet.add(jpoVar2);
                                        synchronized (this.wqx) {
                                            this.f20556cm.put(string, jpoVar2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (wqxVar.moveToNext());
            }
            return hashSet;
        } catch (Throwable th2) {
            try {
                nmd.jpo("UGTmplDbHelper", "getUgenTemplateFormRit error", th2);
                return hashSet;
            } finally {
                wqxVar.close();
            }
        }
    }

    public void jpo(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                jd(str);
                com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(sq.jpo(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
