package e6;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import e6.c0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s0 extends c0 {
    public ArrayList R;
    public boolean S;
    public int T;
    public boolean U;
    public int V;

    public s0() {
        this.R = new ArrayList();
        this.S = true;
        this.U = false;
        this.V = 0;
    }

    public s0 addTransition(c0 c0Var) {
        this.R.add(c0Var);
        c0Var.f53777t = this;
        long j10 = this.f53762e;
        if (j10 >= 0) {
            c0Var.setDuration(j10);
        }
        if ((this.V & 1) != 0) {
            c0Var.setInterpolator(getInterpolator());
        }
        if ((this.V & 2) != 0) {
            c0Var.setPropagation(getPropagation());
        }
        if ((this.V & 4) != 0) {
            c0Var.setPathMotion(getPathMotion());
        }
        if ((this.V & 8) != 0) {
            c0Var.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // e6.c0
    public final void c(v0 v0Var) {
        super.c(v0Var);
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) this.R.get(i10)).c(v0Var);
        }
    }

    @Override // e6.c0
    public final void cancel() {
        super.cancel();
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) this.R.get(i10)).cancel();
        }
    }

    @Override // e6.c0
    public void captureEndValues(v0 v0Var) {
        if (l(v0Var.f53875b)) {
            Iterator it = this.R.iterator();
            while (it.hasNext()) {
                c0 c0Var = (c0) it.next();
                if (c0Var.l(v0Var.f53875b)) {
                    c0Var.captureEndValues(v0Var);
                    v0Var.f53876c.add(c0Var);
                }
            }
        }
    }

    @Override // e6.c0
    public void captureStartValues(v0 v0Var) {
        if (l(v0Var.f53875b)) {
            Iterator it = this.R.iterator();
            while (it.hasNext()) {
                c0 c0Var = (c0) it.next();
                if (c0Var.l(v0Var.f53875b)) {
                    c0Var.captureStartValues(v0Var);
                    v0Var.f53876c.add(c0Var);
                }
            }
        }
    }

    @Override // e6.c0
    public c0 excludeTarget(View view, boolean z10) {
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            ((c0) this.R.get(i10)).excludeTarget(view, z10);
        }
        return super.excludeTarget(view, z10);
    }

    @Override // e6.c0
    public final void f(ViewGroup viewGroup, w0 w0Var, w0 w0Var2, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) this.R.get(i10);
            if (startDelay > 0 && (this.S || i10 == 0)) {
                long startDelay2 = c0Var.getStartDelay();
                if (startDelay2 > 0) {
                    c0Var.setStartDelay(startDelay2 + startDelay);
                } else {
                    c0Var.setStartDelay(startDelay);
                }
            }
            c0Var.f(viewGroup, w0Var, w0Var2, arrayList, arrayList2);
        }
    }

    public int getOrdering() {
        return !this.S ? 1 : 0;
    }

    public c0 getTransitionAt(int i10) {
        if (i10 < 0 || i10 >= this.R.size()) {
            return null;
        }
        return (c0) this.R.get(i10);
    }

    public int getTransitionCount() {
        return this.R.size();
    }

    @Override // e6.c0
    public final void h(ViewGroup viewGroup) {
        super.h(viewGroup);
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) this.R.get(i10)).h(viewGroup);
        }
    }

    @Override // e6.c0
    public boolean isSeekingSupported() {
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((c0) this.R.get(i10)).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // e6.c0
    public final boolean k() {
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            if (((c0) this.R.get(i10)).k()) {
                return true;
            }
        }
        return false;
    }

    @Override // e6.c0
    public final void n() {
        this.K = 0L;
        q0 q0Var = new q0(this);
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            c0 c0Var = (c0) this.R.get(i10);
            c0Var.addListener(q0Var);
            c0Var.n();
            long j10 = c0Var.K;
            if (this.S) {
                this.K = Math.max(this.K, j10);
            } else {
                long j11 = this.K;
                c0Var.M = j11;
                this.K = j11 + j10;
            }
        }
    }

    @Override // e6.c0
    public final void o() {
        if (this.R.isEmpty()) {
            r();
            g();
            return;
        }
        r0 r0Var = new r0();
        r0Var.f53872a = this;
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).addListener(r0Var);
        }
        this.T = this.R.size();
        if (this.S) {
            Iterator it2 = this.R.iterator();
            while (it2.hasNext()) {
                ((c0) it2.next()).o();
            }
            return;
        }
        for (int i10 = 1; i10 < this.R.size(); i10++) {
            ((c0) this.R.get(i10 - 1)).addListener(new p0((c0) this.R.get(i10)));
        }
        c0 c0Var = (c0) this.R.get(0);
        if (c0Var != null) {
            c0Var.o();
        }
    }

    @Override // e6.c0
    public final void p() {
        this.f53782y = true;
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) this.R.get(i10)).p();
        }
    }

    @Override // e6.c0
    public void pause(View view) {
        super.pause(view);
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) this.R.get(i10)).pause(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // e6.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.s0.q(long, long):void");
    }

    public s0 removeTransition(c0 c0Var) {
        this.R.remove(c0Var);
        c0Var.f53777t = null;
        return this;
    }

    @Override // e6.c0
    public void resume(View view) {
        super.resume(view);
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) this.R.get(i10)).resume(view);
        }
    }

    @Override // e6.c0
    public final String s(String str) {
        String strS = super.s(str);
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            StringBuilder sbT = a.b.t(strS, "\n");
            sbT.append(((c0) this.R.get(i10)).s(str + "  "));
            strS = sbT.toString();
        }
        return strS;
    }

    @Override // e6.c0
    public void setEpicenterCallback(c0.a aVar) {
        super.setEpicenterCallback(aVar);
        this.V |= 8;
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) this.R.get(i10)).setEpicenterCallback(aVar);
        }
    }

    public s0 setOrdering(int i10) {
        if (i10 == 0) {
            this.S = true;
            return this;
        }
        if (i10 != 1) {
            throw new AndroidRuntimeException(a.b.e(i10, "Invalid parameter for TransitionSet ordering: "));
        }
        this.S = false;
        return this;
    }

    @Override // e6.c0
    public void setPathMotion(u uVar) {
        super.setPathMotion(uVar);
        this.V |= 4;
        if (this.R != null) {
            for (int i10 = 0; i10 < this.R.size(); i10++) {
                ((c0) this.R.get(i10)).setPathMotion(uVar);
            }
        }
    }

    @Override // e6.c0
    public void setPropagation(n0 n0Var) {
        super.setPropagation(n0Var);
        this.V |= 2;
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) this.R.get(i10)).setPropagation(n0Var);
        }
    }

    @Override // e6.c0
    public s0 addListener(g0 g0Var) {
        return (s0) super.addListener(g0Var);
    }

    @Override // e6.c0
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public c0 mo3832clone() {
        s0 s0Var = (s0) super.mo3832clone();
        s0Var.R = new ArrayList();
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0VarMo3832clone = ((c0) this.R.get(i10)).mo3832clone();
            s0Var.R.add(c0VarMo3832clone);
            c0VarMo3832clone.f53777t = s0Var;
        }
        return s0Var;
    }

    @Override // e6.c0
    public s0 removeListener(g0 g0Var) {
        return (s0) super.removeListener(g0Var);
    }

    @Override // e6.c0
    public s0 setDuration(long j10) {
        ArrayList arrayList;
        super.setDuration(j10);
        if (this.f53762e >= 0 && (arrayList = this.R) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((c0) this.R.get(i10)).setDuration(j10);
            }
        }
        return this;
    }

    @Override // e6.c0
    public s0 setInterpolator(TimeInterpolator timeInterpolator) {
        this.V |= 1;
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((c0) this.R.get(i10)).setInterpolator(timeInterpolator);
            }
        }
        return (s0) super.setInterpolator(timeInterpolator);
    }

    @Override // e6.c0
    public s0 setStartDelay(long j10) {
        return (s0) super.setStartDelay(j10);
    }

    @Override // e6.c0
    public /* bridge */ /* synthetic */ c0 addTarget(Class cls) {
        return addTarget((Class<?>) cls);
    }

    @Override // e6.c0
    public /* bridge */ /* synthetic */ c0 removeTarget(Class cls) {
        return removeTarget((Class<?>) cls);
    }

    @Override // e6.c0
    public c0 excludeTarget(String str, boolean z10) {
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            ((c0) this.R.get(i10)).excludeTarget(str, z10);
        }
        return super.excludeTarget(str, z10);
    }

    @Override // e6.c0
    public s0 addTarget(View view) {
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            ((c0) this.R.get(i10)).addTarget(view);
        }
        return (s0) super.addTarget(view);
    }

    @Override // e6.c0
    public s0 removeTarget(int i10) {
        for (int i11 = 0; i11 < this.R.size(); i11++) {
            ((c0) this.R.get(i11)).removeTarget(i10);
        }
        return (s0) super.removeTarget(i10);
    }

    public s0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = new ArrayList();
        this.S = true;
        this.U = false;
        this.V = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.f53891e);
        setOrdering(n3.q.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // e6.c0
    public c0 excludeTarget(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.R.size(); i11++) {
            ((c0) this.R.get(i11)).excludeTarget(i10, z10);
        }
        return super.excludeTarget(i10, z10);
    }

    @Override // e6.c0
    public s0 addTarget(int i10) {
        for (int i11 = 0; i11 < this.R.size(); i11++) {
            ((c0) this.R.get(i11)).addTarget(i10);
        }
        return (s0) super.addTarget(i10);
    }

    @Override // e6.c0
    public s0 removeTarget(View view) {
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            ((c0) this.R.get(i10)).removeTarget(view);
        }
        return (s0) super.removeTarget(view);
    }

    @Override // e6.c0
    public c0 excludeTarget(Class<?> cls, boolean z10) {
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            ((c0) this.R.get(i10)).excludeTarget(cls, z10);
        }
        return super.excludeTarget(cls, z10);
    }

    @Override // e6.c0
    public s0 addTarget(String str) {
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            ((c0) this.R.get(i10)).addTarget(str);
        }
        return (s0) super.addTarget(str);
    }

    @Override // e6.c0
    public s0 removeTarget(Class<?> cls) {
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            ((c0) this.R.get(i10)).removeTarget(cls);
        }
        return (s0) super.removeTarget(cls);
    }

    @Override // e6.c0
    public s0 addTarget(Class<?> cls) {
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            ((c0) this.R.get(i10)).addTarget(cls);
        }
        return (s0) super.addTarget(cls);
    }

    @Override // e6.c0
    public s0 removeTarget(String str) {
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            ((c0) this.R.get(i10)).removeTarget(str);
        }
        return (s0) super.removeTarget(str);
    }
}
