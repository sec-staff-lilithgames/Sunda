package io.odeeo.internal.z;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.q0.e0;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends io.odeeo.internal.z.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f67752a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67753b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f67754c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f67755d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f67756e;

    /* renamed from: f, reason: collision with root package name */
    public final long f67757f;

    /* renamed from: g, reason: collision with root package name */
    public final long f67758g;

    /* renamed from: h, reason: collision with root package name */
    public final List<b> f67759h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f67760i;

    /* renamed from: j, reason: collision with root package name */
    public final long f67761j;

    /* renamed from: k, reason: collision with root package name */
    public final int f67762k;

    /* renamed from: l, reason: collision with root package name */
    public final int f67763l;

    /* renamed from: m, reason: collision with root package name */
    public final int f67764m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<d> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f67765a;

        /* renamed from: b, reason: collision with root package name */
        public final long f67766b;

        /* renamed from: c, reason: collision with root package name */
        public final long f67767c;

        public /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b createFromParcel(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.f67765a);
            parcel.writeLong(this.f67766b);
            parcel.writeLong(this.f67767c);
        }

        public b(int i10, long j10, long j11) {
            this.f67765a = i10;
            this.f67766b = j10;
            this.f67767c = j11;
        }
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static d a(x xVar, long j10, e0 e0Var) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int unsignedByte;
        int unsignedByte2;
        boolean z14;
        int i11;
        long jA;
        long unsignedInt = xVar.readUnsignedInt();
        boolean z15 = (xVar.readUnsignedByte() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long unsignedInt2 = C.TIME_UNSET;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
        } else {
            int unsignedByte3 = xVar.readUnsignedByte();
            boolean z16 = (unsignedByte3 & 128) != 0;
            boolean z17 = (unsignedByte3 & 64) != 0;
            boolean z18 = (unsignedByte3 & 32) != 0;
            boolean z19 = (unsignedByte3 & 16) != 0;
            long jA2 = (!z17 || z19) ? -9223372036854775807L : g.a(xVar, j10);
            if (!z17) {
                int unsignedByte4 = xVar.readUnsignedByte();
                ArrayList arrayList = new ArrayList(unsignedByte4);
                int i12 = 0;
                while (i12 < unsignedByte4) {
                    int unsignedByte5 = xVar.readUnsignedByte();
                    if (z19) {
                        i11 = unsignedByte4;
                        jA = -9223372036854775807L;
                    } else {
                        i11 = unsignedByte4;
                        jA = g.a(xVar, j10);
                    }
                    arrayList.add(new b(unsignedByte5, jA, e0Var.adjustTsTimestamp(jA), null));
                    i12++;
                    unsignedByte4 = i11;
                }
                list2 = arrayList;
            }
            if (z18) {
                long unsignedByte6 = xVar.readUnsignedByte();
                boolean z20 = (128 & unsignedByte6) != 0;
                unsignedInt2 = ((((unsignedByte6 & 1) << 32) | xVar.readUnsignedInt()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int unsignedShort = xVar.readUnsignedShort();
            long j12 = jA2;
            j11 = unsignedInt2;
            unsignedInt2 = j12;
            unsignedByte = xVar.readUnsignedByte();
            unsignedByte2 = xVar.readUnsignedByte();
            i10 = unsignedShort;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new d(unsignedInt, z15, z10, z11, z12, unsignedInt2, e0Var.adjustTsTimestamp(unsignedInt2), list, z13, j11, i10, unsignedByte, unsignedByte2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f67752a);
        parcel.writeByte(this.f67753b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67754c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67755d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67756e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f67757f);
        parcel.writeLong(this.f67758g);
        int size = this.f67759h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f67759h.get(i11).writeToParcel(parcel);
        }
        parcel.writeByte(this.f67760i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f67761j);
        parcel.writeInt(this.f67762k);
        parcel.writeInt(this.f67763l);
        parcel.writeInt(this.f67764m);
    }

    public d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f67752a = j10;
        this.f67753b = z10;
        this.f67754c = z11;
        this.f67755d = z12;
        this.f67756e = z13;
        this.f67757f = j11;
        this.f67758g = j12;
        this.f67759h = Collections.unmodifiableList(list);
        this.f67760i = z14;
        this.f67761j = j13;
        this.f67762k = i10;
        this.f67763l = i11;
        this.f67764m = i12;
    }

    public d(Parcel parcel) {
        this.f67752a = parcel.readLong();
        this.f67753b = parcel.readByte() == 1;
        this.f67754c = parcel.readByte() == 1;
        this.f67755d = parcel.readByte() == 1;
        this.f67756e = parcel.readByte() == 1;
        this.f67757f = parcel.readLong();
        this.f67758g = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.createFromParcel(parcel));
        }
        this.f67759h = Collections.unmodifiableList(arrayList);
        this.f67760i = parcel.readByte() == 1;
        this.f67761j = parcel.readLong();
        this.f67762k = parcel.readInt();
        this.f67763l = parcel.readInt();
        this.f67764m = parcel.readInt();
    }
}
