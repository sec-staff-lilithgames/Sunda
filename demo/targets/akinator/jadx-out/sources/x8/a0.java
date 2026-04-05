package x8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: f, reason: collision with root package name */
    public static final n8.u f91793f = n8.u.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", n8.b.f75831e);

    /* renamed from: g, reason: collision with root package name */
    public static final n8.u f91794g = n8.u.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    public static final n8.u f91795h;

    /* renamed from: i, reason: collision with root package name */
    public static final n8.u f91796i;

    /* renamed from: j, reason: collision with root package name */
    public static final y f91797j;

    /* renamed from: k, reason: collision with root package name */
    public static final Queue f91798k;

    /* renamed from: a, reason: collision with root package name */
    public final q8.d f91799a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f91800b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.b f91801c;

    /* renamed from: d, reason: collision with root package name */
    public final List f91802d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f91803e = g0.getInstance();

    static {
        u uVar = x.f91879a;
        Boolean bool = Boolean.FALSE;
        f91795h = n8.u.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f91796i = n8.u.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f91797j = new y();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        f91798k = j9.s.createQueue(0);
    }

    public a0(List<n8.g> list, DisplayMetrics displayMetrics, q8.d dVar, q8.b bVar) {
        this.f91802d = list;
        this.f91800b = (DisplayMetrics) j9.q.checkNotNull(displayMetrics);
        this.f91799a = (q8.d) j9.q.checkNotNull(dVar);
        this.f91801c = (q8.b) j9.q.checkNotNull(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(x8.k0 r9, android.graphics.BitmapFactory.Options r10, x8.z r11, q8.d r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.onObtainBounds()
            r9.stopGrowingBuffers()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = x8.w0.getBitmapDrawableLock()
            r4.lock()
            android.graphics.Bitmap r9 = r9.decodeBitmap(r10)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L67
        L1d:
            java.util.concurrent.locks.Lock r10 = x8.w0.getBitmapDrawableLock()
            r10.unlock()
            return r9
        L25:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = w0.i.f(r1, r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L67
            r1.append(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L67
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L67
            r1.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L67
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L67
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L56
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L67
        L56:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L66
            r12.put(r0)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L67
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L67
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L67
            goto L1d
        L65:
            throw r5     // Catch: java.lang.Throwable -> L67
        L66:
            throw r5     // Catch: java.lang.Throwable -> L67
        L67:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = x8.w0.getBitmapDrawableLock()
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.a0.c(x8.k0, android.graphics.BitmapFactory$Options, x8.z, q8.d):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return C3191e4.i.f36529d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final e a(k0 k0Var, int i10, int i11, n8.v vVar, z zVar) {
        Queue queue;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f91801c.get(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
        synchronized (a0.class) {
            queue = f91798k;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        n8.b bVar = (n8.b) vVar.get(f91793f);
        n8.w wVar = (n8.w) vVar.get(f91794g);
        x xVar = (x) vVar.get(x.f91884f);
        boolean zBooleanValue = ((Boolean) vVar.get(f91795h)).booleanValue();
        n8.u uVar = f91796i;
        try {
            e eVarObtain = e.obtain(b(k0Var, options, xVar, bVar, wVar, vVar.get(uVar) != null && ((Boolean) vVar.get(uVar)).booleanValue(), i10, i11, zBooleanValue, zVar), this.f91799a);
            e(options);
            synchronized (queue) {
                queue.offer(options);
            }
            this.f91801c.put(bArr);
            return eVarObtain;
        } catch (Throwable th2) {
            e(options);
            Queue queue2 = f91798k;
            synchronized (queue2) {
                queue2.offer(options);
                this.f91801c.put(bArr);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(x8.k0 r40, android.graphics.BitmapFactory.Options r41, x8.x r42, n8.b r43, n8.w r44, boolean r45, int r46, int r47, boolean r48, x8.z r49) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.a0.b(x8.k0, android.graphics.BitmapFactory$Options, x8.x, n8.b, n8.w, boolean, int, int, boolean, x8.z):android.graphics.Bitmap");
    }

    public p8.v0 decode(InputStream inputStream, int i10, int i11, n8.v vVar) throws IOException {
        return decode(inputStream, i10, i11, vVar, f91797j);
    }

    public boolean handles(InputStream inputStream) {
        return true;
    }

    public p8.v0 decode(ByteBuffer byteBuffer, int i10, int i11, n8.v vVar) throws IOException {
        return a(new h0(this.f91802d, byteBuffer, this.f91801c), i10, i11, vVar, f91797j);
    }

    public boolean handles(ByteBuffer byteBuffer) {
        return true;
    }

    public p8.v0 decode(InputStream inputStream, int i10, int i11, n8.v vVar, z zVar) throws IOException {
        return a(new i0(this.f91802d, inputStream, this.f91801c), i10, i11, vVar, zVar);
    }

    public boolean handles(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.isSupported();
    }

    public p8.v0 decode(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, n8.v vVar) throws IOException {
        return a(new j0(parcelFileDescriptor, this.f91802d, this.f91801c), i10, i11, vVar, f91797j);
    }
}
