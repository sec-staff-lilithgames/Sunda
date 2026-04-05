package com.bytedance.adsdk.jd;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.jd.qk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends ImageView {

    /* renamed from: jd, reason: collision with root package name */
    private static final ju<Throwable> f17239jd = new ju<Throwable>() { // from class: com.bytedance.adsdk.jd.jj.1
        @Override // com.bytedance.adsdk.jd.ju
        public void jpo(Throwable th2) {
            com.bytedance.adsdk.jd.jj.jj.jpo(th2);
        }
    };
    private static final String jpo = "jj";

    /* renamed from: au, reason: collision with root package name */
    private final Set<cm> f17240au;

    /* renamed from: cm, reason: collision with root package name */
    private final ju<Throwable> f17241cm;

    /* renamed from: dt, reason: collision with root package name */
    private int f17242dt;
    private int hmu;
    private qk hna;

    /* renamed from: hx, reason: collision with root package name */
    private JSONArray f17243hx;

    /* renamed from: if, reason: not valid java name */
    private boolean f4if;

    /* renamed from: jj, reason: collision with root package name */
    private int f17244jj;

    /* renamed from: jr, reason: collision with root package name */
    private Handler f17245jr;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f17246ju;
    private ju<Throwable> my;
    private long nmd;

    /* renamed from: nq, reason: collision with root package name */
    private int f17247nq;
    private int opi;
    private final Set<Object> oya;
    private final Runnable pdm;
    private au<qk> prr;

    /* renamed from: qk, reason: collision with root package name */
    private final zz f17248qk;

    /* renamed from: rq, reason: collision with root package name */
    private com.bytedance.adsdk.jd.wqx.wqx.wqx f17249rq;

    /* renamed from: rv, reason: collision with root package name */
    private jd f17250rv;

    /* renamed from: se, reason: collision with root package name */
    private String f17251se;

    /* renamed from: sq, reason: collision with root package name */
    private final Handler f17252sq;

    /* renamed from: tu, reason: collision with root package name */
    private int f17253tu;

    /* renamed from: uu, reason: collision with root package name */
    private jpo f17254uu;
    private final ju<qk> wqx;
    private String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f17255yd;
    private int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jd.jj$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            jpo = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jpo[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                jpo[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum cm {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class wqx extends View.BaseSavedState {
        public static final Parcelable.Creator<wqx> CREATOR = new Parcelable.Creator<wqx>() { // from class: com.bytedance.adsdk.jd.jj.wqx.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public wqx createFromParcel(Parcel parcel) {
                return new wqx(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public wqx[] newArray(int i10) {
                return new wqx[i10];
            }
        };

        /* renamed from: cm, reason: collision with root package name */
        boolean f17277cm;

        /* renamed from: jd, reason: collision with root package name */
        int f17278jd;

        /* renamed from: jj, reason: collision with root package name */
        int f17279jj;
        String jpo;
        String my;

        /* renamed from: qk, reason: collision with root package name */
        int f17280qk;
        float wqx;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.jpo);
            parcel.writeFloat(this.wqx);
            parcel.writeInt(this.f17277cm ? 1 : 0);
            parcel.writeString(this.my);
            parcel.writeInt(this.f17279jj);
            parcel.writeInt(this.f17280qk);
        }

        public wqx(Parcelable parcelable) {
            super(parcelable);
        }

        private wqx(Parcel parcel) {
            super(parcel);
            this.jpo = parcel.readString();
            this.wqx = parcel.readFloat();
            this.f17277cm = parcel.readInt() == 1;
            this.my = parcel.readString();
            this.f17279jj = parcel.readInt();
            this.f17280qk = parcel.readInt();
        }
    }

    public jj(Context context) {
        super(context);
        this.wqx = new ju<qk>() { // from class: com.bytedance.adsdk.jd.jj.6
            @Override // com.bytedance.adsdk.jd.ju
            public void jpo(qk qkVar) {
                jj.this.setComposition(qkVar);
            }
        };
        this.f17241cm = new ju<Throwable>() { // from class: com.bytedance.adsdk.jd.jj.7
            @Override // com.bytedance.adsdk.jd.ju
            public void jpo(Throwable th2) {
                if (jj.this.f17244jj != 0) {
                    jj jjVar = jj.this;
                    jjVar.setImageResource(jjVar.f17244jj);
                }
                (jj.this.my == null ? jj.f17239jd : jj.this.my).jpo(th2);
            }
        };
        this.f17244jj = 0;
        this.f17248qk = new zz();
        this.f17255yd = false;
        this.f17246ju = false;
        this.f4if = true;
        this.f17240au = new HashSet();
        this.oya = new HashSet();
        this.f17252sq = new Handler(Looper.getMainLooper());
        this.opi = 0;
        this.nmd = 0L;
        this.pdm = new Runnable() { // from class: com.bytedance.adsdk.jd.jj.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + jj.this.f17253tu + SFPXhf.NySvLFEznNtNGg + jj.this.f17242dt);
                if (jj.this.f17253tu > jj.this.f17242dt) {
                    jj.opi(jj.this);
                    com.bytedance.adsdk.jd.wqx.wqx.wqx wqxVar = jj.this.f17249rq;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jj.this.f17253tu);
                    wqxVar.jpo(sb2.toString());
                    jj.this.invalidate();
                    jj.this.prr();
                    return;
                }
                if (jj.this.hmu < 0 || jj.this.f17247nq < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + jj.this.hmu + "," + jj.this.f17247nq);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + jj.this.hmu);
                    jj.this.jpo();
                    jj jjVar = jj.this;
                    jjVar.setFrame(jjVar.hmu);
                    jj.this.jpo(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.jd.jj.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (jj.this.getFrame() < jj.this.f17247nq - 1 || jj.this.getFrame() >= jj.this.f17247nq + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + jj.this.f17247nq);
                            jj.this.jd(this);
                            jj.this.jj();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(jj.this.f17251se) || (jj.this.f17243hx != null && jj.this.f17243hx.length() > 0)) && jj.this.f17250rv != null) {
                    jd unused = jj.this.f17250rv;
                    String unused2 = jj.this.f17251se;
                    JSONArray unused3 = jj.this.f17243hx;
                }
            }
        };
        xyk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qk.jpo getGlobalConfig() {
        qk qkVarSe;
        zz zzVar = this.f17248qk;
        if (zzVar == null || (qkVarSe = zzVar.se()) == null) {
            return null;
        }
        return qkVarSe.ju();
    }

    private qk.jd getGlobalEvent() {
        qk qkVarSe;
        zz zzVar = this.f17248qk;
        if (zzVar == null || (qkVarSe = zzVar.se()) == null) {
            return null;
        }
        return qkVarSe.yd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        qk qkVarSe;
        zz zzVar = this.f17248qk;
        if (zzVar == null || (qkVarSe = zzVar.se()) == null) {
            return null;
        }
        return qkVarSe.zz();
    }

    public static /* synthetic */ int my(jj jjVar) {
        int i10 = jjVar.opi;
        jjVar.opi = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int opi(jj jjVar) {
        int i10 = jjVar.f17253tu;
        jjVar.f17253tu = i10 - 1;
        return i10;
    }

    private void setCompositionTask(au<qk> auVar) {
        this.f17240au.add(cm.SET_ANIMATION);
        sq();
        au();
        this.prr = auVar.jpo(this.wqx).wqx(this.f17241cm);
    }

    public boolean getClipToCompositionBounds() {
        return this.f17248qk.wqx();
    }

    public qk getComposition() {
        return this.hna;
    }

    public long getDuration() {
        qk qkVar = this.hna;
        if (qkVar != null) {
            return (long) qkVar.my();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f17248qk.jr();
    }

    public String getImageAssetsFolder() {
        return this.f17248qk.cm();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f17248qk.my();
    }

    public float getMaxFrame() {
        return this.f17248qk.prr();
    }

    public float getMinFrame() {
        return this.f17248qk.oya();
    }

    public opi getPerformanceTracker() {
        return this.f17248qk.xyk();
    }

    public float getProgress() {
        return this.f17248qk.rv();
    }

    public jr getRenderMode() {
        return this.f17248qk.jj();
    }

    public int getRepeatCount() {
        return this.f17248qk.rq();
    }

    public int getRepeatMode() {
        return this.f17248qk.nmd();
    }

    public float getSpeed() {
        return this.f17248qk.hna();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof zz) && ((zz) drawable).jj() == jr.SOFTWARE) {
            this.f17248qk.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        zz zzVar = this.f17248qk;
        if (drawable2 == zzVar) {
            super.invalidateDrawable(zzVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f17246ju) {
            return;
        }
        this.f17248qk.ju();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hna();
        Handler handler = this.f17245jr;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        wqx();
        jd();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof wqx)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wqx wqxVar = (wqx) parcelable;
        super.onRestoreInstanceState(wqxVar.getSuperState());
        this.xyk = wqxVar.jpo;
        Set<cm> set = this.f17240au;
        cm cmVar = cm.SET_ANIMATION;
        if (!set.contains(cmVar) && !TextUtils.isEmpty(this.xyk)) {
            setAnimation(this.xyk);
        }
        this.zz = wqxVar.f17278jd;
        if (!this.f17240au.contains(cmVar) && (i10 = this.zz) != 0) {
            setAnimation(i10);
        }
        if (!this.f17240au.contains(cm.SET_PROGRESS)) {
            jpo(wqxVar.wqx, false);
        }
        if (!this.f17240au.contains(cm.PLAY_OPTION) && wqxVar.f17277cm) {
            jpo();
        }
        if (!this.f17240au.contains(cm.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(wqxVar.my);
        }
        if (!this.f17240au.contains(cm.SET_REPEAT_MODE)) {
            setRepeatMode(wqxVar.f17279jj);
        }
        if (this.f17240au.contains(cm.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(wqxVar.f17280qk);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        wqx wqxVar = new wqx(super.onSaveInstanceState());
        wqxVar.jpo = this.xyk;
        wqxVar.f17278jd = this.zz;
        wqxVar.wqx = this.f17248qk.rv();
        wqxVar.f17277cm = this.f17248qk.dt();
        wqxVar.my = this.f17248qk.cm();
        wqxVar.f17279jj = this.f17248qk.nmd();
        wqxVar.f17280qk = this.f17248qk.rq();
        return wqxVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVarJpo = jpo(motionEvent);
        if (jpoVarJpo == null) {
            if (getGlobalConfig() == null || getGlobalConfig().jpo != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strZz = jpoVarJpo.zz();
        if (jpoVarJpo instanceof com.bytedance.adsdk.jd.wqx.wqx.jd) {
            if (getGlobalConfig() == null || getGlobalConfig().jpo != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strZz != null && strZz.startsWith("CSJCLOSE")) {
            hna();
        }
        yd ydVarJpo = jpo(jpoVarJpo.my());
        if (ydVarJpo != null && motionEvent.getAction() == 1) {
            jpo(strZz, ydVarJpo.my(), ydVarJpo.qk());
            int[][] iArrJj = ydVarJpo.jj();
            if (iArrJj != null) {
                jpo(iArrJj);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().f17426jd) != null) {
                jpo(iArr);
            }
        }
        if (strZz == null || !strZz.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(int i10) {
        this.zz = i10;
        this.xyk = null;
        setCompositionTask(jpo(i10));
    }

    public void setAnimationFromJson(String str) {
        jpo(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f4if ? xyk.jpo(getContext(), str) : xyk.jpo(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f17248qk.my(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.f4if = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f17248qk.jpo(z10);
    }

    public void setComposition(qk qkVar) {
        if (my.jpo) {
            Log.v(jpo, "Set Composition \n".concat(String.valueOf(qkVar)));
        }
        this.f17248qk.setCallback(this);
        this.hna = qkVar;
        this.f17255yd = true;
        boolean zJpo = this.f17248qk.jpo(qkVar, getContext().getApplicationContext());
        this.f17255yd = false;
        if (getDrawable() != this.f17248qk || zJpo) {
            if (!zJpo) {
                opi();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.oya.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f17248qk.qk(str);
    }

    public void setFailureListener(ju<Throwable> juVar) {
        this.my = juVar;
    }

    public void setFallbackResource(int i10) {
        this.f17244jj = i10;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.jd.wqx wqxVar) {
        this.f17248qk.jpo(wqxVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f17248qk.jpo(map);
    }

    public void setFrame(int i10) {
        this.f17248qk.wqx(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f17248qk.qk(z10);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.jd.cm cmVar) {
        this.f17248qk.jpo(cmVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f17248qk.jpo(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        au();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        au();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        au();
        super.setImageResource(i10);
    }

    public void setLottieAnimListener(jpo jpoVar) {
        this.f17254uu = jpoVar;
    }

    public void setLottieClicklistener(jd jdVar) {
        this.f17250rv = jdVar;
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f17248qk.jd(z10);
    }

    public void setMaxFrame(int i10) {
        this.f17248qk.jd(i10);
    }

    public void setMaxProgress(float f10) {
        this.f17248qk.jd(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f17248qk.cm(str);
    }

    public void setMinFrame(int i10) {
        this.f17248qk.jpo(i10);
    }

    public void setMinProgress(float f10) {
        this.f17248qk.jpo(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f17248qk.cm(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f17248qk.wqx(z10);
    }

    public void setProgress(float f10) {
        jpo(f10, true);
    }

    public void setRenderMode(jr jrVar) {
        this.f17248qk.jpo(jrVar);
    }

    public void setRepeatCount(int i10) {
        this.f17240au.add(cm.SET_REPEAT_COUNT);
        this.f17248qk.my(i10);
    }

    public void setRepeatMode(int i10) {
        this.f17240au.add(cm.SET_REPEAT_MODE);
        this.f17248qk.cm(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f17248qk.jj(z10);
    }

    public void setSpeed(float f10) {
        this.f17248qk.wqx(f10);
    }

    public void setTextDelegate(nmd nmdVar) {
        this.f17248qk.jpo(nmdVar);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f17248qk.xyk(z10);
    }

    public void setView(View view) {
        this.f17248qk.jpo(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        zz zzVar;
        if (!this.f17255yd && drawable == (zzVar = this.f17248qk) && zzVar.tu()) {
            jj();
        } else if (!this.f17255yd && (drawable instanceof zz)) {
            zz zzVar2 = (zz) drawable;
            if (zzVar2.tu()) {
                zzVar2.pdm();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private void au() {
        au<qk> auVar = this.prr;
        if (auVar != null) {
            auVar.jd(this.wqx);
            this.prr.cm(this.f17241cm);
        }
    }

    private void cm(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 >= f10 || f13 >= f11) {
            if (f12 / f13 >= f10 / f11) {
                float f14 = f10 / f12;
                matrix.preScale(f14, f14);
                matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
                return;
            } else {
                float f15 = f11 / f13;
                matrix.preScale(f15, f15);
                matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f12 / f13 >= f10 / f11) {
            float f16 = f10 / f12;
            matrix.preScale(f16, f16);
            matrix.postTranslate(0.0f, (f11 - (f13 * f16)) / 2.0f);
        } else {
            float f17 = f11 / f13;
            matrix.preScale(f17, f17);
            matrix.postTranslate((f10 - (f12 * f17)) / 2.0f, 0.0f);
        }
    }

    private void hna() {
        this.f17252sq.removeCallbacksAndMessages(null);
    }

    /* renamed from: if, reason: not valid java name */
    private void m378if() {
        jpo(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.jd.jj.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                nmd nmdVarHmu;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - jj.this.nmd;
                jj.this.jd(this);
                String playDelayedELExpressTimeS = jj.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (nmdVarHmu = jj.this.f17248qk.hmu()) != null) {
                    try {
                        int i10 = Integer.parseInt(nmdVarHmu.jpo(playDelayedELExpressTimeS)) * 1000;
                        if (jj.this.nmd > 0) {
                            long jElapsedRealtime2 = (jj.this.nmd + i10) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                jj.this.jj();
                                jj.this.setVisibility(8);
                                if (jj.this.f17245jr == null) {
                                    jj.this.f17245jr = new Handler(Looper.getMainLooper());
                                }
                                jj.this.f17245jr.removeCallbacksAndMessages(null);
                                jj.this.f17245jr.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.jd.jj.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        jj.this.setVisibility(0);
                                        jj.this.jpo();
                                        jj.this.jpo(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                jj.this.jpo(jElapsedRealtime);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    private void jd(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.f17248qk.getBounds().width();
        float fHeight = this.f17248qk.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.jpo[getScaleType().ordinal()];
        if (i10 == 1) {
            jpo(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            jd(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            wqx(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            cm(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ju() {
        final qk.jpo globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.my <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.f17429jj) && globalConfig.f17430qk == null) {
            return;
        }
        int maxFrame = globalConfig.my;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        jpo(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.jd.jj.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                jj.this.jd(this);
                if (jj.this.f17250rv != null) {
                    jd unused = jj.this.f17250rv;
                }
            }
        });
    }

    private void opi() {
        boolean zCm = cm();
        setImageDrawable(null);
        setImageDrawable(this.f17248qk);
        if (zCm) {
            this.f17248qk.au();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oya() throws NumberFormatException {
        zz zzVar;
        int i10;
        int i11;
        final int i12;
        if (this.hna == null || (zzVar = this.f17248qk) == null) {
            return;
        }
        nmd nmdVarHmu = zzVar.hmu();
        qk.wqx wqxVarXyk = this.hna.xyk();
        if (wqxVarXyk == null || nmdVarHmu == null) {
            return;
        }
        final int i13 = wqxVarXyk.jpo;
        if (i13 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i13)));
            return;
        }
        int[] iArr = wqxVarXyk.my;
        final int i14 = -1;
        if (iArr == null || iArr.length < 2) {
            i10 = -1;
            i11 = -1;
        } else {
            i11 = iArr[0];
            i10 = iArr[1];
        }
        String strJpo = nmdVarHmu.jpo(wqxVarXyk.wqx);
        String strJpo2 = nmdVarHmu.jpo(wqxVarXyk.f17439cm);
        try {
            i12 = Integer.parseInt(strJpo);
            try {
                i14 = Integer.parseInt(strJpo2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i12 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i12 + ", lenS: " + i14);
        if (TextUtils.isEmpty(wqxVarXyk.f17440jd)) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + wqxVarXyk.f17440jd);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + wqxVarXyk.f17440jd);
        com.bytedance.adsdk.jd.wqx.wqx.wqx wqxVarWqx = wqx(wqxVarXyk.f17440jd);
        if (wqxVarWqx != null) {
            Log.i("TMe", "--==--- timer success");
            this.f17251se = wqxVarXyk.f17441jj;
            this.f17243hx = wqxVarXyk.f17442qk;
            this.f17249rq = wqxVarWqx;
            this.f17253tu = i12;
            this.f17242dt = i12 - i14;
            this.hmu = i11;
            this.f17247nq = i10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f17253tu);
            wqxVarWqx.jpo(sb2.toString());
            jpo(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.jd.jj.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (jj.this.getFrame() < i13 - 1 || jj.this.getFrame() >= i13 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + jj.this.getFrame());
                    jj.this.jd(this);
                    if (i12 < 0 || i14 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        jj.this.prr();
                    }
                    jj.this.jj();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prr() {
        this.f17252sq.postDelayed(this.pdm, 1000L);
    }

    private void sq() {
        this.hna = null;
        this.f17248qk.yd();
    }

    private void wqx(Matrix matrix, float f10, float f11, float f12, float f13) {
        matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
    }

    private void xyk() {
        setSaveEnabled(false);
        this.f4if = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        jpo(0.0f, false);
        jpo(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.f17248qk.jpo(Boolean.valueOf(com.bytedance.adsdk.jd.jj.jj.jpo(getContext()) != 0.0f));
        zz();
        yd();
        m378if();
    }

    private void yd() {
        jpo(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.jd.jj.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) throws NumberFormatException {
                int i10;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                jj.my(jj.this);
                qk.jpo globalConfig = jj.this.getGlobalConfig();
                if (globalConfig != null && (i10 = globalConfig.f17427cm) > 0 && i10 > jj.this.opi) {
                    jj.this.oya();
                    jj.this.jpo();
                    jj.this.setProgress(0.0f);
                } else {
                    jj.this.jd(this);
                    if (jj.this.f17254uu != null) {
                        jpo unused = jj.this.f17254uu;
                    }
                }
            }
        });
    }

    private void zz() {
        jpo(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.jd.jj.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) throws NumberFormatException {
                jj.this.jd(this);
                jj.this.oya();
                jj.this.ju();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    public void jj() {
        this.f17246ju = false;
        this.f17248qk.pdm();
    }

    public void my() {
        this.f17240au.add(cm.PLAY_OPTION);
        this.f17248qk.hx();
    }

    public void setMaxFrame(String str) {
        this.f17248qk.wqx(str);
    }

    public void setMinFrame(String str) {
        this.f17248qk.jd(str);
    }

    private com.bytedance.adsdk.jd.wqx.wqx.wqx wqx(String str) {
        com.bytedance.adsdk.jd.wqx.wqx.jd jdVarJd;
        zz zzVar = this.f17248qk;
        if (zzVar == null || (jdVarJd = zzVar.jd()) == null) {
            return null;
        }
        return jpo(jdVarJd, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(long j10) {
        Map<String, Object> map;
        qk.jpo globalConfig = getGlobalConfig();
        if (this.f17254uu != null) {
            HashMap map2 = new HashMap();
            map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
            if (globalConfig == null || (map = globalConfig.f17428jd) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.f17428jd);
        }
    }

    public void setAnimation(String str) {
        this.xyk = str;
        this.zz = 0;
        setCompositionTask(jd(str));
    }

    public void wqx() {
        this.f17248qk.opi();
    }

    private yd jpo(String str) {
        zz zzVar;
        qk qkVarSe;
        Map<String, yd> mapHna;
        if (TextUtils.isEmpty(str) || (zzVar = this.f17248qk) == null || (qkVarSe = zzVar.se()) == null || (mapHna = qkVarSe.hna()) == null) {
            return null;
        }
        return mapHna.get(str);
    }

    public boolean cm() {
        return this.f17248qk.tu();
    }

    private void jd(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 < f10 && f13 < f11) {
            matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
            return;
        }
        if (f12 / f13 >= f10 / f11) {
            float f14 = f10 / f12;
            matrix.preScale(f14, f14);
            matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
        } else {
            float f15 = f11 / f13;
            matrix.preScale(f15, f15);
            matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
        }
    }

    private void jpo(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i10 = iArr2[0];
            final int i11 = iArr2[1];
            if (i10 < 0 || i11 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i10)));
            hna();
            jpo();
            setFrame(i10);
            jpo(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.jd.jj.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (jj.this.getFrame() < i11 - 1 || jj.this.getFrame() >= i11 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i11 + ", realFrame: " + jj.this.getFrame());
                    jj.this.jd(this);
                    jj.this.jj();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private au<qk> jd(final String str) {
        if (isInEditMode()) {
            return new au<>(new Callable<Cif<qk>>() { // from class: com.bytedance.adsdk.jd.jj.2
                @Override // java.util.concurrent.Callable
                /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
                public Cif<qk> call() throws Exception {
                    return jj.this.f4if ? xyk.wqx(jj.this.getContext(), str) : xyk.wqx(jj.this.getContext(), str, null);
                }
            }, true);
        }
        return this.f4if ? xyk.jd(getContext(), str) : xyk.jd(getContext(), str, (String) null);
    }

    public void jd(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f17248qk.jd(animatorUpdateListener);
    }

    private void jpo(String str, String str2, JSONArray jSONArray) {
        qk.jd globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.jpo;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.wqx;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    public void jd() {
        this.f17248qk.sq();
    }

    public void jd(Animator.AnimatorListener animatorListener) {
        this.f17248qk.jd(animatorListener);
    }

    private com.bytedance.adsdk.jd.wqx.wqx.jpo jpo(MotionEvent motionEvent) {
        com.bytedance.adsdk.jd.wqx.wqx.jd jdVarJd;
        zz zzVar = this.f17248qk;
        if (zzVar == null || (jdVarJd = zzVar.jd()) == null) {
            return null;
        }
        return jpo(jdVarJd, motionEvent);
    }

    private com.bytedance.adsdk.jd.wqx.wqx.jpo jpo(com.bytedance.adsdk.jd.wqx.wqx.jd jdVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVarJpo;
        for (com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar : jdVar.m383if()) {
            if (jpoVar instanceof com.bytedance.adsdk.jd.wqx.wqx.jd) {
                if (jpoVar.xyk() && jpoVar.jj() > 0.0f) {
                    RectF rectF = new RectF();
                    jpoVar.jpo(rectF, jpoVar.cm(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (jpoVarJpo = jpo((com.bytedance.adsdk.jd.wqx.wqx.jd) jpoVar, motionEvent)) != null) {
                        return jpoVarJpo;
                    }
                }
            } else if (jpoVar.xyk() && jpoVar.jj() > 0.0f) {
                RectF rectF2 = new RectF();
                zz zzVar = this.f17248qk;
                if (zzVar != null && zzVar.qk()) {
                    jpoVar.jpo(rectF2, jpoVar.cm(), true);
                    RectF rectFUu = this.f17248qk.uu();
                    if (rectFUu != null) {
                        jpo(rectF2, rectFUu);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    jpoVar.jpo(rectF3, jpoVar.cm(), true);
                    jd(rectF2, rectF3);
                }
                if (jpo(motionEvent, rectF2)) {
                    return jpoVar;
                }
            }
        }
        return null;
    }

    private boolean jpo(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (x10 >= rectF.left && x10 <= rectF.right && y10 >= rectF.top && y10 <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void jpo(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.jpo[getScaleType().ordinal()];
        if (i10 == 1) {
            jpo(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            jd(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            wqx(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            cm(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void jpo(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 / f13 >= f10 / f11) {
            float f14 = f11 / f13;
            matrix.preScale(f14, f14);
            matrix.postTranslate(-(((f12 * f14) - f10) / 2.0f), 0.0f);
        } else {
            float f15 = f10 / f12;
            matrix.preScale(f15, f15);
            matrix.postTranslate(0.0f, -(((f13 * f15) - f11) / 2.0f));
        }
    }

    public void jpo(boolean z10, Context context) {
        this.f17248qk.jpo(z10, context);
    }

    private au<qk> jpo(final int i10) {
        if (isInEditMode()) {
            return new au<>(new Callable<Cif<qk>>() { // from class: com.bytedance.adsdk.jd.jj.13
                @Override // java.util.concurrent.Callable
                /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
                public Cif<qk> call() throws Exception {
                    return jj.this.f4if ? xyk.jd(jj.this.getContext(), i10) : xyk.jd(jj.this.getContext(), i10, (String) null);
                }
            }, true);
        }
        return this.f4if ? xyk.jpo(getContext(), i10) : xyk.jpo(getContext(), i10, (String) null);
    }

    public void jpo(String str, String str2) {
        jpo(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void jpo(InputStream inputStream, String str) {
        setCompositionTask(xyk.jpo(inputStream, str));
    }

    private com.bytedance.adsdk.jd.wqx.wqx.wqx jpo(com.bytedance.adsdk.jd.wqx.wqx.jd jdVar, String str) {
        for (com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar : jdVar.m383if()) {
            if (jpoVar instanceof com.bytedance.adsdk.jd.wqx.wqx.jd) {
                com.bytedance.adsdk.jd.wqx.wqx.wqx wqxVarJpo = jpo((com.bytedance.adsdk.jd.wqx.wqx.jd) jpoVar, str);
                if (wqxVarJpo != null) {
                    return wqxVarJpo;
                }
            } else if (TextUtils.equals(str, jpoVar.zz()) && (jpoVar instanceof com.bytedance.adsdk.jd.wqx.wqx.wqx)) {
                return (com.bytedance.adsdk.jd.wqx.wqx.wqx) jpoVar;
            }
        }
        return null;
    }

    public void jpo() {
        if (this.nmd == 0) {
            this.nmd = SystemClock.elapsedRealtime();
        }
        this.f17240au.add(cm.PLAY_OPTION);
        this.f17248qk.ju();
    }

    public void jpo(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f17248qk.jpo(animatorUpdateListener);
    }

    public void jpo(Animator.AnimatorListener animatorListener) {
        this.f17248qk.jpo(animatorListener);
    }

    public void jpo(boolean z10) {
        this.f17248qk.my(z10 ? -1 : 0);
    }

    public Bitmap jpo(String str, Bitmap bitmap) {
        return this.f17248qk.jpo(str, bitmap);
    }

    private void jpo(float f10, boolean z10) {
        if (z10) {
            this.f17240au.add(cm.SET_PROGRESS);
        }
        this.f17248qk.cm(f10);
    }
}
