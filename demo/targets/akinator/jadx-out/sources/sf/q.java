package sf;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import com.google.android.exoplayer2.util.n1;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements o, DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f85701a;

    /* renamed from: b, reason: collision with root package name */
    public n f85702b;

    public q(DisplayManager displayManager) {
        this.f85701a = displayManager;
    }

    public static o maybeBuildNewInstance(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new q(displayManager);
        }
        return null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i10) {
        n nVar = this.f85702b;
        if (nVar == null || i10 != 0) {
            return;
        }
        ((b3) nVar).onDefaultDisplayChanged(this.f85701a.getDisplay(0));
    }

    @Override // sf.o
    public void register(n nVar) {
        this.f85702b = nVar;
        Handler handlerCreateHandlerForCurrentLooper = n1.createHandlerForCurrentLooper();
        DisplayManager displayManager = this.f85701a;
        displayManager.registerDisplayListener(this, handlerCreateHandlerForCurrentLooper);
        ((b3) nVar).onDefaultDisplayChanged(displayManager.getDisplay(0));
    }

    @Override // sf.o
    public void unregister() {
        this.f85701a.unregisterDisplayListener(this);
        this.f85702b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i10) {
    }
}
