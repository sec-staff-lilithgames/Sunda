package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2263it implements M5 {
    public static byte[] A07;
    public static String[] A08 = {"F3MsLf6P", "OcoAPMR8U6yTwuATNsSjihct3nuq8KFx", "bdE6GcC1kS6ix1fgAcoyQkC9rv", "V0wqj6Me", "EdnIrf", "cKhO3MBZMfPQ2uYBFx142UbqGZ0vcEvq", "x8zWNoAeDf", "YEiR7yHxtXFy2pC0Q9KvxgBtY"};
    public MC A00;
    public boolean A01;
    public final C3O A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "SFj9nJw9GR";
            strArr2[4] = "liv3w1";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 117);
            i13++;
        }
    }

    public static void A03() {
        A07 = new byte[]{11, 15, 29};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, M4> map) throws IOException {
        try {
            C3N c3nA03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new MC(c3nA03);
            } else {
                this.A00.A00(c3nA03);
            }
            MC mc2 = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(mc2);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.A06 ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) AbstractC09264a.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) AbstractC09264a.A0f(this.A04)).init(1, (Key) AbstractC09264a.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(mc2, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                    throw new IllegalStateException(e10);
                }
            }
            dataOutputStream.writeInt(map.size());
            int iA00 = 0;
            for (M4 m42 : map.values()) {
                A04(m42, dataOutputStream);
                iA00 += A00(m42, 2);
            }
            dataOutputStream.writeInt(iA00);
            this.A02.A06(dataOutputStream);
            AbstractC09264a.A10(null);
        } catch (Throwable th2) {
            AbstractC09264a.A10(null);
            throw th2;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, M4> map, SparseArray<String> sparseArray) throws IOException {
        if (!this.A02.A07()) {
            return true;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i10 = dataInputStream.readInt();
            if (i10 < 0 || i10 > 2) {
                AbstractC09264a.A10(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A04 == null) {
                    AbstractC09264a.A10(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A04.init(2, (Key) AbstractC09264a.A0f(this.A05), new IvParameterSpec(bArr));
                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                    throw new IllegalStateException(e10);
                }
            } else if (this.A06) {
                this.A01 = true;
            }
            int i11 = dataInputStream.readInt();
            int iA00 = 0;
            for (int i12 = 0; i12 < i11; i12++) {
                M4 m4A01 = A01(i10, dataInputStream);
                map.put(m4A01.A02, m4A01);
                sparseArray.put(m4A01.A01, m4A01.A02);
                iA00 += A00(m4A01, i10);
            }
            int i13 = dataInputStream.readInt();
            boolean z10 = dataInputStream.read() == -1;
            if (i13 == iA00 && z10) {
                AbstractC09264a.A10(dataInputStream);
                return true;
            }
            AbstractC09264a.A10(dataInputStream);
            return false;
        } catch (IOException unused) {
            if (0 != 0) {
                AbstractC09264a.A10(null);
            }
            return false;
        } catch (Throwable th2) {
            if (0 != 0) {
                AbstractC09264a.A10(null);
            }
            throw th2;
        }
    }

    static {
        A03();
    }

    public C2263it(File file, byte[] bArr, boolean z10) {
        C3M.A08((bArr == null && z10) ? false : true);
        Cipher cipherA05 = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            C3M.A07(bArr.length == 16);
            try {
                cipherA05 = M6.A05();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 85));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            C3M.A07(!z10);
        }
        this.A06 = z10;
        this.A04 = cipherA05;
        this.A05 = secretKeySpec;
        this.A03 = z10 ? new SecureRandom() : null;
        this.A02 = new C3O(file);
    }

    private int A00(M4 m42, int i10) {
        int result = m42.A01;
        int i11 = result * 31;
        int result2 = m42.A02.hashCode();
        int result3 = i11 + result2;
        if (i10 < 2) {
            long jA00 = M7.A00(m42.A03());
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + m42.A03().hashCode();
    }

    private M4 A01(int i10, DataInputStream dataInputStream) throws IOException {
        C2262is c2262isA02;
        int i11 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i10 >= 2) {
            c2262isA02 = M6.A02(dataInputStream);
        } else {
            long length = dataInputStream.readLong();
            M9 m9 = new M9();
            M9.A00(m9, length);
            c2262isA02 = C2262is.A03.A05(m9);
        }
        return new M4(i11, utf, c2262isA02);
    }

    private void A04(M4 m42, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(m42.A01);
        dataOutputStream.writeUTF(m42.A02);
        M6.A08(m42.A03(), dataOutputStream);
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void A5h() {
        this.A02.A05();
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final boolean A6K() {
        return this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AA7(long j10) {
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AAj(HashMap<String, M4> map, SparseArray<String> sparseArray) {
        C3M.A08(!this.A01);
        if (!A06(map, sparseArray)) {
            map.clear();
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A08[7] = "LXlnn5Px";
            sparseArray.clear();
            this.A02.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AEv(M4 m42, boolean z10) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AFa(M4 m42) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AJX(HashMap<String, M4> map) throws IOException {
        A05(map);
        this.A01 = false;
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AJY(HashMap<String, M4> map) throws IOException {
        if (!this.A01) {
            return;
        }
        AJX(map);
    }
}
