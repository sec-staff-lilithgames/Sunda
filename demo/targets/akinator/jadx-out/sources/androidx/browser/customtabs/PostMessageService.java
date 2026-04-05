package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class PostMessageService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public final q0 f5195b = new q0();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f5195b;
    }
}
