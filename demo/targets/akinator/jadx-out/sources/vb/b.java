package vb;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface b extends c {
    @Override // vb.c
    /* synthetic */ void endOfInput();

    void feedInput(ByteBuffer byteBuffer) throws IOException;

    @Override // vb.c
    /* synthetic */ boolean needMoreInput();
}
