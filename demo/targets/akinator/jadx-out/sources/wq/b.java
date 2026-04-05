package wq;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import ir.x;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f90797a = new b();

    public final void a(View view, Handler handler, c screenshotListener) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(handler, "handler");
        e0.checkNotNullParameter(screenshotListener, "screenshotListener");
        if (Build.VERSION.SDK_INT < 26) {
            screenshotListener.a();
            return;
        }
        Window windowFindWindow = x.findWindow(view);
        if (windowFindWindow == null) {
            screenshotListener.a();
            return;
        }
        Rect locationInWindow = x.getLocationInWindow(view);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(locationInWindow.width(), locationInWindow.height(), Bitmap.Config.ARGB_8888);
            e0.checkNotNullExpressionValue(bitmapCreateBitmap, "{\n            Bitmap.cre…nfig.ARGB_8888)\n        }");
            try {
                PixelCopy.request(windowFindWindow, locationInWindow, bitmapCreateBitmap, new a(screenshotListener, bitmapCreateBitmap), handler);
            } catch (Throwable unused) {
                screenshotListener.a();
            }
        } catch (Throwable unused2) {
            screenshotListener.a();
        }
    }
}
