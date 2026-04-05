package ah;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static j f4427d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4428a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public i f4429b;

    /* renamed from: c, reason: collision with root package name */
    public i f4430c;

    public j() {
        new Handler(Looper.getMainLooper(), new g(this));
    }

    public void dismiss(h hVar, int i10) {
        synchronized (this.f4428a) {
        }
    }

    public boolean isCurrent(h hVar) {
        synchronized (this.f4428a) {
        }
        return false;
    }

    public boolean isCurrentOrNext(h hVar) {
        synchronized (this.f4428a) {
        }
        return false;
    }

    public void onDismissed(h hVar) {
        synchronized (this.f4428a) {
        }
    }

    public void onShown(h hVar) {
        synchronized (this.f4428a) {
        }
    }

    public void pauseTimeout(h hVar) {
        synchronized (this.f4428a) {
        }
    }

    public void restoreTimeoutIfPaused(h hVar) {
        synchronized (this.f4428a) {
        }
    }

    public void show(int i10, h hVar) {
        synchronized (this.f4428a) {
            this.f4430c = new i(i10);
            i iVar = this.f4429b;
            if (iVar != null && iVar.f4426a.get() != null) {
                throw new ClassCastException();
            }
            this.f4429b = null;
            i iVar2 = this.f4430c;
            if (iVar2 != null) {
                this.f4429b = iVar2;
                this.f4430c = null;
                if (iVar2.f4426a.get() != null) {
                    throw new ClassCastException();
                }
                this.f4429b = null;
            }
        }
    }
}
