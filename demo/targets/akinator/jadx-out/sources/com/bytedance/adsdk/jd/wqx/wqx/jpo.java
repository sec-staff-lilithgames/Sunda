package com.bytedance.adsdk.jd.wqx.wqx;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.jd.jpo.jd.hna;
import com.bytedance.adsdk.jd.jpo.jd.jpo;
import com.bytedance.adsdk.jd.wqx.jd.oya;
import com.bytedance.adsdk.jd.wqx.jd.xyk;
import com.bytedance.adsdk.jd.wqx.wqx.my;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo implements jpo.InterfaceC0058jpo, com.bytedance.adsdk.jd.jpo.jpo.my {

    /* renamed from: au, reason: collision with root package name */
    private final Paint f17532au;

    /* renamed from: cm, reason: collision with root package name */
    final hna f17533cm;

    /* renamed from: dt, reason: collision with root package name */
    private jpo f17534dt;
    private jpo hmu;
    private final RectF hna;

    /* renamed from: hx, reason: collision with root package name */
    private boolean f17535hx;

    /* renamed from: if, reason: not valid java name */
    private final Paint f18if;

    /* renamed from: jd, reason: collision with root package name */
    final com.bytedance.adsdk.jd.zz f17536jd;

    /* renamed from: jj, reason: collision with root package name */
    BlurMaskFilter f17537jj;
    final Matrix jpo;

    /* renamed from: jr, reason: collision with root package name */
    private final RectF f17538jr;

    /* renamed from: ju, reason: collision with root package name */
    private final Paint f17539ju;
    float my;
    private final String nmd;

    /* renamed from: nq, reason: collision with root package name */
    private List<jpo> f17540nq;
    private final RectF opi;
    private final Paint oya;
    private boolean pdm;
    private final RectF prr;

    /* renamed from: rq, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.xyk f17542rq;

    /* renamed from: rv, reason: collision with root package name */
    private Paint f17543rv;

    /* renamed from: se, reason: collision with root package name */
    private final List<com.bytedance.adsdk.jd.jpo.jd.jpo<?, ?>> f17544se;

    /* renamed from: sq, reason: collision with root package name */
    private final RectF f17545sq;
    private float sz;

    /* renamed from: tu, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.cm f17546tu;

    /* renamed from: uu, reason: collision with root package name */
    private final Matrix f17547uu;
    final my wqx;

    /* renamed from: qk, reason: collision with root package name */
    private final Path f17541qk = new Path();
    private final Matrix xyk = new Matrix();
    private final Matrix zz = new Matrix();

    /* renamed from: yd, reason: collision with root package name */
    private final Paint f17548yd = new com.bytedance.adsdk.jd.jpo.jpo(1);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jd.wqx.wqx.jpo$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: jd, reason: collision with root package name */
        static final /* synthetic */ int[] f17549jd;
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[xyk.jpo.values().length];
            f17549jd = iArr;
            try {
                iArr[xyk.jpo.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17549jd[xyk.jpo.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17549jd[xyk.jpo.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17549jd[xyk.jpo.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[my.jpo.values().length];
            jpo = iArr2;
            try {
                iArr2[my.jpo.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                jpo[my.jpo.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                jpo[my.jpo.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                jpo[my.jpo.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                jpo[my.jpo.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                jpo[my.jpo.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                jpo[my.jpo.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public jpo(com.bytedance.adsdk.jd.zz zzVar, my myVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f17539ju = new com.bytedance.adsdk.jd.jpo.jpo(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f18if = new com.bytedance.adsdk.jd.jpo.jpo(1, mode2);
        com.bytedance.adsdk.jd.jpo.jpo jpoVar = new com.bytedance.adsdk.jd.jpo.jpo(1);
        this.f17532au = jpoVar;
        this.oya = new com.bytedance.adsdk.jd.jpo.jpo(PorterDuff.Mode.CLEAR);
        this.prr = new RectF();
        this.hna = new RectF();
        this.f17545sq = new RectF();
        this.opi = new RectF();
        this.f17538jr = new RectF();
        this.jpo = new Matrix();
        this.f17544se = new ArrayList();
        this.f17535hx = true;
        this.my = 0.0f;
        this.f17547uu = new Matrix();
        this.sz = 1.0f;
        this.f17536jd = zzVar;
        this.wqx = myVar;
        this.nmd = myVar.jj() + "#draw";
        if (myVar.m385if() == my.jd.INVERT) {
            jpoVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            jpoVar.setXfermode(new PorterDuffXfermode(mode));
        }
        hna hnaVarYd = myVar.prr().yd();
        this.f17533cm = hnaVarYd;
        hnaVarYd.jpo((jpo.InterfaceC0058jpo) this);
        if (myVar.yd() != null && !myVar.yd().isEmpty()) {
            com.bytedance.adsdk.jd.jpo.jd.xyk xykVar = new com.bytedance.adsdk.jd.jpo.jd.xyk(myVar.yd());
            this.f17542rq = xykVar;
            Iterator<com.bytedance.adsdk.jd.jpo.jd.jpo<oya, Path>> it = xykVar.jd().iterator();
            while (it.hasNext()) {
                it.next().jpo(this);
            }
            for (com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar2 : this.f17542rq.wqx()) {
                jpo(jpoVar2);
                jpoVar2.jpo(this);
            }
        }
        m384if();
    }

    private void au() {
        this.f17536jd.invalidateSelf();
    }

    /* renamed from: if, reason: not valid java name */
    private void m384if() {
        if (this.wqx.cm().isEmpty()) {
            jd(true);
            return;
        }
        com.bytedance.adsdk.jd.jpo.jd.cm cmVar = new com.bytedance.adsdk.jd.jpo.jd.cm(this.wqx.cm());
        this.f17546tu = cmVar;
        cmVar.jpo();
        this.f17546tu.jpo(new jpo.InterfaceC0058jpo() { // from class: com.bytedance.adsdk.jd.wqx.wqx.jpo.1
            @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
            public void jpo() {
                jpo jpoVar = jpo.this;
                jpoVar.jd(jpoVar.f17546tu.zz() == 1.0f);
            }
        });
        jd(this.f17546tu.qk().floatValue() == 1.0f);
        jpo(this.f17546tu);
    }

    private boolean oya() {
        if (this.f17542rq.jd().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f17542rq.jpo().size(); i10++) {
            if (this.f17542rq.jpo().get(i10).jpo() != xyk.jpo.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void prr() {
        if (this.f17540nq != null) {
            return;
        }
        if (this.hmu == null) {
            this.f17540nq = Collections.EMPTY_LIST;
            return;
        }
        this.f17540nq = new ArrayList();
        for (jpo jpoVar = this.hmu; jpoVar != null; jpoVar = jpoVar.hmu) {
            this.f17540nq.add(jpoVar);
        }
    }

    public Matrix cm() {
        return this.f17547uu;
    }

    public my jd() {
        return this.wqx;
    }

    public float jj() {
        return this.sz;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    public void jpo(List<com.bytedance.adsdk.jd.jpo.jpo.wqx> list, List<com.bytedance.adsdk.jd.jpo.jpo.wqx> list2) {
    }

    public com.bytedance.adsdk.jd.my.yd ju() {
        return this.wqx.hmu();
    }

    public String my() {
        my myVar = this.wqx;
        if (myVar != null) {
            return myVar.qk();
        }
        return null;
    }

    public boolean qk() {
        com.bytedance.adsdk.jd.jpo.jd.xyk xykVar = this.f17542rq;
        return (xykVar == null || xykVar.jd().isEmpty()) ? false : true;
    }

    public boolean xyk() {
        return this.f17535hx;
    }

    public com.bytedance.adsdk.jd.wqx.jd.jpo yd() {
        return this.wqx.dt();
    }

    public String zz() {
        return this.wqx.jj();
    }

    private void cm(Canvas canvas, Matrix matrix, com.bytedance.adsdk.jd.jpo.jd.jpo<oya, Path> jpoVar, com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar2) {
        com.bytedance.adsdk.jd.jj.jj.jpo(canvas, this.prr, this.f17539ju);
        this.f17541qk.set(jpoVar.qk());
        this.f17541qk.transform(matrix);
        this.f17548yd.setAlpha((int) (jpoVar2.qk().intValue() * 2.55f));
        canvas.drawPath(this.f17541qk, this.f17548yd);
        canvas.restore();
    }

    public void jd(jpo jpoVar) {
        this.hmu = jpoVar;
    }

    public boolean wqx() {
        return this.f17534dt != null;
    }

    private void jd(RectF rectF, Matrix matrix) {
        if (wqx() && this.wqx.m385if() != my.jd.INVERT) {
            this.opi.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f17534dt.jpo(this.opi, matrix, true);
            if (rectF.intersect(this.opi)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public static jpo jpo(jd jdVar, my myVar, com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, Context context) {
        switch (AnonymousClass2.jpo[myVar.ju().ordinal()]) {
            case 1:
                return new qk(zzVar, myVar, jdVar, qkVar);
            case 2:
                return new jd(zzVar, myVar, qkVar.jd(myVar.qk()), qkVar, context);
            case 3:
                return new xyk(zzVar, myVar);
            case 4:
                if (jpo(zzVar, myVar, "text:")) {
                    return new wqx(zzVar, myVar, context);
                }
                if (jpo(zzVar, myVar, "videoview:")) {
                    return new yd(zzVar, myVar, context);
                }
                return new cm(zzVar, myVar);
            case 5:
                return new jj(zzVar, myVar);
            case 6:
                return new zz(zzVar, myVar);
            default:
                Objects.toString(myVar.ju());
                return null;
        }
    }

    private void my(Canvas canvas, Matrix matrix, com.bytedance.adsdk.jd.jpo.jd.jpo<oya, Path> jpoVar, com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar2) {
        com.bytedance.adsdk.jd.jj.jj.jpo(canvas, this.prr, this.f17539ju);
        canvas.drawRect(this.prr, this.f17548yd);
        this.f18if.setAlpha((int) (jpoVar2.qk().intValue() * 2.55f));
        this.f17541qk.set(jpoVar.qk());
        this.f17541qk.transform(matrix);
        canvas.drawPath(this.f17541qk, this.f18if);
        canvas.restore();
    }

    private void wqx(float f10) {
        this.f17536jd.se().wqx().jpo(this.wqx.jj(), f10);
    }

    private void wqx(Canvas canvas, Matrix matrix, com.bytedance.adsdk.jd.jpo.jd.jpo<oya, Path> jpoVar, com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar2) {
        com.bytedance.adsdk.jd.jj.jj.jpo(canvas, this.prr, this.f18if);
        canvas.drawRect(this.prr, this.f17548yd);
        this.f18if.setAlpha((int) (jpoVar2.qk().intValue() * 2.55f));
        this.f17541qk.set(jpoVar.qk());
        this.f17541qk.transform(matrix);
        canvas.drawPath(this.f17541qk, this.f18if);
        canvas.restore();
    }

    public void jd(Canvas canvas, Matrix matrix, int i10) {
        jpo(i10);
    }

    private void jd(Canvas canvas, Matrix matrix, com.bytedance.adsdk.jd.jpo.jd.jpo<oya, Path> jpoVar, com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar2) {
        com.bytedance.adsdk.jd.jj.jj.jpo(canvas, this.prr, this.f17548yd);
        canvas.drawRect(this.prr, this.f17548yd);
        this.f17541qk.set(jpoVar.qk());
        this.f17541qk.transform(matrix);
        this.f17548yd.setAlpha((int) (jpoVar2.qk().intValue() * 2.55f));
        canvas.drawPath(this.f17541qk, this.f18if);
        canvas.restore();
    }

    private static boolean jpo(com.bytedance.adsdk.jd.zz zzVar, my myVar, String str) {
        com.bytedance.adsdk.jd.yd ydVarJj;
        if (zzVar == null || myVar == null || str == null || (ydVarJj = zzVar.jj(myVar.qk())) == null) {
            return false;
        }
        return str.equals(ydVarJj.yd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(boolean z10) {
        if (z10 != this.f17535hx) {
            this.f17535hx = z10;
            au();
        }
    }

    public void jpo(boolean z10) {
        if (z10 && this.f17543rv == null) {
            this.f17543rv = new com.bytedance.adsdk.jd.jpo.jpo();
        }
        this.pdm = z10;
    }

    public BlurMaskFilter jd(float f10) {
        if (this.my == f10) {
            return this.f17537jj;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f17537jj = blurMaskFilter;
        this.my = f10;
        return blurMaskFilter;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        au();
    }

    public void jpo(jpo jpoVar) {
        this.f17534dt = jpoVar;
    }

    public void jpo(com.bytedance.adsdk.jd.jpo.jd.jpo<?, ?> jpoVar) {
        if (jpoVar == null) {
            return;
        }
        this.f17544se.add(jpoVar);
    }

    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        this.prr.set(0.0f, 0.0f, 0.0f, 0.0f);
        prr();
        this.jpo.set(matrix);
        if (z10) {
            List<jpo> list = this.f17540nq;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.jpo.preConcat(this.f17540nq.get(size).f17533cm.cm());
                }
            } else {
                jpo jpoVar = this.hmu;
                if (jpoVar != null) {
                    this.jpo.preConcat(jpoVar.f17533cm.cm());
                }
            }
        }
        this.jpo.preConcat(this.f17533cm.cm());
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        Integer numQk;
        com.bytedance.adsdk.jd.my.jpo(this.nmd);
        if (this.f17535hx && !this.wqx.tu()) {
            prr();
            com.bytedance.adsdk.jd.my.jpo("Layer#parentMatrix");
            this.f17547uu.set(matrix);
            this.xyk.reset();
            this.xyk.set(matrix);
            for (int size = this.f17540nq.size() - 1; size >= 0; size--) {
                this.xyk.preConcat(this.f17540nq.get(size).f17533cm.cm());
            }
            com.bytedance.adsdk.jd.my.jd("Layer#parentMatrix");
            com.bytedance.adsdk.jd.jpo.jd.jpo<?, Integer> jpoVarJpo = this.f17533cm.jpo();
            int iIntValue = (int) ((((i10 / 255.0f) * ((jpoVarJpo == null || (numQk = jpoVarJpo.qk()) == null) ? 100 : numQk.intValue())) / 100.0f) * 255.0f);
            if (!wqx() && !qk()) {
                this.xyk.preConcat(this.f17533cm.cm());
                com.bytedance.adsdk.jd.my.jpo("Layer#drawLayer");
                jd(canvas, this.xyk, iIntValue);
                com.bytedance.adsdk.jd.my.jd("Layer#drawLayer");
                wqx(com.bytedance.adsdk.jd.my.jd(this.nmd));
                return;
            }
            com.bytedance.adsdk.jd.my.jpo("Layer#computeBounds");
            jpo(this.prr, this.xyk, false);
            jd(this.prr, matrix);
            this.xyk.preConcat(this.f17533cm.cm());
            jpo(this.prr, this.xyk);
            this.hna.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.zz);
            if (!this.zz.isIdentity()) {
                Matrix matrix2 = this.zz;
                matrix2.invert(matrix2);
                this.zz.mapRect(this.hna);
            }
            if (!this.prr.intersect(this.hna)) {
                this.prr.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.jd.my.jd("Layer#computeBounds");
            if (this.prr.width() >= 1.0f && this.prr.height() >= 1.0f) {
                com.bytedance.adsdk.jd.my.jpo("Layer#saveLayer");
                this.f17548yd.setAlpha(255);
                com.bytedance.adsdk.jd.jj.jj.jpo(canvas, this.prr, this.f17548yd);
                com.bytedance.adsdk.jd.my.jd("Layer#saveLayer");
                jpo(canvas);
                com.bytedance.adsdk.jd.my.jpo("Layer#drawLayer");
                jd(canvas, this.xyk, iIntValue);
                com.bytedance.adsdk.jd.my.jd("Layer#drawLayer");
                if (qk()) {
                    jpo(canvas, this.xyk);
                }
                if (wqx()) {
                    com.bytedance.adsdk.jd.my.jpo("Layer#drawMatte");
                    com.bytedance.adsdk.jd.my.jpo("Layer#saveLayer");
                    com.bytedance.adsdk.jd.jj.jj.jpo(canvas, this.prr, this.f17532au, 19);
                    com.bytedance.adsdk.jd.my.jd("Layer#saveLayer");
                    jpo(canvas);
                    this.f17534dt.jpo(canvas, matrix, iIntValue);
                    com.bytedance.adsdk.jd.my.jpo("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.jd.my.jd("Layer#restoreLayer");
                    com.bytedance.adsdk.jd.my.jd("Layer#drawMatte");
                }
                com.bytedance.adsdk.jd.my.jpo("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.jd.my.jd("Layer#restoreLayer");
            }
            if (this.pdm && (paint = this.f17543rv) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f17543rv.setColor(-251901);
                this.f17543rv.setStrokeWidth(4.0f);
                canvas.drawRect(this.prr, this.f17543rv);
                this.f17543rv.setStyle(Paint.Style.FILL);
                this.f17543rv.setColor(1357638635);
                canvas.drawRect(this.prr, this.f17543rv);
            }
            wqx(com.bytedance.adsdk.jd.my.jd(this.nmd));
            return;
        }
        com.bytedance.adsdk.jd.my.jd(this.nmd);
    }

    private void jpo(Canvas canvas) {
        com.bytedance.adsdk.jd.my.jpo("Layer#clearLayer");
        RectF rectF = this.prr;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.oya);
        com.bytedance.adsdk.jd.my.jd("Layer#clearLayer");
    }

    private void jpo(RectF rectF, Matrix matrix) {
        this.f17545sq.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (qk()) {
            int size = this.f17542rq.jpo().size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bytedance.adsdk.jd.wqx.jd.xyk xykVar = this.f17542rq.jpo().get(i10);
                Path pathQk = this.f17542rq.jd().get(i10).qk();
                if (pathQk != null) {
                    this.f17541qk.set(pathQk);
                    this.f17541qk.transform(matrix);
                    int i11 = AnonymousClass2.f17549jd[xykVar.jpo().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && xykVar.cm()) {
                        return;
                    }
                    this.f17541qk.computeBounds(this.f17538jr, false);
                    if (i10 == 0) {
                        this.f17545sq.set(this.f17538jr);
                    } else {
                        RectF rectF2 = this.f17545sq;
                        rectF2.set(Math.min(rectF2.left, this.f17538jr.left), Math.min(this.f17545sq.top, this.f17538jr.top), Math.max(this.f17545sq.right, this.f17538jr.right), Math.max(this.f17545sq.bottom, this.f17538jr.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f17545sq)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public void jpo(int i10) {
        this.sz = (i10 / 255.0f) * ((this.f17533cm.jpo() != null ? this.f17533cm.jpo().qk().intValue() : 100) / 100.0f);
    }

    private void jpo(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.jd.my.jpo("Layer#saveLayer");
        com.bytedance.adsdk.jd.jj.jj.jpo(canvas, this.prr, this.f17539ju, 19);
        if (Build.VERSION.SDK_INT < 28) {
            jpo(canvas);
        }
        com.bytedance.adsdk.jd.my.jd("Layer#saveLayer");
        for (int i10 = 0; i10 < this.f17542rq.jpo().size(); i10++) {
            com.bytedance.adsdk.jd.wqx.jd.xyk xykVar = this.f17542rq.jpo().get(i10);
            com.bytedance.adsdk.jd.jpo.jd.jpo<oya, Path> jpoVar = this.f17542rq.jd().get(i10);
            com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar2 = this.f17542rq.wqx().get(i10);
            int i11 = AnonymousClass2.f17549jd[xykVar.jpo().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f17548yd.setColor(-16777216);
                        this.f17548yd.setAlpha(255);
                        canvas.drawRect(this.prr, this.f17548yd);
                    }
                    if (xykVar.cm()) {
                        wqx(canvas, matrix, jpoVar, jpoVar2);
                    } else {
                        jpo(canvas, matrix, jpoVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (xykVar.cm()) {
                            jd(canvas, matrix, jpoVar, jpoVar2);
                        } else {
                            jpo(canvas, matrix, jpoVar, jpoVar2);
                        }
                    }
                } else if (xykVar.cm()) {
                    my(canvas, matrix, jpoVar, jpoVar2);
                } else {
                    cm(canvas, matrix, jpoVar, jpoVar2);
                }
            } else if (oya()) {
                this.f17548yd.setAlpha(255);
                canvas.drawRect(this.prr, this.f17548yd);
            }
        }
        com.bytedance.adsdk.jd.my.jpo("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.jd.my.jd("Layer#restoreLayer");
    }

    private void jpo(Canvas canvas, Matrix matrix, com.bytedance.adsdk.jd.jpo.jd.jpo<oya, Path> jpoVar, com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar2) {
        this.f17541qk.set(jpoVar.qk());
        this.f17541qk.transform(matrix);
        this.f17548yd.setAlpha((int) (jpoVar2.qk().intValue() * 2.55f));
        canvas.drawPath(this.f17541qk, this.f17548yd);
    }

    private void jpo(Canvas canvas, Matrix matrix, com.bytedance.adsdk.jd.jpo.jd.jpo<oya, Path> jpoVar) {
        this.f17541qk.set(jpoVar.qk());
        this.f17541qk.transform(matrix);
        canvas.drawPath(this.f17541qk, this.f18if);
    }

    public void jpo(float f10) {
        this.f17533cm.jpo(f10);
        if (this.f17542rq != null) {
            for (int i10 = 0; i10 < this.f17542rq.jd().size(); i10++) {
                this.f17542rq.jd().get(i10).jpo(f10);
            }
        }
        com.bytedance.adsdk.jd.jpo.jd.cm cmVar = this.f17546tu;
        if (cmVar != null) {
            cmVar.jpo(f10);
        }
        jpo jpoVar = this.f17534dt;
        if (jpoVar != null) {
            jpoVar.jpo(f10);
        }
        for (int i11 = 0; i11 < this.f17544se.size(); i11++) {
            this.f17544se.get(i11).jpo(f10);
        }
    }
}
