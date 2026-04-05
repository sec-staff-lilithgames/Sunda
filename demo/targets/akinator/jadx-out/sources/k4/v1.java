package k4;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Mutex f70539i;

    /* renamed from: j, reason: collision with root package name */
    public FileInputStream f70540j;

    /* renamed from: k, reason: collision with root package name */
    public FileLock f70541k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f70542l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f70543m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q1 f70544n;

    /* renamed from: o, reason: collision with root package name */
    public int f70545o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(q1 q1Var, zu.d dVar) {
        super(dVar);
        this.f70544n = q1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70543m = obj;
        this.f70545o |= Integer.MIN_VALUE;
        return this.f70544n.tryLock(null, this);
    }
}
