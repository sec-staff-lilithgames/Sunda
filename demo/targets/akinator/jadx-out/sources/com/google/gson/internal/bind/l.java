package com.google.gson.internal.bind;

import com.google.gson.stream.JsonWriter;
import j1.o2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class l extends JsonWriter {

    /* renamed from: f, reason: collision with root package name */
    public static final k f30003f = new k();

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.gson.v f30004g = new com.google.gson.v("closed");

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30005b;

    /* renamed from: c, reason: collision with root package name */
    public String f30006c;

    /* renamed from: e, reason: collision with root package name */
    public com.google.gson.q f30007e;

    public l() {
        super(f30003f);
        this.f30005b = new ArrayList();
        this.f30007e = com.google.gson.s.f30067b;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        com.google.gson.p pVar = new com.google.gson.p();
        e(pVar);
        this.f30005b.add(pVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        com.google.gson.t tVar = new com.google.gson.t();
        e(tVar);
        this.f30005b.add(tVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ArrayList arrayList = this.f30005b;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f30004g);
    }

    public final com.google.gson.q d() {
        return (com.google.gson.q) o2.e(1, this.f30005b);
    }

    public final void e(com.google.gson.q qVar) {
        if (this.f30006c != null) {
            if (!qVar.isJsonNull() || getSerializeNulls()) {
                ((com.google.gson.t) d()).add(this.f30006c, qVar);
            }
            this.f30006c = null;
            return;
        }
        if (this.f30005b.isEmpty()) {
            this.f30007e = qVar;
            return;
        }
        com.google.gson.q qVarD = d();
        if (!(qVarD instanceof com.google.gson.p)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.p) qVarD).add(qVar);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        ArrayList arrayList = this.f30005b;
        if (arrayList.isEmpty() || this.f30006c != null) {
            throw new IllegalStateException();
        }
        if (!(d() instanceof com.google.gson.p)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        ArrayList arrayList = this.f30005b;
        if (arrayList.isEmpty() || this.f30006c != null) {
            throw new IllegalStateException();
        }
        if (!(d() instanceof com.google.gson.t)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
        return this;
    }

    public com.google.gson.q get() {
        ArrayList arrayList = this.f30005b;
        if (arrayList.isEmpty()) {
            return this.f30007e;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f30005b.isEmpty() || this.f30006c != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(d() instanceof com.google.gson.t)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f30006c = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        e(com.google.gson.s.f30067b);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        e(new com.google.gson.v(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z10) throws IOException {
        e(new com.google.gson.v(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        e(new com.google.gson.v(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(float f10) throws IOException {
        if (!isLenient() && (Float.isNaN(f10) || Float.isInfinite(f10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f10);
        }
        e(new com.google.gson.v(Float.valueOf(f10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d10) throws IOException {
        if (!isLenient() && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        e(new com.google.gson.v(Double.valueOf(d10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j10) throws IOException {
        e(new com.google.gson.v(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        e(new com.google.gson.v(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }
}
