package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class YogaNodeJNIBase extends yd implements Cloneable {
    private float[] arr;

    /* renamed from: cm, reason: collision with root package name */
    private qk f18005cm;

    /* renamed from: jd, reason: collision with root package name */
    private YogaNodeJNIBase f18006jd;

    /* renamed from: jj, reason: collision with root package name */
    private Object f18007jj;
    protected long jpo;
    private int mLayoutDirection;
    private jd my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f18008qk;
    private List<YogaNodeJNIBase> wqx;

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f18008qk = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.jpo = j10;
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List<YogaNodeJNIBase> list = this.wqx;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.wqx.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.f18006jd = this;
        return yogaNodeJNIBase.jpo;
    }

    public final float baseline(float f10, float f11) {
        return this.my.jpo(this, f10, f11);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    /* renamed from: cm, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase jd(int i10) {
        List<YogaNodeJNIBase> list = this.wqx;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i10);
        yogaNodeJNIBaseRemove.f18006jd = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.jpo, yogaNodeJNIBaseRemove.jpo);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    /* renamed from: if, reason: not valid java name */
    public void mo393if(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jj(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    /* renamed from: ju, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase jd() {
        return this.f18006jd;
    }

    public final long measure(float f10, int i10, float f11, int i11) {
        if (m394if()) {
            return this.f18005cm.jpo(this, f10, xyk.jpo(i10), f11, xyk.jpo(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void my(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void qk(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase jpo(int i10) {
        List<YogaNodeJNIBase> list = this.wqx;
        if (list != null) {
            return list.get(i10);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void xyk(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void yd(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void zz(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.jpo, f10);
    }

    /* renamed from: if, reason: not valid java name */
    public boolean m394if() {
        return this.f18005cm != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public float jj() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public int jpo() {
        List<YogaNodeJNIBase> list = this.wqx;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void ju(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void my() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.jpo);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public float qk() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public float xyk() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public Object yd() {
        return this.f18007jj;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public float zz() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    private void jd(yd ydVar) {
        yd();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(yd ydVar, int i10) {
        if (ydVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) ydVar;
            if (yogaNodeJNIBase.f18006jd == null) {
                if (this.wqx == null) {
                    this.wqx = new ArrayList(4);
                }
                this.wqx.add(i10, yogaNodeJNIBase);
                yogaNodeJNIBase.f18006jd = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.jpo, yogaNodeJNIBase.jpo, i10);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jd(jpo jpoVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.jpo, jpoVar.jpo());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void wqx(jpo jpoVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.jpo, jpoVar.jpo());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jd(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void wqx(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void cm(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jd(cm cmVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.jpo, cmVar.jpo(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void wqx() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.jpo);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void cm() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.jpo);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void wqx(cm cmVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.jpo, cmVar.jpo(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public int jpo(yd ydVar) {
        List<YogaNodeJNIBase> list = this.wqx;
        if (list == null) {
            return -1;
        }
        return list.indexOf(ydVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(float f10, float f11) {
        jd((yd) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.wqx;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.jd(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].jpo;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.jpo, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(wqx wqxVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.jpo, wqxVar.jpo());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(my myVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.jpo, myVar.jpo());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(jj jjVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.jpo, jjVar.jpo());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(jpo jpoVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.jpo, jpoVar.jpo());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(au auVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.jpo, auVar.jpo());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(oya oyaVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.jpo, oyaVar.jpo());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.jpo, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(cm cmVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.jpo, cmVar.jpo(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(qk qkVar) {
        this.f18005cm = qkVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.jpo, qkVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(boolean z10) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.jpo, z10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.yd
    public void jpo(Object obj) {
        this.f18007jj = obj;
    }
}
