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
public interface WriterJob extends Job {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <R> R fold(WriterJob writerJob, R r10, p operation) {
            e0.checkNotNullParameter(operation, "operation");
            return (R) Job.DefaultImpls.fold(writerJob, r10, operation);
        }

        public static <E extends k> E get(WriterJob writerJob, l key) {
            e0.checkNotNullParameter(key, "key");
            return (E) Job.DefaultImpls.get(writerJob, key);
        }

        public static m minusKey(WriterJob writerJob, l key) {
            e0.checkNotNullParameter(key, "key");
            return Job.DefaultImpls.minusKey(writerJob, key);
        }

        @f
        public static Job plus(WriterJob writerJob, Job other) {
            e0.checkNotNullParameter(other, "other");
            return Job.DefaultImpls.plus((Job) writerJob, other);
        }

        public static m plus(WriterJob writerJob, m context) {
            e0.checkNotNullParameter(context, "context");
            return Job.DefaultImpls.plus(writerJob, context);
        }
    }

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ k get(l lVar);

    ByteReadChannel getChannel();

    @Override // kotlinx.coroutines.Job, zu.k
    /* synthetic */ l getKey();

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m plus(m mVar);
}
