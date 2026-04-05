package um;

import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f88551a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(byte[] r21, int r22, um.b r23) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: um.c.a(byte[], int, um.b):void");
    }

    public static byte[] b(b bVar) {
        byte[] bArr = bVar.f88546b;
        if (bArr == null) {
            bVar.f88546b = new byte[Math.max(7, Segment.SIZE)];
            bVar.f88547c = 0;
            bVar.f88548d = 0;
        } else {
            int i10 = bVar.f88547c;
            int i11 = i10 + 7;
            if (i11 - bArr.length > 0) {
                int length = bArr.length * 2;
                if (length - Integer.MIN_VALUE < i10 - 2147483641) {
                    length = i11;
                }
                int i12 = Integer.MIN_VALUE + length;
                if (i12 >= -9 && i12 != -9) {
                    length = Math.max(i11, 2147483639);
                }
                byte[] bArr2 = new byte[length];
                byte[] bArr3 = bVar.f88546b;
                System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                bVar.f88546b = bArr2;
                return bArr2;
            }
        }
        return bVar.f88546b;
    }

    public String decode(String str) {
        return decode(str.getBytes(Charset.forName(C.UTF8_NAME)));
    }

    public String decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new String(bArr);
        }
        b bVar = new b();
        a(bArr, bArr.length, bVar);
        a(bArr, -1, bVar);
        int i10 = bVar.f88547c;
        byte[] bArr2 = new byte[i10];
        if (bVar.f88546b != null) {
            int iMin = Math.min(i10 - bVar.f88548d, i10);
            System.arraycopy(bVar.f88546b, bVar.f88548d, bArr2, 0, iMin);
            int i11 = bVar.f88548d + iMin;
            bVar.f88548d = i11;
            if (i11 >= bVar.f88547c) {
                bVar.f88546b = null;
            }
        }
        return new String(bArr2);
    }
}
