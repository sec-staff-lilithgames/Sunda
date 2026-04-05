package m8;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f implements b {

    /* renamed from: a, reason: collision with root package name */
    public int[] f74102a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f74103b;

    /* renamed from: c, reason: collision with root package name */
    public final a f74104c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f74105d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f74106e;

    /* renamed from: f, reason: collision with root package name */
    public e f74107f;

    /* renamed from: g, reason: collision with root package name */
    public short[] f74108g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f74109h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f74110i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f74111j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f74112k;

    /* renamed from: l, reason: collision with root package name */
    public int f74113l;

    /* renamed from: m, reason: collision with root package name */
    public d f74114m;

    /* renamed from: n, reason: collision with root package name */
    public Bitmap f74115n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f74116o;

    /* renamed from: p, reason: collision with root package name */
    public int f74117p;

    /* renamed from: q, reason: collision with root package name */
    public int f74118q;

    /* renamed from: r, reason: collision with root package name */
    public int f74119r;

    /* renamed from: s, reason: collision with root package name */
    public int f74120s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f74121t;

    /* renamed from: u, reason: collision with root package name */
    public Bitmap.Config f74122u;

    public f(a aVar, d dVar, ByteBuffer byteBuffer) {
        this(aVar, dVar, byteBuffer, 1);
    }

    public final Bitmap a() {
        Boolean bool = this.f74121t;
        Bitmap bitmapObtain = this.f74104c.obtain(this.f74120s, this.f74119r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f74122u);
        bitmapObtain.setHasAlpha(true);
        return bitmapObtain;
    }

    @Override // m8.b
    public void advance() {
        this.f74113l = (this.f74113l + 1) % this.f74114m.f74088c;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(m8.c r35, m8.c r36) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.f.b(m8.c, m8.c):android.graphics.Bitmap");
    }

    @Override // m8.b
    public void clear() {
        this.f74114m = null;
        byte[] bArr = this.f74111j;
        a aVar = this.f74104c;
        if (bArr != null) {
            aVar.release(bArr);
        }
        int[] iArr = this.f74112k;
        if (iArr != null) {
            aVar.release(iArr);
        }
        Bitmap bitmap = this.f74115n;
        if (bitmap != null) {
            aVar.release(bitmap);
        }
        this.f74115n = null;
        this.f74105d = null;
        this.f74121t = null;
        byte[] bArr2 = this.f74106e;
        if (bArr2 != null) {
            aVar.release(bArr2);
        }
    }

    @Override // m8.b
    public int getByteSize() {
        return (this.f74112k.length * 4) + this.f74105d.limit() + this.f74111j.length;
    }

    @Override // m8.b
    public int getCurrentFrameIndex() {
        return this.f74113l;
    }

    @Override // m8.b
    public ByteBuffer getData() {
        return this.f74105d;
    }

    @Override // m8.b
    public int getDelay(int i10) {
        if (i10 < 0) {
            return -1;
        }
        d dVar = this.f74114m;
        if (i10 < dVar.f74088c) {
            return ((c) dVar.f74090e.get(i10)).f74083i;
        }
        return -1;
    }

    @Override // m8.b
    public int getFrameCount() {
        return this.f74114m.f74088c;
    }

    @Override // m8.b
    public int getHeight() {
        return this.f74114m.f74092g;
    }

    @Override // m8.b
    @Deprecated
    public int getLoopCount() {
        int i10 = this.f74114m.f74097l;
        if (i10 == -1) {
            return 1;
        }
        return i10;
    }

    @Override // m8.b
    public int getNetscapeLoopCount() {
        return this.f74114m.f74097l;
    }

    @Override // m8.b
    public int getNextDelay() {
        int i10;
        if (this.f74114m.f74088c <= 0 || (i10 = this.f74113l) < 0) {
            return 0;
        }
        return getDelay(i10);
    }

    @Override // m8.b
    public synchronized Bitmap getNextFrame() {
        try {
            if (this.f74114m.f74088c <= 0 || this.f74113l < 0) {
                if (Log.isLoggable(InneractiveMediationDefs.GENDER_FEMALE, 3)) {
                    Log.d(InneractiveMediationDefs.GENDER_FEMALE, "Unable to decode frame, frameCount=" + this.f74114m.f74088c + ", framePointer=" + this.f74113l);
                }
                this.f74117p = 1;
            }
            int i10 = this.f74117p;
            if (i10 != 1 && i10 != 2) {
                this.f74117p = 0;
                if (this.f74106e == null) {
                    this.f74106e = this.f74104c.obtainByteArray(255);
                }
                c cVar = (c) this.f74114m.f74090e.get(this.f74113l);
                int i11 = this.f74113l - 1;
                c cVar2 = i11 >= 0 ? (c) this.f74114m.f74090e.get(i11) : null;
                int[] iArr = cVar.f74085k;
                if (iArr == null) {
                    iArr = this.f74114m.f74086a;
                }
                this.f74102a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable(InneractiveMediationDefs.GENDER_FEMALE, 3)) {
                        Log.d(InneractiveMediationDefs.GENDER_FEMALE, "No valid color table found for frame #" + this.f74113l);
                    }
                    this.f74117p = 1;
                    return null;
                }
                if (cVar.f74080f) {
                    System.arraycopy(iArr, 0, this.f74103b, 0, iArr.length);
                    int[] iArr2 = this.f74103b;
                    this.f74102a = iArr2;
                    iArr2[cVar.f74082h] = 0;
                    if (cVar.f74081g == 2 && this.f74113l == 0) {
                        this.f74121t = Boolean.TRUE;
                    }
                }
                return b(cVar, cVar2);
            }
            if (Log.isLoggable(InneractiveMediationDefs.GENDER_FEMALE, 3)) {
                Log.d(InneractiveMediationDefs.GENDER_FEMALE, "Unable to decode frame, status=" + this.f74117p);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // m8.b
    public int getStatus() {
        return this.f74117p;
    }

    @Override // m8.b
    public int getTotalIterationCount() {
        int i10 = this.f74114m.f74097l;
        if (i10 == -1) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // m8.b
    public int getWidth() {
        return this.f74114m.f74091f;
    }

    @Override // m8.b
    public int read(InputStream inputStream, int i10) throws IOException {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10 > 0 ? i10 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i11 = inputStream.read(bArr, 0, 16384);
                    if (i11 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e10) {
                Log.w(InneractiveMediationDefs.GENDER_FEMALE, "Error reading data from stream", e10);
            }
        } else {
            this.f74117p = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                Log.w(InneractiveMediationDefs.GENDER_FEMALE, "Error closing stream", e11);
            }
        }
        return this.f74117p;
    }

    @Override // m8.b
    public void resetFrameIndex() {
        this.f74113l = -1;
    }

    @Override // m8.b
    public synchronized void setData(d dVar, byte[] bArr) {
        setData(dVar, ByteBuffer.wrap(bArr));
    }

    @Override // m8.b
    public void setDefaultBitmapConfig(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f74122u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    public f(a aVar, d dVar, ByteBuffer byteBuffer, int i10) {
        this(aVar);
        setData(dVar, byteBuffer, i10);
    }

    @Override // m8.b
    public synchronized void setData(d dVar, ByteBuffer byteBuffer) {
        setData(dVar, byteBuffer, 1);
    }

    public f(a aVar) {
        this.f74103b = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        this.f74122u = Bitmap.Config.ARGB_8888;
        this.f74104c = aVar;
        this.f74114m = new d();
    }

    @Override // m8.b
    public synchronized void setData(d dVar, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 > 0) {
                int iHighestOneBit = Integer.highestOneBit(i10);
                this.f74117p = 0;
                this.f74114m = dVar;
                this.f74113l = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f74105d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f74105d.order(ByteOrder.LITTLE_ENDIAN);
                this.f74116o = false;
                Iterator it = dVar.f74090e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((c) it.next()).f74081g == 3) {
                        this.f74116o = true;
                        break;
                    }
                }
                this.f74118q = iHighestOneBit;
                int i11 = dVar.f74091f;
                this.f74120s = i11 / iHighestOneBit;
                int i12 = dVar.f74092g;
                this.f74119r = i12 / iHighestOneBit;
                this.f74111j = this.f74104c.obtainByteArray(i11 * i12);
                this.f74112k = this.f74104c.obtainIntArray(this.f74120s * this.f74119r);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // m8.b
    public synchronized int read(byte[] bArr) {
        try {
            if (this.f74107f == null) {
                this.f74107f = new e();
            }
            d header = this.f74107f.setData(bArr).parseHeader();
            this.f74114m = header;
            if (bArr != null) {
                setData(header, bArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74117p;
    }
}
