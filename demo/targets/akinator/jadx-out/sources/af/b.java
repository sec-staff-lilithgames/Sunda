package af;

import android.net.Uri;
import android.util.SparseArray;
import com.applovin.impl.ga;
import com.google.android.exoplayer2.h1;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.util.n1;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import rf.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final SparseArray f4315c;

    /* renamed from: a, reason: collision with root package name */
    public final e.a f4316a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4317b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, a(Class.forName("com.google.android.exoplayer2.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("com.google.android.exoplayer2.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f4315c = sparseArray;
    }

    @Deprecated
    public b(e.a aVar) {
        this(aVar, new ga(2));
    }

    public static Constructor a(Class cls) {
        try {
            return cls.asSubclass(q.class).getConstructor(u1.class, e.a.class, Executor.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Downloader constructor missing", e10);
        }
    }

    @Override // af.r
    public q createDownloader(DownloadRequest downloadRequest) {
        Uri uri = downloadRequest.f27874c;
        String str = downloadRequest.f27878h;
        Uri uri2 = downloadRequest.f27874c;
        int iInferContentTypeForUriAndMimeType = n1.inferContentTypeForUriAndMimeType(uri, downloadRequest.f27875e);
        Executor executor = this.f4317b;
        e.a aVar = this.f4316a;
        if (iInferContentTypeForUriAndMimeType != 0 && iInferContentTypeForUriAndMimeType != 1 && iInferContentTypeForUriAndMimeType != 2) {
            if (iInferContentTypeForUriAndMimeType == 4) {
                return new t(new h1().setUri(uri2).setCustomCacheKey(str).build(), aVar, executor);
            }
            throw new IllegalArgumentException(a.b.e(iInferContentTypeForUriAndMimeType, "Unsupported type: "));
        }
        Constructor constructor = (Constructor) f4315c.get(iInferContentTypeForUriAndMimeType);
        if (constructor == null) {
            throw new IllegalStateException(a.b.e(iInferContentTypeForUriAndMimeType, "Module missing for content type "));
        }
        try {
            return (q) constructor.newInstance(new h1().setUri(uri2).setStreamKeys(downloadRequest.f27876f).setCustomCacheKey(str).build(), aVar, executor);
        } catch (Exception e10) {
            throw new IllegalStateException(a.b.e(iInferContentTypeForUriAndMimeType, "Failed to instantiate downloader for content type "), e10);
        }
    }

    public b(e.a aVar, Executor executor) {
        this.f4316a = (e.a) com.google.android.exoplayer2.util.a.checkNotNull(aVar);
        this.f4317b = (Executor) com.google.android.exoplayer2.util.a.checkNotNull(executor);
    }
}
