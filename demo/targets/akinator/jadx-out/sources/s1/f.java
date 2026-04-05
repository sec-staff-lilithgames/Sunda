package s1;

import android.view.KeyEvent;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {
    /* renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m6713getKeyZmokQxo(KeyEvent key) {
        e0.checkNotNullParameter(key, "$this$key");
        return j.Key(key.getKeyCode());
    }

    /* renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m6714getTypeZmokQxo(KeyEvent type) {
        e0.checkNotNullParameter(type, "$this$type");
        int action = type.getAction();
        return action != 0 ? action != 1 ? e.f85306b.m6705getUnknownCS__XNY() : e.f85306b.m6704getKeyUpCS__XNY() : e.f85306b.m6703getKeyDownCS__XNY();
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m6715getUtf16CodePointZmokQxo(KeyEvent utf16CodePoint) {
        e0.checkNotNullParameter(utf16CodePoint, "$this$utf16CodePoint");
        return utf16CodePoint.getUnicodeChar();
    }

    /* renamed from: isAltPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m6716isAltPressedZmokQxo(KeyEvent isAltPressed) {
        e0.checkNotNullParameter(isAltPressed, "$this$isAltPressed");
        return isAltPressed.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m6717isCtrlPressedZmokQxo(KeyEvent isCtrlPressed) {
        e0.checkNotNullParameter(isCtrlPressed, "$this$isCtrlPressed");
        return isCtrlPressed.isCtrlPressed();
    }

    /* renamed from: isMetaPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m6718isMetaPressedZmokQxo(KeyEvent isMetaPressed) {
        e0.checkNotNullParameter(isMetaPressed, "$this$isMetaPressed");
        return isMetaPressed.isMetaPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m6719isShiftPressedZmokQxo(KeyEvent isShiftPressed) {
        e0.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
        return isShiftPressed.isShiftPressed();
    }
}
