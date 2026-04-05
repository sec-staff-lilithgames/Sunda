package hj;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowManager;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public ij.c f58973a;

    public static Rect a(Activity activity) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
        Point point = new Point();
        ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        rect.top = rect2.top;
        rect.left = rect2.left;
        rect.right = point.x - rect2.right;
        rect.bottom = point.y - rect2.bottom;
        return rect;
    }

    public void destroy(Activity activity) {
        if (isFiamDisplayed()) {
            ((WindowManager) activity.getSystemService("window")).removeViewImmediate(this.f58973a.getRootView());
            this.f58973a = null;
        }
    }

    public boolean isFiamDisplayed() {
        ij.c cVar = this.f58973a;
        if (cVar == null) {
            return false;
        }
        return cVar.getRootView().isShown();
    }

    public void show(ij.c cVar, Activity activity) {
        ij.c cVar2;
        f0 mVar;
        if (isFiamDisplayed()) {
            t.loge("Fiam already active. Cannot show new Fiam.");
            return;
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            t.loge("Activity is finishing or does not have valid window token. Cannot show FIAM.");
            return;
        }
        s config = cVar.getConfig();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(config.windowWidth().intValue(), config.windowHeight().intValue(), IronSourceError.AUCTION_ERROR_DECRYPTION, config.windowFlag().intValue(), -3);
        Rect rectA = a(activity);
        if ((config.viewWindowGravity().intValue() & 48) == 48) {
            layoutParams.y = rectA.top;
        }
        layoutParams.dimAmount = 0.3f;
        layoutParams.gravity = config.viewWindowGravity().intValue();
        layoutParams.windowAnimations = 0;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        windowManager.addView(cVar.getRootView(), layoutParams);
        Rect rectA2 = a(activity);
        t.logdPair("Inset (top, bottom)", rectA2.top, rectA2.bottom);
        t.logdPair("Inset (left, right)", rectA2.left, rectA2.right);
        if (cVar.canSwipeToDismiss()) {
            l lVar = new l(cVar);
            if (config.windowWidth().intValue() == -1) {
                mVar = new f0(cVar.getDialogView(), null, lVar);
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                mVar = new m(cVar.getDialogView(), lVar, layoutParams, windowManager, cVar2);
            }
            cVar2.getDialogView().setOnTouchListener(mVar);
        } else {
            cVar2 = cVar;
        }
        this.f58973a = cVar2;
    }
}
