package com.mbridge.msdk.playercommon.exoplayer2.extractor.flv;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class ScriptTagPayloadReader extends TagPayloadReader {
    private static final int AMF_TYPE_BOOLEAN = 1;
    private static final int AMF_TYPE_DATE = 11;
    private static final int AMF_TYPE_ECMA_ARRAY = 8;
    private static final int AMF_TYPE_END_MARKER = 9;
    private static final int AMF_TYPE_NUMBER = 0;
    private static final int AMF_TYPE_OBJECT = 3;
    private static final int AMF_TYPE_STRICT_ARRAY = 10;
    private static final int AMF_TYPE_STRING = 2;
    private static final String KEY_DURATION = "duration";
    private static final String NAME_METADATA = "onMetaData";
    private long durationUs;

    public ScriptTagPayloadReader() {
        super(null);
        this.durationUs = C.TIME_UNSET;
    }

    private static Boolean readAmfBoolean(ParsableByteArray parsableByteArray) {
        return Boolean.valueOf(parsableByteArray.readUnsignedByte() == 1);
    }

    private static Object readAmfData(ParsableByteArray parsableByteArray, int i10) {
        if (i10 == 8) {
            return readAmfEcmaArray(parsableByteArray);
        }
        if (i10 == 10) {
            return readAmfStrictArray(parsableByteArray);
        }
        if (i10 == 11) {
            return readAmfDate(parsableByteArray);
        }
        if (i10 == 0) {
            return readAmfDouble(parsableByteArray);
        }
        if (i10 == 1) {
            return readAmfBoolean(parsableByteArray);
        }
        if (i10 == 2) {
            return readAmfString(parsableByteArray);
        }
        if (i10 != 3) {
            return null;
        }
        return readAmfObject(parsableByteArray);
    }

    private static Date readAmfDate(ParsableByteArray parsableByteArray) {
        Date date = new Date((long) readAmfDouble(parsableByteArray).doubleValue());
        parsableByteArray.skipBytes(2);
        return date;
    }

    private static Double readAmfDouble(ParsableByteArray parsableByteArray) {
        return Double.valueOf(Double.longBitsToDouble(parsableByteArray.readLong()));
    }

    private static HashMap<String, Object> readAmfEcmaArray(ParsableByteArray parsableByteArray) {
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        HashMap<String, Object> map = new HashMap<>(unsignedIntToInt);
        for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
            map.put(readAmfString(parsableByteArray), readAmfData(parsableByteArray, readAmfType(parsableByteArray)));
        }
        return map;
    }

    private static HashMap<String, Object> readAmfObject(ParsableByteArray parsableByteArray) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String amfString = readAmfString(parsableByteArray);
            int amfType = readAmfType(parsableByteArray);
            if (amfType == 9) {
                return map;
            }
            map.put(amfString, readAmfData(parsableByteArray, amfType));
        }
    }

    private static ArrayList<Object> readAmfStrictArray(ParsableByteArray parsableByteArray) {
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        ArrayList<Object> arrayList = new ArrayList<>(unsignedIntToInt);
        for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
            arrayList.add(readAmfData(parsableByteArray, readAmfType(parsableByteArray)));
        }
        return arrayList;
    }

    private static String readAmfString(ParsableByteArray parsableByteArray) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(unsignedShort);
        return new String(parsableByteArray.data, position, unsignedShort);
    }

    private static int readAmfType(ParsableByteArray parsableByteArray) {
        return parsableByteArray.readUnsignedByte();
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader
    public boolean parseHeader(ParsableByteArray parsableByteArray) {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader
    public void parsePayload(ParsableByteArray parsableByteArray, long j10) throws ParserException {
        if (readAmfType(parsableByteArray) != 2) {
            throw new ParserException();
        }
        if (NAME_METADATA.equals(readAmfString(parsableByteArray)) && readAmfType(parsableByteArray) == 8) {
            HashMap<String, Object> amfEcmaArray = readAmfEcmaArray(parsableByteArray);
            if (amfEcmaArray.containsKey("duration")) {
                double dDoubleValue = ((Double) amfEcmaArray.get("duration")).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.durationUs = (long) (dDoubleValue * 1000000.0d);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
    }
}
