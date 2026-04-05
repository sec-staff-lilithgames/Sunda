package com.google.android.ump;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class ConsentDebugSettings {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29631b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: b, reason: collision with root package name */
        public final Context f29633b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f29635d;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f29632a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f29634c = 0;

        public Builder(Context context) {
            this.f29633b = context.getApplicationContext();
        }

        public Builder addTestDeviceHashedId(String str) {
            this.f29632a.add(str);
            return this;
        }

        public ConsentDebugSettings build() {
            boolean z10 = true;
            if (!zzcu.zza(true)) {
                if (!this.f29632a.contains(zzcm.zza(this.f29633b)) && !this.f29635d) {
                    z10 = false;
                }
            }
            return new ConsentDebugSettings(z10, this);
        }

        public Builder setDebugGeography(int i10) {
            this.f29634c = i10;
            return this;
        }

        public Builder setForceTesting(boolean z10) {
            this.f29635d = z10;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder) {
        this.f29630a = z10;
        this.f29631b = builder.f29634c;
    }

    public int getDebugGeography() {
        return this.f29631b;
    }

    public boolean isTestDevice() {
        return this.f29630a;
    }
}
