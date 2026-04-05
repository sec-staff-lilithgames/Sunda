package i4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import x3.z1;
import y3.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f59385b;

    public c(d dVar) {
        this.f59385b = dVar;
    }

    @Override // y3.n
    public y3.c createAccessibilityNodeInfo(int i10) {
        return y3.c.obtain(this.f59385b.f(i10));
    }

    @Override // y3.n
    public y3.c findFocus(int i10) {
        d dVar = this.f59385b;
        int i11 = i10 == 2 ? dVar.f59396k : dVar.f59397l;
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return createAccessibilityNodeInfo(i11);
    }

    @Override // y3.n
    public boolean performAction(int i10, int i11, Bundle bundle) {
        int i12;
        d dVar = this.f59385b;
        View view = dVar.f59394i;
        if (i10 == -1) {
            return z1.performAccessibilityAction(view, i11, bundle);
        }
        if (i11 == 1) {
            return dVar.requestKeyboardFocusForVirtualView(i10);
        }
        if (i11 == 2) {
            return dVar.clearKeyboardFocusForVirtualView(i10);
        }
        if (i11 != 64) {
            if (i11 != 128) {
                return dVar.g(i10, i11);
            }
            if (dVar.f59396k != i10) {
                return false;
            }
            dVar.f59396k = Integer.MIN_VALUE;
            view.invalidate();
            dVar.sendEventForVirtualView(i10, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            return true;
        }
        AccessibilityManager accessibilityManager = dVar.f59393h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i12 = dVar.f59396k) == i10) {
            return false;
        }
        if (i12 != Integer.MIN_VALUE) {
            dVar.f59396k = Integer.MIN_VALUE;
            view.invalidate();
            dVar.sendEventForVirtualView(i12, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }
        dVar.f59396k = i10;
        view.invalidate();
        dVar.sendEventForVirtualView(i10, 32768);
        return true;
    }
}
