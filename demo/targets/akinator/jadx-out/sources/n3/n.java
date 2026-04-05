package n3;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {
    public static Handler getHandler(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public final void callbackFailAsync(int i10, Handler handler) {
        getHandler(handler).post(new com.applovin.impl.adview.p(this, i10, 7));
    }

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        getHandler(handler).post(new im.k(25, this, typeface));
    }

    public abstract void onFontRetrievalFailed(int i10);

    public abstract void onFontRetrieved(Typeface typeface);
}
