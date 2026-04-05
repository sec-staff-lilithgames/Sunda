package m7;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {
    public static j a(p pVar) {
        c cVarDimension;
        c cVarDimension2;
        ViewGroup.LayoutParams layoutParams = pVar.getView().getLayoutParams();
        int i10 = layoutParams != null ? layoutParams.width : -1;
        int width = pVar.getView().getWidth();
        int paddingRight = pVar.getSubtractPadding() ? pVar.getView().getPaddingRight() + pVar.getView().getPaddingLeft() : 0;
        if (i10 == -2) {
            cVarDimension = d.f74053a;
        } else {
            int i11 = i10 - paddingRight;
            if (i11 > 0) {
                cVarDimension = a.Dimension(i11);
            } else {
                int i12 = width - paddingRight;
                cVarDimension = i12 > 0 ? a.Dimension(i12) : null;
            }
        }
        if (cVarDimension != null) {
            ViewGroup.LayoutParams layoutParams2 = pVar.getView().getLayoutParams();
            int i13 = layoutParams2 != null ? layoutParams2.height : -1;
            int height = pVar.getView().getHeight();
            int paddingTop = pVar.getSubtractPadding() ? pVar.getView().getPaddingTop() + pVar.getView().getPaddingBottom() : 0;
            if (i13 == -2) {
                cVarDimension2 = d.f74053a;
            } else {
                int i14 = i13 - paddingTop;
                if (i14 > 0) {
                    cVarDimension2 = a.Dimension(i14);
                } else {
                    int i15 = height - paddingTop;
                    cVarDimension2 = i15 > 0 ? a.Dimension(i15) : null;
                }
            }
            if (cVarDimension2 != null) {
                return new j(cVarDimension, cVarDimension2);
            }
        }
        return null;
    }

    public static final void access$removePreDrawListenerSafe(p pVar, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            pVar.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    public static <T extends View> boolean getSubtractPadding(p pVar) {
        return true;
    }

    public static <T extends View> Object size(p pVar, zu.d<? super j> dVar) {
        j jVarA = a(pVar);
        if (jVarA != null) {
            return jVarA;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        ViewTreeObserver viewTreeObserver = pVar.getView().getViewTreeObserver();
        o oVar = new o(pVar, viewTreeObserver, cancellableContinuationImpl);
        viewTreeObserver.addOnPreDrawListener(oVar);
        cancellableContinuationImpl.invokeOnCancellation(new n(pVar, viewTreeObserver, oVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }
}
