package com.bytedance.adsdk.jd.wqx.wqx;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.jd.wqx.wqx.my;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jpo {

    /* renamed from: if, reason: not valid java name */
    private boolean f17if;

    /* renamed from: ju, reason: collision with root package name */
    private final Paint f17529ju;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> f17530qk;
    private final List<jpo> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final RectF f17531yd;
    private final RectF zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jd.wqx.wqx.jd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[my.jd.values().length];
            jpo = iArr;
            try {
                iArr[my.jd.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[my.jd.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public jd(com.bytedance.adsdk.jd.zz zzVar, my myVar, List<my> list, com.bytedance.adsdk.jd.qk qkVar, Context context) {
        int i10;
        jpo jpoVar;
        my.jd jdVarM385if;
        int i11;
        super(zzVar, myVar);
        this.xyk = new ArrayList();
        this.zz = new RectF();
        this.f17531yd = new RectF();
        this.f17529ju = new Paint();
        this.f17if = true;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarRq = myVar.rq();
        if (jdVarRq != null) {
            com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo = jdVarRq.jpo();
            this.f17530qk = jpoVarJpo;
            jpo(jpoVarJpo);
            this.f17530qk.jpo(this);
        } else {
            this.f17530qk = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(qkVar.au().size());
        int size = list.size() - 1;
        jpo jpoVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            my myVar2 = list.get(size);
            jpo jpoVarJpo2 = jpo.jpo(this, myVar2, zzVar, qkVar, context);
            if (jpoVarJpo2 != null) {
                longSparseArray.put(jpoVarJpo2.jd().my(), jpoVarJpo2);
                if (jpoVar2 != null) {
                    jpoVar2.jpo(jpoVarJpo2);
                    jpoVar2 = null;
                } else {
                    this.xyk.add(0, jpoVarJpo2);
                    if (myVar2 != null && (jdVarM385if = myVar2.m385if()) != null && ((i11 = AnonymousClass1.jpo[jdVarM385if.ordinal()]) == 1 || i11 == 2)) {
                        jpoVar2 = jpoVarJpo2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < longSparseArray.size(); i10++) {
            jpo jpoVar3 = (jpo) longSparseArray.get(longSparseArray.keyAt(i10));
            if (jpoVar3 != null && (jpoVar = (jpo) longSparseArray.get(jpoVar3.jd().au())) != null) {
                jpoVar3.jd(jpoVar);
            }
        }
    }

    /* renamed from: if, reason: not valid java name */
    public List<jpo> m383if() {
        return this.xyk;
    }

    public void jd(boolean z10) {
        this.f17if = z10;
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo
    public void jpo(boolean z10) {
        super.jpo(z10);
        Iterator<jpo> it = this.xyk.iterator();
        while (it.hasNext()) {
            it.next().jpo(z10);
        }
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo
    public void jd(Canvas canvas, Matrix matrix, int i10) {
        super.jd(canvas, matrix, i10);
        com.bytedance.adsdk.jd.my.jpo("CompositionLayer#draw");
        this.f17531yd.set(0.0f, 0.0f, this.wqx.xyk(), this.wqx.zz());
        matrix.mapRect(this.f17531yd);
        boolean z10 = this.f17536jd.zz() && this.xyk.size() > 1 && i10 != 255;
        if (z10) {
            this.f17529ju.setAlpha(i10);
            com.bytedance.adsdk.jd.jj.jj.jpo(canvas, this.f17531yd, this.f17529ju);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.xyk.size() - 1; size >= 0; size--) {
            if (((this.f17if || !"__container".equals(this.wqx.jj())) && !this.f17531yd.isEmpty()) ? canvas.clipRect(this.f17531yd) : true) {
                this.xyk.get(size).jpo(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.jd.my.jd("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo, com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        super.jpo(rectF, matrix, z10);
        for (int size = this.xyk.size() - 1; size >= 0; size--) {
            this.zz.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.xyk.get(size).jpo(this.zz, this.jpo, true);
            rectF.union(this.zz);
        }
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo
    public void jpo(float f10) {
        super.jpo(f10);
        if (this.f17530qk != null) {
            f10 = ((this.wqx.jpo().m380if() * this.f17530qk.qk().floatValue()) - this.wqx.jpo().jj()) / (this.f17536jd.se().sq() + 0.01f);
        }
        if (this.f17530qk == null) {
            f10 -= this.wqx.wqx();
        }
        if (this.wqx.jd() != 0.0f && !"__container".equals(this.wqx.jj())) {
            f10 /= this.wqx.jd();
        }
        for (int size = this.xyk.size() - 1; size >= 0; size--) {
            this.xyk.get(size).jpo(f10);
        }
    }
}
