package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class b extends OutputStream {
    public abstract void write(long j10, int i10) throws IOException;

    public abstract void write(long j10, byte[] bArr) throws IOException;

    public abstract void write(long j10, byte[] bArr, int i10, int i11) throws IOException;
}
