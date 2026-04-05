package io.odeeo.internal.z;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends io.odeeo.internal.z.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f67768a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<f> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f67769a;

        /* renamed from: b, reason: collision with root package name */
        public final long f67770b;

        public /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        public static b b(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void c(Parcel parcel) {
            parcel.writeInt(this.f67769a);
            parcel.writeLong(this.f67770b);
        }

        public b(int i10, long j10) {
            this.f67769a = i10;
            this.f67770b = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f67771a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f67772b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f67773c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f67774d;

        /* renamed from: e, reason: collision with root package name */
        public final long f67775e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f67776f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f67777g;

        /* renamed from: h, reason: collision with root package name */
        public final long f67778h;

        /* renamed from: i, reason: collision with root package name */
        public final int f67779i;

        /* renamed from: j, reason: collision with root package name */
        public final int f67780j;

        /* renamed from: k, reason: collision with root package name */
        public final int f67781k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f67771a = j10;
            this.f67772b = z10;
            this.f67773c = z11;
            this.f67774d = z12;
            this.f67776f = Collections.unmodifiableList(list);
            this.f67775e = j11;
            this.f67777g = z13;
            this.f67778h = j12;
            this.f67779i = i10;
            this.f67780j = i11;
            this.f67781k = i12;
        }

        public static c b(x xVar) {
            boolean z10;
            ArrayList arrayList;
            boolean z11;
            boolean z12;
            long j10;
            boolean z13;
            long j11;
            int i10;
            int i11;
            int unsignedByte;
            boolean z14;
            long unsignedInt;
            long unsignedInt2 = xVar.readUnsignedInt();
            boolean z15 = true;
            if ((xVar.readUnsignedByte() & 128) != 0) {
                z10 = true;
            } else {
                z10 = true;
                z15 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z15) {
                arrayList = arrayList2;
                z11 = false;
                z12 = false;
                j10 = C.TIME_UNSET;
                z13 = false;
                j11 = C.TIME_UNSET;
                i10 = 0;
                i11 = 0;
                unsignedByte = 0;
            } else {
                int unsignedByte2 = xVar.readUnsignedByte();
                boolean z16 = (unsignedByte2 & 128) != 0 ? z10 : false;
                boolean z17 = (unsignedByte2 & 64) != 0 ? z10 : false;
                boolean z18 = (unsignedByte2 & 32) != 0 ? z10 : false;
                long unsignedInt3 = z17 ? xVar.readUnsignedInt() : C.TIME_UNSET;
                if (!z17) {
                    int unsignedByte3 = xVar.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(unsignedByte3);
                    int i12 = 0;
                    while (i12 < unsignedByte3) {
                        arrayList3.add(new b(xVar.readUnsignedByte(), xVar.readUnsignedInt(), null));
                        i12++;
                        unsignedByte3 = unsignedByte3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z18) {
                    long unsignedByte4 = xVar.readUnsignedByte();
                    boolean z19 = (128 & unsignedByte4) != 0;
                    unsignedInt = ((((unsignedByte4 & 1) << 32) | xVar.readUnsignedInt()) * 1000) / 90;
                    z14 = z19;
                } else {
                    z14 = false;
                    unsignedInt = C.TIME_UNSET;
                }
                int unsignedShort = xVar.readUnsignedShort();
                int unsignedByte5 = xVar.readUnsignedByte();
                boolean z20 = z16;
                z13 = z14;
                z11 = z20;
                unsignedByte = xVar.readUnsignedByte();
                long j12 = unsignedInt3;
                i10 = unsignedShort;
                i11 = unsignedByte5;
                long j13 = unsignedInt;
                arrayList = arrayList2;
                z12 = z17;
                j10 = j12;
                j11 = j13;
            }
            return new c(unsignedInt2, z15, z11, z12, arrayList, j10, z13, j11, i10, i11, unsignedByte);
        }

        public final void c(Parcel parcel) {
            parcel.writeLong(this.f67771a);
            parcel.writeByte(this.f67772b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f67773c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f67774d ? (byte) 1 : (byte) 0);
            int size = this.f67776f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f67776f.get(i10).c(parcel);
            }
            parcel.writeLong(this.f67775e);
            parcel.writeByte(this.f67777g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f67778h);
            parcel.writeInt(this.f67779i);
            parcel.writeInt(this.f67780j);
            parcel.writeInt(this.f67781k);
        }

        public c(Parcel parcel) {
            this.f67771a = parcel.readLong();
            this.f67772b = parcel.readByte() == 1;
            this.f67773c = parcel.readByte() == 1;
            this.f67774d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.b(parcel));
            }
            this.f67776f = Collections.unmodifiableList(arrayList);
            this.f67775e = parcel.readLong();
            this.f67777g = parcel.readByte() == 1;
            this.f67778h = parcel.readLong();
            this.f67779i = parcel.readInt();
            this.f67780j = parcel.readInt();
            this.f67781k = parcel.readInt();
        }

        public static c b(Parcel parcel) {
            return new c(parcel);
        }
    }

    public /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static f a(x xVar) {
        int unsignedByte = xVar.readUnsignedByte();
        ArrayList arrayList = new ArrayList(unsignedByte);
        for (int i10 = 0; i10 < unsignedByte; i10++) {
            arrayList.add(c.b(xVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f67768a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f67768a.get(i11).c(parcel);
        }
    }

    public f(List<c> list) {
        this.f67768a = Collections.unmodifiableList(list);
    }

    public f(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.b(parcel));
        }
        this.f67768a = Collections.unmodifiableList(arrayList);
    }
}
