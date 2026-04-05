package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MapTypeAdapterFactory implements com.google.gson.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final mk.b f29936b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29937c;

    public MapTypeAdapterFactory(mk.b bVar, boolean z10) {
        this.f29936b = bVar;
        this.f29937c = z10;
    }

    @Override // com.google.gson.l0
    public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] mapKeyAndValueTypes = mk.g.getMapKeyAndValueTypes(type, rawType);
        Type type2 = mapKeyAndValueTypes[0];
        Type type3 = mapKeyAndValueTypes[1];
        return new m(this, new y(gson, (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f29947c : gson.getAdapter(pk.a.get(type2)), type2), new y(gson, gson.getAdapter(pk.a.get(type3)), type3), this.f29936b.get(aVar, false));
    }
}
