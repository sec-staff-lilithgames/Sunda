package com.bytedance.adsdk.ugeno.jpo.jd;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.jpo.my;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends jpo {
    public wqx(Context context, com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, TreeMap<Float, String> treeMap) {
        super(context, wqxVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd.jpo
    public void jd() {
        if (this.f17870cm == my.BACKGROUND_COLOR) {
            this.my.add(Keyframe.ofInt(0.0f, this.f17873qk.va()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd.jpo
    public TypeEvaluator jj() {
        return this.f17870cm == my.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd.jpo
    public void jpo(float f10, String str) {
        this.my.add(this.f17870cm == my.BACKGROUND_COLOR ? Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.qk.jpo.jpo(str)) : Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str, 0)));
    }
}
