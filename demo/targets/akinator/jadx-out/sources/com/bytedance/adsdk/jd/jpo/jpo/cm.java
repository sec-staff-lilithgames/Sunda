package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.jd.jpo.jd.jpo;
import com.bytedance.adsdk.jd.wqx.jpo.Cif;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements jpo.InterfaceC0058jpo, au, my {

    /* renamed from: cm, reason: collision with root package name */
    private final Path f17318cm;

    /* renamed from: jd, reason: collision with root package name */
    private final RectF f17319jd;

    /* renamed from: jj, reason: collision with root package name */
    private final String f17320jj;
    private final Paint jpo;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.hna f17321ju;
    private final RectF my;

    /* renamed from: qk, reason: collision with root package name */
    private final boolean f17322qk;
    private final Matrix wqx;
    private final List<wqx> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private List<au> f17323yd;
    private final com.bytedance.adsdk.jd.zz zz;

    public cm(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.hna hnaVar, com.bytedance.adsdk.jd.qk qkVar) {
        this(zzVar, jpoVar, hnaVar.jpo(), hnaVar.wqx(), jpo(zzVar, qkVar, jpoVar, hnaVar.jd()), jpo(hnaVar.jd()));
    }

    private static List<wqx> jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, List<com.bytedance.adsdk.jd.wqx.jd.wqx> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            wqx wqxVarJpo = list.get(i10).jpo(zzVar, qkVar, jpoVar);
            if (wqxVarJpo != null) {
                arrayList.add(wqxVarJpo);
            }
        }
        return arrayList;
    }

    private boolean my() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.xyk.size(); i11++) {
            if ((this.xyk.get(i11) instanceof my) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.au
    public Path cm() {
        this.wqx.reset();
        com.bytedance.adsdk.jd.jpo.jd.hna hnaVar = this.f17321ju;
        if (hnaVar != null) {
            this.wqx.set(hnaVar.cm());
        }
        this.f17318cm.reset();
        if (this.f17322qk) {
            return this.f17318cm;
        }
        for (int size = this.xyk.size() - 1; size >= 0; size--) {
            wqx wqxVar = this.xyk.get(size);
            if (wqxVar instanceof au) {
                this.f17318cm.addPath(((au) wqxVar).cm(), this.wqx);
            }
        }
        return this.f17318cm;
    }

    public List<au> jd() {
        if (this.f17323yd == null) {
            this.f17323yd = new ArrayList();
            for (int i10 = 0; i10 < this.xyk.size(); i10++) {
                wqx wqxVar = this.xyk.get(i10);
                if (wqxVar instanceof au) {
                    this.f17323yd.add((au) wqxVar);
                }
            }
        }
        return this.f17323yd;
    }

    public Matrix wqx() {
        com.bytedance.adsdk.jd.jpo.jd.hna hnaVar = this.f17321ju;
        if (hnaVar != null) {
            return hnaVar.cm();
        }
        this.wqx.reset();
        return this.wqx;
    }

    public cm(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, String str, boolean z10, List<wqx> list, Cif cif) {
        this.jpo = new com.bytedance.adsdk.jd.jpo.jpo();
        this.f17319jd = new RectF();
        this.wqx = new Matrix();
        this.f17318cm = new Path();
        this.my = new RectF();
        this.f17320jj = str;
        this.zz = zzVar;
        this.f17322qk = z10;
        this.xyk = list;
        if (cif != null) {
            com.bytedance.adsdk.jd.jpo.jd.hna hnaVarYd = cif.yd();
            this.f17321ju = hnaVarYd;
            hnaVarYd.jpo(jpoVar);
            this.f17321ju.jpo(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            wqx wqxVar = list.get(size);
            if (wqxVar instanceof yd) {
                arrayList.add((yd) wqxVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((yd) arrayList.get(size2)).jpo(list.listIterator(list.size()));
        }
    }

    public static Cif jpo(List<com.bytedance.adsdk.jd.wqx.jd.wqx> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.adsdk.jd.wqx.jd.wqx wqxVar = list.get(i10);
            if (wqxVar instanceof Cif) {
                return (Cif) wqxVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        this.zz.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    public void jpo(List<wqx> list, List<wqx> list2) {
        ArrayList arrayList = new ArrayList(this.xyk.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.xyk.size() - 1; size >= 0; size--) {
            wqx wqxVar = this.xyk.get(size);
            wqxVar.jpo(arrayList, this.xyk.subList(0, size));
            arrayList.add(wqxVar);
        }
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(Canvas canvas, Matrix matrix, int i10) {
        if (this.f17322qk) {
            return;
        }
        this.wqx.set(matrix);
        com.bytedance.adsdk.jd.jpo.jd.hna hnaVar = this.f17321ju;
        if (hnaVar != null) {
            this.wqx.preConcat(hnaVar.cm());
            i10 = (int) (((((this.f17321ju.jpo() == null ? 100 : this.f17321ju.jpo().qk().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.zz.zz() && my() && i10 != 255;
        if (z10) {
            this.f17319jd.set(0.0f, 0.0f, 0.0f, 0.0f);
            jpo(this.f17319jd, this.wqx, true);
            this.jpo.setAlpha(i10);
            com.bytedance.adsdk.jd.jj.jj.jpo(canvas, this.f17319jd, this.jpo);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.xyk.size() - 1; size >= 0; size--) {
            wqx wqxVar = this.xyk.get(size);
            if (wqxVar instanceof my) {
                ((my) wqxVar).jpo(canvas, this.wqx, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        this.wqx.set(matrix);
        com.bytedance.adsdk.jd.jpo.jd.hna hnaVar = this.f17321ju;
        if (hnaVar != null) {
            this.wqx.preConcat(hnaVar.cm());
        }
        this.my.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.xyk.size() - 1; size >= 0; size--) {
            wqx wqxVar = this.xyk.get(size);
            if (wqxVar instanceof my) {
                ((my) wqxVar).jpo(this.my, this.wqx, z10);
                rectF.union(this.my);
            }
        }
    }
}
