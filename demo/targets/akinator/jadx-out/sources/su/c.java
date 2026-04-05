package su;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static su.c newInstance() throws su.a {
        /*
            java.lang.Class<su.b> r0 = su.b.class
            java.lang.String r1 = "$ClassLoaderFinderConcrete"
            r2 = 0
            java.lang.Class r3 = su.b.f86117b     // Catch: java.lang.Exception -> L25 java.lang.ClassNotFoundException -> L30 java.lang.LinkageError -> L3d
            if (r3 != 0) goto Lc
            su.b.f86117b = r0     // Catch: java.lang.Exception -> L25 java.lang.ClassNotFoundException -> L30 java.lang.LinkageError -> L3d
            r3 = r0
        Lc:
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L25 java.lang.ClassNotFoundException -> L30 java.lang.LinkageError -> L3d
            java.lang.String r1 = r3.concat(r1)     // Catch: java.lang.Exception -> L25 java.lang.ClassNotFoundException -> L30 java.lang.LinkageError -> L3d
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L25 java.lang.ClassNotFoundException -> L30 java.lang.LinkageError -> L3d
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L25 java.lang.ClassNotFoundException -> L30 java.lang.LinkageError -> L3d
            if (r1 != 0) goto L1f
            throw r2     // Catch: java.lang.Exception -> L25
        L1f:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException     // Catch: java.lang.Exception -> L25 java.lang.ClassNotFoundException -> L30 java.lang.LinkageError -> L3d
            r1.<init>()     // Catch: java.lang.Exception -> L25 java.lang.ClassNotFoundException -> L30 java.lang.LinkageError -> L3d
            throw r1     // Catch: java.lang.Exception -> L25 java.lang.ClassNotFoundException -> L30 java.lang.LinkageError -> L3d
        L25:
            r0 = move-exception
            su.a r1 = new su.a
            java.lang.String r2 = r0.toString()
            r1.<init>(r2, r0)
            throw r1
        L30:
            java.lang.Class r1 = su.b.f86117b
            if (r1 != 0) goto L37
            su.b.f86117b = r0
            goto L38
        L37:
            r0 = r1
        L38:
            java.lang.ClassLoader r0 = r0.getClassLoader()
            goto L49
        L3d:
            java.lang.Class r1 = su.b.f86117b
            if (r1 != 0) goto L44
            su.b.f86117b = r0
            goto L45
        L44:
            r0 = r1
        L45:
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L49:
            java.lang.String r1 = "javax.xml.stream.XMLInputFactory"
            java.lang.Object r0 = su.b.b(r0, r1)
            if (r0 != 0) goto L52
            return r2
        L52:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.c.newInstance():su.c");
    }

    public static c newInstance(String str, ClassLoader classLoader) throws a {
        if (b.b(classLoader, str) == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
