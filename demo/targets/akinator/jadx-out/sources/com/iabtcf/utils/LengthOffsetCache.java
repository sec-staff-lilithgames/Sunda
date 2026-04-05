package com.iabtcf.utils;

import java.util.EnumMap;
import java.util.function.Function;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class LengthOffsetCache {
    private final BitReader bbv;
    private final EnumMap<FieldDefs, Integer> lengthCache = new EnumMap<>(FieldDefs.class);
    private final EnumMap<FieldDefs, Integer> offsetCache = new EnumMap<>(FieldDefs.class);

    public LengthOffsetCache(BitReader bitReader) {
        this.bbv = bitReader;
    }

    private Integer memoize(FieldDefs fieldDefs, EnumMap<FieldDefs, Integer> enumMap, Function<BitReader, Integer> function) {
        if (!fieldDefs.isDynamic()) {
            return function.apply(this.bbv);
        }
        Integer num = enumMap.get(fieldDefs);
        if (num != null) {
            return num;
        }
        Integer numApply = function.apply(this.bbv);
        enumMap.put((EnumMap<FieldDefs, Integer>) fieldDefs, (FieldDefs) numApply);
        return numApply;
    }

    public Integer getLength(FieldDefs fieldDefs, Function<BitReader, Integer> function) {
        return memoize(fieldDefs, this.lengthCache, function);
    }

    public Integer getOffset(FieldDefs fieldDefs, Function<BitReader, Integer> function) {
        return memoize(fieldDefs, this.offsetCache, function);
    }
}
