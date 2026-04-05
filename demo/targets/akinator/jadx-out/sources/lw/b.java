package lw;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import pw.b1;
import pw.h0;
import pw.k;
import pw.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f73627a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f73628b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public l f73629c;

    /* renamed from: d, reason: collision with root package name */
    public l f73630d;

    public final void a() {
        try {
            k kVarBuffer = h0.buffer(listSource());
            try {
                l byteString = kVarBuffer.readByteString(kVarBuffer.readInt());
                l byteString2 = kVarBuffer.readByteString(kVarBuffer.readInt());
                gv.d.closeFinally(kVarBuffer, null);
                synchronized (this) {
                    e0.checkNotNull(byteString);
                    setBytes(byteString);
                    e0.checkNotNull(byteString2);
                    setExceptionBytes(byteString2);
                }
            } finally {
            }
        } finally {
            this.f73628b.countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // lw.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ensureLoaded() throws java.lang.InterruptedException {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f73627a
            boolean r1 = r0.get()
            if (r1 != 0) goto L3e
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L3e
        L10:
            r5.a()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f java.io.InterruptedIOException -> L2f
            if (r1 == 0) goto L4b
        L15:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L4b
        L1d:
            r0 = move-exception
            goto L34
        L1f:
            r0 = move-exception
            okhttp3.internal.platform.c$a r2 = okhttp3.internal.platform.c.f79515a     // Catch: java.lang.Throwable -> L1d
            okhttp3.internal.platform.c r2 = r2.get()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.log(r3, r4, r0)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L4b
            goto L15
        L2f:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L1d
            r1 = r2
            goto L10
        L34:
            if (r1 == 0) goto L3d
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L3d:
            throw r0
        L3e:
            java.util.concurrent.CountDownLatch r0 = r5.f73628b     // Catch: java.lang.InterruptedException -> L44
            r0.await()     // Catch: java.lang.InterruptedException -> L44
            goto L4b
        L44:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4b:
            pw.l r0 = r5.f73629c
            if (r0 == 0) goto L50
            return
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load "
            r0.<init>(r1)
            java.lang.Object r1 = r5.getPath()
            r0.append(r1)
            java.lang.String r1 = " resource."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lw.b.ensureLoaded():void");
    }

    @Override // lw.e
    public l getBytes() {
        l lVar = this.f73629c;
        if (lVar != null) {
            return lVar;
        }
        e0.throwUninitializedPropertyAccessException("bytes");
        return null;
    }

    @Override // lw.e
    public l getExceptionBytes() {
        l lVar = this.f73630d;
        if (lVar != null) {
            return lVar;
        }
        e0.throwUninitializedPropertyAccessException("exceptionBytes");
        return null;
    }

    public abstract Object getPath();

    public abstract b1 listSource();

    public void setBytes(l lVar) {
        e0.checkNotNullParameter(lVar, "<set-?>");
        this.f73629c = lVar;
    }

    public void setExceptionBytes(l lVar) {
        e0.checkNotNullParameter(lVar, "<set-?>");
        this.f73630d = lVar;
    }
}
