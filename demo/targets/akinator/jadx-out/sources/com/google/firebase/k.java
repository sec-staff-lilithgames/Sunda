package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f29709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29710b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29711c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29712d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29713e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29714f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29715g;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f29710b = str;
        this.f29709a = str2;
        this.f29711c = str3;
        this.f29712d = str4;
        this.f29713e = str5;
        this.f29714f = str6;
        this.f29715g = str7;
    }

    public static k fromResource(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new k(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equal(this.f29710b, kVar.f29710b) && Objects.equal(this.f29709a, kVar.f29709a) && Objects.equal(this.f29711c, kVar.f29711c) && Objects.equal(this.f29712d, kVar.f29712d) && Objects.equal(this.f29713e, kVar.f29713e) && Objects.equal(this.f29714f, kVar.f29714f) && Objects.equal(this.f29715g, kVar.f29715g);
    }

    public String getApiKey() {
        return this.f29709a;
    }

    public String getApplicationId() {
        return this.f29710b;
    }

    public String getDatabaseUrl() {
        return this.f29711c;
    }

    public String getGaTrackingId() {
        return this.f29712d;
    }

    public String getGcmSenderId() {
        return this.f29713e;
    }

    public String getProjectId() {
        return this.f29715g;
    }

    public String getStorageBucket() {
        return this.f29714f;
    }

    public int hashCode() {
        return Objects.hashCode(this.f29710b, this.f29709a, this.f29711c, this.f29712d, this.f29713e, this.f29714f, this.f29715g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f29710b).add(DTBMetricsConfiguration.APSMETRICS_APIKEY, this.f29709a).add("databaseUrl", this.f29711c).add("gcmSenderId", this.f29713e).add("storageBucket", this.f29714f).add("projectId", this.f29715g).toString();
    }
}
