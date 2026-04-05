package io.odeeo.internal.y;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.s.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements a.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final float f67540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67541b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<d> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f67540a == dVar.f67540a && this.f67541b == dVar.f67541b) {
                return true;
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ t getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        return ((io.odeeo.internal.w0.c.hashCode(this.f67540a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f67541b;
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ void populateMediaMetadata(a0.b bVar) {
        super.populateMediaMetadata(bVar);
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f67540a + ", svcTemporalLayerCount=" + this.f67541b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f67540a);
        parcel.writeInt(this.f67541b);
    }

    public d(float f10, int i10) {
        this.f67540a = f10;
        this.f67541b = i10;
    }

    public d(Parcel parcel) {
        this.f67540a = parcel.readFloat();
        this.f67541b = parcel.readInt();
    }
}
