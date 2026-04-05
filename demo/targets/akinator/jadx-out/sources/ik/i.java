package ik;

import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f59690i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f59691j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Map f59692k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f59693l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.p f59694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, Map map, kv.p pVar, kv.p pVar2, zu.d dVar) {
        super(2, dVar);
        this.f59691j = hVar;
        this.f59692k = map;
        this.f59693l = pVar;
        this.f59694m = pVar2;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new i(this.f59691j, this.f59692k, this.f59693l, this.f59694m, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        if (r2.invoke(r9, r8) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00de, code lost:
    
        if (r2.invoke(r1, r8) != r0) goto L37;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r8.f59690i
            kv.p r2 = r8.f59694m
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L28
            if (r1 == r5) goto L20
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            tu.a0.throwOnFailure(r9)
            goto Le1
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Exception -> L25
            goto Le1
        L25:
            r9 = move-exception
            goto Lce
        L28:
            tu.a0.throwOnFailure(r9)
            ik.h r9 = r8.f59691j     // Catch: java.lang.Exception -> L25
            java.net.URL r9 = ik.h.access$settingsUrl(r9)     // Catch: java.lang.Exception -> L25
            java.net.URLConnection r9 = r9.openConnection()     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            kotlin.jvm.internal.e0.checkNotNull(r9, r1)     // Catch: java.lang.Exception -> L25
            javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "GET"
            r9.setRequestMethod(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "Accept"
            java.lang.String r6 = "application/json"
            r9.setRequestProperty(r1, r6)     // Catch: java.lang.Exception -> L25
            java.util.Map r1 = r8.f59692k     // Catch: java.lang.Exception -> L25
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L25
        L52:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Exception -> L25
            if (r6 == 0) goto L6e
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Exception -> L25
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> L25
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Exception -> L25
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L25
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L25
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L25
            r9.setRequestProperty(r7, r6)     // Catch: java.lang.Exception -> L25
            goto L52
        L6e:
            int r1 = r9.getResponseCode()     // Catch: java.lang.Exception -> L25
            r6 = 200(0xc8, float:2.8E-43)
            if (r1 != r6) goto Lb4
            java.io.InputStream r9 = r9.getInputStream()     // Catch: java.lang.Exception -> L25
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L25
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L25
            r4.<init>(r9)     // Catch: java.lang.Exception -> L25
            r1.<init>(r4)     // Catch: java.lang.Exception -> L25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r4.<init>()     // Catch: java.lang.Exception -> L25
            kotlin.jvm.internal.b1 r6 = new kotlin.jvm.internal.b1     // Catch: java.lang.Exception -> L25
            r6.<init>()     // Catch: java.lang.Exception -> L25
        L8e:
            java.lang.String r7 = r1.readLine()     // Catch: java.lang.Exception -> L25
            r6.f71816b = r7     // Catch: java.lang.Exception -> L25
            if (r7 == 0) goto L9a
            r4.append(r7)     // Catch: java.lang.Exception -> L25
            goto L8e
        L9a:
            r1.close()     // Catch: java.lang.Exception -> L25
            r9.close()     // Catch: java.lang.Exception -> L25
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L25
            r9.<init>(r1)     // Catch: java.lang.Exception -> L25
            kv.p r1 = r8.f59693l     // Catch: java.lang.Exception -> L25
            r8.f59690i = r5     // Catch: java.lang.Exception -> L25
            java.lang.Object r9 = r1.invoke(r9, r8)     // Catch: java.lang.Exception -> L25
            if (r9 != r0) goto Le1
            goto Le0
        Lb4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r9.<init>()     // Catch: java.lang.Exception -> L25
            java.lang.String r5 = "Bad response code: "
            r9.append(r5)     // Catch: java.lang.Exception -> L25
            r9.append(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L25
            r8.f59690i = r4     // Catch: java.lang.Exception -> L25
            java.lang.Object r9 = r2.invoke(r9, r8)     // Catch: java.lang.Exception -> L25
            if (r9 != r0) goto Le1
            goto Le0
        Lce:
            java.lang.String r1 = r9.getMessage()
            if (r1 != 0) goto Ld8
            java.lang.String r1 = r9.toString()
        Ld8:
            r8.f59690i = r3
            java.lang.Object r9 = r2.invoke(r1, r8)
            if (r9 != r0) goto Le1
        Le0:
            return r0
        Le1:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
