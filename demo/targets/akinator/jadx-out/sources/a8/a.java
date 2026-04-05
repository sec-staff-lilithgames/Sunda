package a8;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import j1.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import r7.a0;
import u7.n;
import u7.w;
import u7.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a implements t7.f, u7.a, x7.g {
    public s7.a A;
    public float B;
    public BlurMaskFilter C;
    public s7.a D;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4157a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f4158b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f4159c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final s7.a f4160d = new s7.a(1);

    /* renamed from: e, reason: collision with root package name */
    public final s7.a f4161e;

    /* renamed from: f, reason: collision with root package name */
    public final s7.a f4162f;

    /* renamed from: g, reason: collision with root package name */
    public final s7.a f4163g;

    /* renamed from: h, reason: collision with root package name */
    public final s7.a f4164h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f4165i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f4166j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f4167k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f4168l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f4169m;

    /* renamed from: n, reason: collision with root package name */
    public final String f4170n;

    /* renamed from: o, reason: collision with root package name */
    public final Matrix f4171o;

    /* renamed from: p, reason: collision with root package name */
    public final a0 f4172p;

    /* renamed from: q, reason: collision with root package name */
    public final f f4173q;

    /* renamed from: r, reason: collision with root package name */
    public final n f4174r;

    /* renamed from: s, reason: collision with root package name */
    public final u7.j f4175s;

    /* renamed from: t, reason: collision with root package name */
    public a f4176t;

    /* renamed from: u, reason: collision with root package name */
    public a f4177u;

    /* renamed from: v, reason: collision with root package name */
    public List f4178v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f4179w;

    /* renamed from: x, reason: collision with root package name */
    public final x f4180x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4181y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4182z;

    public a(a0 a0Var, f fVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f4161e = new s7.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f4162f = new s7.a(1, mode2);
        s7.a aVar = new s7.a(1);
        this.f4163g = aVar;
        this.f4164h = new s7.a(PorterDuff.Mode.CLEAR);
        this.f4165i = new RectF();
        this.f4166j = new RectF();
        this.f4167k = new RectF();
        this.f4168l = new RectF();
        this.f4169m = new RectF();
        this.f4171o = new Matrix();
        this.f4179w = new ArrayList();
        this.f4181y = true;
        this.B = 0.0f;
        this.f4172p = a0Var;
        this.f4173q = fVar;
        StringBuilder sb2 = new StringBuilder();
        String name = fVar.getName();
        List list = fVar.f4197h;
        this.f4170n = o2.o(sb2, name, "#draw");
        if (fVar.f4210u == e.f4188c) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        x xVarCreateAnimation = fVar.f4198i.createAnimation();
        this.f4180x = xVarCreateAnimation;
        xVarCreateAnimation.addListener(this);
        if (list != null && !list.isEmpty()) {
            n nVar = new n(list);
            this.f4174r = nVar;
            Iterator<u7.f> it = nVar.getMaskAnimations().iterator();
            while (it.hasNext()) {
                it.next().addUpdateListener(this);
            }
            for (u7.f fVar2 : this.f4174r.getOpacityAnimations()) {
                addAnimation(fVar2);
                fVar2.addUpdateListener(this);
            }
        }
        f fVar3 = this.f4173q;
        if (fVar3.f4209t.isEmpty()) {
            if (true != this.f4181y) {
                this.f4181y = true;
                this.f4172p.invalidateSelf();
                return;
            }
            return;
        }
        u7.j jVar = new u7.j(fVar3.f4209t);
        this.f4175s = jVar;
        jVar.setIsDiscrete();
        this.f4175s.addUpdateListener(new w(this, 3));
        boolean z10 = ((Float) this.f4175s.getValue()).floatValue() == 1.0f;
        if (z10 != this.f4181y) {
            this.f4181y = z10;
            this.f4172p.invalidateSelf();
        }
        addAnimation(this.f4175s);
    }

    public final void a() {
        if (this.f4178v != null) {
            return;
        }
        if (this.f4177u == null) {
            this.f4178v = Collections.EMPTY_LIST;
            return;
        }
        this.f4178v = new ArrayList();
        for (a aVar = this.f4177u; aVar != null; aVar = aVar.f4177u) {
            this.f4178v.add(aVar);
        }
    }

    public void addAnimation(u7.f fVar) {
        if (fVar == null) {
            return;
        }
        this.f4179w.add(fVar);
    }

    @Override // x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        this.f4180x.applyValueCallback(t10, cVar);
    }

    public final void b(Canvas canvas) {
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("Layer#clearLayer");
        }
        RectF rectF = this.f4165i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f4164h);
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("Layer#clearLayer");
        }
    }

    public final boolean c() {
        n nVar = this.f4174r;
        return (nVar == null || nVar.getMaskAnimations().isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f3  */
    @Override // t7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29, e8.b r30) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.a.draw(android.graphics.Canvas, android.graphics.Matrix, int, e8.b):void");
    }

    public abstract void drawLayer(Canvas canvas, Matrix matrix, int i10, e8.b bVar);

    public z7.h getBlendMode() {
        return this.f4173q.getBlendMode();
    }

    public z7.a getBlurEffect() {
        return this.f4173q.getBlurEffect();
    }

    public BlurMaskFilter getBlurMaskFilter(float f10) {
        if (this.B == f10) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f10;
        return blurMaskFilter;
    }

    @Override // t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        this.f4165i.set(0.0f, 0.0f, 0.0f, 0.0f);
        a();
        Matrix matrix2 = this.f4171o;
        matrix2.set(matrix);
        if (z10) {
            List list = this.f4178v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((a) this.f4178v.get(size)).f4180x.getMatrix());
                }
            } else {
                a aVar = this.f4177u;
                if (aVar != null) {
                    matrix2.preConcat(aVar.f4180x.getMatrix());
                }
            }
        }
        matrix2.preConcat(this.f4180x.getMatrix());
    }

    public c8.j getDropShadowEffect() {
        return this.f4173q.getDropShadowEffect();
    }

    @Override // t7.f, t7.d
    public String getName() {
        return this.f4173q.getName();
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f4172p.invalidateSelf();
    }

    public void removeAnimation(u7.f fVar) {
        this.f4179w.remove(fVar);
    }

    @Override // x7.g
    public void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2) {
        a aVar = this.f4176t;
        if (aVar != null) {
            x7.f fVarAddKey = fVar2.addKey(aVar.getName());
            if (fVar.fullyResolvesTo(this.f4176t.getName(), i10)) {
                list.add(fVarAddKey.resolve(this.f4176t));
            }
            if (fVar.matches(this.f4176t.getName(), i10) && fVar.propagateToChildren(getName(), i10)) {
                this.f4176t.d(fVar, fVar.incrementDepthBy(this.f4176t.getName(), i10) + i10, list, fVarAddKey);
            }
        }
        if (fVar.matches(getName(), i10)) {
            if (!"__container".equals(getName())) {
                fVar2 = fVar2.addKey(getName());
                if (fVar.fullyResolvesTo(getName(), i10)) {
                    list.add(fVar2.resolve(this));
                }
            }
            if (fVar.propagateToChildren(getName(), i10)) {
                d(fVar, fVar.incrementDepthBy(getName(), i10) + i10, list, fVar2);
            }
        }
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        if (z10 && this.A == null) {
            this.A = new s7.a();
        }
        this.f4182z = z10;
    }

    public void setProgress(float f10) {
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("BaseLayer#setProgress");
            r7.d.beginSection("BaseLayer#setProgress.transform");
        }
        this.f4180x.setProgress(f10);
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("BaseLayer#setProgress.transform");
        }
        n nVar = this.f4174r;
        if (nVar != null) {
            if (r7.d.isTraceEnabled()) {
                r7.d.beginSection("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < nVar.getMaskAnimations().size(); i10++) {
                nVar.getMaskAnimations().get(i10).setProgress(f10);
            }
            if (r7.d.isTraceEnabled()) {
                r7.d.endSection("BaseLayer#setProgress.mask");
            }
        }
        if (this.f4175s != null) {
            if (r7.d.isTraceEnabled()) {
                r7.d.beginSection("BaseLayer#setProgress.inout");
            }
            this.f4175s.setProgress(f10);
            if (r7.d.isTraceEnabled()) {
                r7.d.endSection("BaseLayer#setProgress.inout");
            }
        }
        if (this.f4176t != null) {
            if (r7.d.isTraceEnabled()) {
                r7.d.beginSection("BaseLayer#setProgress.matte");
            }
            this.f4176t.setProgress(f10);
            if (r7.d.isTraceEnabled()) {
                r7.d.endSection("BaseLayer#setProgress.matte");
            }
        }
        boolean zIsTraceEnabled = r7.d.isTraceEnabled();
        ArrayList arrayList = this.f4179w;
        if (zIsTraceEnabled) {
            r7.d.beginSection("BaseLayer#setProgress.animations." + arrayList.size());
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((u7.f) arrayList.get(i11)).setProgress(f10);
        }
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("BaseLayer#setProgress.animations." + arrayList.size());
            r7.d.endSection("BaseLayer#setProgress");
        }
    }

    @Override // t7.f, t7.d
    public void setContents(List<t7.d> list, List<t7.d> list2) {
    }

    public void d(x7.f fVar, int i10, List list, x7.f fVar2) {
    }
}
