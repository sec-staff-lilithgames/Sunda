package kotlinx.coroutines.future;

import java.util.function.BiFunction;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f71892c;

    public /* synthetic */ a(int i10, p pVar) {
        this.f71891b = i10;
        this.f71892c = pVar;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f71891b) {
            case 0:
                return ((a1.a) this.f71892c).invoke(obj, (Throwable) obj2);
            default:
                return FutureKt.setupCancellation$lambda$3(this.f71892c, obj, (Throwable) obj2);
        }
    }
}
