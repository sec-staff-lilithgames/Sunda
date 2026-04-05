package io.ktor.utils.io;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Job;
import kv.p;
import tu.f;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes10.dex */
public interface ReaderJob extends Job {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <R> R fold(ReaderJob readerJob, R r10, p operation) {
            e0.checkNotNullParameter(operation, "operation");
            return (R) Job.DefaultImpls.fold(readerJob, r10, operation);
        }

        public static <E extends k> E get(ReaderJob readerJob, l key) {
            e0.checkNotNullParameter(key, "key");
            return (E) Job.DefaultImpls.get(readerJob, key);
        }

        public static m minusKey(ReaderJob readerJob, l key) {
            e0.checkNotNullParameter(key, "key");
            return Job.DefaultImpls.minusKey(readerJob, key);
        }

        @f
        public static Job plus(ReaderJob readerJob, Job other) {
            e0.checkNotNullParameter(other, "other");
            return Job.DefaultImpls.plus((Job) readerJob, other);
        }

        public static m plus(ReaderJob readerJob, m context) {
            e0.checkNotNullParameter(context, "context");
            return Job.DefaultImpls.plus(readerJob, context);
        }
    }

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ k get(l lVar);

    ByteWriteChannel getChannel();

    @Override // kotlinx.coroutines.Job, zu.k
    /* synthetic */ l getKey();

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m plus(m mVar);
}
