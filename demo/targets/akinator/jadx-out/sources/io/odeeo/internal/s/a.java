package io.odeeo.internal.s;

import android.os.Parcel;
import android.os.Parcelable;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0646a();

    /* renamed from: a, reason: collision with root package name */
    public final b[] f66247a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.s.a$a, reason: collision with other inner class name */
    public class C0646a implements Parcelable.Creator<a> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(b... bVarArr) {
        this.f66247a = bVarArr;
    }

    public a copyWithAppendedEntries(b... bVarArr) {
        return bVarArr.length == 0 ? this : new a((b[]) g0.nullSafeArrayConcatenation(this.f66247a, bVarArr));
    }

    public a copyWithAppendedEntriesFrom(a aVar) {
        return aVar == null ? this : copyWithAppendedEntries(aVar.f66247a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f66247a, ((a) obj).f66247a);
    }

    public b get(int i10) {
        return this.f66247a[i10];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f66247a);
    }

    public int length() {
        return this.f66247a.length;
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f66247a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f66247a.length);
        for (b bVar : this.f66247a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public a(List<? extends b> list) {
        this.f66247a = (b[]) list.toArray(new b[0]);
    }

    public a(Parcel parcel) {
        this.f66247a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f66247a;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
            i10++;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b extends Parcelable {
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        default t getWrappedMetadataFormat() {
            return null;
        }

        default void populateMediaMetadata(a0.b bVar) {
        }
    }
}
