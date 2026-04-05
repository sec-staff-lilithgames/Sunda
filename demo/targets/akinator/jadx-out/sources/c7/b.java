package c7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import c7.s;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import pw.b1;
import pw.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final s f11819a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.o f11820b;

    /* renamed from: c, reason: collision with root package name */
    public final Semaphore f11821c;

    /* renamed from: d, reason: collision with root package name */
    public final n f11822d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: c7.b$b, reason: collision with other inner class name */
    public static final class C0019b extends pw.u {

        /* renamed from: b, reason: collision with root package name */
        public Exception f11823b;

        public C0019b(b1 b1Var) {
            super(b1Var);
        }

        public final Exception getException() {
            return this.f11823b;
        }

        @Override // pw.u, pw.b1
        public long read(pw.g gVar, long j10) throws Exception {
            try {
                return super.read(gVar, j10);
            } catch (Exception e10) {
                this.f11823b = e10;
                throw e10;
            }
        }
    }

    static {
        new a(null);
    }

    public b(s sVar, l7.o oVar, Semaphore semaphore, n nVar) {
        this.f11819a = sVar;
        this.f11820b = oVar;
        this.f11821c = semaphore;
        this.f11822d = nVar;
    }

    public static final g access$decode(b bVar, BitmapFactory.Options options) throws Exception {
        o oVar;
        l7.o oVar2 = bVar.f11820b;
        s sVar = bVar.f11819a;
        C0019b c0019b = new C0019b(sVar.source());
        pw.k kVarBuffer = h0.buffer(c0019b);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(kVarBuffer.peek().inputStream(), null, options);
        Exception exception = c0019b.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        o oVar3 = o.f11847a;
        l exifData = oVar3.getExifData(options.outMimeType, kVarBuffer, bVar.f11822d);
        Exception exception2 = c0019b.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && oVar2.getColorSpace() != null) {
            options.inPreferredColorSpace = oVar2.getColorSpace();
        }
        options.inPremultiplied = oVar2.getPremultipliedAlpha();
        Bitmap.Config config = oVar2.getConfig();
        if (exifData.isFlipped() || q.isRotated(exifData)) {
            config = q7.a.toSoftware(config);
        }
        if (oVar2.getAllowRgb565() && config == Bitmap.Config.ARGB_8888 && e0.areEqual(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i10 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        s.a metadata = sVar.getMetadata();
        if ((metadata instanceof u) && m7.b.isOriginal(oVar2.getSize())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((u) metadata).getDensity();
            options.inTargetDensity = oVar2.getContext().getResources().getDisplayMetrics().densityDpi;
            oVar = oVar3;
        } else if (options.outWidth <= 0 || options.outHeight <= 0) {
            oVar = oVar3;
            options.inSampleSize = 1;
            options.inScaled = false;
        } else {
            int i11 = q.isSwapped(exifData) ? options.outHeight : options.outWidth;
            int i12 = q.isSwapped(exifData) ? options.outWidth : options.outHeight;
            m7.j size = oVar2.getSize();
            int px = m7.b.isOriginal(size) ? i11 : q7.n.toPx(size.getWidth(), oVar2.getScale());
            m7.j size2 = oVar2.getSize();
            int px2 = m7.b.isOriginal(size2) ? i12 : q7.n.toPx(size2.getHeight(), oVar2.getScale());
            int iCalculateInSampleSize = i.calculateInSampleSize(i11, i12, px, px2, oVar2.getScale());
            options.inSampleSize = iCalculateInSampleSize;
            oVar = oVar3;
            double d10 = iCalculateInSampleSize;
            double dComputeSizeMultiplier = i.computeSizeMultiplier(i11 / d10, i12 / d10, px, px2, oVar2.getScale());
            if (oVar2.getAllowInexactSize()) {
                dComputeSizeMultiplier = qv.v.coerceAtMost(dComputeSizeMultiplier, 1.0d);
            }
            boolean z11 = dComputeSizeMultiplier == 1.0d;
            options.inScaled = !z11;
            if (!z11) {
                if (dComputeSizeMultiplier > 1.0d) {
                    options.inDensity = mv.d.roundToInt(Integer.MAX_VALUE / dComputeSizeMultiplier);
                    options.inTargetDensity = Integer.MAX_VALUE;
                } else {
                    options.inDensity = Integer.MAX_VALUE;
                    options.inTargetDensity = mv.d.roundToInt(Integer.MAX_VALUE * dComputeSizeMultiplier);
                }
            }
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(kVarBuffer.inputStream(), null, options);
            gv.d.closeFinally(kVarBuffer, null);
            Exception exception3 = c0019b.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(oVar2.getContext().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(oVar2.getContext().getResources(), oVar.reverseTransformations(bitmapDecodeStream, exifData));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new g(bitmapDrawable, z10);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // c7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object decode(zu.d<? super c7.g> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof c7.c
            if (r0 == 0) goto L13
            r0 = r8
            c7.c r0 = (c7.c) r0
            int r1 = r0.f11830m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11830m = r1
            goto L18
        L13:
            c7.c r0 = new c7.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f11828k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f11830m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f11826i
            kotlinx.coroutines.sync.Semaphore r0 = (kotlinx.coroutines.sync.Semaphore) r0
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L30
            goto L6e
        L30:
            r8 = move-exception
            goto L78
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            kotlinx.coroutines.sync.Semaphore r2 = r0.f11827j
            java.lang.Object r5 = r0.f11826i
            c7.b r5 = (c7.b) r5
            tu.a0.throwOnFailure(r8)
            r8 = r2
            goto L58
        L45:
            tu.a0.throwOnFailure(r8)
            r0.f11826i = r7
            kotlinx.coroutines.sync.Semaphore r8 = r7.f11821c
            r0.f11827j = r8
            r0.f11830m = r4
            java.lang.Object r2 = r8.acquire(r0)
            if (r2 != r1) goto L57
            goto L6a
        L57:
            r5 = r7
        L58:
            c7.d r2 = new c7.d     // Catch: java.lang.Throwable -> L74
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L74
            r0.f11826i = r8     // Catch: java.lang.Throwable -> L74
            r5 = 0
            r0.f11827j = r5     // Catch: java.lang.Throwable -> L74
            r0.f11830m = r3     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L74
            if (r0 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r6 = r0
            r0 = r8
            r8 = r6
        L6e:
            c7.g r8 = (c7.g) r8     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r8
        L74:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L78:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.b.decode(zu.d):java.lang.Object");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements j {

        /* renamed from: a, reason: collision with root package name */
        public final n f11824a;

        /* renamed from: b, reason: collision with root package name */
        public final Semaphore f11825b;

        public c(int i10, n nVar) {
            this.f11824a = nVar;
            this.f11825b = SemaphoreKt.Semaphore$default(i10, 0, 2, null);
        }

        @Override // c7.j
        public k create(f7.o oVar, l7.o oVar2, a7.m mVar) {
            return new b(oVar.getSource(), oVar2, this.f11825b, this.f11824a);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }

        public /* synthetic */ c(int i10, n nVar, int i11, kotlin.jvm.internal.u uVar) {
            this((i11 & 1) != 0 ? 4 : i10, (i11 & 2) != 0 ? n.f11845b : nVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @tu.f
        public /* synthetic */ c(int i10) {
            this(i10, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ c(int i10, int i11, kotlin.jvm.internal.u uVar) {
            this((i11 & 1) != 0 ? 4 : i10);
        }
    }

    public /* synthetic */ b(s sVar, l7.o oVar, Semaphore semaphore, n nVar, int i10, kotlin.jvm.internal.u uVar) {
        this(sVar, oVar, (i10 & 4) != 0 ? SemaphoreKt.Semaphore$default(Integer.MAX_VALUE, 0, 2, null) : semaphore, (i10 & 8) != 0 ? n.f11845b : nVar);
    }

    @tu.f
    public /* synthetic */ b(s sVar, l7.o oVar) {
        this(sVar, oVar, null, null, 12, null);
    }

    public /* synthetic */ b(s sVar, l7.o oVar, Semaphore semaphore, int i10, kotlin.jvm.internal.u uVar) {
        this(sVar, oVar, (i10 & 4) != 0 ? SemaphoreKt.Semaphore$default(Integer.MAX_VALUE, 0, 2, null) : semaphore);
    }

    @tu.f
    public /* synthetic */ b(s sVar, l7.o oVar, Semaphore semaphore) {
        this(sVar, oVar, semaphore, null, 8, null);
    }
}
