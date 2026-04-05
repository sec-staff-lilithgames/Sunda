package io.odeeo.internal.t;

import android.os.Parcel;
import android.os.Parcelable;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.s.a;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0647a();

    /* renamed from: a, reason: collision with root package name */
    public final int f66358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66359b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.t.a$a, reason: collision with other inner class name */
    public class C0647a implements Parcelable.Creator<a> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) io.odeeo.internal.q0.a.checkNotNull(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f66358a = i10;
        this.f66359b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ t getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ void populateMediaMetadata(a0.b bVar) {
        super.populateMediaMetadata(bVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f66358a);
        sb2.append(",url=");
        return o2.o(sb2, this.f66359b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f66359b);
        parcel.writeInt(this.f66358a);
    }
}
