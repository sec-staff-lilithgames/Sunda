package f;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f55250a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f55251b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public kv.a f55252c;

    public x(boolean z10) {
        this.f55250a = z10;
    }

    public final void addCancellable(d cancellable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cancellable, "cancellable");
        this.f55251b.add(cancellable);
    }

    public final kv.a getEnabledChangedCallback$activity_release() {
        return this.f55252c;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(c backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
    }

    public void handleOnBackStarted(c backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.f55250a;
    }

    public final void remove() {
        Iterator it = this.f55251b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).cancel();
        }
    }

    public final void removeCancellable(d cancellable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cancellable, "cancellable");
        this.f55251b.remove(cancellable);
    }

    public final void setEnabled(boolean z10) {
        this.f55250a = z10;
        kv.a aVar = this.f55252c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(kv.a aVar) {
        this.f55252c = aVar;
    }

    public void handleOnBackCancelled() {
    }
}
