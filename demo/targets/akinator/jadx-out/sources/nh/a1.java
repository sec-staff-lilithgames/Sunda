package nh;

import io.ktor.util.collections.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class a1 implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76081b;

    public /* synthetic */ a1(Object obj, int i10) {
        this.f76080a = i10;
        this.f76081b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f76080a) {
            case 0:
                return mh.p1.checkNotNull(((Function) this.f76081b).apply(obj));
            case 1:
                return ((Stream) ((Function) this.f76081b).apply(obj)).peek(new e1());
            case 2:
                return mh.p1.checkNotNull(((Function) this.f76081b).apply(obj));
            case 3:
                return ((Stream) ((Function) this.f76081b).apply(obj)).peek(new e1());
            default:
                return ConcurrentMap.computeIfAbsent$lambda$0((kv.l) this.f76081b, obj);
        }
    }
}
