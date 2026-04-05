package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1338Kn {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1336Kl A02(InterfaceC2403lN interfaceC2403lN) throws IOException {
        byte[] bArr;
        C4J c4j = new C4J(16);
        C1337Km c1337KmA03 = A03(1718449184, interfaceC2403lN, c4j);
        C3M.A08(c1337KmA03.A01 >= 16);
        interfaceC2403lN.AG9(c4j.A0l(), 0, 16);
        c4j.A0f(0);
        int iA0G = c4j.A0G();
        int iA0G2 = c4j.A0G();
        int iA0F = c4j.A0F();
        int iA0F2 = c4j.A0F();
        int iA0G3 = c4j.A0G();
        int iA0G4 = c4j.A0G();
        int i10 = ((int) c1337KmA03.A01) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC2403lN.AG9(bArr, 0, i10);
        } else {
            bArr = AbstractC09264a.A07;
        }
        interfaceC2403lN.AJJ((int) (interfaceC2403lN.A8a() - interfaceC2403lN.A8f()));
        return new C1336Kl(iA0G, iA0G2, iA0F, iA0F2, iA0G3, iA0G4, bArr);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, 16, 13, 22, 19, 88, 17, 11, 88, 12, 23, 23, 88, 20, 25, 10, 31, 29, 88, 80, 6, 74, Utf8.REPLACEMENT_BYTE, 58, 83, 81, 88, 12, 23, 88, 11, 19, 17, 8, 67, 88, 17, 28, 66, 88, 45, 3, 10, 11, 22, 13, 10, 3, 68, 17, 10, 15, 10, 11, 19, 10, 68, 51, 37, 50, 68, 7, 12, 17, 10, 15, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, 28, 90, 83, 78, 81, 28, 72, 69, 76, 89, 6, 28, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC2403lN interfaceC2403lN) throws IOException {
        C4J c4j = new C4J(8);
        C1337Km chunkHeader = C1337Km.A00(interfaceC2403lN, c4j);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC2403lN.AI1();
            return -1L;
        }
        interfaceC2403lN.A3z(8);
        c4j.A0f(0);
        interfaceC2403lN.AG9(c4j.A0l(), 0, 8);
        long sampleDataSize = c4j.A0N();
        interfaceC2403lN.AJJ(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC2403lN interfaceC2403lN) throws IOException {
        interfaceC2403lN.AI1();
        C1337Km c1337KmA03 = A03(1684108385, interfaceC2403lN, new C4J(8));
        interfaceC2403lN.AJJ(8);
        return Pair.create(Long.valueOf(interfaceC2403lN.A8f()), Long.valueOf(c1337KmA03.A01));
    }

    public static C1337Km A03(int i10, InterfaceC2403lN interfaceC2403lN, C4J c4j) throws IOException {
        C1337Km c1337KmA00 = C1337Km.A00(interfaceC2403lN, c4j);
        while (c1337KmA00.A00 != i10) {
            AnonymousClass44.A07(A04(91, 15, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), A04(40, 28, 39) + c1337KmA00.A00);
            long j10 = c1337KmA00.A01 + 8;
            if (j10 <= 2147483647L) {
                interfaceC2403lN.AJJ((int) j10);
                c1337KmA00 = C1337Km.A00(interfaceC2403lN, c4j);
            } else {
                throw C08822i.A00(A04(0, 40, 59) + c1337KmA00.A00);
            }
        }
        return c1337KmA00;
    }

    public static boolean A06(InterfaceC2403lN interfaceC2403lN) throws IOException {
        C4J c4j = new C4J(8);
        C1337Km c1337KmA00 = C1337Km.A00(interfaceC2403lN, c4j);
        if (c1337KmA00.A00 != 1380533830) {
            int i10 = c1337KmA00.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i10 != 1380333108) {
                return false;
            }
        }
        interfaceC2403lN.AG9(c4j.A0l(), 0, 4);
        c4j.A0f(0);
        int iA0C = c4j.A0C();
        if (iA0C != 1463899717) {
            AnonymousClass44.A05(A04(91, 15, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), A04(68, 23, 127) + iA0C);
            return false;
        }
        return true;
    }
}
