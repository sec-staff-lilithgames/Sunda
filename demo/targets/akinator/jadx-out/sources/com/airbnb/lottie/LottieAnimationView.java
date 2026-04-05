package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.messaging.m;
import f8.c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipInputStream;
import o9.v4;
import r7.a0;
import r7.b0;
import r7.d;
import r7.e;
import r7.e0;
import r7.g;
import r7.g0;
import r7.h;
import r7.h0;
import r7.i0;
import r7.k0;
import r7.o;
import r7.o0;
import r7.p0;
import r7.q0;
import r7.r0;
import r7.s0;
import x7.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: p, reason: collision with root package name */
    public static final e f12478p = new e();

    /* renamed from: b, reason: collision with root package name */
    public final b f12479b;

    /* renamed from: c, reason: collision with root package name */
    public final a f12480c;

    /* renamed from: e, reason: collision with root package name */
    public e0 f12481e;

    /* renamed from: f, reason: collision with root package name */
    public int f12482f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f12483g;

    /* renamed from: h, reason: collision with root package name */
    public String f12484h;

    /* renamed from: i, reason: collision with root package name */
    public int f12485i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12486j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12487k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12488l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f12489m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f12490n;

    /* renamed from: o, reason: collision with root package name */
    public k0 f12491o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new com.airbnb.lottie.a();

        /* renamed from: b, reason: collision with root package name */
        public String f12492b;

        /* renamed from: c, reason: collision with root package name */
        public int f12493c;

        /* renamed from: e, reason: collision with root package name */
        public float f12494e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f12495f;

        /* renamed from: g, reason: collision with root package name */
        public String f12496g;

        /* renamed from: h, reason: collision with root package name */
        public int f12497h;

        /* renamed from: i, reason: collision with root package name */
        public int f12498i;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f12492b);
            parcel.writeFloat(this.f12494e);
            parcel.writeInt(this.f12495f ? 1 : 0);
            parcel.writeString(this.f12496g);
            parcel.writeInt(this.f12497h);
            parcel.writeInt(this.f12498i);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f12499a;

        public a(LottieAnimationView lottieAnimationView) {
            this.f12499a = new WeakReference(lottieAnimationView);
        }

        @Override // r7.e0
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f12499a.get();
            if (lottieAnimationView == null) {
                return;
            }
            int i10 = lottieAnimationView.f12482f;
            if (i10 != 0) {
                lottieAnimationView.setImageResource(i10);
            }
            e0 e0Var = lottieAnimationView.f12481e;
            if (e0Var == null) {
                e0Var = LottieAnimationView.f12478p;
            }
            e0Var.onResult(th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f12500a;

        public b(LottieAnimationView lottieAnimationView) {
            this.f12500a = new WeakReference(lottieAnimationView);
        }

        @Override // r7.e0
        public void onResult(h hVar) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f12500a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(hVar);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f12479b = new b(this);
        this.f12480c = new a(this);
        this.f12482f = 0;
        this.f12483g = new a0();
        this.f12486j = false;
        this.f12487k = false;
        this.f12488l = true;
        this.f12489m = new HashSet();
        this.f12490n = new HashSet();
        b(null, R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(k0 k0Var) {
        i0 result = k0Var.getResult();
        a0 a0Var = this.f12483g;
        if (result != null && a0Var == getDrawable() && a0Var.getComposition() == result.getValue()) {
            return;
        }
        this.f12489m.add(g.f83890b);
        a0Var.clearComposition();
        a();
        this.f12491o = k0Var.addListener(this.f12479b).addFailureListener(this.f12480c);
    }

    public final void a() {
        k0 k0Var = this.f12491o;
        if (k0Var != null) {
            k0Var.removeListener(this.f12479b);
            this.f12491o.removeFailureListener(this.f12480c);
        }
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f12483g.addAnimatorListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f12483g.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f12483g.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(g0 g0Var) {
        if (getComposition() != null) {
            g0Var.a();
        }
        return this.f12490n.add(g0Var);
    }

    public <T> void addValueCallback(f fVar, T t10, c cVar) {
        this.f12483g.addValueCallback(fVar, (f) t10, cVar);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p0.f83980a, i10, 0);
        this.f12488l = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(21);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.f12487k = true;
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, false);
        a0 a0Var = this.f12483g;
        if (z10) {
            a0Var.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(19, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(18, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(5, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(13));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(15);
        float f10 = typedArrayObtainStyledAttributes.getFloat(15, 0.0f);
        if (zHasValue4) {
            this.f12489m.add(g.f83891c);
        }
        a0Var.setProgress(f10);
        enableMergePathsForKitKatAndAbove(typedArrayObtainStyledAttributes.getBoolean(9, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            addValueCallback(new f("**"), (f) h0.I, new c(new r0(l.a.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(7, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            int i11 = typedArrayObtainStyledAttributes.getInt(17, 0);
            if (i11 >= q0.values().length) {
                i11 = 0;
            }
            setRenderMode(q0.values()[i11]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int i12 = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (i12 >= q0.values().length) {
                i12 = 0;
            }
            setAsyncUpdates(r7.a.values()[i12]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void cancelAnimation() {
        this.f12487k = false;
        this.f12489m.add(g.f83895h);
        this.f12483g.cancelAnimation();
    }

    public <T> void clearValueCallback(f fVar, T t10) {
        this.f12483g.addValueCallback(fVar, (f) t10, (c) null);
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.f12483g.disableExtraScaleModeInFitXY();
    }

    public void enableFeatureFlag(b0 b0Var, boolean z10) {
        this.f12483g.enableFeatureFlag(b0Var, z10);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z10) {
        this.f12483g.enableFeatureFlag(b0.f83871b, z10);
    }

    public r7.a getAsyncUpdates() {
        return this.f12483g.getAsyncUpdates();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f12483g.getAsyncUpdatesEnabled();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f12483g.getClipTextToBoundingBox();
    }

    public boolean getClipToCompositionBounds() {
        return this.f12483g.getClipToCompositionBounds();
    }

    public h getComposition() {
        Drawable drawable = getDrawable();
        a0 a0Var = this.f12483g;
        if (drawable == a0Var) {
            return a0Var.getComposition();
        }
        return null;
    }

    public long getDuration() {
        h composition = getComposition();
        if (composition != null) {
            return (long) composition.getDuration();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f12483g.getFrame();
    }

    public String getImageAssetsFolder() {
        return this.f12483g.getImageAssetsFolder();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f12483g.getMaintainOriginalImageBounds();
    }

    public float getMaxFrame() {
        return this.f12483g.getMaxFrame();
    }

    public float getMinFrame() {
        return this.f12483g.getMinFrame();
    }

    public o0 getPerformanceTracker() {
        return this.f12483g.getPerformanceTracker();
    }

    public float getProgress() {
        return this.f12483g.getProgress();
    }

    public q0 getRenderMode() {
        return this.f12483g.getRenderMode();
    }

    public int getRepeatCount() {
        return this.f12483g.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f12483g.getRepeatMode();
    }

    public float getSpeed() {
        return this.f12483g.getSpeed();
    }

    public boolean hasMasks() {
        return this.f12483g.hasMasks();
    }

    public boolean hasMatte() {
        return this.f12483g.hasMatte();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof a0) && ((a0) drawable).getRenderMode() == q0.f83986e) {
            this.f12483g.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        a0 a0Var = this.f12483g;
        if (drawable2 == a0Var) {
            super.invalidateDrawable(a0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.f12483g.isAnimating();
    }

    public boolean isFeatureFlagEnabled(b0 b0Var) {
        return this.f12483g.isFeatureFlagEnabled(b0Var);
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.f12483g.isFeatureFlagEnabled(b0.f83871b);
    }

    @Deprecated
    public void loop(boolean z10) {
        this.f12483g.setRepeatCount(z10 ? -1 : 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f12487k) {
            return;
        }
        this.f12483g.playAnimation();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f12484h = savedState.f12492b;
        HashSet hashSet = this.f12489m;
        g gVar = g.f83890b;
        if (!hashSet.contains(gVar) && !TextUtils.isEmpty(this.f12484h)) {
            setAnimation(this.f12484h);
        }
        this.f12485i = savedState.f12493c;
        if (!hashSet.contains(gVar) && (i10 = this.f12485i) != 0) {
            setAnimation(i10);
        }
        if (!hashSet.contains(g.f83891c)) {
            this.f12483g.setProgress(savedState.f12494e);
        }
        if (!hashSet.contains(g.f83895h) && savedState.f12495f) {
            playAnimation();
        }
        if (!hashSet.contains(g.f83894g)) {
            setImageAssetsFolder(savedState.f12496g);
        }
        if (!hashSet.contains(g.f83892e)) {
            setRepeatMode(savedState.f12497h);
        }
        if (hashSet.contains(g.f83893f)) {
            return;
        }
        setRepeatCount(savedState.f12498i);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean zIsRunning;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12492b = this.f12484h;
        savedState.f12493c = this.f12485i;
        a0 a0Var = this.f12483g;
        savedState.f12494e = a0Var.getProgress();
        if (a0Var.isVisible()) {
            zIsRunning = a0Var.f83848c.isRunning();
        } else {
            int i10 = a0Var.W;
            zIsRunning = i10 == 2 || i10 == 3;
        }
        savedState.f12495f = zIsRunning;
        savedState.f12496g = a0Var.getImageAssetsFolder();
        savedState.f12497h = a0Var.getRepeatMode();
        savedState.f12498i = a0Var.getRepeatCount();
        return savedState;
    }

    public void pauseAnimation() {
        this.f12487k = false;
        this.f12483g.pauseAnimation();
    }

    public void playAnimation() {
        this.f12489m.add(g.f83895h);
        this.f12483g.playAnimation();
    }

    public void removeAllAnimatorListeners() {
        this.f12483g.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.f12490n.clear();
    }

    public void removeAllUpdateListeners() {
        this.f12483g.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f12483g.removeAnimatorListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f12483g.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(g0 g0Var) {
        return this.f12490n.remove(g0Var);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f12483g.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<f> resolveKeyPath(f fVar) {
        return this.f12483g.resolveKeyPath(fVar);
    }

    public void resumeAnimation() {
        this.f12489m.add(g.f83895h);
        this.f12483g.resumeAnimation();
    }

    public void reverseAnimationSpeed() {
        this.f12483g.reverseAnimationSpeed();
    }

    public void setAnimation(int i10) {
        this.f12485i = i10;
        this.f12484h = null;
        setCompositionTask(isInEditMode() ? new k0(new v4(this, i10, 1), true) : this.f12488l ? o.fromRawRes(getContext(), i10) : o.fromRawRes(getContext(), i10, null));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f12488l ? o.fromUrl(getContext(), str) : o.fromUrl(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f12483g.setApplyingOpacityToLayersEnabled(z10);
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f12483g.setApplyingShadowToLayersEnabled(z10);
    }

    public void setAsyncUpdates(r7.a aVar) {
        this.f12483g.setAsyncUpdates(aVar);
    }

    public void setCacheComposition(boolean z10) {
        this.f12488l = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f12483g.setClipTextToBoundingBox(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f12483g.setClipToCompositionBounds(z10);
    }

    public void setComposition(h hVar) {
        boolean z10 = d.f83874a;
        a0 a0Var = this.f12483g;
        a0Var.setCallback(this);
        this.f12486j = true;
        boolean composition = a0Var.setComposition(hVar);
        if (this.f12487k) {
            a0Var.playAnimation();
        }
        this.f12486j = false;
        if (getDrawable() != a0Var || composition) {
            if (!composition) {
                boolean zIsAnimating = isAnimating();
                setImageDrawable(null);
                setImageDrawable(a0Var);
                if (zIsAnimating) {
                    a0Var.resumeAnimation();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f12490n.iterator();
            if (it.hasNext()) {
                throw a.b.c(it);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f12483g.setDefaultFontFileExtension(str);
    }

    public void setFailureListener(e0 e0Var) {
        this.f12481e = e0Var;
    }

    public void setFallbackResource(int i10) {
        this.f12482f = i10;
    }

    public void setFontAssetDelegate(r7.b bVar) {
        this.f12483g.setFontAssetDelegate(bVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f12483g.setFontMap(map);
    }

    public void setFrame(int i10) {
        this.f12483g.setFrame(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f12483g.setIgnoreDisabledSystemAnimations(z10);
    }

    public void setImageAssetDelegate(r7.c cVar) {
        this.f12483g.setImageAssetDelegate(cVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f12483g.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f12485i = 0;
        this.f12484h = null;
        a();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f12485i = 0;
        this.f12484h = null;
        a();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f12485i = 0;
        this.f12484h = null;
        a();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f12483g.setMaintainOriginalImageBounds(z10);
    }

    public void setMaxFrame(int i10) {
        this.f12483g.setMaxFrame(i10);
    }

    public void setMaxProgress(float f10) {
        this.f12483g.setMaxProgress(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f12483g.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxProgress(float f10, float f11) {
        this.f12483g.setMinAndMaxProgress(f10, f11);
    }

    public void setMinFrame(int i10) {
        this.f12483g.setMinFrame(i10);
    }

    public void setMinProgress(float f10) {
        this.f12483g.setMinProgress(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f12483g.setOutlineMasksAndMattes(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f12483g.setPerformanceTrackingEnabled(z10);
    }

    public void setProgress(float f10) {
        this.f12489m.add(g.f83891c);
        this.f12483g.setProgress(f10);
    }

    public void setRenderMode(q0 q0Var) {
        this.f12483g.setRenderMode(q0Var);
    }

    public void setRepeatCount(int i10) {
        this.f12489m.add(g.f83893f);
        this.f12483g.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f12489m.add(g.f83892e);
        this.f12483g.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f12483g.setSafeMode(z10);
    }

    public void setSpeed(float f10) {
        this.f12483g.setSpeed(f10);
    }

    public void setTextDelegate(s0 s0Var) {
        this.f12483g.setTextDelegate(s0Var);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f12483g.setUseCompositionFrameRate(z10);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        a0 a0Var;
        if (!this.f12486j && drawable == (a0Var = this.f12483g) && a0Var.isAnimating()) {
            pauseAnimation();
        } else if (!this.f12486j && (drawable instanceof a0)) {
            a0 a0Var2 = (a0) drawable;
            if (a0Var2.isAnimating()) {
                a0Var2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        return this.f12483g.updateBitmap(str, bitmap);
    }

    public <T> void addValueCallback(f fVar, T t10, f8.e eVar) {
        this.f12483g.addValueCallback(fVar, (f) t10, (c) new r7.f());
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f12483g.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z10) {
        this.f12483g.setMinAndMaxFrame(str, str2, z10);
    }

    public void setMinFrame(String str) {
        this.f12483g.setMinFrame(str);
    }

    public void setMinAndMaxFrame(int i10, int i11) {
        this.f12483g.setMinAndMaxFrame(i10, i11);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(o.fromUrl(getContext(), str, str2));
    }

    public void setAnimation(String str) {
        k0 k0VarFromAsset;
        this.f12484h = str;
        this.f12485i = 0;
        if (isInEditMode()) {
            k0VarFromAsset = new k0(new m(10, this, str), true);
        } else {
            k0VarFromAsset = this.f12488l ? o.fromAsset(getContext(), str) : o.fromAsset(getContext(), str, null);
        }
        setCompositionTask(k0VarFromAsset);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12479b = new b(this);
        this.f12480c = new a(this);
        this.f12482f = 0;
        this.f12483g = new a0();
        this.f12486j = false;
        this.f12487k = false;
        this.f12488l = true;
        this.f12489m = new HashSet();
        this.f12490n = new HashSet();
        b(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(o.fromJsonInputStream(inputStream, str));
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(o.fromZipStream(zipInputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12479b = new b(this);
        this.f12480c = new a(this);
        this.f12482f = 0;
        this.f12483g = new a0();
        this.f12486j = false;
        this.f12487k = false;
        this.f12488l = true;
        this.f12489m = new HashSet();
        this.f12490n = new HashSet();
        b(attributeSet, i10);
    }
}
