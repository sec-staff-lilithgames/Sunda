package com.google.firebase;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f29674a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public void onBackgroundStateChanged(boolean z10) {
        synchronized (g.f29675k) {
            try {
                Iterator it = new ArrayList(g.f29676l.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f29681e.get()) {
                        gVar.d(z10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
