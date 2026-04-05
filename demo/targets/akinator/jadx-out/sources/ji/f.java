package ji;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f69585a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f69586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69587c;

    public f(int i10, int i11) {
        this.f69586b = i10;
        this.f69587c = i11;
    }

    public static String sanitizeString(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    public synchronized Map<String, String> getKeys() {
        return Collections.unmodifiableMap(new HashMap(this.f69585a));
    }

    public synchronized boolean setKey(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String strSanitizeString = sanitizeString(str, this.f69587c);
        if (this.f69585a.size() >= this.f69586b && !this.f69585a.containsKey(strSanitizeString)) {
            ei.f.getLogger().w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f69586b);
            return false;
        }
        String strSanitizeString2 = sanitizeString(str2, this.f69587c);
        if (hi.j.nullSafeEquals((String) this.f69585a.get(strSanitizeString), strSanitizeString2)) {
            return false;
        }
        HashMap map = this.f69585a;
        if (str2 == null) {
            strSanitizeString2 = "";
        }
        map.put(strSanitizeString, strSanitizeString2);
        return true;
    }

    public synchronized void setKeys(Map<String, String> map) {
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strSanitizeString = sanitizeString(key, this.f69587c);
                if (this.f69585a.size() < this.f69586b || this.f69585a.containsKey(strSanitizeString)) {
                    String value = entry.getValue();
                    this.f69585a.put(strSanitizeString, value == null ? "" : sanitizeString(value, this.f69587c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                ei.f.getLogger().w("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f69586b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
