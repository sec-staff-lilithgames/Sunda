package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ff implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f31802a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31803b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f31804c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f31805d;

    public Ff(Kf visibilityTracker, AtomicBoolean isPaused) {
        kotlin.jvm.internal.e0.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(isPaused, "isPaused");
        this.f31802a = isPaused;
        this.f31803b = new ArrayList();
        this.f31804c = new ArrayList();
        this.f31805d = new WeakReference(visibilityTracker);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x019a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ff.run():void");
    }
}
