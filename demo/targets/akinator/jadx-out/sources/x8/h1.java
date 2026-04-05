package x8;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h1 implements n8.x {

    /* renamed from: d, reason: collision with root package name */
    public static final n8.u f91831d = n8.u.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new z0());

    /* renamed from: e, reason: collision with root package name */
    public static final n8.u f91832e = n8.u.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new a1());

    /* renamed from: f, reason: collision with root package name */
    public static final f1 f91833f = new f1();

    /* renamed from: g, reason: collision with root package name */
    public static final List f91834g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final e1 f91835a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.d f91836b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f91837c = f91833f;

    public h1(q8.d dVar, e1 e1Var) {
        this.f91836b = dVar;
        this.f91835a = e1Var;
    }

    public static n8.x asset(q8.d dVar) {
        return new h1(dVar, new b1());
    }

    public static n8.x byteBuffer(q8.d dVar) {
        return new h1(dVar, new d1());
    }

    public static n8.x parcel(q8.d dVar) {
        return new h1(dVar, new g1());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap a(java.lang.Object r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, x8.x r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.h1.a(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, x8.x):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n8.x
    public p8.v0 decode(Object obj, int i10, int i11, n8.v vVar) throws Exception {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        long jLongValue = ((Long) vVar.get(f91831d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(o2.m(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) vVar.get(f91832e);
        if (num == null) {
            num = 2;
        }
        x xVar = (x) vVar.get(x.f91884f);
        if (xVar == null) {
            xVar = x.f91883e;
        }
        x xVar2 = xVar;
        MediaMetadataRetriever mediaMetadataRetrieverBuild = this.f91837c.build();
        boolean z10 = false;
        try {
            this.f91835a.initializeRetriever(mediaMetadataRetrieverBuild, obj);
            Bitmap bitmapA = a(obj, mediaMetadataRetrieverBuild, jLongValue, num.intValue(), i10, i11, xVar2);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetrieverBuild.release();
            } else if (mediaMetadataRetrieverBuild instanceof AutoCloseable) {
                mediaMetadataRetrieverBuild.close();
            } else if (mediaMetadataRetrieverBuild instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) mediaMetadataRetrieverBuild;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated2) {
                        try {
                            zIsTerminated2 = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z10) {
                                executorService.shutdownNow();
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                if (mediaMetadataRetrieverBuild == 0) {
                    throw new IllegalArgumentException();
                }
                mediaMetadataRetrieverBuild.release();
            }
            return e.obtain(bitmapA, this.f91836b);
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetrieverBuild.release();
            } else if (mediaMetadataRetrieverBuild instanceof AutoCloseable) {
                mediaMetadataRetrieverBuild.close();
            } else if (mediaMetadataRetrieverBuild instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetrieverBuild;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z10) {
                                executorService2.shutdownNow();
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                if (mediaMetadataRetrieverBuild == 0) {
                    throw new IllegalArgumentException();
                }
                mediaMetadataRetrieverBuild.release();
            }
            throw th2;
        }
    }

    @Override // n8.x
    public boolean handles(Object obj, n8.v vVar) {
        return true;
    }
}
