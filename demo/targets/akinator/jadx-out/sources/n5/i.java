package n5;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.inmobi.commons.core.configs.AdConfig;
import j1.o2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f75657a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f75658b = {112, 114, 109, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f75659c = {48, 49, 53, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f75660d = {48, 49, 48, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f75661e = {48, 48, 57, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f75662f = {48, 48, 53, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f75663g = {48, 48, 49, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f75664h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f75665i = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (b bVar : bVarArr) {
            length += ((((bVar.f75651g * 2) + 7) & (-8)) / 8) + (bVar.f75649e * 2) + d(bVar.f75645a, bVar.f75646b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f75650f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f75661e)) {
            int length2 = bVarArr.length;
            while (i10 < length2) {
                b bVar2 = bVarArr[i10];
                p(byteArrayOutputStream, bVar2, d(bVar2.f75645a, bVar2.f75646b, bArr));
                o(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bVar3.f75645a, bVar3.f75646b, bArr));
            }
            int length3 = bVarArr.length;
            while (i10 < length3) {
                o(byteArrayOutputStream, bVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = c(file2) && z10;
        }
        return z10;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f75663g;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f75662f;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return o2.o(p0.o2.u(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static byte[] e(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(a.b.e(i10, "Not enough bytes to read: "));
            }
            i11 += i12;
        }
        return bArr;
    }

    public static int[] f(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int iL = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iL += (int) l(byteArrayInputStream, 2);
            iArr[i11] = iL;
        }
        return iArr;
    }

    public static byte[] g(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = fileInputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } finally {
            inflater.end();
        }
    }

    public static b[] h(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) throws IOException {
        byte[] bArr3 = f75664h;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f75665i)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iL = (int) l(fileInputStream, 2);
            byte[] bArrG = g(fileInputStream, (int) l(fileInputStream, 4), (int) l(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrG);
            try {
                b[] bVarArrJ = j(byteArrayInputStream, bArr2, iL, bVarArr);
                byteArrayInputStream.close();
                return bVarArrJ;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f75659c, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iL2 = (int) l(fileInputStream, 1);
        byte[] bArrG2 = g(fileInputStream, (int) l(fileInputStream, 4), (int) l(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrG2);
        try {
            b[] bVarArrI = i(byteArrayInputStream2, iL2, bVarArr);
            byteArrayInputStream2.close();
            return bVarArrI;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static b[] i(ByteArrayInputStream byteArrayInputStream, int i10, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iL = (int) l(byteArrayInputStream, 2);
            iArr[i11] = (int) l(byteArrayInputStream, 2);
            strArr[i11] = new String(e(byteArrayInputStream, iL), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            if (!bVar.f75646b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            bVar.f75649e = i13;
            bVar.f75652h = f(byteArrayInputStream, i13);
        }
        return bVarArr;
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, b[] bVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            l(byteArrayInputStream, 2);
            String str = new String(e(byteArrayInputStream, (int) l(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jL = l(byteArrayInputStream, 4);
            int iL = (int) l(byteArrayInputStream, 2);
            b bVar = null;
            if (bVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i12 = 0;
                while (true) {
                    if (i12 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i12].f75646b.equals(strSubstring)) {
                        bVar = bVarArr[i12];
                        break;
                    }
                    i12++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f75648d = jL;
            int[] iArrF = f(byteArrayInputStream, iL);
            if (Arrays.equals(bArr, f75663g)) {
                bVar.f75649e = iL;
                bVar.f75652h = iArrF;
            }
        }
        return bVarArr;
    }

    public static b[] k(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f75660d)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iL = (int) l(fileInputStream, 1);
        byte[] bArrG = g(fileInputStream, (int) l(fileInputStream, 4), (int) l(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrG);
        try {
            b[] bVarArrM = m(byteArrayInputStream, str, iL);
            byteArrayInputStream.close();
            return bVarArrM;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long l(InputStream inputStream, int i10) throws IOException {
        byte[] bArrE = e(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += (bArrE[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << (i11 * 8);
        }
        return j10;
    }

    public static b[] m(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int iL = (int) l(byteArrayInputStream, 2);
            int iL2 = (int) l(byteArrayInputStream, 2);
            bVarArr[i12] = new b(str, new String(e(byteArrayInputStream, iL), StandardCharsets.UTF_8), l(byteArrayInputStream, 4), iL2, (int) l(byteArrayInputStream, 4), (int) l(byteArrayInputStream, 4), new int[iL2], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i10) {
            b bVar = bVarArr[i13];
            int iAvailable = byteArrayInputStream.available();
            int i14 = bVar.f75650f;
            int i15 = bVar.f75651g;
            TreeMap treeMap = bVar.f75653i;
            int i16 = iAvailable - i14;
            int iL3 = i11;
            while (byteArrayInputStream.available() > i16) {
                iL3 += (int) l(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iL3), 1);
                int iL4 = (int) l(byteArrayInputStream, 2);
                while (iL4 > 0) {
                    l(byteArrayInputStream, 2);
                    int iL5 = (int) l(byteArrayInputStream, 1);
                    if (iL5 != 6 && iL5 != 7) {
                        while (iL5 > 0) {
                            l(byteArrayInputStream, 1);
                            int i17 = i11;
                            int i18 = i13;
                            for (int iL6 = (int) l(byteArrayInputStream, 1); iL6 > 0; iL6--) {
                                l(byteArrayInputStream, 2);
                            }
                            iL5--;
                            i11 = i17;
                            i13 = i18;
                        }
                    }
                    iL4--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i19 = i11;
            int i20 = i13;
            if (byteArrayInputStream.available() != i16) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f75652h = f(byteArrayInputStream, bVar.f75649e);
            BitSet bitSetValueOf = BitSet.valueOf(e(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
            for (int i21 = i19; i21 < i15; i21++) {
                int i22 = bitSetValueOf.get(i21) ? 2 : i19;
                if (bitSetValueOf.get(i21 + i15)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i21));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | numValueOf.intValue()));
                }
            }
            i13 = i20 + 1;
            i11 = i19;
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean n(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) throws IOException {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f75659c;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f75660d;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(bVarArr, bArr3);
                s(byteArrayOutputStream, bVarArr.length, 1);
                s(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                s(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f75662f;
            if (Arrays.equals(bArr, bArr4)) {
                s(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f75653i.size() * 4;
                    String strD = d(bVar.f75645a, bVar.f75646b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    t(byteArrayOutputStream, strD.getBytes(charset).length);
                    t(byteArrayOutputStream, bVar.f75652h.length);
                    s(byteArrayOutputStream, size, 4);
                    s(byteArrayOutputStream, bVar.f75647c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = bVar.f75653i.keySet().iterator();
                    while (it.hasNext()) {
                        t(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        t(byteArrayOutputStream, 0);
                    }
                    for (int i11 : bVar.f75652h) {
                        t(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = f75661e;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(bVarArr, bArr5);
                s(byteArrayOutputStream, bVarArr.length, 1);
                s(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                s(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f75663g;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            t(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.f75645a;
                TreeMap treeMap = bVar2.f75653i;
                String strD2 = d(str, bVar2.f75646b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                t(byteArrayOutputStream, strD2.getBytes(charset2).length);
                t(byteArrayOutputStream, treeMap.size());
                t(byteArrayOutputStream, bVar2.f75652h.length);
                s(byteArrayOutputStream, bVar2.f75647c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    t(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i12 : bVar2.f75652h) {
                    t(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            t(byteArrayOutputStream2, bVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (b bVar3 : bVarArr) {
                s(byteArrayOutputStream2, bVar3.f75647c, 4);
                s(byteArrayOutputStream2, bVar3.f75648d, 4);
                s(byteArrayOutputStream2, bVar3.f75651g, 4);
                String strD3 = d(bVar3.f75645a, bVar3.f75646b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                t(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            int length3 = byteArray.length;
            String str2 = OIPXcgrVyyxoLF.WMqKr;
            if (i14 != length3) {
                throw new IllegalStateException(str2 + i14 + ", does not match actual size " + byteArray.length);
            }
            n nVar = new n(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(nVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i15];
                    t(byteArrayOutputStream3, i15);
                    t(byteArrayOutputStream3, bVar4.f75649e);
                    i16 = i16 + 4 + (bVar4.f75649e * i13);
                    int[] iArr = bVar4.f75652h;
                    int length4 = iArr.length;
                    int i17 = i10;
                    int i18 = i13;
                    int i19 = i17;
                    while (i19 < length4) {
                        int i20 = iArr[i19];
                        t(byteArrayOutputStream3, i20 - i17);
                        i19++;
                        i17 = i20;
                    }
                    i15++;
                    i13 = i18;
                    i10 = 0;
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException(str2 + i16 + ", does not match actual size " + byteArray2.length);
            }
            n nVar2 = new n(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(nVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i21 = 0;
            int i22 = 0;
            while (i21 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i21];
                    Iterator it3 = bVar5.f75653i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, iIntValue, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            t(byteArrayOutputStream3, i21);
                            int length5 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i22 + 6;
                            ArrayList arrayList4 = arrayList3;
                            s(byteArrayOutputStream3, length5, 4);
                            t(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i22 = i23 + length5;
                            i21++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i22 != byteArray5.length) {
                throw new IllegalStateException(str2 + i22 + ", does not match actual size " + byteArray5.length);
            }
            n nVar3 = new n(byteArray5, 4, true);
            byteArrayOutputStream3.close();
            arrayList2.add(nVar3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + (arrayList2.size() * 16);
            s(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                n nVar4 = (n) arrayList2.get(i24);
                int i25 = nVar4.f75677a;
                byte[] bArr7 = nVar4.f75678b;
                if (i25 == 1) {
                    j10 = 0;
                } else if (i25 == 2) {
                    j10 = 1;
                } else if (i25 == 3) {
                    j10 = 2;
                } else if (i25 == 4) {
                    j10 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j10 = 4;
                }
                s(byteArrayOutputStream, j10, 4);
                s(byteArrayOutputStream, size2, 4);
                if (nVar4.f75679c) {
                    long length6 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    s(byteArrayOutputStream, bArrA3.length, 4);
                    s(byteArrayOutputStream, length6, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    s(byteArrayOutputStream, bArr7.length, 4);
                    s(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public static void o(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        r(byteArrayOutputStream, bVar);
        int i10 = bVar.f75651g;
        int[] iArr = bVar.f75652h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            t(byteArrayOutputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f75653i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i14 = iIntValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i15 = iIntValue + i10;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        t(byteArrayOutputStream, str.getBytes(charset).length);
        t(byteArrayOutputStream, bVar.f75649e);
        s(byteArrayOutputStream, bVar.f75650f, 4);
        s(byteArrayOutputStream, bVar.f75647c, 4);
        s(byteArrayOutputStream, bVar.f75651g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, int i10, b bVar) throws IOException {
        int i11 = bVar.f75651g;
        byte[] bArr = new byte[(((Integer.bitCount(i10 & (-2)) * i11) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f75653i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (i12 * i11) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : bVar.f75653i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                t(byteArrayOutputStream, iIntValue - i10);
                t(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, int i10) throws IOException {
        s(byteArrayOutputStream, i10, 2);
    }
}
