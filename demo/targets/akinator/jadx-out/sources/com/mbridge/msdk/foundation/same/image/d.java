package com.mbridge.msdk.foundation.same.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import j1.o2;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f40775a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f40776b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40777c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.image.c f40779b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.foundation.same.image.d$a$a, reason: collision with other inner class name */
        public class RunnableC0270a implements Runnable {
            public RunnableC0270a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f40779b.onFailedLoad("create download request error", aVar.f40778a);
            }
        }

        public a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f40778a = str;
            this.f40779b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadRequest downloadRequestA = d.this.a(n0.d(this.f40778a), this.f40778a, null, this.f40779b);
            if (downloadRequestA != null) {
                downloadRequestA.start();
                return;
            }
            if (MBridgeConstans.DEBUG) {
                p0.b("CommonImageLoaderRefactor", "createDownloadRequest error");
            }
            if (this.f40779b == null) {
                return;
            }
            d.this.f40776b.post(new RunnableC0270a());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final d f40782a = new d(null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements OnDownloadStateListener<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f40783a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f40784b;

        /* renamed from: c, reason: collision with root package name */
        private final String f40785c;

        /* renamed from: d, reason: collision with root package name */
        private final String f40786d;

        /* renamed from: e, reason: collision with root package name */
        private final String f40787e;

        /* renamed from: f, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.same.image.c f40788f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f40790a;

            public b(String str) {
                this.f40790a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f40788f.onFailedLoad(c.this.f40787e, this.f40790a);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("CommonImageLoaderRefactor", "callbackForFailed error", e10);
                    }
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.foundation.same.image.d$c$c, reason: collision with other inner class name */
        public class RunnableC0271c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f40792a;

            public RunnableC0271c(Bitmap bitmap) {
                this.f40792a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f40788f.onSuccessLoad(this.f40792a, c.this.f40787e);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("CommonImageLoaderRefactor", "callbackForSuccess error", e10);
                    }
                }
            }
        }

        public c(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f40784b = handler;
            this.f40783a = threadPoolExecutor;
            this.f40787e = str;
            this.f40785c = str2;
            this.f40786d = str3;
            this.f40788f = cVar;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            b();
            this.f40783a.execute(new a());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                p0.a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            a(downloadError.getException().getLocalizedMessage());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f40788f == null) {
                return;
            }
            try {
                Bitmap bitmapB = d.b(this.f40785c + this.f40786d);
                if (bitmapB == null) {
                    a("bitmap decode failed");
                    return;
                }
                Bitmap bitmapA = a(bitmapB, null);
                if (bitmapA == null) {
                    a("bitmap transformation failed");
                } else {
                    a(bitmapA);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e10.getLocalizedMessage());
                }
                a("bitmap decode failed");
            }
        }

        private void b() {
            File file;
            if (MBridgeConstans.DEBUG) {
                p0.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f40787e + " imagePath = " + this.f40785c + this.f40786d);
                try {
                    file = new File(this.f40785c + this.f40786d);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("CommonImageLoaderRefactor", "onDownloadComplete error", e10);
                    }
                    file = null;
                }
                if (file == null || !file.isFile() || !file.exists()) {
                    p0.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                    return;
                }
                p0.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
            }
        }

        private void a(String str) {
            if (this.f40788f == null) {
                return;
            }
            this.f40784b.post(new b(str));
        }

        private Bitmap a(Bitmap bitmap, g gVar) {
            if (gVar != null) {
                try {
                    return gVar.a(bitmap);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("CommonImageLoaderRefactor", "handlerImageTransformation error", e10);
                    }
                }
            }
            return bitmap;
        }

        private void a(Bitmap bitmap) {
            if (this.f40788f == null) {
                return;
            }
            this.f40784b.post(new RunnableC0271c(bitmap));
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }
    }

    public /* synthetic */ d(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap b(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    public Bitmap c(String str) {
        if (MBridgeConstans.DEBUG) {
            com.google.android.gms.internal.play_billing.a.D("getImageBitmapByUrl imageUrl = ", str, "CommonImageLoaderRefactor");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strO = o2.o(new StringBuilder(), this.f40777c, n0.d(str));
        File file = new File(strO);
        if (file.isFile() && file.exists()) {
            try {
                return b(strO);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e10);
                }
            }
        }
        return null;
    }

    public boolean d(String str) {
        File file;
        if (MBridgeConstans.DEBUG) {
            com.google.android.gms.internal.play_billing.a.D("isImageFileExists imageUrl = ", str, "CommonImageLoaderRefactor");
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                file = new File(this.f40777c + n0.d(str));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("CommonImageLoaderRefactor", "isImageFileExists error", e10);
                }
                file = null;
            }
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.exists();
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                p0.b("CommonImageLoaderRefactor", "isImageFileExists error", e11);
            }
            return false;
        }
    }

    private d() {
        this.f40776b = new Handler(Looper.getMainLooper());
        this.f40777c = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_IMG) + File.separator;
        this.f40775a = f.b();
    }

    public static d a() {
        return b.f40782a;
    }

    private Runnable a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        return new a(str, gVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadRequest<?> a(String str, String str2, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f40724u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f40723t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.f40722s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.f40777c).withDownloadStateListener(new c(this.f40776b, this.f40775a, str2, this.f40777c, str, gVar, cVar)).with("download_scene", "download_image").withProgressStateListener(null).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("CommonImageLoaderRefactor", "createDownloadRequest error", e10);
            }
            return null;
        }
    }

    public void b(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            this.f40775a.execute(a(str, gVar, cVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("CommonImageLoaderRefactor", "loadImage error", e10);
            }
        }
    }
}
