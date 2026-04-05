package com.facebook.ads.redexgen.core;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.j8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2277j8 implements LH {
    public static byte[] A09;
    public static String[] A0A = {"IBjHvdAE4z3hQw4rxwkyNcKQ0ISAyia4", "k6JnbRLATBGW5JMH6xbwPTUsl0iwlrJc", "UfNjo0M2E3JYTqqfEgwKvI", "0cJpOp9GZhTbse6AR0KBqddAOnBBcxYH", "ToL0P04EQWC050ZStPfUW7", "dLQ1hyrIZ6bV252gpMlUXC0bj3", "6aHaE6Igu4j61t8wIMItohij1osEY7A", "YKpEvhrVN9bD9vQDF7gbtGGCU86bcHbh"};
    public final C2275j6 A00;
    public final String A01;
    public final AtomicInteger A02;
    public final AtomicInteger A03;
    public final AtomicInteger A04;
    public final AtomicReference<String> A05;
    public final AtomicReference<String> A06;
    public final AtomicReference<String> A07;
    public final AtomicReference<LT> A08;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-87, -89, -69, -71, -85, -91, 119, -71, -70, -91, -87, -82, -89, -76, -76, -85, -78, -33, -35, -15, -17, -31, -37, -33, -21, -23, -20, -24, -31, -16, -31, -32, -34, -14, -16, -30, -36, -19, -34, -14, -16, -30, -43, -31, -32, -27, -26, -45, -32, -26, -47, -40, -34, -25, -27, -38, -47, -42, -37, -27, -45, -44, -34, -41, -42, 18, 30, 29, 34, 35, 16, 29, 35, 14, 21, 27, 36, 34, 23, 14, 20, 29, 16, 17, 27, 20, 19, -57, -38, -47, -63, -46, -50, -61, -37, -57, -44, 8, 23, 16, 16, 7, 14, 1, -6, 9, 2, 2, -7, 0, -13, 7, -7, 5, -64, -72, -73, -68, -76, -78, -61, -65, -76, -52, -72, -59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final void A03(JSONObject jSONObject) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            try {
                jSONObject.put(A00(104, 10, 100), this.A04.getAndIncrement());
            } catch (Throwable th2) {
                AbstractC1616Vl.A00(th2, this);
                return;
            }
        } catch (JSONException unused) {
        }
        LO.A0g.A04(this.A01).A02(jSONObject);
        String str = this.A07.get();
        if (!TextUtils.isEmpty(str)) {
            LO.A0l.A04(str).A02(jSONObject);
        }
        String str2 = this.A06.get();
        if (!TextUtils.isEmpty(str2)) {
            LO.A0k.A04(str2).A02(jSONObject);
        }
        String str3 = this.A05.get();
        if (!TextUtils.isEmpty(str3)) {
            LO.A0j.A04(str3).A02(jSONObject);
        }
        LT lt2 = this.A08.get();
        if (lt2 != null) {
            LO.A0M.A04(lt2).A02(jSONObject);
        }
        int i10 = this.A02.get();
        String[] strArr = A0A;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0A[3] = "oDSQlSjNmcpmgzbcJtWHkjHlPwQZcL3R";
        if (i10 != -1) {
            LO.A0N.A04(Integer.valueOf(i10)).A02(jSONObject);
        }
    }

    static {
        A01();
    }

    public C2277j8(C2275j6 c2275j6) {
        this(c2275j6, UUID.randomUUID().toString());
    }

    public C2277j8(C2275j6 c2275j6, String str) {
        this.A07 = new AtomicReference<>();
        this.A06 = new AtomicReference<>();
        this.A05 = new AtomicReference<>();
        this.A08 = new AtomicReference<>();
        this.A02 = new AtomicInteger(-1);
        this.A03 = new AtomicInteger(0);
        this.A01 = str;
        this.A00 = c2275j6;
        this.A04 = new AtomicInteger(1);
    }

    private void A02(int i10, String str) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(97, 7, 114) + LO.A0h.getName(), str);
            } catch (JSONException unused) {
            }
            A03(jSONObject);
            this.A00.A00().ABM(i10, jSONObject, this.A03.get());
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    public final void A04(LK type, LN... params) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (LN ln2 : params) {
                ln2.A02(jSONObject);
            }
            A03(jSONObject);
            this.A00.A00().AB0(type, jSONObject, this.A03.get());
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            A0A[1] = "BGuBBhhr2vfc8YeoHKcuMelBM5cinHSr";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A35(String str, int reason, String viewType) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0X, LO.A0S.A04(Integer.valueOf(reason)), LO.A0a.A04(viewType));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A36(String objectHash, String viewType) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0Y, LO.A0Z.A04(objectHash), LO.A0a.A04(viewType));
        } catch (Throwable th2) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "CnHHOHbzAF39FbZ23oJPbX";
            strArr2[4] = "iCnDYwDfb9KHEDVJBca8IG";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A37(String objectHash, String viewType) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0Z, LO.A0Z.A04(objectHash), LO.A0a.A04(viewType));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A38(String objectHash, String viewType) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0a, LO.A0Z.A04(objectHash), LO.A0a.A04(viewType));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A39(String objectHash, String viewType) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0b, LO.A0Z.A04(objectHash), LO.A0a.A04(viewType));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3A(String objectHash, String viewType) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0c, LO.A0Z.A04(objectHash), LO.A0a.A04(viewType));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3B(String objectHash, String viewType) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0d, LO.A0Z.A04(objectHash), LO.A0a.A04(viewType));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3C() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0o, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3D() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A11, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3E(boolean listenerSet) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0f, LO.A01.A04(Boolean.valueOf(listenerSet)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3F(long loadTimeMs, int errorCode, String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A13, LO.A0O.A04(Integer.valueOf(errorCode)), LO.A0e.A04(errorMessage), LO.A0Y.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[0] = "ou1vvyDZqZWINuQgR45WlnH1G6V1u1ma";
            strArr[7] = "sF8Nv0lZkba8MOr3Cm9N7xOdNRIBEokF";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3G() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A15, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3H() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A14, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "ghPrSTa04AlA3hlhWhKdOq";
            strArr2[4] = "J88k6JeMdFLh46seUcEYlS";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3I() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A16, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3J(long loadTimeMs) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A17, LO.A0Y.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3K(LF reason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3W, LO.A00.A04(reason));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3L(String placementType, String placementId) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A06.set(placementType);
            this.A05.set(placementId);
            A04(LK.A0g, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3M() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0h, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3N() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0i, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3O(long loadTimeMs, int errorCode, String errorMessage, boolean isPublic) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0j, LO.A0Y.A04(Long.valueOf(loadTimeMs)), LO.A0O.A04(Integer.valueOf(errorCode)), LO.A0e.A04(errorMessage), LO.A0B.A04(Boolean.valueOf(isPublic)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3P(long loadTimeMs, long executionWaitTimeMs) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0k, LO.A0Y.A04(Long.valueOf(loadTimeMs)), LO.A0X.A04(Long.valueOf(executionWaitTimeMs)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3Q(boolean result) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1E, LO.A0K.A04(Boolean.valueOf(result)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3R() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1F, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3S(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1K, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3T() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1L, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3U() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1M, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3V() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1N, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3W(int funnelVideoPauseReason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1O, LO.A0S.A04(Integer.valueOf(funnelVideoPauseReason)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3X() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1P, new LN[0]);
        } catch (Throwable th2) {
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            A0A[3] = "xPEMCdF1PT81VKplThmZJ0MgThXZkz9L";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3Y() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1S, new LN[0]);
        } catch (Throwable th2) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            A0A[1] = "rEmXoUEysLHPq8FZE3dOJNk5SzTI5ER4";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3Z() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1Q, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3a(int reason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1R, LO.A0S.A04(Integer.valueOf(reason)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3b() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1T, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3c(String uri) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1U, LO.A0h.A04(uri));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3d() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1V, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3e() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1W, new LN[0]);
        } catch (Throwable th2) {
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            A0A[3] = "VHKTrZg04X3VOgoin19cBQHxK1SmZkil";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3f() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1X, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3g() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1Y, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3h(int funnelVideoStartReason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1Z, LO.A0S.A04(Integer.valueOf(funnelVideoStartReason)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "xMSVvfXgoFGAs8nDBunIn95v3O7z4ovy";
            strArr2[7] = "AGV4v0JDz2tNg1AGql8xEI5p6QAZ0vcQ";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3i() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1a, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[0] = "8ZQmvOl7hzZw4gnCVFSM7Fjew1MxvIcb";
            strArr[7] = "zdDiv1uwuIXQArBlVybz6cyG0OKYRhqv";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3j(int reason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1b, LO.A0S.A04(Integer.valueOf(reason)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3k() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3Y, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3l() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3Z, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3m(LF reason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3V, LO.A00.A04(reason));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3n(int reason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3X, LO.A0U.A04(Integer.valueOf(reason)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A3o() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3a, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4f(long loadTimeMs) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0m, LO.A0Y.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4g(long loadTimeMs, int chainedAdIndex) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0m, LO.A0Y.A04(Long.valueOf(loadTimeMs)), LO.A0N.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4h(long loadTimeMs) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0n, LO.A0Y.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4i(long loadTimeMs, int chainedAdIndex) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0n, LO.A0Y.A04(Long.valueOf(loadTimeMs)), LO.A0N.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4l(int reason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0R, LO.A0S.A04(Integer.valueOf(reason)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4m() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0S, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4n(String chainedParamsJson) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0T, LO.A0d.A04(chainedParamsJson));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4o() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0U, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4p() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0V, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4q(int skipReason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0W, LO.A0S.A04(Integer.valueOf(skipReason)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A4u() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0p, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5V() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0q, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5W() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0u, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5X(boolean isInvalidated) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0l, LO.A09.A04(Boolean.valueOf(isInvalidated)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5Y(int errorCode, String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0v, LO.A0O.A04(Integer.valueOf(errorCode)), LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5Z(boolean hasBid) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0t, LO.A03.A04(Boolean.valueOf(hasBid)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5a() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0x, new LN[0]);
        } catch (Throwable th2) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "rOShNeNq5fhncN4PBQe40u";
            strArr2[4] = "fkRpVb9hGxGD6wAnOJN4MT";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5b() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0y, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5c() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A0z, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5d() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A10, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5w() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1h, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5x(String message) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1i, LO.A0h.A04(message));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5y() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1j, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5z() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1k, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A60() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1l, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A61(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1m, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A62(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1n, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A63(String message) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1o, LO.A0h.A04(message));
        } catch (Throwable th2) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[1] = "759deBEUdc0uh8isIDlD9YAtQ7qctZF0";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A64(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1q, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "1zlmhlFzFVwgF9q0xmtSdu50kD";
            strArr2[6] = "2haF4NBMerbrCWfGasmmW9SqeFz7x8G";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A65() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1r, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A66(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1s, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A67(long loadTimeMs) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1t, LO.A0Y.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A68(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1u, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A9n() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1x, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A9o() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1y, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A9p(boolean isDisabledByGK) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1z, LO.A07.A04(Boolean.valueOf(isDisabledByGK)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A9q() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A20, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A9r(String error) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A21, LO.A0e.A04(error));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A9s() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A22, new LN[0]);
        } catch (Throwable th2) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[3] = "15jrFKu6wVZYTCIc5tz6T2aAbAvuKlIC";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A9t() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A23, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A9u(String exception) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A24, LO.A0f.A04(exception));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.j8] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    @Override // com.facebook.ads.redexgen.core.LH
    public final boolean AAK() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return false;
        }
        Object obj = this;
        try {
            obj = obj.A03.get();
            return obj == 1;
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, obj);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AAu(String source) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1f, LO.A0m.A04(source));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AAv(String source) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1g, LO.A0m.A04(source));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AAw(int code, String message) throws Throwable {
        if (AbstractC1616Vl.A02(this) || code < 11000 || code > 11099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AB2(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1v, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AB3(int result) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1w, LO.A0T.A04(Integer.valueOf(result)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AB9(String provider) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2J, LO.A0i.A04(provider));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABA(String provider) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2K, LO.A0i.A04(provider));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABB(String provider) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2L, LO.A0i.A04(provider));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABC(String provider) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2M, LO.A0i.A04(provider));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABD(String provider) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2N, LO.A0i.A04(provider));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABE(String provider) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2O, LO.A0i.A04(provider));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABF() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2P, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABG(String provider) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2Q, LO.A0i.A04(provider));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABU(int isLeftTopHalf) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3M, LO.A0P.A04(Integer.valueOf(isLeftTopHalf)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABV(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3N, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABW(boolean isSplitScreenSupportedInApp, boolean isSplitScreenFlagAdded, boolean supportsMultiWindow, boolean supportsSplitScreenMultiWindow, boolean appResizingSupported) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3O, LO.A0D.A04(Boolean.valueOf(isSplitScreenSupportedInApp)), LO.A0C.A04(Boolean.valueOf(isSplitScreenFlagAdded)), LO.A0J.A04(Boolean.valueOf(supportsMultiWindow)), LO.A0L.A04(Boolean.valueOf(supportsSplitScreenMultiWindow)), LO.A0H.A04(Boolean.valueOf(appResizingSupported)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABb() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3b, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABc(boolean isLocked, int reason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3c, LO.A0A.A04(Boolean.valueOf(isLocked)), LO.A0S.A04(Integer.valueOf(reason)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABd() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3d, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABe(boolean isLocked, boolean isV2, boolean isChained) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3e, LO.A0A.A04(Boolean.valueOf(isLocked)), LO.A0E.A04(Boolean.valueOf(isV2)), LO.A08.A04(Boolean.valueOf(isChained)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABf() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3f, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABg() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3g, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABh() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3i, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABi() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3h, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABj(String falseReasonMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3j, LO.A0o.A04(falseReasonMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABk() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3k, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABl() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3l, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABx(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A18, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABy(int reason) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A19, LO.A0U.A04(Integer.valueOf(reason)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ABz() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2R, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AC0() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2S, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AC1() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2T, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AC4() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1A, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADk() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A28, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADl() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A29, new LN[0]);
        } catch (Throwable th2) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "SUWuhZot3lbnUwmuNgQZL8cGUh";
            strArr2[6] = "e1ut4vb54s16AZCVtGxdkLVCEm0tRiH";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADm() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2B, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADn() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2C, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADo() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2D, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADp() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2A, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADq() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2E, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADr() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2F, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADs() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2G, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADt() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2H, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void ADu() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2I, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AEY() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2Z, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "LuwYm9Ec4o1R43GcaJtosWaGmO";
            strArr2[6] = "Iv5NEtyRtdj3C1azmehhXo6SWfekvld";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AFR(int actionMode) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1G, LO.A0Q.A04(Integer.valueOf(actionMode)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AGp(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1C, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AGq() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1D, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AH2() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2c, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AH3() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2d, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AH4(int resultCode) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2e, LO.A0O.A04(Integer.valueOf(resultCode)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AH5() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2f, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AH6() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2g, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AH7(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2h, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AH8() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2j, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AH9() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2k, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHA() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2l, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHB() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2m, new LN[0]);
        } catch (Throwable th2) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            A0A[1] = "wOU9EU8iwoFyJfRJJkX4aLHDWxmftefK";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHC(RemoteException e10) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2v, LO.A0e.A04(e10.toString()));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHD() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2n, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHE() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2o, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHF() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2p, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHG() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2q, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHH() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2r, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "qlMIvHuIl0PpF5kBV9VQgOwtH5MinuqE";
            strArr2[7] = "xBNYvFKh7XBRvzLChNYnaiJhWQppxCKD";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHI(int type) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2s, LO.A0V.A04(Integer.valueOf(type)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHJ() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2t, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHK() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2u, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHL() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2i, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHM() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2w, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHN() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2x, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHO() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2y, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHP() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A2z, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHQ() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A30, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHR() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A31, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHS() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A33, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHT() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A34, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHU() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A35, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHV(int type) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A32, LO.A0V.A04(Integer.valueOf(type)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHW() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A36, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHX() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A37, new LN[0]);
        } catch (Throwable th2) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[3] = "ytbGG59mSCQ98v8bmpcCcEmqTnAgI1JB";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHY() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A38, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHZ() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A39, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHa() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3A, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHb(int what) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3B, LO.A0V.A04(Integer.valueOf(what)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHc() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3C, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHd(int messageTag) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3D, LO.A0V.A04(Integer.valueOf(messageTag)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHe(String string) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3E, LO.A0e.A04(string));
        } catch (Throwable th2) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[2] = "WmDwj21HmLDh2v3oBoiN7t";
            strArr[4] = "aBEcyy5IfSDVAZbtKUqUDd";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AHf() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3F, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AID() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3L, LO.A0h.A04(A00(65, 22, 127)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "ISt8aVbYkZ1528n3X0AMwO";
            strArr2[4] = "7zAIV0laY8ZUIjQSc0h82I";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AIE() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3L, LO.A0h.A04(A00(42, 23, 66)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AIF() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3Q, LO.A0h.A04(A00(87, 10, 50)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AIG() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3G, LO.A0h.A04(A00(17, 14, 76)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AIH() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3G, LO.A0h.A04(A00(0, 17, 22)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AII() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3G, LO.A0h.A04(A00(31, 11, 77)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AIJ() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3Q, LO.A0h.A04(A00(114, 12, 35)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AIb(int index) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A02.set(index);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AIi(boolean value) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (value) {
                this.A03.set(1);
            } else {
                this.A03.set(0);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AIj(int seq) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A04.set(seq);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AJ0(String str) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A07.set(str);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "yN2ek2pa9UH1g7DDMCyQyyX5rJ";
            strArr[6] = "oQTvUigTVOEtCxa6Wt9cejPgJdPQvss";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AJ9(LT viewType) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A08.set(viewType);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AJv() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1I, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AJw(String aspectRatio, int orientation, boolean isVideo, boolean isChained, String adType) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3P, LO.A0c.A04(aspectRatio), LO.A0R.A04(Integer.valueOf(orientation)), LO.A0b.A04(adType), LO.A0F.A04(Boolean.valueOf(isVideo)), LO.A08.A04(Boolean.valueOf(isChained)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "ITq1vIBeSfkAKxCxfKtEGd9U8MOPzVL5";
            strArr2[7] = "ymj5vTNhlapbY5H38Lm7zXjra8g0v2Rj";
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AJx() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3R, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AJy(int orientation) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3T, LO.A0R.A04(Integer.valueOf(orientation)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AJz(String viewableRatio) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3U, LO.A0n.A04(viewableRatio));
        } catch (Throwable th2) {
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "FEFzvX05qBdVAmKk8G0MI95qKtchV7LJ";
            strArr2[7] = "hT88vpHnpVYqM7dW4oE2C6WdduktsvVi";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AK0() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1c, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AK5() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3m, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AK6(int code, String message) throws Throwable {
        if (AbstractC1616Vl.A02(this) || code < 12000 || code > 12099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AK7() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3n, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AK8() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3o, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AK9() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3p, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKA(boolean callIgnored) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3q, LO.A02.A04(Boolean.valueOf(callIgnored)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKB() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3r, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKC() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3s, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKD(int errorCode, String message) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3t, LO.A0O.A04(Integer.valueOf(errorCode)), LO.A0e.A04(message));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKE(boolean hasWebview) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3u, LO.A06.A04(Boolean.valueOf(hasWebview)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKF() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3v, new LN[0]);
        } catch (Throwable th2) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "tcZOAQ7ZICgkoIgoP9nUVanYjA";
            strArr[6] = "vX76sPpkkUT44d9ZVg7hUVWC8IWIUnC";
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKG(String error) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3w, LO.A0e.A04(error));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKH(int i10, String error) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3x, LO.A0e.A04(error));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKI() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3y, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKJ(int visibility) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A3z, LO.A0W.A04(Integer.valueOf(visibility)));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKO(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1d, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AKP(String errorMessage) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1e, LO.A0e.A04(errorMessage));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final String getId() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return null;
        }
        try {
            return this.A01;
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void unregisterView() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A04(LK.A1H, new LN[0]);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
