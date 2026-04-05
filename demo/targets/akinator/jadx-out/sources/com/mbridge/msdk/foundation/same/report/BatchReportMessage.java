package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f40892a;

    /* renamed from: b, reason: collision with root package name */
    private long f40893b;

    /* renamed from: c, reason: collision with root package name */
    private String f40894c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<BatchReportMessage> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i10) {
            return new BatchReportMessage[i10];
        }
    }

    public BatchReportMessage(String str, String str2, long j10) {
        this.f40894c = str;
        this.f40892a = str2;
        this.f40893b = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f40892a;
    }

    public long getTimestamp() {
        return this.f40893b;
    }

    public String getUuid() {
        return this.f40894c;
    }

    public void setReportMessage(String str) {
        this.f40892a = str;
    }

    public void setTimestamp(long j10) {
        this.f40893b = j10;
    }

    public void setUuid(String str) {
        this.f40894c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f40894c);
        parcel.writeString(this.f40892a);
        parcel.writeLong(this.f40893b);
    }

    public BatchReportMessage(Parcel parcel) {
        this.f40894c = parcel.readString();
        this.f40892a = parcel.readString();
        this.f40893b = parcel.readLong();
    }
}
