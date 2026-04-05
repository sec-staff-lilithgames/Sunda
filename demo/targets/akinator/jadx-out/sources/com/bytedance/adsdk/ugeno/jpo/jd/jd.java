package com.bytedance.adsdk.ugeno.jpo.jd;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.jpo.my;
import com.bytedance.adsdk.ugeno.qk.xyk;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jpo {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.jpo.jd.jd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[my.values().length];
            jpo = iArr;
            try {
                iArr[my.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[my.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jpo[my.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                jpo[my.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                jpo[my.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                jpo[my.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                jpo[my.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                jpo[my.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                jpo[my.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public jd(Context context, com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, TreeMap<Float, String> treeMap) {
        super(context, wqxVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd.jpo
    public void jd() {
        float fPrr;
        switch (AnonymousClass1.jpo[this.f17870cm.ordinal()]) {
            case 1:
                fPrr = this.f17873qk.prr();
                break;
            case 2:
                fPrr = this.f17873qk.hna();
                break;
            case 3:
                fPrr = this.f17873qk.sq();
                break;
            case 4:
                fPrr = this.f17873qk.opi();
                break;
            case 5:
                fPrr = this.f17873qk.jr();
                if (this.f17873qk.ju() != null) {
                    this.f17873qk.ju().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 6:
                fPrr = this.f17873qk.nmd();
                if (this.f17873qk.ju() != null) {
                    this.f17873qk.ju().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 7:
                fPrr = this.f17873qk.rq();
                break;
            case 8:
                fPrr = this.f17873qk.tu();
                break;
            case 9:
                fPrr = this.f17873qk.dt();
                break;
            default:
                fPrr = 0.0f;
                break;
        }
        this.my.add(Keyframe.ofFloat(0.0f, fPrr));
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd.jpo
    public TypeEvaluator jj() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd.jpo
    public void jpo(float f10, String str) {
        this.my.add(Keyframe.ofFloat(f10, (this.f17871jd.startsWith(my.TRANSLATE.jpo()) || this.f17870cm == my.BORDER_RADIUS) ? xyk.jpo(this.jpo, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str, 0.0f)) : com.bytedance.adsdk.ugeno.qk.wqx.jpo(str, 0.0f)));
    }
}
