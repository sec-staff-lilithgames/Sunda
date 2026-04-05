package com.amazon.device.ads;

import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class MraidCommand {
    public static HashMap<String, Class> commandRepository = new HashMap<>();

    public static Class<MraidCommand> findMraidCommandByName(String str) {
        return commandRepository.get(str);
    }

    public static Map<String, String> parseQueryString(String str) {
        String[] strArrSplit = str.split(C3191e4.i.f36527c);
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf > 0 && iIndexOf < str2.length() - 1) {
                map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
            }
        }
        return map;
    }

    public static void registerCommand(String str, Class cls) {
        commandRepository.put(str, cls);
    }

    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
    }

    public abstract String getName();
}
