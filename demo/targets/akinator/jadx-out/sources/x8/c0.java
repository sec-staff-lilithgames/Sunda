package x8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f91810a = new b0();

    public static e a(q8.d dVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i10 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i11 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i10 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i11 = current.getIntrinsicHeight();
                    }
                    Lock bitmapDrawableLock = w0.getBitmapDrawableLock();
                    bitmapDrawableLock.lock();
                    Bitmap bitmap2 = dVar.get(i10, i11, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmap2);
                        current.setBounds(0, 0, i10, i11);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        bitmapDrawableLock.unlock();
                        bitmap = bitmap2;
                        z10 = true;
                    } catch (Throwable th2) {
                        bitmapDrawableLock.unlock();
                        throw th2;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z10 = true;
        }
        if (!z10) {
            dVar = f91810a;
        }
        return e.obtain(bitmap, dVar);
    }
}
