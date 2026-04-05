package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.Window;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C2686ab;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ab, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2686ab extends X1 {

    /* renamed from: b, reason: collision with root package name */
    public final Window f32651b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f32652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2686ab(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        kotlin.jvm.internal.e0.checkNotNullParameter(window, "window");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        this.f32651b = window;
        this.f32652c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC2946q0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int width = this.f32651b.getDecorView().getWidth();
        int height = this.f32651b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final kotlin.jvm.internal.w0 w0Var = new kotlin.jvm.internal.w0();
        int layerType = this.f32651b.getDecorView().getLayerType();
        this.f32651b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.f32651b, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: zk.g0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                C2686ab.a(w0Var, this, i10);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.f32652c.get()) {
            Thread.sleep(500L);
        }
        String message = "success - " + w0Var.f71863b + " - time - " + (System.currentTimeMillis() - jCurrentTimeMillis);
        kotlin.jvm.internal.e0.checkNotNullParameter("PixelCopyScreenShotProcess", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        Log.i("PixelCopyScreenShotProcess", message);
        this.f32651b.getDecorView().setLayerType(layerType, null);
        if (!w0Var.f71863b) {
            return null;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("PixelCopyScreenShotProcess", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter("success", PglCryptUtils.KEY_MESSAGE);
        Log.i("PixelCopyScreenShotProcess", "success");
        return a(bitmapCreateBitmap);
    }

    public static final void a(kotlin.jvm.internal.w0 isSuccess, C2686ab this$0, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(isSuccess, "$isSuccess");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (i10 == 0) {
            isSuccess.f71863b = true;
        }
        String message = "capture result - success - " + isSuccess.f71863b;
        kotlin.jvm.internal.e0.checkNotNullParameter("PixelCopyScreenShotProcess", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        Log.i("PixelCopyScreenShotProcess", message);
        this$0.f32652c.set(true);
    }
}
