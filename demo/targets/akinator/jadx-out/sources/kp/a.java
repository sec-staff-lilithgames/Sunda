package kp;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import hp.i;
import hp.r;
import hp.s;
import in.b;
import io.bidmachine.media3.common.util.k;
import io.bidmachine.media3.common.util.m0;
import java.util.Arrays;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f71927a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public final m0 f71928b = new m0();

    /* renamed from: c, reason: collision with root package name */
    public final C0737a f71929c = new C0737a();

    /* renamed from: d, reason: collision with root package name */
    public Inflater f71930d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kp.a$a, reason: collision with other inner class name */
    public static final class C0737a {

        /* renamed from: a, reason: collision with root package name */
        public final m0 f71931a = new m0();

        /* renamed from: b, reason: collision with root package name */
        public final int[] f71932b = new int[NotificationCompat.FLAG_LOCAL_ONLY];

        /* renamed from: c, reason: collision with root package name */
        public boolean f71933c;

        /* renamed from: d, reason: collision with root package name */
        public int f71934d;

        /* renamed from: e, reason: collision with root package name */
        public int f71935e;

        /* renamed from: f, reason: collision with root package name */
        public int f71936f;

        /* renamed from: g, reason: collision with root package name */
        public int f71937g;

        /* renamed from: h, reason: collision with root package name */
        public int f71938h;

        /* renamed from: i, reason: collision with root package name */
        public int f71939i;

        public b build() {
            int unsignedByte;
            if (this.f71934d == 0 || this.f71935e == 0 || this.f71938h == 0 || this.f71939i == 0) {
                return null;
            }
            m0 m0Var = this.f71931a;
            if (m0Var.limit() == 0 || m0Var.getPosition() != m0Var.limit() || !this.f71933c) {
                return null;
            }
            m0Var.setPosition(0);
            int i10 = this.f71938h * this.f71939i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int unsignedByte2 = m0Var.readUnsignedByte();
                int[] iArr2 = this.f71932b;
                if (unsignedByte2 != 0) {
                    unsignedByte = i11 + 1;
                    iArr[i11] = iArr2[unsignedByte2];
                } else {
                    int unsignedByte3 = m0Var.readUnsignedByte();
                    if (unsignedByte3 != 0) {
                        unsignedByte = ((unsignedByte3 & 64) == 0 ? unsignedByte3 & 63 : ((unsignedByte3 & 63) << 8) | m0Var.readUnsignedByte()) + i11;
                        Arrays.fill(iArr, i11, unsignedByte, (unsignedByte3 & 128) == 0 ? iArr2[0] : iArr2[m0Var.readUnsignedByte()]);
                    }
                }
                i11 = unsignedByte;
            }
            return new in.a().setBitmap(Bitmap.createBitmap(iArr, this.f71938h, this.f71939i, Bitmap.Config.ARGB_8888)).setPosition(this.f71936f / this.f71934d).setPositionAnchor(0).setLine(this.f71937g / this.f71935e, 0).setLineAnchor(0).setSize(this.f71938h / this.f71934d).setBitmapHeight(this.f71939i / this.f71935e).build();
        }

        public void reset() {
            this.f71934d = 0;
            this.f71935e = 0;
            this.f71936f = 0;
            this.f71937g = 0;
            this.f71938h = 0;
            this.f71939i = 0;
            this.f71931a.reset(0);
            this.f71933c = false;
        }
    }

    @Override // hp.s
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void parse(byte[] bArr, r rVar, k kVar) {
        super.parse(bArr, rVar, kVar);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ i parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return super.parseToLegacySubtitle(bArr, i10, i11);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    @Override // hp.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parse(byte[] r23, int r24, int r25, hp.r r26, io.bidmachine.media3.common.util.k r27) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.a.parse(byte[], int, int, hp.r, io.bidmachine.media3.common.util.k):void");
    }
}
