package com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo;

import a.b;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.jj.jpo.xyk;
import com.google.android.gms.internal.play_billing.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends wqx {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f18720cm;
    protected List<String> jpo;
    private final Context wqx;

    public jpo(Context context, com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar) {
        super(context);
        this.jpo = new ArrayList();
        this.wqx = context;
        this.f18720cm = jpoVar;
        if (jpoVar == null) {
            this.f18720cm = com.bytedance.sdk.component.jj.jpo.cm.jd.jpo.wqx();
        }
    }

    public byte cm() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.wqx
    public String jd() {
        com.bytedance.sdk.component.jj.jpo.jpo.my myVarCm = xyk.qk().cm();
        if (myVarCm != null) {
            return myVarCm.jd();
        }
        return null;
    }

    public int jpo() {
        Cursor cursorJpo = null;
        int i10 = 0;
        try {
            cursorJpo = com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), jd(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorJpo != null) {
                cursorJpo.moveToFirst();
                i10 = cursorJpo.getInt(0);
            }
        } catch (Exception unused) {
            if (cursorJpo != null) {
            }
        } catch (Throwable th2) {
            if (cursorJpo != null) {
                try {
                    cursorJpo.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
        if (cursorJpo != null) {
            try {
                cursorJpo.close();
            } catch (Exception unused3) {
            }
        }
        return i10;
    }

    public byte wqx() {
        return (byte) 2;
    }

    public void jd(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar : list) {
            linkedList.add(jpoVar.wqx());
            com.bytedance.sdk.component.jj.jpo.wqx.jpo.yd(jpoVar);
        }
        jd();
        linkedList.size();
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), "DELETE FROM " + jd() + " WHERE " + jpo("id", linkedList, 1000, true));
        wqx(linkedList);
    }

    public List<com.bytedance.sdk.component.jj.jpo.cm.jpo> jpo(int i10, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b10;
        Cursor cursorJpo;
        long jJpo = com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo(i10, my());
        jd();
        if (jJpo <= 0) {
            jJpo = 1;
        } else if (jJpo > 100) {
            jJpo = 100;
        }
        String str4 = str + " DESC limit " + jJpo;
        ArrayList arrayList = new ArrayList();
        this.jpo.clear();
        long jSq = xyk.qk().sq();
        if (jSq > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jSq)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.jj.jpo.wqx.jpo.cm() && cm() == 3) {
            str3 = "id";
            b10 = 3;
            cursorJpo = com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), jd(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b10 = 3;
            cursorJpo = com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), jd(), new String[]{str3, "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = cursorJpo;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.jj.jpo.my myVarHna = xyk.qk().hna();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i11 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i12 = (com.bytedance.sdk.component.jj.jpo.wqx.jpo.cm() && cm() == b10) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i11 == 1) {
                            try {
                                string2 = myVarHna.jpo(string2);
                            } catch (Throwable th2) {
                                th = th2;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.jpo.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.jj.jpo.cm.jpo.jpo jpoVar = new com.bytedance.sdk.component.jj.jpo.cm.jpo.jpo(string, jSONObject);
                            jpoVar.jpo(cm());
                            jpoVar.jd(wqx());
                            if (com.bytedance.sdk.component.jj.jpo.wqx.jpo.cm() && cm() == b10) {
                                jpoVar.jpo(i12);
                            }
                            com.bytedance.sdk.component.jj.jpo.wqx.jpo.jpo(jSONObject, jpoVar);
                            arrayList.add(jpoVar);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } finally {
                try {
                    cursor.close();
                    if (!this.jpo.isEmpty()) {
                        jpo(this.jpo);
                        this.jpo.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        jd();
        arrayList.size();
        return arrayList;
    }

    private void jd(int i10, long j10) {
        if (j10 > 0 || i10 > 0) {
            com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), jd(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
            jd();
        }
    }

    public static String jd(String str) {
        return b.l("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.jj.jpo.cm.jpo> jpo(String str) {
        com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar = this.f18720cm;
        if (jpoVar == null) {
            return new ArrayList();
        }
        return jpo(jpoVar.jd(), str);
    }

    public void jpo(List<String> list) {
        jd();
        list.size();
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), "DELETE FROM " + jd() + " WHERE " + jpo("id", list, 1000, true));
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.cgn(), list.size());
        wqx(list);
    }

    public void jpo(int i10, long j10) {
        jd(i10, j10);
    }

    public boolean jpo(int i10) {
        if (this.f18720cm == null) {
            return false;
        }
        int iJpo = jpo();
        int iJpo2 = this.f18720cm.jpo();
        jd();
        return (com.bytedance.sdk.component.jj.jpo.wqx.jpo.wqx() && (i10 == 1 || i10 == 2)) ? iJpo > 0 : iJpo >= iJpo2;
    }

    private static String jpo(String str, List<?> list, int i10, boolean z10) {
        int i11;
        String str2 = z10 ? " IN " : " NOT IN ";
        String str3 = z10 ? " OR " : " AND ";
        int iMin = Math.min(i10, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i11 = size / iMin;
        } else {
            i11 = (size / iMin) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * iMin;
            String strJpo = jpo(TextUtils.join("','", list.subList(i13, Math.min(i13 + iMin, size))), "");
            if (i12 != 0) {
                sb2.append(str3);
            }
            a.B(sb2, str, str2, "('", strJpo);
            sb2.append("')");
        }
        return jpo(sb2.toString(), i.d(str, str2, "('')"));
    }

    private static String jpo(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
