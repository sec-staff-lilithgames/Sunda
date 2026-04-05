package j$.util;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class Base64 {
    public static Decoder getDecoder() {
        return Decoder.f68734d;
    }

    public static Decoder getUrlDecoder() {
        return Decoder.f68735e;
    }

    public static class Decoder {

        /* renamed from: b, reason: collision with root package name */
        public static final int[] f68732b;

        /* renamed from: c, reason: collision with root package name */
        public static final int[] f68733c;

        /* renamed from: d, reason: collision with root package name */
        public static final Decoder f68734d;

        /* renamed from: e, reason: collision with root package name */
        public static final Decoder f68735e;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f68736a;

        public Decoder(boolean z10) {
            this.f68736a = z10;
        }

        static {
            int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            f68732b = iArr;
            Arrays.fill(iArr, -1);
            for (int i10 = 0; i10 < 64; i10++) {
                f68732b[a.f68737a[i10]] = i10;
            }
            f68732b[61] = -2;
            int[] iArr2 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            f68733c = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i11 = 0; i11 < 64; i11++) {
                f68733c[a.f68738b[i11]] = i11;
            }
            f68733c[61] = -2;
            f68734d = new Decoder(false);
            f68735e = new Decoder(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
        
            if (r11 != 18) goto L59;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public byte[] decode(java.lang.String r21) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.Base64.Decoder.decode(java.lang.String):byte[]");
        }
    }
}
