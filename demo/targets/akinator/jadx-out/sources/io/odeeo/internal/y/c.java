package io.odeeo.internal.y;

import af.i;
import android.os.Parcel;
import android.os.Parcelable;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.s.a;
import io.odeeo.internal.t0.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f67535a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<c> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public final long f67537a;

        /* renamed from: b, reason: collision with root package name */
        public final long f67538b;

        /* renamed from: c, reason: collision with root package name */
        public final int f67539c;

        /* renamed from: d, reason: collision with root package name */
        public static final Comparator<b> f67536d = new i(28);
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Parcelable.Creator<b> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            io.odeeo.internal.q0.a.checkArgument(j10 < j11);
            this.f67537a = j10;
            this.f67538b = j11;
            this.f67539c = i10;
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
                if (this.f67537a == bVar.f67537a && this.f67538b == bVar.f67538b && this.f67539c == bVar.f67539c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return p.hashCode(Long.valueOf(this.f67537a), Long.valueOf(this.f67538b), Integer.valueOf(this.f67539c));
        }

        public String toString() {
            return g0.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f67537a), Long.valueOf(this.f67538b), Integer.valueOf(this.f67539c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f67537a);
            parcel.writeLong(this.f67538b);
            parcel.writeInt(this.f67539c);
        }
    }

    public c(List<b> list) {
        this.f67535a = list;
        io.odeeo.internal.q0.a.checkArgument(!a(list));
    }

    public static boolean a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f67538b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f67537a < j10) {
                return true;
            }
            j10 = list.get(i10).f67538b;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f67535a.equals(((c) obj).f67535a);
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
        return this.f67535a.hashCode();
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ void populateMediaMetadata(a0.b bVar) {
        super.populateMediaMetadata(bVar);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f67535a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f67535a);
    }
}
