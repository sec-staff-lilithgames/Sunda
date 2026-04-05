package kotlinx.serialization.json.internal;

import cv.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WriteMode {
    private static final /* synthetic */ cv.a $ENTRIES;
    private static final /* synthetic */ WriteMode[] $VALUES;
    public final char begin;
    public final char end;
    public static final WriteMode OBJ = new WriteMode("OBJ", 0, AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.END_OBJ);
    public static final WriteMode LIST = new WriteMode("LIST", 1, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST);
    public static final WriteMode MAP = new WriteMode("MAP", 2, AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.END_OBJ);
    public static final WriteMode POLY_OBJ = new WriteMode("POLY_OBJ", 3, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST);

    private static final /* synthetic */ WriteMode[] $values() {
        return new WriteMode[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    static {
        WriteMode[] writeModeArr$values = $values();
        $VALUES = writeModeArr$values;
        $ENTRIES = b.enumEntries(writeModeArr$values);
    }

    private WriteMode(String str, int i10, char c10, char c11) {
        this.begin = c10;
        this.end = c11;
    }

    public static cv.a getEntries() {
        return $ENTRIES;
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) $VALUES.clone();
    }
}
