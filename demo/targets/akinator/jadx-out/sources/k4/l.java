package k4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f70397i;

    /* renamed from: j, reason: collision with root package name */
    public h f70398j;

    /* renamed from: k, reason: collision with root package name */
    public Object f70399k;

    /* renamed from: l, reason: collision with root package name */
    public int f70400l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f70401m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f70402n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f70403o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, ArrayList arrayList, zu.d dVar) {
        super(2, dVar);
        this.f70402n = list;
        this.f70403o = arrayList;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        l lVar = new l(this.f70402n, this.f70403o, dVar);
        lVar.f70401m = obj;
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[RETURN] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r9.f70400l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.util.Iterator r1 = r9.f70397i
            java.lang.Object r4 = r9.f70401m
            java.util.List r4 = (java.util.List) r4
            tu.a0.throwOnFailure(r10)
            goto L40
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.f70399k
            k4.h r4 = r9.f70398j
            java.util.Iterator r5 = r9.f70397i
            java.lang.Object r6 = r9.f70401m
            java.util.List r6 = (java.util.List) r6
            tu.a0.throwOnFailure(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L62
        L31:
            tu.a0.throwOnFailure(r10)
            java.lang.Object r10 = r9.f70401m
            java.util.List r1 = r9.f70402n
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r9.f70403o
        L40:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L88
            java.lang.Object r5 = r1.next()
            k4.h r5 = (k4.h) r5
            r9.f70401m = r4
            r9.f70397i = r1
            r9.f70398j = r5
            r9.f70399k = r10
            r9.f70400l = r3
            java.lang.Object r6 = r5.shouldMigrate(r10, r9)
            if (r6 != r0) goto L5d
            goto L83
        L5d:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L62:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L86
            k4.k r10 = new k4.k
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.f70401m = r4
            r9.f70397i = r5
            r9.f70398j = r7
            r9.f70399k = r7
            r9.f70400l = r2
            java.lang.Object r10 = r6.migrate(r1, r9)
            if (r10 != r0) goto L84
        L83:
            return r0
        L84:
            r1 = r5
            goto L40
        L86:
            r10 = r1
            goto L84
        L88:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(Object obj, zu.d<Object> dVar) {
        return ((l) create(obj, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
