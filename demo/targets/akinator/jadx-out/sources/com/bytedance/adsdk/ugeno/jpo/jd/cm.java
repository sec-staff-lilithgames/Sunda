package com.bytedance.adsdk.ugeno.jpo.jd;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.jpo.my;
import com.bytedance.adsdk.ugeno.qk.xyk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends jpo {
    private List<Keyframe> xyk;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.jpo.jd.cm$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[my.values().length];
            jpo = iArr;
            try {
                iArr[my.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[my.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public cm(Context context, com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, Map<Float, String> map) {
        super(context, wqxVar, str, map);
        this.xyk = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd.jpo
    public void jd() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i10 = AnonymousClass1.jpo[this.f17870cm.ordinal()];
        if (i10 == 1) {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.f17873qk.prr());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.f17873qk.hna());
        } else if (i10 != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.f17873qk.sq());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.f17873qk.opi());
        }
        if (keyframeOfFloat != null) {
            this.my.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.xyk.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd.jpo
    public TypeEvaluator jj() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd.jpo
    public void jpo(float f10, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.f17870cm == my.TRANSLATE) {
                fOptDouble = xyk.jpo(this.jpo, fOptDouble);
                fOptDouble2 = xyk.jpo(this.jpo, fOptDouble2);
            }
            this.my.add(Keyframe.ofFloat(f10, fOptDouble));
            this.xyk.add(Keyframe.ofFloat(f10, fOptDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd.jpo
    public List<PropertyValuesHolder> my() {
        String strJd = this.f17870cm.jd();
        cm();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strJd + "X", (Keyframe[]) this.my.toArray(new Keyframe[0]));
        this.f17872jj.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strJd + "Y", (Keyframe[]) this.xyk.toArray(new Keyframe[0]));
        this.f17872jj.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorJj = jj();
        if (typeEvaluatorJj != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorJj);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorJj);
        }
        return this.f17872jj;
    }
}
