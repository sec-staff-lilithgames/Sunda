package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2013ea implements InterfaceC1513Rj {
    public static byte[] A03;
    public static String[] A04 = {"1hpByTARN6eOnQ", "46DvCO0dFj9d90pc7Bl3Va1pW3afVu0G", "LtfSHnVMNf9jD1VPw2QJdb6akNXb3KRw", "UXeRQ2HNaneiXsHAoGvRBzblNiVPPyfq", "WcHPi3i27m6LdaHLnkH9ENRpFxyJu3g8", "FTcDokCppzFM6olvGfJVNXVubstDZ8VZ", "v3Z7C81p3UBYKX6nY0MAEeka3DNz7RKw", "vwYfKziuTy1RLYscQHjTEDI4uYjWuvBq"};
    public final InterfaceC2041f2 A01;
    public Set<InterfaceC1516Rm> A00 = new HashSet();
    public final List<InterfaceC1515Rl> A02 = new ArrayList();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{75, 75, 78, 24, 81, 75, 78, 24, 39, 53, 53, 35, 50, 53};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.AAV()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC1516Rm> setA01 = A01(this.A01.A7a());
        if (!this.A00.equals(setA01) && setA01 != null) {
            this.A00 = setA01;
            Iterator<InterfaceC1515Rl> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A4B();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC1516Rm interfaceC1516Rm : this.A00) {
                String.format(Locale.US, A00(0, 8, 58), interfaceC1516Rm.A9G(), interfaceC1516Rm.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C2013ea(InterfaceC1107Bn interfaceC1107Bn) {
        this.A01 = interfaceC1107Bn.A5M(EnumC2042f3.A0B);
        this.A01.A3t(new C2060fM(this));
        A03();
    }

    public static Set<InterfaceC1516Rm> A01(JSONObject jSONObject) {
        C2006eT c2006eTA00;
        HashSet hashSet = new HashSet();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(8, 6, 23));
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            int i11 = jSONArrayOptJSONArray.length();
            if (A04[2].charAt(7) != 'M') {
                throw new RuntimeException();
            }
            A04[0] = "HjevAVNXdTQxpc55Yqf8Zim5Y";
            if (i10 < i11) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject == null || (c2006eTA00 = C2006eT.A00(jSONObjectOptJSONObject)) == null) {
                    return null;
                }
                hashSet.add(c2006eTA00);
                i10++;
            } else {
                return hashSet;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1513Rj
    public final void A3s(InterfaceC1515Rl interfaceC1515Rl) {
        this.A02.add(interfaceC1515Rl);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1513Rj
    public final synchronized Set<InterfaceC1516Rm> A6p() {
        return new HashSet(this.A00);
    }
}
