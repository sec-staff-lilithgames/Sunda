package com.google.android.play.core.splitinstall.internal;

import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class l0 {
    public static int a(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(a.b.e(i10, "Unknown content digest algorthm: "));
    }

    public static int b(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(a.b.e(i10, "Unknown content digest algorthm: "));
    }

    public static ByteBuffer d(int i10, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer e(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(a.b.e(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return d(i10, byteBuffer);
        }
        throw new IOException(w0.i.a(i10, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    public static void f(int i10, byte[] bArr) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    public static byte[] g(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 > byteBuffer.remaining()) {
            throw new IOException(w0.i.a(i10, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static X509Certificate[] h(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferE = e(byteBuffer);
        ByteBuffer byteBufferE2 = e(byteBuffer);
        byte[] bArrG = g(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrG2 = null;
        byte[] bArrG3 = null;
        int i10 = -1;
        int i11 = 0;
        while (byteBufferE2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferE3 = e(byteBufferE2);
                if (byteBufferE3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferE3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (i12 != 513 && i12 != 514 && i12 != 769) {
                    switch (i12) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i10 != -1) {
                    int iB = b(i12);
                    int iB2 = b(i10);
                    if (iB != 1 && iB2 == 1) {
                    }
                }
                bArrG3 = g(byteBufferE3);
                i10 = i12;
            } catch (IOException e10) {
                e = e10;
                throw new SecurityException(a.b.e(i11, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e11) {
                e = e11;
                throw new SecurityException(a.b.e(i11, "Failed to parse signature record #"), e);
            }
        }
        if (i10 == -1) {
            if (i11 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i10 == 513 || i10 == 514) {
            str = "EC";
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            str = "DSA";
        }
        if (i10 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i10 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrG));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferE);
            if (!signature.verify(bArrG3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferE.clear();
            ByteBuffer byteBufferE4 = e(byteBufferE);
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (byteBufferE4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferE5 = e(byteBufferE4);
                    if (byteBufferE5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i14 = byteBufferE5.getInt();
                    arrayList2.add(Integer.valueOf(i14));
                    if (i14 == i10) {
                        bArrG2 = g(byteBufferE5);
                    }
                } catch (IOException e12) {
                    e = e12;
                    throw new IOException(a.b.e(i13, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e13) {
                    e = e13;
                    throw new IOException(a.b.e(i13, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iB3 = b(i10);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iB3), bArrG2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrG2)) {
                throw new SecurityException(c(iB3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferE6 = e(byteBufferE);
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            while (byteBufferE6.hasRemaining()) {
                i15++;
                byte[] bArrG4 = g(byteBufferE6);
                try {
                    arrayList3.add(new j0((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrG4)), bArrG4));
                } catch (CertificateException e14) {
                    throw new SecurityException(a.b.e(i15, "Failed to decode certificate #"), e14);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrG, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e15) {
            e = e15;
            throw new SecurityException(a.b.l("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e16) {
            e = e16;
            throw new SecurityException(a.b.l("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e17) {
            e = e17;
            throw new SecurityException(a.b.l("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e18) {
            e = e18;
            throw new SecurityException(a.b.l("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e19) {
            e = e19;
            throw new SecurityException(a.b.l("Failed to verify ", str2, " signature"), e);
        }
    }

    public static byte[][] i(int[] iArr, r[] rVarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        char c10;
        int i11 = 0;
        long jZza = 0;
        while (true) {
            j10 = 1048576;
            if (i11 >= 3) {
                break;
            }
            jZza += (rVarArr[i11].zza() + 1048575) / 1048576;
            i11++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(o2.m(jZza, "Too many chunks: "));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i12 = 0;
        while (true) {
            length = iArr.length;
            c10 = 5;
            if (i12 >= length) {
                break;
            }
            int i13 = (int) jZza;
            byte[] bArr2 = new byte[(a(iArr[i12]) * i13) + 5];
            bArr2[0] = 90;
            f(i13, bArr2);
            bArr[i12] = bArr2;
            i12++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String strC = c(iArr[i14]);
            try {
                messageDigestArr[i14] = MessageDigest.getInstance(strC);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strC.concat(" digest not supported"), e10);
            }
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (i10 = 3; i15 < i10; i10 = 3) {
            r rVar = rVarArr[i15];
            int i18 = i15;
            long jZza2 = rVar.zza();
            long j11 = 0;
            while (jZza2 > 0) {
                char c11 = c10;
                int i19 = i16;
                int iMin = (int) Math.min(jZza2, j10);
                f(iMin, bArr3);
                for (int i20 = 0; i20 < length; i20++) {
                    messageDigestArr[i20].update(bArr3);
                }
                try {
                    rVar.zzb(messageDigestArr, j11, iMin);
                    int i21 = 0;
                    while (i21 < iArr.length) {
                        int i22 = iArr[i21];
                        byte[] bArr4 = bArr[i21];
                        int iA = a(i22);
                        r rVar2 = rVar;
                        MessageDigest messageDigest = messageDigestArr[i21];
                        long j12 = jZza2;
                        int iDigest = messageDigest.digest(bArr4, (i19 * iA) + 5, iA);
                        if (iDigest != iA) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i21++;
                        rVar = rVar2;
                        jZza2 = j12;
                    }
                    r rVar3 = rVar;
                    long j13 = iMin;
                    j11 += j13;
                    jZza2 -= j13;
                    i16 = i19 + 1;
                    c10 = c11;
                    rVar = rVar3;
                    j10 = 1048576;
                } catch (IOException e11) {
                    throw new DigestException(w0.i.a(i19, i17, "Failed to digest chunk #", " of section #"), e11);
                }
            }
            i17++;
            i15 = i18 + 1;
            j10 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i23 = 0; i23 < iArr.length; i23++) {
            int i24 = iArr[i23];
            byte[] bArr6 = bArr[i23];
            String strC2 = c(i24);
            try {
                bArr5[i23] = MessageDigest.getInstance(strC2).digest(bArr6);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strC2.concat(" digest not supported"), e12);
            }
        }
        return bArr5;
    }

    public static X509Certificate[][] j(FileChannel fileChannel, h0 h0Var) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer byteBufferE = e(h0Var.f29615a);
                int i10 = 0;
                while (byteBufferE.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(h(e(byteBufferE), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException(o2.k(i10, "Failed to parse/verify signer #", " block"), e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j10 = h0Var.f29616b;
                long j11 = h0Var.f29617c;
                long j12 = h0Var.f29618d;
                ByteBuffer byteBuffer = h0Var.f29619e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                g0 g0Var = new g0(fileChannel, 0L, j10);
                g0 g0Var2 = new g0(fileChannel, j11, j12 - j11);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                m0.zzd(byteBufferDuplicate, j10);
                a aVar = new a(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    iArr[i11] = ((Integer) it.next()).intValue();
                    i11++;
                }
                try {
                    byte[][] bArrI = i(iArr, new r[]{g0Var, g0Var2, aVar});
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = iArr[i12];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i13)), bArrI[i12])) {
                            throw new SecurityException(c(i13).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e11) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e11);
                }
            } catch (IOException e12) {
                throw new SecurityException("Failed to read list of signers", e12);
            }
        } catch (CertificateException e13) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.util.Pair] */
    public static X509Certificate[][] zza(String str) throws i0, SecurityException, IOException {
        RandomAccessFile randomAccessFileA;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            int i10 = 0;
            if (randomAccessFile.length() < 22) {
                randomAccessFileA = 0;
            } else {
                Pair pairA = m0.a(randomAccessFile, 0);
                randomAccessFileA = pairA != null ? pairA : m0.a(randomAccessFile, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
            try {
                if (randomAccessFileA == 0) {
                    throw new i0("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) ((Pair) randomAccessFileA).first;
                long jLongValue = ((Long) ((Pair) randomAccessFileA).second).longValue();
                long j10 = jLongValue - 20;
                if (j10 >= 0) {
                    randomAccessFile.seek(j10);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new i0("ZIP64 APK not supported");
                    }
                }
                long jZza = m0.zza(byteBuffer);
                if (jZza >= jLongValue) {
                    throw new i0("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
                }
                if (jZza + m0.zzb(byteBuffer) != jLongValue) {
                    throw new i0("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZza < 32) {
                    throw new i0("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile.seek(jZza - byteBufferAllocate.capacity());
                randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new i0("No APK Signing Block before ZIP Central Directory");
                }
                long j11 = byteBufferAllocate.getLong(0);
                if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
                    throw new i0("APK Signing Block size out of range: " + j11);
                }
                int i11 = (int) (8 + j11);
                long j12 = jZza - i11;
                if (j12 < 0) {
                    throw new i0("APK Signing Block offset out of range: " + j12);
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i11);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile.seek(j12);
                randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                randomAccessFileA = randomAccessFile;
                long j13 = byteBufferAllocate2.getLong(0);
                if (j13 != j11) {
                    throw new i0("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j12));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                if (iCapacity < 8) {
                    throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    while (byteBufferSlice.hasRemaining()) {
                        i10++;
                        if (byteBufferSlice.remaining() < 8) {
                            throw new i0("Insufficient data to read size of APK Signing Block entry #" + i10);
                        }
                        long j14 = byteBufferSlice.getLong();
                        if (j14 < 4 || j14 > 2147483647L) {
                            throw new i0("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                        }
                        int i12 = (int) j14;
                        int iPosition2 = byteBufferSlice.position() + i12;
                        if (i12 > byteBufferSlice.remaining()) {
                            throw new i0("APK Signing Block entry #" + i10 + " size out of range: " + i12 + ", available: " + byteBufferSlice.remaining());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrJ = j(randomAccessFileA.getChannel(), new h0(d(i12 - 4, byteBufferSlice), jLongValue2, jZza, jLongValue, byteBuffer));
                            randomAccessFileA.close();
                            try {
                                randomAccessFileA.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrJ;
                        }
                        long j15 = jZza;
                        long j16 = jLongValue;
                        byteBufferSlice.position(iPosition2);
                        jLongValue = j16;
                        jZza = j15;
                    }
                    throw new i0("No APK Signature Scheme v2 block in APK Signing Block");
                } finally {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFileA.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFileA = randomAccessFile;
        }
    }
}
