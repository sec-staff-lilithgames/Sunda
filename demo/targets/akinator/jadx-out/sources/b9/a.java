package b9;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.recyclerview.widget.l1;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.ironsource.C3191e4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import n8.p;
import n8.v;
import n8.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a implements x {

    /* renamed from: f, reason: collision with root package name */
    public static final com.bumptech.glide.f f8924f = new com.bumptech.glide.f();

    /* renamed from: g, reason: collision with root package name */
    public static final l1 f8925g = new l1(2);

    /* renamed from: a, reason: collision with root package name */
    public final Context f8926a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8927b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f8928c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.f f8929d;

    /* renamed from: e, reason: collision with root package name */
    public final b f8930e;

    public a(Context context) {
        this(context, com.bumptech.glide.c.get(context).getRegistry().getImageHeaderParsers(), com.bumptech.glide.c.get(context).getBitmapPool(), com.bumptech.glide.c.get(context).getArrayPool());
    }

    public static int b(m8.d dVar, int i10, int i11) {
        int iMin = Math.min(dVar.getHeight() / i11, dVar.getWidth() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbF = w0.i.f(iMax, i10, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            sbF.append(i11);
            sbF.append("], actual dimens: [");
            sbF.append(dVar.getWidth());
            sbF.append("x");
            sbF.append(dVar.getHeight());
            sbF.append(C3191e4.i.f36531e);
            Log.v("BufferGifDecoder", sbF.toString());
        }
        return iMax;
    }

    public final f a(ByteBuffer byteBuffer, int i10, int i11, m8.e eVar, v vVar) {
        StringBuilder sb2;
        long logTime = j9.l.getLogTime();
        try {
            m8.d header = eVar.parseHeader();
            if (header.getNumFrames() > 0 && header.getStatus() == 0) {
                Bitmap.Config config = vVar.get(m.f8970a) == n8.b.f75830c ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iB = b(header, i10, i11);
                com.bumptech.glide.f fVar = this.f8929d;
                b bVar = this.f8930e;
                fVar.getClass();
                m8.f fVar2 = new m8.f(bVar, header, byteBuffer, iB);
                fVar2.setDefaultBitmapConfig(config);
                fVar2.advance();
                Bitmap nextFrame = fVar2.getNextFrame();
                if (nextFrame == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder("Decoded GIF from stream in ");
                        sb2.append(j9.l.getElapsedMillis(logTime));
                        Log.v("BufferGifDecoder", sb2.toString());
                        return null;
                    }
                    return null;
                }
                f fVar3 = new f(new d(this.f8926a, fVar2, w8.d.get(), i10, i11, nextFrame));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + j9.l.getElapsedMillis(logTime));
                }
                return fVar3;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb2 = new StringBuilder("Decoded GIF from stream in ");
                sb2.append(j9.l.getElapsedMillis(logTime));
                Log.v("BufferGifDecoder", sb2.toString());
                return null;
            }
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + j9.l.getElapsedMillis(logTime));
            }
            throw th2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x0054
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // n8.x
    public b9.f decode(java.nio.ByteBuffer r9, int r10, int r11, n8.v r12) {
        /*
            r8 = this;
            androidx.recyclerview.widget.l1 r1 = r8.f8928c
            monitor-enter(r1)
            java.lang.Object r0 = r1.f7184a     // Catch: java.lang.Throwable -> L4f
            java.util.Queue r0 = (java.util.Queue) r0     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L4f
            m8.e r0 = (m8.e) r0     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L19
            m8.e r0 = new m8.e     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L52
        L19:
            m8.e r6 = r0.setData(r9)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r12
            b9.f r9 = r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3a
            androidx.recyclerview.widget.l1 r10 = r2.f8928c
            monitor-enter(r10)
            r6.clear()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r11 = r10.f7184a     // Catch: java.lang.Throwable -> L36
            java.util.Queue r11 = (java.util.Queue) r11     // Catch: java.lang.Throwable -> L36
            r11.offer(r6)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r10)
            return r9
        L36:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L36
            throw r9
        L3a:
            r0 = move-exception
            r9 = r0
            androidx.recyclerview.widget.l1 r10 = r2.f8928c
            monitor-enter(r10)
            r6.clear()     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r11 = r10.f7184a     // Catch: java.lang.Throwable -> L4b
            java.util.Queue r11 = (java.util.Queue) r11     // Catch: java.lang.Throwable -> L4b
            r11.offer(r6)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r10)
            throw r9
        L4b:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
            throw r9
        L4f:
            r0 = move-exception
            r2 = r8
        L51:
            r9 = r0
        L52:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            throw r9
        L54:
            r0 = move-exception
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.a.decode(java.nio.ByteBuffer, int, int, n8.v):b9.f");
    }

    @Override // n8.x
    public boolean handles(ByteBuffer byteBuffer, v vVar) throws IOException {
        return !((Boolean) vVar.get(m.f8971b)).booleanValue() && p.getType(this.f8927b, byteBuffer) == ImageHeaderParser$ImageType.GIF;
    }

    public a(Context context, List<n8.g> list, q8.d dVar, q8.b bVar) {
        this.f8926a = context.getApplicationContext();
        this.f8927b = list;
        this.f8929d = f8924f;
        this.f8930e = new b(dVar, bVar);
        this.f8928c = f8925g;
    }
}
