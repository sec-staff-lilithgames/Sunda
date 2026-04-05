package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.x4;
import p0.y4;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableState<T> extends x4 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR;

    static {
        new a(null);
        CREATOR = new androidx.compose.runtime.a();
    }

    public ParcelableSnapshotMutableState(T t10, y4 y4Var) {
        super(t10, y4Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        y4 policy = getPolicy();
        if (e0.areEqual(policy, z4.neverEqualPolicy())) {
            i11 = 0;
        } else if (e0.areEqual(policy, z4.structuralEqualityPolicy())) {
            i11 = 1;
        } else {
            if (!e0.areEqual(policy, z4.referentialEqualityPolicy())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }
}
