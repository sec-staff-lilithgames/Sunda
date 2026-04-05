package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class JsonIteratorWsSeparated<T> implements Iterator<T>, lv.a {
    private final DeserializationStrategy<T> deserializer;
    private final Json json;
    private final ReaderJsonLexer lexer;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonIteratorWsSeparated(Json json, ReaderJsonLexer lexer, DeserializationStrategy<? extends T> deserializer) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(lexer, "lexer");
        e0.checkNotNullParameter(deserializer, "deserializer");
        this.json = json;
        this.lexer = lexer;
        this.deserializer = deserializer;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.lexer.isNotEof();
    }

    @Override // java.util.Iterator
    public T next() {
        return (T) new StreamingJsonDecoder(this.json, WriteMode.OBJ, this.lexer, this.deserializer.getDescriptor(), null).decodeSerializableValue(this.deserializer);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
