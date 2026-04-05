package u3;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public j f87827b;

    /* renamed from: c, reason: collision with root package name */
    public k f87828c;

    /* renamed from: e, reason: collision with root package name */
    public Handler f87829e;

    @Override // java.lang.Runnable
    public void run() throws Exception {
        Object objCall;
        try {
            objCall = this.f87827b.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f87829e.post(new u(this.f87828c, objCall));
    }
}
