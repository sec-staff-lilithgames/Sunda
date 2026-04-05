package com.amazon.aps.shared.analytics;

import a.b;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.util.APSSharedUtil;
import e3.g;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class APSEvent implements Serializable {
    public static final int EXCEPTION_LOG_SIZE = 2048;
    String deviceManufacturer;
    String deviceModel;
    String eventType;
    String osName;
    int osVersion;
    String pkgName;
    String sdkVersion;
    APSEventSeverity severity;
    long timestamp;
    String configVersion = "";
    String errorDetails = "";
    String exceptionLog = "";

    public APSEvent(Context context, APSEventSeverity aPSEventSeverity, String str) {
        this.sdkVersion = null;
        this.pkgName = "";
        this.osName = "";
        this.deviceManufacturer = "";
        this.deviceModel = "";
        try {
            this.sdkVersion = APSAnalytics.getVersion();
            String adapterVersion = APSAnalytics.getAdapterVersion();
            if (adapterVersion != null) {
                this.sdkVersion += "_" + adapterVersion;
            }
            this.osName = "Android";
            this.osVersion = Build.VERSION.SDK_INT;
            this.deviceManufacturer = Build.MANUFACTURER;
            this.deviceModel = Build.MODEL;
            this.timestamp = System.currentTimeMillis();
            this.pkgName = context == null ? "unknown" : context.getPackageName();
            setEventSeverity(aPSEventSeverity);
            setEventType(str);
        } catch (RuntimeException e10) {
            Log.e("APSEvent", "Error constructing the APSEvent:", e10);
        }
    }

    public APSEventSeverity getEventSeverity() {
        return this.severity;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getExceptionDetails() {
        return this.exceptionLog;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isValidEvent() {
        return this.eventType != null;
    }

    public APSEvent setConfigVersion(String str) {
        this.configVersion = str;
        return this;
    }

    public APSEvent setErrorDetails(String str) {
        if (str != null) {
            int length = str.length();
            if (length > 2048) {
                length = 2048;
            }
            this.errorDetails = str.substring(0, length);
        }
        return this;
    }

    public APSEvent setEventSeverity(APSEventSeverity aPSEventSeverity) {
        this.severity = aPSEventSeverity;
        return this;
    }

    public APSEvent setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public APSEvent setExceptionDetails(Exception exc) {
        if (exc != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                if (string.length() <= 2048) {
                    this.exceptionLog = exc.getMessage() + "\n" + string;
                    return this;
                }
                int length = (2042 - exc.getMessage().length()) / 2;
                this.exceptionLog = exc.getMessage() + APSSharedUtil.TRUNCATE_SEPARATOR + string.substring(0, length) + APSSharedUtil.TRUNCATE_SEPARATOR + string.substring(string.length() - length);
                return this;
            } catch (RuntimeException e10) {
                Log.e("APSEvent", "Error in parsing the exception detail; ", e10);
            }
        }
        return this;
    }

    public APSEvent setTimestamp(long j10) {
        this.timestamp = j10;
        return this;
    }

    public String toJsonPayload() throws JSONException {
        String strReplace = "";
        String strL = b.l("msg = ", this.errorDetails, ";");
        String additionalDetails = APSAnalytics.getAdditionalDetails();
        if (!APSSharedUtil.isNullOrEmpty(additionalDetails)) {
            strL = strL.concat(additionalDetails);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", this.sdkVersion);
            jSONObject.put("eventType", this.eventType);
            jSONObject.put("eventTimestamp", this.timestamp);
            jSONObject.put("severity", this.severity.name());
            jSONObject.put("appId", this.pkgName);
            jSONObject.put("osName", this.osName);
            jSONObject.put("osVersion", this.osVersion);
            jSONObject.put("deviceManufacturer", this.deviceManufacturer);
            jSONObject.put("deviceModel", this.deviceModel);
            jSONObject.put("configVersion", this.configVersion);
            jSONObject.put("otherDetails", strL);
            jSONObject.put("exceptionDetails", this.exceptionLog);
            strReplace = Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace("\n", "");
        } catch (RuntimeException | JSONException e10) {
            Log.e("APSEvent", "Error in parsing the json .. ignoring : ", e10);
        }
        return b.g(this.timestamp, "\"}", g.o("{\"Data\": \"", strReplace, "\",\"PartitionKey\": \""));
    }

    public APSEvent setExceptionDetails(String str) {
        this.exceptionLog = str.substring(0, 2048 > str.length() ? str.length() : 2048);
        return this;
    }

    public APSEvent build() {
        return this;
    }
}
