package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.digidust.elokence.akinator.freemium.R;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new k();

    /* renamed from: b, reason: collision with root package name */
    public final h f29558b;

    /* renamed from: c, reason: collision with root package name */
    public final h f29559c;

    /* renamed from: e, reason: collision with root package name */
    public final int f29560e;

    /* renamed from: f, reason: collision with root package name */
    public int f29561f;

    /* renamed from: g, reason: collision with root package name */
    public int f29562g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29563h;

    /* renamed from: i, reason: collision with root package name */
    public int f29564i;

    public TimeModel() {
        this(0);
    }

    public static String formatText(Resources resources, CharSequence charSequence) {
        return formatText(resources, charSequence, "%02d");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f29561f == timeModel.f29561f && this.f29562g == timeModel.f29562g && this.f29560e == timeModel.f29560e && this.f29563h == timeModel.f29563h;
    }

    public int getHourContentDescriptionResId() {
        return this.f29560e == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
    }

    public int getHourForDisplay() {
        if (this.f29560e == 1) {
            return this.f29561f % 24;
        }
        int i10 = this.f29561f;
        if (i10 % 12 == 0) {
            return 12;
        }
        return this.f29564i == 1 ? i10 - 12 : i10;
    }

    public h getHourInputValidator() {
        return this.f29559c;
    }

    public h getMinuteInputValidator() {
        return this.f29558b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29560e), Integer.valueOf(this.f29561f), Integer.valueOf(this.f29562g), Integer.valueOf(this.f29563h)});
    }

    public void setHour(int i10) {
        if (this.f29560e == 1) {
            this.f29561f = i10;
        } else {
            this.f29561f = (i10 % 12) + (this.f29564i != 1 ? 0 : 12);
        }
    }

    public void setHourOfDay(int i10) {
        this.f29564i = i10 >= 12 ? 1 : 0;
        this.f29561f = i10;
    }

    public void setMinute(int i10) {
        this.f29562g = i10 % 60;
    }

    public void setPeriod(int i10) {
        if (i10 != this.f29564i) {
            this.f29564i = i10;
            int i11 = this.f29561f;
            if (i11 < 12 && i10 == 1) {
                this.f29561f = i11 + 12;
            } else {
                if (i11 < 12 || i10 != 0) {
                    return;
                }
                this.f29561f = i11 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f29561f);
        parcel.writeInt(this.f29562g);
        parcel.writeInt(this.f29563h);
        parcel.writeInt(this.f29560e);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    public static String formatText(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f29561f = i10;
        this.f29562g = i11;
        this.f29563h = i12;
        this.f29560e = i13;
        this.f29564i = i10 >= 12 ? 1 : 0;
        this.f29558b = new h(59);
        this.f29559c = new h(i13 == 1 ? 23 : 12);
    }
}
