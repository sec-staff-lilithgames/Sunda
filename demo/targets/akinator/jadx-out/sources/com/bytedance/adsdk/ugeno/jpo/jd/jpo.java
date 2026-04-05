package com.bytedance.adsdk.ugeno.jpo.jd;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.jpo.my;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo {

    /* renamed from: cm, reason: collision with root package name */
    protected my f17870cm;

    /* renamed from: jd, reason: collision with root package name */
    protected String f17871jd;
    protected Context jpo;

    /* renamed from: qk, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.jd.wqx f17873qk;
    protected Map<Float, String> wqx;

    /* renamed from: jj, reason: collision with root package name */
    protected List<PropertyValuesHolder> f17872jj = new ArrayList();
    protected List<Keyframe> my = new ArrayList();

    public jpo(Context context, com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, Map<Float, String> map) {
        this.jpo = context;
        this.f17871jd = str;
        this.wqx = map;
        this.f17870cm = my.jpo(this.f17871jd);
        this.f17873qk = wqxVar;
    }

    public void cm() {
        Map<Float, String> map = this.wqx;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!jpo()) {
            jd();
        }
        for (Map.Entry<Float, String> entry : this.wqx.entrySet()) {
            if (entry != null) {
                jpo(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        wqx();
    }

    public abstract void jd();

    public abstract TypeEvaluator jj();

    public abstract void jpo(float f10, String str);

    public boolean jpo() {
        Map<Float, String> map = this.wqx;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.wqx.containsKey(Float.valueOf(0.0f));
    }

    public List<PropertyValuesHolder> my() {
        String strJd = this.f17870cm.jd();
        cm();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strJd, (Keyframe[]) this.my.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorJj = jj();
        if (typeEvaluatorJj != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorJj);
        }
        this.f17872jj.add(propertyValuesHolderOfKeyframe);
        return this.f17872jj;
    }

    public void wqx() {
        Map<Float, String> map = this.wqx;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.wqx;
        if (map2 instanceof TreeMap) {
            Float f10 = (Float) ((TreeMap) map2).lastKey();
            if (f10.floatValue() != 100.0f) {
                jpo(100.0f, this.wqx.get(f10));
            }
        }
    }
}
