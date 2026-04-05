package o5;

import java.lang.ref.WeakReference;
import java.util.Set;
import o5.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z2 extends y.b {

    /* renamed from: b, reason: collision with root package name */
    public final y f77860b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f77861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(y tracker, y.b delegate) {
        super(delegate.getTables$room_runtime_release());
        kotlin.jvm.internal.e0.checkNotNullParameter(tracker, "tracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f77860b = tracker;
        this.f77861c = new WeakReference(delegate);
    }

    @Override // o5.y.b
    public void onInvalidated(Set<String> tables) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tables, "tables");
        y.b bVar = (y.b) this.f77861c.get();
        if (bVar == null) {
            this.f77860b.removeObserver(this);
        } else {
            bVar.onInvalidated(tables);
        }
    }
}
