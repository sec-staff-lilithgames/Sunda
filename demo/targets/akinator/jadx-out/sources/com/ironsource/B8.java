package com.ironsource;

import android.content.Context;
import android.util.Pair;
import com.ironsource.C3460t8;
import com.ironsource.C3545y8;
import com.ironsource.I5;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class B8 {
    public static C3545y8 a(Context context, String str, String str2, Map<String, String> map) throws Exception {
        C3545y8.a aVar = new C3545y8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.c(map.get("sessionid"));
        }
        aVar.a(context);
        return aVar.d(str).a(str2).a();
    }

    public static I5 a(JSONObject jSONObject) {
        return new I5.a(jSONObject.optString(G5.f34444r)).b().b(jSONObject.optBoolean("enabled")).a(new C3562z8()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", G5.L));
        arrayList.add(new Pair<>("charset", G5.N));
        return arrayList;
    }

    public static boolean a(Y4 y42) {
        if (y42 == null || y42.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(y42.g().get("inAppBidding"));
    }

    public static C3460t8.e a(Y4 y42, C3460t8.e eVar) {
        if (y42 == null || y42.g() == null || y42.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(y42.g().get("rewarded"))) {
            return C3460t8.e.RewardedVideo;
        }
        return C3460t8.e.Interstitial;
    }
}
