package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* loaded from: assets/audience_network.dex */
public final class M6 {
    public static byte[] A06;
    public static String[] A07 = {"1eaMPdLcC8DbZCkn0iIyVPFCZSdDAanS", "Exaxr4PlErBkBzdiwoicKn", "2BC", "jQaYCx7PV0mXn8Zj7H8rC7xxlui6spsC", "wp2nCKHDQcjkZqDMhhhKbFGW7G", "lMJ", "SjVm96go47njO9ADG8uLls", "QdN"};
    public M5 A00;
    public M5 A01;
    public final SparseArray<String> A02;
    public final SparseBooleanArray A03;
    public final SparseBooleanArray A04;
    public final HashMap<String, M4> A05;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A06 = new byte[]{20, 16, 6, 122, 22, 23, 22, 122, 5, 30, 22, 6, 96, 5, 20, 17, 17, 28, 27, 18, 32, 33, 66, 101, 125, 106, 103, 98, 111, 43, 125, 106, 103, 126, 110, 43, 120, 98, 113, 110, 49, 43, AbstractJsonLexerKt.TC_INVALID, 125, AbstractJsonLexerKt.TC_INVALID, 116, 121, 120, 67, AbstractJsonLexerKt.TC_INVALID, 115, 114, 104, 121, 114, 104, 67, 117, 114, 120, 121, 100, 50, 121, 100, 117};
    }

    static {
        A07();
    }

    public M6(InterfaceC09384m interfaceC09384m, File file, byte[] bArr, boolean z10, boolean z11) {
        C3M.A08((interfaceC09384m == null && file == null) ? false : true);
        this.A05 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A04 = new SparseBooleanArray();
        this.A03 = new SparseBooleanArray();
        C2264iu c2264iu = interfaceC09384m != null ? new C2264iu(interfaceC09384m) : null;
        M5 databaseStorage = file != null ? new C2263it(new File(file, A04(42, 24, 47)), bArr, z10) : null;
        if (c2264iu == null || (databaseStorage != null && z11)) {
            M5 legacyStorage = (M5) AbstractC09264a.A0f(databaseStorage);
            this.A01 = legacyStorage;
            this.A00 = c2264iu;
        } else {
            this.A01 = c2264iu;
            this.A00 = databaseStorage;
        }
    }

    public static int A00(SparseArray<String> idToKey) {
        int id2;
        int size = idToKey.size();
        if (size == 0) {
            id2 = 0;
        } else {
            int size2 = size - 1;
            id2 = idToKey.keyAt(size2) + 1;
        }
        if (id2 < 0) {
            id2 = 0;
            while (id2 < size) {
                int size3 = idToKey.keyAt(id2);
                if (id2 != size3) {
                    break;
                }
                id2++;
            }
        }
        return id2;
    }

    private M4 A01(String str) {
        int iA00 = A00(this.A02);
        M4 m42 = new M4(iA00, str);
        this.A05.put(str, m42);
        this.A02.put(iA00, str);
        this.A03.put(iA00, true);
        this.A01.AFa(m42);
        return m42;
    }

    public static C2262is A02(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int nextBytesToRead = 0; nextBytesToRead < i10; nextBytesToRead++) {
            String utf = dataInputStream.readUTF();
            int bytesRead = dataInputStream.readInt();
            if (bytesRead >= 0) {
                int valueSize = 0;
                int i11 = Math.min(bytesRead, 10485760);
                byte[] bArrCopyOf = AbstractC09264a.A07;
                while (valueSize != bytesRead) {
                    int size = valueSize + i11;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    dataInputStream.readFully(bArrCopyOf, valueSize, i11);
                    valueSize += i11;
                    int size2 = bytesRead - valueSize;
                    i11 = Math.min(size2, 10485760);
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(A04(22, 20, 56) + bytesRead);
            }
        }
        return new C2262is(map);
    }

    public static Cipher A05() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i10 = AbstractC09264a.A02;
        String strA04 = A04(0, 20, 102);
        if (i10 == 18) {
            try {
                return Cipher.getInstance(strA04, A04(20, 2, 81));
            } catch (Throwable unused) {
            }
        }
        Cipher cipher = Cipher.getInstance(strA04);
        String[] strArr = A07;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "EBBbD5OLh9DYDBrMigQNtJ";
        strArr2[1] = "xQSZ94mu2vygjBv0Ab9r12";
        return cipher;
    }

    public static void A08(C2262is c2262is, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setA06 = c2262is.A06();
        dataOutputStream.writeInt(setA06.size());
        for (Map.Entry<String, byte[]> entry : setA06) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static boolean A0A(String str) {
        return str.startsWith(A04(42, 24, 47));
    }

    public final int A0B(String str) {
        return A0D(str).A01;
    }

    public final M4 A0C(String str) {
        return this.A05.get(str);
    }

    public final M4 A0D(String str) {
        M4 cachedContent = this.A05.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final C2262is A0E(String str) {
        M4 cachedContent = A0C(str);
        return cachedContent != null ? cachedContent.A03() : C2262is.A03;
    }

    public final String A0F(int i10) {
        return this.A02.get(i10);
    }

    public final Collection<M4> A0G() {
        return Collections.unmodifiableCollection(this.A05.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0H() {
        AbstractC2648pg abstractC2648pgA0N = AbstractC1080Al.A07(this.A05.keySet()).A0N();
        while (true) {
            boolean zHasNext = abstractC2648pgA0N.hasNext();
            String[] strArr = A07;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "jpVmrDDiLa6KSoRZ9DaLqT";
            strArr2[1] = "R0FMfILNqJLoUgBryCIaQS";
            if (zHasNext) {
                A0K((String) abstractC2648pgA0N.next());
            } else {
                return;
            }
        }
    }

    public final void A0I() throws IOException {
        this.A01.AJY(this.A05);
        int size = this.A04.size();
        for (int i10 = 0; i10 < size; i10++) {
            SparseArray<String> sparseArray = this.A02;
            int removedIdCount = this.A04.keyAt(i10);
            sparseArray.remove(removedIdCount);
        }
        this.A04.clear();
        this.A03.clear();
    }

    public final void A0J(long j10) throws IOException {
        this.A01.AA7(j10);
        if (this.A00 != null) {
            this.A00.AA7(j10);
        }
        if (!this.A01.A6K() && this.A00 != null && this.A00.A6K()) {
            this.A00.AAj(this.A05, this.A02);
            this.A01.AJX(this.A05);
        } else {
            this.A01.AAj(this.A05, this.A02);
        }
        if (this.A00 != null) {
            M5 m52 = this.A00;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "sHyLaDKMqWdH53QwNCQNuy";
            strArr2[1] = "kZIq1iKkwSA0yGMJ22HAvZ";
            m52.A5h();
            this.A00 = null;
        }
    }

    public final void A0K(String str) {
        M4 m42 = this.A05.get(str);
        if (m42 != null && m42.A09() && m42.A0A()) {
            this.A05.remove(str);
            int i10 = m42.A01;
            boolean z10 = this.A03.get(i10);
            this.A01.AEv(m42, z10);
            if (z10) {
                this.A02.remove(i10);
                this.A03.delete(i10);
            } else {
                this.A02.put(i10, null);
                this.A04.put(i10, true);
            }
        }
    }

    public final void A0L(String str, M9 m9) {
        M4 m4A0D = A0D(str);
        if (m4A0D.A0E(m9)) {
            this.A01.AFa(m4A0D);
        }
    }
}
