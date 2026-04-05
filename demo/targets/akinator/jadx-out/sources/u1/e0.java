package u1;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f87547a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87548b;

    /* renamed from: c, reason: collision with root package name */
    public final MotionEvent f87549c;

    public e0(long j10, List<f0> pointers, MotionEvent motionEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pointers, "pointers");
        kotlin.jvm.internal.e0.checkNotNullParameter(motionEvent, "motionEvent");
        this.f87547a = j10;
        this.f87548b = pointers;
        this.f87549c = motionEvent;
    }

    public final MotionEvent getMotionEvent() {
        return this.f87549c;
    }

    public final List<f0> getPointers() {
        return this.f87548b;
    }

    public final long getUptime() {
        return this.f87547a;
    }
}
