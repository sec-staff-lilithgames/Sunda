package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j extends JsonReader {

    /* renamed from: g, reason: collision with root package name */
    public static final h f29997g = new h();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f29998h = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Object[] f29999b;

    /* renamed from: c, reason: collision with root package name */
    public int f30000c;

    /* renamed from: e, reason: collision with root package name */
    public String[] f30001e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f30002f;

    public j(com.google.gson.q qVar) {
        super(f29997g);
        this.f29999b = new Object[32];
        this.f30000c = 0;
        this.f30001e = new String[32];
        this.f30002f = new int[32];
        l(qVar);
    }

    public final void a(JsonToken jsonToken) {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + d());
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        a(JsonToken.BEGIN_ARRAY);
        l(((com.google.gson.p) h()).iterator());
        this.f30002f[this.f30000c - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        a(JsonToken.BEGIN_OBJECT);
        l(((com.google.gson.t) h()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f29999b = new Object[]{f29998h};
        this.f30000c = 1;
    }

    public final String d() {
        return " at path " + getPath();
    }

    public final String e(boolean z10) {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) h()).next();
        String str = (String) entry.getKey();
        this.f30001e[this.f30000c - 1] = z10 ? "<skipped>" : str;
        l(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        a(JsonToken.END_ARRAY);
        k();
        k();
        int i10 = this.f30000c;
        if (i10 > 0) {
            int[] iArr = this.f30002f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        a(JsonToken.END_OBJECT);
        this.f30001e[this.f30000c - 1] = null;
        k();
        k();
        int i10 = this.f30000c;
        if (i10 > 0) {
            int[] iArr = this.f30002f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final String getPath(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f30000c;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f29999b;
            Object obj = objArr[i10];
            if (obj instanceof com.google.gson.p) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f30002f[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(i12);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                }
            } else if ((obj instanceof com.google.gson.t) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f30001e[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    public final Object h() {
        return this.f29999b[this.f30000c - 1];
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
    }

    public final Object k() {
        Object[] objArr = this.f29999b;
        int i10 = this.f30000c - 1;
        this.f30000c = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void l(Object obj) {
        int i10 = this.f30000c;
        Object[] objArr = this.f29999b;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f29999b = Arrays.copyOf(objArr, i11);
            this.f30002f = Arrays.copyOf(this.f30002f, i11);
            this.f30001e = (String[]) Arrays.copyOf(this.f30001e, i11);
        }
        Object[] objArr2 = this.f29999b;
        int i12 = this.f30000c;
        this.f30000c = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        a(JsonToken.BOOLEAN);
        boolean asBoolean = ((com.google.gson.v) k()).getAsBoolean();
        int i10 = this.f30000c;
        if (i10 > 0) {
            int[] iArr = this.f30002f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + d());
        }
        double asDouble = ((com.google.gson.v) h()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + asDouble);
        }
        k();
        int i10 = this.f30000c;
        if (i10 > 0) {
            int[] iArr = this.f30002f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + d());
        }
        int asInt = ((com.google.gson.v) h()).getAsInt();
        k();
        int i10 = this.f30000c;
        if (i10 > 0) {
            int[] iArr = this.f30002f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asInt;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + d());
        }
        long asLong = ((com.google.gson.v) h()).getAsLong();
        k();
        int i10 = this.f30000c;
        if (i10 > 0) {
            int[] iArr = this.f30002f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        return e(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        a(JsonToken.NULL);
        k();
        int i10 = this.f30000c;
        if (i10 > 0) {
            int[] iArr = this.f30002f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + d());
        }
        String asString = ((com.google.gson.v) k()).getAsString();
        int i10 = this.f30000c;
        if (i10 > 0) {
            int[] iArr = this.f30002f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f30000c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objH = h();
        if (objH instanceof Iterator) {
            boolean z10 = this.f29999b[this.f30000c - 2] instanceof com.google.gson.t;
            Iterator it = (Iterator) objH;
            if (!it.hasNext()) {
                return z10 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z10) {
                return JsonToken.NAME;
            }
            l(it.next());
            return peek();
        }
        if (objH instanceof com.google.gson.t) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objH instanceof com.google.gson.p) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objH instanceof com.google.gson.v) {
            com.google.gson.v vVar = (com.google.gson.v) objH;
            if (vVar.isString()) {
                return JsonToken.STRING;
            }
            if (vVar.isBoolean()) {
                return JsonToken.BOOLEAN;
            }
            if (vVar.isNumber()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (objH instanceof com.google.gson.s) {
            return JsonToken.NULL;
        }
        if (objH == f29998h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objH.getClass().getName() + " is not supported");
    }

    public void promoteNameToValue() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) h()).next();
        l(entry.getValue());
        l(new com.google.gson.v((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        int i10 = i.f29996a[peek().ordinal()];
        if (i10 == 1) {
            e(true);
            return;
        }
        if (i10 == 2) {
            endArray();
            return;
        }
        if (i10 == 3) {
            endObject();
            return;
        }
        if (i10 != 4) {
            k();
            int i11 = this.f30000c;
            if (i11 > 0) {
                int[] iArr = this.f30002f;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return j.class.getSimpleName() + d();
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}
