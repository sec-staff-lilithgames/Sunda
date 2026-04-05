package io.odeeo.internal.b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.u0.h1;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public static final int f62682b;

    /* renamed from: a, reason: collision with root package name */
    public final h1<Bundle> f62683a;

    static {
        f62682b = io.odeeo.internal.q0.g0.f65861a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    public f(List<Bundle> list) {
        this.f62683a = h1.copyOf((Collection) list);
    }

    public static h1<Bundle> getList(IBinder iBinder) {
        int i10;
        h1.a aVarBuilder = h1.builder();
        int i11 = 0;
        int i12 = 1;
        while (i12 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i11);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            aVarBuilder.add((h1.a) io.odeeo.internal.q0.a.checkNotNull(parcelObtain2.readBundle()));
                            i11++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i12 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return aVarBuilder.build();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f62683a.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f62682b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f62683a.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}
