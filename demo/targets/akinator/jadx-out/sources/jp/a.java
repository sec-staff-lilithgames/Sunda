package jp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import hp.i;
import hp.r;
import hp.s;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.k;
import io.bidmachine.media3.common.util.l0;
import io.bidmachine.media3.common.util.m0;
import java.util.ArrayList;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements s {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f69896h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f69897i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f69898j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f69899a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f69900b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f69901c;

    /* renamed from: d, reason: collision with root package name */
    public final b f69902d;

    /* renamed from: e, reason: collision with root package name */
    public final C0709a f69903e;

    /* renamed from: f, reason: collision with root package name */
    public final h f69904f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f69905g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: jp.a$a, reason: collision with other inner class name */
    public static final class C0709a {

        /* renamed from: a, reason: collision with root package name */
        public final int f69906a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f69907b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f69908c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f69909d;

        public C0709a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f69906a = i10;
            this.f69907b = iArr;
            this.f69908c = iArr2;
            this.f69909d = iArr3;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f69910a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69911b;

        /* renamed from: c, reason: collision with root package name */
        public final int f69912c;

        /* renamed from: d, reason: collision with root package name */
        public final int f69913d;

        /* renamed from: e, reason: collision with root package name */
        public final int f69914e;

        /* renamed from: f, reason: collision with root package name */
        public final int f69915f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f69910a = i10;
            this.f69911b = i11;
            this.f69912c = i12;
            this.f69913d = i13;
            this.f69914e = i14;
            this.f69915f = i15;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f69916a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f69917b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f69918c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f69919d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f69916a = i10;
            this.f69917b = z10;
            this.f69918c = bArr;
            this.f69919d = bArr2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f69920a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69921b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f69922c;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f69920a = i11;
            this.f69921b = i12;
            this.f69922c = sparseArray;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f69923a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69924b;

        public e(int i10, int i11) {
            this.f69923a = i10;
            this.f69924b = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f69925a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f69926b;

        /* renamed from: c, reason: collision with root package name */
        public final int f69927c;

        /* renamed from: d, reason: collision with root package name */
        public final int f69928d;

        /* renamed from: e, reason: collision with root package name */
        public final int f69929e;

        /* renamed from: f, reason: collision with root package name */
        public final int f69930f;

        /* renamed from: g, reason: collision with root package name */
        public final int f69931g;

        /* renamed from: h, reason: collision with root package name */
        public final int f69932h;

        /* renamed from: i, reason: collision with root package name */
        public final int f69933i;

        /* renamed from: j, reason: collision with root package name */
        public final SparseArray f69934j;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f69925a = i10;
            this.f69926b = z10;
            this.f69927c = i11;
            this.f69928d = i12;
            this.f69929e = i14;
            this.f69930f = i15;
            this.f69931g = i16;
            this.f69932h = i17;
            this.f69933i = i18;
            this.f69934j = sparseArray;
        }

        public void mergeFrom(f fVar) {
            SparseArray sparseArray = fVar.f69934j;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f69934j.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f69935a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69936b;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f69935a = i12;
            this.f69936b = i13;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f69937a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69938b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f69939c = new SparseArray();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f69940d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f69941e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray f69942f = new SparseArray();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray f69943g = new SparseArray();

        /* renamed from: h, reason: collision with root package name */
        public b f69944h;

        /* renamed from: i, reason: collision with root package name */
        public d f69945i;

        public h(int i10, int i11) {
            this.f69937a = i10;
            this.f69938b = i11;
        }

        public void reset() {
            this.f69939c.clear();
            this.f69940d.clear();
            this.f69941e.clear();
            this.f69942f.clear();
            this.f69943g.clear();
            this.f69944h = null;
            this.f69945i = null;
        }
    }

    public a(List<byte[]> list) {
        m0 m0Var = new m0(list.get(0));
        int unsignedShort = m0Var.readUnsignedShort();
        int unsignedShort2 = m0Var.readUnsignedShort();
        Paint paint = new Paint();
        this.f69899a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f69900b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f69901c = new Canvas();
        this.f69902d = new b(719, 575, 0, 719, 0, 575);
        this.f69903e = new C0709a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f69904f = new h(unsignedShort, unsignedShort2);
    }

    public static byte[] a(int i10, int i11, l0 l0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) l0Var.readBits(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i11 == 0) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = d(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0203 A[LOOP:3: B:88:0x0156->B:120:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.a.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static C0709a f(l0 l0Var, int i10) {
        int bits;
        int i11;
        int bits2;
        int bits3;
        int bits4;
        int i12 = 8;
        int bits5 = l0Var.readBits(8);
        l0Var.skipBits(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int i15 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i14 > 0) {
            int bits6 = l0Var.readBits(i12);
            int bits7 = l0Var.readBits(i12);
            int[] iArr2 = (bits7 & 128) != 0 ? iArr : (bits7 & 64) != 0 ? iArrB : iArrC;
            if ((bits7 & 1) != 0) {
                bits3 = l0Var.readBits(i12);
                bits4 = l0Var.readBits(i12);
                bits = l0Var.readBits(i12);
                bits2 = l0Var.readBits(i12);
                i11 = i14 - 6;
            } else {
                int bits8 = l0Var.readBits(6) << i13;
                int bits9 = l0Var.readBits(4) << 4;
                bits = l0Var.readBits(4) << 4;
                i11 = i14 - 4;
                bits2 = l0Var.readBits(i13) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits4 = i15;
                bits = bits4;
                bits2 = 255;
            }
            double d10 = bits3;
            double d11 = bits4 - 128;
            double d12 = bits - 128;
            iArr2[bits6] = d((byte) (255 - (bits2 & 255)), a1.constrainValue((int) ((1.402d * d11) + d10), 0, 255), a1.constrainValue((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), a1.constrainValue((int) ((d12 * 1.772d) + d10), 0, 255));
            i14 = i11;
            i15 = 0;
            bits5 = bits5;
            iArrC = iArrC;
            i12 = 8;
            i13 = 2;
        }
        return new C0709a(bits5, iArr, iArrB, iArrC);
    }

    public static c g(l0 l0Var) {
        byte[] bArr;
        int bits = l0Var.readBits(16);
        l0Var.skipBits(4);
        int bits2 = l0Var.readBits(2);
        boolean bit = l0Var.readBit();
        l0Var.skipBits(1);
        byte[] bArr2 = a1.f60681c;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = l0Var.readBits(16);
                int bits4 = l0Var.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    l0Var.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    l0Var.readBytes(bArr, 0, bits4);
                }
            }
            return new c(bits, bit, bArr2, bArr);
        }
        l0Var.skipBits(l0Var.readBits(8) * 16);
        bArr = bArr2;
        return new c(bits, bit, bArr2, bArr);
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
    public void reset() {
        this.f69904f.reset();
    }

    @Override // hp.s
    public void parse(byte[] bArr, int i10, int i11, r rVar, k kVar) {
        h hVar;
        boolean z10;
        hp.c cVar;
        char c10;
        char c11;
        char c12;
        int i12;
        h hVar2;
        int i13;
        int i14;
        f fVar;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int i18;
        f fVar2;
        int bits;
        int bits2;
        int bits3;
        int bits4;
        int i19;
        int bits5;
        l0 l0Var = new l0(bArr, i10 + i11);
        l0Var.setPosition(i10);
        while (true) {
            int iBitsLeft = l0Var.bitsLeft();
            hVar = this.f69904f;
            z10 = true;
            if (iBitsLeft >= 48 && l0Var.readBits(8) == 15) {
                int bits6 = l0Var.readBits(8);
                int bits7 = l0Var.readBits(16);
                int bits8 = l0Var.readBits(16);
                int bytePosition = l0Var.getBytePosition() + bits8;
                if (bits8 * 8 > l0Var.bitsLeft()) {
                    b0.w("DvbParser", "Data field length exceeds limit");
                    l0Var.skipBits(l0Var.bitsLeft());
                } else {
                    switch (bits6) {
                        case 16:
                            if (bits7 == hVar.f69937a) {
                                d dVar = hVar.f69945i;
                                int bits9 = l0Var.readBits(8);
                                int bits10 = l0Var.readBits(4);
                                int bits11 = l0Var.readBits(2);
                                l0Var.skipBits(2);
                                int i20 = bits8 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i20 > 0) {
                                    int bits12 = l0Var.readBits(8);
                                    l0Var.skipBits(8);
                                    i20 -= 6;
                                    sparseArray.put(bits12, new e(l0Var.readBits(16), l0Var.readBits(16)));
                                }
                                d dVar2 = new d(bits9, bits10, bits11, sparseArray);
                                if (dVar2.f69921b == 0) {
                                    if (dVar != null && dVar.f69920a != dVar2.f69920a) {
                                        hVar.f69945i = dVar2;
                                        break;
                                    }
                                } else {
                                    hVar.f69945i = dVar2;
                                    hVar.f69939c.clear();
                                    hVar.f69940d.clear();
                                    hVar.f69941e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f69945i;
                            SparseArray sparseArray2 = hVar.f69939c;
                            if (bits7 == hVar.f69937a && dVar3 != null) {
                                int bits13 = l0Var.readBits(8);
                                l0Var.skipBits(4);
                                boolean bit = l0Var.readBit();
                                l0Var.skipBits(3);
                                int bits14 = l0Var.readBits(16);
                                int bits15 = l0Var.readBits(16);
                                int bits16 = l0Var.readBits(3);
                                int bits17 = l0Var.readBits(3);
                                l0Var.skipBits(2);
                                int bits18 = l0Var.readBits(8);
                                int bits19 = l0Var.readBits(8);
                                int bits20 = l0Var.readBits(4);
                                int bits21 = l0Var.readBits(2);
                                l0Var.skipBits(2);
                                int i21 = bits8 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i21 > 0) {
                                    int bits22 = l0Var.readBits(16);
                                    int bits23 = l0Var.readBits(2);
                                    int bits24 = l0Var.readBits(2);
                                    int bits25 = l0Var.readBits(12);
                                    l0Var.skipBits(4);
                                    int bits26 = l0Var.readBits(12);
                                    int i22 = i21 - 6;
                                    if (bits23 == 1 || bits23 == 2) {
                                        i21 -= 8;
                                        bits = l0Var.readBits(8);
                                        bits2 = l0Var.readBits(8);
                                    } else {
                                        i21 = i22;
                                        bits = 0;
                                        bits2 = 0;
                                    }
                                    sparseArray3.put(bits22, new g(bits23, bits24, bits25, bits26, bits, bits2));
                                }
                                f fVar3 = new f(bits13, bit, bits14, bits15, bits16, bits17, bits18, bits19, bits20, bits21, sparseArray3);
                                int i23 = dVar3.f69921b;
                                int i24 = fVar3.f69925a;
                                if (i23 == 0 && (fVar2 = (f) sparseArray2.get(i24)) != null) {
                                    fVar3.mergeFrom(fVar2);
                                }
                                sparseArray2.put(i24, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (bits7 != hVar.f69937a) {
                                if (bits7 == hVar.f69938b) {
                                    C0709a c0709aF = f(l0Var, bits8);
                                    hVar.f69942f.put(c0709aF.f69906a, c0709aF);
                                    break;
                                }
                            } else {
                                C0709a c0709aF2 = f(l0Var, bits8);
                                hVar.f69940d.put(c0709aF2.f69906a, c0709aF2);
                                break;
                            }
                            break;
                        case 19:
                            if (bits7 != hVar.f69937a) {
                                if (bits7 == hVar.f69938b) {
                                    c cVarG = g(l0Var);
                                    hVar.f69943g.put(cVarG.f69916a, cVarG);
                                    break;
                                }
                            } else {
                                c cVarG2 = g(l0Var);
                                hVar.f69941e.put(cVarG2.f69916a, cVarG2);
                                break;
                            }
                            break;
                        case 20:
                            if (bits7 == hVar.f69937a) {
                                l0Var.skipBits(4);
                                boolean bit2 = l0Var.readBit();
                                l0Var.skipBits(3);
                                int bits27 = l0Var.readBits(16);
                                int bits28 = l0Var.readBits(16);
                                if (bit2) {
                                    int bits29 = l0Var.readBits(16);
                                    bits3 = l0Var.readBits(16);
                                    bits5 = l0Var.readBits(16);
                                    bits4 = l0Var.readBits(16);
                                    i19 = bits29;
                                } else {
                                    bits3 = bits27;
                                    bits4 = bits28;
                                    i19 = 0;
                                    bits5 = 0;
                                }
                                hVar.f69944h = new b(bits27, bits28, i19, bits3, bits5, bits4);
                                break;
                            }
                            break;
                    }
                    l0Var.skipBytes(bytePosition - l0Var.getBytePosition());
                }
            }
        }
        d dVar4 = hVar.f69945i;
        if (dVar4 == null) {
            cVar = new hp.c(b5.of(), C.TIME_UNSET, C.TIME_UNSET);
        } else {
            b bVar = hVar.f69944h;
            if (bVar == null) {
                bVar = this.f69902d;
            }
            Bitmap bitmap = this.f69905g;
            Canvas canvas = this.f69901c;
            if (bitmap == null || bVar.f69910a + 1 != bitmap.getWidth() || bVar.f69911b + 1 != this.f69905g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f69910a + 1, bVar.f69911b + 1, Bitmap.Config.ARGB_8888);
                this.f69905g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray4 = dVar4.f69922c;
            int i25 = 0;
            while (i25 < sparseArray4.size()) {
                canvas.save();
                e eVar = (e) sparseArray4.valueAt(i25);
                f fVar4 = (f) hVar.f69939c.get(sparseArray4.keyAt(i25));
                int i26 = eVar.f69923a;
                int i27 = bVar.f69912c;
                int i28 = bVar.f69911b;
                boolean z11 = z10;
                int i29 = bVar.f69910a;
                int i30 = i26 + i27;
                int i31 = eVar.f69924b + bVar.f69914e;
                int i32 = fVar4.f69927c;
                int i33 = fVar4.f69930f;
                int i34 = fVar4.f69928d;
                SparseArray sparseArray5 = sparseArray4;
                int i35 = i31 + i34;
                int i36 = i25;
                canvas.clipRect(i30, i31, Math.min(i30 + i32, bVar.f69913d), Math.min(i35, bVar.f69915f));
                C0709a c0709a = (C0709a) hVar.f69940d.get(i33);
                if (c0709a == null && (c0709a = (C0709a) hVar.f69942f.get(i33)) == null) {
                    c0709a = this.f69903e;
                }
                SparseArray sparseArray6 = fVar4.f69934j;
                b bVar2 = bVar;
                int i37 = 0;
                while (i37 < sparseArray6.size()) {
                    int iKeyAt = sparseArray6.keyAt(i37);
                    SparseArray sparseArray7 = sparseArray6;
                    g gVar = (g) sparseArray6.valueAt(i37);
                    int i38 = i37;
                    c cVar2 = (c) hVar.f69941e.get(iKeyAt);
                    if (cVar2 == null) {
                        cVar2 = (c) hVar.f69943g.get(iKeyAt);
                    }
                    c cVar3 = cVar2;
                    if (cVar3 != null) {
                        Paint paint = cVar3.f69917b ? null : this.f69899a;
                        hVar2 = hVar;
                        f fVar5 = fVar4;
                        int i39 = fVar5.f69929e;
                        int i40 = gVar.f69935a + i30;
                        int i41 = gVar.f69936b + i31;
                        i16 = i28;
                        Paint paint2 = paint;
                        arrayList = arrayList2;
                        i18 = i30;
                        fVar = fVar5;
                        i13 = i29;
                        i15 = i32;
                        i17 = i38;
                        int i42 = i31;
                        int[] iArr = i39 == 3 ? c0709a.f69909d : i39 == 2 ? c0709a.f69908c : c0709a.f69907b;
                        i14 = i42;
                        e(cVar3.f69918c, iArr, i39, i40, i41, paint2, canvas);
                        e(cVar3.f69919d, iArr, i39, i40, i41 + 1, paint2, canvas);
                    } else {
                        hVar2 = hVar;
                        i13 = i29;
                        i14 = i31;
                        fVar = fVar4;
                        i15 = i32;
                        i16 = i28;
                        i17 = i38;
                        arrayList = arrayList2;
                        i18 = i30;
                    }
                    i37 = i17 + 1;
                    i30 = i18;
                    i31 = i14;
                    fVar4 = fVar;
                    i32 = i15;
                    arrayList2 = arrayList;
                    sparseArray6 = sparseArray7;
                    hVar = hVar2;
                    i29 = i13;
                    i28 = i16;
                }
                ArrayList arrayList3 = arrayList2;
                h hVar3 = hVar;
                int i43 = i29;
                int i44 = i31;
                f fVar6 = fVar4;
                int i45 = i30;
                int i46 = i32;
                int i47 = i28;
                if (fVar6.f69926b) {
                    int i48 = fVar6.f69929e;
                    if (i48 == 3) {
                        i12 = c0709a.f69909d[fVar6.f69931g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i12 = i48 == 2 ? c0709a.f69908c[fVar6.f69932h] : c0709a.f69907b[fVar6.f69933i];
                    }
                    Paint paint3 = this.f69900b;
                    paint3.setColor(i12);
                    c11 = c12;
                    c10 = 3;
                    canvas.drawRect(i45, i44, i45 + i46, i35, paint3);
                } else {
                    c10 = 3;
                    c11 = 2;
                }
                float f10 = i43;
                float f11 = i47;
                arrayList3.add(new in.a().setBitmap(Bitmap.createBitmap(this.f69905g, i45, i44, i46, i34)).setPosition(i45 / f10).setPositionAnchor(0).setLine(i44 / f11, 0).setLineAnchor(0).setSize(i46 / f10).setBitmapHeight(i34 / f11).build());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i25 = i36 + 1;
                z10 = z11;
                arrayList2 = arrayList3;
                sparseArray4 = sparseArray5;
                bVar = bVar2;
                hVar = hVar3;
            }
            cVar = new hp.c(arrayList2, C.TIME_UNSET, C.TIME_UNSET);
        }
        kVar.accept(cVar);
    }
}
