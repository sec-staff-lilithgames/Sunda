package com.inmobi.media;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.reflect.KProperty;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.rb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2973rb {

    /* renamed from: d, reason: collision with root package name */
    public static C2720cb f33319d;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f33317b = {kotlin.jvm.internal.c1.property1(new kotlin.jvm.internal.s0(C2973rb.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0)), kotlin.jvm.internal.c1.property1(new kotlin.jvm.internal.s0(C2973rb.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final C2973rb f33316a = new C2973rb();

    /* renamed from: c, reason: collision with root package name */
    public static final List f33318c = uu.p0.listOf((Object[]) new String[]{"ban", "int", "rew", "nat"});

    /* renamed from: e, reason: collision with root package name */
    public static final C3099z1 f33320e = new C3099z1((Object) new JSONObject(), (kv.a) C2805hb.f32897a, true, true);

    /* renamed from: f, reason: collision with root package name */
    public static final C3099z1 f33321f = new C3099z1((Object) new JSONObject(), (kv.a) C2855kb.f33020a, true, true);

    /* renamed from: g, reason: collision with root package name */
    public static final ExecutorService f33322g = Executors.newSingleThreadExecutor();

    public static final JSONObject a(C2973rb c2973rb) {
        c2973rb.getClass();
        Context contextD = C2925od.d();
        if (contextD == null) {
            return null;
        }
        f33316a.getClass();
        if (f33319d == null) {
            f33319d = new C2720cb(contextD, "pub_signals_store");
        }
        C2720cb c2720cb = f33319d;
        if (c2720cb == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("prefDao");
            c2720cb = null;
        }
        String strA = c2720cb.a("saved_signals");
        if (strA != null) {
            return new JSONObject(strA);
        }
        return null;
    }

    public static SignalsConfig.PublisherConfig b() {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        return ((SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getPublisherConfig();
    }

    public final LinkedHashMap c() {
        JSONObject jSONObjectA = a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = b().getObj().getAllowedKeysAnd();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = b().getAuto().getAllowedKeys();
        List<String> list = f33318c;
        SignalsConfig.PublisherConfig publisherConfigB = b();
        for (String str : list) {
            AbstractC2990sb.a(AbstractC2990sb.a(AbstractC2990sb.a(linkedHashMap, jSONObjectA, "obj_", str, AbstractC2990sb.b(allowedKeysAnd)), jSONObjectA, "auto_", str, AbstractC2990sb.b(allowedKeys)), jSONObjectA, "dir_", str, publisherConfigB.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final LinkedHashMap d() {
        Object objValueOf;
        Object objValueOf2;
        JSONObject jSONObjectA = a();
        SignalsConfig.PublisherConfig config = b();
        Map map = AbstractC2990sb.f33369a;
        kotlin.jvm.internal.e0.checkNotNullParameter(jSONObjectA, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : config.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (jSONObjectA.has(key)) {
                switch (value.hashCode()) {
                    case -1325958191:
                        if (value.equals("double")) {
                            objValueOf2 = Double.valueOf(jSONObjectA.optDouble(key));
                            kotlin.jvm.internal.e0.checkNotNull(objValueOf2);
                            linkedHashMap.put(key, objValueOf2);
                            break;
                        } else {
                            break;
                        }
                    case -891985903:
                        if (value.equals("string")) {
                            objValueOf2 = jSONObjectA.optString(key);
                            kotlin.jvm.internal.e0.checkNotNull(objValueOf2);
                            linkedHashMap.put(key, objValueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 104431:
                        if (value.equals("int")) {
                            objValueOf2 = Integer.valueOf(jSONObjectA.optInt(key));
                            kotlin.jvm.internal.e0.checkNotNull(objValueOf2);
                            linkedHashMap.put(key, objValueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 3029738:
                        if (value.equals("bool")) {
                            objValueOf2 = Boolean.valueOf(jSONObjectA.optBoolean(key));
                            kotlin.jvm.internal.e0.checkNotNull(objValueOf2);
                            linkedHashMap.put(key, objValueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 3327612:
                        if (value.equals("long")) {
                            objValueOf2 = Long.valueOf(jSONObjectA.optLong(key));
                            kotlin.jvm.internal.e0.checkNotNull(objValueOf2);
                            linkedHashMap.put(key, objValueOf2);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        for (Map.Entry<String, String> entry2 : config.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray(key2);
            if (jSONArrayOptJSONArray != null) {
                String[] strArr = {"ban", "int", "rew", "nat"};
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    StringBuilder sbS = a.b.s(key2, '_');
                    sbS.append(strArr[i10]);
                    String string = sbS.toString();
                    switch (value2.hashCode()) {
                        case -1325958191:
                            if (value2.equals("double")) {
                                objValueOf = Double.valueOf(jSONArrayOptJSONArray.optDouble(i10));
                                kotlin.jvm.internal.e0.checkNotNull(objValueOf);
                                linkedHashMap.put(string, objValueOf);
                                break;
                            } else {
                                break;
                            }
                        case -891985903:
                            if (value2.equals("string")) {
                                objValueOf = jSONArrayOptJSONArray.optString(i10);
                                kotlin.jvm.internal.e0.checkNotNull(objValueOf);
                                linkedHashMap.put(string, objValueOf);
                                break;
                            } else {
                                break;
                            }
                        case 104431:
                            if (value2.equals("int")) {
                                objValueOf = Integer.valueOf(jSONArrayOptJSONArray.optInt(i10));
                                kotlin.jvm.internal.e0.checkNotNull(objValueOf);
                                linkedHashMap.put(string, objValueOf);
                                break;
                            } else {
                                break;
                            }
                        case 3029738:
                            if (value2.equals("bool")) {
                                objValueOf = Boolean.valueOf(jSONArrayOptJSONArray.optBoolean(i10));
                                kotlin.jvm.internal.e0.checkNotNull(objValueOf);
                                linkedHashMap.put(string, objValueOf);
                                break;
                            } else {
                                break;
                            }
                        case 3327612:
                            if (value2.equals("long")) {
                                objValueOf = Long.valueOf(jSONArrayOptJSONArray.optLong(i10));
                                kotlin.jvm.internal.e0.checkNotNull(objValueOf);
                                linkedHashMap.put(string, objValueOf);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public final JSONObject e() {
        JSONObject jSONObjectA = a();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = jSONObjectA.keys();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            kotlin.jvm.internal.e0.checkNotNull(next);
            if (!sv.k0.startsWith$default(next, "obj_", false, 2, null) && !sv.k0.startsWith$default(next, "auto_", false, 2, null) && !sv.k0.startsWith$default(next, "dir_", false, 2, null)) {
                jSONObject.put(next, jSONObjectA.opt(next));
            }
        }
        for (String str : f33318c) {
            f33316a.getClass();
            if (b().getObj().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = b().getObj().getAllowedKeysAnd();
                ArrayList arrayList = new ArrayList(allowedKeysAnd.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                AbstractC2990sb.a(jSONObject, jSONObjectA, str, "obj_", uu.y0.toSet(arrayList));
            }
            f33316a.getClass();
            if (b().getAuto().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = b().getAuto().getAllowedKeys();
                ArrayList arrayList2 = new ArrayList(allowedKeys.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                AbstractC2990sb.a(jSONObject, jSONObjectA, str, "auto_", uu.y0.toSet(arrayList2));
            }
            f33316a.getClass();
            if (b().getDirect().getEnabled()) {
                AbstractC2990sb.a(jSONObject, jSONObjectA, str, "dir_", b().getDirect().getAllowedKeys().keySet());
            }
        }
        for (tu.v vVar : uu.p0.listOf((Object[]) new tu.v[]{tu.e0.to(b().getObj(), "o_i_dep"), tu.e0.to(b().getDirect(), "d_i_dep"), tu.e0.to(b().getAuto(), "a_i_dep")})) {
            SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) vVar.component1();
            String str2 = (String) vVar.component2();
            if (baseInputData.getDepth().getEnabled()) {
                C2973rb c2973rb = f33316a;
                c2973rb.getClass();
                JSONArray jSONArrayOptJSONArray = ((JSONObject) f33321f.getValue(c2973rb, f33317b[1])).optJSONArray(str2);
                if (jSONArrayOptJSONArray == null) {
                    Map map = AbstractC2990sb.f33369a;
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                } else {
                    kotlin.jvm.internal.e0.checkNotNull(jSONArrayOptJSONArray);
                }
                jSONObject.put(str2, jSONArrayOptJSONArray);
            }
        }
        jSONObject.toString();
        return jSONObject;
    }

    public final JSONObject a() {
        return (JSONObject) f33320e.getValue(this, f33317b[0]);
    }

    public static void a(Map signals) {
        kotlin.jvm.internal.e0.checkNotNullParameter(signals, "signals");
        try {
            SignalsConfig.PublisherConfig publisherConfigB = b();
            Map map = AbstractC2990sb.f33369a;
            kotlin.jvm.internal.e0.checkNotNullParameter(publisherConfigB, "<this>");
            if (!publisherConfigB.getEnableMCO() && !publisherConfigB.getEnableAB()) {
                AbstractC2902n7.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
                return;
            }
            ExecutorService executor = f33322g;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(executor, "executor");
            AbstractC2990sb.a(executor, new C2940pb(signals, publisherConfigB), C2957qb.f33291a);
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            AbstractC2902n7.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    public static void a(JSONObject jSONObject) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jSONObject, "<this>");
        Context contextD = C2925od.d();
        if (contextD != null) {
            f33316a.getClass();
            if (f33319d == null) {
                f33319d = new C2720cb(contextD, "pub_signals_store");
            }
            C2720cb c2720cb = f33319d;
            if (c2720cb == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("prefDao");
                c2720cb = null;
            }
            String string = jSONObject.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            c2720cb.a("saved_signals", string, true);
            f33320e.b();
            AbstractC2902n7.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
            jSONObject.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "adFormat"
            kotlin.jvm.internal.e0.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.e0.checkNotNullParameter(r11, r0)
            com.inmobi.media.z1 r1 = com.inmobi.media.C2973rb.f33321f
            r1.b()
            kotlin.reflect.KProperty[] r2 = com.inmobi.media.C2973rb.f33317b
            r3 = 1
            r2 = r2[r3]
            java.lang.Object r2 = r1.getValue(r9, r2)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            org.json.JSONArray r4 = r2.optJSONArray(r11)
            r5 = 0
            if (r4 != 0) goto L34
            java.util.Map r4 = com.inmobi.media.AbstractC2990sb.f33369a
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            r4.put(r5)
            r4.put(r5)
            r4.put(r5)
            r4.put(r5)
        L34:
            int r6 = r10.hashCode()
            r7 = 97295(0x17c0f, float:1.3634E-40)
            r8 = -1
            if (r6 == r7) goto L6f
            r7 = 104431(0x197ef, float:1.46339E-40)
            if (r6 == r7) goto L64
            r7 = 108833(0x1a921, float:1.52508E-40)
            if (r6 == r7) goto L59
            r7 = 112804(0x1b8a4, float:1.58072E-40)
            if (r6 == r7) goto L4e
            goto L77
        L4e:
            java.lang.String r6 = "rew"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L57
            goto L77
        L57:
            r10 = 2
            goto L7a
        L59:
            java.lang.String r6 = "nat"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L62
            goto L77
        L62:
            r10 = 3
            goto L7a
        L64:
            java.lang.String r6 = "int"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L6d
            goto L77
        L6d:
            r10 = r3
            goto L7a
        L6f:
            java.lang.String r6 = "ban"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L79
        L77:
            r10 = r8
            goto L7a
        L79:
            r10 = r5
        L7a:
            if (r10 == r8) goto Lca
            int r5 = r4.optInt(r10, r5)
            int r5 = r5 + r3
            r4.put(r10, r5)
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r10)
            kotlin.jvm.internal.e0.checkNotNullParameter(r11, r0)
            java.lang.String r10 = "value"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r10)
            r2.put(r11, r4)
            android.content.Context r10 = com.inmobi.media.C2925od.d()
            if (r10 == 0) goto Lca
            com.inmobi.media.rb r11 = com.inmobi.media.C2973rb.f33316a
            r11.getClass()
            com.inmobi.media.cb r11 = com.inmobi.media.C2973rb.f33319d
            if (r11 != 0) goto Lac
            com.inmobi.media.cb r11 = new com.inmobi.media.cb
            java.lang.String r0 = "pub_signals_store"
            r11.<init>(r10, r0)
            com.inmobi.media.C2973rb.f33319d = r11
        Lac:
            r2.toString()
            com.inmobi.media.cb r10 = com.inmobi.media.C2973rb.f33319d
            if (r10 != 0) goto Lb9
            java.lang.String r10 = "prefDao"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r10)
            r10 = 0
        Lb9:
            java.lang.String r11 = r2.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r11, r0)
            java.lang.String r0 = "imp_depth"
            r10.a(r0, r11)
            r1.b()
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2973rb.a(java.lang.String, java.lang.String):void");
    }
}
