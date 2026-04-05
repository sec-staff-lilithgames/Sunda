package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC2036ex extends AsyncTask<String, Void, C2037ey> {
    public static byte[] A05;
    public static String[] A06 = {"naFNcZuGe", "C9JAYYW4", "8H9N3VrVfLlJ9IUdYMoO", "YylQBw7bkupjVtNcwFivzoGwGcTau", "utPcy8I9vNMcCezdgtn", "ehhspVm5", "7sb5kaLRz1R8p", "m"};
    public static final String A07;
    public static final Set<String> A08;
    public SQ A00;
    public InterfaceC2015ec A01;
    public InterfaceC2035ew A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final C2037ey A00(String... strArr) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return null;
        }
        String[] strArr2 = A06;
        if (strArr2[4].length() == strArr2[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A06;
        strArr3[3] = "OBWBCzNqNMhSgl0vUrcBODbII9DBW";
        strArr3[2] = "nuEeWi2rsMih0JuNdplL";
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String strA02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        strA02 = A03(strA02, entry.getKey(), entry.getValue());
                    }
                }
                int i10 = 1;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 > 2) {
                        return null;
                    }
                    if (A06(strA02)) {
                        return new C2037ey(this.A01);
                    }
                    i10 = i11;
                }
            }
            return null;
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 62, 43, 105, 56, 15, 15, 18, 15, 93, 18, 13, 24, 19, 20, 19, 26, 93, 8, 15, 17, 71, 93, 15, 0, 15, 2, 1, 9, 54, 45, 52, 52};
    }

    static {
        A04();
        A07 = AsyncTaskC2036ex.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 15));
        A08.add(A01(29, 4, 63));
    }

    public AsyncTaskC2036ex(SQ sq2) {
        this(sq2, null, null);
    }

    public AsyncTaskC2036ex(SQ sq2, Map<String, String> extraData) {
        this(sq2, extraData, null);
    }

    public AsyncTaskC2036ex(SQ sq2, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = sq2;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 9), AbstractC1646Wr.A01(this.A00.A04().A6o()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String strA01 = A01(3, 1, 49);
        if (str.contains(strA01)) {
            strA01 = A01(1, 1, 127);
        }
        StringBuilder sbAppend = new StringBuilder().append(str).append(strA01).append(str2);
        String prepend = A01(2, 1, 113);
        StringBuilder sbAppend2 = sbAppend.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return sbAppend2.append(prepend2).toString();
    }

    private final void A05(C2037ey response) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.AGS(response);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    private boolean A06(String str) {
        InterfaceC2015ec interfaceC2015ecAGC;
        InterfaceC2016ed interfaceC2016edA00 = C2034ev.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                interfaceC2015ecAGC = interfaceC2016edA00.AGC(str, new C2030er());
            } else {
                C2030er params = new C2030er();
                params.A05(this.A04);
                interfaceC2015ecAGC = interfaceC2016edA00.AGD(str, params.A08());
            }
            this.A01 = interfaceC2015ecAGC;
        } catch (Exception e10) {
            Log.e(A07, A01(4, 19, 26) + str, e10);
        }
        return this.A01 != null && this.A01.A94() == 200;
    }

    public final void A07(InterfaceC2035ew interfaceC2035ew) {
        this.A02 = interfaceC2035ew;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C2037ey doInBackground(String[] strArr) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.A02 != null) {
            this.A02.AGQ();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C2037ey c2037ey) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A05(c2037ey);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
