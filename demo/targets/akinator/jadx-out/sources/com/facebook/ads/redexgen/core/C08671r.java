package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.ads.redexgen.X.1r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08671r implements InterfaceC1107Bn, f7 {
    public static byte[] A0A;
    public static String[] A0B = {"IFN7jxPm5iUVHezzrmxS", "S0eu2eNSRgR", "zAFRaPaLH2briFok", "kmV", "0tQTfhSJ7", "pW9DdJxYDevwUXMYU", "23M9j", "tE9Nw4uJT9AR2sagm"};
    public final SQ A00;
    public final InterfaceC1536Sh A01;
    public final InterfaceC2016ed A02;
    public final InterfaceC2046f8 A03;
    public final C2054fG A04;
    public final InterfaceC2055fH A05;
    public final String A06;
    public final Map<EnumC2042f3, By> A09 = new HashMap();
    public final Map<EnumC2042f3, AbstractC08751z> A08 = new HashMap();
    public final List<InterfaceC2059fL> A07 = new ArrayList();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A04() throws Throwable {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        synchronized (this) {
            for (By by : this.A09.values()) {
                if (by.AAV()) {
                    map.put(by, EnumC2062fO.A05);
                } else {
                    map.put(by, EnumC2062fO.A04);
                }
            }
            new AtomicReference();
            new AtomicReference();
            Iterator<AbstractC08751z> it = this.A08.values().iterator();
            while (it.hasNext()) {
                it.next();
                InterfaceC2041f2 interfaceC2041f2 = null;
                if (interfaceC2041f2.AAV()) {
                    throw new NullPointerException(A01(349, 20, 51));
                }
            }
            Iterator<InterfaceC2059fL> it2 = this.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException(A01(424, 22, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        JSONObject jSONObjectA03 = A03(map, map2, map3, map4);
        String.format(Locale.US, A01(188, 33, 57), this.A06, jSONObjectA03.toString(2));
        this.A02.AGE(this.A06, (A01(327, 8, Sdk.SDKError.Reason.TPAT_ERROR_VALUE) + URLEncoder.encode(jSONObjectA03.toString())).getBytes(), new C1104Bk(this, atomicReference, atomicReference2, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference2.get() != null) {
                throw ((Throwable) atomicReference2.get());
            }
            Set<InterfaceC2058fK> setA02 = A02((JSONObject) atomicReference.get());
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            Iterator<InterfaceC2058fK> it3 = setA02.iterator();
            while (it3.hasNext()) {
                it3.next().A45(map5, map6);
            }
            this.A03.A6T(A00((JSONObject) atomicReference.get()));
            Iterator<InterfaceC2059fL> it4 = this.A07.iterator();
            if (it4.hasNext()) {
                it4.next();
                throw new NullPointerException(A01(401, 23, 20));
            }
        }
    }

    public static void A05() {
        A0A = new byte[]{102, -81, -71, 102, -72, -85, -71, -70, -72, -81, -87, -70, -85, -86, 116, 102, -103, -79, -81, -74, -74, -81, -76, -83, 102, -71, -65, -76, -87, -43, 4, 4, -76, -3, 2, -76, -10, -11, -9, -1, -5, 6, 3, 9, 2, -8, -62, -67, -37, -24, -24, -23, -18, -102, -35, -20, -33, -37, -18, -33, -102, -19, -33, -20, -16, -33, -20, -102, -36, -17, -24, -34, -26, -33, -102, -15, -29, -18, -30, -102, -24, -23, -24, -89, -19, -33, -20, -16, -33, -20, -102, -23, -15, -24, -33, -34, -102, -36, -17, -24, -34, -26, -33, -102, -61, -66, 123, -104, -85, -104, 87, -89, -87, -90, -102, -100, -86, -86, -96, -91, -98, 87, -90, -89, -85, -96, -90, -91, 87, -118, -81, -73, -94, -83, -86, -91, 97, -77, -90, -89, -77, -90, -76, -87, 97, -75, -86, -82, -90, 123, 97, 102, -91, -34, -11, 7, -80, 3, -11, 2, 6, -11, 2, -67, -1, 7, -2, -11, -12, -80, -14, 5, -2, -12, -4, -11, -80, -13, 2, -11, -15, 4, -11, -12, -54, -80, -75, 3, -95, -57, -68, -79, -74, -64, -67, -68, -73, -56, -81, -62, -73, -67, -68, 110, -64, -77, -65, -61, -77, -63, -62, 110, -62, -67, 110, 115, -63, -120, 88, 115, -63, -34, 4, -7, -18, -13, -3, -6, -7, -12, 5, -20, -1, -12, -6, -7, -85, -3, -16, -2, -5, -6, -7, -2, -16, -59, -107, -80, -2, -43, -5, -16, -27, -22, -12, -15, -16, -21, -4, -29, -10, -21, -15, -16, -94, -12, -9, -16, -94, -24, -29, -21, -18, -25, -26, -67, -94, -24, -15, -12, -27, -21, -16, -23, -94, -21, -16, -94, -89, -26, -94, -11, -25, -27, -15, -16, -26, -11, -28, -9, -16, -26, -18, -25, -11, -61, -49, -50, -44, -59, -40, -44, 124, 121, -116, 121, -90, -87, -82, -89, -91, -78, -80, -78, -87, -82, -76, -2, -17, 7, -6, -3, -17, -14, -53, -116, AbstractJsonLexerKt.TC_INVALID, -128, -116, AbstractJsonLexerKt.TC_INVALID, -115, -126, -10, -23, -11, -7, -23, -9, -8, -70, -83, -71, -67, -79, -70, -83, -69, -101, -63, -74, -85, -119, -74, -84, -102, -83, -69, -83, -68, -69, -82, -68, -71, -72, -73, -68, -82, 0, -14, -1, 3, -14, -1, -36, 4, -5, -14, -15, -49, 2, -5, -15, -7, -14, -48, -1, -14, -18, 1, -14, -15, -100, -94, -105, -116, -111, -101, -104, -105, -110, -93, -118, -99, -110, -104, -105, 111, -110, -105, -110, -100, -111, -114, -115, 0, 6, -5, -16, -11, -1, -4, -5, -10, 7, -18, 1, -10, -4, -5, -32, 1, -18, -1, 1, -14, -15, -11, -30, -13, -24, -26, -11, -32, -13, -26, -25, -13, -26, -12, -23, -32, -12};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A08(Throwable th2) {
        Iterator<InterfaceC2059fL> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new HashMap();
            new HashMap();
            throw new NullPointerException(A01(401, 23, 20));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1107Bn
    public final synchronized InterfaceC2041f2 A5M(EnumC2042f3 enumC2042f3) {
        if (enumC2042f3.A03() != EnumC2044f5.A04) {
            throw new IllegalArgumentException(A01(47, 59, 101));
        }
        if (this.A09.containsKey(enumC2042f3)) {
            return this.A09.get(enumC2042f3);
        }
        By by = new By(enumC2042f3);
        this.A09.put(enumC2042f3, by);
        Iterator<InterfaceC2059fL> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(377, 24, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
        }
        String.format(Locale.US, A01(153, 35, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), enumC2042f3);
        return by;
    }

    static {
        A05();
    }

    public C08671r(SQ sq2, InterfaceC1536Sh interfaceC1536Sh, InterfaceC2016ed interfaceC2016ed, String str, InterfaceC2055fH interfaceC2055fH, C2054fG c2054fG, InterfaceC2045f6 interfaceC2045f6) {
        this.A00 = sq2;
        this.A01 = interfaceC1536Sh;
        this.A02 = interfaceC2016ed;
        this.A06 = str;
        this.A05 = interfaceC2055fH;
        this.A04 = c2054fG;
        this.A03 = interfaceC2045f6.A56(this);
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int time = jSONObject.getJSONObject(A01(335, 7, 5)).getInt(A01(446, 16, 108));
        if (time > 0) {
            return time;
        }
        throw new JSONException(String.format(Locale.US, A01(129, 24, 44), Integer.valueOf(time)));
    }

    private Set<InterfaceC2058fK> A02(JSONObject jSONObject) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject2 = jSONObject.getJSONObject(A01(369, 8, 52));
        JSONObject data = jSONObject.getJSONObject(A01(298, 7, 109));
        Iterator<By> it = this.A09.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0B;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[1] = "GiFNWD8Qhge";
            strArr2[3] = "8JT";
            if (zHasNext) {
                final By next = it.next();
                switch (C2057fJ.A01[EnumC2063fP.A00(jSONObject2.getString(next.A87().A04())).ordinal()]) {
                    case 1:
                        final JSONObject fingerprint = data.getJSONObject(next.A87().A04()).getJSONObject(A01(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, 4, 3));
                        final JSONObject responseObject = data.getJSONObject(next.A87().A04()).optJSONObject(A01(Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 11, 43));
                        hashSet.add(new AbstractC1102Bi(next, fingerprint, responseObject) { // from class: com.facebook.ads.redexgen.X.1u
                            public final JSONObject A00;
                            public final JSONObject A01;

                            {
                                EnumC2063fP enumC2063fP = EnumC2063fP.A03;
                                this.A00 = fingerprint;
                                this.A01 = responseObject;
                            }

                            @Override // com.facebook.ads.redexgen.core.AbstractC1102Bi, com.facebook.ads.redexgen.core.InterfaceC2058fK
                            public final void A45(Map<InterfaceC2041f2, EnumC2063fP> map, Map<SyncModifiableBundle, EnumC2050fC> map2) {
                                super.A00.A03(this.A00, this.A01);
                                super.A45(map, map2);
                            }
                        });
                        break;
                    case 2:
                        hashSet.add(new AbstractC1102Bi(next) { // from class: com.facebook.ads.redexgen.X.1t
                            {
                                EnumC2063fP enumC2063fP = EnumC2063fP.A04;
                            }
                        });
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                Iterator<AbstractC08751z> it2 = this.A08.values().iterator();
                while (it2.hasNext()) {
                    it2.next();
                    final AbstractC08751z abstractC08751z = null;
                    switch (C2057fJ.A00[EnumC2050fC.A00(jSONObject2.getString(abstractC08751z.A87().A04())).ordinal()]) {
                        case 1:
                            hashSet.add(new AbstractC1103Bj(abstractC08751z) { // from class: com.facebook.ads.redexgen.X.1v
                                {
                                    EnumC2050fC enumC2050fC = EnumC2050fC.A03;
                                }
                            });
                            break;
                        case 2:
                            hashSet.add(new AbstractC1103Bj(abstractC08751z) { // from class: com.facebook.ads.redexgen.X.1s
                                public static byte[] A00;

                                static {
                                    A01();
                                }

                                public static String A00(int i10, int i11, int i12) {
                                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
                                    for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                                        bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 102);
                                    }
                                    return new String(bArrCopyOfRange);
                                }

                                public static void A01() {
                                    A00 = new byte[]{48, 34, 49, 15, 34, 46, 50, 38, 47, 34, 48, 16, 54, 43, 32};
                                }

                                {
                                    EnumC2050fC enumC2050fC = EnumC2050fC.A04;
                                }

                                @Override // com.facebook.ads.redexgen.core.AbstractC1103Bj, com.facebook.ads.redexgen.core.InterfaceC2058fK
                                public final void A45(Map<InterfaceC2041f2, EnumC2063fP> map, Map<SyncModifiableBundle, EnumC2050fC> map2) {
                                    throw new NullPointerException(A00(0, 15, 87));
                                }
                            });
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                return hashSet;
            }
        }
    }

    private JSONObject A03(Map<InterfaceC2041f2, EnumC2062fO> map, Map<SyncModifiableBundle, EnumC2049fB> map2, Map<SyncModifiableBundle, JSONObject> clientBundleData, Map<SyncModifiableBundle, JSONObject> clientBundleFingerprint) throws JSONException {
        String strA01;
        JSONObject syncRequest = new JSONObject();
        for (Map.Entry<InterfaceC2041f2, EnumC2062fO> entry : map.entrySet()) {
            syncRequest.put(entry.getKey().A87().A04(), entry.getValue().A03());
        }
        for (Map.Entry<SyncModifiableBundle, EnumC2049fB> entry2 : map2.entrySet()) {
            entry2.getKey();
            InterfaceC2041f2 interfaceC2041f2 = null;
            String strA04 = interfaceC2041f2.A87().A04();
            String strA03 = entry2.getValue().A03();
            String[] strArr = A0B;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0B[4] = "GjL9vB6wh";
            syncRequest.put(strA04, strA03);
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<InterfaceC2041f2, EnumC2062fO>> it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strA01 = A01(Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 11, 43);
            if (!zHasNext) {
                break;
            }
            Map.Entry<InterfaceC2041f2, EnumC2062fO> next = it.next();
            if (next.getValue() == EnumC2062fO.A05) {
                JSONObject updateData = new JSONObject();
                InterfaceC2041f2 key = next.getKey();
                jSONObject.put(key.A87().A04(), updateData);
                if (next.getKey().A87().A05()) {
                    JSONObject request = key.A80();
                    updateData.put(strA01, request);
                } else {
                    updateData.put(strA01, JSONObject.NULL);
                }
                EnumC2042f3 enumC2042f3A87 = key.A87();
                String[] strArr2 = A0B;
                if (strArr2[7].length() != strArr2[2].length()) {
                    String[] strArr3 = A0B;
                    strArr3[1] = "cfjTgROdu8b";
                    strArr3[3] = "qIs";
                    jSONObject.put(enumC2042f3A87.A04(), updateData);
                } else {
                    A0B[4] = "vaTQWmMwm";
                    jSONObject.put(enumC2042f3A87.A04(), updateData);
                }
            }
        }
        for (Map.Entry<SyncModifiableBundle, EnumC2049fB> entry3 : map2.entrySet()) {
            JSONObject updateData2 = new JSONObject();
            InterfaceC2041f2 key2 = entry3.getKey();
            JSONObject request2 = clientBundleFingerprint.get(entry3.getKey());
            updateData2.put(strA01, request2);
            if (entry3.getValue() == EnumC2049fB.A05) {
                String strA012 = A01(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, 4, 3);
                JSONObject request3 = clientBundleData.get(key2);
                updateData2.put(strA012, request3);
                jSONObject.put(key2.A87().A04(), updateData2);
            } else {
                jSONObject.put(key2.A87().A04(), updateData2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry4 : this.A05.A7r().entrySet()) {
            if (entry4.getValue() != null) {
                jSONObject2.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(A01(342, 7, 111), syncRequest);
        jSONObject3.put(A01(298, 7, 109), jSONObject);
        jSONObject3.put(A01(Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 7, 75), jSONObject2);
        return jSONObject3;
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 28, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e10) {
            atomicReference2.set(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1107Bn, com.facebook.ads.redexgen.core.SW
    public final void A6V() {
        this.A03.A6U();
    }

    @Override // com.facebook.ads.redexgen.core.f7
    public final void AI4() {
        if (this.A01.AAY()) {
            String str = A01(106, 23, 34) + this.A01.A7c().A07() + A01(0, 29, 49);
            A08(new C2061fN());
            return;
        }
        try {
            if (!U7.A21(this.A00) || this.A00.A04().AAL()) {
                A04();
                return;
            }
            throw new IllegalStateException(A01(29, 18, 127));
        } catch (Throwable th2) {
            String.format(Locale.US, A01(249, 49, 109), Integer.valueOf(this.A04.A01()));
            A08(th2);
            this.A03.A6T(this.A04.A01());
        }
    }
}
