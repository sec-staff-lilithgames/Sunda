package io.ktor.utils.io.jvm.javaio;

import bx.a;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Job;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BlockingKt {
    private static final o ADAPTER_LOGGER$delegate = q.lazy(BlockingKt$ADAPTER_LOGGER$2.INSTANCE);
    private static final Object CloseToken = new Object();
    private static final Object FlushToken = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final a getADAPTER_LOGGER() {
        return (a) ADAPTER_LOGGER$delegate.getValue();
    }

    public static final InputStream toInputStream(ByteReadChannel byteReadChannel, Job job) {
        e0.checkNotNullParameter(byteReadChannel, "<this>");
        return new InputAdapter(job, byteReadChannel);
    }

    public static /* synthetic */ InputStream toInputStream$default(ByteReadChannel byteReadChannel, Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return toInputStream(byteReadChannel, job);
    }

    public static final OutputStream toOutputStream(ByteWriteChannel byteWriteChannel, Job job) {
        e0.checkNotNullParameter(byteWriteChannel, "<this>");
        return new OutputAdapter(job, byteWriteChannel);
    }

    public static /* synthetic */ OutputStream toOutputStream$default(ByteWriteChannel byteWriteChannel, Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return toOutputStream(byteWriteChannel, job);
    }
}
