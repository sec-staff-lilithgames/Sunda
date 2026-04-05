package wa;

import android.content.ComponentName;
import android.os.IBinder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f90473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f90474c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f90475e;

    public d(e eVar, ComponentName componentName, IBinder iBinder) {
        this.f90475e = eVar;
        this.f90473b = componentName;
        this.f90474c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f90475e.a(this.f90473b, this.f90474c);
    }
}
