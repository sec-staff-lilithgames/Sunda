package com.bytedance.sdk.openadsdk.tu;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: jd, reason: collision with root package name */
    private final Context f21491jd;
    private SharedPreferences jpo;
    private final String wqx;

    public jd(Context context, String str) {
        this.f21491jd = context;
        this.wqx = str;
    }

    private SharedPreferences jd() {
        Context context;
        SharedPreferences sharedPreferences = this.jpo;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.wqx) || (context = this.f21491jd) == null) {
            return null;
        }
        try {
            this.jpo = context.getSharedPreferences(this.wqx, 0);
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
        return this.jpo;
    }

    public void jpo(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesJd = jd();
            if (sharedPreferencesJd != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesJd.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                editorEdit.putFloat(next, ((Double) obj).floatValue());
                            }
                        }
                    } catch (Throwable th2) {
                        Log.e("SPUnit", th2.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th3) {
            Log.e("SPUnit", th3.getMessage());
        }
    }

    public long jd(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesJd = jd();
            if (sharedPreferencesJd != null && sharedPreferencesJd.contains(str)) {
                return sharedPreferencesJd.getLong(str, j10);
            }
            return j10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.wqx + th2.getMessage());
            return j10;
        }
    }

    public void jpo(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesJd = jd();
            if (sharedPreferencesJd != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesJd.edit();
                editorEdit.putLong(str, j10);
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public int jpo(String str, int i10) {
        try {
            SharedPreferences sharedPreferencesJd = jd();
            if (sharedPreferencesJd != null && sharedPreferencesJd.contains(str)) {
                return sharedPreferencesJd.getInt(str, i10);
            }
            return i10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.wqx + th2.getMessage());
            return i10;
        }
    }

    public String jpo(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesJd = jd();
            if (sharedPreferencesJd != null && sharedPreferencesJd.contains(str)) {
                return sharedPreferencesJd.getString(str, str2);
            }
            return str2;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.wqx + th2.getMessage());
            return str2;
        }
    }

    public boolean jpo(String str, boolean z10) {
        try {
            SharedPreferences sharedPreferencesJd = jd();
            if (sharedPreferencesJd != null && sharedPreferencesJd.contains(str)) {
                return sharedPreferencesJd.getBoolean(str, z10);
            }
            return z10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.wqx + th2.getMessage());
            return z10;
        }
    }

    public void jpo() {
        SharedPreferences sharedPreferencesJd = jd();
        if (sharedPreferencesJd != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesJd.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
