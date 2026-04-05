package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ironsource.environment.thread.a;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import kv.p;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ImageLoader {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ImageLoader";
    private static final ImageLoader instance = new ImageLoader();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final ImageLoader getInstance() {
            return ImageLoader.instance;
        }

        private Companion() {
        }
    }

    private ImageLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: displayImage$lambda-0, reason: not valid java name */
    public static final void m3669displayImage$lambda0(String str, l onImageLoaded) {
        e0.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        if (k0.startsWith$default(str, "file://", false, 2, null)) {
            String strSubstring = str.substring(7);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strSubstring);
            if (bitmapDecodeFile != null) {
                onImageLoaded.invoke(bitmapDecodeFile);
                return;
            }
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            e0.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "decode bitmap failed.");
        }
    }

    public final void displayImage(String str, l onImageLoaded) {
        e0.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        if (this.ioExecutor == null) {
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            e0.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "ImageLoader not initialized.");
            return;
        }
        if (str == null || str.length() == 0) {
            Logger.Companion companion2 = Logger.Companion;
            String TAG3 = TAG;
            e0.checkNotNullExpressionValue(TAG3, "TAG");
            companion2.w(TAG3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new a(16, str, onImageLoaded));
        }
    }

    public final void init(Executor ioExecutor) {
        e0.checkNotNullParameter(ioExecutor, "ioExecutor");
        this.ioExecutor = ioExecutor;
    }

    public final void getImageSize(String str, p onImageSizeLoaded) {
        e0.checkNotNullParameter(onImageSizeLoaded, "onImageSizeLoaded");
        if (str == null || str.length() == 0 || !k0.startsWith$default(str, "file://", false, 2, null)) {
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            e0.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "the valid uri is required.");
            return;
        }
        String strSubstring = str.substring(7);
        e0.checkNotNullExpressionValue(strSubstring, SFPXhf.yLUsbykeoor);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strSubstring, options);
        onImageSizeLoaded.invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }
}
