package k4;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f70413a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008c -> B:25:0x006f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008f -> B:25:0x006f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object access$runMigrations(k4.m.a r5, java.util.List r6, k4.k1 r7, zu.d r8) throws java.lang.Throwable {
            /*
                r5.getClass()
                boolean r0 = r8 instanceof k4.j
                if (r0 == 0) goto L16
                r0 = r8
                k4.j r0 = (k4.j) r0
                int r1 = r0.f70373m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.f70373m = r1
                goto L1b
            L16:
                k4.j r0 = new k4.j
                r0.<init>(r5, r8)
            L1b:
                java.lang.Object r5 = r0.f70371k
                java.lang.Object r8 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r0.f70373m
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L47
                if (r1 == r3) goto L3f
                if (r1 != r2) goto L37
                java.util.Iterator r6 = r0.f70370j
                java.io.Serializable r7 = r0.f70369i
                kotlin.jvm.internal.b1 r7 = (kotlin.jvm.internal.b1) r7
                tu.a0.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L35
                goto L6f
            L35:
                r5 = move-exception
                goto L88
            L37:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3f:
                java.io.Serializable r6 = r0.f70369i
                java.util.List r6 = (java.util.List) r6
                tu.a0.throwOnFailure(r5)
                goto L63
            L47:
                tu.a0.throwOnFailure(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                k4.l r1 = new k4.l
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.f70369i = r5
                r0.f70373m = r3
                k4.s r7 = (k4.s) r7
                java.lang.Object r6 = r7.updateData(r1, r0)
                if (r6 != r8) goto L62
                goto La0
            L62:
                r6 = r5
            L63:
                kotlin.jvm.internal.b1 r5 = new kotlin.jvm.internal.b1
                r5.<init>()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L6f:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L98
                java.lang.Object r5 = r6.next()
                kv.l r5 = (kv.l) r5
                r0.f70369i = r7     // Catch: java.lang.Throwable -> L35
                r0.f70370j = r6     // Catch: java.lang.Throwable -> L35
                r0.f70373m = r2     // Catch: java.lang.Throwable -> L35
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L35
                if (r5 != r8) goto L6f
                goto La0
            L88:
                java.lang.Object r1 = r7.f71816b
                if (r1 != 0) goto L8f
                r7.f71816b = r5
                goto L6f
            L8f:
                kotlin.jvm.internal.e0.checkNotNull(r1)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                tu.h.addSuppressed(r1, r5)
                goto L6f
            L98:
                java.lang.Object r5 = r7.f71816b
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto La1
                tu.x0 r8 = tu.x0.f87415a
            La0:
                return r8
            La1:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k4.m.a.access$runMigrations(k4.m$a, java.util.List, k4.k1, zu.d):java.lang.Object");
        }

        public final <T> kv.p getInitializer(List<? extends h> migrations) {
            kotlin.jvm.internal.e0.checkNotNullParameter(migrations, "migrations");
            return new i(migrations, null);
        }
    }
}
