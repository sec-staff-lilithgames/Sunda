package ye;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f94372a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f94373b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f94374c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f94375d;

    /* renamed from: e, reason: collision with root package name */
    public final long f94376e;

    /* renamed from: f, reason: collision with root package name */
    public final List f94377f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f94378g;

    /* renamed from: h, reason: collision with root package name */
    public final long f94379h;

    /* renamed from: i, reason: collision with root package name */
    public final int f94380i;

    /* renamed from: j, reason: collision with root package name */
    public final int f94381j;

    /* renamed from: k, reason: collision with root package name */
    public final int f94382k;

    public h(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.f94372a = j10;
        this.f94373b = z10;
        this.f94374c = z11;
        this.f94375d = z12;
        this.f94377f = Collections.unmodifiableList(arrayList);
        this.f94376e = j11;
        this.f94378g = z13;
        this.f94379h = j12;
        this.f94380i = i10;
        this.f94381j = i11;
        this.f94382k = i12;
    }

    public h(Parcel parcel) {
        this.f94372a = parcel.readLong();
        this.f94373b = parcel.readByte() == 1;
        this.f94374c = parcel.readByte() == 1;
        this.f94375d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f94377f = Collections.unmodifiableList(arrayList);
        this.f94376e = parcel.readLong();
        this.f94378g = parcel.readByte() == 1;
        this.f94379h = parcel.readLong();
        this.f94380i = parcel.readInt();
        this.f94381j = parcel.readInt();
        this.f94382k = parcel.readInt();
    }
}
