package d0;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f51333a = ViewConfiguration.getTapTimeout();

    public static final boolean access$isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final long getTapIndicationDelay() {
        return f51333a;
    }

    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m3687isClickZmokQxo(KeyEvent isClick) {
        kotlin.jvm.internal.e0.checkNotNullParameter(isClick, "$this$isClick");
        if (!s1.e.m6709equalsimpl0(s1.f.m6714getTypeZmokQxo(isClick), s1.e.f85306b.m6704getKeyUpCS__XNY())) {
            return false;
        }
        int iM6723getNativeKeyCodeYVgTNJs = s1.j.m6723getNativeKeyCodeYVgTNJs(s1.f.m6713getKeyZmokQxo(isClick));
        return iM6723getNativeKeyCodeYVgTNJs == 23 || iM6723getNativeKeyCodeYVgTNJs == 66 || iM6723getNativeKeyCodeYVgTNJs == 160;
    }

    public static final kv.a isComposeRootInScrollableContainer(p0.w wVar, int i10) {
        wVar.startReplaceableGroup(-1990508712);
        b1 b1Var = new b1((View) wVar.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        wVar.endReplaceableGroup();
        return b1Var;
    }
}
