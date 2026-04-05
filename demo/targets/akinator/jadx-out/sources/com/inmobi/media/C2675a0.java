package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.a0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2675a0 implements Parcelable {
    public static final Parcelable.Creator<C2675a0> CREATOR = new Z();

    /* renamed from: a, reason: collision with root package name */
    public final long f32611a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32612b;

    /* renamed from: c, reason: collision with root package name */
    public Map f32613c;

    /* renamed from: d, reason: collision with root package name */
    public String f32614d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32615e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32616f;

    /* renamed from: g, reason: collision with root package name */
    public String f32617g;

    /* renamed from: h, reason: collision with root package name */
    public String f32618h;

    /* renamed from: i, reason: collision with root package name */
    public String f32619i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32620j;

    /* renamed from: k, reason: collision with root package name */
    public String f32621k;

    public C2675a0(long j10, String str, String str2, String str3, kotlin.jvm.internal.u uVar) {
        this.f32618h = "";
        this.f32619i = "activity";
        this.f32611a = j10;
        this.f32612b = str;
        this.f32615e = str2;
        this.f32612b = str == null ? "" : str;
        this.f32616f = str3;
    }

    public static /* synthetic */ void c() {
    }

    public final String d() {
        String str = this.f32617g;
        kotlin.jvm.internal.e0.checkNotNull(str);
        return str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f32621k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2675a0)) {
            return false;
        }
        C2675a0 c2675a0 = (C2675a0) obj;
        return this.f32611a == c2675a0.f32611a && kotlin.jvm.internal.e0.areEqual(this.f32619i, c2675a0.f32619i) && kotlin.jvm.internal.e0.areEqual(this.f32612b, c2675a0.f32612b) && kotlin.jvm.internal.e0.areEqual(this.f32615e, c2675a0.f32615e);
    }

    public final Map<String, String> f() {
        return this.f32613c;
    }

    public final long g() {
        return this.f32611a;
    }

    public final String h() {
        return "im";
    }

    public int hashCode() {
        long j10 = this.f32611a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f32615e;
        return this.f32619i.hashCode() + ((i10 + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String i() {
        return this.f32614d;
    }

    public final String j() {
        return this.f32619i;
    }

    public final long l() {
        return this.f32611a;
    }

    public final String m() {
        return this.f32616f;
    }

    public final String o() {
        return this.f32612b;
    }

    public final boolean p() {
        return this.f32620j;
    }

    public String toString() {
        return String.valueOf(this.f32611a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f32611a);
        dest.writeString(this.f32619i);
        dest.writeString(this.f32615e);
    }

    public final String b() {
        return this.f32615e;
    }

    public final void a(Map<String, String> map) {
        this.f32613c = map;
    }

    public final void b(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f32619i = str;
    }

    public final String a() {
        return this.f32618h;
    }

    public final void a(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f32618h = str;
    }

    public C2675a0(Parcel parcel, kotlin.jvm.internal.u uVar) {
        this.f32618h = "";
        String str = "activity";
        this.f32619i = "activity";
        this.f32611a = parcel.readLong();
        String string = parcel.readString();
        if (string != null && !kotlin.jvm.internal.e0.areEqual(string, "activity") && kotlin.jvm.internal.e0.areEqual(string, "others")) {
            str = "others";
        }
        this.f32619i = str;
        this.f32615e = parcel.readString();
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void n() {
    }
}
