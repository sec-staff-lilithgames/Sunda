package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.SparseArray;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.je, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2308je implements GX {
    public static String[] A0B = {"UBvRkgXOGDkhiRviOullp8V", "VkNaXMTzU8N2w", "EmncOItxREzVuvRcJiesLUTUZ", "GKNHQwhZeE13dvoU8lLSXwuEJRZ0Rb8T", "UfDFEQBLtd8kFCM7fNQpR1e2paOBi7mP", "RVi2VPuM0SECIbGMRSZvlBLvqxfM7S", "lPCpjqdMUX8JsRnbL9v7kcIYKByBL6xe", "JprIbG5eTccKgwX6h6kDKt0luN"};
    public static final InterfaceC1223Gb A0C = new InterfaceC1223Gb() { // from class: com.facebook.ads.redexgen.X.jf
        @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
        public final GX[] A5F() {
            return C2308je.A01();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC1222Ga.A01(this, uri, map);
        }
    };
    public long A00;
    public GY A01;
    public C2310jg A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray<KV> A07;
    public final C4J A08;
    public final C4R A09;
    public final KU A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    @Override // com.facebook.ads.redexgen.core.GX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AGb(com.facebook.ads.redexgen.core.InterfaceC2403lN r12, com.facebook.ads.redexgen.core.C1241Gt r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2308je.AGb(com.facebook.ads.redexgen.X.lN, com.facebook.ads.redexgen.X.Gt):int");
    }

    public C2308je() {
        this(new C4R(0L));
    }

    public C2308je(C4R c4r) {
        this.A09 = c4r;
        this.A08 = new C4J(4096);
        this.A07 = new SparseArray<>();
        this.A0A = new KU();
    }

    @RequiresNonNull({"output"})
    private void A00(long j10) {
        if (!this.A06) {
            this.A06 = true;
            if (this.A0A.A0C() != C.TIME_UNSET) {
                this.A02 = new C2310jg(this.A0A.A0D(), this.A0A.A0C(), j10);
                this.A01.AIN(this.A02.A07());
            } else {
                this.A01.AIN(new C2398lI(this.A0A.A0C()));
            }
        }
    }

    public static /* synthetic */ GX[] A01() {
        return new GX[]{new C2308je()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A01 = gy;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        boolean z10 = false;
        boolean resetTimestampAdjuster = this.A09.A04() == C.TIME_UNSET;
        if (!resetTimestampAdjuster) {
            long jA02 = this.A09.A02();
            if (jA02 != C.TIME_UNSET && jA02 != 0 && jA02 != j11) {
                z10 = true;
            }
            resetTimestampAdjuster = z10;
        }
        if (resetTimestampAdjuster) {
            this.A09.A07(j11);
        }
        if (this.A02 != null) {
            this.A02.A08(j11);
        }
        for (int i10 = 0; i10 < this.A07.size(); i10++) {
            this.A07.valueAt(i10).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2403lN interfaceC2403lN) throws IOException {
        byte[] bArr = new byte[14];
        interfaceC2403lN.AG9(bArr, 0, 14);
        if (442 != (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        byte b10 = bArr[13];
        if (A0B[3].charAt(12) == 'n') {
            throw new RuntimeException();
        }
        A0B[2] = "VV5ZPjEmtEUa5x1ycfEwWXr";
        int packStuffingLength = b10 & 7;
        interfaceC2403lN.A3z(packStuffingLength);
        interfaceC2403lN.AG9(bArr, 0, 3);
        int packStuffingLength2 = bArr[0];
        int i10 = (packStuffingLength2 & 255) << 16;
        int packStuffingLength3 = bArr[1];
        int i11 = i10 | ((packStuffingLength3 & 255) << 8);
        int packStuffingLength4 = bArr[2];
        return 1 == ((packStuffingLength4 & 255) | i11);
    }
}
