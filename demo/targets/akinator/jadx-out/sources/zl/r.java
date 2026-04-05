package zl;

import android.text.TextUtils;
import io.bidmachine.AdsFormat;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class r {
    public static q create(JSONObject jSONObject) {
        s sVar;
        Map<String, String> map;
        try {
            AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(jSONObject.getString("format"));
            if (adsFormatByRemoteName == null) {
                return null;
            }
            String string = jSONObject.getString("ad_unit_id");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("units");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    map = nm.j.toMap(jSONArray.getJSONObject(i10));
                } catch (Throwable unused) {
                }
                if (!map.isEmpty()) {
                    String str = map.get("score");
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get("price");
                        if (!TextUtils.isEmpty(str2)) {
                            sVar = new s(string, Float.parseFloat(str), Float.parseFloat(str2), map);
                        }
                        arrayList.add(sVar);
                    }
                }
                sVar = null;
                arrayList.add(sVar);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new q(adsFormatByRemoteName, arrayList, jSONObject.optInt("cache_size", 2));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
