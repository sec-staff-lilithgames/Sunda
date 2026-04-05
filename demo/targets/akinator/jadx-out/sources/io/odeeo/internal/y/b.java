package io.odeeo.internal.y;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.s.a;
import io.odeeo.internal.w0.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f67530a;

    /* renamed from: b, reason: collision with root package name */
    public final long f67531b;

    /* renamed from: c, reason: collision with root package name */
    public final long f67532c;

    /* renamed from: d, reason: collision with root package name */
    public final long f67533d;

    /* renamed from: e, reason: collision with root package name */
    public final long f67534e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<b> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public /* synthetic */ b(Parcel parcel, a aVar) {
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f67530a == bVar.f67530a && this.f67531b == bVar.f67531b && this.f67532c == bVar.f67532c && this.f67533d == bVar.f67533d && this.f67534e == bVar.f67534e) {
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
        return e.hashCode(this.f67534e) + ((e.hashCode(this.f67533d) + ((e.hashCode(this.f67532c) + ((e.hashCode(this.f67531b) + ((e.hashCode(this.f67530a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ void populateMediaMetadata(a0.b bVar) {
        super.populateMediaMetadata(bVar);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f67530a + ", photoSize=" + this.f67531b + ", photoPresentationTimestampUs=" + this.f67532c + ", videoStartPosition=" + this.f67533d + ", videoSize=" + this.f67534e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f67530a);
        parcel.writeLong(this.f67531b);
        parcel.writeLong(this.f67532c);
        parcel.writeLong(this.f67533d);
        parcel.writeLong(this.f67534e);
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f67530a = j10;
        this.f67531b = j11;
        this.f67532c = j12;
        this.f67533d = j13;
        this.f67534e = j14;
    }

    public b(Parcel parcel) {
        this.f67530a = parcel.readLong();
        this.f67531b = parcel.readLong();
        this.f67532c = parcel.readLong();
        this.f67533d = parcel.readLong();
        this.f67534e = parcel.readLong();
    }
}
