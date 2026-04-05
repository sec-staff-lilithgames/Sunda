package xr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class df {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f92443a = Logger.getLogger(df.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f92444b = "-bin".getBytes(mh.h0.f74626a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i10 = length; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10 - length]) {
                return false;
            }
        }
        return true;
    }

    public static byte[][] toHttp2Headers(wr.e4 e4Var) {
        byte[][] bArrSerialize = wr.p2.serialize(e4Var);
        if (bArrSerialize == null) {
            return new byte[0][];
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bArrSerialize.length; i11 += 2) {
            byte[] bArr = bArrSerialize[i11];
            byte[] bArr2 = bArrSerialize[i11 + 1];
            if (a(bArr, f92444b)) {
                bArrSerialize[i10] = bArr;
                bArrSerialize[i10 + 1] = wr.p2.f91091b.encode(bArr2).getBytes(mh.h0.f74626a);
            } else {
                for (byte b10 : bArr2) {
                    if (b10 < 32 || b10 > 126) {
                        StringBuilder sbO = e3.g.o("Metadata key=", new String(bArr, mh.h0.f74626a), ", value=");
                        sbO.append(Arrays.toString(bArr2));
                        sbO.append(" contains invalid ASCII characters");
                        f92443a.warning(sbO.toString());
                        break;
                    }
                }
                bArrSerialize[i10] = bArr;
                bArrSerialize[i10 + 1] = bArr2;
            }
            i10 += 2;
        }
        return i10 == bArrSerialize.length ? bArrSerialize : (byte[][]) Arrays.copyOfRange(bArrSerialize, 0, i10);
    }

    public static byte[][] toRawSerializedHeaders(byte[][] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            byte[] bArr2 = bArr[i10];
            int i11 = i10 + 1;
            byte[] bArr3 = bArr[i11];
            byte[] bArr4 = f92444b;
            if (a(bArr2, bArr4)) {
                for (byte b10 : bArr3) {
                    if (b10 == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i12 = 0; i12 < i10; i12++) {
                            arrayList.add(bArr[i12]);
                        }
                        while (i10 < bArr.length) {
                            byte[] bArr5 = bArr[i10];
                            byte[] bArr6 = bArr[i10 + 1];
                            if (a(bArr5, bArr4)) {
                                int i13 = 0;
                                for (int i14 = 0; i14 <= bArr6.length; i14++) {
                                    if (i14 == bArr6.length || bArr6[i14] == 44) {
                                        byte[] bArrDecode = ph.o.base64().decode(new String(bArr6, i13, i14 - i13, mh.h0.f74626a));
                                        arrayList.add(bArr5);
                                        arrayList.add(bArrDecode);
                                        i13 = i14 + 1;
                                    }
                                }
                            } else {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            }
                            i10 += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i11] = ph.o.base64().decode(new String(bArr3, mh.h0.f74626a));
            }
            i10 += 2;
        }
        return bArr;
    }
}
