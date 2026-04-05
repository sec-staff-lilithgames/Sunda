package gn;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collection;
import java.util.List;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends Binder {

    /* renamed from: c, reason: collision with root package name */
    public static final int f57972c;

    /* renamed from: b, reason: collision with root package name */
    public final b5 f57973b;

    static {
        f57972c = io.bidmachine.media3.common.util.a1.f60679a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    public k(List<Bundle> list) {
        this.f57973b = b5.copyOf((Collection) list);
    }

    public static b5 getList(IBinder iBinder) {
        int i10;
        if (iBinder instanceof k) {
            return ((k) iBinder).f57973b;
        }
        x4 x4VarBuilder = b5.builder();
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
                            x4VarBuilder.add(io.bidmachine.media3.common.util.a.checkNotNull(parcelObtain2.readBundle()));
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
        return x4VarBuilder.build();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        b5 b5Var = this.f57973b;
        int size = b5Var.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f57972c) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) b5Var.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}
