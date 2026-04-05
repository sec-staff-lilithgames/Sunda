package u1;

import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f87596a = new i();

    /* renamed from: toRawOffset-dBAh8RU, reason: not valid java name */
    public final long m7320toRawOffsetdBAh8RU(MotionEvent motionEvent, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(motionEvent, "motionEvent");
        return i1.i.Offset(motionEvent.getRawX(i10), motionEvent.getRawY(i10));
    }
}
