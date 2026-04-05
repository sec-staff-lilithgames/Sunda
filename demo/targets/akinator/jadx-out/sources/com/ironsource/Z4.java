package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C3460t8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Z4 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Y4> f35845a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Y4> f35846b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Y4> f35847c = new LinkedHashMap();

    private Map<String, Y4> b(C3460t8.e eVar) {
        if (eVar.name().equalsIgnoreCase(C3460t8.e.RewardedVideo.name())) {
            return this.f35845a;
        }
        if (eVar.name().equalsIgnoreCase(C3460t8.e.Interstitial.name())) {
            return this.f35846b;
        }
        if (eVar.name().equalsIgnoreCase(C3460t8.e.Banner.name())) {
            return this.f35847c;
        }
        return null;
    }

    public Collection<Y4> a(C3460t8.e eVar) {
        Map<String, Y4> mapB = b(eVar);
        return mapB != null ? mapB.values() : new ArrayList();
    }

    public Y4 a(C3460t8.e eVar, String str) {
        Map<String, Y4> mapB;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null) {
            return null;
        }
        return mapB.get(str);
    }

    private void a(C3460t8.e eVar, String str, Y4 y42) {
        Map<String, Y4> mapB;
        if (TextUtils.isEmpty(str) || y42 == null || (mapB = b(eVar)) == null) {
            return;
        }
        mapB.put(str, y42);
    }

    public void b(C3460t8.e eVar, String str) {
        Map<String, Y4> mapB;
        Y4 y4Remove;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null || (y4Remove = mapB.remove(str)) == null) {
            return;
        }
        y4Remove.a();
    }

    public Y4 a(C3460t8.e eVar, M9 m9) {
        Y4 y42 = new Y4(m9);
        a(eVar, m9.e(), y42);
        return y42;
    }

    public Y4 a(C3460t8.e eVar, String str, Map<String, String> map, Ic ic2) {
        Y4 y42 = new Y4(str, str, map, ic2);
        a(eVar, str, y42);
        return y42;
    }
}
