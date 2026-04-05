package u1;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final r0.c f87619a = new r0.c(new j[16], 0);

    public boolean buildCache(Map<b0, c0> changes, x1.d0 parentCoordinates, g internalPointerEvent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(changes, "changes");
        kotlin.jvm.internal.e0.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.e0.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        r0.c cVar = this.f87619a;
        int size = cVar.getSize();
        if (size <= 0) {
            return false;
        }
        Object[] content = cVar.getContent();
        int i10 = 0;
        boolean z11 = false;
        do {
            z11 = ((j) content[i10]).buildCache(changes, parentCoordinates, internalPointerEvent, z10) || z11;
            i10++;
        } while (i10 < size);
        return z11;
    }

    public void cleanUpHits(g internalPointerEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        r0.c cVar = this.f87619a;
        int size = cVar.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (((j) cVar.getContent()[size]).getPointerIds().isEmpty()) {
                cVar.removeAt(size);
            }
        }
    }

    public final void clear() {
        this.f87619a.clear();
    }

    public void dispatchCancel() {
        r0.c cVar = this.f87619a;
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            do {
                ((j) content[i10]).dispatchCancel();
                i10++;
            } while (i10 < size);
        }
    }

    public boolean dispatchFinalEventPass(g internalPointerEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        r0.c cVar = this.f87619a;
        int size = cVar.getSize();
        boolean z10 = false;
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            boolean z11 = false;
            do {
                z11 = ((j) content[i10]).dispatchFinalEventPass(internalPointerEvent) || z11;
                i10++;
            } while (i10 < size);
            z10 = z11;
        }
        cleanUpHits(internalPointerEvent);
        return z10;
    }

    public boolean dispatchMainEventPass(Map<b0, c0> changes, x1.d0 parentCoordinates, g internalPointerEvent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(changes, "changes");
        kotlin.jvm.internal.e0.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.e0.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        r0.c cVar = this.f87619a;
        int size = cVar.getSize();
        if (size <= 0) {
            return false;
        }
        Object[] content = cVar.getContent();
        int i10 = 0;
        boolean z11 = false;
        do {
            z11 = ((j) content[i10]).dispatchMainEventPass(changes, parentCoordinates, internalPointerEvent, z10) || z11;
            i10++;
        } while (i10 < size);
        return z11;
    }

    public final r0.c getChildren() {
        return this.f87619a;
    }

    public final void removeDetachedPointerInputFilters() {
        int i10 = 0;
        while (true) {
            r0.c cVar = this.f87619a;
            if (i10 >= cVar.getSize()) {
                return;
            }
            j jVar = (j) cVar.getContent()[i10];
            if (jVar.getPointerInputFilter().isAttached$ui_release()) {
                i10++;
                jVar.removeDetachedPointerInputFilters();
            } else {
                cVar.removeAt(i10);
                jVar.dispatchCancel();
            }
        }
    }
}
