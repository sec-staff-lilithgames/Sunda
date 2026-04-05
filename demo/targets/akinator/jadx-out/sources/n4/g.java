package n4;

import androidx.datastore.preferences.protobuf.e1;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends e1 implements j {
    public g clearPreferences() {
        c();
        i.s((i) this.f5861c).clear();
        return this;
    }

    @Override // n4.j
    public boolean containsPreferences(String str) {
        str.getClass();
        return ((i) this.f5861c).getPreferencesMap().containsKey(str);
    }

    @Override // n4.j
    @Deprecated
    public Map<String, p> getPreferences() {
        return getPreferencesMap();
    }

    @Override // n4.j
    public int getPreferencesCount() {
        return ((i) this.f5861c).getPreferencesMap().size();
    }

    @Override // n4.j
    public Map<String, p> getPreferencesMap() {
        return Collections.unmodifiableMap(((i) this.f5861c).getPreferencesMap());
    }

    @Override // n4.j
    public p getPreferencesOrDefault(String str, p pVar) {
        str.getClass();
        Map<String, p> preferencesMap = ((i) this.f5861c).getPreferencesMap();
        return preferencesMap.containsKey(str) ? preferencesMap.get(str) : pVar;
    }

    @Override // n4.j
    public p getPreferencesOrThrow(String str) {
        str.getClass();
        Map<String, p> preferencesMap = ((i) this.f5861c).getPreferencesMap();
        if (preferencesMap.containsKey(str)) {
            return preferencesMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    public g putAllPreferences(Map<String, p> map) {
        c();
        i.s((i) this.f5861c).putAll(map);
        return this;
    }

    public g putPreferences(String str, p pVar) {
        str.getClass();
        pVar.getClass();
        c();
        i.s((i) this.f5861c).put(str, pVar);
        return this;
    }

    public g removePreferences(String str) {
        str.getClass();
        c();
        i.s((i) this.f5861c).remove(str);
        return this;
    }
}
