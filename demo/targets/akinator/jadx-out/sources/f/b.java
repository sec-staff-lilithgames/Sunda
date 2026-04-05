package f;

import android.window.BackEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f55195a = new b();

    public final BackEvent createOnBackEvent(float f10, float f11, float f12, int i10, long j10) {
        return new BackEvent(f10, f11, f12, i10, j10);
    }

    public final long frameTimeMillis(BackEvent backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getFrameTimeMillis();
    }
}
