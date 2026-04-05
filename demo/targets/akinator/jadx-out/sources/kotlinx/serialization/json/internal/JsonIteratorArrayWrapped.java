package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class JsonIteratorArrayWrapped<T> implements Iterator<T>, lv.a {
    private final DeserializationStrategy<T> deserializer;
    private boolean finished;
    private boolean first;
    private final Json json;
    private final ReaderJsonLexer lexer;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonIteratorArrayWrapped(Json json, ReaderJsonLexer lexer, DeserializationStrategy<? extends T> deserializer) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(lexer, "lexer");
        e0.checkNotNullParameter(deserializer, "deserializer");
        this.json = json;
        this.lexer = lexer;
        this.deserializer = deserializer;
        this.first = true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.finished) {
            return false;
        }
        if (this.lexer.peekNextToken() != 9) {
            if (this.lexer.isNotEof() || this.finished) {
                return true;
            }
            AbstractJsonLexer.fail$kotlinx_serialization_json$default(this.lexer, (byte) 9, false, 2, null);
            throw new k();
        }
        this.finished = true;
        this.lexer.consumeNextToken((byte) 9);
        if (this.lexer.isNotEof()) {
            if (this.lexer.peekNextToken() == 8) {
                AbstractJsonLexer.fail$default(this.lexer, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                throw new k();
            }
            this.lexer.expectEof();
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.first) {
            this.first = false;
        } else {
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COMMA);
        }
        return (T) new StreamingJsonDecoder(this.json, WriteMode.OBJ, this.lexer, this.deserializer.getDescriptor(), null).decodeSerializableValue(this.deserializer);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
