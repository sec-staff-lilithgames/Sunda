package com.google.android.gms.internal.ads;

import com.ironsource.G5;
import io.ktor.http.ContentDisposition;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzgph<K, V> implements Map<K, V>, Serializable {
    private transient zzgpo zza;
    private transient zzgpo zzb;
    private transient zzgpa zzc;

    public static zzgph zza() {
        return zzgre.zza;
    }

    public static zzgph zzb(Object obj, Object obj2) {
        zzgoc.zza("dialog_not_shown_reason", obj2);
        return zzgre.zzk(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgph zzc(Map map) {
        if ((map instanceof zzgph) && !(map instanceof SortedMap)) {
            zzgph zzgphVar = (zzgph) map;
            zzgphVar.zzj();
            return zzgphVar;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzgpg zzgpgVar = new zzgpg(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzgpgVar.zzb(setEntrySet);
        return zzgpgVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgql.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgro.zzc(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzgoc.zzb(size, ContentDisposition.Parameters.Size);
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append(G5.T);
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    @Override // java.util.Map
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgpo entrySet() {
        zzgpo zzgpoVar = this.zza;
        if (zzgpoVar != null) {
            return zzgpoVar;
        }
        zzgpo zzgpoVarZze = zze();
        this.zza = zzgpoVarZze;
        return zzgpoVarZze;
    }

    public abstract zzgpo zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgpo keySet() {
        zzgpo zzgpoVar = this.zzb;
        if (zzgpoVar != null) {
            return zzgpoVar;
        }
        zzgpo zzgpoVarZzg = zzg();
        this.zzb = zzgpoVarZzg;
        return zzgpoVarZzg;
    }

    public abstract zzgpo zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgpa values() {
        zzgpa zzgpaVar = this.zzc;
        if (zzgpaVar != null) {
            return zzgpaVar;
        }
        zzgpa zzgpaVarZzi = zzi();
        this.zzc = zzgpaVarZzi;
        return zzgpaVarZzi;
    }

    public abstract zzgpa zzi();

    public abstract boolean zzj();
}
