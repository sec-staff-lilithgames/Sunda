package com.digidust.elokence.akinator.webservices.cheatmanagement;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class CheatManagement$AwardsToVote implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final int f21823b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21824c;

    /* renamed from: e, reason: collision with root package name */
    public final String f21825e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21826f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Parcelable.Creator {
        public a(u uVar) {
        }

        @Override // android.os.Parcelable.Creator
        public CheatManagement$AwardsToVote createFromParcel(Parcel parcel) {
            e0.checkNotNullParameter(parcel, "parcel");
            return new CheatManagement$AwardsToVote(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CheatManagement$AwardsToVote[] newArray(int i10) {
            return new CheatManagement$AwardsToVote[i10];
        }
    }

    public CheatManagement$AwardsToVote(int i10, String nom, String description, int i11) {
        e0.checkNotNullParameter(nom, "nom");
        e0.checkNotNullParameter(description, "description");
        this.f21823b = i10;
        this.f21824c = nom;
        this.f21825e = description;
        this.f21826f = i11;
    }

    public static /* synthetic */ CheatManagement$AwardsToVote copy$default(CheatManagement$AwardsToVote cheatManagement$AwardsToVote, int i10, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = cheatManagement$AwardsToVote.f21823b;
        }
        if ((i12 & 2) != 0) {
            str = cheatManagement$AwardsToVote.f21824c;
        }
        if ((i12 & 4) != 0) {
            str2 = cheatManagement$AwardsToVote.f21825e;
        }
        if ((i12 & 8) != 0) {
            i11 = cheatManagement$AwardsToVote.f21826f;
        }
        return cheatManagement$AwardsToVote.copy(i10, str, str2, i11);
    }

    public final int component1() {
        return this.f21823b;
    }

    public final String component2() {
        return this.f21824c;
    }

    public final String component3() {
        return this.f21825e;
    }

    public final int component4() {
        return this.f21826f;
    }

    public final CheatManagement$AwardsToVote copy(int i10, String nom, String description, int i11) {
        e0.checkNotNullParameter(nom, "nom");
        e0.checkNotNullParameter(description, "description");
        return new CheatManagement$AwardsToVote(i10, nom, description, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheatManagement$AwardsToVote)) {
            return false;
        }
        CheatManagement$AwardsToVote cheatManagement$AwardsToVote = (CheatManagement$AwardsToVote) obj;
        return this.f21823b == cheatManagement$AwardsToVote.f21823b && e0.areEqual(this.f21824c, cheatManagement$AwardsToVote.f21824c) && e0.areEqual(this.f21825e, cheatManagement$AwardsToVote.f21825e) && this.f21826f == cheatManagement$AwardsToVote.f21826f;
    }

    public final String getDescription() {
        return this.f21825e;
    }

    public final String getNom() {
        return this.f21824c;
    }

    public final int getSessionId() {
        return this.f21826f;
    }

    public final int getType() {
        return this.f21823b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f21826f) + o2.e(o2.e(Integer.hashCode(this.f21823b) * 31, 31, this.f21824c), 31, this.f21825e);
    }

    public String toString() {
        return "AwardsToVote(type=" + this.f21823b + ", nom=" + this.f21824c + ", description=" + this.f21825e + ", sessionId=" + this.f21826f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        e0.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.f21823b);
        parcel.writeString(this.f21824c);
        parcel.writeString(this.f21825e);
        parcel.writeInt(this.f21826f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CheatManagement$AwardsToVote(Parcel parcel) {
        e0.checkNotNullParameter(parcel, "parcel");
        int i10 = parcel.readInt();
        String string = parcel.readString();
        string = string == null ? "" : string;
        String string2 = parcel.readString();
        this(i10, string, string2 != null ? string2 : "", parcel.readInt());
    }
}
