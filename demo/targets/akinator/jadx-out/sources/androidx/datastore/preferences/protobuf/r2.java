package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface r2 extends s2 {
    @Override // androidx.datastore.preferences.protobuf.s2
    /* synthetic */ r2 getDefaultInstanceForType();

    a3 getParserForType();

    int getSerializedSize();

    @Override // androidx.datastore.preferences.protobuf.s2
    /* synthetic */ boolean isInitialized();

    q2 newBuilderForType();

    q2 toBuilder();

    byte[] toByteArray();

    x toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(l0 l0Var) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
