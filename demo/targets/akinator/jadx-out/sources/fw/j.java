package fw;

import androidx.core.app.NotificationCompat;
import com.moloco.sdk.BKC.KerkSviMAy;
import j1.o2;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f56166a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final pw.l f56167b = pw.l.f81911f.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f56168c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f56169d = new String[64];

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f56170e;

    public final String formatFlags(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        String[] strArr = f56170e;
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : strArr[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr2 = f56169d;
                if (i11 < strArr2.length) {
                    str = strArr2[i11];
                    kotlin.jvm.internal.e0.checkNotNull(str);
                } else {
                    str = strArr[i11];
                }
                String str2 = str;
                return (i10 != 5 || (i11 & 4) == 0) ? (i10 != 0 || (i11 & 32) == 0) ? str2 : k0.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : k0.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return strArr[i11];
    }

    public final String formattedType$okhttp(int i10) {
        String[] strArr = f56168c;
        return i10 < strArr.length ? strArr[i10] : yv.i.format("0x%02x", Integer.valueOf(i10));
    }

    public final String frameLog(boolean z10, int i10, int i11, int i12, int i13) {
        return yv.i.format("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), formattedType$okhttp(i12), formatFlags(i12, i13));
    }

    public final String frameLogWindowUpdate(boolean z10, int i10, int i11, long j10) {
        return yv.i.format("%s 0x%08x %5d %-13s %d", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), formattedType$okhttp(8), Long.valueOf(j10));
    }

    static {
        String[] strArr = new String[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(binaryString, "toBinaryString(...)");
            strArr[i10] = k0.replace$default(yv.i.format("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f56170e = strArr;
        String[] strArr2 = f56169d;
        strArr2[0] = "";
        strArr2[1] = KerkSviMAy.YaxwYfmlGzRf;
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = o2.o(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f56169d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i14]);
            sb2.append('|');
            strArr3[i15 | 8] = o2.o(sb2, strArr3[i13], "|PADDED");
        }
        int length = f56169d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f56169d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f56170e[i16];
            }
        }
    }
}
