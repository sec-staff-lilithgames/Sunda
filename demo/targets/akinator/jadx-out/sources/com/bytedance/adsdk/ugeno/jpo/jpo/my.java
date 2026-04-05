package com.bytedance.adsdk.ugeno.jpo.jpo;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class my extends jpo {

    /* renamed from: au, reason: collision with root package name */
    private PorterDuffXfermode f17891au;

    /* renamed from: cm, reason: collision with root package name */
    private float f17892cm;

    /* renamed from: if, reason: not valid java name */
    private Path f40if;

    /* renamed from: jj, reason: collision with root package name */
    private float f17893jj;

    /* renamed from: ju, reason: collision with root package name */
    private Path f17894ju;
    private Paint my;

    /* renamed from: qk, reason: collision with root package name */
    private String f17895qk;
    private float wqx;
    private boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private Path f17896yd;
    private boolean zz;

    public my(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, JSONObject jSONObject) {
        super(wqxVar, jSONObject);
        this.xyk = true;
        this.zz = true;
        Paint paint = new Paint();
        this.my = paint;
        paint.setAntiAlias(true);
        this.f17890jd.ju().setLayerType(2, null);
        this.f17891au = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f17896yd = new Path();
        this.f17894ju = new Path();
        this.f40if = new Path();
        this.my.setXfermode(this.f17891au);
    }

    private void wqx(Canvas canvas) {
        if (this.f17890jd.huv() <= 0.0f) {
            this.my.setXfermode(this.f17891au);
            canvas.drawRect(0.0f, 0.0f, this.wqx, this.f17892cm, this.my);
            return;
        }
        int iHuv = (int) (this.f17890jd.huv() * this.wqx);
        int iHuv2 = (int) (this.f17890jd.huv() * this.f17892cm);
        this.my.setXfermode(this.f17891au);
        String str = this.f17895qk;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 1;
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(yFkbx.kSxHJKZbUZ)) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                canvas.drawRect(0.0f, iHuv2, this.wqx, this.f17892cm, this.my);
                break;
            case 1:
                this.f17896yd.reset();
                this.f17894ju.reset();
                this.f40if.reset();
                Path.Direction direction = Path.Direction.CW;
                this.f17896yd.addCircle(this.wqx / 2.0f, this.f17892cm / 2.0f, iHuv, direction);
                Path path = this.f17894ju;
                float f10 = this.wqx;
                path.addRect(f10 / 2.0f, 0.0f, f10, this.f17892cm, direction);
                Path path2 = this.f17894ju;
                Path path3 = this.f17896yd;
                Path.Op op2 = Path.Op.DIFFERENCE;
                path2.op(path3, op2);
                this.f40if.addRect(0.0f, 0.0f, this.wqx / 2.0f, this.f17892cm, direction);
                this.f40if.op(this.f17896yd, op2);
                canvas.drawPath(this.f17894ju, this.my);
                canvas.drawPath(this.f40if, this.my);
                break;
            case 2:
                canvas.drawRect(0.0f, 0.0f, this.wqx, this.f17892cm - iHuv2, this.my);
                break;
            case 3:
                canvas.drawRect(0.0f, 0.0f, this.wqx - iHuv, this.f17892cm, this.my);
                break;
            case 4:
                canvas.drawRect(iHuv, 0.0f, this.wqx, this.f17892cm, this.my);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jd() {
        this.f17893jj = (float) this.jpo.optDouble("start", 0.0d);
        this.f17895qk = this.jpo.optString("direction", TtmlNode.CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jpo(Canvas canvas) {
        wqx(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jpo(int i10, int i11) {
        if (i10 > 0 && this.xyk) {
            this.wqx = i10;
            this.xyk = false;
        }
        if (i11 <= 0 || !this.zz) {
            return;
        }
        this.f17892cm = i11;
        this.zz = false;
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jd(Canvas canvas) {
        wqx(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public List<PropertyValuesHolder> wqx() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(cm(), this.f17893jj, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
