package kotlinx.serialization.json;

import cv.a;
import cv.b;
import kotlinx.serialization.ExperimentalSerializationApi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class DecodeSequenceMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DecodeSequenceMode[] $VALUES;
    public static final DecodeSequenceMode WHITESPACE_SEPARATED = new DecodeSequenceMode("WHITESPACE_SEPARATED", 0);
    public static final DecodeSequenceMode ARRAY_WRAPPED = new DecodeSequenceMode("ARRAY_WRAPPED", 1);
    public static final DecodeSequenceMode AUTO_DETECT = new DecodeSequenceMode("AUTO_DETECT", 2);

    private static final /* synthetic */ DecodeSequenceMode[] $values() {
        return new DecodeSequenceMode[]{WHITESPACE_SEPARATED, ARRAY_WRAPPED, AUTO_DETECT};
    }

    static {
        DecodeSequenceMode[] decodeSequenceModeArr$values = $values();
        $VALUES = decodeSequenceModeArr$values;
        $ENTRIES = b.enumEntries(decodeSequenceModeArr$values);
    }

    private DecodeSequenceMode(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static DecodeSequenceMode valueOf(String str) {
        return (DecodeSequenceMode) Enum.valueOf(DecodeSequenceMode.class, str);
    }

    public static DecodeSequenceMode[] values() {
        return (DecodeSequenceMode[]) $VALUES.clone();
    }
}
