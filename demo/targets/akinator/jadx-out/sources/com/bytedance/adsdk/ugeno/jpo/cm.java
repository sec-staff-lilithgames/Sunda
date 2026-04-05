package com.bytedance.adsdk.ugeno.jpo;

import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.jpo.wqx;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static Interpolator jd(String str) {
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    return new AccelerateInterpolator();
                }
                break;
            case -1102672091:
                str.equals("linear");
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    return new DecelerateInterpolator();
                }
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    return new AccelerateDecelerateInterpolator();
                }
                break;
        }
        return new LinearInterpolator();
    }

    public static int jpo(int i10) {
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return Integer.MIN_VALUE;
        }
        return i10 - 1;
    }

    public static float[] wqx(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray jSONArrayJpo = com.bytedance.adsdk.ugeno.qk.jd.jpo(str, (JSONArray) null);
        if (jSONArrayJpo != null && jSONArrayJpo.length() == 2) {
            fArr[0] = (float) jSONArrayJpo.optDouble(0);
            fArr[1] = (float) jSONArrayJpo.optDouble(1);
        }
        return fArr;
    }

    public static List<wqx> jpo(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(jpo(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static wqx.jpo jd(String str, JSONObject jSONObject) {
        JSONArray jSONArrayJpo;
        if (TextUtils.isEmpty(str) || (jSONArrayJpo = com.bytedance.adsdk.ugeno.qk.jd.jpo(str, (JSONArray) null)) == null || jSONArrayJpo.length() != 2) {
            return null;
        }
        wqx.jpo jpoVar = new wqx.jpo();
        jpoVar.jpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONArrayJpo.optString(0), jSONObject);
        jpoVar.f17915jd = com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONArrayJpo.optString(1), jSONObject);
        return jpoVar;
    }

    public static wqx jpo(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        wqx wqxVar = new wqx();
        wqxVar.jd(com.bytedance.adsdk.ugeno.qk.wqx.jpo(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString("delay"), jSONObject2), 0L));
        wqxVar.wqx(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString("name"), jSONObject2));
        wqxVar.jd(com.bytedance.adsdk.ugeno.qk.wqx.jpo(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString("playState"), jSONObject2), 1));
        wqxVar.jpo(Math.max(com.bytedance.adsdk.ugeno.qk.wqx.jpo(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString(IronSourceConstants.EVENTS_DURATION), jSONObject2), 0L), 0L));
        wqxVar.jpo(com.bytedance.adsdk.ugeno.qk.wqx.jpo(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString("playCount"), jSONObject2), 1));
        wqxVar.jpo(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString("playDirection"), jSONObject2));
        wqxVar.jpo(jd(jSONObject.optString("transformOrigin"), jSONObject2));
        wqxVar.jd(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        wqxVar.jpo(jSONObject.optJSONObject("effect"));
        wqxVar.jpo(jpo(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return wqxVar;
    }

    public static Map<String, TreeMap<Float, String>> jpo(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("offset");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, "offset")) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObjectOptJSONObject.optString(next), jSONObject));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObjectOptJSONObject.optString(next), jSONObject));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static int jpo(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1408024454) {
            return str.equals("alternate") ? 2 : 1;
        }
        if (iHashCode != -1039745817) {
            return 1;
        }
        str.equals("normal");
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int jpo(String str, int i10) {
        int i11 = i10 / 2;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "bottom":
                case "right":
                    return i10;
                case "center":
                    break;
                case "top":
                case "left":
                    return 0;
                default:
                    if (str.endsWith("%")) {
                        try {
                            return (int) ((i10 * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                        } catch (NumberFormatException unused) {
                            break;
                        }
                    } else {
                        try {
                            return Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                            return i11;
                        }
                    }
            }
        }
        return i11;
    }
}
