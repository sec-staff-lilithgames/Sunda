package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Path;
import com.bytedance.adsdk.jd.wqx.jd.zz;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.adsdk.jd.jpo.jpo.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif implements au, yd {

    /* renamed from: cm, reason: collision with root package name */
    private final String f17329cm;

    /* renamed from: jj, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jd.zz f17331jj;
    private final Path jpo = new Path();

    /* renamed from: jd, reason: collision with root package name */
    private final Path f17330jd = new Path();
    private final Path wqx = new Path();
    private final List<au> my = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jd.jpo.jpo.if$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[zz.jpo.values().length];
            jpo = iArr;
            try {
                iArr[zz.jpo.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[zz.jpo.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jpo[zz.jpo.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                jpo[zz.jpo.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                jpo[zz.jpo.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public Cif(com.bytedance.adsdk.jd.wqx.jd.zz zzVar) {
        this.f17329cm = zzVar.jpo();
        this.f17331jj = zzVar;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.au
    public Path cm() {
        this.wqx.reset();
        if (this.f17331jj.wqx()) {
            return this.wqx;
        }
        int i10 = AnonymousClass1.jpo[this.f17331jj.jd().ordinal()];
        if (i10 == 1) {
            jpo();
        } else if (i10 == 2) {
            jpo(Path.Op.UNION);
        } else if (i10 == 3) {
            jpo(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            jpo(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            jpo(Path.Op.XOR);
        }
        return this.wqx;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.yd
    public void jpo(ListIterator<wqx> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            wqx wqxVarPrevious = listIterator.previous();
            if (wqxVarPrevious instanceof au) {
                this.my.add((au) wqxVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    public void jpo(List<wqx> list, List<wqx> list2) {
        for (int i10 = 0; i10 < this.my.size(); i10++) {
            this.my.get(i10).jpo(list, list2);
        }
    }

    private void jpo() {
        for (int i10 = 0; i10 < this.my.size(); i10++) {
            this.wqx.addPath(this.my.get(i10).cm());
        }
    }

    private void jpo(Path.Op op2) {
        this.f17330jd.reset();
        this.jpo.reset();
        for (int size = this.my.size() - 1; size > 0; size--) {
            au auVar = this.my.get(size);
            if (auVar instanceof cm) {
                cm cmVar = (cm) auVar;
                List<au> listJd = cmVar.jd();
                for (int size2 = listJd.size() - 1; size2 >= 0; size2--) {
                    Path pathCm = listJd.get(size2).cm();
                    pathCm.transform(cmVar.wqx());
                    this.f17330jd.addPath(pathCm);
                }
            } else {
                this.f17330jd.addPath(auVar.cm());
            }
        }
        au auVar2 = this.my.get(0);
        if (auVar2 instanceof cm) {
            cm cmVar2 = (cm) auVar2;
            List<au> listJd2 = cmVar2.jd();
            for (int i10 = 0; i10 < listJd2.size(); i10++) {
                Path pathCm2 = listJd2.get(i10).cm();
                pathCm2.transform(cmVar2.wqx());
                this.jpo.addPath(pathCm2);
            }
        } else {
            this.jpo.set(auVar2.cm());
        }
        this.wqx.op(this.jpo, this.f17330jd, op2);
    }
}
