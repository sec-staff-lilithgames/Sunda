package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.BitSet;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class s0 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public BitSet read(JsonReader jsonReader) throws IOException, NumberFormatException {
        BitSet bitSet = new BitSet();
        jsonReader.beginArray();
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i10 = 0;
        while (jsonTokenPeek != JsonToken.END_ARRAY) {
            int i11 = u0.f30032a[jsonTokenPeek.ordinal()];
            boolean zNextBoolean = true;
            if (i11 == 1 || i11 == 2) {
                int iNextInt = jsonReader.nextInt();
                if (iNextInt == 0) {
                    zNextBoolean = false;
                } else if (iNextInt != 1) {
                    StringBuilder sbT = o2.t(iNextInt, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbT.append(jsonReader.getPreviousPath());
                    throw new com.google.gson.w(sbT.toString());
                }
            } else {
                if (i11 != 3) {
                    throw new com.google.gson.w("Invalid bitset value type: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
                }
                zNextBoolean = jsonReader.nextBoolean();
            }
            if (zNextBoolean) {
                bitSet.set(i10);
            }
            i10++;
            jsonTokenPeek = jsonReader.peek();
        }
        jsonReader.endArray();
        return bitSet;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
        jsonWriter.beginArray();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            jsonWriter.value(bitSet.get(i10) ? 1L : 0L);
        }
        jsonWriter.endArray();
    }
}
