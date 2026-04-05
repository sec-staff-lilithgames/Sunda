package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements com.fyber.inneractive.sdk.cache.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23260a = false;

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        String str = IAConfigManager.O.f23208c;
        StringBuilder sb2 = new StringBuilder(DtbConstants.HTTPS);
        int i10 = k.f23321a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (TextUtils.isEmpty(property)) {
            sb2.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb2.append(property);
        }
        sb2.append(str);
        sb2.append('/');
        sb2.append(str);
        sb2.append(".json");
        String string = sb2.toString();
        IAlog.d("%s: %s", "APP_CONFIG_REQUEST", string);
        return string;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        String string = com.fyber.inneractive.sdk.util.o.f26796a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(IAConfigManager.O.f23208c);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        h0 h0Var = (h0) obj;
        if (h0Var == null || h0Var.f23312a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.o.f26796a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", h0Var.f23312a).apply();
    }

    public final void a(String str, Throwable th2) {
        String strSubstring;
        String name;
        String localizedMessage;
        if (this.f23260a) {
            return;
        }
        this.f23260a = true;
        if (!TextUtils.isEmpty(str)) {
            strSubstring = str.length() > 501 ? str.substring(0, 500) : str.substring(0, str.length() - 1);
        } else {
            strSubstring = "Empty Json Data";
        }
        String str2 = strSubstring;
        if (th2 != null) {
            name = th2.getClass().getName();
            localizedMessage = th2.getLocalizedMessage();
        } else {
            name = "Bad remote configuration";
            localizedMessage = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
        }
        String str3 = name;
        String str4 = IAConfigManager.O.f23208c;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FATAL_CONFIGURATION_ERROR);
        if (localizedMessage == null) {
            localizedMessage = "No message";
        }
        String str5 = localizedMessage;
        if (TextUtils.isEmpty(str4)) {
            str4 = "EMPTY_APP_ID";
        }
        wVar.a(gjnZrsdA.HPXBhJq, str3, PglCryptUtils.KEY_MESSAGE, str5, "data", str2, "appId", str4).a((String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h0 a(com.fyber.inneractive.sdk.config.remote.e eVar) {
        boolean z10;
        h0 h0Var;
        Iterator it;
        HashMap map;
        String str;
        HashMap map2;
        q0 q0Var;
        ArrayList arrayList;
        UnitDisplayType unitDisplayType;
        Integer num;
        Boolean bool;
        UnitDisplayType unitDisplayType2;
        String strB;
        com.fyber.inneractive.sdk.config.remote.e eVar2 = eVar;
        char c10 = 1;
        int i10 = 0;
        h0 h0Var2 = new h0();
        h0Var2.f23314c = eVar2.f23363c;
        com.fyber.inneractive.sdk.config.remote.a aVar = eVar2.f23361a;
        h0Var2.f23313b = aVar.f23351b;
        h0Var2.f23312a = aVar.f23350a;
        Iterator it2 = eVar2.f23362b.iterator();
        while (it2.hasNext()) {
            com.fyber.inneractive.sdk.config.remote.h hVar = (com.fyber.inneractive.sdk.config.remote.h) it2.next();
            HashMap map3 = h0Var2.f23315d;
            String str2 = hVar.f23365a;
            com.fyber.inneractive.sdk.config.remote.a aVar2 = eVar2.f23361a;
            HashMap map4 = h0Var2.f23316e;
            j0 j0Var = h0Var2.f23317f;
            q0 q0Var2 = new q0();
            int i11 = 2;
            int i12 = i10;
            com.fyber.inneractive.sdk.config.remote.c[] cVarArr = new com.fyber.inneractive.sdk.config.remote.c[2];
            cVarArr[i12] = aVar2;
            cVarArr[c10] = hVar;
            int i13 = i12;
            while (true) {
                if (i13 >= i11) {
                    z10 = 1;
                    break;
                }
                com.fyber.inneractive.sdk.config.remote.c cVar = cVarArr[i13];
                if (cVar != null && (strB = cVar.b()) != null && strB.equals("false")) {
                    z10 = i12;
                    break;
                }
                i13++;
                i11 = 2;
            }
            q0Var2.f23342b = z10;
            Iterator it3 = hVar.f23371g.iterator();
            while (it3.hasNext()) {
                com.fyber.inneractive.sdk.config.remote.i iVar = (com.fyber.inneractive.sdk.config.remote.i) it3.next();
                r0 r0Var = new r0();
                String str3 = iVar.f23372a;
                if (str3 != null) {
                    Iterator it4 = it3;
                    String str4 = iVar.f23373b;
                    if (str4 == null) {
                        it3 = it4;
                    } else {
                        r0Var.f23343a = str3;
                        r0Var.f23344b = str4;
                        com.fyber.inneractive.sdk.config.remote.b bVar = iVar.f23374c;
                        if (bVar != null) {
                            com.fyber.inneractive.sdk.config.remote.b bVar2 = hVar.f23367c;
                            h0Var = h0Var2;
                            com.fyber.inneractive.sdk.config.remote.b bVar3 = aVar2.f23354e;
                            it = it2;
                            l0 l0Var = new l0();
                            map = map3;
                            UnitDisplayType unitDisplayType3 = bVar.f23357a;
                            str = str2;
                            if (unitDisplayType3 == UnitDisplayType.BANNER || unitDisplayType3 == UnitDisplayType.MRECT || unitDisplayType3.isFullscreenUnit()) {
                                l0Var.f23330b = bVar.f23357a;
                                Integer num2 = bVar.f23359c;
                                Integer num3 = bVar2 != null ? bVar2.f23359c : null;
                                if (bVar3 != null) {
                                    map2 = map4;
                                    num = bVar3.f23359c;
                                } else {
                                    map2 = map4;
                                    num = null;
                                }
                                Integer num4 = (Integer) a((Object) null, num2, num3, num);
                                if (num4 != null && num4.intValue() >= 5 && num4.intValue() <= 60) {
                                    l0Var.f23329a = num4;
                                }
                                Boolean bool2 = Boolean.TRUE;
                                Boolean bool3 = bVar.f23358b;
                                Boolean bool4 = bVar2 != null ? bVar2.f23358b : null;
                                if (bVar3 != null) {
                                    q0Var = q0Var2;
                                    bool = bVar3.f23358b;
                                } else {
                                    q0Var = q0Var2;
                                    bool = null;
                                }
                                Boolean bool5 = (Boolean) a(bool2, bool3, bool4, bool);
                                bool5.getClass();
                                l0Var.f23331c = bool5;
                                Integer num5 = (Integer) a((Object) null, bVar.f23360d, bVar2 != null ? bVar2.f23360d : null, bVar3 != null ? bVar3.f23360d : null);
                                if (num5 != null && num5.intValue() >= 5 && num5.intValue() <= 60) {
                                    l0Var.f23332d = num5;
                                }
                                if (l0Var.f23332d == null && !l0Var.f23331c.booleanValue() && ((unitDisplayType2 = bVar.f23357a) == UnitDisplayType.INTERSTITIAL || unitDisplayType2 == UnitDisplayType.REWARDED)) {
                                    l0Var.f23331c = bool2;
                                }
                                r0Var.f23345c = l0Var;
                            } else {
                                it3 = it4;
                                h0Var2 = h0Var;
                                it2 = it;
                                map3 = map;
                                str2 = str;
                            }
                        } else {
                            h0Var = h0Var2;
                            it = it2;
                            map = map3;
                            str = str2;
                            map2 = map4;
                            q0Var = q0Var2;
                        }
                        com.fyber.inneractive.sdk.config.remote.j jVar = iVar.f23377f;
                        if (jVar != null || iVar.f23376e != null) {
                            if (jVar != null) {
                                UnitDisplayType unitDisplayType4 = jVar.f23388j;
                                UnitDisplayType unitDisplayType5 = UnitDisplayType.REWARDED;
                                if (unitDisplayType4 == unitDisplayType5 && iVar.f23374c == null) {
                                    l0 l0Var2 = new l0();
                                    r0Var.f23345c = l0Var2;
                                    l0Var2.f23331c = Boolean.FALSE;
                                    l0Var2.f23332d = -1;
                                    l0 l0Var3 = r0Var.f23345c;
                                    l0Var3.f23330b = unitDisplayType5;
                                    l0Var3.f23329a = -1;
                                }
                            }
                            t0 t0Var = new t0();
                            com.fyber.inneractive.sdk.config.remote.j jVar2 = iVar.f23377f;
                            com.fyber.inneractive.sdk.config.remote.j jVar3 = hVar.f23369e;
                            com.fyber.inneractive.sdk.config.remote.j jVar4 = aVar2.f23353d;
                            if (jVar2 != null && ((unitDisplayType = jVar2.f23388j) == UnitDisplayType.LANDSCAPE || unitDisplayType == UnitDisplayType.SQUARE || unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.VERTICAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.MRECT)) {
                                t0Var.f23408j = unitDisplayType;
                            } else if (iVar.f23376e != null) {
                                t0Var.f23408j = UnitDisplayType.NATIVE;
                                r0Var.f23347e = new p0();
                            } else {
                                it3 = it4;
                                h0Var2 = h0Var;
                                it2 = it;
                                map3 = map;
                                str2 = str;
                                map4 = map2;
                                q0Var2 = q0Var;
                            }
                            Object objA = a((Object) null, jVar2 != null ? jVar2.f23379a : null, jVar3 != null ? jVar3.f23379a : null, jVar4 != null ? jVar4.f23379a : null);
                            if (objA != null) {
                                t0Var.f23399a = (Boolean) objA;
                                t0Var.f23400b = (Integer) a((Object) 5000, jVar2 != null ? jVar2.f23380b : null, jVar3 != null ? jVar3.f23380b : null, jVar4 != null ? jVar4.f23380b : null);
                                Integer num6 = (Integer) a((Object) 0, jVar2 != null ? jVar2.f23381c : null, jVar3 != null ? jVar3.f23381c : null, jVar4 != null ? jVar4.f23381c : null);
                                t0Var.f23401c = Integer.valueOf(num6.intValue() < 0 ? i12 : num6.intValue());
                                t0Var.f23402d = (Boolean) a(Boolean.TRUE, jVar2 != null ? jVar2.f23383e : null, jVar3 != null ? jVar3.f23383e : null, jVar4 != null ? jVar4.f23383e : null);
                                t0Var.f23403e = (Orientation) a(Orientation.USER, jVar2 != null ? jVar2.f23385g : null, jVar3 != null ? jVar3.f23385g : null, jVar4 != null ? jVar4.f23385g : null);
                                Integer num7 = (Integer) a((Object) 0, jVar2 != null ? jVar2.f23387i : null, jVar3 != null ? jVar3.f23387i : null, jVar4 != null ? jVar4.f23387i : null);
                                t0Var.f23404f = Integer.valueOf(num7.intValue() < 0 ? i12 : num7.intValue());
                                Integer num8 = (Integer) a((Object) 2048, jVar2 != null ? jVar2.f23386h : null, jVar3 != null ? jVar3.f23386h : null, jVar4 != null ? jVar4.f23386h : null);
                                if (num8.intValue() > t0Var.f23400b.intValue()) {
                                    num8 = t0Var.f23400b;
                                }
                                t0Var.f23405g = num8;
                                t0Var.f23406h = (Skip) a(Skip._0, jVar2 != null ? jVar2.f23382d : null, jVar3 != null ? jVar3.f23382d : null, jVar4 != null ? jVar4.f23382d : null);
                                t0Var.f23407i = (TapAction) a(TapAction.DO_NOTHING, jVar2 != null ? jVar2.f23384f : null, jVar3 != null ? jVar3.f23384f : null, jVar4 != null ? jVar4.f23384f : null);
                                ArrayList arrayList2 = new ArrayList();
                                com.fyber.inneractive.sdk.config.remote.d[] dVarArr = new com.fyber.inneractive.sdk.config.remote.d[1];
                                dVarArr[i12] = iVar;
                                com.fyber.inneractive.sdk.config.remote.j jVarA = dVarArr[i12].a();
                                if (jVarA != null && (arrayList = jVarA.f23389k) != null && arrayList.size() > 0) {
                                    arrayList2 = jVarA.f23389k;
                                }
                                t0Var.f23409k = arrayList2;
                                r0Var.f23348f = t0Var;
                            } else {
                                it3 = it4;
                                h0Var2 = h0Var;
                                it2 = it;
                                map3 = map;
                                str2 = str;
                                map4 = map2;
                                q0Var2 = q0Var;
                            }
                        }
                        o0 o0Var = new o0();
                        HashSet hashSet = new HashSet();
                        com.fyber.inneractive.sdk.config.remote.f fVar = iVar.f23375d;
                        Set set = fVar != null ? fVar.f23364a : null;
                        com.fyber.inneractive.sdk.config.remote.f fVar2 = hVar.f23368d;
                        Set set2 = fVar2 != null ? fVar2.f23364a : null;
                        com.fyber.inneractive.sdk.config.remote.f fVar3 = aVar2.f23352c;
                        o0Var.f23338a = (Set) a(hashSet, set, set2, fVar3 != null ? fVar3.f23364a : null);
                        r0Var.f23346d = o0Var;
                        u0 u0Var = new u0();
                        com.fyber.inneractive.sdk.config.remote.k kVar = iVar.f23378g;
                        com.fyber.inneractive.sdk.config.remote.k kVar2 = hVar.f23370f;
                        com.fyber.inneractive.sdk.config.remote.k kVar3 = aVar2.f23355f;
                        Integer num9 = (Integer) a((Object) 1, kVar != null ? kVar.f23390a : null, kVar2 != null ? kVar2.f23390a : null, kVar3 != null ? kVar3.f23390a : null);
                        if (num9.intValue() <= 0 && num9.intValue() > 100) {
                            u0Var.f23411a = 1;
                        } else {
                            u0Var.f23411a = num9;
                        }
                        Integer num10 = (Integer) a((Object) 0, kVar != null ? kVar.f23391b : null, kVar2 != null ? kVar2.f23391b : null, kVar3 != null ? kVar3.f23391b : null);
                        if (num10.intValue() < 0 && num10.intValue() > 100) {
                            u0Var.f23412b = 0;
                        } else {
                            u0Var.f23412b = num10;
                        }
                        Set<Vendor> set3 = (Set) a(new HashSet(), kVar != null ? kVar.f23392c : null, kVar2 != null ? kVar2.f23392c : null, kVar3 != null ? kVar3.f23392c : null);
                        u0Var.f23413c = set3;
                        r0Var.f23349g = u0Var;
                        if (j0Var != null && set3 != null) {
                            for (Vendor vendor : set3) {
                                if (vendor != null && !j0Var.f23320a.contains(vendor)) {
                                    j0Var.f23320a.add(vendor);
                                }
                            }
                        }
                        q0 q0Var3 = q0Var;
                        q0Var3.f23341a.add(r0Var);
                        HashMap map5 = map2;
                        map5.put(r0Var.f23343a, r0Var);
                        q0Var2 = q0Var3;
                        map4 = map5;
                        it3 = it4;
                        h0Var2 = h0Var;
                        it2 = it;
                        map3 = map;
                        str2 = str;
                    }
                }
            }
            map3.put(str2, q0Var2);
            eVar2 = eVar;
            c10 = 1;
            i10 = i12;
            it2 = it2;
        }
        return h0Var2;
    }

    public static Object a(Object obj, Object... objArr) {
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        try {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            iAConfigManager.D.f();
            com.fyber.inneractive.sdk.config.remote.e eVarA = com.fyber.inneractive.sdk.config.remote.e.a(new JSONObject(str));
            String str2 = iAConfigManager.f23208c;
            if (eVarA != null && str2.equals(eVarA.f23361a.f23350a)) {
                return a(eVarA);
            }
            IAlog.b("internal error while parsing local configuration", new Object[0]);
            if (eVarA != null && !str2.equals(eVarA.f23361a.f23350a)) {
                throw new InvalidAppIdException();
            }
            a(str, (Throwable) null);
            return null;
        } catch (Throwable th2) {
            a(str, th2);
            IAlog.b("Exception Error while parsing local configuration", new Object[0]);
            throw th2;
        }
    }
}
