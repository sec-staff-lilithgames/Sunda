package io.odeeo.internal.x;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.q0.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f67515b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67516c;

    /* renamed from: d, reason: collision with root package name */
    public final int f67517d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f67518e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f67519f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<j> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f67515b = i10;
        this.f67516c = i11;
        this.f67517d = i12;
        this.f67518e = iArr;
        this.f67519f = iArr2;
    }

    @Override // io.odeeo.internal.x.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f67515b == jVar.f67515b && this.f67516c == jVar.f67516c && this.f67517d == jVar.f67517d && Arrays.equals(this.f67518e, jVar.f67518e) && Arrays.equals(this.f67519f, jVar.f67519f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f67519f) + ((Arrays.hashCode(this.f67518e) + ((((((this.f67515b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f67516c) * 31) + this.f67517d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f67515b);
        parcel.writeInt(this.f67516c);
        parcel.writeInt(this.f67517d);
        parcel.writeIntArray(this.f67518e);
        parcel.writeIntArray(this.f67519f);
    }

    public j(Parcel parcel) {
        super("MLLT");
        this.f67515b = parcel.readInt();
        this.f67516c = parcel.readInt();
        this.f67517d = parcel.readInt();
        this.f67518e = (int[]) g0.castNonNull(parcel.createIntArray());
        this.f67519f = (int[]) g0.castNonNull(parcel.createIntArray());
    }
}
