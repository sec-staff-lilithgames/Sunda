package p5;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.ThreadContextElementKt;
import zu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static final <T> k asContextElement(ThreadLocal<T> threadLocal, T t10) {
        e0.checkNotNullParameter(threadLocal, "<this>");
        return ThreadContextElementKt.asContextElement(threadLocal, t10);
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    public static /* synthetic */ void ThreadLocal$annotations() {
    }
}
