package kj;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.model.MessageType;
import hj.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class h {
    public static String configFor(MessageType messageType, int i10) {
        if (i10 == 1) {
            int i11 = g.f71551a[messageType.ordinal()];
            if (i11 == 1) {
                return "MODAL_PORTRAIT";
            }
            if (i11 == 2) {
                return "CARD_PORTRAIT";
            }
            if (i11 == 3) {
                return "IMAGE_ONLY_PORTRAIT";
            }
            if (i11 != 4) {
                return null;
            }
            return "BANNER_PORTRAIT";
        }
        int i12 = g.f71551a[messageType.ordinal()];
        if (i12 == 1) {
            return "MODAL_LANDSCAPE";
        }
        if (i12 == 2) {
            return "CARD_LANDSCAPE";
        }
        if (i12 == 3) {
            return "IMAGE_ONLY_LANDSCAPE";
        }
        if (i12 != 4) {
            return null;
        }
        return "BANNER_LANDSCAPE";
    }

    public hj.s providesBannerLandscapeLayoutConfig(DisplayMetrics displayMetrics) {
        s.a aVarBuilder = hj.s.builder();
        Float fValueOf = Float.valueOf(0.3f);
        s.a windowHeight = aVarBuilder.setMaxImageHeightWeight(fValueOf).setMaxImageWidthWeight(fValueOf).setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f))).setViewWindowGravity(48).setWindowFlag(65824).setWindowWidth(-1).setWindowHeight(-2);
        Boolean bool = Boolean.TRUE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    public hj.s providesBannerPortraitLayoutConfig(DisplayMetrics displayMetrics) {
        s.a aVarBuilder = hj.s.builder();
        Float fValueOf = Float.valueOf(0.3f);
        s.a windowHeight = aVarBuilder.setMaxImageHeightWeight(fValueOf).setMaxImageWidthWeight(fValueOf).setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f))).setViewWindowGravity(48).setWindowFlag(65824).setWindowWidth(-1).setWindowHeight(-2);
        Boolean bool = Boolean.TRUE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    public hj.s providesCardLandscapeConfig(DisplayMetrics displayMetrics) {
        s.a windowHeight = hj.s.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).setMaxDialogWidthPx(Integer.valueOf(displayMetrics.widthPixels)).setMaxImageHeightWeight(Float.valueOf(1.0f)).setMaxImageWidthWeight(Float.valueOf(0.5f)).setViewWindowGravity(17).setWindowFlag(327970).setWindowWidth(-2).setWindowHeight(-2);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    public hj.s providesCardPortraitConfig(DisplayMetrics displayMetrics) {
        s.a windowHeight = hj.s.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f))).setMaxImageHeightWeight(Float.valueOf(0.6f)).setMaxImageWidthWeight(Float.valueOf(1.0f)).setMaxBodyHeightWeight(Float.valueOf(0.1f)).setMaxBodyWidthWeight(Float.valueOf(0.9f)).setViewWindowGravity(17).setWindowFlag(327970).setWindowWidth(-2).setWindowHeight(-2);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    public hj.s providesLandscapeImageLayoutConfig(DisplayMetrics displayMetrics) {
        s.a maxDialogWidthPx = hj.s.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float fValueOf = Float.valueOf(0.8f);
        s.a windowHeight = maxDialogWidthPx.setMaxImageWidthWeight(fValueOf).setMaxImageHeightWeight(fValueOf).setViewWindowGravity(17).setWindowFlag(327938).setWindowWidth(-2).setWindowHeight(-2);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    public hj.s providesModalLandscapeConfig(DisplayMetrics displayMetrics) {
        s.a maxImageHeightWeight = hj.s.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).setMaxDialogWidthPx(Integer.valueOf(displayMetrics.widthPixels)).setMaxImageHeightWeight(Float.valueOf(1.0f));
        Float fValueOf = Float.valueOf(0.4f);
        s.a windowHeight = maxImageHeightWeight.setMaxImageWidthWeight(fValueOf).setMaxBodyHeightWeight(Float.valueOf(0.6f)).setMaxBodyWidthWeight(fValueOf).setViewWindowGravity(17).setWindowFlag(327938).setWindowWidth(-1).setWindowHeight(-1);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    public hj.s providesModalPortraitConfig(DisplayMetrics displayMetrics) {
        s.a maxBodyHeightWeight = hj.s.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f))).setMaxImageHeightWeight(Float.valueOf(0.6f)).setMaxBodyHeightWeight(Float.valueOf(0.1f));
        Float fValueOf = Float.valueOf(0.9f);
        s.a windowHeight = maxBodyHeightWeight.setMaxImageWidthWeight(fValueOf).setMaxBodyWidthWeight(fValueOf).setViewWindowGravity(17).setWindowFlag(327938).setWindowWidth(-1).setWindowHeight(-2);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }

    public hj.s providesPortraitImageLayoutConfig(DisplayMetrics displayMetrics) {
        s.a maxDialogWidthPx = hj.s.builder().setMaxDialogHeightPx(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f))).setMaxDialogWidthPx(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float fValueOf = Float.valueOf(0.8f);
        s.a windowHeight = maxDialogWidthPx.setMaxImageWidthWeight(fValueOf).setMaxImageHeightWeight(fValueOf).setViewWindowGravity(17).setWindowFlag(327938).setWindowWidth(-2).setWindowHeight(-2);
        Boolean bool = Boolean.FALSE;
        return windowHeight.setBackgroundEnabled(bool).setAnimate(bool).setAutoDismiss(bool).build();
    }
}
