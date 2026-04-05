package ek;

import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a2 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a2 f54456a = new a2();

    @Override // ek.z1
    public y1 currentTime() {
        return new y1(System.currentTimeMillis());
    }

    @Override // ek.z1
    /* renamed from: elapsedRealtime-UwyO8pc, reason: not valid java name */
    public long mo3835elapsedRealtimeUwyO8pc() {
        tv.e eVar = tv.f.f87433c;
        return tv.h.toDuration(SystemClock.elapsedRealtime(), tv.i.f87441f);
    }
}
