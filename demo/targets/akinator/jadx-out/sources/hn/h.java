package hn;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f59042a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    f configure(f fVar) throws g;

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();

    default long getDurationAfterProcessorApplied(long j10) {
        return j10;
    }
}
