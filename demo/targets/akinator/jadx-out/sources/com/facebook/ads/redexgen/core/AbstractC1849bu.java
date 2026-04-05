package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1849bu {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1848bt>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1848bt>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1848bt A01(C1937dL c1937dL, AbstractC2212hy abstractC2212hy, int i10, InterfaceC1846br interfaceC1846br) throws JSONException {
        C1848bt c1848bt = new C1848bt(c1937dL, abstractC2212hy, c1937dL.A02().A0A(), i10);
        c1848bt.A0b(interfaceC1846br);
        c1848bt.A0X();
        A01.put(abstractC2212hy.A17(), new WeakReference<>(c1848bt));
        return c1848bt;
    }

    public static C1848bt A02(String str) {
        WeakReference<C1848bt> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2212hy abstractC2212hy, C1848bt c1848bt) {
        A01.put(abstractC2212hy.A17(), new WeakReference<>(c1848bt));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
