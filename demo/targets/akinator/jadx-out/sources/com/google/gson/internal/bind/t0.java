package com.google.gson.internal.bind;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t0 extends com.google.gson.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f30029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypeAdapters.AnonymousClass32 f30030b;

    public t0(TypeAdapters.AnonymousClass32 anonymousClass32, Class cls) {
        this.f30030b = anonymousClass32;
        this.f30029a = cls;
    }

    @Override // com.google.gson.k0
    public Object read(JsonReader jsonReader) throws IOException {
        Object obj = this.f30030b.f29982c.read(jsonReader);
        if (obj != null) {
            Class cls = this.f30029a;
            if (!cls.isInstance(obj)) {
                throw new com.google.gson.w("Expected a " + cls.getName() + " but was " + obj.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
            }
        }
        return obj;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        this.f30030b.f29982c.write(jsonWriter, obj);
    }
}
