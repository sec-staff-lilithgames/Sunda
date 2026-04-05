package as;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f7978a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", gjnZrsdA.EtBEGXJMaMuUd, "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f7979b = new String[64];

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f7980c = new String[NotificationCompat.FLAG_LOCAL_ONLY];

    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(boolean r3, int r4, int r5, byte r6, byte r7) {
        /*
            r0 = 10
            if (r6 >= r0) goto L9
            java.lang.String[] r0 = as.k.f7978a
            r0 = r0[r6]
            goto L17
        L9:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
        L17:
            if (r7 != 0) goto L1c
            java.lang.String r6 = ""
            goto L68
        L1c:
            r1 = 2
            java.lang.String[] r2 = as.k.f7980c
            if (r6 == r1) goto L66
            r1 = 3
            if (r6 == r1) goto L66
            r1 = 4
            if (r6 == r1) goto L5d
            r1 = 6
            if (r6 == r1) goto L5d
            r1 = 7
            if (r6 == r1) goto L66
            r1 = 8
            if (r6 == r1) goto L66
            r1 = 64
            if (r7 >= r1) goto L3a
            java.lang.String[] r1 = as.k.f7979b
            r1 = r1[r7]
            goto L3c
        L3a:
            r1 = r2[r7]
        L3c:
            r2 = 5
            if (r6 != r2) goto L4c
            r2 = r7 & 4
            if (r2 == 0) goto L4c
            java.lang.String r6 = "HEADERS"
            java.lang.String r7 = "PUSH_PROMISE"
            java.lang.String r6 = r1.replace(r6, r7)
            goto L68
        L4c:
            if (r6 != 0) goto L5b
            r6 = r7 & 32
            if (r6 == 0) goto L5b
            java.lang.String r6 = "PRIORITY"
            java.lang.String r7 = "COMPRESSED"
            java.lang.String r6 = r1.replace(r6, r7)
            goto L68
        L5b:
            r6 = r1
            goto L68
        L5d:
            r6 = 1
            if (r7 != r6) goto L63
            java.lang.String r6 = "ACK"
            goto L68
        L63:
            r6 = r2[r7]
            goto L68
        L66:
            r6 = r2[r7]
        L68:
            java.util.Locale r7 = java.util.Locale.US
            if (r3 == 0) goto L6f
            java.lang.String r3 = "<<"
            goto L71
        L6f:
            java.lang.String r3 = ">>"
        L71:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r0, r6}
            java.lang.String r4 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r3 = java.lang.String.format(r7, r4, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: as.k.a(boolean, int, int, byte, byte):java.lang.String");
    }

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f7980c;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f7979b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = o2.o(new StringBuilder(), strArr2[i12], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            int i15 = iArr[0];
            String[] strArr3 = f7979b;
            int i16 = i15 | i14;
            strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i15]);
            sb2.append('|');
            strArr3[i16 | 8] = o2.o(sb2, strArr3[i14], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f7979b;
            if (i10 >= strArr4.length) {
                return;
            }
            if (strArr4[i10] == null) {
                strArr4[i10] = f7980c[i10];
            }
            i10++;
        }
    }
}
