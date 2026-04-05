package com.unity3d.services.core.domain;

import com.unity3d.services.core.domain.task.InitializationException;
import kotlin.jvm.internal.e0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ResultExtensionsKt {
    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
        e0.reifiedOperationMarker(3, "E");
        if (thM7134exceptionOrNullimpl instanceof Exception) {
            return (E) thM7134exceptionOrNullimpl;
        }
        return null;
    }

    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
        e0.reifiedOperationMarker(3, "E");
        if (thM7134exceptionOrNullimpl instanceof Exception) {
            return (E) thM7134exceptionOrNullimpl;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }

    public static final InitializationException getInitializationExceptionOrNull(Object obj) {
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
        if (thM7134exceptionOrNullimpl instanceof InitializationException) {
            return (InitializationException) thM7134exceptionOrNullimpl;
        }
        return null;
    }

    public static final InitializationException getInitializationExceptionOrThrow(Object obj) {
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
        if (thM7134exceptionOrNullimpl instanceof InitializationException) {
            return (InitializationException) thM7134exceptionOrNullimpl;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
