package gf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.u0;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f57600h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f57601i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f57602j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f57603a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f57604b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f57605c;

    /* renamed from: d, reason: collision with root package name */
    public final C0573b f57606d;

    /* renamed from: e, reason: collision with root package name */
    public final a f57607e;

    /* renamed from: f, reason: collision with root package name */
    public final h f57608f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f57609g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f57610a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f57611b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f57612c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f57613d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f57610a = i10;
            this.f57611b = iArr;
            this.f57612c = iArr2;
            this.f57613d = iArr3;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: gf.b$b, reason: collision with other inner class name */
    public static final class C0573b {

        /* renamed from: a, reason: collision with root package name */
        public final int f57614a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57615b;

        /* renamed from: c, reason: collision with root package name */
        public final int f57616c;

        /* renamed from: d, reason: collision with root package name */
        public final int f57617d;

        /* renamed from: e, reason: collision with root package name */
        public final int f57618e;

        /* renamed from: f, reason: collision with root package name */
        public final int f57619f;

        public C0573b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f57614a = i10;
            this.f57615b = i11;
            this.f57616c = i12;
            this.f57617d = i13;
            this.f57618e = i14;
            this.f57619f = i15;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f57620a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57621b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f57622c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f57623d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f57620a = i10;
            this.f57621b = z10;
            this.f57622c = bArr;
            this.f57623d = bArr2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f57624a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57625b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f57626c;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f57624a = i11;
            this.f57625b = i12;
            this.f57626c = sparseArray;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f57627a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57628b;

        public e(int i10, int i11) {
            this.f57627a = i10;
            this.f57628b = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f57629a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57630b;

        /* renamed from: c, reason: collision with root package name */
        public final int f57631c;

        /* renamed from: d, reason: collision with root package name */
        public final int f57632d;

        /* renamed from: e, reason: collision with root package name */
        public final int f57633e;

        /* renamed from: f, reason: collision with root package name */
        public final int f57634f;

        /* renamed from: g, reason: collision with root package name */
        public final int f57635g;

        /* renamed from: h, reason: collision with root package name */
        public final int f57636h;

        /* renamed from: i, reason: collision with root package name */
        public final int f57637i;

        /* renamed from: j, reason: collision with root package name */
        public final SparseArray f57638j;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f57629a = i10;
            this.f57630b = z10;
            this.f57631c = i11;
            this.f57632d = i12;
            this.f57633e = i14;
            this.f57634f = i15;
            this.f57635g = i16;
            this.f57636h = i17;
            this.f57637i = i18;
            this.f57638j = sparseArray;
        }

        public void mergeFrom(f fVar) {
            SparseArray sparseArray = fVar.f57638j;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f57638j.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f57639a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57640b;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f57639a = i12;
            this.f57640b = i13;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f57641a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57642b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f57643c = new SparseArray();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f57644d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f57645e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray f57646f = new SparseArray();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray f57647g = new SparseArray();

        /* renamed from: h, reason: collision with root package name */
        public C0573b f57648h;

        /* renamed from: i, reason: collision with root package name */
        public d f57649i;

        public h(int i10, int i11) {
            this.f57641a = i10;
            this.f57642b = i11;
        }

        public void reset() {
            this.f57643c.clear();
            this.f57644d.clear();
            this.f57645e.clear();
            this.f57646f.clear();
            this.f57647g.clear();
            this.f57648h = null;
            this.f57649i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f57603a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f57604b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f57605c = new Canvas();
        this.f57606d = new C0573b(719, 575, 0, 719, 0, 575);
        this.f57607e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f57608f = new h(i10, i11);
    }

    public static byte[] a(int i10, int i11, u0 u0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) u0Var.readBits(i11);
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
        throw new UnsupportedOperationException("Method not decompiled: gf.b.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(u0 u0Var, int i10) {
        int bits;
        int i11;
        int bits2;
        int bits3;
        int bits4;
        int i12 = 8;
        int bits5 = u0Var.readBits(8);
        u0Var.skipBits(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int i15 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i14 > 0) {
            int bits6 = u0Var.readBits(i12);
            int bits7 = u0Var.readBits(i12);
            int[] iArr2 = (bits7 & 128) != 0 ? iArr : (bits7 & 64) != 0 ? iArrB : iArrC;
            if ((bits7 & 1) != 0) {
                bits3 = u0Var.readBits(i12);
                bits4 = u0Var.readBits(i12);
                bits = u0Var.readBits(i12);
                bits2 = u0Var.readBits(i12);
                i11 = i14 - 6;
            } else {
                int bits8 = u0Var.readBits(6) << i13;
                int bits9 = u0Var.readBits(4) << 4;
                bits = u0Var.readBits(4) << 4;
                i11 = i14 - 4;
                bits2 = u0Var.readBits(i13) << 6;
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
            iArr2[bits6] = d((byte) (255 - (bits2 & 255)), n1.constrainValue((int) ((1.402d * d11) + d10), 0, 255), n1.constrainValue((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), n1.constrainValue((int) ((d12 * 1.772d) + d10), 0, 255));
            i14 = i11;
            i15 = 0;
            bits5 = bits5;
            iArrC = iArrC;
            i12 = 8;
            i13 = 2;
        }
        return new a(bits5, iArr, iArrB, iArrC);
    }

    public static c g(u0 u0Var) {
        byte[] bArr;
        int bits = u0Var.readBits(16);
        u0Var.skipBits(4);
        int bits2 = u0Var.readBits(2);
        boolean bit = u0Var.readBit();
        u0Var.skipBits(1);
        byte[] bArr2 = n1.f28511f;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = u0Var.readBits(16);
                int bits4 = u0Var.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    u0Var.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    u0Var.readBytes(bArr, 0, bits4);
                }
            }
            return new c(bits, bit, bArr2, bArr);
        }
        u0Var.skipBits(u0Var.readBits(8) * 16);
        bArr = bArr2;
        return new c(bits, bit, bArr2, bArr);
    }

    public List<ef.b> decode(byte[] bArr, int i10) {
        h hVar;
        boolean z10;
        char c10;
        char c11;
        char c12;
        int i11;
        ArrayList arrayList;
        h hVar2;
        int i12;
        int i13;
        f fVar;
        int i14;
        int i15;
        f fVar2;
        int bits;
        int bits2;
        int bits3;
        int bits4;
        int i16;
        int bits5;
        u0 u0Var = new u0(bArr, i10);
        while (true) {
            int iBitsLeft = u0Var.bitsLeft();
            hVar = this.f57608f;
            z10 = true;
            if (iBitsLeft >= 48 && u0Var.readBits(8) == 15) {
                int bits6 = u0Var.readBits(8);
                int bits7 = u0Var.readBits(16);
                int bits8 = u0Var.readBits(16);
                int bytePosition = u0Var.getBytePosition() + bits8;
                if (bits8 * 8 > u0Var.bitsLeft()) {
                    f0.w("DvbParser", "Data field length exceeds limit");
                    u0Var.skipBits(u0Var.bitsLeft());
                } else {
                    switch (bits6) {
                        case 16:
                            if (bits7 == hVar.f57641a) {
                                d dVar = hVar.f57649i;
                                int bits9 = u0Var.readBits(8);
                                int bits10 = u0Var.readBits(4);
                                int bits11 = u0Var.readBits(2);
                                u0Var.skipBits(2);
                                int i17 = bits8 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i17 > 0) {
                                    int bits12 = u0Var.readBits(8);
                                    u0Var.skipBits(8);
                                    i17 -= 6;
                                    sparseArray.put(bits12, new e(u0Var.readBits(16), u0Var.readBits(16)));
                                }
                                d dVar2 = new d(bits9, bits10, bits11, sparseArray);
                                if (dVar2.f57625b == 0) {
                                    if (dVar != null && dVar.f57624a != dVar2.f57624a) {
                                        hVar.f57649i = dVar2;
                                        break;
                                    }
                                } else {
                                    hVar.f57649i = dVar2;
                                    hVar.f57643c.clear();
                                    hVar.f57644d.clear();
                                    hVar.f57645e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f57649i;
                            SparseArray sparseArray2 = hVar.f57643c;
                            if (bits7 == hVar.f57641a && dVar3 != null) {
                                int bits13 = u0Var.readBits(8);
                                u0Var.skipBits(4);
                                boolean bit = u0Var.readBit();
                                u0Var.skipBits(3);
                                int bits14 = u0Var.readBits(16);
                                int bits15 = u0Var.readBits(16);
                                int bits16 = u0Var.readBits(3);
                                int bits17 = u0Var.readBits(3);
                                u0Var.skipBits(2);
                                int bits18 = u0Var.readBits(8);
                                int bits19 = u0Var.readBits(8);
                                int bits20 = u0Var.readBits(4);
                                int bits21 = u0Var.readBits(2);
                                u0Var.skipBits(2);
                                int i18 = bits8 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i18 > 0) {
                                    int bits22 = u0Var.readBits(16);
                                    int bits23 = u0Var.readBits(2);
                                    int bits24 = u0Var.readBits(2);
                                    int bits25 = u0Var.readBits(12);
                                    u0Var.skipBits(4);
                                    int bits26 = u0Var.readBits(12);
                                    int i19 = i18 - 6;
                                    if (bits23 == 1 || bits23 == 2) {
                                        i18 -= 8;
                                        bits = u0Var.readBits(8);
                                        bits2 = u0Var.readBits(8);
                                    } else {
                                        i18 = i19;
                                        bits = 0;
                                        bits2 = 0;
                                    }
                                    sparseArray3.put(bits22, new g(bits23, bits24, bits25, bits26, bits, bits2));
                                }
                                f fVar3 = new f(bits13, bit, bits14, bits15, bits16, bits17, bits18, bits19, bits20, bits21, sparseArray3);
                                int i20 = dVar3.f57625b;
                                int i21 = fVar3.f57629a;
                                if (i20 == 0 && (fVar2 = (f) sparseArray2.get(i21)) != null) {
                                    fVar3.mergeFrom(fVar2);
                                }
                                sparseArray2.put(i21, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (bits7 != hVar.f57641a) {
                                if (bits7 == hVar.f57642b) {
                                    a aVarF = f(u0Var, bits8);
                                    hVar.f57646f.put(aVarF.f57610a, aVarF);
                                    break;
                                }
                            } else {
                                a aVarF2 = f(u0Var, bits8);
                                hVar.f57644d.put(aVarF2.f57610a, aVarF2);
                                break;
                            }
                            break;
                        case 19:
                            if (bits7 != hVar.f57641a) {
                                if (bits7 == hVar.f57642b) {
                                    c cVarG = g(u0Var);
                                    hVar.f57647g.put(cVarG.f57620a, cVarG);
                                    break;
                                }
                            } else {
                                c cVarG2 = g(u0Var);
                                hVar.f57645e.put(cVarG2.f57620a, cVarG2);
                                break;
                            }
                            break;
                        case 20:
                            if (bits7 == hVar.f57641a) {
                                u0Var.skipBits(4);
                                boolean bit2 = u0Var.readBit();
                                u0Var.skipBits(3);
                                int bits27 = u0Var.readBits(16);
                                int bits28 = u0Var.readBits(16);
                                if (bit2) {
                                    int bits29 = u0Var.readBits(16);
                                    bits3 = u0Var.readBits(16);
                                    bits5 = u0Var.readBits(16);
                                    bits4 = u0Var.readBits(16);
                                    i16 = bits29;
                                } else {
                                    bits3 = bits27;
                                    bits4 = bits28;
                                    i16 = 0;
                                    bits5 = 0;
                                }
                                hVar.f57648h = new C0573b(bits27, bits28, i16, bits3, bits5, bits4);
                                break;
                            }
                            break;
                    }
                    u0Var.skipBytes(bytePosition - u0Var.getBytePosition());
                }
            }
        }
        d dVar4 = hVar.f57649i;
        if (dVar4 == null) {
            return Collections.EMPTY_LIST;
        }
        C0573b c0573b = hVar.f57648h;
        if (c0573b == null) {
            c0573b = this.f57606d;
        }
        Bitmap bitmap = this.f57609g;
        Canvas canvas = this.f57605c;
        if (bitmap == null || c0573b.f57614a + 1 != bitmap.getWidth() || c0573b.f57615b + 1 != this.f57609g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0573b.f57614a + 1, c0573b.f57615b + 1, Bitmap.Config.ARGB_8888);
            this.f57609g = bitmapCreateBitmap;
            canvas.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray4 = dVar4.f57626c;
        int i22 = 0;
        while (i22 < sparseArray4.size()) {
            canvas.save();
            e eVar = (e) sparseArray4.valueAt(i22);
            f fVar4 = (f) hVar.f57643c.get(sparseArray4.keyAt(i22));
            int i23 = eVar.f57627a;
            int i24 = c0573b.f57616c;
            int i25 = c0573b.f57615b;
            boolean z11 = z10;
            int i26 = c0573b.f57614a;
            int i27 = i23 + i24;
            int i28 = eVar.f57628b + c0573b.f57618e;
            int i29 = fVar4.f57631c;
            int i30 = fVar4.f57634f;
            int i31 = fVar4.f57631c;
            int i32 = fVar4.f57632d;
            SparseArray sparseArray5 = sparseArray4;
            int i33 = i22;
            canvas.clipRect(i27, i28, Math.min(i29 + i27, c0573b.f57617d), Math.min(i28 + i32, c0573b.f57619f));
            a aVar = (a) hVar.f57644d.get(i30);
            if (aVar == null && (aVar = (a) hVar.f57646f.get(i30)) == null) {
                aVar = this.f57607e;
            }
            SparseArray sparseArray6 = fVar4.f57638j;
            int i34 = 0;
            while (i34 < sparseArray6.size()) {
                int iKeyAt = sparseArray6.keyAt(i34);
                C0573b c0573b2 = c0573b;
                g gVar = (g) sparseArray6.valueAt(i34);
                SparseArray sparseArray7 = sparseArray6;
                c cVar = (c) hVar.f57645e.get(iKeyAt);
                if (cVar == null) {
                    cVar = (c) hVar.f57647g.get(iKeyAt);
                }
                if (cVar != null) {
                    Paint paint = cVar.f57621b ? null : this.f57603a;
                    hVar2 = hVar;
                    f fVar5 = fVar4;
                    int i35 = fVar5.f57633e;
                    int i36 = gVar.f57639a + i27;
                    int i37 = gVar.f57640b + i28;
                    i12 = i34;
                    int i38 = i28;
                    int[] iArr = i35 == 3 ? aVar.f57613d : i35 == 2 ? aVar.f57612c : aVar.f57611b;
                    i13 = i38;
                    arrayList = arrayList2;
                    i14 = i27;
                    fVar = fVar5;
                    int i39 = i25;
                    Paint paint2 = paint;
                    i15 = i39;
                    e(cVar.f57622c, iArr, i35, i36, i37, paint2, canvas);
                    e(cVar.f57623d, iArr, i35, i36, i37 + 1, paint2, canvas);
                } else {
                    arrayList = arrayList2;
                    hVar2 = hVar;
                    i12 = i34;
                    i13 = i28;
                    fVar = fVar4;
                    i14 = i27;
                    i15 = i25;
                }
                i34 = i12 + 1;
                i28 = i13;
                i27 = i14;
                fVar4 = fVar;
                sparseArray6 = sparseArray7;
                c0573b = c0573b2;
                hVar = hVar2;
                arrayList2 = arrayList;
                i25 = i15;
            }
            C0573b c0573b3 = c0573b;
            ArrayList arrayList3 = arrayList2;
            h hVar3 = hVar;
            int i40 = i28;
            f fVar6 = fVar4;
            int i41 = i27;
            int i42 = i25;
            if (fVar6.f57630b) {
                int i43 = fVar6.f57633e;
                if (i43 == 3) {
                    i11 = aVar.f57613d[fVar6.f57635g];
                    c12 = 2;
                } else {
                    c12 = 2;
                    i11 = i43 == 2 ? aVar.f57612c[fVar6.f57636h] : aVar.f57611b[fVar6.f57637i];
                }
                Paint paint3 = this.f57604b;
                paint3.setColor(i11);
                c10 = c12;
                c11 = 3;
                canvas.drawRect(i41, i40, i41 + i31, i40 + i32, paint3);
            } else {
                c10 = 2;
                c11 = 3;
            }
            arrayList3.add(new ef.a().setBitmap(Bitmap.createBitmap(this.f57609g, i41, i40, i31, i32)).setPosition(i41 / i26).setPositionAnchor(0).setLine(i40 / i42, 0).setLineAnchor(0).setSize(i31 / i26).setBitmapHeight(i32 / i42).build());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.restore();
            i22 = i33 + 1;
            z10 = z11;
            arrayList2 = arrayList3;
            sparseArray4 = sparseArray5;
            c0573b = c0573b3;
            hVar = hVar3;
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public void reset() {
        this.f57608f.reset();
    }
}
