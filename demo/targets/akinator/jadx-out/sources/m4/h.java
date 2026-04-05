package m4;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import uu.o1;
import uu.y0;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f74025a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f74026b;

    public h(SharedPreferences prefs, Set<String> set) {
        e0.checkNotNullParameter(prefs, "prefs");
        this.f74025a = prefs;
        this.f74026b = set;
    }

    public static /* synthetic */ String getString$default(h hVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return hVar.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(h hVar, String str, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        return hVar.getStringSet(str, set);
    }

    public final void a(String str) {
        Set set = this.f74026b;
        if (set != null && !set.contains(str)) {
            throw new IllegalStateException(a.b.k("Can't access key outside migration: ", str).toString());
        }
    }

    public final boolean contains(String key) {
        e0.checkNotNullParameter(key, "key");
        a(key);
        return this.f74025a.contains(key);
    }

    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.f74025a.getAll();
        e0.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.f74026b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(o1.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = y0.toSet((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final float getFloat(String key, float f10) {
        e0.checkNotNullParameter(key, "key");
        a(key);
        return this.f74025a.getFloat(key, f10);
    }

    public final int getInt(String key, int i10) {
        e0.checkNotNullParameter(key, "key");
        a(key);
        return this.f74025a.getInt(key, i10);
    }

    public final long getLong(String key, long j10) {
        e0.checkNotNullParameter(key, "key");
        a(key);
        return this.f74025a.getLong(key, j10);
    }

    public final String getString(String key, String str) {
        e0.checkNotNullParameter(key, "key");
        a(key);
        return this.f74025a.getString(key, str);
    }

    public final Set<String> getStringSet(String key, Set<String> set) {
        e0.checkNotNullParameter(key, "key");
        a(key);
        Set<String> stringSet = this.f74025a.getStringSet(key, set);
        if (stringSet != null) {
            return y0.toMutableSet(stringSet);
        }
        return null;
    }

    public final boolean getBoolean(String str, boolean z10) {
        e0.checkNotNullParameter(str, VPCjETNfjxu.LOQf);
        a(str);
        return this.f74025a.getBoolean(str, z10);
    }
}
