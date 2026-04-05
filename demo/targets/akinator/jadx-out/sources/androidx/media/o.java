package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f6846c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f6847e;

    public o(q qVar, String str, Bundle bundle) {
        this.f6847e = qVar;
        this.f6845b = str;
        this.f6846c = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        q qVar = this.f6847e;
        Iterator<Object> it = qVar.f6858d.f6775f.keySet().iterator();
        while (it.hasNext()) {
            qVar.a((k) qVar.f6858d.f6775f.get((IBinder) it.next()), this.f6845b, this.f6846c);
        }
    }
}
