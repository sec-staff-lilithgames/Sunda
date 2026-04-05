package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f60330a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f60331b;

    /* renamed from: c, reason: collision with root package name */
    public static a0 f60332c;

    /* renamed from: d, reason: collision with root package name */
    public static AdvertisingDataManager$AdvertisingData f60333d;

    /* renamed from: e, reason: collision with root package name */
    public static String f60334e;

    static {
        ArrayList arrayList = new ArrayList(2);
        f60331b = arrayList;
        arrayList.add(new b0());
        arrayList.add(new c0());
    }

    public static String a(Context context, boolean z10) {
        if (z10) {
            return "00000000-0000-0000-0000-000000000000";
        }
        AdvertisingDataManager$AdvertisingData advertisingDataManager$AdvertisingData = f60333d;
        String id2 = advertisingDataManager$AdvertisingData != null ? advertisingDataManager$AdvertisingData.getId() : null;
        if (!TextUtils.isEmpty(id2) && !"00000000-0000-0000-0000-000000000000".equals(id2)) {
            return id2;
        }
        if (!TextUtils.isEmpty(f60334e)) {
            return f60334e;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ad_core_preferences", 0);
        String strOptString = pr.m.optString(sharedPreferences, "uuid", null);
        f60334e = strOptString;
        if (!TextUtils.isEmpty(strOptString)) {
            return f60334e;
        }
        f60334e = f60330a;
        sharedPreferences.edit().putString("uuid", f60334e).apply();
        return f60334e;
    }

    public static void b(Context context) {
        a0 a0Var = f60332c;
        if (a0Var != null) {
            AdvertisingDataManager$AdvertisingData advertisingDataManager$AdvertisingDataRetrieve = a0Var.retrieve(context);
            if (advertisingDataManager$AdvertisingDataRetrieve != null) {
                f60333d = advertisingDataManager$AdvertisingDataRetrieve;
                return;
            }
            return;
        }
        Iterator it = f60331b.iterator();
        while (it.hasNext()) {
            a0 a0Var2 = (a0) it.next();
            AdvertisingDataManager$AdvertisingData advertisingDataManager$AdvertisingDataRetrieve2 = a0Var2.retrieve(context);
            if (advertisingDataManager$AdvertisingDataRetrieve2 != null) {
                f60332c = a0Var2;
                f60333d = advertisingDataManager$AdvertisingDataRetrieve2;
                return;
            }
        }
    }
}
