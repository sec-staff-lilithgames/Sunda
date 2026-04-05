package zn;

import android.net.Uri;
import android.util.SparseArray;
import com.applovin.impl.ga;
import gn.c0;
import gn.p0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.offline.DownloadRequest;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import mn.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final SparseArray f98316c;

    /* renamed from: a, reason: collision with root package name */
    public final e.a f98317a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f98318b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, a(rn.b.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(un.a.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("io.bidmachine.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f98316c = sparseArray;
    }

    @Deprecated
    public b(e.a aVar) {
        this(aVar, new ga(2));
    }

    public static Constructor a(Class cls) {
        try {
            return cls.asSubclass(n.class).getConstructor(p0.class, e.a.class, Executor.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Downloader constructor missing", e10);
        }
    }

    @Override // zn.o
    public n createDownloader(DownloadRequest downloadRequest) {
        Uri uri = downloadRequest.f61503c;
        String str = downloadRequest.f61507h;
        Uri uri2 = downloadRequest.f61503c;
        int iInferContentTypeForUriAndMimeType = a1.inferContentTypeForUriAndMimeType(uri, downloadRequest.f61504e);
        Executor executor = this.f98318b;
        e.a aVar = this.f98317a;
        if (iInferContentTypeForUriAndMimeType != 0 && iInferContentTypeForUriAndMimeType != 1 && iInferContentTypeForUriAndMimeType != 2) {
            if (iInferContentTypeForUriAndMimeType == 4) {
                return new s(new c0().setUri(uri2).setCustomCacheKey(str).build(), aVar, executor);
            }
            throw new IllegalArgumentException(a.b.e(iInferContentTypeForUriAndMimeType, "Unsupported type: "));
        }
        Constructor constructor = (Constructor) f98316c.get(iInferContentTypeForUriAndMimeType);
        if (constructor == null) {
            throw new IllegalStateException(a.b.e(iInferContentTypeForUriAndMimeType, "Module missing for content type "));
        }
        try {
            return (n) constructor.newInstance(new c0().setUri(uri2).setStreamKeys(downloadRequest.f61505f).setCustomCacheKey(str).build(), aVar, executor);
        } catch (Exception e10) {
            throw new IllegalStateException(a.b.e(iInferContentTypeForUriAndMimeType, "Failed to instantiate downloader for content type "), e10);
        }
    }

    public b(e.a aVar, Executor executor) {
        this.f98317a = (e.a) io.bidmachine.media3.common.util.a.checkNotNull(aVar);
        this.f98318b = (Executor) io.bidmachine.media3.common.util.a.checkNotNull(executor);
    }
}
