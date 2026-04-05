package com.ironsource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3182dd {

    /* renamed from: a, reason: collision with root package name */
    public static final String f36288a = "com.google.market";

    /* renamed from: b, reason: collision with root package name */
    public static final String f36289b = "com.android.vending";

    /* renamed from: c, reason: collision with root package name */
    public static final String f36290c = "isInstalled";

    /* renamed from: d, reason: collision with root package name */
    private static final String f36291d = "dd";

    /* renamed from: e, reason: collision with root package name */
    private static final ArrayList<String> f36292e = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.dd$a */
    public class a extends ArrayList<String> {
        public a() {
            add(C3182dd.f36288a);
            add("com.android.vending");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.dd$b */
    public class b extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f36293a;

        public b(boolean z10) throws JSONException {
            this.f36293a = z10;
            put("isInstalled", z10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.dd$c */
    public enum c {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{C3182dd.f36288a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});


        /* renamed from: h, reason: collision with root package name */
        private static final Map<String, c> f36299h = new HashMap();

        /* renamed from: a, reason: collision with root package name */
        private final int f36301a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f36302b;

        static {
            for (c cVar : values()) {
                for (String str : cVar.d()) {
                    f36299h.put(str, cVar);
                }
            }
        }

        c(int i10, String[] strArr) {
            this.f36301a = i10;
            this.f36302b = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f36301a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String[] d() {
            return this.f36302b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<String> b() {
            return new ArrayList<>(f36299h.keySet());
        }
    }

    private static JSONObject a(Context context) {
        return a(context, f36292e);
    }

    private static ArrayList<String> b(Context context) {
        List<ApplicationInfo> listH = Mb.U().i().H(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : listH) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static Integer c(Context context) throws JSONException {
        JSONObject jSONObjectA = a(context, c.b());
        int iPow = 0;
        for (c cVar : c.values()) {
            String[] strArrD = cVar.d();
            int length = strArrD.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(strArrD[i10]);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                    iPow = (int) (Math.pow(2.0d, r5.c() - 1) + iPow);
                    break;
                }
                i10++;
            }
        }
        return Integer.valueOf(iPow);
    }

    public static boolean d(Context context) {
        JSONObject jSONObjectA = a(context);
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    private static JSONObject a(Context context, ArrayList<String> arrayList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> arrayListB = b(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                jSONObject.put(next, a(arrayListB.contains(next.trim().toLowerCase(Locale.getDefault()))));
            }
            return jSONObject;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            Log.d(f36291d, "Error while extracting packages installation data");
            return jSONObject;
        }
    }

    private static JSONObject a(boolean z10) throws JSONException {
        return new b(z10);
    }
}
