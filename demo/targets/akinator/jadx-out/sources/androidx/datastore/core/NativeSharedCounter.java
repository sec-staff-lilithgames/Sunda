package androidx.datastore.core;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i10);

    public final native int nativeGetCounterValue(long j10);

    public final native int nativeIncrementAndGetCounterValue(long j10);

    public final native int nativeTruncateFile(int i10);
}
