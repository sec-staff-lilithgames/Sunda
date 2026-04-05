package s1;

import android.view.KeyEvent;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f85305a;

    public /* synthetic */ c(KeyEvent keyEvent) {
        this.f85305a = keyEvent;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ c m6696boximpl(KeyEvent keyEvent) {
        return new c(keyEvent);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static KeyEvent m6697constructorimpl(KeyEvent nativeKeyEvent) {
        e0.checkNotNullParameter(nativeKeyEvent, "nativeKeyEvent");
        return nativeKeyEvent;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6698equalsimpl(KeyEvent keyEvent, Object obj) {
        return (obj instanceof c) && e0.areEqual(keyEvent, ((c) obj).m6702unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6699equalsimpl0(KeyEvent keyEvent, KeyEvent keyEvent2) {
        return e0.areEqual(keyEvent, keyEvent2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6700hashCodeimpl(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6701toStringimpl(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m6698equalsimpl(this.f85305a, obj);
    }

    public final KeyEvent getNativeKeyEvent() {
        return this.f85305a;
    }

    public int hashCode() {
        return m6700hashCodeimpl(this.f85305a);
    }

    public String toString() {
        return m6701toStringimpl(this.f85305a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ KeyEvent m6702unboximpl() {
        return this.f85305a;
    }
}
