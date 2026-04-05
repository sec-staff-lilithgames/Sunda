package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import o5.k0;
import o5.l0;
import o5.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public int f7337b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7338c = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final l0 f7339e = new l0(this);

    /* renamed from: f, reason: collision with root package name */
    public final k0 f7340f = new k0(this);

    public final RemoteCallbackList<s> getCallbackList$room_runtime_release() {
        return this.f7339e;
    }

    public final Map<Integer, String> getClientNames$room_runtime_release() {
        return this.f7338c;
    }

    public final int getMaxClientId$room_runtime_release() {
        return this.f7337b;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        e0.checkNotNullParameter(intent, "intent");
        return this.f7340f;
    }

    public final void setMaxClientId$room_runtime_release(int i10) {
        this.f7337b = i10;
    }
}
