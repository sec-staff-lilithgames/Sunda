package j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f68458a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract void I(DataOutput dataOutput);

    public abstract String k();

    public abstract j$.time.zone.f r();

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i10 = 0; i10 < 28; i10++) {
            Map.Entry entry = entryArr[i10];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        f68458a = Collections.unmodifiableMap(map);
    }

    public static ZoneId systemDefault() {
        String id2 = TimeZone.getDefault().getID();
        Map map = f68458a;
        Objects.requireNonNull(id2, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id2);
        if (str != null) {
            id2 = str;
        }
        return t(id2, true);
    }

    public static ZoneId D(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.f68463b != 0) {
            str = str.concat(zoneOffset.f68464c);
        }
        return new x(str, new j$.time.zone.f(zoneOffset));
    }

    public static ZoneId t(String str, boolean z10) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.J(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return G(str, 3, z10);
        }
        if (str.startsWith("UT")) {
            return G(str, 2, z10);
        }
        return x.J(str, z10);
    }

    public static ZoneId G(String str, int i10, boolean z10) {
        String strSubstring = str.substring(0, i10);
        if (str.length() == i10) {
            return D(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return x.J(str, z10);
        }
        try {
            ZoneOffset zoneOffsetJ = ZoneOffset.J(str.substring(i10));
            if (zoneOffsetJ == ZoneOffset.UTC) {
                return D(strSubstring, zoneOffsetJ);
            }
            return D(strSubstring, zoneOffsetJ);
        } catch (c e10) {
            throw new c("Invalid ID for offset-based ZoneId: ".concat(str), e10);
        }
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != x.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return k().equals(((ZoneId) obj).k());
        }
        return false;
    }

    public int hashCode() {
        return k().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return k();
    }

    private Object writeReplace() {
        return new s((byte) 7, this);
    }
}
