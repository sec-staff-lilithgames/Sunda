package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Log;
import android.widget.LinearLayout;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7L, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7L<NativeViewabilityLogger> implements InterfaceC2249id {
    public static byte[] A0J;
    public static String[] A0K = {"NhwOmA8H17maQr2Thm3XPPVG1xwEsLhZ", "rranxCubAcBFDRhPr2LDrxoK3htxcyeL", "LmhV8", "ZLGOK7uKxyyp5W3sNEqoBEODv8zXcPE1", "dNK0bBZMrDk2YJmjrhSzlk1RMTFmUAsD", "q33l17MPfjO0fzYSahPh7EE95Ux5x03H", "4VfBn9Mh4W5rafl7A4va0uDeREUgOp63", "NLrbv196ww605txiYhOndsfSQjY"};
    public static final String A0L;
    public MX A00;
    public MY A01;
    public C2224iE A02;
    public AnonymousClass78 A03;
    public C6M A04;
    public US A05;
    public V4 A06;
    public InterfaceC1714Zh A08;
    public C1333Ki A09;
    public C5G A0A;
    public AbstractC2009eW A0B;
    public C2010eX A0C;
    public String A0E;
    public final String A0I = UUID.randomUUID().toString();
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public XH A07 = new XH();
    public Boolean A0D = false;

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0J = new byte[]{28, 40, 38, -25, 31, 26, 28, 30, 27, 40, 40, 36, -25, 26, 29, 44, -25, 27, 26, 39, 39, 30, 43, -25, 28, 37, 34, 28, 36, 30, 29, -15, -30, -11, -15, -84, -27, -15, -22, -23, -21, -22, -36, -93, -82};
    }

    static {
        A0B();
        A0L = C7L.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7L != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        if (this.A00 != null && this.A0A != null && this.A03 != null && this.A03.A1Y()) {
            this.A00.ACc(this, this.A0A);
        }
        if (this.A00 != null) {
            boolean z10 = this.A0F;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "pcQhCrMOoUvf1wSUiS8eXhj7G6bioSrh";
            strArr[4] = "JWZBC7ZhFf7k7YrTz5pa22tV9NT1Mc4w";
            if (z10 && (this.A0G || !this.A0H)) {
                MX mx = this.A00;
                if (A0K[3].charAt(25) != 'G') {
                    A0K[3] = "irPj8aYnTZH6GsdLYSbTyVfXBLXHQnPh";
                    mx.ACc(this, this.A09);
                } else {
                    A0K[3] = "5PA9hoTjlgD01Tr6eTkR8jxCvDfXc2RO";
                    mx.ACc(this, this.A09);
                }
            }
        }
        this.A04.A0F().A4G(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7L != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i10, TF tf2) {
        C2245iZ c2245iZ = new C2245iZ(this);
        this.A0A = new C5G(this.A04, this.A05, c2245iZ, this.A03, A08(0, 31, 79), 2, this.A07);
        this.A0B = new C2240iU(this);
        this.A0C = new C2010eX(this.A0A, tf2.A04(), tf2.A09(), true, new WeakReference(this.A0B), this.A04);
        this.A0C.A0W(this.A03.A0i());
        this.A0C.A0X(this.A03.A0j());
        this.A0A.setVisibility(0);
        this.A04.getResources();
        this.A0A.setLayoutParams(new LinearLayout.LayoutParams(-1, i10));
        this.A0A.AJS();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7L != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(TF tf2, JSONObject jSONObject, V4 v42) {
        this.A0G = false;
        final C2226iG c2226iGA00 = C2226iG.A00(this.A04, jSONObject);
        this.A0E = c2226iGA00.A7G();
        if (ML.A06(this.A04, c2226iGA00, this.A05)) {
            this.A04.A0F().A4u();
            this.A00.ADj(this, V1.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A08 = new AbstractC1344Kt() { // from class: com.facebook.ads.redexgen.X.7M
            public static byte[] A02;
            public static String[] A03 = {"dvnbyrX9L5Wlup6c2JnWkpTYBAz3QIun", "ITj", "KqeTcLSx6Zay5vtxcnHqZ", "bGeXa7nDz1byFpBCq22utpLnb", "UYph9iPsD3jee8BOLuPQ6r57rjKJpmVb", "DfaYbRSw6X21pxGApii0qweOJ64z1eNB", "52vckdype7aS5lLwU46sLHF0XTMQAze7", "uuBWL9In1wjj"};

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 105);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{67, 116, 116, 105, 116, 38, 99, 126, 99, 101, 115, 114, 111, 104, 97, 38, 103, 101, 114, 111, 105, 104, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 116, 112, 115, 118, 81, 74, 77, 85, 81, 65, 109, 64};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1714Zh
            public final void ACO() {
                this.A00.A0G = true;
                if (this.A00.A0H) {
                    this.A00.A0A();
                }
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1344Kt, com.facebook.ads.redexgen.core.InterfaceC1714Zh
            public final void ACj(String str, Map<String, String> map) throws SecurityException {
                N3 n3A21;
                this.A00.A04.A0F().A4H();
                Uri uriA00 = WQ.A00(str);
                map.put(A00(22, 10, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), AdPlacementType.BANNER.name());
                map.put(A00(36, 8, 77), this.A00.A0I);
                C6M c6m = this.A00.A04;
                US us = this.A00.A05;
                String strA7G = c2226iGA00.A7G();
                if (this.A00.A03 == null) {
                    n3A21 = null;
                } else {
                    C7L c7l = this.A00;
                    if (A03[7].length() == 4) {
                        throw new RuntimeException();
                    }
                    A03[2] = "7FoTEC4l3Pv3ceMVIqf";
                    n3A21 = c7l.A03.A21();
                }
                MH adAction = MI.A00(c6m, us, strA7G, uriA00, map, n3A21);
                ME meA0G = ME.A09;
                if (adAction != null) {
                    try {
                        this.A00.A04.A0F().A4E();
                        meA0G = adAction.A0G(null);
                    } catch (Exception e10) {
                        Log.e(C7L.A0L, A00(0, 22, 111), e10);
                    }
                }
                if (A00(32, 4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE).equals(uriA00.getScheme()) && MI.A04(uriA00.getAuthority()) && this.A00.A00 != null && meA0G != ME.A06) {
                    this.A00.A00.ACb(this.A00);
                }
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1714Zh
            public final void ADW() {
                this.A00.A04.A0F().A4I(this.A00.A02 != null);
                if (this.A00.A02 != null) {
                    this.A00.A02.A03();
                }
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1344Kt, com.facebook.ads.redexgen.core.InterfaceC1714Zh
            public final void AET() {
                this.A00.A04.A0F().A4K();
                this.A00.A02.A09();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1714Zh
            public final void AFw() {
            }
        };
        this.A09 = new C1333Ki(this.A04, (WeakReference<InterfaceC1714Zh>) new WeakReference(this.A08), tf2.A04(), A7G());
        this.A09.A0L(tf2.A07(), tf2.A08());
        MS impressionHelper = new C2239iT(this);
        this.A02 = new C2224iE(this.A04, this.A05, this.A09, this.A09.getViewabilityChecker(), impressionHelper, v42);
        this.A02.A0A(c2226iGA00);
        this.A09.loadDataWithBaseURL(AbstractC1717Zk.A01(AdInternalSettings.getUrlPrefix()), c2226iGA00.A04(), A08(31, 9, 19), A08(40, 5, 12), null);
        this.A0F = true;
        A0A();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7L != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[PHI: r1
      0x0053: PHI (r1v13 int) = (r1v10 int), (r1v17 int) binds: [B:20:0x0079, B:12:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[PHI: r1
      0x007c: PHI (r1v11 int) = (r1v10 int), (r1v13 int), (r1v17 int) binds: [B:20:0x0079, B:14:0x005d, B:12:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0G(com.facebook.ads.redexgen.core.V4 r11, com.facebook.ads.redexgen.core.TF r12) {
        /*
            r10 = this;
            com.facebook.ads.redexgen.X.78 r0 = r10.A03
            if (r0 == 0) goto L23
            com.facebook.ads.redexgen.X.US r3 = r10.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C7L.A0K
            r0 = 1
            r1 = r1[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            r0 = 73
            if (r1 == r0) goto La7
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C7L.A0K
            java.lang.String r1 = "0asQ5nS3mEJJFXqECkaJp8czAINd5ojj"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "wkfCN0fAVUFan65EWCqz3ffd3K2ZXjjS"
            r0 = 4
            r2[r0] = r1
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r11.A03()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C7L.A0K
            r0 = 3
            r1 = r1[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            r0 = 71
            if (r1 == r0) goto L66
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C7L.A0K
            java.lang.String r1 = "7AAzPingpmVfFCqSXKHauNoNKo9Xv93Z"
            r0 = 5
            r2[r0] = r1
            float r1 = (float) r3
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r1 = (int) r1
            com.facebook.ads.redexgen.X.6M r0 = r10.A04
            boolean r0 = com.facebook.ads.redexgen.core.U7.A2A(r0)
            if (r0 == 0) goto L7c
        L53:
            com.facebook.ads.redexgen.X.78 r0 = r10.A03
            org.json.JSONObject r0 = r0.A1C()
            boolean r0 = com.facebook.ads.redexgen.core.C1509Rf.A0A(r0)
            if (r0 == 0) goto L7c
            r0 = 1
        L60:
            if (r0 != 0) goto L7e
            r10.A0C(r1, r12)
            return
        L66:
            float r1 = (float) r3
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r1 = (int) r1
            com.facebook.ads.redexgen.X.6M r0 = r10.A04
            boolean r0 = com.facebook.ads.redexgen.core.U7.A2A(r0)
            if (r0 == 0) goto L7c
            goto L53
        L7c:
            r0 = 0
            goto L60
        L7e:
            com.facebook.ads.redexgen.X.6M r0 = r10.A04
            com.facebook.ads.redexgen.X.SF r4 = new com.facebook.ads.redexgen.X.SF
            r4.<init>(r0)
            r2 = r10
            com.facebook.ads.redexgen.X.Rf r3 = new com.facebook.ads.redexgen.X.Rf
            com.facebook.ads.redexgen.X.78 r0 = r10.A03
            org.json.JSONObject r5 = r0.A1C()
            com.facebook.ads.redexgen.X.78 r0 = r10.A03
            java.lang.String r6 = r0.A0v()
            com.facebook.ads.redexgen.X.78 r0 = r10.A03
            java.lang.String r7 = r0.A17()
            com.facebook.ads.redexgen.X.ic r9 = new com.facebook.ads.redexgen.X.ic
            r9.<init>(r10, r1, r12, r2)
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.A0B()
            return
        La7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C7L.A0G(com.facebook.ads.redexgen.X.V4, com.facebook.ads.redexgen.X.TF):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7L != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.MP
    public final String A7G() {
        return this.A0E;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7L != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.MP
    public final AdPlacementType A8c() {
        if (U7.A19(this.A04)) {
            V4 v42 = this.A06;
            String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0K[0] = "gRyzGCsQg6apk2eHBZ3N290V4KDgGwY2";
            if (v42 != null && this.A06 == V4.A09) {
                return AdPlacementType.MEDIUM_RECTANGLE;
            }
        }
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7L != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2249id
    public final void AAk(C6M c6m, US us, V4 v42, MX mx, JSONObject jSONObject, TF tf2) {
        c6m.A0F().A4F();
        this.A04 = c6m;
        this.A05 = us;
        this.A00 = mx;
        this.A06 = v42;
        this.A0H = U7.A1j(this.A04.getApplicationContext());
        this.A03 = AnonymousClass78.A00(jSONObject, this.A04);
        if (this.A03.A1Y()) {
            A0G(v42, tf2);
        } else {
            A0F(tf2, jSONObject, v42);
        }
        this.A01 = new MY(this.A04, this.A0I, this, mx);
        this.A01.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7L != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.MP
    public final boolean AJa() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7L != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.MP
    public final void onDestroy() {
        this.A04.A0F().A4D(this.A09 != null);
        if (this.A09 != null) {
            this.A09.destroy();
            this.A09 = null;
            this.A08 = null;
        }
        if (this.A01 != null) {
            this.A01.A03();
        }
    }
}
