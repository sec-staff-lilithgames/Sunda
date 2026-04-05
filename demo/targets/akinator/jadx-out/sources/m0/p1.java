package m0;

import android.view.KeyEvent;
import d0.k3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p1 {
    /* renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m5555isCopyKeyEventZmokQxo(KeyEvent keyEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keyEvent, "keyEvent");
        return false;
    }

    public static final e1.v selectionMagnifier(e1.v vVar, h1 manager) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(manager, "manager");
        return !k3.f51464g.getTextDefault().isSupported() ? vVar : e1.o.composed$default(vVar, null, new o1(manager), 1, null);
    }
}
