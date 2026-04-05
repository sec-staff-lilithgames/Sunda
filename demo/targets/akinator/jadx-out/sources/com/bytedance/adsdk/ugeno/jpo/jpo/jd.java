package com.bytedance.adsdk.ugeno.jpo.jpo;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jpo {

    /* renamed from: cm, reason: collision with root package name */
    private int f17888cm;

    /* renamed from: jj, reason: collision with root package name */
    private Paint f17889jj;
    private int my;
    private int wqx;

    public jd(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, JSONObject jSONObject) {
        super(wqxVar, jSONObject);
        Paint paint = new Paint();
        this.f17889jj = paint;
        paint.setAntiAlias(true);
    }

    private void wqx(Canvas canvas) {
        try {
            if (this.f17890jd.ic() > 0.0f) {
                this.f17889jj.setColor(this.wqx);
                this.f17889jj.setAlpha((int) ((1.0f - this.f17890jd.ic()) * 255.0f));
                ((ViewGroup) this.f17890jd.ju().getParent()).setClipChildren(true);
                canvas.drawCircle(this.f17888cm, this.my, Math.min(r0, r2) * 2 * this.f17890jd.ic(), this.f17889jj);
            }
        } catch (Throwable th2) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public void jd() {
        this.wqx = com.bytedance.adsdk.ugeno.qk.jpo.jpo(this.jpo.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), -1);
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
        this.f17888cm = i10 / 2;
        this.my = i11 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jpo.jpo
    public List<PropertyValuesHolder> wqx() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(cm(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
