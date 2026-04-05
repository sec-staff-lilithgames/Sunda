package io.bidmachine;

import android.content.Context;
import android.content.res.AssetManager;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class j3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f60570a = {"network", "format", "ad_units"};

    public static NetworkConfig a(Context context, String str, Map map) {
        h3 h3VarA;
        AssetManager assets;
        ConcurrentHashMap concurrentHashMap = g3.f60365a;
        if (concurrentHashMap.containsKey(str)) {
            h3VarA = (h3) concurrentHashMap.get(str);
        } else {
            try {
                assets = context.getAssets();
            } catch (Exception unused) {
            }
            h3VarA = assets == null ? null : g3.a(assets, str + ".bmnetwork");
        }
        if (h3VarA == null) {
            return null;
        }
        try {
            Constructor<?> constructor = Class.forName(h3VarA.getClasspath()).getConstructor(Map.class);
            if (map != null) {
                try {
                    String[] strArr = f60570a;
                    for (int i10 = 0; i10 < 3; i10++) {
                        map.remove(strArr[i10]);
                    }
                } catch (Exception unused2) {
                }
            }
            return (NetworkConfig) constructor.newInstance(map);
        } catch (Throwable th2) {
            nm.a.d(new m0(str, 10));
            nm.a.w(th2);
            return null;
        }
    }

    public static NetworkConfig b(Context context, JSONObject jSONObject) {
        String string;
        if (context != null) {
            try {
                string = jSONObject.getString("network");
            } catch (Throwable th2) {
                th = th2;
                string = null;
            }
            try {
                NetworkConfig networkConfigA = a(context, string, nm.j.toMap(jSONObject));
                if (networkConfigA != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("ad_units");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(jSONObject2.getString("format"));
                        if (adsFormatByRemoteName != null) {
                            Map<String, String> map = nm.j.toMap(jSONObject2);
                            if (map != null) {
                                try {
                                    String[] strArr = f60570a;
                                    for (int i11 = 0; i11 < 3; i11++) {
                                        map.remove(strArr[i11]);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            networkConfigA.withMediationConfig(adsFormatByRemoteName, map);
                        } else {
                            nm.a.d(new m0(string, 8));
                        }
                    }
                    nm.a.d(new u0(networkConfigA, 3));
                    return networkConfigA;
                }
            } catch (Throwable th3) {
                th = th3;
                nm.a.d(new m0(string, 9));
                nm.a.w(th);
                return null;
            }
        }
        return null;
    }
}
