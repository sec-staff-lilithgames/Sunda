package io.odeeo.internal.g0;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import io.odeeo.internal.d0.a;
import io.odeeo.internal.d0.e;
import io.odeeo.internal.d0.f;
import io.odeeo.internal.d0.h;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends e {

    /* renamed from: o, reason: collision with root package name */
    public final x f64194o;

    /* renamed from: p, reason: collision with root package name */
    public final x f64195p;

    /* renamed from: q, reason: collision with root package name */
    public final C0615a f64196q;

    /* renamed from: r, reason: collision with root package name */
    public Inflater f64197r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.g0.a$a, reason: collision with other inner class name */
    public static final class C0615a {

        /* renamed from: a, reason: collision with root package name */
        public final x f64198a = new x();

        /* renamed from: b, reason: collision with root package name */
        public final int[] f64199b = new int[NotificationCompat.FLAG_LOCAL_ONLY];

        /* renamed from: c, reason: collision with root package name */
        public boolean f64200c;

        /* renamed from: d, reason: collision with root package name */
        public int f64201d;

        /* renamed from: e, reason: collision with root package name */
        public int f64202e;

        /* renamed from: f, reason: collision with root package name */
        public int f64203f;

        /* renamed from: g, reason: collision with root package name */
        public int f64204g;

        /* renamed from: h, reason: collision with root package name */
        public int f64205h;

        /* renamed from: i, reason: collision with root package name */
        public int f64206i;

        public io.odeeo.internal.d0.a build() {
            int unsignedByte;
            if (this.f64201d == 0 || this.f64202e == 0 || this.f64205h == 0 || this.f64206i == 0 || this.f64198a.limit() == 0 || this.f64198a.getPosition() != this.f64198a.limit() || !this.f64200c) {
                return null;
            }
            this.f64198a.setPosition(0);
            int i10 = this.f64205h * this.f64206i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int unsignedByte2 = this.f64198a.readUnsignedByte();
                if (unsignedByte2 != 0) {
                    unsignedByte = i11 + 1;
                    iArr[i11] = this.f64199b[unsignedByte2];
                } else {
                    int unsignedByte3 = this.f64198a.readUnsignedByte();
                    if (unsignedByte3 != 0) {
                        unsignedByte = ((unsignedByte3 & 64) == 0 ? unsignedByte3 & 63 : ((unsignedByte3 & 63) << 8) | this.f64198a.readUnsignedByte()) + i11;
                        Arrays.fill(iArr, i11, unsignedByte, (unsignedByte3 & 128) == 0 ? 0 : this.f64199b[this.f64198a.readUnsignedByte()]);
                    }
                }
                i11 = unsignedByte;
            }
            return new a.b().setBitmap(Bitmap.createBitmap(iArr, this.f64205h, this.f64206i, Bitmap.Config.ARGB_8888)).setPosition(this.f64203f / this.f64201d).setPositionAnchor(0).setLine(this.f64204g / this.f64202e, 0).setLineAnchor(0).setSize(this.f64205h / this.f64201d).setBitmapHeight(this.f64206i / this.f64202e).build();
        }

        public void reset() {
            this.f64201d = 0;
            this.f64202e = 0;
            this.f64203f = 0;
            this.f64204g = 0;
            this.f64205h = 0;
            this.f64206i = 0;
            this.f64198a.reset(0);
            this.f64200c = false;
        }

        public final void a(x xVar, int i10) {
            int unsignedInt24;
            if (i10 < 4) {
                return;
            }
            xVar.skipBytes(3);
            int i11 = i10 - 4;
            if ((xVar.readUnsignedByte() & 128) != 0) {
                if (i11 < 7 || (unsignedInt24 = xVar.readUnsignedInt24()) < 4) {
                    return;
                }
                this.f64205h = xVar.readUnsignedShort();
                this.f64206i = xVar.readUnsignedShort();
                this.f64198a.reset(unsignedInt24 - 4);
                i11 = i10 - 11;
            }
            int position = this.f64198a.getPosition();
            int iLimit = this.f64198a.limit();
            if (position >= iLimit || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iLimit - position);
            xVar.readBytes(this.f64198a.getData(), position, iMin);
            this.f64198a.setPosition(position + iMin);
        }

        public final void b(x xVar, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f64201d = xVar.readUnsignedShort();
            this.f64202e = xVar.readUnsignedShort();
            xVar.skipBytes(11);
            this.f64203f = xVar.readUnsignedShort();
            this.f64204g = xVar.readUnsignedShort();
        }

        public final void c(x xVar, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            xVar.skipBytes(2);
            Arrays.fill(this.f64199b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int unsignedByte = xVar.readUnsignedByte();
                int unsignedByte2 = xVar.readUnsignedByte();
                int unsignedByte3 = xVar.readUnsignedByte();
                int unsignedByte4 = xVar.readUnsignedByte();
                double d10 = unsignedByte2;
                double d11 = unsignedByte3 - 128;
                double d12 = unsignedByte4 - 128;
                this.f64199b[unsignedByte] = (g0.constrainValue((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (xVar.readUnsignedByte() << 24) | (g0.constrainValue((int) ((1.402d * d11) + d10), 0, 255) << 16) | g0.constrainValue((int) ((d12 * 1.772d) + d10), 0, 255);
            }
            this.f64200c = true;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f64194o = new x();
        this.f64195p = new x();
        this.f64196q = new C0615a();
    }

    @Override // io.odeeo.internal.d0.e
    public f a(byte[] bArr, int i10, boolean z10) throws h {
        this.f64194o.reset(bArr, i10);
        a(this.f64194o);
        this.f64196q.reset();
        ArrayList arrayList = new ArrayList();
        while (this.f64194o.bytesLeft() >= 3) {
            io.odeeo.internal.d0.a aVarA = a(this.f64194o, this.f64196q);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }

    public final void a(x xVar) {
        if (xVar.bytesLeft() <= 0 || xVar.peekUnsignedByte() != 120) {
            return;
        }
        if (this.f64197r == null) {
            this.f64197r = new Inflater();
        }
        if (g0.inflate(xVar, this.f64195p, this.f64197r)) {
            xVar.reset(this.f64195p.getData(), this.f64195p.limit());
        }
    }

    public static io.odeeo.internal.d0.a a(x xVar, C0615a c0615a) {
        int iLimit = xVar.limit();
        int unsignedByte = xVar.readUnsignedByte();
        int unsignedShort = xVar.readUnsignedShort();
        int position = xVar.getPosition() + unsignedShort;
        io.odeeo.internal.d0.a aVarBuild = null;
        if (position > iLimit) {
            xVar.setPosition(iLimit);
            return null;
        }
        if (unsignedByte != 128) {
            switch (unsignedByte) {
                case 20:
                    c0615a.c(xVar, unsignedShort);
                    break;
                case 21:
                    c0615a.a(xVar, unsignedShort);
                    break;
                case 22:
                    c0615a.b(xVar, unsignedShort);
                    break;
            }
        } else {
            aVarBuild = c0615a.build();
            c0615a.reset();
        }
        xVar.setPosition(position);
        return aVarBuild;
    }
}
