package com.google.android.gms.internal.ads;

import android.util.Pair;
import b0.e2;
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
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzapa {
    public static X509Certificate[][] zza(String str) throws zzaox, SecurityException, IOException {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair pairZza = zzapb.zza(randomAccessFile2);
            try {
                if (pairZza == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 82);
                    sb2.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb2.append(length);
                    sb2.append(" bytes");
                    throw new zzaox(sb2.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairZza.first;
                long jLongValue = ((Long) pairZza.second).longValue();
                long j10 = (-20) + jLongValue;
                if (j10 >= 0) {
                    randomAccessFile2.seek(j10);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzaox("ZIP64 APK not supported");
                    }
                }
                long jZzb = zzapb.zzb(byteBuffer);
                if (jZzb >= jLongValue) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(jZzb).length() + 82 + String.valueOf(jLongValue).length());
                    sb3.append("ZIP Central Directory offset out of range: ");
                    sb3.append(jZzb);
                    sb3.append(". ZIP End of Central Directory offset: ");
                    sb3.append(jLongValue);
                    throw new zzaox(sb3.toString());
                }
                if (zzapb.zzd(byteBuffer) + jZzb != jLongValue) {
                    throw new zzaox("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZzb < 32) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(jZzb).length() + 67);
                    sb4.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb4.append(jZzb);
                    throw new zzaox(sb4.toString());
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(jZzb - byteBufferAllocate.capacity());
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new zzaox("No APK Signing Block before ZIP Central Directory");
                }
                long j11 = jZzb;
                long j12 = byteBufferAllocate.getLong(0);
                if (j12 < byteBufferAllocate.capacity() || j12 > 2147483639) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j12).length() + 37);
                    sb5.append("APK Signing Block size out of range: ");
                    sb5.append(j12);
                    throw new zzaox(sb5.toString());
                }
                int i10 = (int) (8 + j12);
                long j13 = j11 - i10;
                if (j13 < 0) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j13).length() + 39);
                    sb6.append("APK Signing Block offset out of range: ");
                    sb6.append(j13);
                    throw new zzaox(sb6.toString());
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j13);
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j14 = byteBufferAllocate2.getLong(0);
                if (j14 != j12) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(j14).length() + 63 + String.valueOf(j12).length());
                    sb7.append("APK Signing Block sizes in header and footer do not match: ");
                    sb7.append(j14);
                    sb7.append(" vs ");
                    sb7.append(j12);
                    throw new zzaox(sb7.toString());
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j13));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (iCapacity < 8) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                    sb8.append("end < start: ");
                    sb8.append(iCapacity);
                    sb8.append(" < 8");
                    throw new IllegalArgumentException(sb8.toString());
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    StringBuilder sb9 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                    sb9.append("end > capacity: ");
                    sb9.append(iCapacity);
                    sb9.append(" > ");
                    sb9.append(iCapacity2);
                    throw new IllegalArgumentException(sb9.toString());
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i11 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i11++;
                        if (byteBufferSlice.remaining() < 8) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i11).length() + 59);
                            sb10.append("Insufficient data to read size of APK Signing Block entry #");
                            sb10.append(i11);
                            throw new zzaox(sb10.toString());
                        }
                        long j15 = byteBufferSlice.getLong();
                        if (j15 < 4 || j15 > 2147483647L) {
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i11).length() + 45 + String.valueOf(j15).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i11);
                            sb11.append(" size out of range: ");
                            sb11.append(j15);
                            throw new zzaox(sb11.toString());
                        }
                        int i12 = (int) j15;
                        int iPosition2 = byteBufferSlice.position() + i12;
                        if (i12 > byteBufferSlice.remaining()) {
                            int iRemaining = byteBufferSlice.remaining();
                            StringBuilder sb12 = new StringBuilder(String.valueOf(i11).length() + 45 + String.valueOf(i12).length() + 13 + String.valueOf(iRemaining).length());
                            sb12.append("APK Signing Block entry #");
                            sb12.append(i11);
                            sb12.append(" size out of range: ");
                            sb12.append(i12);
                            sb12.append(", available: ");
                            sb12.append(iRemaining);
                            throw new zzaox(sb12.toString());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrZzb = zzb(randomAccessFile.getChannel(), new zzaow(zzi(byteBufferSlice, i12 - 4), jLongValue2, j11, jLongValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrZzb;
                        }
                        long j16 = j11;
                        byteBufferSlice.position(iPosition2);
                        j11 = j16;
                    }
                    throw new zzaox("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th2) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = randomAccessFile2;
        }
    }

    private static X509Certificate[][] zzb(FileChannel fileChannel, zzaow zzaowVar) throws SecurityException, CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer byteBufferZzj = zzj(zzaowVar.zza());
                int i10 = 0;
                while (byteBufferZzj.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(zzc(zzj(byteBufferZzj), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException(e2.n(new StringBuilder(String.valueOf(i10).length() + 37), "Failed to parse/verify signer #", i10, " block"), e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzd(map, fileChannel, zzaowVar.zzb(), zzaowVar.zzc(), zzaowVar.zzd(), zzaowVar.zze());
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }

    private static X509Certificate[] zzc(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, SecurityException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzj = zzj(byteBuffer);
        ByteBuffer byteBufferZzj2 = zzj(byteBuffer);
        byte[] bArrZzk = zzk(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzk2 = null;
        byte[] bArrZzk3 = null;
        int i10 = -1;
        int i11 = 0;
        while (byteBufferZzj2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferZzj3 = zzj(byteBufferZzj2);
                if (byteBufferZzj3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferZzj3.getInt();
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
                    int iZzf = zzf(i12);
                    int iZzf2 = zzf(i10);
                    if (iZzf != 1 && iZzf2 == 1) {
                    }
                }
                bArrZzk3 = zzk(byteBufferZzj3);
                i10 = i12;
            } catch (IOException e10) {
                e = e10;
                throw new SecurityException(o2.l(i11, "Failed to parse signature record #", new StringBuilder(String.valueOf(i11).length() + 34)), e);
            } catch (BufferUnderflowException e11) {
                e = e11;
                throw new SecurityException(o2.l(i11, "Failed to parse signature record #", new StringBuilder(String.valueOf(i11).length() + 34)), e);
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
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzk));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzj);
            if (!signature.verify(bArrZzk3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferZzj.clear();
            ByteBuffer byteBufferZzj4 = zzj(byteBufferZzj);
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (byteBufferZzj4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferZzj5 = zzj(byteBufferZzj4);
                    if (byteBufferZzj5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i14 = byteBufferZzj5.getInt();
                    arrayList2.add(Integer.valueOf(i14));
                    if (i14 == i10) {
                        bArrZzk2 = zzk(byteBufferZzj5);
                    }
                } catch (IOException e12) {
                    e = e12;
                    throw new IOException(o2.l(i13, "Failed to parse digest record #", new StringBuilder(String.valueOf(i13).length() + 31)), e);
                } catch (BufferUnderflowException e13) {
                    e = e13;
                    throw new IOException(o2.l(i13, "Failed to parse digest record #", new StringBuilder(String.valueOf(i13).length() + 31)), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZzf3 = zzf(i10);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzf3), bArrZzk2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzk2)) {
                throw new SecurityException(zzg(iZzf3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferZzj6 = zzj(byteBufferZzj);
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            while (byteBufferZzj6.hasRemaining()) {
                i15++;
                byte[] bArrZzk4 = zzk(byteBufferZzj6);
                try {
                    arrayList3.add(new zzaoy((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzk4)), bArrZzk4));
                } catch (CertificateException e14) {
                    throw new SecurityException(o2.l(i15, "Failed to decode certificate #", new StringBuilder(String.valueOf(i15).length() + 30)), e14);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrZzk, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e15) {
            e = e15;
            throw new SecurityException(a.b.o(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e16) {
            e = e16;
            throw new SecurityException(a.b.o(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e17) {
            e = e17;
            throw new SecurityException(a.b.o(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e18) {
            e = e18;
            throw new SecurityException(a.b.o(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e19) {
            e = e19;
            throw new SecurityException(a.b.o(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    private static void zzd(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzaov zzaovVar = new zzaov(fileChannel, 0L, j10);
        zzaov zzaovVar2 = new zzaov(fileChannel, j11, j12 - j11);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzapb.zzc(byteBufferDuplicate, j10);
        zzaot zzaotVar = new zzaot(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        try {
            byte[][] bArrZze = zze(iArr, new zzaou[]{zzaovVar, zzaovVar2, zzaotVar});
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), bArrZze[i11])) {
                    throw new SecurityException(zzg(i12).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e10) {
            throw new SecurityException("Failed to compute digest(s) of contents", e10);
        }
    }

    private static byte[][] zze(int[] iArr, zzaou[] zzaouVarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        char c10;
        int i11;
        String str;
        int i12 = 0;
        long jZza = 0;
        while (true) {
            j10 = 1048576;
            i10 = 3;
            if (i12 >= 3) {
                break;
            }
            jZza += (zzaouVarArr[i12].zza() + 1048575) / 1048576;
            i12++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(e2.i(jZza, "Too many chunks: ", new StringBuilder(String.valueOf(jZza).length() + 17)));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i13 = 0;
        while (true) {
            length = iArr.length;
            c10 = 5;
            i11 = 1;
            if (i13 >= length) {
                break;
            }
            int i14 = (int) jZza;
            byte[] bArr2 = new byte[(zzh(iArr[i13]) * i14) + 5];
            bArr2[0] = 90;
            zzl(i14, bArr2, 1);
            bArr[i13] = bArr2;
            i13++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i15 = 0;
        while (true) {
            str = " digest not supported";
            if (i15 >= iArr.length) {
                break;
            }
            String strZzg = zzg(iArr[i15]);
            try {
                messageDigestArr[i15] = MessageDigest.getInstance(strZzg);
                i15++;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strZzg.concat(" digest not supported"), e10);
            }
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i10) {
            zzaou zzaouVar = zzaouVarArr[i16];
            int i19 = i16;
            long jZza2 = zzaouVar.zza();
            long j11 = 0;
            while (jZza2 > 0) {
                int i20 = i17;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j10);
                zzl(iMin, bArr3, i11);
                for (int i21 = 0; i21 < length; i21++) {
                    messageDigestArr[i21].update(bArr3);
                }
                try {
                    zzaouVar.zzb(messageDigestArr, j11, iMin);
                    int i22 = 0;
                    while (i22 < iArr.length) {
                        int i23 = iArr[i22];
                        byte[] bArr4 = bArr[i22];
                        int iZzh = zzh(i23);
                        char c11 = c10;
                        MessageDigest messageDigest = messageDigestArr[i22];
                        int iDigest = messageDigest.digest(bArr4, (i20 * iZzh) + 5, iZzh);
                        if (iDigest != iZzh) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i22++;
                        c10 = c11;
                    }
                    long j12 = iMin;
                    j11 += j12;
                    jZza2 -= j12;
                    i17 = i20 + 1;
                    str = str2;
                    j10 = 1048576;
                    i11 = 1;
                } catch (IOException e11) {
                    throw new DigestException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i20, i18, "Failed to digest chunk #", " of section #", new StringBuilder(String.valueOf(i20).length() + 37 + String.valueOf(i18).length())), e11);
                }
            }
            i18++;
            i16 = i19 + 1;
            j10 = 1048576;
            i10 = 3;
            i11 = 1;
        }
        String str3 = str;
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i24 = 0; i24 < iArr.length; i24++) {
            int i25 = iArr[i24];
            byte[] bArr6 = bArr[i24];
            String strZzg2 = zzg(i25);
            try {
                bArr5[i24] = MessageDigest.getInstance(strZzg2).digest(bArr6);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strZzg2.concat(str3), e12);
            }
        }
        return bArr5;
    }

    private static int zzf(int i10) {
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

    private static String zzg(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(o2.l(i10, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i10).length() + 33)));
    }

    private static int zzh(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(o2.l(i10, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i10).length() + 33)));
    }

    private static ByteBuffer zzi(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
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

    private static ByteBuffer zzj(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            throw new IOException(o2.l(iRemaining, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", new StringBuilder(String.valueOf(iRemaining).length() + 82)));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return zzi(byteBuffer, i10);
        }
        int iRemaining2 = byteBuffer.remaining();
        throw new IOException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i10, iRemaining2, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ", new StringBuilder(String.valueOf(i10).length() + 79 + String.valueOf(iRemaining2).length())));
    }

    private static byte[] zzk(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        throw new IOException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i10, iRemaining, "Underflow while reading length-prefixed value. Length: ", ", available: ", new StringBuilder(String.valueOf(i10).length() + 68 + String.valueOf(iRemaining).length())));
    }

    private static void zzl(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }
}
