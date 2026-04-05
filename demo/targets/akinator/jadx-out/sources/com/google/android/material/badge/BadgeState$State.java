package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xf.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class BadgeState$State implements Parcelable {
    public static final Parcelable.Creator<BadgeState$State> CREATOR = new b();
    public Integer A;
    public Integer B;
    public Integer C;
    public Integer D;
    public Integer E;
    public Boolean F;
    public Integer G;

    /* renamed from: b, reason: collision with root package name */
    public int f28889b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f28890c;

    /* renamed from: e, reason: collision with root package name */
    public Integer f28891e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f28892f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f28893g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f28894h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f28895i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f28896j;

    /* renamed from: l, reason: collision with root package name */
    public String f28898l;

    /* renamed from: p, reason: collision with root package name */
    public Locale f28902p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f28903q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f28904r;

    /* renamed from: s, reason: collision with root package name */
    public int f28905s;

    /* renamed from: t, reason: collision with root package name */
    public int f28906t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f28907u;

    /* renamed from: w, reason: collision with root package name */
    public Integer f28909w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f28910x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f28911y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f28912z;

    /* renamed from: k, reason: collision with root package name */
    public int f28897k = 255;

    /* renamed from: m, reason: collision with root package name */
    public int f28899m = -2;

    /* renamed from: n, reason: collision with root package name */
    public int f28900n = -2;

    /* renamed from: o, reason: collision with root package name */
    public int f28901o = -2;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f28908v = Boolean.TRUE;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f28889b);
        parcel.writeSerializable(this.f28890c);
        parcel.writeSerializable(this.f28891e);
        parcel.writeSerializable(this.f28892f);
        parcel.writeSerializable(this.f28893g);
        parcel.writeSerializable(this.f28894h);
        parcel.writeSerializable(this.f28895i);
        parcel.writeSerializable(this.f28896j);
        parcel.writeInt(this.f28897k);
        parcel.writeString(this.f28898l);
        parcel.writeInt(this.f28899m);
        parcel.writeInt(this.f28900n);
        parcel.writeInt(this.f28901o);
        CharSequence charSequence = this.f28903q;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f28904r;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f28905s);
        parcel.writeSerializable(this.f28907u);
        parcel.writeSerializable(this.f28909w);
        parcel.writeSerializable(this.f28910x);
        parcel.writeSerializable(this.f28911y);
        parcel.writeSerializable(this.f28912z);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.f28908v);
        parcel.writeSerializable(this.f28902p);
        parcel.writeSerializable(this.F);
        parcel.writeSerializable(this.G);
    }
}
