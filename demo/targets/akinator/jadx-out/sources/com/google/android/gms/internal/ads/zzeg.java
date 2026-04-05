package com.google.android.gms.internal.ads;

import b0.e2;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeg {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgpo zzc = zzgpo.zzl(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean zzd = new AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzeg(byte[] bArr, int i10) {
        this.zze = bArr;
        this.zzg = i10;
    }

    private final char zzS(ByteOrder byteOrder, int i10) {
        zzW(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i11 = this.zzf + i10;
            return zzgsq.zza(bArr[i11], bArr[i11 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i12 = this.zzf + i10;
        return zzgsq.zza(bArr2[i12 + 1], bArr2[i12]);
    }

    private final char zzT(Charset charset, char[] cArr) {
        int iZzU;
        if (zzd() >= zzV(charset) && (iZzU = zzU(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j10 = i;
                char c10 = (char) j10;
                zzgmd.zze(((long) c10) == j10, "Out of range: %s", j10);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.zzf = zzgst.zza(iZzU & 255) + this.zzf;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    private final int zzU(Charset charset) {
        int codePoint;
        int i10;
        int iZzY;
        zzgmd.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i11 = this.zzf;
            int i12 = this.zzg;
            throw new IndexOutOfBoundsException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i11, i12, "position=", ", limit=", new StringBuilder(String.valueOf(i11).length() + 17 + String.valueOf(i12).length())));
        }
        int i13 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.zze[this.zzf];
            if ((b10 & 128) == 0) {
                codePoint = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                return (codePoint << 8) | i13;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.zze[this.zzf];
            if ((b11 & 128) == 0) {
                i10 = 1;
            } else if ((b11 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i10 = 2;
            } else {
                if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                    byte[] bArr = this.zze;
                    int i14 = this.zzf;
                    if (zzX(bArr[i14 + 1]) && zzX(bArr[i14 + 2])) {
                        i10 = 3;
                    }
                }
                if ((this.zze[this.zzf] & 248) == 240 && zzd() >= 4) {
                    byte[] bArr2 = this.zze;
                    int i15 = this.zzf;
                    if (zzX(bArr2[i15 + 1]) && zzX(bArr2[i15 + 2]) && zzX(bArr2[i15 + 3])) {
                        i10 = 4;
                    }
                }
                i10 = 0;
            }
            if (i10 == 1) {
                iZzY = this.zze[this.zzf] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            } else if (i10 == 2) {
                byte[] bArr3 = this.zze;
                int i16 = this.zzf;
                iZzY = zzY(0, 0, bArr3[i16], bArr3[i16 + 1]);
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        byte[] bArr4 = this.zze;
                        int i17 = this.zzf;
                        iZzY = zzY(bArr4[i17], bArr4[i17 + 1], bArr4[i17 + 2], bArr4[i17 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i18 = this.zzf;
                iZzY = zzY(0, bArr5[i18] & 15, bArr5[i18 + 1], bArr5[i18 + 2]);
            }
            i13 = i10;
            codePoint = iZzY;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzS = zzS(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzS) || zzd() < 4) {
                codePoint = cZzS;
                i13 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzS, zzS(byteOrder, 2));
                i13 = 4;
            }
        }
        return (codePoint << 8) | i13;
    }

    private static int zzV(Charset charset) {
        zzgmd.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i10) {
        if (!zzd.get() || zzd() >= i10) {
            return;
        }
        int iZzd = zzd();
        throw new IndexOutOfBoundsException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i10, iZzd, "bytesNeeded= ", ", bytesLeft=", new StringBuilder(String.valueOf(i10).length() + 25 + String.valueOf(iZzd).length())));
    }

    private static boolean zzX(byte b10) {
        return (b10 & 192) == 128;
    }

    private static int zzY(int i10, int i11, int i12, int i13) {
        return zzgst.zze((byte) 0, zzgsx.zza(((i10 & 7) << 2) | ((i11 & 48) >> 4)), zzgsx.zza(((i12 & 60) >> 2) | ((i11 & 15) << 4)), zzgsx.zza((i13 & 63) | ((i12 & 3) << 6)));
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.zzf = i12;
        long j11 = bArr[i11];
        this.zzf = i10 + 3;
        long j12 = bArr[i12];
        this.zzf = i10 + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j10) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.zzf = i13;
        int i14 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i15 = i10 + 3;
        this.zzf = i15;
        int i16 = bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i10 + 4;
        return (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i12 << 24) | (i14 << 16) | (i16 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.zzf = i13;
        int i14 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i15 = i10 + 3;
        this.zzf = i15;
        int i16 = bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i10 + 4;
        return ((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i14 << 8) | i12 | (i16 << 16);
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.zzf = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.zzf = i13;
        long j12 = bArr[i12];
        int i14 = i10 + 4;
        this.zzf = i14;
        long j13 = bArr[i13];
        int i15 = i10 + 5;
        this.zzf = i15;
        long j14 = bArr[i14];
        int i16 = i10 + 6;
        this.zzf = i16;
        long j15 = bArr[i15];
        this.zzf = i10 + 7;
        long j16 = bArr[i16];
        this.zzf = i10 + 8;
        return ((j16 & 255) << 8) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.zzf = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.zzf = i13;
        long j12 = bArr[i12];
        int i14 = i10 + 4;
        this.zzf = i14;
        long j13 = bArr[i13];
        int i15 = i10 + 5;
        this.zzf = i15;
        long j14 = bArr[i14];
        int i16 = i10 + 6;
        this.zzf = i16;
        long j15 = bArr[i15];
        this.zzf = i10 + 7;
        long j16 = bArr[i16];
        this.zzf = i10 + 8;
        return ((j16 & 255) << 48) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i10 + 2;
        int i13 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i10 + 4;
        return (i12 << 8) | i13;
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int iZzB = zzB();
        if (iZzB >= 0) {
            return iZzB;
        }
        throw new IllegalStateException(o2.l(iZzB, "Top bit not zero: ", new StringBuilder(String.valueOf(iZzB).length() + 18)));
    }

    public final int zzI() {
        int iZzC = zzC();
        if (iZzC >= 0) {
            return iZzC;
        }
        throw new IllegalStateException(o2.l(iZzC, "Top bit not zero: ", new StringBuilder(String.valueOf(iZzC).length() + 18)));
    }

    public final long zzJ() {
        long jZzD = zzD();
        if (jZzD >= 0) {
            return jZzD;
        }
        throw new IllegalStateException(e2.i(jZzD, "Top bit not zero: ", new StringBuilder(String.valueOf(jZzD).length() + 18)));
    }

    public final String zzK(int i10, Charset charset) {
        zzW(i10);
        byte[] bArr = this.zze;
        int i11 = this.zzf;
        String str = new String(bArr, i11, i10, charset);
        this.zzf = i11 + i10;
        return str;
    }

    public final String zzL(int i10) {
        zzW(i10);
        if (i10 == 0) {
            return "";
        }
        int i11 = this.zzf;
        int i12 = (i11 + i10) - 1;
        String strZzj = zzep.zzj(this.zze, i11, (i12 >= this.zzg || this.zze[i12] != 0) ? i10 : i10 - 1);
        this.zzf += i10;
        return strZzj;
    }

    public final String zzM(char c10) {
        if (zzd() == 0) {
            return null;
        }
        int i10 = this.zzf;
        while (i10 < this.zzg && this.zze[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.zze;
        int i11 = this.zzf;
        String strZzj = zzep.zzj(bArr, i11, i10 - i11);
        this.zzf = i10;
        if (i10 < this.zzg) {
            this.zzf = i10 + 1;
        }
        return strZzj;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzN(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzgpo r0 = com.google.android.gms.internal.ads.zzeg.zzc
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = "Unsupported charset: %s"
            com.google.android.gms.internal.ads.zzgmd.zzf(r0, r1, r5)
            int r0 = r4.zzd()
            if (r0 != 0) goto L13
            r5 = 0
            return r5
        L13:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L1e
            r4.zzR()
        L1e:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            r2 = 1
            if (r1 != 0) goto L58
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2e
            goto L58
        L2e:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r2 = 2
            if (r0 != 0) goto L58
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L58
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L48
            goto L58
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Unsupported charset: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L58:
            int r0 = r4.zzf
        L5a:
            int r1 = r4.zzg
            int r3 = r2 + (-1)
            int r3 = r1 - r3
            if (r0 >= r3) goto Lb7
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L72
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L7c
        L72:
            byte[] r1 = r4.zze
            r1 = r1[r0]
            boolean r1 = com.google.android.gms.internal.ads.zzep.zzk(r1)
            if (r1 != 0) goto Lb8
        L7c:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L8c
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L9c
        L8c:
            byte[] r1 = r4.zze
            r3 = r1[r0]
            if (r3 != 0) goto L9c
            int r3 = r0 + 1
            r1 = r1[r3]
            boolean r1 = com.google.android.gms.internal.ads.zzep.zzk(r1)
            if (r1 != 0) goto Lb8
        L9c:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto Lb5
            int r1 = r0 + 1
            byte[] r3 = r4.zze
            r1 = r3[r1]
            if (r1 != 0) goto Lb5
            r1 = r3[r0]
            boolean r1 = com.google.android.gms.internal.ads.zzep.zzk(r1)
            if (r1 == 0) goto Lb5
            goto Lb8
        Lb5:
            int r0 = r0 + r2
            goto L5a
        Lb7:
            r0 = r1
        Lb8:
            int r1 = r4.zzf
            int r0 = r0 - r1
            java.lang.String r0 = r4.zzK(r0, r5)
            int r1 = r4.zzf
            int r2 = r4.zzg
            if (r1 == r2) goto Ld4
            char[] r1 = com.google.android.gms.internal.ads.zzeg.zza
            char r1 = r4.zzT(r5, r1)
            r2 = 13
            if (r1 != r2) goto Ld4
            char[] r1 = com.google.android.gms.internal.ads.zzeg.zzb
            r4.zzT(r5, r1)
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeg.zzN(java.nio.charset.Charset):java.lang.String");
    }

    public final long zzO() {
        int i10;
        zzW(1);
        long j10 = this.zze[this.zzf];
        int i11 = 7;
        while (true) {
            i10 = 0;
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j10) != 0) {
                i11--;
            } else if (i11 < 6) {
                j10 &= r7 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        if (i10 == 0) {
            throw new NumberFormatException(e2.i(j10, "Invalid UTF-8 sequence first byte: ", new StringBuilder(String.valueOf(j10).length() + 35)));
        }
        zzW(i10);
        for (int i12 = 1; i12 < i10; i12++) {
            if ((this.zze[this.zzf + i12] & 192) != 128) {
                throw new NumberFormatException(e2.i(j10, "Invalid UTF-8 sequence continuation byte: ", new StringBuilder(String.valueOf(j10).length() + 42)));
            }
            j10 = (j10 << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
        }
        this.zzf += i10;
        return j10;
    }

    public final long zzP() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.zzf == this.zzg) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzs = zzs();
            j10 |= (127 & jZzs) << (i10 * 7);
            if ((jZzs & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    public final Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i10 = this.zzf;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.zzf = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zzd() < 2) {
            return null;
        }
        byte[] bArr2 = this.zze;
        int i11 = this.zzf;
        byte b10 = bArr2[i11];
        if (b10 == -2) {
            if (bArr2[i11 + 1] != -1) {
                return null;
            }
            this.zzf = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.zzf = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void zza(int i10) {
        byte[] bArr = this.zze;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        zzb(bArr, i10);
    }

    public final void zzb(byte[] bArr, int i10) {
        this.zze = bArr;
        this.zzg = i10;
        this.zzf = 0;
    }

    public final void zzc(int i10) {
        byte[] bArr = this.zze;
        if (i10 > bArr.length) {
            this.zze = Arrays.copyOf(bArr, i10);
        }
    }

    public final int zzd() {
        return Math.max(this.zzg - this.zzf, 0);
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zze.length) {
            z10 = true;
        }
        zzgmd.zza(z10);
        this.zzg = i10;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzg) {
            z10 = true;
        }
        zzgmd.zza(z10);
        this.zzf = i10;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i10) {
        zzh(this.zzf + i10);
    }

    public final void zzl(zzef zzefVar, int i10) {
        zzm(zzefVar.zza, 0, i10);
        zzefVar.zzf(0);
    }

    public final void zzm(byte[] bArr, int i10, int i11) {
        zzW(i11);
        System.arraycopy(this.zze, this.zzf, bArr, i10, i11);
        this.zzf += i11;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final char zzo() {
        return zzS(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int zzp(Charset charset) {
        if (zzU(charset) != 0) {
            return zzgst.zza(r3 >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            this.zzf -= 3;
            return zzx();
        }
        int i10 = this.zzf;
        int i11 = this.zzg;
        throw new IndexOutOfBoundsException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i10, i11, "position=", ", limit=", new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length())));
    }

    public final int zzr() {
        if (zzd() >= 4) {
            this.zzf -= 4;
            return zzB();
        }
        int i10 = this.zzf;
        int i11 = this.zzg;
        throw new IndexOutOfBoundsException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i10, i11, "position=", ", limit=", new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length())));
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        this.zzf = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i10 + 2;
        return (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i12 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i10 + 2;
        return ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i10 + 2;
        return (short) ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i12 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i10 + 2;
        return (short) (((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.zzf = i13;
        int i14 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i12 << 16) | (i14 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.zzf = i13;
        int i14 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((i12 << 24) >> 8) | (i14 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.zzf = i12;
        long j11 = bArr[i11];
        this.zzf = i10 + 3;
        long j12 = bArr[i12];
        this.zzf = i10 + 4;
        return (bArr[r3] & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public zzeg() {
        this.zze = zzep.zzb;
    }

    public zzeg(int i10) {
        this.zze = new byte[i10];
        this.zzg = i10;
    }

    public zzeg(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}
