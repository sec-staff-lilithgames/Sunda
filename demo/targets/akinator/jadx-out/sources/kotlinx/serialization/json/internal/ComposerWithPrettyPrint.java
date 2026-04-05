package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.Json;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ComposerWithPrettyPrint extends Composer {
    private final Json json;
    private int level;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerWithPrettyPrint(InternalJsonWriter writer, Json json) {
        super(writer);
        e0.checkNotNullParameter(writer, "writer");
        e0.checkNotNullParameter(json, "json");
        this.json = json;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void indent() {
        setWritingFirst(true);
        this.level++;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void nextItem() {
        setWritingFirst(false);
        print("\n");
        int i10 = this.level;
        for (int i11 = 0; i11 < i10; i11++) {
            print(this.json.getConfiguration().getPrettyPrintIndent());
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void nextItemIfNotFirst() {
        if (getWritingFirst()) {
            setWritingFirst(false);
        } else {
            nextItem();
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void space() {
        print(' ');
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void unIndent() {
        this.level--;
    }
}
