package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import m3.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public final k f5748b = new k(this);

    public abstract void a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f5748b;
    }
}
