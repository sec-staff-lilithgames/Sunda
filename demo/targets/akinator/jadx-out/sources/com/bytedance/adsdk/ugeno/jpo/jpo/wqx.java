package com.bytedance.adsdk.ugeno.jpo.jpo;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends jpo {

    /* renamed from: cm, reason: collision with root package name */
    private float f17897cm;

    /* renamed from: jj, reason: collision with root package name */
    private View f17898jj;

    /* renamed from: ju, reason: collision with root package name */
    private Matrix f17899ju;
    private float my;

    /* renamed from: qk, reason: collision with root package name */
    private Paint f17900qk;
    private String wqx;
    private Paint xyk;

    /* renamed from: yd, reason: collision with root package name */
    private LinearGradient f17901yd;
    private PorterDuffXfermode zz;

    public wqx(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, JSONObject jSONObject) {
        super(wqxVar, jSONObject);
        this.f17898jj = this.f17890jd.ju();
        Paint paint = new Paint();
        this.f17900qk = paint;
        paint.setAntiAlias(true);
        this.f17898jj.setLayerType(2, null);
        this.zz = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.xyk = new Paint();
        this.f17899ju = new Matrix();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void wqx(Canvas canvas) {
        try {
            if (this.f17890jd.ya() <= 0.0f) {
                this.f17900qk.setXfermode(this.zz);
                canvas.drawRect(0.0f, 0.0f, this.f17897cm, this.my, this.f17900qk);
                return;
            }
            int iYa = (int) (this.f17897cm * this.f17890jd.ya());
            int iYa2 = (int) (this.my * this.f17890jd.ya());
            this.f17900qk.setXfermode(this.zz);
            String str = this.wqx;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        float f10 = iYa2;
                        canvas.drawRect(0.0f, f10, this.f17897cm, this.my, this.f17900qk);
                        this.f17899ju.setTranslate(0.0f, f10);
                        this.f17901yd.setLocalMatrix(this.f17899ju);
                        this.xyk.setShader(this.f17901yd);
                        if (this.f17890jd.ya() <= 1.0f && this.f17890jd.ya() > 0.9f) {
                            this.xyk.setAlpha((int) (255.0f - (this.f17890jd.ya() * 255.0f)));
                        }
                        canvas.drawRect(0.0f, 0.0f, this.f17897cm, f10, this.xyk);
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        float f11 = iYa2;
                        canvas.drawRect(0.0f, 0.0f, this.f17897cm, this.my - f11, this.f17900qk);
                        this.f17899ju.setTranslate(0.0f, this.my - f11);
                        this.f17901yd.setLocalMatrix(this.f17899ju);
                        this.xyk.setShader(this.f17901yd);
                        if (this.f17890jd.ya() <= 1.0f && this.f17890jd.ya() > 0.9f) {
                            this.xyk.setAlpha((int) (255.0f - (this.f17890jd.ya() * 255.0f)));
                        }
                        float f12 = this.f17897cm;
                        float f13 = this.my;
                        canvas.drawRect(f12, f13, 0.0f, f13 - f11, this.xyk);
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        float f14 = iYa;
                        canvas.drawRect(0.0f, 0.0f, this.f17897cm - f14, this.my, this.f17900qk);
                        this.f17899ju.setTranslate(this.f17897cm - f14, 0.0f);
                        this.f17901yd.setLocalMatrix(this.f17899ju);
                        this.xyk.setShader(this.f17901yd);
                        if (this.f17890jd.ya() <= 1.0f && this.f17890jd.ya() > 0.9f) {
                            this.xyk.setAlpha((int) (255.0f - (this.f17890jd.ya() * 255.0f)));
                        }
                        float f15 = this.f17897cm;
                        canvas.drawRect(f15, this.my, f15 - f14, 0.0f, this.xyk);
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals(TtmlNode.RIGHT)) {
                        float f16 = iYa;
                        canvas.drawRect(f16, 0.0f, this.f17897cm, this.my, this.f17900qk);
                        this.f17899ju.setTranslate(f16, this.my);
                        this.f17901yd.setLocalMatrix(this.f17899ju);
                        this.xyk.setShader(this.f17901yd);
                        if (this.f17890jd.ya() <= 1.0f && this.f17890jd.ya() > 0.9f) {
                            this.xyk.setAlpha((int) (255.0f - (this.f17890jd.ya() * 255.0f)));
                        }
                        canvas.drawRect(0.0f, 0.0f, f16, this.my, this.xyk);
                        break;
                    }
                    break;
            }
        } catch (Throwable th2) {
            Log.e("BaseEffectWrapper", th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jd() {
        this.wqx = this.jpo.optString("direction", TtmlNode.LEFT);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jpo(Canvas canvas) {
        wqx(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jd(Canvas canvas) {
        wqx(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jpo(int i10, int i11) {
        this.f17897cm = i10;
        this.my = i11;
        String str = this.wqx;
        str.getClass();
        switch (str) {
            case "bottom":
                this.f17901yd = new LinearGradient(0.0f, -this.my, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.f17901yd = new LinearGradient(0.0f, this.my, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.f17901yd = new LinearGradient(this.f17897cm, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.f17901yd = new LinearGradient(-this.f17897cm, 0.0f, 0.0f, this.my, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public List<PropertyValuesHolder> wqx() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.jpo.my.ALPHA.jd(), 0.0f, 1.0f));
        return arrayList;
    }
}
