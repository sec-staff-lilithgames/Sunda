package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class r {
    public static q a(RandomAccessFile randomAccessFile, long j10, long j11) {
        return a(randomAccessFile.getChannel(), j10, j11);
    }

    public static q a(FileChannel fileChannel, long j10, long j11) {
        fileChannel.getClass();
        return new m(fileChannel, j10, j11);
    }
}
