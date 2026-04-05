package fk;

import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Map f55720i;

    /* renamed from: j, reason: collision with root package name */
    public Iterator f55721j;

    /* renamed from: k, reason: collision with root package name */
    public e f55722k;

    /* renamed from: l, reason: collision with root package name */
    public Mutex f55723l;

    /* renamed from: m, reason: collision with root package name */
    public Map f55724m;

    /* renamed from: n, reason: collision with root package name */
    public Object f55725n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f55726o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f55727p;

    /* renamed from: q, reason: collision with root package name */
    public int f55728q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, zu.d dVar2) {
        super(dVar2);
        this.f55727p = dVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f55726o = obj;
        this.f55728q |= Integer.MIN_VALUE;
        return this.f55727p.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
    }
}
