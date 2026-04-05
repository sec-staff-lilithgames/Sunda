package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.C1266Ht;
import com.facebook.ads.redexgen.core.C4J;

/* loaded from: assets/audience_network.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C1266Ht();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j10, byte[] bArr, long j11) {
        this.A01 = j11;
        this.A00 = j10;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = (byte[]) AbstractC09264a.A0f(parcel.createByteArray());
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C1266Ht c1266Ht) {
        this(parcel);
    }

    public static PrivateCommand A00(C4J c4j, int i10, long j10) {
        long jA0Q = c4j.A0Q();
        byte[] bArr = new byte[i10 - 4];
        c4j.A0k(bArr, 0, bArr.length);
        return new PrivateCommand(jA0Q, bArr, j10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeByteArray(this.A02);
    }
}
