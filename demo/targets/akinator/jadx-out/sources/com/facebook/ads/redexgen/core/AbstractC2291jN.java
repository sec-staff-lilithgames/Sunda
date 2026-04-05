package com.facebook.ads.redexgen.core;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.jN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2291jN implements L0 {
    public static byte[] A01;
    public static String[] A02 = {"4DAkvqHjWkdxtsENcWrDGdSG98sD", "CPIXB1o90MQiuPbP92eKhpVYkKPF", "DGtgBZoK51CqJxDDYeEGQpaHQi4s0SFq", "q2rpceA7xA4MlkiWDdlnsMZ7", "2r2XHRwXRNnyuB7hHeEjqCG0ly7MmAbM", "cNy8DIpXdd1zCdtjTt40y0Ha9veHBSdV", "PaSGUfk9UsvkFfO4ZJ4PfqMh8E4Xd1Uq", "2zViWo7DbInVze1qYqueOVIk3x"};
    public static final String A03;
    public final ExecutorService A00 = Executors.newSingleThreadExecutor();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private long A02(List<File> list) {
        long length = 0;
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "APyHxukBWXIF2vPxbwif9xgIaD7vOq8q";
            strArr2[6] = "ZPgmzBD45Cog9pfLf6p2hYnwtjTNY0Gq";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 56);
            if (A02[7].length() == 15) {
                throw new RuntimeException();
            }
            A02[3] = "glcddFxLpqFQC46fw4icMEpE";
            bArrCopyOfRange[i13] = b10;
            i13++;
        }
    }

    public static void A04() {
        A01 = new byte[]{-115, -45, -36, -33, -115, -31, -33, -42, -38, -38, -42, -37, -44, -115, -48, -50, -48, -43, -46, AbstractJsonLexerKt.TC_INVALID, -56, -46, AbstractJsonLexerKt.TC_INVALID, -61, -60, -53, -60, -45, -60, -61, AbstractJsonLexerKt.TC_INVALID, -63, -60, -62, -64, -44, -46, -60, AbstractJsonLexerKt.TC_INVALID, -56, -45, AbstractJsonLexerKt.TC_INVALID, -60, -41, -62, -60, -60, -61, -46, AbstractJsonLexerKt.TC_INVALID, -62, -64, -62, -57, -60, AbstractJsonLexerKt.TC_INVALID, -53, -56, -52, -56, -45, -101, -71, -69, -64, -67, 120, -66, -63, -60, -67, 120, -39, 6, 6, 3, 6, -76, -8, -7, 0, -7, 8, -3, 2, -5, -76, -6, -3, 0, -7, -76};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A07(List<File> list) {
        long jA02 = A02(list);
        int size = list.size();
        for (File file : list) {
            if (!A08(file, jA02, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    jA02 -= length;
                    Log.i(A03, A03(61, 11, 32) + file + A03(19, 42, 39));
                } else {
                    Log.e(A03, A03(72, 20, 92) + file + A03(0, 19, 53));
                }
            }
        }
    }

    public abstract boolean A08(File file, long j10, int i10);

    static {
        A04();
        A03 = AbstractC2291jN.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(File file) throws IOException {
        L3.A03(file);
        List<File> files = L3.A01(file.getParentFile());
        A07(files);
    }

    @Override // com.facebook.ads.redexgen.core.L0
    public void AJg(File file) throws IOException {
        this.A00.submit(new L4(this, file));
    }
}
