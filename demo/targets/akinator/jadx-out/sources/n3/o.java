package n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void rebase(android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            n3.k.b(r6)
            return
        La:
            java.lang.Object r0 = n3.b.f75570e
            monitor-enter(r0)
            boolean r1 = n3.b.f75572g     // Catch: java.lang.Throwable -> L21
            r2 = 0
            if (r1 != 0) goto L2d
            r1 = 1
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r4 = "rebase"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L21 java.lang.NoSuchMethodException -> L23
            n3.b.f75571f = r3     // Catch: java.lang.Throwable -> L21 java.lang.NoSuchMethodException -> L23
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L21 java.lang.NoSuchMethodException -> L23
            goto L2b
        L21:
            r6 = move-exception
            goto L43
        L23:
            r3 = move-exception
            java.lang.String r4 = "ResourcesCompat"
            java.lang.String r5 = "Failed to retrieve rebase() method"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L21
        L2b:
            n3.b.f75572g = r1     // Catch: java.lang.Throwable -> L21
        L2d:
            java.lang.reflect.Method r1 = n3.b.f75571f     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L41
            r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L21 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            goto L41
        L35:
            r6 = move-exception
            goto L38
        L37:
            r6 = move-exception
        L38:
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r3 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L21
            n3.b.f75571f = r2     // Catch: java.lang.Throwable -> L21
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.o.rebase(android.content.res.Resources$Theme):void");
    }
}
