package com.bytedance.adsdk.ugeno.jpo.jpo;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.qk.jpo;
import com.bytedance.adsdk.ugeno.qk.xyk;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends jpo {
    private static final float hna;
    private static final float oya;
    private static final float prr;

    /* renamed from: sq, reason: collision with root package name */
    private static final float f17881sq;

    /* renamed from: au, reason: collision with root package name */
    private Path f17882au;

    /* renamed from: cm, reason: collision with root package name */
    private Paint f17883cm;

    /* renamed from: if, reason: not valid java name */
    private boolean f39if;

    /* renamed from: jj, reason: collision with root package name */
    private jpo.C0066jpo f17884jj;

    /* renamed from: ju, reason: collision with root package name */
    private int f17885ju;
    private Path my;
    private float opi;

    /* renamed from: qk, reason: collision with root package name */
    private int f17886qk;
    private int wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f17887yd;
    private float zz;

    static {
        float radians = (float) Math.toRadians(30.0d);
        oya = radians;
        prr = (float) Math.tan(radians);
        hna = (float) Math.cos(radians);
        f17881sq = (float) Math.sin(radians);
    }

    public cm(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, JSONObject jSONObject) {
        super(wqxVar, jSONObject);
        this.f39if = true;
        Paint paint = new Paint();
        this.f17883cm = paint;
        paint.setAntiAlias(true);
        this.my = new Path();
        this.zz = this.f17890jd.dt();
        this.f17882au = new Path();
    }

    private void wqx(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.f17890jd.fy() > 0.0f) {
                int i10 = this.f17887yd;
                float f10 = prr;
                float fFy = ((i10 * f10) + i10) * this.f17890jd.fy();
                this.f17882au.reset();
                this.f17882au.moveTo(fFy, 0.0f);
                int i11 = this.f17885ju;
                float f11 = fFy - (i11 * f10);
                this.f17882au.lineTo(f11, i11);
                this.f17882au.lineTo(f11 + this.wqx, this.f17885ju);
                this.f17882au.lineTo(this.wqx + fFy, 0.0f);
                this.f17882au.close();
                float f12 = this.opi;
                float f13 = hna * f12;
                float f14 = f12 * f17881sq;
                if (!this.f39if || this.f17884jj == null) {
                    int i12 = this.xyk;
                    linearGradient = new LinearGradient(fFy, 0.0f, fFy + f13, f14, new int[]{i12, this.f17886qk, i12}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fFy, 0.0f, fFy + f13, f14, this.f17884jj.f17957jd, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.f17883cm.setShader(linearGradient);
                Path path = this.my;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.f17882au, this.f17883cm);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jd() {
        this.wqx = (int) xyk.jpo(this.f17890jd.ju().getContext(), this.jpo.optInt("shineWidth", 30));
        String strOptString = this.jpo.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.f17884jj = com.bytedance.adsdk.ugeno.qk.jpo.jd(str);
        } else {
            int iJpo = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str);
            this.f17886qk = iJpo;
            this.xyk = com.bytedance.adsdk.ugeno.qk.jpo.jpo(iJpo, 32);
            this.f39if = false;
        }
        this.opi = hna * this.wqx;
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jpo(Canvas canvas) {
        wqx(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jpo(int i10, int i11) {
        this.f17887yd = i10;
        this.f17885ju = i11;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            Path path = this.my;
            float f10 = this.zz;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jd(Canvas canvas) {
        wqx(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public List<PropertyValuesHolder> wqx() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(cm(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
