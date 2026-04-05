package u3;

import android.os.Process;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final int f87823b;

    public r(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f87823b = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f87823b);
        super.run();
    }
}
