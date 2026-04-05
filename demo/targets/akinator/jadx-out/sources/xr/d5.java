package xr;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d5 implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public int f92410g;

    /* renamed from: h, reason: collision with root package name */
    public int f92411h;

    /* renamed from: i, reason: collision with root package name */
    public Inflater f92412i;

    /* renamed from: l, reason: collision with root package name */
    public int f92415l;

    /* renamed from: m, reason: collision with root package name */
    public int f92416m;

    /* renamed from: n, reason: collision with root package name */
    public long f92417n;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f92406b = new z1();

    /* renamed from: c, reason: collision with root package name */
    public final CRC32 f92407c = new CRC32();

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.l1 f92408e = new androidx.recyclerview.widget.l1(this);

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f92409f = new byte[512];

    /* renamed from: j, reason: collision with root package name */
    public int f92413j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f92414k = false;

    /* renamed from: o, reason: collision with root package name */
    public int f92418o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f92419p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f92420q = true;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f92414k) {
            return;
        }
        this.f92414k = true;
        this.f92406b.close();
        Inflater inflater = this.f92412i;
        if (inflater != null) {
            inflater.end();
            this.f92412i = null;
        }
    }

    public final boolean d() throws ZipException {
        Inflater inflater = this.f92412i;
        androidx.recyclerview.widget.l1 l1Var = this.f92408e;
        if (inflater != null && l1Var.e() <= 18) {
            this.f92412i.end();
            this.f92412i = null;
        }
        if (l1Var.e() < 8) {
            return false;
        }
        CRC32 crc32 = this.f92407c;
        if (crc32.getValue() != (l1Var.d() | (l1Var.d() << 16)) || this.f92417n != (l1Var.d() | (l1Var.d() << 16))) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        crc32.reset();
        this.f92413j = 1;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0203, code lost:
    
        if (r4 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0207, code lost:
    
        if (r16.f92413j != 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020d, code lost:
    
        if (r7.e() >= 10) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0210, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0211, code lost:
    
        r16.f92420q = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0213, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r17, int r18, byte[] r19) throws java.util.zip.ZipException, java.util.zip.DataFormatException {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.d5.a(int, int, byte[]):int");
    }
}
