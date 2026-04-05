package u1;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final List f87631a;

    /* renamed from: b, reason: collision with root package name */
    public final g f87632b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87633c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87634d;

    /* renamed from: e, reason: collision with root package name */
    public int f87635e;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(java.util.List<u1.c0> r4, u1.g r5) {
        /*
            r3 = this;
            java.lang.String r0 = "changes"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            r3.<init>()
            r3.f87631a = r4
            r3.f87632b = r5
            android.view.MotionEvent r5 = r3.getMotionEvent$ui_release()
            r0 = 0
            if (r5 == 0) goto L18
            int r5 = r5.getButtonState()
            goto L19
        L18:
            r5 = r0
        L19:
            int r5 = u1.l.m7337constructorimpl(r5)
            r3.f87633c = r5
            android.view.MotionEvent r5 = r3.getMotionEvent$ui_release()
            if (r5 == 0) goto L2a
            int r5 = r5.getMetaState()
            goto L2b
        L2a:
            r5 = r0
        L2b:
            int r5 = u1.x0.m7384constructorimpl(r5)
            r3.f87634d = r5
            android.view.MotionEvent r5 = r3.getMotionEvent$ui_release()
            if (r5 == 0) goto L77
            int r4 = r5.getActionMasked()
            if (r4 == 0) goto L70
            r5 = 1
            if (r4 == r5) goto L69
            r5 = 2
            if (r4 == r5) goto L62
            switch(r4) {
                case 5: goto L70;
                case 6: goto L69;
                case 7: goto L62;
                case 8: goto L5b;
                case 9: goto L54;
                case 10: goto L4d;
                default: goto L46;
            }
        L46:
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7355getUnknown7fucELk()
            goto La6
        L4d:
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7350getExit7fucELk()
            goto La6
        L54:
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7349getEnter7fucELk()
            goto La6
        L5b:
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7354getScroll7fucELk()
            goto La6
        L62:
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7351getMove7fucELk()
            goto La6
        L69:
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7353getRelease7fucELk()
            goto La6
        L70:
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7352getPress7fucELk()
            goto La6
        L77:
            int r5 = r4.size()
        L7b:
            if (r0 >= r5) goto La0
            java.lang.Object r1 = r4.get(r0)
            u1.c0 r1 = (u1.c0) r1
            boolean r2 = u1.n.changedToUpIgnoreConsumed(r1)
            if (r2 == 0) goto L90
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7353getRelease7fucELk()
            goto La6
        L90:
            boolean r1 = u1.n.changedToDownIgnoreConsumed(r1)
            if (r1 == 0) goto L9d
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7352getPress7fucELk()
            goto La6
        L9d:
            int r0 = r0 + 1
            goto L7b
        La0:
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7351getMove7fucELk()
        La6:
            r3.f87635e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.m.<init>(java.util.List, u1.g):void");
    }

    public final List<c0> component1() {
        return this.f87631a;
    }

    public final m copy(List<c0> changes, MotionEvent motionEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(changes, "changes");
        if (motionEvent == null) {
            return new m(changes, null);
        }
        boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(motionEvent, getMotionEvent$ui_release());
        g gVar = this.f87632b;
        if (zAreEqual) {
            return new m(changes, gVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = changes.get(i10);
            linkedHashMap.put(b0.m7255boximpl(c0Var.m7294getIdJ3iCeTQ()), c0Var);
        }
        ArrayList arrayList = new ArrayList(changes.size());
        int size2 = changes.size();
        int i11 = 0;
        while (i11 < size2) {
            c0 c0Var2 = changes.get(i11);
            int i12 = size2;
            arrayList.add(new f0(c0Var2.m7294getIdJ3iCeTQ(), c0Var2.getUptimeMillis(), c0Var2.m7295getPositionF1C5BW0(), c0Var2.m7295getPositionF1C5BW0(), c0Var2.getPressed(), c0Var2.m7298getTypeT8wyACA(), gVar != null && gVar.m7315issuesEnterExitEvent0FcD4WY(c0Var2.m7294getIdJ3iCeTQ()), null, 0L, 384, null));
            i11++;
            size2 = i12;
        }
        return new m(changes, new g(linkedHashMap, new e0(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m7343getButtonsry648PA() {
        return this.f87633c;
    }

    public final List<c0> getChanges() {
        return this.f87631a;
    }

    public final g getInternalPointerEvent$ui_release() {
        return this.f87632b;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m7344getKeyboardModifiersk7X9c1A() {
        return this.f87634d;
    }

    public final MotionEvent getMotionEvent$ui_release() {
        g gVar = this.f87632b;
        if (gVar != null) {
            return gVar.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk, reason: not valid java name */
    public final int m7345getType7fucELk() {
        return this.f87635e;
    }

    /* renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m7346setTypeEhbLWgg$ui_release(int i10) {
        this.f87635e = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(List<c0> changes) {
        this(changes, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(changes, "changes");
    }
}
