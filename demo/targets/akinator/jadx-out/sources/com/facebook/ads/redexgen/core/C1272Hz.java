package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Hz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1272Hz {
    public static String[] A0B = {"nEg82cXZVYZFfZdDmhKyBuPXw98CjCqr", "lWWNRS3KueXb9Tbf73wyUq3w1CVt7zYo", "9i1TifP67Pthfk8s9WN", "2Mfz8aUpVuODbM0LRRY7IzxNE33rrKDp", "lWmgQQDKaNBy8Pu2POQEfpeN2vAsVVBR", "WAUg7lL5KFyy4cAmNpLa1cxU0cT6TIeS", "jMg6XDLnbUHNrmDX3ZR", "RwGxvdCbKX59SF6mGNLLwZG43nCYkk8W"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C1271Hy> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1272Hz A02(C4J c4j) {
        long jA0Q = c4j.A0Q();
        boolean z10 = (c4j.A0I() & 128) != 0;
        boolean z11 = false;
        boolean z12 = false;
        long jA0Q2 = C.TIME_UNSET;
        ArrayList arrayList = new ArrayList();
        int iA0M = 0;
        int iA0I = 0;
        int iA0I2 = 0;
        boolean z13 = false;
        long jA0Q3 = C.TIME_UNSET;
        if (!z10) {
            int iA0I3 = c4j.A0I();
            z11 = (iA0I3 & 128) != 0;
            z12 = (iA0I3 & 64) != 0;
            if (A0B[3].charAt(19) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[0] = "nLO0WJRxYuU9qthfzcYyP1P8ccIGaxOi";
            strArr[1] = "OIpoqKTSq2Ia2FsBUXzy5KxMNemzaoxr";
            boolean z14 = (iA0I3 & 32) != 0;
            if (z12) {
                jA0Q2 = c4j.A0Q();
            }
            if (!z12) {
                int iA0I4 = c4j.A0I();
                arrayList = new ArrayList(iA0I4);
                for (int i10 = 0; i10 < iA0I4; i10++) {
                    arrayList.add(new C1271Hy(c4j.A0I(), c4j.A0Q(), null));
                }
                if (A0B[3].charAt(19) == '7') {
                    A0B[4] = "ZIJV8CxCO5lc3X0ct1XMotdLhBio9GzL";
                }
            }
            if (z14) {
                long jA0I = c4j.A0I();
                z13 = (128 & jA0I) != 0;
                jA0Q3 = (1000 * (((1 & jA0I) << 32) | c4j.A0Q())) / 90;
            }
            iA0M = c4j.A0M();
            iA0I = c4j.A0I();
            iA0I2 = c4j.A0I();
        }
        return new C1272Hz(jA0Q, z10, z11, z12, arrayList, jA0Q2, z13, jA0Q3, iA0M, iA0I, iA0I2);
    }

    public C1272Hz(long j10, boolean z10, boolean z11, boolean z12, List<C1271Hy> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.A04 = j10;
        this.A0A = z10;
        this.A08 = z11;
        this.A09 = z12;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j11;
        this.A07 = z13;
        this.A03 = j12;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public C1272Hz(Parcel parcel) {
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(C1271Hy.A00(parcel));
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static C1272Hz A00(Parcel parcel) {
        return new C1272Hz(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
