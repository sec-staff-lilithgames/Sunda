package dn;

import android.view.View;
import nm.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f52384a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public h f52385b;

    public void startTracking(View view, l lVar, i iVar) {
        synchronized (this.f52384a) {
            stopTracking();
            h hVar = new h(view, lVar, iVar);
            this.f52385b = hVar;
            hVar.start();
        }
    }

    public void stopTracking() {
        synchronized (this.f52384a) {
            try {
                h hVar = this.f52385b;
                if (hVar != null) {
                    hVar.stop();
                    this.f52385b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
