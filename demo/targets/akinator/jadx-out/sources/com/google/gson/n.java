package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f30064a;

    public n(k0 k0Var) {
        this.f30064a = k0Var;
    }

    @Override // com.google.gson.k0
    public AtomicLong read(JsonReader jsonReader) throws IOException {
        return new AtomicLong(((Number) this.f30064a.read(jsonReader)).longValue());
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
        this.f30064a.write(jsonWriter, Long.valueOf(atomicLong.get()));
    }
}
