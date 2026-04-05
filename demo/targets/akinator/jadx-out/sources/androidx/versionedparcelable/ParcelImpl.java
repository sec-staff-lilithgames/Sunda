package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import g6.a;
import g6.e;
import g6.i;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final i f7341b;

    public ParcelImpl(i iVar) {
        this.f7341b = iVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public <T extends i> T getVersionedParcel() {
        return (T) this.f7341b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new e(parcel).o(this.f7341b);
    }

    public ParcelImpl(Parcel parcel) {
        this.f7341b = new e(parcel).j();
    }
}
