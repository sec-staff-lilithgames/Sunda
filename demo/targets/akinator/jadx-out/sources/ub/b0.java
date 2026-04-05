package ub;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface b0 {
    public static final ic.i0 W8 = ic.i0.createDefaultInstance();
    public static final cc.q X8 = new cc.q(" ");

    void beforeArrayValues(o oVar) throws IOException;

    void beforeObjectEntries(o oVar) throws IOException;

    void writeArrayValueSeparator(o oVar) throws IOException;

    void writeEndArray(o oVar, int i10) throws IOException;

    void writeEndObject(o oVar, int i10) throws IOException;

    void writeObjectEntrySeparator(o oVar) throws IOException;

    void writeObjectFieldValueSeparator(o oVar) throws IOException;

    void writeRootValueSeparator(o oVar) throws IOException;

    void writeStartArray(o oVar) throws IOException;

    void writeStartObject(o oVar) throws IOException;
}
