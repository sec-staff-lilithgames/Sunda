package pp;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import hp.c;
import hp.i;
import hp.r;
import hp.s;
import in.b;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.k;
import io.bidmachine.media3.common.util.l0;
import io.bidmachine.media3.common.util.m0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f81611a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public final m0 f81612b = new m0();

    /* renamed from: c, reason: collision with root package name */
    public final C0764a f81613c;

    /* renamed from: d, reason: collision with root package name */
    public Inflater f81614d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: pp.a$a, reason: collision with other inner class name */
    public static final class C0764a {

        /* renamed from: b, reason: collision with root package name */
        public boolean f81616b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f81617c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f81618d;

        /* renamed from: e, reason: collision with root package name */
        public int f81619e;

        /* renamed from: f, reason: collision with root package name */
        public int f81620f;

        /* renamed from: g, reason: collision with root package name */
        public Rect f81621g;

        /* renamed from: a, reason: collision with root package name */
        public final int[] f81615a = new int[4];

        /* renamed from: h, reason: collision with root package name */
        public int f81622h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f81623i = -1;

        public static int a(int i10, int[] iArr) {
            return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
        }

        public static int c(int i10, int i11) {
            return (i10 & 16777215) | ((i11 * 17) << 24);
        }

        public final void b(l0 l0Var, boolean z10, Rect rect, int[] iArr) {
            int i10;
            int i11;
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i12 = !z10 ? 1 : 0;
            int i13 = i12 * iWidth;
            while (true) {
                int i14 = 0;
                do {
                    int bits = 0;
                    for (int i15 = 1; bits < i15 && i15 <= 64; i15 <<= 2) {
                        if (l0Var.bitsLeft() < 4) {
                            i10 = -1;
                            i11 = 0;
                            break;
                        }
                        bits = (bits << 4) | l0Var.readBits(4);
                    }
                    i10 = bits & 3;
                    i11 = bits < 4 ? iWidth : bits >> 2;
                    int iMin = Math.min(i11, iWidth - i14);
                    if (iMin > 0) {
                        int i16 = i13 + iMin;
                        Arrays.fill(iArr, i13, i16, this.f81615a[i10]);
                        i14 += iMin;
                        i13 = i16;
                    }
                } while (i14 < iWidth);
                i12 += 2;
                if (i12 >= iHeight) {
                    return;
                }
                i13 = i12 * iWidth;
                l0Var.byteAlign();
            }
        }

        public b build(m0 m0Var) {
            Rect rect;
            if (this.f81618d == null || !this.f81616b || !this.f81617c || (rect = this.f81621g) == null || this.f81622h == -1 || this.f81623i == -1 || rect.width() < 2 || this.f81621g.height() < 2) {
                return null;
            }
            Rect rect2 = this.f81621g;
            int[] iArr = new int[rect2.height() * rect2.width()];
            l0 l0Var = new l0();
            m0Var.setPosition(this.f81622h);
            l0Var.reset(m0Var);
            b(l0Var, true, rect2, iArr);
            m0Var.setPosition(this.f81623i);
            l0Var.reset(m0Var);
            b(l0Var, false, rect2, iArr);
            return new in.a().setBitmap(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).setPosition(rect2.left / this.f81619e).setPositionAnchor(0).setLine(rect2.top / this.f81620f, 0).setLineAnchor(0).setSize(rect2.width() / this.f81619e).setBitmapHeight(rect2.height() / this.f81620f).build();
        }

        public void parseIdx(String str) throws NumberFormatException {
            int i10;
            for (String str2 : a1.split(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrSplit = a1.split(str2.substring(9), ",");
                    this.f81618d = new int[strArrSplit.length];
                    for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                        int[] iArr = this.f81618d;
                        try {
                            i10 = Integer.parseInt(strArrSplit[i11].trim(), 16);
                        } catch (RuntimeException unused) {
                            i10 = 0;
                        }
                        iArr[i11] = i10;
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrSplit2 = a1.split(str2.substring(6).trim(), "x");
                    if (strArrSplit2.length == 2) {
                        try {
                            this.f81619e = Integer.parseInt(strArrSplit2[0]);
                            this.f81620f = Integer.parseInt(strArrSplit2[1]);
                            this.f81616b = true;
                        } catch (RuntimeException e10) {
                            b0.w("VobsubParser", "Parsing IDX failed", e10);
                        }
                    }
                }
            }
        }

        public void parseSpu(m0 m0Var) {
            int[] iArr = this.f81618d;
            if (iArr == null || !this.f81616b) {
                return;
            }
            m0Var.skipBytes(m0Var.readUnsignedShort() - 2);
            int unsignedShort = m0Var.readUnsignedShort();
            while (m0Var.getPosition() < unsignedShort && m0Var.bytesLeft() > 0) {
                int unsignedByte = m0Var.readUnsignedByte();
                int[] iArr2 = this.f81615a;
                switch (unsignedByte) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (m0Var.bytesLeft() >= 2) {
                            int unsignedByte2 = m0Var.readUnsignedByte();
                            int unsignedByte3 = m0Var.readUnsignedByte();
                            iArr2[3] = a(unsignedByte2 >> 4, iArr);
                            iArr2[2] = a(unsignedByte2 & 15, iArr);
                            iArr2[1] = a(unsignedByte3 >> 4, iArr);
                            iArr2[0] = a(unsignedByte3 & 15, iArr);
                            this.f81617c = true;
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        if (m0Var.bytesLeft() >= 2 && this.f81617c) {
                            int unsignedByte4 = m0Var.readUnsignedByte();
                            int unsignedByte5 = m0Var.readUnsignedByte();
                            iArr2[3] = c(iArr2[3], unsignedByte4 >> 4);
                            iArr2[2] = c(iArr2[2], unsignedByte4 & 15);
                            iArr2[1] = c(iArr2[1], unsignedByte5 >> 4);
                            iArr2[0] = c(iArr2[0], unsignedByte5 & 15);
                            break;
                        } else {
                            return;
                        }
                    case 5:
                        if (m0Var.bytesLeft() >= 6) {
                            int unsignedByte6 = m0Var.readUnsignedByte();
                            int unsignedByte7 = m0Var.readUnsignedByte();
                            int i10 = (unsignedByte6 << 4) | (unsignedByte7 >> 4);
                            int unsignedByte8 = ((unsignedByte7 & 15) << 8) | m0Var.readUnsignedByte();
                            int unsignedByte9 = m0Var.readUnsignedByte();
                            int unsignedByte10 = m0Var.readUnsignedByte();
                            this.f81621g = new Rect(i10, (unsignedByte9 << 4) | (unsignedByte10 >> 4), unsignedByte8 + 1, (((unsignedByte10 & 15) << 8) | m0Var.readUnsignedByte()) + 1);
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        if (m0Var.bytesLeft() >= 4) {
                            this.f81622h = m0Var.readUnsignedShort();
                            this.f81623i = m0Var.readUnsignedShort();
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }

        public void reset() {
            this.f81617c = false;
            this.f81621g = null;
            this.f81622h = -1;
            this.f81623i = -1;
        }
    }

    public a(List<byte[]> list) throws NumberFormatException {
        C0764a c0764a = new C0764a();
        this.f81613c = c0764a;
        c0764a.parseIdx(new String(list.get(0), StandardCharsets.UTF_8));
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

    @Override // hp.s
    public void parse(byte[] bArr, int i10, int i11, r rVar, k kVar) {
        b bVarBuild;
        m0 m0Var = this.f81611a;
        m0Var.reset(bArr, i11 + i10);
        m0Var.setPosition(i10);
        if (this.f81614d == null) {
            this.f81614d = new Inflater();
        }
        Inflater inflater = this.f81614d;
        m0 m0Var2 = this.f81612b;
        if (a1.maybeInflate(m0Var, m0Var2, inflater)) {
            m0Var.reset(m0Var2.getData(), m0Var2.limit());
        }
        C0764a c0764a = this.f81613c;
        c0764a.reset();
        int iBytesLeft = m0Var.bytesLeft();
        if (iBytesLeft < 2 || m0Var.readUnsignedShort() != iBytesLeft) {
            bVarBuild = null;
        } else {
            c0764a.parseSpu(m0Var);
            bVarBuild = c0764a.build(m0Var);
        }
        kVar.accept(new c(bVarBuild != null ? b5.of(bVarBuild) : b5.of(), C.TIME_UNSET, 5000000L));
    }
}
