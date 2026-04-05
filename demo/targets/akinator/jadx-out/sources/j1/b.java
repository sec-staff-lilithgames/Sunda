package j1;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    /* renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m4668isSupporteds9anfk8(int i10) {
        return Build.VERSION.SDK_INT >= 29 || x.m5070equalsimpl0(i10, x.f69020b.m5062getSrcOver0nO6VwU()) || m4670toPorterDuffModes9anfk8(i10) != PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final BlendMode m4669toAndroidBlendModes9anfk8(int i10) {
        w wVar = x.f69020b;
        return x.m5070equalsimpl0(i10, wVar.m5035getClear0nO6VwU()) ? BlendMode.CLEAR : x.m5070equalsimpl0(i10, wVar.m5058getSrc0nO6VwU()) ? BlendMode.SRC : x.m5070equalsimpl0(i10, wVar.m5041getDst0nO6VwU()) ? BlendMode.DST : x.m5070equalsimpl0(i10, wVar.m5062getSrcOver0nO6VwU()) ? BlendMode.SRC_OVER : x.m5070equalsimpl0(i10, wVar.m5045getDstOver0nO6VwU()) ? BlendMode.DST_OVER : x.m5070equalsimpl0(i10, wVar.m5060getSrcIn0nO6VwU()) ? BlendMode.SRC_IN : x.m5070equalsimpl0(i10, wVar.m5043getDstIn0nO6VwU()) ? BlendMode.DST_IN : x.m5070equalsimpl0(i10, wVar.m5061getSrcOut0nO6VwU()) ? BlendMode.SRC_OUT : x.m5070equalsimpl0(i10, wVar.m5044getDstOut0nO6VwU()) ? BlendMode.DST_OUT : x.m5070equalsimpl0(i10, wVar.m5059getSrcAtop0nO6VwU()) ? BlendMode.SRC_ATOP : x.m5070equalsimpl0(i10, wVar.m5042getDstAtop0nO6VwU()) ? BlendMode.DST_ATOP : x.m5070equalsimpl0(i10, wVar.m5063getXor0nO6VwU()) ? BlendMode.XOR : x.m5070equalsimpl0(i10, wVar.m5054getPlus0nO6VwU()) ? BlendMode.PLUS : x.m5070equalsimpl0(i10, wVar.m5051getModulate0nO6VwU()) ? BlendMode.MODULATE : x.m5070equalsimpl0(i10, wVar.m5056getScreen0nO6VwU()) ? BlendMode.SCREEN : x.m5070equalsimpl0(i10, wVar.m5053getOverlay0nO6VwU()) ? BlendMode.OVERLAY : x.m5070equalsimpl0(i10, wVar.m5039getDarken0nO6VwU()) ? BlendMode.DARKEN : x.m5070equalsimpl0(i10, wVar.m5049getLighten0nO6VwU()) ? BlendMode.LIGHTEN : x.m5070equalsimpl0(i10, wVar.m5038getColorDodge0nO6VwU()) ? BlendMode.COLOR_DODGE : x.m5070equalsimpl0(i10, wVar.m5037getColorBurn0nO6VwU()) ? BlendMode.COLOR_BURN : x.m5070equalsimpl0(i10, wVar.m5047getHardlight0nO6VwU()) ? BlendMode.HARD_LIGHT : x.m5070equalsimpl0(i10, wVar.m5057getSoftlight0nO6VwU()) ? BlendMode.SOFT_LIGHT : x.m5070equalsimpl0(i10, wVar.m5040getDifference0nO6VwU()) ? BlendMode.DIFFERENCE : x.m5070equalsimpl0(i10, wVar.m5046getExclusion0nO6VwU()) ? BlendMode.EXCLUSION : x.m5070equalsimpl0(i10, wVar.m5052getMultiply0nO6VwU()) ? BlendMode.MULTIPLY : x.m5070equalsimpl0(i10, wVar.m5048getHue0nO6VwU()) ? BlendMode.HUE : x.m5070equalsimpl0(i10, wVar.m5055getSaturation0nO6VwU()) ? BlendMode.SATURATION : x.m5070equalsimpl0(i10, wVar.m5036getColor0nO6VwU()) ? BlendMode.COLOR : x.m5070equalsimpl0(i10, wVar.m5050getLuminosity0nO6VwU()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m4670toPorterDuffModes9anfk8(int i10) {
        w wVar = x.f69020b;
        return x.m5070equalsimpl0(i10, wVar.m5035getClear0nO6VwU()) ? PorterDuff.Mode.CLEAR : x.m5070equalsimpl0(i10, wVar.m5058getSrc0nO6VwU()) ? PorterDuff.Mode.SRC : x.m5070equalsimpl0(i10, wVar.m5041getDst0nO6VwU()) ? PorterDuff.Mode.DST : x.m5070equalsimpl0(i10, wVar.m5062getSrcOver0nO6VwU()) ? PorterDuff.Mode.SRC_OVER : x.m5070equalsimpl0(i10, wVar.m5045getDstOver0nO6VwU()) ? PorterDuff.Mode.DST_OVER : x.m5070equalsimpl0(i10, wVar.m5060getSrcIn0nO6VwU()) ? PorterDuff.Mode.SRC_IN : x.m5070equalsimpl0(i10, wVar.m5043getDstIn0nO6VwU()) ? PorterDuff.Mode.DST_IN : x.m5070equalsimpl0(i10, wVar.m5061getSrcOut0nO6VwU()) ? PorterDuff.Mode.SRC_OUT : x.m5070equalsimpl0(i10, wVar.m5044getDstOut0nO6VwU()) ? PorterDuff.Mode.DST_OUT : x.m5070equalsimpl0(i10, wVar.m5059getSrcAtop0nO6VwU()) ? PorterDuff.Mode.SRC_ATOP : x.m5070equalsimpl0(i10, wVar.m5042getDstAtop0nO6VwU()) ? PorterDuff.Mode.DST_ATOP : x.m5070equalsimpl0(i10, wVar.m5063getXor0nO6VwU()) ? PorterDuff.Mode.XOR : x.m5070equalsimpl0(i10, wVar.m5054getPlus0nO6VwU()) ? PorterDuff.Mode.ADD : x.m5070equalsimpl0(i10, wVar.m5056getScreen0nO6VwU()) ? PorterDuff.Mode.SCREEN : x.m5070equalsimpl0(i10, wVar.m5053getOverlay0nO6VwU()) ? PorterDuff.Mode.OVERLAY : x.m5070equalsimpl0(i10, wVar.m5039getDarken0nO6VwU()) ? PorterDuff.Mode.DARKEN : x.m5070equalsimpl0(i10, wVar.m5049getLighten0nO6VwU()) ? PorterDuff.Mode.LIGHTEN : x.m5070equalsimpl0(i10, wVar.m5051getModulate0nO6VwU()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
