package com.unity3d.services.core.extensions;

import bv.d;
import bv.f;
import com.amazon.device.ads.DtbDeviceData;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TaskExtensionsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.extensions.TaskExtensionsKt", f = "TaskExtensions.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {17, 30}, m = "withRetry", n = {"fallbackException", "block", "nextDelay", "retryDelay", "retries", DtbDeviceData.DEVICE_DATA_SCALING_FACTOR_KEY, "attempt", "fallbackException", "block", "nextDelay", "retryDelay", "retries", DtbDeviceData.DEVICE_DATA_SCALING_FACTOR_KEY}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "D$0", "I$2", "L$0", "L$1", "L$2", "J$0", "I$0", "D$0"})
    /* renamed from: com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends d {
        double D$0;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TaskExtensionsKt.withRetry(0L, 0, 0.0d, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0120 -> B:45:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x013d -> B:49:0x0148). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object withRetry(long r20, int r22, double r23, java.lang.Exception r25, kv.p r26, zu.d<? super T> r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(long, int, double, java.lang.Exception, kv.p, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object withRetry$default(long j10, int i10, double d10, Exception exc, p pVar, zu.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = 5000;
        }
        if ((i11 & 2) != 0) {
            i10 = 6;
        }
        if ((i11 & 4) != 0) {
            d10 = 2.0d;
        }
        int i12 = i10;
        return withRetry(j10, i12, d10, exc, pVar, dVar);
    }
}
