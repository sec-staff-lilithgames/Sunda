package com.bytedance.sdk.openadsdk.multipro.jpo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.jj.jpo.jj;
import com.bytedance.sdk.openadsdk.core.my;
import com.bytedance.sdk.openadsdk.multipro.cm;
import j1.o2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Object> f21290jd = new ConcurrentHashMap<>();
    public static jj jpo;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.component.jj.jpo.jj jpo(android.content.Context r1) {
        /*
            if (r1 != 0) goto L5
            com.bytedance.sdk.openadsdk.core.sq.jpo()     // Catch: java.lang.Throwable -> L26
        L5:
            com.bytedance.sdk.component.jj.jpo.jj r1 = com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L2b
            boolean r1 = com.bytedance.sdk.openadsdk.multipro.jd.wqx()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1f
            com.bytedance.sdk.openadsdk.multipro.aidl.jpo r1 = com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo()     // Catch: java.lang.Throwable -> L26
            r0 = 5
            android.os.IBinder r1 = r1.jpo(r0)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.component.jj.jpo.jj r1 = com.bytedance.sdk.component.jj.jpo.jj.jpo.jpo(r1)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L1f:
            com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jj r1 = com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jj.jd()     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            java.lang.String r1 = "binder error"
            com.bytedance.sdk.openadsdk.utils.tic.xyk(r1)
        L2b:
            com.bytedance.sdk.component.jj.jpo.jj r1 = com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(android.content.Context):com.bytedance.sdk.component.jj.jpo.jj");
    }

    private static String jpo() {
        return o2.o(new StringBuilder(), cm.f21284jd, "/t_db/ttopensdk.db/");
    }

    public static void jpo(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (jpo(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                my.jpo(context).jpo().jpo(str, (String) null, contentValues);
                return;
            }
            jj jjVarJpo = jpo(context);
            if (jjVarJpo != null) {
                jjVarJpo.jpo(Uri.parse(jpo() + str), contentValues);
            }
        }
    }

    public static int jpo(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (jpo(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                return my.jpo(context).jpo().jpo(str, str2, strArr);
            }
            jj jjVarJpo = jpo(context);
            if (jjVarJpo != null) {
                return jjVarJpo.jpo(Uri.parse(jpo() + str), str2, strArr);
            }
            return 0;
        }
    }

    public static int jpo(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (jpo(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    return my.jpo(context).jpo().jpo(str, contentValues, str2, strArr);
                }
                jj jjVarJpo = jpo(context);
                if (jjVarJpo != null) {
                    return jjVarJpo.jpo(Uri.parse(jpo() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> jpo(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (jpo(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                return jpo(my.jpo(context).jpo().jpo(str, strArr, str2, strArr2, str3, str4, str5));
            }
            jj jjVarJpo = jpo(context);
            if (jjVarJpo != null) {
                return jjVarJpo.jpo(Uri.parse(jpo() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    public static Map<String, List<String>> jpo(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return map;
            } catch (Throwable unused) {
                cursor.close();
            }
        }
        return map;
    }

    private static Object jpo(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = f21290jd;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (jpo.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
