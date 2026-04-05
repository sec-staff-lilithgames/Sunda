package u1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f87607b;

    /* renamed from: c, reason: collision with root package name */
    public final r0.c f87608c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f87609d;

    /* renamed from: e, reason: collision with root package name */
    public x1.d0 f87610e;

    /* renamed from: f, reason: collision with root package name */
    public m f87611f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f87612g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87613h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f87614i;

    public j(i0 pointerInputFilter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pointerInputFilter, "pointerInputFilter");
        this.f87607b = pointerInputFilter;
        this.f87608c = new r0.c(new b0[16], 0);
        this.f87609d = new LinkedHashMap();
        this.f87613h = true;
        this.f87614i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc  */
    @Override // u1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean buildCache(java.util.Map<u1.b0, u1.c0> r36, x1.d0 r37, u1.g r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.j.buildCache(java.util.Map, x1.d0, u1.g, boolean):boolean");
    }

    @Override // u1.k
    public void cleanUpHits(g internalPointerEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.cleanUpHits(internalPointerEvent);
        m mVar = this.f87611f;
        if (mVar == null) {
            return;
        }
        this.f87612g = this.f87613h;
        List<c0> changes = mVar.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = changes.get(i10);
            if (!c0Var.getPressed() && (!internalPointerEvent.m7315issuesEnterExitEvent0FcD4WY(c0Var.m7294getIdJ3iCeTQ()) || !this.f87613h)) {
                this.f87608c.remove(b0.m7255boximpl(c0Var.m7294getIdJ3iCeTQ()));
            }
        }
        this.f87613h = false;
        this.f87614i = r.m7358equalsimpl0(mVar.m7345getType7fucELk(), r.f87659b.m7350getExit7fucELk());
    }

    @Override // u1.k
    public void dispatchCancel() {
        r0.c children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Object[] content = children.getContent();
            int i10 = 0;
            do {
                ((j) content[i10]).dispatchCancel();
                i10++;
            } while (i10 < size);
        }
        this.f87607b.onCancel();
    }

    @Override // u1.k
    public boolean dispatchFinalEventPass(g internalPointerEvent) {
        r0.c children;
        int size;
        kotlin.jvm.internal.e0.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        LinkedHashMap linkedHashMap = this.f87609d;
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        if (!linkedHashMap.isEmpty()) {
            i0 i0Var = this.f87607b;
            if (i0Var.isAttached$ui_release()) {
                m mVar = this.f87611f;
                kotlin.jvm.internal.e0.checkNotNull(mVar);
                x1.d0 d0Var = this.f87610e;
                kotlin.jvm.internal.e0.checkNotNull(d0Var);
                i0Var.mo7319onPointerEventH0pRuoY(mVar, o.f87648e, d0Var.mo7827getSizeYbymL2g());
                if (i0Var.isAttached$ui_release() && (size = (children = getChildren()).getSize()) > 0) {
                    Object[] content = children.getContent();
                    do {
                        ((j) content[i10]).dispatchFinalEventPass(internalPointerEvent);
                        i10++;
                    } while (i10 < size);
                }
                z10 = true;
            }
        }
        cleanUpHits(internalPointerEvent);
        linkedHashMap.clear();
        this.f87610e = null;
        return z10;
    }

    @Override // u1.k
    public boolean dispatchMainEventPass(Map<b0, c0> changes, x1.d0 parentCoordinates, g internalPointerEvent, boolean z10) {
        r0.c children;
        int size;
        kotlin.jvm.internal.e0.checkNotNullParameter(changes, "changes");
        kotlin.jvm.internal.e0.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.e0.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        LinkedHashMap linkedHashMap = this.f87609d;
        int i10 = 0;
        if (!linkedHashMap.isEmpty()) {
            i0 i0Var = this.f87607b;
            if (i0Var.isAttached$ui_release()) {
                m mVar = this.f87611f;
                kotlin.jvm.internal.e0.checkNotNull(mVar);
                x1.d0 d0Var = this.f87610e;
                kotlin.jvm.internal.e0.checkNotNull(d0Var);
                long jMo7827getSizeYbymL2g = d0Var.mo7827getSizeYbymL2g();
                i0Var.mo7319onPointerEventH0pRuoY(mVar, o.f87646b, jMo7827getSizeYbymL2g);
                if (i0Var.isAttached$ui_release() && (size = (children = getChildren()).getSize()) > 0) {
                    Object[] content = children.getContent();
                    do {
                        j jVar = (j) content[i10];
                        x1.d0 d0Var2 = this.f87610e;
                        kotlin.jvm.internal.e0.checkNotNull(d0Var2);
                        jVar.dispatchMainEventPass(linkedHashMap, d0Var2, internalPointerEvent, z10);
                        i10++;
                    } while (i10 < size);
                }
                if (i0Var.isAttached$ui_release()) {
                    i0Var.mo7319onPointerEventH0pRuoY(mVar, o.f87647c, jMo7827getSizeYbymL2g);
                }
                return true;
            }
        }
        return false;
    }

    public final r0.c getPointerIds() {
        return this.f87608c;
    }

    public final i0 getPointerInputFilter() {
        return this.f87607b;
    }

    public final void markIsIn() {
        this.f87613h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f87607b + ", children=" + getChildren() + ", pointerIds=" + this.f87608c + ')';
    }
}
