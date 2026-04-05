package com.applovin.shadow.okio;

import java.io.Closeable;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final /* synthetic */ class Okio__OkioKt {
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSource buffer(Source source) {
        e0.checkNotNullParameter(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final <T extends Closeable, R> R use(T t10, l block) throws Throwable {
        R r10;
        e0.checkNotNullParameter(block, "block");
        Throwable th2 = null;
        try {
            r10 = (R) block.invoke(t10);
            b0.finallyStart(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            b0.finallyEnd(1);
        } catch (Throwable th4) {
            b0.finallyStart(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th5) {
                    h.addSuppressed(th4, th5);
                }
            }
            b0.finallyEnd(1);
            th2 = th4;
            r10 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        e0.checkNotNull(r10);
        return r10;
    }

    public static final BufferedSink buffer(Sink sink) {
        e0.checkNotNullParameter(sink, "<this>");
        return new RealBufferedSink(sink);
    }
}
