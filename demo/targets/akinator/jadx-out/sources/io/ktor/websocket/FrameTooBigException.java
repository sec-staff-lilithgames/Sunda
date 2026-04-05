package io.ktor.websocket;

import io.ktor.util.internal.ExceptionUtilsJvmKt;
import kotlinx.coroutines.CopyableThrowable;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FrameTooBigException extends Exception implements CopyableThrowable<FrameTooBigException> {
    private final long frameSize;

    public FrameTooBigException(long j10) {
        this.frameSize = j10;
    }

    public final long getFrameSize() {
        return this.frameSize;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public FrameTooBigException createCopy() {
        FrameTooBigException frameTooBigException = new FrameTooBigException(this.frameSize);
        ExceptionUtilsJvmKt.initCauseBridge(frameTooBigException, this);
        return frameTooBigException;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return GalEuEfxjome.WbEq + this.frameSize;
    }
}
