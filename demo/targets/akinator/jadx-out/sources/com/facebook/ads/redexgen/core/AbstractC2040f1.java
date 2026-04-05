package com.facebook.ads.redexgen.core;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.f1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2040f1 {
    public static String[] A00 = {"GvbI", "ZazQ", "jGVKLNF9IyZZC6yZD7vUdND", "cIibDuYBy4iZiWhBa7aDKVcHYQepg0dA", "kp8Ba6lLXDz7KYAXK4DvfF3NzckJKvFL", "SSvAaaHsDdE6RjWizyVCXkVcp0DozyD6", "SP8di31m2uLOcP53jnkdZfwtPUUyGlI0", "zoV6YIxZR0JxBorwnPIpT"};

    /* JADX WARN: Incorrect condition in loop: B:7:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(org.json.JSONArray r4, org.json.JSONArray r5) {
        /*
            int r1 = r4.length()
            int r0 = r5.length()
            r3 = 0
            if (r1 == r0) goto Lc
            return r3
        Lc:
            r2 = 0
        Ld:
            int r0 = r4.length()
            if (r2 >= r0) goto L28
            com.facebook.ads.redexgen.X.f0 r1 = com.facebook.ads.redexgen.core.EnumC2039f0.A00(r4, r2)
            com.facebook.ads.redexgen.X.f0 r0 = com.facebook.ads.redexgen.core.EnumC2039f0.A00(r5, r2)
            if (r1 == r0) goto L1e
            return r3
        L1e:
            boolean r0 = r1.A06(r4, r5, r2)
            if (r0 != 0) goto L25
            return r3
        L25:
            int r2 = r2 + 1
            goto Ld
        L28:
            r3 = 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC2040f1.A00
            r0 = 5
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 10
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L4a
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC2040f1.A00
            java.lang.String r1 = "kAUv4Go12E5I6bj9gVym2"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "RoQebNbND8hZkGW6Dl9KhdG"
            r0 = 2
            r2[r0] = r1
            return r3
        L4a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2040f1.A00(org.json.JSONArray, org.json.JSONArray):boolean");
    }

    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        EnumC2039f0 enumC2039f0A01;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (A00[3].charAt(27) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[1] = "ADTX";
            strArr[0] = "wJhB";
            String str = next;
            if (!jSONObject2.has(str) || (enumC2039f0A01 = EnumC2039f0.A01(jSONObject, str)) != EnumC2039f0.A01(jSONObject2, str) || !enumC2039f0A01.A08(jSONObject, jSONObject2, str)) {
                return false;
            }
        }
        String[] strArr2 = A00;
        String key = strArr2[7];
        if (key.length() == strArr2[2].length()) {
            throw new RuntimeException();
        }
        A00[4] = "f4NlNCElPjJB5pPYNhX2WTR6iFmKnfGM";
        return true;
    }
}
