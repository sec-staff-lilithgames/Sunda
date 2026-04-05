package k3;

import android.app.Notification;
import android.os.RemoteException;
import com.ironsource.C3191e4;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f70223a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70224b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70225c;

    /* renamed from: d, reason: collision with root package name */
    public final Notification f70226d;

    public m0(String str, int i10, Notification notification, String str2) {
        this.f70223a = str;
        this.f70224b = i10;
        this.f70225c = str2;
        this.f70226d = notification;
    }

    @Override // k3.q0
    public void send(d.c cVar) throws RemoteException {
        cVar.notify(this.f70223a, this.f70224b, this.f70225c, this.f70226d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f70223a);
        sb2.append(", id:");
        sb2.append(this.f70224b);
        sb2.append(", tag:");
        return o2.o(sb2, this.f70225c, C3191e4.i.f36531e);
    }
}
