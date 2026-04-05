package rv;

import androidx.lifecycle.c3;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f85033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f85034b;

    public k0(t tVar, Object obj) {
        this.f85033a = tVar;
        this.f85034b = obj;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return f0.filter(this.f85033a, new c3(19, new kotlin.jvm.internal.w0(), this.f85034b)).iterator();
    }
}
