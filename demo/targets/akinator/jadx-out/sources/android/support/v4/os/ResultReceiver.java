package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import e.b;
import e.c;
import e.d;
import e.e;
import e.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new d();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4640b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4641c;

    /* renamed from: e, reason: collision with root package name */
    public c f4642e;

    public ResultReceiver(Handler handler) {
        this.f4640b = true;
        this.f4641c = handler;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void send(int i10, Bundle bundle) {
        if (this.f4640b) {
            Handler handler = this.f4641c;
            if (handler != null) {
                handler.post(new f(this, i10, bundle));
                return;
            } else {
                a(i10, bundle);
                return;
            }
        }
        c cVar = this.f4642e;
        if (cVar != null) {
            try {
                cVar.send(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f4642e == null) {
                    this.f4642e = new e(this);
                }
                parcel.writeStrongBinder(this.f4642e.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f4640b = false;
        this.f4641c = null;
        this.f4642e = b.asInterface(parcel.readStrongBinder());
    }

    public void a(int i10, Bundle bundle) {
    }
}
