package e;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final int f52953b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f52954c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f52955e;

    public f(ResultReceiver resultReceiver, int i10, Bundle bundle) {
        this.f52955e = resultReceiver;
        this.f52953b = i10;
        this.f52954c = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f52955e.a(this.f52953b, this.f52954c);
    }
}
