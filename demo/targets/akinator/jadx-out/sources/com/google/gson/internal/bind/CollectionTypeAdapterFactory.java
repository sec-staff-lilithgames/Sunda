package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CollectionTypeAdapterFactory implements com.google.gson.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final mk.b f29932b;

    public CollectionTypeAdapterFactory(mk.b bVar) {
        this.f29932b = bVar;
    }

    @Override // com.google.gson.l0
    public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type collectionElementType = mk.g.getCollectionElementType(type, rawType);
        return new a(new y(gson, gson.getAdapter(pk.a.get(collectionElementType)), collectionElementType), this.f29932b.get(aVar, false));
    }
}
