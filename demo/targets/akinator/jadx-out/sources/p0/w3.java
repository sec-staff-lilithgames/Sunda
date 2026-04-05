package p0;

import java.util.List;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w3 extends bv.n implements kv.q {

    /* renamed from: i, reason: collision with root package name */
    public List f80569i;

    /* renamed from: j, reason: collision with root package name */
    public List f80570j;

    /* renamed from: k, reason: collision with root package name */
    public List f80571k;

    /* renamed from: l, reason: collision with root package name */
    public z.v0 f80572l;

    /* renamed from: m, reason: collision with root package name */
    public z.v0 f80573m;

    /* renamed from: n, reason: collision with root package name */
    public z.v0 f80574n;

    /* renamed from: o, reason: collision with root package name */
    public Set f80575o;

    /* renamed from: p, reason: collision with root package name */
    public z.v0 f80576p;

    /* renamed from: q, reason: collision with root package name */
    public int f80577q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ d2 f80578r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n3 f80579s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(n3 n3Var, zu.d dVar) {
        super(3, dVar);
        this.f80579s = n3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(p0.n3 r22, java.util.List r23, java.util.List r24, java.util.List r25, z.v0 r26, z.v0 r27, z.v0 r28, z.v0 r29) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.w3.a(p0.n3, java.util.List, java.util.List, java.util.List, z.v0, z.v0, z.v0, z.v0):void");
    }

    public static final void b(List list, n3 n3Var) {
        list.clear();
        synchronized (n3Var.f80350c) {
            try {
                List list2 = n3Var.f80358k;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((i2) list2.get(i10));
                }
                n3Var.f80358k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0104 -> B:24:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0111 -> B:12:0x00a1). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.w3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.q
    public final Object invoke(CoroutineScope coroutineScope, d2 d2Var, zu.d<? super tu.x0> dVar) {
        w3 w3Var = new w3(this.f80579s, dVar);
        w3Var.f80578r = d2Var;
        return w3Var.invokeSuspend(tu.x0.f87415a);
    }
}
