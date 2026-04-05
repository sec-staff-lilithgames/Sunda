package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class CC extends AsyncTask<AbstractC2028ep, Void, InterfaceC2015ec> implements InterfaceC2025em {
    public static byte[] A04;
    public static String[] A05 = {"QrFR9YxtZmjHUVEKV6oKE4DdGtsrpc8H", "TwcoDq13NGDzrd27uf1NctQWIs88CxA5", "DEQUIzHs8EHMaJWbR5cSGVZv3Gss2W35", "Ai8rFQMQjE1asV4GIWZxLQq3VKhMcnMa", "Q3dsJQvnRhhndIZBGw2JIf13CD9aK", "FSoxIZL2zci1XZCD3aOfhtBMx8TI21HW", "XwCxwzkF49MOW0uOTgxgRHHne1dL58CR", "45IZuxFnerodSJSRUIhMDhHmCeiAV"};
    public InterfaceC2017ee A00;
    public C8 A01;
    public Exception A02;
    public Executor A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final InterfaceC2015ec A00(AbstractC2028ep... abstractC2028epArr) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return null;
        }
        String[] strArr = A05;
        if (strArr[5].charAt(28) != strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        A05[6] = "rZqzIjYv4aJ5FL2pEqspRVXwv6AN0NL2";
        try {
            if (abstractC2028epArr != null) {
                try {
                    if (abstractC2028epArr.length > 0) {
                        InterfaceC2015ec interfaceC2015ecA0J = this.A01.A0J(abstractC2028epArr[0]);
                        if (this.A01.A0K().A04() && interfaceC2015ecA0J != null) {
                            String.format(Locale.US, A01(108, 21, 5), Integer.valueOf(interfaceC2015ecA0J.A94()), interfaceC2015ecA0J.getUrl(), interfaceC2015ecA0J.A6v());
                        }
                        if (interfaceC2015ecA0J != null) {
                            return interfaceC2015ecA0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 59));
                    }
                } catch (Exception e10) {
                    this.A02 = e10;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 95), e10.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 49));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            if (A05[0].charAt(24) != 'G') {
                throw new RuntimeException();
            }
            A05[0] = "mnFvayeDWU8YlLMMxELrFm0bGTjKFJH1";
            bArrCopyOfRange[i13] = (byte) (i14 - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-119, -76, -115, -71, -71, -75, -105, -86, -74, -70, -86, -72, -71, -103, -90, -72, -80, 101, -71, -90, -80, -86, -72, 101, -86, -67, -90, -88, -71, -79, -66, 101, -76, -77, -86, 101, -90, -73, -84, -70, -78, -86, -77, -71, 101, -76, -85, 101, -71, -66, -75, -86, 101, -115, -71, -71, -75, -105, -86, -74, -70, -86, -72, -71, -69, -57, -57, -61, -109, -27, -40, -28, -24, -40, -26, -25, -109, -39, -44, -36, -33, -40, -41, -83, -109, -104, -26, -105, -61, -61, -65, 111, -63, -76, -62, -65, -66, -67, -62, -76, 111, -72, -62, 111, -67, -60, -69, -69, 107, 126, -116, -119, -120, -121, -116, 126, 83, 57, 62, 125, 57, 65, 62, -116, 66, 83, 35, 62, -116};
    }

    static {
        A02();
    }

    public CC(C8 c82, InterfaceC2017ee interfaceC2017ee, Executor executor) {
        this.A01 = c82;
        this.A00 = interfaceC2017ee;
        this.A03 = executor;
    }

    private final void A03(InterfaceC2015ec result) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.ACo(result);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    public final void A04(AbstractC2028ep abstractC2028ep) {
        super.executeOnExecutor(this.A03, abstractC2028ep);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ InterfaceC2015ec doInBackground(AbstractC2028ep[] abstractC2028epArr) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return null;
        }
        try {
            return A00(abstractC2028epArr);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.ADC(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(InterfaceC2015ec interfaceC2015ec) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A03(interfaceC2015ec);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
