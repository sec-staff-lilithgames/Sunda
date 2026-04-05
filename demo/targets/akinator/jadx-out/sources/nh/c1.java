package nh;

import ad.u;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class c1 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76147c;

    public /* synthetic */ c1(int i10, Object obj, Object obj2) {
        this.f76145a = i10;
        this.f76146b = obj;
        this.f76147c = obj2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f76145a) {
            case 0:
                ((ud) obj).add(mh.p1.checkNotNull(((Function) this.f76146b).apply(obj2)), ((ToIntFunction) this.f76147c).applyAsInt(obj2));
                break;
            case 1:
                ((ud) obj).add(((Function) this.f76146b).apply(obj2), ((ToIntFunction) this.f76147c).applyAsInt(obj2));
                break;
            default:
                ad.u uVar = (ad.u) this.f76146b;
                u.a[] aVarArr = (u.a[]) this.f76147c;
                dd.m0 m0Var = (dd.m0) obj;
                uVar.getClass();
                int iHashCode = uVar.f4300c & m0Var.hashCode();
                aVarArr[iHashCode] = new u.a(aVarArr[iHashCode], m0Var, (jc.w) obj2);
                break;
        }
    }
}
