package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C1270Hx;
import com.facebook.ads.redexgen.core.C1272Hz;
import com.facebook.ads.redexgen.core.C4J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C1270Hx();
    public final List<C1272Hz> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(C1272Hz.A00(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C1270Hx c1270Hx) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<C1272Hz> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C4J c4j) {
        int iA0I = c4j.A0I();
        ArrayList arrayList = new ArrayList(iA0I);
        for (int i10 = 0; i10 < iA0I; i10++) {
            arrayList.add(C1272Hz.A02(c4j));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.A00.get(i11).A04(parcel);
        }
    }
}
