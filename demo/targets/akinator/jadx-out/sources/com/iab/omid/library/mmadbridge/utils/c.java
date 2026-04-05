package com.iab.omid.library.mmadbridge.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.mmadbridge.adsession.OutputDeviceStatus;
import com.iab.omid.library.mmadbridge.walking.a;
import com.ironsource.C3191e4;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f31102a;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f31103b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f31104c = Resources.getSystem().getDisplayMetrics().density;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31105a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f31105a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final float f31106a;

        /* renamed from: b, reason: collision with root package name */
        final float f31107b;

        public b(float f10, float f11) {
            this.f31106a = f10;
            this.f31107b = f11;
        }
    }

    public static float a(int i10) {
        return i10 / f31104c;
    }

    public static void b(JSONObject jSONObject) throws JSONException {
        b bVarA = a(jSONObject);
        try {
            jSONObject.put("width", bVarA.f31106a);
            jSONObject.put("height", bVarA.f31107b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!jSONArrayOptJSONArray.optString(i10, "").equals(jSONArrayOptJSONArray2.optString(i10, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.w(jSONObject2, "hasWindowFocus", Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.w(jSONObject2, "noOutputDevice", Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f31103b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }

    private static b a(JSONObject jSONObject) {
        float fA;
        float fA2;
        if (f31102a != null) {
            Point point = new Point(0, 0);
            f31102a.getDefaultDisplay().getRealSize(point);
            fA = a(point.x);
            fA2 = a(point.y);
        } else {
            fA = 0.0f;
            fA2 = 0.0f;
        }
        return new b(fA, fA2);
    }

    public static void b(JSONObject jSONObject, Boolean bool) throws JSONException {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e10) {
                d.a("Error with setting is picture-in-picture active", e10);
            }
        }
    }

    public static JSONObject a(int i10, int i11, int i12, int i13) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i10));
            jSONObject.put("y", a(i11));
            jSONObject.put("width", a(i12));
            jSONObject.put("height", a(i13));
            return jSONObject;
        } catch (JSONException e10) {
            d.a("Error with creating viewStateObject", e10);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            d.a("Error with setting not visible reason", e10);
        }
    }

    public static void a(Context context) {
        if (context != null) {
            f31104c = context.getResources().getDisplayMetrics().density;
            f31102a = (WindowManager) context.getSystemService("window");
        }
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!h(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) throws JSONException {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e10) {
            d.a("Error with setting output device status", e10);
        }
    }

    public static void a(JSONObject jSONObject, a.C0195a c0195a) throws JSONException {
        com.iab.omid.library.mmadbridge.internal.e eVarA = c0195a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c0195a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", eVarA.d());
            jSONObject.put("friendlyObstructionPurpose", eVarA.b());
            jSONObject.put("friendlyObstructionReason", eVarA.a());
        } catch (JSONException e10) {
            d.a("Error with setting friendly obstruction", e10);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) throws JSONException {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e10) {
            d.a("Error with setting has window focus", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            d.a("Error with setting ad session id", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            d.a("JSONException during JSONObject.put for name [" + str + C3191e4.i.f36531e, e10);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f31105a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
