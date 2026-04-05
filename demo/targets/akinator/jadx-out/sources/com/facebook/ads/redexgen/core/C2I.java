package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.MediaItem;
import com.facebook.ads.androidx.media3.common.StreamKey;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.2I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2I {
    public static String[] A0B = {"HPaW60WB4gFqlzK247iq3uDphWK03Iif", "KBvaSaTKxPBSHh58MHpb5CG0KegQKkr9", "b1r5E5Hd4zdNoyuaEQVQsO4l4ctoImRB", "nKy6zg3qdMWmj624cOZmm65wxaqanW8E", "pbs", "7xj4kZWUPnGFCehZwFfpDVbkpfFBWPXP", "TYkILCf2Xs5AkCVGSR3QMYIpsRVtVxUs", "J3EyGmSR6mO6g6CSn2CxG4G4HI4UvZHg"};
    public Uri A00;
    public C2603og A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public C2J A01 = new C2J();
    public C2L A02 = new C2L();
    public List<StreamKey> A09 = Collections.emptyList();
    public List<MediaItem.SubtitleConfiguration> A0A = Collections.emptyList();
    public C2O A03 = new C2O();

    public final C2I A00(Uri uri) {
        this.A00 = uri;
        return this;
    }

    public final C2I A01(Object obj) {
        this.A05 = obj;
        return this;
    }

    public final C2I A02(String str) {
        this.A06 = str;
        return this;
    }

    public final C2I A03(String str) {
        this.A07 = (String) C3M.A01(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.C2I A04(java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L2f
            boolean r3 = r5.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2I.A0B
            r0 = 1
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L34
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2I.A0B
            java.lang.String r1 = "MqTMGNvSZ5CI9kiBQqDgyIk0OkVIIG8t"
            r0 = 3
            r2[r0] = r1
            if (r3 != 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L2c:
            r4.A09 = r0
            return r4
        L2f:
            java.util.List r0 = java.util.Collections.emptyList()
            goto L2c
        L34:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2I.A04(java.util.List):com.facebook.ads.redexgen.X.2I");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.C2605oi A05() {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.2L r0 = r11.A02
            android.net.Uri r0 = com.facebook.ads.redexgen.core.C2L.A00(r0)
            if (r0 == 0) goto L26
            com.facebook.ads.redexgen.X.2L r3 = r11.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2I.A0B
            r0 = 3
            r1 = r1[r0]
            r0 = 22
            char r1 = r1.charAt(r0)
            r0 = 49
            if (r1 == r0) goto L78
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2I.A0B
            java.lang.String r1 = "LsaTJZF6o4X1Tfg01qMfqEHPxyZhwdJj"
            r0 = 5
            r2[r0] = r1
            java.util.UUID r0 = com.facebook.ads.redexgen.core.C2L.A03(r3)
            if (r0 == 0) goto L76
        L26:
            r0 = 1
        L27:
            com.facebook.ads.redexgen.core.C3M.A08(r0)
            r1 = 0
            android.net.Uri r2 = r11.A00
            if (r2 == 0) goto L4e
            com.facebook.ads.redexgen.X.oj r1 = new com.facebook.ads.redexgen.X.oj
            java.lang.String r3 = r11.A08
            com.facebook.ads.redexgen.X.2L r0 = r11.A02
            java.util.UUID r0 = com.facebook.ads.redexgen.core.C2L.A03(r0)
            if (r0 == 0) goto L74
            com.facebook.ads.redexgen.X.2L r0 = r11.A02
            com.facebook.ads.redexgen.X.2M r4 = r0.A08()
        L41:
            r5 = 0
            java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> r6 = r11.A09
            java.lang.String r7 = r11.A06
            java.util.List<com.facebook.ads.androidx.media3.common.MediaItem$SubtitleConfiguration> r8 = r11.A0A
            java.lang.Object r9 = r11.A05
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
        L4e:
            com.facebook.ads.redexgen.X.oi r2 = new com.facebook.ads.redexgen.X.oi
            java.lang.String r0 = r11.A07
            if (r0 == 0) goto L71
            java.lang.String r3 = r11.A07
        L56:
            com.facebook.ads.redexgen.X.2J r0 = r11.A01
            com.facebook.ads.redexgen.X.9r r4 = r0.A0B()
            com.facebook.ads.redexgen.X.2O r0 = r11.A03
            com.facebook.ads.redexgen.X.ok r6 = r0.A05()
            com.facebook.ads.redexgen.X.og r0 = r11.A04
            if (r0 == 0) goto L6e
            com.facebook.ads.redexgen.X.og r7 = r11.A04
        L68:
            r8 = 0
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L6e:
            com.facebook.ads.redexgen.X.og r7 = com.facebook.ads.redexgen.core.C2603og.A0Z
            goto L68
        L71:
            java.lang.String r3 = ""
            goto L56
        L74:
            r4 = 0
            goto L41
        L76:
            r0 = 0
            goto L27
        L78:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2I.A05():com.facebook.ads.redexgen.X.oi");
    }
}
