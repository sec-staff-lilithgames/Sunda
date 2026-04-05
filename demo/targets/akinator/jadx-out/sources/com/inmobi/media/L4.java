package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class L4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31987a = 0;

    public static final ArrayList a(Context context) {
        File databasePath;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        String[] strArrDatabaseList = context.databaseList();
        if (strArrDatabaseList != null && strArrDatabaseList.length != 0) {
            for (String str : strArrDatabaseList) {
                kotlin.jvm.internal.e0.checkNotNull(str);
                if (new sv.x("com\\.im_([0-9]+\\.){3}db").matches(str)) {
                    int i10 = B3.f31647a;
                    if (!kotlin.jvm.internal.e0.areEqual(str, "com.im_10.8.8.db") && (databasePath = context.getDatabasePath(str)) != null && databasePath.exists() && !context.deleteDatabase(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        kotlin.jvm.internal.e0.checkNotNullParameter("carb_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("aes_key_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("mraid_js_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("omid_js_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("user_info_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("coppa_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("gesture_info_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("display_info_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("unified_id_info_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("app_bundle_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("pub_signals_store", "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter("CrashSession-store", "fileKey");
        Iterator it = uu.p0.listOf((Object[]) new String[]{"com.im.keyValueStore.carb_store", "com.im.keyValueStore.aes_key_store", "com.im.keyValueStore.mraid_js_store", "com.im.keyValueStore.omid_js_store", "com.im.keyValueStore.user_info_store", "com.im.keyValueStore.coppa_store", "com.im.keyValueStore.gesture_info_store", "com.im.keyValueStore.display_info_store", "com.im.keyValueStore.unified_id_info_store", "com.im.keyValueStore.app_bundle_store", "com.im.keyValueStore.pub_signals_store", "com.im.keyValueStore.CrashSession-store"}).iterator();
        while (it.hasNext()) {
            context.deleteSharedPreferences((String) it.next());
        }
        return !a(context).isEmpty();
    }

    public static final void a(File path) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        try {
            if (path.exists()) {
                File[] fileArrListFiles = path.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.isDirectory()) {
                            kotlin.jvm.internal.e0.checkNotNull(file);
                            a(file);
                        } else if (file.delete()) {
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("L4", "TAG");
                            file.getName();
                        }
                    }
                }
                if (path.delete()) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("L4", "TAG");
                    path.getName();
                }
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("L4", "TAG");
        }
    }
}
