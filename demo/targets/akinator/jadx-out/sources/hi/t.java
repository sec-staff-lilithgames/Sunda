package hi;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f58877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f58878c;

    public t(u uVar, long j10) {
        this.f58878c = uVar;
        this.f58877b = j10;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f58877b);
        this.f58878c.f58891k.logEvent("_ae", bundle);
        return null;
    }
}
