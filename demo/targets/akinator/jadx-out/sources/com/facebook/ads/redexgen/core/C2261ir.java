package com.facebook.ads.redexgen.core;

import android.os.ConditionVariable;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.ir, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2261ir implements InterfaceC1364Ln {
    public static byte[] A0B;
    public static String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final HashSet<File> A0D;
    public long A00;
    public long A01;
    public C1361Lk A02;
    public boolean A03;
    public final InterfaceC2266iw A04;
    public final C1370Lt A05;
    public final M6 A06;
    public final File A07;
    public final HashMap<String, ArrayList<InterfaceC1363Lm>> A08;
    public final Random A09;
    public final boolean A0A;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 43);
            i13++;
        }
    }

    public static void A07() {
        A0B = new byte[]{110, 53, 41, 36, 99, 76, 77, 86, 74, 71, 80, 2, 113, 75, 79, 82, 78, 71, 97, 67, 65, 74, 71, 2, 75, 76, 81, 86, 67, 76, 65, 71, 2, 87, 81, 71, 81, 2, 86, 74, 71, 2, 68, 77, 78, 70, 71, 80, 24, 2, 114, 79, 88, 103, 91, 86, 78, 82, 69, 13, 100, 94, 90, 71, 91, 82, 116, 86, 84, 95, 82, 126, 89, 94, 67, 35, 4, 12, 9, 0, 1, 69, 17, 10, 69, 6, 23, 0, 4, 17, 0, 69, 48, 44, 33, 69, 3, 12, 9, 0, 95, 69, 31, 56, 48, 53, 60, 61, 121, 45, 54, 121, 58, 43, 60, 56, 45, 60, 121, 58, 56, 58, 49, 60, 121, 12, 16, 29, 99, 121, 108, 75, 67, 70, 79, 78, 10, 94, 69, 10, 73, 88, 79, 75, 94, 79, 10, 73, 75, 73, 66, 79, 10, 78, 67, 88, 79, 73, 94, 69, 88, 83, 16, 10, 112, 87, 95, 90, 83, 82, 22, 66, 89, 22, 95, 88, 95, 66, 95, 87, 90, 95, 76, 83, 22, 85, 87, 85, 94, 83, 22, 95, 88, 82, 95, 85, 83, 69, 12, 22, 43, 12, 4, 1, 8, 9, 77, 25, 2, 77, 1, 4, 30, 25, 77, 14, 12, 14, 5, 8, 77, 9, 4, 31, 8, 14, 25, 2, 31, 20, 77, 11, 4, 1, 8, 30, 87, 77, 48, 23, 31, 26, 19, 18, 86, 2, 25, 86, 4, 19, 27, 25, 0, 19, 86, 16, 31, 26, 19, 86, 31, 24, 18, 19, 14, 86, 19, 24, 2, 4, 15, 86, 16, 25, 4, 76, 86, 56, 20, 25, 19, 26, 7, 24, 16, 17, 85, 32, 60, 49, 85, 19, 28, 25, 16, 79, 85, 102, 92, 88, 69, 89, 80, 118, 84, 86, 93, 80, 97, 70, 93, 64, 91, 92, 85, 18, 91, 92, 86, 87, 74, 18, 84, 91, 94, 87, 18, 84, 83, 91, 94, 87, 86};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0G(java.io.File r18, boolean r19, java.io.File[] r20, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C1369Ls> r21) throws java.lang.NumberFormatException {
        /*
            r17 = this;
            r6 = r17
            r8 = r20
            if (r8 == 0) goto L9
            int r0 = r8.length
            if (r0 != 0) goto Lf
        L9:
            if (r19 != 0) goto Le
            r18.delete()
        Le:
            return
        Lf:
            int r5 = r8.length
            r4 = 0
            r3 = 0
        L12:
            if (r3 >= r5) goto Laa
            r11 = r8[r3]
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2261ir.A0C
            r0 = 2
            r1 = r1[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            r0 = 56
            if (r1 == r0) goto La4
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2261ir.A0C
            java.lang.String r1 = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7"
            r0 = 7
            r2[r0] = r1
            java.lang.String r2 = r11.getName()
            r7 = r21
            if (r19 == 0) goto L4c
            r0 = 46
            int r1 = r2.indexOf(r0)
            r0 = -1
            if (r1 != r0) goto L4c
            java.io.File[] r0 = r11.listFiles()
            r6.A0G(r11, r4, r0, r7)
        L49:
            int r3 = r3 + 1
            goto L12
        L4c:
            if (r19 == 0) goto L7b
            boolean r10 = com.facebook.ads.redexgen.core.M6.A0A(r2)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2261ir.A0C
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto La4
            java.lang.String[] r9 = com.facebook.ads.redexgen.core.C2261ir.A0C
            java.lang.String r1 = "SjNVVRrUmgTFjXqPeyNmbh"
            r0 = 3
            r9[r0] = r1
            java.lang.String r1 = "SAWP83LvD"
            r0 = 4
            r9[r0] = r1
            if (r10 != 0) goto L49
            r9 = 0
            r1 = 4
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r0 = A04(r9, r1, r0)
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L7b
            goto L49
        L7b:
            r12 = -1
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L9e
            java.lang.Object r0 = r7.remove(r2)
            com.facebook.ads.redexgen.X.Ls r0 = (com.facebook.ads.redexgen.core.C1369Ls) r0
        L8a:
            if (r0 == 0) goto L90
            long r12 = r0.A01
            long r14 = r0.A00
        L90:
            com.facebook.ads.redexgen.X.M6 r0 = r6.A06
            r16 = r0
            com.facebook.ads.redexgen.X.iq r0 = com.facebook.ads.redexgen.core.C2260iq.A01(r11, r12, r14, r16)
            if (r0 == 0) goto La0
            r6.A0C(r0)
            goto L49
        L9e:
            r0 = 0
            goto L8a
        La0:
            r11.delete()
            goto L49
        La4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2261ir.A0G(java.io.File, boolean, java.io.File[], java.util.Map):void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized NavigableSet<C1374Lx> A0I(String str) {
        M4 m4A0C;
        C3M.A08(!this.A03);
        m4A0C = this.A06.A0C(str);
        return (m4A0C == null || m4A0C.A09()) ? new TreeSet() : new TreeSet((Collection) m4A0C.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized long A73(String str, long j10, long j11) {
        long j12;
        long j13 = j10;
        synchronized (this) {
            long j14 = j11 == -1 ? Long.MAX_VALUE : j13 + j11;
            if (j14 < 0) {
                j14 = Long.MAX_VALUE;
            }
            j12 = 0;
            while (j13 < j14) {
                long jA74 = A74(str, j13, j14 - j13);
                if (jA74 > 0) {
                    j12 += jA74;
                } else {
                    jA74 = -jA74;
                }
                j13 += jA74;
            }
        }
        return j12;
    }

    static {
        A07();
        A0D = new HashSet<>();
    }

    @Deprecated
    public C2261ir(File file, InterfaceC2266iw interfaceC2266iw) {
        this(file, interfaceC2266iw, (byte[]) null, false);
    }

    public C2261ir(File file, InterfaceC2266iw interfaceC2266iw, InterfaceC09384m interfaceC09384m, byte[] bArr, boolean z10, boolean z11) {
        C1370Lt c1370Lt;
        M6 m62 = new M6(interfaceC09384m, file, bArr, z10, z11);
        if (interfaceC09384m != null && !z11) {
            c1370Lt = new C1370Lt(interfaceC09384m);
        } else {
            c1370Lt = null;
        }
        this(file, interfaceC2266iw, m62, c1370Lt);
    }

    public C2261ir(File file, InterfaceC2266iw interfaceC2266iw, M6 m62, C1370Lt c1370Lt) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC2266iw;
            this.A06 = m62;
            this.A05 = c1370Lt;
            this.A08 = new HashMap<>();
            this.A09 = new Random();
            this.A0A = interfaceC2266iw.AHz();
            this.A01 = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new MD(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A04(4, 46, 9) + file);
    }

    @Deprecated
    public C2261ir(File file, InterfaceC2266iw interfaceC2266iw, byte[] bArr, boolean z10) {
        this(file, interfaceC2266iw, null, bArr, z10, true);
    }

    public static long A00(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + A04(0, 4, 107));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(File[] fileArr) {
        for (File file : fileArr) {
            String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, 107))) {
                try {
                    return A01(fileName);
                } catch (NumberFormatException unused) {
                    AnonymousClass44.A05(A04(297, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private C2260iq A03(String str, long j10, long j11) {
        C2260iq c2260iqA04;
        M4 m4A0C = this.A06.A0C(str);
        if (m4A0C == null) {
            return C2260iq.A04(str, j10, j11);
        }
        while (true) {
            c2260iqA04 = m4A0C.A04(j10, j11);
            if (!c2260iqA04.A05 || c2260iqA04.A03.length() == c2260iqA04.A01) {
                break;
            }
            A06();
        }
        return c2260iqA04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() throws NumberFormatException {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (C1361Lk e10) {
                this.A02 = e10;
                return;
            }
        }
        File file = this.A07;
        String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        File[] fileArrListFiles = file.listFiles();
        String strA04 = A04(297, 11, 30);
        if (fileArrListFiles == null) {
            String str = A04(200, 38, 70) + this.A07;
            AnonymousClass44.A05(strA04, str);
            this.A02 = new C1361Lk(str);
            return;
        }
        this.A01 = A02(fileArrListFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (IOException e11) {
                String str2 = A04(102, 28, 114) + this.A07;
                AnonymousClass44.A08(strA04, str2, e11);
                this.A02 = new C1361Lk(str2, e11);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                Map<String, C1369Ls> mapA05 = this.A05.A05();
                A0G(this.A07, true, fileArrListFiles, mapA05);
                this.A05.A09(mapA05.keySet());
            } else {
                A0G(this.A07, true, fileArrListFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (IOException e12) {
                AnonymousClass44.A08(strA04, A04(308, 25, 25), e12);
            }
        } catch (IOException e13) {
            String str3 = A04(164, 36, 29) + this.A07;
            AnonymousClass44.A08(strA04, str3, e13);
            this.A02 = new C1361Lk(str3, e13);
        }
    }

    private void A06() {
        ArrayList arrayList = new ArrayList();
        Iterator<M4> it = this.A06.A0G().iterator();
        while (it.hasNext()) {
            Iterator<C2260iq> it2 = it.next().A06().iterator();
            while (it2.hasNext()) {
                C2260iq next = it2.next();
                if (next.A03.length() != next.A01) {
                    arrayList.add(next);
                }
            }
        }
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[5];
            int i11 = str.charAt(29);
            if (i11 != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i10 < size) {
                A0A((C1374Lx) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws C1361Lk {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(C1374Lx c1374Lx) {
        ArrayList<InterfaceC1363Lm> arrayList = this.A08.get(c1374Lx.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).AFK(this, c1374Lx);
            }
        }
        this.A04.AFK(this, c1374Lx);
    }

    private void A0A(C1374Lx c1374Lx) {
        M4 m4A0C = this.A06.A0C(c1374Lx.A04);
        if (m4A0C == null || !m4A0C.A0D(c1374Lx)) {
            return;
        }
        this.A00 -= c1374Lx.A01;
        if (this.A05 != null) {
            String name = c1374Lx.A03.getName();
            try {
                this.A05.A07(name);
            } catch (IOException unused) {
                AnonymousClass44.A07(A04(297, 11, 30), A04(238, 39, 93) + name);
            }
        }
        this.A06.A0K(m4A0C.A02);
        A09(c1374Lx);
    }

    private void A0C(C2260iq c2260iq) {
        this.A06.A0D(c2260iq.A04).A08(c2260iq);
        this.A00 += c2260iq.A01;
        A0D(c2260iq);
    }

    private void A0D(C2260iq c2260iq) {
        ArrayList<InterfaceC1363Lm> arrayList = this.A08.get(c2260iq.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                InterfaceC1363Lm interfaceC1363Lm = arrayList.get(size);
                int i10 = A0C[0].length();
                if (i10 == 2) {
                    throw new RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                interfaceC1363Lm.AFJ(this, c2260iq);
            }
        }
        this.A04.AFJ(this, c2260iq);
    }

    private void A0E(C2260iq c2260iq, C1374Lx c1374Lx) {
        ArrayList<InterfaceC1363Lm> arrayList = this.A08.get(c2260iq.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).AFL(this, c2260iq, c1374Lx);
            }
        }
        this.A04.AFL(this, c2260iq, c1374Lx);
    }

    public static void A0F(File file) throws C1361Lk {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = A04(130, 34, 1) + file;
        String message = A04(297, 11, 30);
        AnonymousClass44.A05(message, str);
        throw new C1361Lk(str);
    }

    public static synchronized boolean A0H(File file) {
        return A0D.add(file.getAbsoluteFile());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized void A46(String str, M9 m9) throws C1361Lk {
        C3M.A08(!this.A03);
        A08();
        this.A06.A0L(str, m9);
        try {
            this.A06.A0I();
        } catch (IOException e10) {
            throw new C1361Lk(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized void A4x(File file, long j10) throws C1361Lk {
        C3M.A08(!this.A03);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            C2260iq c2260iq = (C2260iq) C3M.A01(C2260iq.A02(file, j10, this.A06));
            M4 m42 = (M4) C3M.A01(this.A06.A0C(c2260iq.A04));
            C3M.A08(m42.A0B(c2260iq.A02, c2260iq.A01));
            long jA00 = M7.A00(m42.A03());
            if (jA00 != -1) {
                C3M.A08(c2260iq.A02 + c2260iq.A01 <= jA00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c2260iq.A01, c2260iq.A00);
                    A0C(c2260iq);
                    try {
                        this.A06.A0I();
                        notifyAll();
                        return;
                    } catch (IOException e10) {
                        throw new C1361Lk(e10);
                    }
                } catch (IOException e11) {
                    throw new C1361Lk(e11);
                }
            }
            A0C(c2260iq);
            this.A06.A0I();
            notifyAll();
            return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized long A72() {
        C3M.A08(!this.A03);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    @MetaExoPlayerCustomization
    public final synchronized long A74(String str, long j10, long j11) {
        M4 cachedContent;
        C3M.A08(!this.A03);
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j10, j11) : -j11;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized M8 A7K(String str) {
        C3M.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized void AGw(C1374Lx c1374Lx) {
        C3M.A08(!this.A03);
        M4 m42 = (M4) C3M.A01(this.A06.A0C(c1374Lx.A04));
        m42.A07(c1374Lx.A02);
        this.A06.A0K(m42.A02);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized void AHk(String str) {
        C3M.A08(!this.A03);
        Iterator<C1374Lx> it = A0I(str).iterator();
        while (it.hasNext()) {
            A0A(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized void AHl(C1374Lx c1374Lx) {
        C3M.A08(!this.A03);
        A0A(c1374Lx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized File AJN(String str, long lastTouchTimestamp, long j10) throws C1361Lk {
        M4 m4A0C;
        File file;
        C3M.A08(!this.A03);
        A08();
        m4A0C = this.A06.A0C(str);
        C3M.A01(m4A0C);
        C3M.A08(m4A0C.A0B(lastTouchTimestamp, j10));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AFM(this, str, lastTouchTimestamp, j10);
        file = new File(this.A07, Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return C2260iq.A05(file, m4A0C.A01, lastTouchTimestamp, System.currentTimeMillis());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized C1374Lx AJP(String str, long j10, long j11, EnumC1362Ll enumC1362Ll) throws InterruptedException, C1361Lk {
        C1374Lx span;
        C3M.A08(!this.A03);
        A08();
        while (true) {
            span = AJQ(str, j10, j11, enumC1362Ll);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1364Ln
    public final synchronized C2260iq AJQ(String str, long j10, long j11, EnumC1362Ll enumC1362Ll) throws C1361Lk {
        C3M.A08(!this.A03);
        A08();
        C2260iq c2260iqA03 = A03(str, j10, j11);
        if (c2260iqA03.A05) {
            C2260iq span = this.A06.A0C(str).A05(c2260iqA03, c2260iqA03.A00, false);
            A0E(c2260iqA03, span);
            return span;
        }
        if (this.A06.A0D(str).A0C(j10, c2260iqA03.A01)) {
            return c2260iqA03;
        }
        return null;
    }
}
