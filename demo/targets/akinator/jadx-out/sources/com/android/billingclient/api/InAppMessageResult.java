package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class InAppMessageResult {

    /* renamed from: a, reason: collision with root package name */
    public final int f12611a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12612b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i10, String str) {
        this.f12611a = i10;
        this.f12612b = str;
    }

    public String getPurchaseToken() {
        return this.f12612b;
    }

    public int getResponseCode() {
        return this.f12611a;
    }
}
