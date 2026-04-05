package q7;

import androidx.lifecycle.k0;
import kotlin.jvm.internal.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public k0 f82538i;

    /* renamed from: j, reason: collision with root package name */
    public b1 f82539j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f82540k;

    /* renamed from: l, reason: collision with root package name */
    public int f82541l;

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f82540k = obj;
        this.f82541l |= Integer.MIN_VALUE;
        return i.awaitStarted(null, this);
    }
}
