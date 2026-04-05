package com.bytedance.sdk.component.adexpress.jpo.jd;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile jj f18510jd = null;
    public static int jpo = 20;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.jpo.wqx.wqx> my;

    /* renamed from: cm, reason: collision with root package name */
    private final Object f18511cm = new Object();

    /* renamed from: jj, reason: collision with root package name */
    private AtomicBoolean f18512jj = new AtomicBoolean(false);

    /* renamed from: qk, reason: collision with root package name */
    private LruCache<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jd> f18513qk = new LruCache<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jd>(jpo) { // from class: com.bytedance.sdk.component.adexpress.jpo.jd.jj.1
        @Override // android.util.LruCache
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVar) {
            return 1;
        }
    };
    private Set<String> wqx = Collections.synchronizedSet(new HashSet());

    private jj() {
    }

    private void cm(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.jpo.wqx.jd> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.f18513qk) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.f18511cm) {
            this.f18513qk.remove(str);
        }
    }

    public static void jpo(int i10) {
        jpo = i10;
    }

    public Set<String> jd(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorJpo = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd().jpo("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (cursorJpo != null) {
                try {
                    try {
                        if (cursorJpo.moveToFirst()) {
                            do {
                                hashSet.add(cursorJpo.getString(cursorJpo.getColumnIndex("id")));
                            } while (cursorJpo.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e10) {
                        Log.e("TmplDbHelper", "", e10);
                    }
                } finally {
                    cursorJpo.close();
                }
            }
        }
        return null;
    }

    public void wqx(String str) {
        com.bytedance.sdk.component.adexpress.jpo.wqx.wqx wqxVar;
        try {
            if (this.my != null && !this.my.isEmpty() && (wqxVar = this.my.get(str)) != null) {
                if (!TextUtils.isEmpty(wqxVar.jpo()) && com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jj() != null) {
                    com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jj();
                }
                this.my.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static jj jpo() {
        if (f18510jd == null) {
            synchronized (jj.class) {
                try {
                    if (f18510jd == null) {
                        f18510jd = new jj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f18510jd;
    }

    public static String wqx() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public com.bytedance.sdk.component.adexpress.jpo.wqx.jd jpo(String str) {
        com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVar;
        com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVarJpo;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd() == null) {
            return null;
        }
        synchronized (this.f18511cm) {
            jdVar = this.f18513qk.get(String.valueOf(str));
        }
        if (jdVar != null) {
            return jdVar;
        }
        Cursor cursorJpo = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd().jpo("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorJpo != null) {
            try {
                if (cursorJpo.moveToFirst()) {
                    do {
                        String string = cursorJpo.getString(cursorJpo.getColumnIndex("rit"));
                        String string2 = cursorJpo.getString(cursorJpo.getColumnIndex("id"));
                        String string3 = cursorJpo.getString(cursorJpo.getColumnIndex("md5"));
                        String string4 = cursorJpo.getString(cursorJpo.getColumnIndex("url"));
                        String string5 = cursorJpo.getString(cursorJpo.getColumnIndex("data"));
                        String string6 = cursorJpo.getString(cursorJpo.getColumnIndex("version"));
                        jdVarJpo = new com.bytedance.sdk.component.adexpress.jpo.wqx.jd().jpo(string).jd(string2).wqx(string3).cm(string4).my(string5).jj(string6).jpo(Long.valueOf(cursorJpo.getLong(cursorJpo.getColumnIndex("update_time"))));
                        synchronized (this.f18511cm) {
                            this.f18513qk.put(string2, jdVarJpo);
                        }
                        this.wqx.add(string2);
                    } while (cursorJpo.moveToNext());
                    cursorJpo.close();
                    return jdVarJpo;
                }
            } catch (Throwable unused) {
            }
            cursorJpo.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<com.bytedance.sdk.component.adexpress.jpo.wqx.jd> jd() {
        if (com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd() == null) {
            return null;
        }
        boolean z10 = this.f18512jj.get();
        this.f18512jj.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorJpo = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd().jpo("template_diff_new", null, null, null, null, null, null);
        if (cursorJpo != null) {
            while (cursorJpo.moveToNext()) {
                try {
                    String string = cursorJpo.getString(cursorJpo.getColumnIndex("rit"));
                    String string2 = cursorJpo.getString(cursorJpo.getColumnIndex("id"));
                    String string3 = cursorJpo.getString(cursorJpo.getColumnIndex("md5"));
                    String string4 = cursorJpo.getString(cursorJpo.getColumnIndex("url"));
                    String string5 = cursorJpo.getString(cursorJpo.getColumnIndex("data"));
                    String string6 = cursorJpo.getString(cursorJpo.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.jpo.wqx.jd().jpo(string).jd(string2).wqx(string3).cm(string4).my(string5).jj(string6).jpo(Long.valueOf(cursorJpo.getLong(cursorJpo.getColumnIndex("update_time")))));
                    synchronized (this.f18511cm) {
                        this.f18513qk.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.wqx.add(string2);
                    if (!z10 && com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jj() != null) {
                        if (this.my == null) {
                            this.my = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.my.contains(string2)) {
                            this.my.put(string2, new com.bytedance.sdk.component.adexpress.jpo.wqx.wqx(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    cursorJpo.close();
                }
            }
            cursorJpo.close();
            return arrayList;
        }
        return arrayList;
    }

    public void jpo(com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVar, boolean z10) {
        if (jdVar == null || com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd() == null || TextUtils.isEmpty(jdVar.jd())) {
            return;
        }
        Cursor cursorJpo = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd().jpo("template_diff_new", null, "id=?", new String[]{jdVar.jd()}, null, null, null);
        boolean z11 = cursorJpo != null && cursorJpo.getCount() > 0;
        if (cursorJpo != null) {
            try {
                string = cursorJpo.moveToFirst() ? cursorJpo.getString(cursorJpo.getColumnIndex("rit")) : null;
                cursorJpo.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", jdVar.jpo());
        contentValues.put("id", jdVar.jd());
        contentValues.put("md5", jdVar.wqx());
        contentValues.put("url", jdVar.cm());
        contentValues.put("data", jdVar.my());
        contentValues.put("version", jdVar.jj());
        contentValues.put("update_time", jdVar.qk());
        if (z11) {
            com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd().jpo("template_diff_new", contentValues, "id=?", new String[]{jdVar.jd()});
        } else {
            com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd().jpo("template_diff_new", contentValues);
        }
        synchronized (this.f18511cm) {
            this.f18513qk.put(jdVar.jd(), jdVar);
        }
        this.wqx.add(jdVar.jd());
        if (z10) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jj() == null) {
                return;
            }
            if (this.my == null) {
                this.my = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.jpo.wqx.wqx wqxVar = new com.bytedance.sdk.component.adexpress.jpo.wqx.wqx(jdVar.jpo(), jdVar.jd(), jdVar.wqx());
            this.my.put(jdVar.jd(), wqxVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jj();
                wqxVar.jd();
            }
            com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jj();
            jdVar.jpo();
        } catch (Throwable unused2) {
        }
    }

    public void jpo(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                cm(strArr[i10]);
                com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jd().jpo("template_diff_new", "id=?", new String[]{strArr[i10]});
                wqx(strArr[i10]);
            }
        }
    }
}
