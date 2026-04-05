package io.odeeo.internal.f0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.internal.d0.a;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f63953h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f63954i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f63955j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f63956a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f63957b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f63958c;

    /* renamed from: d, reason: collision with root package name */
    public final C0611b f63959d;

    /* renamed from: e, reason: collision with root package name */
    public final a f63960e;

    /* renamed from: f, reason: collision with root package name */
    public final h f63961f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f63962g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f63963a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f63964b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f63965c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f63966d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f63963a = i10;
            this.f63964b = iArr;
            this.f63965c = iArr2;
            this.f63966d = iArr3;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.f0.b$b, reason: collision with other inner class name */
    public static final class C0611b {

        /* renamed from: a, reason: collision with root package name */
        public final int f63967a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63968b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63969c;

        /* renamed from: d, reason: collision with root package name */
        public final int f63970d;

        /* renamed from: e, reason: collision with root package name */
        public final int f63971e;

        /* renamed from: f, reason: collision with root package name */
        public final int f63972f;

        public C0611b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f63967a = i10;
            this.f63968b = i11;
            this.f63969c = i12;
            this.f63970d = i13;
            this.f63971e = i14;
            this.f63972f = i15;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f63973a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f63974b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f63975c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f63976d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f63973a = i10;
            this.f63974b = z10;
            this.f63975c = bArr;
            this.f63976d = bArr2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f63977a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63978b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63979c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f63980d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f63977a = i10;
            this.f63978b = i11;
            this.f63979c = i12;
            this.f63980d = sparseArray;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f63981a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63982b;

        public e(int i10, int i11) {
            this.f63981a = i10;
            this.f63982b = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f63983a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f63984b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63985c;

        /* renamed from: d, reason: collision with root package name */
        public final int f63986d;

        /* renamed from: e, reason: collision with root package name */
        public final int f63987e;

        /* renamed from: f, reason: collision with root package name */
        public final int f63988f;

        /* renamed from: g, reason: collision with root package name */
        public final int f63989g;

        /* renamed from: h, reason: collision with root package name */
        public final int f63990h;

        /* renamed from: i, reason: collision with root package name */
        public final int f63991i;

        /* renamed from: j, reason: collision with root package name */
        public final int f63992j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f63993k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f63983a = i10;
            this.f63984b = z10;
            this.f63985c = i11;
            this.f63986d = i12;
            this.f63987e = i13;
            this.f63988f = i14;
            this.f63989g = i15;
            this.f63990h = i16;
            this.f63991i = i17;
            this.f63992j = i18;
            this.f63993k = sparseArray;
        }

        public void mergeFrom(f fVar) {
            SparseArray<g> sparseArray = fVar.f63993k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f63993k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f63994a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63995b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63996c;

        /* renamed from: d, reason: collision with root package name */
        public final int f63997d;

        /* renamed from: e, reason: collision with root package name */
        public final int f63998e;

        /* renamed from: f, reason: collision with root package name */
        public final int f63999f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f63994a = i10;
            this.f63995b = i11;
            this.f63996c = i12;
            this.f63997d = i13;
            this.f63998e = i14;
            this.f63999f = i15;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f64000a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64001b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f64002c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f64003d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f64004e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f64005f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f64006g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public C0611b f64007h;

        /* renamed from: i, reason: collision with root package name */
        public d f64008i;

        public h(int i10, int i11) {
            this.f64000a = i10;
            this.f64001b = i11;
        }

        public void reset() {
            this.f64002c.clear();
            this.f64003d.clear();
            this.f64004e.clear();
            this.f64005f.clear();
            this.f64006g.clear();
            this.f64007h = null;
            this.f64008i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f63956a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f63957b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f63958c = new Canvas();
        this.f63959d = new C0611b(719, 575, 0, 719, 0, 575);
        this.f63960e = new a(0, a(), b(), c());
        this.f63961f = new h(i10, i11);
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static d b(w wVar, int i10) {
        int bits = wVar.readBits(8);
        int bits2 = wVar.readBits(4);
        int bits3 = wVar.readBits(2);
        wVar.skipBits(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int bits4 = wVar.readBits(8);
            wVar.skipBits(8);
            i11 -= 6;
            sparseArray.put(bits4, new e(wVar.readBits(16), wVar.readBits(16)));
        }
        return new d(bits, bits2, bits3, sparseArray);
    }

    public static f c(w wVar, int i10) {
        int i11;
        int bits;
        int bits2;
        char c10;
        int bits3 = wVar.readBits(8);
        int i12 = 4;
        wVar.skipBits(4);
        boolean bit = wVar.readBit();
        wVar.skipBits(3);
        int i13 = 16;
        int bits4 = wVar.readBits(16);
        int bits5 = wVar.readBits(16);
        int bits6 = wVar.readBits(3);
        int bits7 = wVar.readBits(3);
        int i14 = 2;
        wVar.skipBits(2);
        int bits8 = wVar.readBits(8);
        int bits9 = wVar.readBits(8);
        int bits10 = wVar.readBits(4);
        int bits11 = wVar.readBits(2);
        wVar.skipBits(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int bits12 = wVar.readBits(i13);
            int bits13 = wVar.readBits(i14);
            int bits14 = wVar.readBits(i14);
            int bits15 = wVar.readBits(12);
            wVar.skipBits(i12);
            int bits16 = wVar.readBits(12);
            int i16 = i15 - 6;
            if (bits13 != 1) {
                i11 = 2;
                if (bits13 != 2) {
                    bits2 = 0;
                    bits = 0;
                    i15 = i16;
                    c10 = '\b';
                }
                sparseArray.put(bits12, new g(bits13, bits14, bits15, bits16, bits2, bits));
                i13 = 16;
                i14 = i11;
                i12 = 4;
            } else {
                i11 = 2;
            }
            c10 = '\b';
            i15 -= 8;
            bits2 = wVar.readBits(8);
            bits = wVar.readBits(8);
            sparseArray.put(bits12, new g(bits13, bits14, bits15, bits16, bits2, bits));
            i13 = 16;
            i14 = i11;
            i12 = 4;
        }
        return new f(bits3, bit, bits4, bits5, bits6, bits7, bits8, bits9, bits10, bits11, sparseArray);
    }

    public List<io.odeeo.internal.d0.a> decode(byte[] bArr, int i10) {
        SparseArray<e> sparseArray;
        int i11;
        w wVar = new w(bArr, i10);
        while (wVar.bitsLeft() >= 48 && wVar.readBits(8) == 15) {
            a(wVar, this.f63961f);
        }
        h hVar = this.f63961f;
        d dVar = hVar.f64008i;
        if (dVar == null) {
            return Collections.EMPTY_LIST;
        }
        C0611b c0611b = hVar.f64007h;
        if (c0611b == null) {
            c0611b = this.f63959d;
        }
        Bitmap bitmap = this.f63962g;
        if (bitmap == null || c0611b.f63967a + 1 != bitmap.getWidth() || c0611b.f63968b + 1 != this.f63962g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0611b.f63967a + 1, c0611b.f63968b + 1, Bitmap.Config.ARGB_8888);
            this.f63962g = bitmapCreateBitmap;
            this.f63958c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f63980d;
        int i12 = 0;
        while (i12 < sparseArray2.size()) {
            this.f63958c.save();
            e eVarValueAt = sparseArray2.valueAt(i12);
            f fVar = this.f63961f.f64002c.get(sparseArray2.keyAt(i12));
            int i13 = eVarValueAt.f63981a + c0611b.f63969c;
            int i14 = eVarValueAt.f63982b + c0611b.f63971e;
            this.f63958c.clipRect(i13, i14, Math.min(fVar.f63985c + i13, c0611b.f63970d), Math.min(fVar.f63986d + i14, c0611b.f63972f));
            a aVar = this.f63961f.f64003d.get(fVar.f63989g);
            if (aVar == null && (aVar = this.f63961f.f64005f.get(fVar.f63989g)) == null) {
                aVar = this.f63960e;
            }
            a aVar2 = aVar;
            SparseArray<g> sparseArray3 = fVar.f63993k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i15);
                g gVarValueAt = sparseArray3.valueAt(i15);
                c cVar = this.f63961f.f64004e.get(iKeyAt);
                if (cVar == null) {
                    cVar = this.f63961f.f64006g.get(iKeyAt);
                }
                if (cVar != null) {
                    sparseArray = sparseArray2;
                    i11 = i15;
                    a(cVar, aVar2, fVar.f63988f, gVarValueAt.f63996c + i13, gVarValueAt.f63997d + i14, cVar.f63974b ? null : this.f63956a, this.f63958c);
                } else {
                    sparseArray = sparseArray2;
                    i11 = i15;
                }
                i15 = i11 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray<e> sparseArray4 = sparseArray2;
            if (fVar.f63984b) {
                int i16 = fVar.f63988f;
                this.f63957b.setColor(i16 == 3 ? aVar2.f63966d[fVar.f63990h] : i16 == 2 ? aVar2.f63965c[fVar.f63991i] : aVar2.f63964b[fVar.f63992j]);
                this.f63958c.drawRect(i13, i14, fVar.f63985c + i13, fVar.f63986d + i14, this.f63957b);
            }
            arrayList.add(new a.b().setBitmap(Bitmap.createBitmap(this.f63962g, i13, i14, fVar.f63985c, fVar.f63986d)).setPosition(i13 / c0611b.f63967a).setPositionAnchor(0).setLine(i14 / c0611b.f63968b, 0).setLineAnchor(0).setSize(fVar.f63985c / c0611b.f63967a).setBitmapHeight(fVar.f63986d / c0611b.f63968b).build());
            this.f63958c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f63958c.restore();
            i12++;
            sparseArray2 = sparseArray4;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void reset() {
        this.f63961f.reset();
    }

    public static void a(w wVar, h hVar) {
        f fVar;
        int bits = wVar.readBits(8);
        int bits2 = wVar.readBits(16);
        int bits3 = wVar.readBits(16);
        int bytePosition = wVar.getBytePosition() + bits3;
        if (bits3 * 8 > wVar.bitsLeft()) {
            p.w("DvbParser", "Data field length exceeds limit");
            wVar.skipBits(wVar.bitsLeft());
            return;
        }
        switch (bits) {
            case 16:
                if (bits2 == hVar.f64000a) {
                    d dVar = hVar.f64008i;
                    d dVarB = b(wVar, bits3);
                    if (dVarB.f63979c == 0) {
                        if (dVar != null && dVar.f63978b != dVarB.f63978b) {
                            hVar.f64008i = dVarB;
                            break;
                        }
                    } else {
                        hVar.f64008i = dVarB;
                        hVar.f64002c.clear();
                        hVar.f64003d.clear();
                        hVar.f64004e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f64008i;
                if (bits2 == hVar.f64000a && dVar2 != null) {
                    f fVarC = c(wVar, bits3);
                    if (dVar2.f63979c == 0 && (fVar = hVar.f64002c.get(fVarC.f63983a)) != null) {
                        fVarC.mergeFrom(fVar);
                    }
                    hVar.f64002c.put(fVarC.f63983a, fVarC);
                    break;
                }
                break;
            case 18:
                if (bits2 != hVar.f64000a) {
                    if (bits2 == hVar.f64001b) {
                        a aVarA = a(wVar, bits3);
                        hVar.f64005f.put(aVarA.f63963a, aVarA);
                        break;
                    }
                } else {
                    a aVarA2 = a(wVar, bits3);
                    hVar.f64003d.put(aVarA2.f63963a, aVarA2);
                    break;
                }
                break;
            case 19:
                if (bits2 != hVar.f64000a) {
                    if (bits2 == hVar.f64001b) {
                        c cVarB = b(wVar);
                        hVar.f64006g.put(cVarB.f63973a, cVarB);
                        break;
                    }
                } else {
                    c cVarB2 = b(wVar);
                    hVar.f64004e.put(cVarB2.f63973a, cVarB2);
                    break;
                }
                break;
            case 20:
                if (bits2 == hVar.f64000a) {
                    hVar.f64007h = a(wVar);
                    break;
                }
                break;
        }
        wVar.skipBytes(bytePosition - wVar.getBytePosition());
    }

    public static c b(w wVar) {
        byte[] bArr;
        int bits = wVar.readBits(16);
        wVar.skipBits(4);
        int bits2 = wVar.readBits(2);
        boolean bit = wVar.readBit();
        wVar.skipBits(1);
        byte[] bArr2 = g0.f65866f;
        if (bits2 == 1) {
            wVar.skipBits(wVar.readBits(8) * 16);
        } else {
            if (bits2 == 0) {
                int bits3 = wVar.readBits(16);
                int bits4 = wVar.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    wVar.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    wVar.readBytes(bArr, 0, bits4);
                }
            }
            return new c(bits, bit, bArr2, bArr);
        }
        bArr = bArr2;
        return new c(bits, bit, bArr2, bArr);
    }

    public static int[] c() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i11 == 0) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = a(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int b(w wVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int bits;
        int bits2;
        boolean z11 = false;
        while (true) {
            int bits3 = wVar.readBits(4);
            if (bits3 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (!wVar.readBit()) {
                int bits4 = wVar.readBits(3);
                if (bits4 != 0) {
                    z10 = z11;
                    i12 = bits4 + 2;
                    bits3 = 0;
                } else {
                    z10 = true;
                    bits3 = 0;
                    i12 = 0;
                }
            } else {
                if (!wVar.readBit()) {
                    bits = wVar.readBits(2) + 4;
                    bits2 = wVar.readBits(4);
                } else {
                    int bits5 = wVar.readBits(2);
                    if (bits5 == 0) {
                        z10 = z11;
                        i12 = 1;
                        bits3 = 0;
                    } else if (bits5 == 1) {
                        bits3 = 0;
                        i12 = 2;
                        z10 = z11;
                    } else if (bits5 == 2) {
                        bits = wVar.readBits(4) + 9;
                        bits2 = wVar.readBits(4);
                    } else if (bits5 != 3) {
                        z10 = z11;
                        bits3 = 0;
                        i12 = 0;
                    } else {
                        bits = wVar.readBits(8) + 25;
                        bits2 = wVar.readBits(4);
                    }
                }
                z10 = z11;
                i12 = bits;
                bits3 = bits2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    public static int c(w wVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int bits;
        boolean z11 = false;
        while (true) {
            int bits2 = wVar.readBits(8);
            if (bits2 != 0) {
                z10 = z11;
                bits = 1;
            } else if (!wVar.readBit()) {
                int bits3 = wVar.readBits(7);
                if (bits3 != 0) {
                    z10 = z11;
                    bits = bits3;
                    bits2 = 0;
                } else {
                    z10 = true;
                    bits2 = 0;
                    bits = 0;
                }
            } else {
                z10 = z11;
                bits = wVar.readBits(7);
                bits2 = wVar.readBits(8);
            }
            if (bits != 0 && paint != null) {
                if (bArr != null) {
                    bits2 = bArr[bits2];
                }
                paint.setColor(iArr[bits2]);
                canvas.drawRect(i10, i11, i10 + bits, 1 + i11, paint);
            }
            i10 += bits;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    public static C0611b a(w wVar) {
        int i10;
        int i11;
        int i12;
        int bits;
        wVar.skipBits(4);
        boolean bit = wVar.readBit();
        wVar.skipBits(3);
        int bits2 = wVar.readBits(16);
        int bits3 = wVar.readBits(16);
        if (bit) {
            int bits4 = wVar.readBits(16);
            int bits5 = wVar.readBits(16);
            int bits6 = wVar.readBits(16);
            bits = wVar.readBits(16);
            i12 = bits5;
            i11 = bits6;
            i10 = bits4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = bits2;
            bits = bits3;
        }
        return new C0611b(bits2, bits3, i10, i12, i11, bits);
    }

    public static a a(w wVar, int i10) {
        int bits;
        int i11;
        int bits2;
        int bits3;
        int bits4;
        int i12 = 8;
        int bits5 = wVar.readBits(8);
        wVar.skipBits(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i14 > 0) {
            int bits6 = wVar.readBits(i12);
            int bits7 = wVar.readBits(i12);
            int[] iArr = (bits7 & 128) != 0 ? iArrA : (bits7 & 64) != 0 ? iArrB : iArrC;
            if ((bits7 & 1) != 0) {
                bits3 = wVar.readBits(i12);
                bits4 = wVar.readBits(i12);
                bits = wVar.readBits(i12);
                bits2 = wVar.readBits(i12);
                i11 = i14 - 6;
            } else {
                int bits8 = wVar.readBits(6) << i13;
                int bits9 = wVar.readBits(4) << 4;
                bits = wVar.readBits(4) << 4;
                i11 = i14 - 4;
                bits2 = wVar.readBits(i13) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits2 = 255;
                bits4 = 0;
                bits = 0;
            }
            double d10 = bits3;
            double d11 = bits4 - 128;
            double d12 = bits - 128;
            iArr[bits6] = a((byte) (255 - (bits2 & 255)), g0.constrainValue((int) ((1.402d * d11) + d10), 0, 255), g0.constrainValue((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), g0.constrainValue((int) ((d12 * 1.772d) + d10), 0, 255));
            i14 = i11;
            bits5 = bits5;
            i12 = 8;
            i13 = 2;
        }
        return new a(bits5, iArrA, iArrB, iArrC);
    }

    public static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static void a(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f63966d;
        } else if (i10 == 2) {
            iArr = aVar.f63965c;
        } else {
            iArr = aVar.f63964b;
        }
        int[] iArr2 = iArr;
        a(cVar.f63975c, iArr2, i10, i11, i12, paint, canvas);
        a(cVar.f63976d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    public static void a(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        Canvas canvas2;
        byte[] bArr2;
        Paint paint2;
        byte[] bArr3;
        byte[] bArr4;
        Paint paint3;
        w wVar = new w(bArr);
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        int iA = i11;
        int i13 = i12;
        byte[] bArrA3 = null;
        while (wVar.bitsLeft() != 0) {
            int bits = wVar.readBits(8);
            if (bits != 240) {
                switch (bits) {
                    case 16:
                        int[] iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        if (i10 != 3) {
                            if (i10 != 2) {
                                bArr2 = null;
                                paint2 = paint4;
                            } else if (bArrA2 == null) {
                                bArr3 = f63953h;
                                paint2 = paint4;
                                bArr2 = bArr3;
                            } else {
                                paint2 = paint4;
                                bArr2 = bArrA2;
                            }
                            iA = a(wVar, iArr2, bArr2, iA, i13, paint2, canvas2);
                            wVar.byteAlign();
                            iArr = iArr2;
                            paint = paint2;
                        } else if (bArrA3 == null) {
                            bArr3 = f63954i;
                            paint2 = paint4;
                            bArr2 = bArr3;
                            iA = a(wVar, iArr2, bArr2, iA, i13, paint2, canvas2);
                            wVar.byteAlign();
                            iArr = iArr2;
                            paint = paint2;
                            break;
                        } else {
                            paint2 = paint4;
                            bArr2 = bArrA3;
                            iA = a(wVar, iArr2, bArr2, iA, i13, paint2, canvas2);
                            wVar.byteAlign();
                            iArr = iArr2;
                            paint = paint2;
                        }
                    case 17:
                        int[] iArr3 = iArr;
                        Paint paint5 = paint;
                        canvas2 = canvas;
                        if (i10 != 3) {
                            bArr4 = null;
                            paint3 = paint5;
                        } else if (bArrA == null) {
                            paint3 = paint5;
                            bArr4 = f63955j;
                        } else {
                            paint3 = paint5;
                            bArr4 = bArrA;
                        }
                        iA = b(wVar, iArr3, bArr4, iA, i13, paint3, canvas2);
                        wVar.byteAlign();
                        paint = paint3;
                        iArr = iArr3;
                        break;
                    case 18:
                        iA = c(wVar, iArr, null, iA, i13, paint, canvas);
                        continue;
                    default:
                        switch (bits) {
                            case 32:
                                bArrA2 = a(4, 4, wVar);
                                break;
                            case 33:
                                bArrA3 = a(4, 8, wVar);
                                break;
                            case 34:
                                bArrA = a(16, 8, wVar);
                                break;
                            default:
                                continue;
                        }
                }
                canvas = canvas2;
            } else {
                i13 += 2;
                iA = i11;
            }
        }
    }

    public static int a(w wVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int bits;
        int bits2;
        boolean z11 = false;
        while (true) {
            int bits3 = wVar.readBits(2);
            if (bits3 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (wVar.readBit()) {
                    bits = wVar.readBits(3) + 3;
                    bits2 = wVar.readBits(2);
                } else {
                    if (wVar.readBit()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int bits4 = wVar.readBits(2);
                        if (bits4 == 0) {
                            z10 = true;
                        } else if (bits4 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (bits4 == 2) {
                            bits = wVar.readBits(4) + 12;
                            bits2 = wVar.readBits(2);
                        } else if (bits4 != 3) {
                            z10 = z11;
                        } else {
                            bits = wVar.readBits(8) + 29;
                            bits2 = wVar.readBits(2);
                        }
                        bits3 = 0;
                        i12 = 0;
                    }
                    bits3 = 0;
                }
                z10 = z11;
                i12 = bits;
                bits3 = bits2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    public static byte[] a(int i10, int i11, w wVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) wVar.readBits(i11);
        }
        return bArr;
    }
}
