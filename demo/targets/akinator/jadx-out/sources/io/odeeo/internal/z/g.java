package io.odeeo.internal.z;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.q0.e0;
import io.odeeo.internal.q0.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f67782a;

    /* renamed from: b, reason: collision with root package name */
    public final long f67783b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<g> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public /* synthetic */ g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    public static g a(x xVar, long j10, e0 e0Var) {
        long jA = a(xVar, j10);
        return new g(jA, e0Var.adjustTsTimestamp(jA));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f67782a);
        parcel.writeLong(this.f67783b);
    }

    public g(long j10, long j11) {
        this.f67782a = j10;
        this.f67783b = j11;
    }

    public static long a(x xVar, long j10) {
        long unsignedByte = xVar.readUnsignedByte();
        return (128 & unsignedByte) != 0 ? 8589934591L & ((((unsignedByte & 1) << 32) | xVar.readUnsignedInt()) + j10) : C.TIME_UNSET;
    }
}
