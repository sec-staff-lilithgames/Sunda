package com.bytedance.adsdk.ugeno.xyk;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo implements Parcelable {

    /* renamed from: jd, reason: collision with root package name */
    private final Parcelable f17967jd;
    public static final jpo jpo = new jpo() { // from class: com.bytedance.adsdk.ugeno.xyk.jpo.1
    };
    public static final Parcelable.Creator<jpo> CREATOR = new Parcelable.ClassLoaderCreator<jpo>() { // from class: com.bytedance.adsdk.ugeno.xyk.jpo.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public jpo createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public jpo createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return jpo.jpo;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public jpo[] newArray(int i10) {
            return new jpo[i10];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable jpo() {
        return this.f17967jd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f17967jd, i10);
    }

    private jpo() {
        this.f17967jd = null;
    }

    public jpo(Parcelable parcelable) {
        if (parcelable != null) {
            this.f17967jd = parcelable == jpo ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public jpo(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f17967jd = parcelable == null ? jpo : parcelable;
    }
}
