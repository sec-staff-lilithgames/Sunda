package com.bytedance.adsdk.jd.wqx.wqx;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.jd.jpo.jd.prr;
import com.bytedance.adsdk.jd.wqx.jd;
import com.bytedance.adsdk.jd.wqx.jd.hna;
import com.bytedance.adsdk.jd.wqx.jpo.ju;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends com.bytedance.adsdk.jd.wqx.wqx.jpo {

    /* renamed from: au, reason: collision with root package name */
    private final LongSparseArray<String> f17577au;

    /* renamed from: dt, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> f17578dt;
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> hmu;
    private final com.bytedance.adsdk.jd.zz hna;

    /* renamed from: hx, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Typeface, Typeface> f17579hx;

    /* renamed from: if, reason: not valid java name */
    private final Map<com.bytedance.adsdk.jd.wqx.cm, List<com.bytedance.adsdk.jd.jpo.jpo.cm>> f22if;

    /* renamed from: jr, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> f17580jr;

    /* renamed from: ju, reason: collision with root package name */
    private final Paint f17581ju;
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> nmd;

    /* renamed from: nq, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> f17582nq;
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> opi;
    private final List<jpo> oya;
    private final prr prr;

    /* renamed from: qk, reason: collision with root package name */
    private final StringBuilder f17583qk;

    /* renamed from: rq, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> f17584rq;

    /* renamed from: se, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> f17585se;

    /* renamed from: sq, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.qk f17586sq;

    /* renamed from: tu, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> f17587tu;
    private final RectF xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final Paint f17588yd;
    private final Matrix zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jd.wqx.wqx.zz$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[jd.jpo.values().length];
            jpo = iArr;
            try {
                iArr[jd.jpo.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[jd.jpo.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jpo[jd.jpo.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        private float f17589jd;
        private String jpo;

        private jpo() {
            this.jpo = "";
            this.f17589jd = 0.0f;
        }

        public void jpo(String str, float f10) {
            this.jpo = str;
            this.f17589jd = f10;
        }
    }

    public zz(com.bytedance.adsdk.jd.zz zzVar, my myVar) {
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVar;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVar2;
        com.bytedance.adsdk.jd.wqx.jpo.jpo jpoVar;
        com.bytedance.adsdk.jd.wqx.jpo.jpo jpoVar2;
        super(zzVar, myVar);
        this.f17583qk = new StringBuilder(2);
        this.xyk = new RectF();
        this.zz = new Matrix();
        int i10 = 1;
        this.f17588yd = new Paint(i10) { // from class: com.bytedance.adsdk.jd.wqx.wqx.zz.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.f17581ju = new Paint(i10) { // from class: com.bytedance.adsdk.jd.wqx.wqx.zz.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.f22if = new HashMap();
        this.f17577au = new LongSparseArray<>();
        this.oya = new ArrayList();
        this.hna = zzVar;
        this.f17586sq = myVar.jpo();
        prr prrVarJpo = myVar.jr().jpo();
        this.prr = prrVarJpo;
        prrVarJpo.jpo(this);
        jpo(prrVarJpo);
        ju juVarNmd = myVar.nmd();
        if (juVarNmd != null && (jpoVar2 = juVarNmd.jpo) != null) {
            com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVarJpo = jpoVar2.jpo();
            this.opi = jpoVarJpo;
            jpoVarJpo.jpo(this);
            jpo(this.opi);
        }
        if (juVarNmd != null && (jpoVar = juVarNmd.f17520jd) != null) {
            com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVarJpo2 = jpoVar.jpo();
            this.nmd = jpoVarJpo2;
            jpoVarJpo2.jpo(this);
            jpo(this.nmd);
        }
        if (juVarNmd != null && (jdVar2 = juVarNmd.wqx) != null) {
            com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo3 = jdVar2.jpo();
            this.f17587tu = jpoVarJpo3;
            jpoVarJpo3.jpo(this);
            jpo(this.f17587tu);
        }
        if (juVarNmd == null || (jdVar = juVarNmd.f17519cm) == null) {
            return;
        }
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo4 = jdVar.jpo();
        this.hmu = jpoVarJpo4;
        jpoVarJpo4.jpo(this);
        jpo(this.hmu);
    }

    private boolean wqx(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo
    public void jd(Canvas canvas, Matrix matrix, int i10) {
        super.jd(canvas, matrix, i10);
        com.bytedance.adsdk.jd.wqx.jd jdVarQk = this.prr.qk();
        com.bytedance.adsdk.jd.wqx.wqx wqxVar = this.f17586sq.prr().get(jdVarQk.f17448jd);
        if (wqxVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        jpo(jdVarQk, matrix);
        if (this.hna.nq()) {
            jpo(jdVarQk, matrix, wqxVar, canvas);
        } else {
            jpo(jdVarQk, wqxVar, canvas);
        }
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo, com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        super.jpo(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.f17586sq.cm().width(), this.f17586sq.cm().height());
    }

    private void jpo(com.bytedance.adsdk.jd.wqx.jd jdVar, Matrix matrix) {
        com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar = this.f17580jr;
        if (jpoVar != null) {
            this.f17588yd.setColor(jpoVar.qk().intValue());
        } else {
            com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar2 = this.opi;
            if (jpoVar2 != null) {
                this.f17588yd.setColor(jpoVar2.qk().intValue());
            } else {
                this.f17588yd.setColor(jdVar.xyk);
            }
        }
        com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar3 = this.f17584rq;
        if (jpoVar3 != null) {
            this.f17581ju.setColor(jpoVar3.qk().intValue());
        } else {
            com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVar4 = this.nmd;
            if (jpoVar4 != null) {
                this.f17581ju.setColor(jpoVar4.qk().intValue());
            } else {
                this.f17581ju.setColor(jdVar.zz);
            }
        }
        int iIntValue = ((this.f17533cm.jpo() == null ? 100 : this.f17533cm.jpo().qk().intValue()) * 255) / 100;
        this.f17588yd.setAlpha(iIntValue);
        this.f17581ju.setAlpha(iIntValue);
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVar5 = this.f17578dt;
        if (jpoVar5 != null) {
            this.f17581ju.setStrokeWidth(jpoVar5.qk().floatValue());
            return;
        }
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVar6 = this.f17587tu;
        if (jpoVar6 != null) {
            this.f17581ju.setStrokeWidth(jpoVar6.qk().floatValue());
        } else {
            this.f17581ju.setStrokeWidth(com.bytedance.adsdk.jd.jj.jj.jpo() * jdVar.f17452yd);
        }
    }

    private jpo jd(int i10) {
        for (int size = this.oya.size(); size < i10; size++) {
            this.oya.add(new jpo());
        }
        return this.oya.get(i10 - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(com.bytedance.adsdk.jd.wqx.jd r17, android.graphics.Matrix r18, com.bytedance.adsdk.jd.wqx.wqx r19, android.graphics.Canvas r20) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            com.bytedance.adsdk.jd.jpo.jd.jpo<java.lang.Float, java.lang.Float> r1 = r0.f17585se
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.qk()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L15
        L13:
            float r1 = r7.wqx
        L15:
            r2 = 1120403456(0x42c80000, float:100.0)
            float r4 = r1 / r2
            float r8 = com.bytedance.adsdk.jd.jj.jj.jpo(r18)
            java.lang.String r1 = r7.jpo
            java.util.List r9 = r0.jpo(r1)
            int r10 = r9.size()
            int r1 = r7.my
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            com.bytedance.adsdk.jd.jpo.jd.jpo<java.lang.Float, java.lang.Float> r2 = r0.f17582nq
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r2.qk()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L3b:
            float r1 = r1 + r2
        L3c:
            r5 = r1
            goto L4d
        L3e:
            com.bytedance.adsdk.jd.jpo.jd.jpo<java.lang.Float, java.lang.Float> r2 = r0.hmu
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r2.qk()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L3b
        L4d:
            r11 = 0
            r1 = -1
            r12 = r1
            r13 = r11
        L51:
            if (r13 >= r10) goto La7
            java.lang.Object r1 = r9.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r2 = r7.f17446au
            if (r2 != 0) goto L5f
            r2 = 0
            goto L61
        L5f:
            float r2 = r2.x
        L61:
            r6 = 1
            r3 = r19
            java.util.List r14 = r0.jpo(r1, r2, r3, r4, r5, r6)
            r15 = r11
        L69:
            int r1 = r14.size()
            if (r15 >= r1) goto L9d
            java.lang.Object r1 = r14.get(r15)
            com.bytedance.adsdk.jd.wqx.wqx.zz$jpo r1 = (com.bytedance.adsdk.jd.wqx.wqx.zz.jpo) r1
            int r12 = r12 + 1
            r20.save()
            float r2 = com.bytedance.adsdk.jd.wqx.wqx.zz.jpo.jpo(r1)
            r3 = r20
            r0.jpo(r3, r7, r12, r2)
            java.lang.String r1 = com.bytedance.adsdk.jd.wqx.wqx.zz.jpo.jd(r1)
            r6 = r4
            r2 = r7
            r4 = r3
            r7 = r5
            r5 = r8
            r3 = r19
            r0.jpo(r1, r2, r3, r4, r5, r6, r7)
            r4 = r6
            r20.restore()
            int r15 = r15 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L69
        L9d:
            r7 = r5
            r5 = r8
            int r13 = r13 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L51
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.wqx.wqx.zz.jpo(com.bytedance.adsdk.jd.wqx.jd, android.graphics.Matrix, com.bytedance.adsdk.jd.wqx.wqx, android.graphics.Canvas):void");
    }

    private void jpo(String str, com.bytedance.adsdk.jd.wqx.jd jdVar, com.bytedance.adsdk.jd.wqx.wqx wqxVar, Canvas canvas, float f10, float f11, float f12) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            com.bytedance.adsdk.jd.wqx.cm cmVar = this.f17586sq.oya().get(com.bytedance.adsdk.jd.wqx.cm.jpo(str.charAt(i10), wqxVar.jpo(), wqxVar.wqx()));
            if (cmVar != null) {
                jpo(cmVar, f11, jdVar, canvas);
                canvas.translate((com.bytedance.adsdk.jd.jj.jj.jpo() * ((float) cmVar.jd()) * f11) + f12, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(com.bytedance.adsdk.jd.wqx.jd r13, com.bytedance.adsdk.jd.wqx.wqx r14, android.graphics.Canvas r15) {
        /*
            r12 = this;
            android.graphics.Typeface r0 = r12.jpo(r14)
            if (r0 != 0) goto L9
        L6:
            r4 = r12
            goto Ld0
        L9:
            java.lang.String r1 = r13.jpo
            com.bytedance.adsdk.jd.zz r2 = r12.hna
            com.bytedance.adsdk.jd.nmd r2 = r2.hmu()
            if (r2 == 0) goto L1b
            java.lang.String r3 = r12.zz()
            java.lang.String r1 = r2.jd(r3, r1)
        L1b:
            android.graphics.Paint r2 = r12.f17588yd
            r2.setTypeface(r0)
            com.bytedance.adsdk.jd.jpo.jd.jpo<java.lang.Float, java.lang.Float> r0 = r12.f17585se
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r0.qk()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L31
        L2f:
            float r0 = r13.wqx
        L31:
            android.graphics.Paint r2 = r12.f17588yd
            float r3 = com.bytedance.adsdk.jd.jj.jj.jpo()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r12.f17581ju
            android.graphics.Paint r3 = r12.f17588yd
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r12.f17581ju
            android.graphics.Paint r3 = r12.f17588yd
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r13.my
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.bytedance.adsdk.jd.jpo.jd.jpo<java.lang.Float, java.lang.Float> r3 = r12.f17582nq
            if (r3 == 0) goto L67
            java.lang.Object r3 = r3.qk()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L65:
            float r2 = r2 + r3
            goto L76
        L67:
            com.bytedance.adsdk.jd.jpo.jd.jpo<java.lang.Float, java.lang.Float> r3 = r12.hmu
            if (r3 == 0) goto L76
            java.lang.Object r3 = r3.qk()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L65
        L76:
            float r3 = com.bytedance.adsdk.jd.jj.jj.jpo()
            float r3 = r3 * r2
            float r3 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r9 = r3 / r0
            java.util.List r0 = r12.jpo(r1)
            int r1 = r0.size()
            r2 = 0
            r3 = -1
            r11 = r2
        L8b:
            if (r11 >= r1) goto L6
            java.lang.Object r4 = r0.get(r11)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.PointF r4 = r13.f17446au
            if (r4 != 0) goto L9b
            r4 = 0
        L99:
            r6 = r4
            goto L9e
        L9b:
            float r4 = r4.x
            goto L99
        L9e:
            r8 = 0
            r10 = 0
            r4 = r12
            r7 = r14
            java.util.List r14 = r4.jpo(r5, r6, r7, r8, r9, r10)
            r5 = r2
        La7:
            int r6 = r14.size()
            if (r5 >= r6) goto Lcc
            java.lang.Object r6 = r14.get(r5)
            com.bytedance.adsdk.jd.wqx.wqx.zz$jpo r6 = (com.bytedance.adsdk.jd.wqx.wqx.zz.jpo) r6
            int r3 = r3 + 1
            r15.save()
            float r8 = com.bytedance.adsdk.jd.wqx.wqx.zz.jpo.jpo(r6)
            r12.jpo(r15, r13, r3, r8)
            java.lang.String r6 = com.bytedance.adsdk.jd.wqx.wqx.zz.jpo.jd(r6)
            r12.jpo(r6, r13, r15, r9)
            r15.restore()
            int r5 = r5 + 1
            goto La7
        Lcc:
            int r11 = r11 + 1
            r14 = r7
            goto L8b
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.wqx.wqx.zz.jpo(com.bytedance.adsdk.jd.wqx.jd, com.bytedance.adsdk.jd.wqx.wqx, android.graphics.Canvas):void");
    }

    private void jpo(Canvas canvas, com.bytedance.adsdk.jd.wqx.jd jdVar, int i10, float f10) {
        PointF pointF = jdVar.f14if;
        PointF pointF2 = jdVar.f17446au;
        float fJpo = com.bytedance.adsdk.jd.jj.jj.jpo();
        float f11 = (i10 * jdVar.f17449jj * fJpo) + (pointF == null ? 0.0f : (jdVar.f17449jj * 0.6f * fJpo) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = AnonymousClass3.jpo[jdVar.f17447cm.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else {
            if (i11 != 3) {
                return;
            }
            canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        }
    }

    private Typeface jpo(com.bytedance.adsdk.jd.wqx.wqx wqxVar) {
        Typeface typefaceQk;
        com.bytedance.adsdk.jd.jpo.jd.jpo<Typeface, Typeface> jpoVar = this.f17579hx;
        if (jpoVar != null && (typefaceQk = jpoVar.qk()) != null) {
            return typefaceQk;
        }
        Typeface typefaceJpo = this.hna.jpo(wqxVar);
        return typefaceJpo != null ? typefaceJpo : wqxVar.cm();
    }

    private List<String> jpo(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void jpo(String str, com.bytedance.adsdk.jd.wqx.jd jdVar, Canvas canvas, float f10) {
        int length = 0;
        while (length < str.length()) {
            String strJpo = jpo(str, length);
            length += strJpo.length();
            jpo(strJpo, jdVar, canvas);
            canvas.translate(this.f17588yd.measureText(strJpo) + f10, 0.0f);
        }
    }

    private List<jpo> jpo(String str, float f10, com.bytedance.adsdk.jd.wqx.wqx wqxVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                com.bytedance.adsdk.jd.wqx.cm cmVar = this.f17586sq.oya().get(com.bytedance.adsdk.jd.wqx.cm.jpo(cCharAt, wqxVar.jpo(), wqxVar.wqx()));
                if (cmVar != null) {
                    fMeasureText = (com.bytedance.adsdk.jd.jj.jj.jpo() * ((float) cmVar.jd()) * f11) + f12;
                }
            } else {
                fMeasureText = this.f17588yd.measureText(str.substring(i13, i13 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z11 = true;
                f15 = fMeasureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                jpo jpoVarJd = jd(i10);
                if (i12 == i11) {
                    jpoVarJd.jpo(str.substring(i11, i13).trim(), (f13 - fMeasureText) - ((r9.length() - r7.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    jpoVarJd.jpo(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            jd(i10).jpo(str.substring(i11), f13);
        }
        return this.oya.subList(0, i10);
    }

    private void jpo(com.bytedance.adsdk.jd.wqx.cm cmVar, float f10, com.bytedance.adsdk.jd.wqx.jd jdVar, Canvas canvas) {
        List<com.bytedance.adsdk.jd.jpo.jpo.cm> listJpo = jpo(cmVar);
        for (int i10 = 0; i10 < listJpo.size(); i10++) {
            Path pathCm = listJpo.get(i10).cm();
            pathCm.computeBounds(this.xyk, false);
            this.zz.reset();
            this.zz.preTranslate(0.0f, com.bytedance.adsdk.jd.jj.jj.jpo() * (-jdVar.f17451qk));
            this.zz.preScale(f10, f10);
            pathCm.transform(this.zz);
            if (jdVar.f17450ju) {
                jpo(pathCm, this.f17588yd, canvas);
                jpo(pathCm, this.f17581ju, canvas);
            } else {
                jpo(pathCm, this.f17581ju, canvas);
                jpo(pathCm, this.f17588yd, canvas);
            }
        }
    }

    private void jpo(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void jpo(String str, com.bytedance.adsdk.jd.wqx.jd jdVar, Canvas canvas) {
        if (jdVar.f17450ju) {
            jpo(str, this.f17588yd, canvas);
            jpo(str, this.f17581ju, canvas);
        } else {
            jpo(str, this.f17581ju, canvas);
            jpo(str, this.f17588yd, canvas);
        }
    }

    private void jpo(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.jd.jpo.jpo.cm> jpo(com.bytedance.adsdk.jd.wqx.cm cmVar) {
        if (this.f22if.containsKey(cmVar)) {
            return this.f22if.get(cmVar);
        }
        List<hna> listJpo = cmVar.jpo();
        int size = listJpo.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new com.bytedance.adsdk.jd.jpo.jpo.cm(this.hna, this, listJpo.get(i10), this.f17586sq));
        }
        this.f22if.put(cmVar, arrayList);
        return arrayList;
    }

    private String jpo(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!wqx(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.f17577au.indexOfKey(j10) >= 0) {
            return this.f17577au.get(j10);
        }
        this.f17583qk.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.f17583qk.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.f17583qk.toString();
        this.f17577au.put(j10, string);
        return string;
    }
}
