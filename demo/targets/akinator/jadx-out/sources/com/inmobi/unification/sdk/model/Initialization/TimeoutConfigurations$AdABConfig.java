package com.inmobi.unification.sdk.model.Initialization;

import com.inmobi.media.Me;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TimeoutConfigurations$AdABConfig {
    private JSONObject loadRetryInterval;
    private JSONObject loadTimeout;
    private JSONObject maxLoadRetries;

    public TimeoutConfigurations$AdABConfig() {
        this.loadTimeout = new JSONObject();
        this.loadRetryInterval = new JSONObject();
        this.maxLoadRetries = new JSONObject();
    }

    public final JSONObject getLoadTimeout() {
        return this.loadTimeout;
    }

    public final JSONObject getMaxRetries() {
        return this.maxLoadRetries;
    }

    public final JSONObject getRetryInterval() {
        return this.loadRetryInterval;
    }

    public final boolean isValid() {
        Me.Companion.getClass();
        return ((Boolean) Me.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) Me.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) Me.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeoutConfigurations$AdABConfig(JSONObject loadTimeout, JSONObject retryInterval, JSONObject maxRetries) {
        this();
        e0.checkNotNullParameter(loadTimeout, "loadTimeout");
        e0.checkNotNullParameter(retryInterval, "retryInterval");
        e0.checkNotNullParameter(maxRetries, "maxRetries");
        this.loadTimeout = loadTimeout;
        this.loadRetryInterval = retryInterval;
        this.maxLoadRetries = maxRetries;
    }
}
