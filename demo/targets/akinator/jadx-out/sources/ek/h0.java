package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f54537c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f54538a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54539b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
        
            if (r10 == r1) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v22 */
        /* JADX WARN: Type inference failed for: r9v23 */
        /* JADX WARN: Type inference failed for: r9v24 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object create(tj.f r9, zu.d<? super ek.h0> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof ek.g0
                if (r0 == 0) goto L13
                r0 = r10
                ek.g0 r0 = (ek.g0) r0
                int r1 = r0.f54526l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f54526l = r1
                goto L18
            L13:
                ek.g0 r0 = new ek.g0
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.f54524j
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.f54526l
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                r5 = 1
                java.lang.String r6 = ""
                if (r2 == 0) goto L4a
                if (r2 == r5) goto L40
                if (r2 != r4) goto L38
                java.lang.Object r9 = r0.f54523i
                java.lang.String r9 = (java.lang.String) r9
                tu.a0.throwOnFailure(r10)     // Catch: java.lang.Exception -> L35
                goto L93
            L35:
                r10 = move-exception
                goto L9a
            L38:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L40:
                java.lang.Object r9 = r0.f54523i
                tj.f r9 = (tj.f) r9
                tu.a0.throwOnFailure(r10)     // Catch: java.lang.Exception -> L48
                goto L68
            L48:
                r10 = move-exception
                goto L76
            L4a:
                tu.a0.throwOnFailure(r10)
                r10 = r9
                tj.e r10 = (tj.e) r10     // Catch: java.lang.Exception -> L48
                r2 = 0
                com.google.android.gms.tasks.Task r9 = r10.getToken(r2)     // Catch: java.lang.Exception -> L48
                java.lang.String r2 = "getToken(...)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r9, r2)     // Catch: java.lang.Exception -> L72
                r0.f54523i = r10     // Catch: java.lang.Exception -> L72
                r0.f54526l = r5     // Catch: java.lang.Exception -> L72
                java.lang.Object r9 = kotlinx.coroutines.tasks.TasksKt.await(r9, r0)     // Catch: java.lang.Exception -> L72
                if (r9 != r1) goto L65
                goto L92
            L65:
                r7 = r10
                r10 = r9
                r9 = r7
            L68:
                tj.k r10 = (tj.k) r10     // Catch: java.lang.Exception -> L48
                java.lang.String r10 = r10.getToken()     // Catch: java.lang.Exception -> L48
                r7 = r10
                r10 = r9
                r9 = r7
                goto L7d
            L72:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L76:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r3, r2, r10)
                r10 = r9
                r9 = r6
            L7d:
                tj.e r10 = (tj.e) r10     // Catch: java.lang.Exception -> L35
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L35
                java.lang.String r2 = "getId(...)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L35
                r0.f54523i = r9     // Catch: java.lang.Exception -> L35
                r0.f54526l = r4     // Catch: java.lang.Exception -> L35
                java.lang.Object r10 = kotlinx.coroutines.tasks.TasksKt.await(r10, r0)     // Catch: java.lang.Exception -> L35
                if (r10 != r1) goto L93
            L92:
                return r1
            L93:
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L35
                if (r10 != 0) goto L98
                goto L9f
            L98:
                r6 = r10
                goto L9f
            L9a:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r3, r0, r10)
            L9f:
                ek.h0 r10 = new ek.h0
                r0 = 0
                r10.<init>(r6, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ek.h0.a.create(tj.f, zu.d):java.lang.Object");
        }
    }

    public h0(String str, String str2, kotlin.jvm.internal.u uVar) {
        this.f54538a = str;
        this.f54539b = str2;
    }

    public final String getAuthToken() {
        return this.f54539b;
    }

    public final String getFid() {
        return this.f54538a;
    }
}
