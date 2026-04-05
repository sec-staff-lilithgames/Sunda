package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f29906a;

    public z(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f29906a = new Bundle(bundle);
    }

    public static String b(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final int[] a() throws JSONException {
        JSONArray jSONArray = getJSONArray("gcm.n.light_settings");
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArray.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArray.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArray.optInt(1);
            iArr[2] = jSONArray.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray + ". Skipping setting LightSettings");
            return null;
        }
    }

    public boolean getBoolean(String str) {
        String string = getString(str);
        return "1".equals(string) || Boolean.parseBoolean(string);
    }

    public Integer getInteger(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(string));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + b(str) + "(" + string + ") into an int");
            return null;
        }
    }

    public JSONArray getJSONArray(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + b(str) + ": " + string + ", falling back to default");
            return null;
        }
    }

    public Uri getLink() {
        String string = getString("gcm.n.link_android");
        if (TextUtils.isEmpty(string)) {
            string = getString("gcm.n.link");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Uri.parse(string);
    }

    public Object[] getLocalizationArgsForKey(String str) {
        JSONArray jSONArray = getJSONArray(str + "_loc_args");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArray.optString(i10);
        }
        return strArr;
    }

    public String getLocalizationResourceForKey(String str) {
        return getString(str + "_loc_key");
    }

    public String getLocalizedString(Resources resources, String str, String str2) {
        String localizationResourceForKey = getLocalizationResourceForKey(str2);
        if (TextUtils.isEmpty(localizationResourceForKey)) {
            return null;
        }
        int identifier = resources.getIdentifier(localizationResourceForKey, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", b(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] localizationArgsForKey = getLocalizationArgsForKey(str2);
        if (localizationArgsForKey == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, localizationArgsForKey);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + b(str2) + ": " + Arrays.toString(localizationArgsForKey) + " Default value will be used.", e10);
            return null;
        }
    }

    public Long getLong(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(string));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + b(str) + "(" + string + ") into a long");
            return null;
        }
    }

    public String getNotificationChannelId() {
        return getString("gcm.n.android_channel_id");
    }

    public String getPossiblyLocalizedString(Resources resources, String str, String str2) {
        String string = getString(str2);
        return !TextUtils.isEmpty(string) ? string : getLocalizedString(resources, str, str2);
    }

    public String getSoundResourceName() {
        String string = getString("gcm.n.sound2");
        return TextUtils.isEmpty(string) ? getString("gcm.n.sound") : string;
    }

    public String getString(String str) {
        Bundle bundle = this.f29906a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] getVibrateTimings() throws JSONException {
        JSONArray jSONArray = getJSONArray("gcm.n.vibrate_timings");
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArray.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArray.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArray + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public boolean hasImage() {
        return !TextUtils.isEmpty(getString("gcm.n.image"));
    }

    public boolean isNotification() {
        return getBoolean("gcm.n.e");
    }

    public Bundle paramsForAnalyticsIntent() {
        Bundle bundle = this.f29906a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public Bundle paramsWithReservedKeysRemoved() {
        Bundle bundle = this.f29906a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public static boolean isNotification(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }
}
