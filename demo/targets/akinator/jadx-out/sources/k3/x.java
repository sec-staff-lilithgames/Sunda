package k3;

import android.content.ComponentName;
import android.content.Intent;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f70261a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f70262b;

    /* renamed from: c, reason: collision with root package name */
    public int f70263c;

    public x(ComponentName componentName) {
        this.f70261a = componentName;
    }

    public abstract void a(Intent intent);

    public final void b(int i10) {
        if (!this.f70262b) {
            this.f70262b = true;
            this.f70263c = i10;
        } else {
            if (this.f70263c == i10) {
                return;
            }
            StringBuilder sbT = o2.t(i10, "Given job ID ", " is different than previous ");
            sbT.append(this.f70263c);
            throw new IllegalArgumentException(sbT.toString());
        }
    }

    public void serviceProcessingFinished() {
    }

    public void serviceProcessingStarted() {
    }

    public void serviceStartReceived() {
    }
}
