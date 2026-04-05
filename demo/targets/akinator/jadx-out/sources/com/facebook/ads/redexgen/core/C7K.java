package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7K implements InterfaceC2249id {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public MX A01;
    public MY A02;
    public C2223iD A03;
    public C2221iB A04;
    public C6M A05;
    public Y8 A06;
    public Y9 A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(C6M c6m, C2221iB c2221iB, SF sf2, MX mx, Y9 y92) {
        String strA7G = c2221iB.A7G();
        if (!TextUtils.isEmpty(strA7G)) {
            sf2.A0e(new C1580Ua(strA7G, c6m.A0A()));
        }
        C1595Up c1595UpA0F = c2221iB.A0F();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (c1595UpA0F != null) {
            SD sd2 = new SD(c2221iB.A0F().getUrl(), c2221iB.A0F().getHeight(), c2221iB.A0F().getWidth(), c2221iB.A0Y(), A03(2, 16, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
            sd2.A01 = new SL(false, -1, -1);
            sf2.A0W();
            sf2.A0c(sd2);
        }
        if (c2221iB.A0E() != null) {
            sf2.A0c(new SD(c2221iB.A0E().getUrl(), c2221iB.A0E().getHeight(), c2221iB.A0E().getWidth(), c2221iB.A0Y(), A03(2, 16, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL)));
        }
        String strA0b = c2221iB.A0b();
        if (strA0b != null && !TextUtils.isEmpty(strA0b)) {
            sf2.A0b(new SB(strA0b, c2221iB.A0Y(), A03(2, 16, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL), c2221iB.A0A()));
        }
        C2235iP c2235iP = new C2235iP(this, y92, mx, c6m);
        String strA0Y = c2221iB.A0Y();
        String clientToken2 = A03(2, 16, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
        sf2.A0X(c2235iP, new S8(strA0Y, clientToken2));
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final String A7G() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7G();
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final AdPlacementType A8c() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2249id
    public final void AAk(C6M c6m, US us, V4 v42, MX mx, JSONObject jSONObject, TF tf2) {
        c6m.A0F().A4F();
        this.A05 = c6m;
        this.A01 = mx;
        SF sf2 = new SF(c6m);
        this.A00 = System.currentTimeMillis();
        C2221iB c2221iBA00 = AbstractC1383Mg.A00(c6m, jSONObject, AbstractC1646Wr.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = c2221iBA00;
        if (!ML.A06(c6m, c2221iBA00, us)) {
            Y8 adViewListener = new C2237iR(this, c6m);
            this.A06 = adViewListener;
            Y9 y92 = new Y9(c6m, us, sf2, new WeakReference(adViewListener), tf2.A04(), tf2.A07(), tf2.A08(), tf2.A09(), c2221iBA00, this.A08);
            this.A07 = y92;
            this.A03 = new C2223iD(c6m, new C2236iQ(this, c6m, mx), y92.getViewabilityChecker(), us, c2221iBA00);
            A05(c6m, c2221iBA00, sf2, mx, y92);
            this.A02 = new MY(c6m, this.A08, this, mx);
            this.A02.A02();
            return;
        }
        c6m.A0F().A4u();
        mx.ADj(this, V1.A00(AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final boolean AJa() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC2278j9 interfaceC2278j9A0F = this.A05.A0F();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            interfaceC2278j9A0F.A4D(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        MY my = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (my != null) {
            this.A02.A03();
        }
    }
}
