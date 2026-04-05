package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.r2;
import com.applovin.shadow.okio.Segment;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements x3.a1, x3.i0, x3.j0 {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final String LOW_RES_ROTARY_ENCODER_FEATURE = "android.hardware.rotaryencoder.lowres";
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final p2 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    r2 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    a mAdapter;
    androidx.recyclerview.widget.c mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private b2 mChildDrawingOrderCallback;
    p mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    x3.q mDifferentialMotionFlingController;
    private final x3.r mDifferentialMotionFlingTarget;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private c mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    w0 mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private j2 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    d mItemAnimator;
    private d2 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<e> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    f mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    boolean mLowResRotaryEncoderFeature;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final m2 mObserver;
    private List<i2> mOnChildAttachStateListeners;
    private h mOnFlingListener;
    private final ArrayList<j2> mOnItemTouchListeners;
    final List<n> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    u0 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final j mRecycler;
    l2 mRecyclerListener;
    final List<l2> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    float mScaledHorizontalScrollFactor;
    float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private x3.l0 mScrollingChildHelper;
    final l mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final q2 mViewFlinger;
    private final l3 mViewInfoProcessCallback;
    final m3 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new n2();

        /* renamed from: e, reason: collision with root package name */
        public Parcelable f6948e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6948e = parcel.readParcelable(classLoader == null ? f.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f6948e, 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        private final z1 mObservable = new z1();
        private boolean mHasStableIds = false;
        private y1 mStateRestorationPolicy = y1.f7321b;

        public final void bindViewHolder(n nVar, int i10) {
            boolean z10 = nVar.mBindingAdapter == null;
            if (z10) {
                nVar.mPosition = i10;
                if (hasStableIds()) {
                    nVar.mItemId = getItemId(i10);
                }
                nVar.setFlags(1, 519);
                if (t3.u.isEnabled()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(nVar.mItemViewType)));
                }
            }
            nVar.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (nVar.itemView.getParent() == null && nVar.itemView.isAttachedToWindow() != nVar.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + nVar.isTmpDetached() + ", attached to window: " + nVar.itemView.isAttachedToWindow() + ", holder: " + nVar);
                }
                if (nVar.itemView.getParent() == null && nVar.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + nVar);
                }
            }
            onBindViewHolder(nVar, i10, nVar.getUnmodifiedPayloads());
            if (z10) {
                nVar.clearPayload();
                ViewGroup.LayoutParams layoutParams = nVar.itemView.getLayoutParams();
                if (layoutParams instanceof g) {
                    ((g) layoutParams).f6963c = true;
                }
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            return iOrdinal != 1 ? iOrdinal != 2 : getItemCount() > 0;
        }

        public final n createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                if (t3.u.isEnabled()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i10)));
                }
                n nVarOnCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (nVarOnCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                nVarOnCreateViewHolder.mItemViewType = i10;
                Trace.endSection();
                return nVarOnCreateViewHolder;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(a aVar, n nVar, int i10) {
            if (aVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final y1 getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.hasObservers();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.notifyItemRangeChanged(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.notifyItemRangeInserted(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.notifyItemMoved(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.notifyItemRangeChanged(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.notifyItemRangeInserted(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.notifyItemRangeRemoved(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.notifyItemRangeRemoved(i10, 1);
        }

        public abstract void onBindViewHolder(n nVar, int i10);

        public void onBindViewHolder(n nVar, int i10, List<Object> list) {
            onBindViewHolder(nVar, i10);
        }

        public abstract n onCreateViewHolder(ViewGroup viewGroup, int i10);

        public boolean onFailedToRecycleView(n nVar) {
            return false;
        }

        public void registerAdapterDataObserver(b bVar) {
            this.mObservable.registerObserver(bVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void setStateRestorationPolicy(y1 y1Var) {
            this.mStateRestorationPolicy = y1Var;
            this.mObservable.notifyStateRestorationPolicyChanged();
        }

        public void unregisterAdapterDataObserver(b bVar) {
            this.mObservable.unregisterObserver(bVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.notifyItemRangeChanged(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.notifyItemRangeChanged(i10, i11, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(n nVar) {
        }

        public void onViewDetachedFromWindow(n nVar) {
        }

        public void onViewRecycled(n nVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public void onItemRangeChanged(int i10, int i11) {
        }

        public void onItemRangeChanged(int i10, int i11, Object obj) {
            onItemRangeChanged(i10, i11);
        }

        public void onChanged() {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeInserted(int i10, int i11) {
        }

        public void onItemRangeRemoved(int i10, int i11) {
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public d2 f6949a = null;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f6950b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public long f6951c = 120;

        /* renamed from: d, reason: collision with root package name */
        public long f6952d = 120;

        /* renamed from: e, reason: collision with root package name */
        public long f6953e = 250;

        /* renamed from: f, reason: collision with root package name */
        public long f6954f = 250;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f6955a;

            /* renamed from: b, reason: collision with root package name */
            public int f6956b;

            public a setFrom(n nVar) {
                return setFrom(nVar, 0);
            }

            public a setFrom(n nVar, int i10) {
                View view = nVar.itemView;
                this.f6955a = view.getLeft();
                this.f6956b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        public static int a(n nVar) {
            int i10 = nVar.mFlags;
            int i11 = i10 & 14;
            if (nVar.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = nVar.getOldPosition();
                int absoluteAdapterPosition = nVar.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        public abstract boolean animateAppearance(n nVar, a aVar, a aVar2);

        public abstract boolean animateChange(n nVar, n nVar2, a aVar, a aVar2);

        public abstract boolean animateDisappearance(n nVar, a aVar, a aVar2);

        public abstract boolean animatePersistence(n nVar, a aVar, a aVar2);

        public boolean canReuseUpdatedViewHolder(n nVar) {
            return true;
        }

        public final void dispatchAnimationFinished(n nVar) {
            onAnimationFinished(nVar);
            d2 d2Var = this.f6949a;
            if (d2Var != null) {
                ((e2) d2Var).onAnimationFinished(nVar);
            }
        }

        public final void dispatchAnimationStarted(n nVar) {
            onAnimationStarted(nVar);
        }

        public final void dispatchAnimationsFinished() {
            ArrayList arrayList = this.f6950b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }

        public abstract void endAnimation(n nVar);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.f6951c;
        }

        public long getChangeDuration() {
            return this.f6954f;
        }

        public long getMoveDuration() {
            return this.f6953e;
        }

        public long getRemoveDuration() {
            return this.f6952d;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(c2 c2Var) {
            boolean zIsRunning = isRunning();
            if (c2Var != null) {
                if (!zIsRunning) {
                    c2Var.a();
                    return zIsRunning;
                }
                this.f6950b.add(c2Var);
            }
            return zIsRunning;
        }

        public a obtainHolderInfo() {
            return new a();
        }

        public a recordPostLayoutInformation(l lVar, n nVar) {
            return obtainHolderInfo().setFrom(nVar);
        }

        public a recordPreLayoutInformation(l lVar, n nVar, int i10, List<Object> list) {
            return obtainHolderInfo().setFrom(nVar);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j10) {
            this.f6951c = j10;
        }

        public void setChangeDuration(long j10) {
            this.f6954f = j10;
        }

        public void setMoveDuration(long j10) {
            this.f6953e = j10;
        }

        public void setRemoveDuration(long j10) {
            this.f6952d = j10;
        }

        public boolean canReuseUpdatedViewHolder(n nVar, List<Object> list) {
            return canReuseUpdatedViewHolder(nVar);
        }

        public void onAnimationFinished(n nVar) {
        }

        public void onAnimationStarted(n nVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class e {
        @Deprecated
        public void getItemOffsets(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, l lVar) {
            getItemOffsets(rect, ((g) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, l lVar) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, l lVar) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class f {
        boolean mAutoMeasure;
        p mChildHelper;
        private int mHeight;
        private int mHeightMode;
        j3 mHorizontalBoundCheck;
        private final i3 mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        k mSmoothScroller;
        j3 mVerticalBoundCheck;
        private final i3 mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f6957a;

            /* renamed from: b, reason: collision with root package name */
            public int f6958b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f6959c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f6960d;
        }

        public f() {
            f2 f2Var = new f2(this);
            this.mHorizontalBoundCheckCallback = f2Var;
            g2 g2Var = new g2(this);
            this.mVerticalBoundCheckCallback = g2Var;
            this.mHorizontalBoundCheck = new j3(f2Var);
            this.mVerticalBoundCheck = new j3(g2Var);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public static boolean b(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        public static int chooseSize(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L10
                if (r3 < 0) goto Le
            Lc:
                r2 = r0
                goto L1e
            Le:
                r3 = r2
                goto L1e
            L10:
                if (r3 < 0) goto L13
                goto Lc
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto Lc
            L18:
                r4 = -2
                if (r3 != r4) goto Le
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.f.getChildMeasureSpec(int, int, int, boolean):int");
        }

        public static a getProperties(Context context, AttributeSet attributeSet, int i10, int i11) {
            a aVar = new a();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i10, i11);
            aVar.f6957a = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
            aVar.f6958b = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_spanCount, 1);
            aVar.f6959c = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
            aVar.f6960d = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return aVar;
        }

        public final void a(View view, int i10, boolean z10) {
            n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z10 || childViewHolderInt.isRemoved()) {
                z.t1 t1Var = this.mRecyclerView.mViewInfoStore.f7196a;
                k3 k3VarA = (k3) t1Var.get(childViewHolderInt);
                if (k3VarA == null) {
                    k3VarA = k3.a();
                    t1Var.put(childViewHolderInt, k3VarA);
                }
                k3VarA.f7169a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            g gVar = (g) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.b(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iF = this.mChildHelper.f(view);
                if (i10 == -1) {
                    i10 = this.mChildHelper.d();
                }
                if (iF == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(a.b.h(this.mRecyclerView, sb2));
                }
                if (iF != i10) {
                    this.mRecyclerView.mLayout.moveView(iF, i10);
                }
            } else {
                this.mChildHelper.a(view, i10, false);
                gVar.f6963c = true;
                k kVar = this.mSmoothScroller;
                if (kVar != null && kVar.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (gVar.f6964d) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "consuming pending invalidate on child " + gVar.f6961a);
                }
                childViewHolderInt.itemView.invalidate();
                gVar.f6964d = false;
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i10, g gVar) {
            n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                z.t1 t1Var = this.mRecyclerView.mViewInfoStore.f7196a;
                k3 k3VarA = (k3) t1Var.get(childViewHolderInt);
                if (k3VarA == null) {
                    k3VarA = k3.a();
                    t1Var.put(childViewHolderInt, k3VarA);
                }
                k3VarA.f7169a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            this.mChildHelper.b(view, i10, gVar, childViewHolderInt.isRemoved());
        }

        public final void c(j jVar, int i10, View view) {
            n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "ignoring view " + childViewHolderInt);
                    return;
                }
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i10);
                jVar.h(childViewHolderInt);
            } else {
                detachViewAt(i10);
                jVar.i(view);
                this.mRecyclerView.mViewInfoStore.onViewDetached(childViewHolderInt);
            }
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(g gVar) {
            return gVar != null;
        }

        public int computeHorizontalScrollExtent(l lVar) {
            return 0;
        }

        public int computeHorizontalScrollOffset(l lVar) {
            return 0;
        }

        public int computeHorizontalScrollRange(l lVar) {
            return 0;
        }

        public int computeVerticalScrollExtent(l lVar) {
            return 0;
        }

        public int computeVerticalScrollOffset(l lVar) {
            return 0;
        }

        public int computeVerticalScrollRange(l lVar) {
            return 0;
        }

        public void detachAndScrapAttachedViews(j jVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                c(jVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, j jVar) {
            c(jVar, this.mChildHelper.f(view), view);
        }

        public void detachAndScrapViewAt(int i10, j jVar) {
            c(jVar, i10, getChildAt(i10));
        }

        public void detachView(View view) {
            int iF = this.mChildHelper.f(view);
            if (iF >= 0) {
                p pVar = this.mChildHelper;
                int iE = pVar.e(iF);
                pVar.f7212b.f(iE);
                pVar.f7211a.detachViewFromParent(iE);
            }
        }

        public void detachViewAt(int i10) {
            getChildAt(i10);
            p pVar = this.mChildHelper;
            int iE = pVar.e(i10);
            pVar.f7212b.f(iE);
            pVar.f7211a.detachViewFromParent(iE);
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, j jVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, jVar);
        }

        public void endAnimation(View view) {
            d dVar = this.mRecyclerView.mItemAnimator;
            if (dVar != null) {
                dVar.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f7213c.contains(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public View findViewByPosition(int i10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                n childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.isPreLayout() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract g generateDefaultLayoutParams();

        public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((g) view.getLayoutParams()).f6962b.bottom;
        }

        public View getChildAt(int i10) {
            p pVar = this.mChildHelper;
            if (pVar != null) {
                return pVar.c(i10);
            }
            return null;
        }

        public int getChildCount() {
            p pVar = this.mChildHelper;
            if (pVar != null) {
                return pVar.d();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(j jVar, l lVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getDecoratedBottom(View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((g) view.getLayoutParams()).f6962b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((g) view.getLayoutParams()).f6962b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f7213c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            a adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return this.mRecyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(View view) {
            return ((g) view.getLayoutParams()).f6962b.left;
        }

        public int getMinimumHeight() {
            return x3.z1.getMinimumHeight(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return x3.z1.getMinimumWidth(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return x3.z1.getPaddingEnd(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return x3.z1.getPaddingStart(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((g) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getRightDecorationWidth(View view) {
            return ((g) view.getLayoutParams()).f6962b.right;
        }

        public int getRowCountForAccessibility(j jVar, l lVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(j jVar, l lVar) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((g) view.getLayoutParams()).f6962b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((g) view.getLayoutParams()).f6962b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(a.b.h(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
            }
            n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(j jVar, l lVar) {
            return false;
        }

        public boolean isLayoutReversed() {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            k kVar = this.mSmoothScroller;
            return kVar != null && kVar.isRunning();
        }

        public boolean isViewPartiallyVisible(View view, boolean z10, boolean z11) {
            boolean z12 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
            return z10 ? z12 : !z12;
        }

        public void layoutDecorated(View view, int i10, int i11, int i12, int i13) {
            Rect rect = ((g) view.getLayoutParams()).f6962b;
            view.layout(i10 + rect.left, i11 + rect.top, i12 - rect.right, i13 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13) {
            g gVar = (g) view.getLayoutParams();
            Rect rect = gVar.f6962b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        }

        public void measureChild(View view, int i10, int i11) {
            g gVar = (g) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i12 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i10;
            int i13 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i11;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i12, ((ViewGroup.MarginLayoutParams) gVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i13, ((ViewGroup.MarginLayoutParams) gVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, gVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i10, int i11) {
            g gVar = (g) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i12 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i10;
            int i13 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i11;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) gVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) gVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, gVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i10, int i11) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                detachViewAt(i10);
                attachView(childAt, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i10);
            }
        }

        public void offsetChildrenVertical(int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i10);
            }
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i10, j jVar, l lVar) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(y3.c cVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, y3.c cVar) {
            n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
                return;
            }
            p pVar = this.mChildHelper;
            if (pVar.f7213c.contains(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, cVar);
        }

        public View onInterceptFocusSearch(View view, int i10) {
            return null;
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11) {
        }

        public void onLayoutChildren(j jVar, l lVar) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onMeasure(j jVar, l lVar, int i10, int i11) {
            this.mRecyclerView.defaultOnMeasure(i10, i11);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onSmoothScrollerStopped(k kVar) {
            if (this.mSmoothScroller == kVar) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i10, bundle);
        }

        public boolean performAccessibilityActionForItem(j jVar, l lVar, View view, int i10, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                x3.z1.postOnAnimation(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.g(childCount);
            }
        }

        public void removeAndRecycleAllViews(j jVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, jVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(j jVar) {
            ArrayList arrayList = jVar.f6968a;
            int size = arrayList.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = ((n) arrayList.get(i10)).itemView;
                n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    d dVar = this.mRecyclerView.mItemAnimator;
                    if (dVar != null) {
                        dVar.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    n childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    jVar.h(childViewHolderInt2);
                }
            }
            arrayList.clear();
            ArrayList arrayList2 = jVar.f6969b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, j jVar) {
            removeView(view);
            jVar.recycleView(view);
        }

        public void removeAndRecycleViewAt(int i10, j jVar) {
            View childAt = getChildAt(i10);
            removeViewAt(i10);
            jVar.recycleView(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            p pVar = this.mChildHelper;
            w1 w1Var = pVar.f7211a;
            int i10 = pVar.f7214d;
            if (i10 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i10 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                pVar.f7214d = 1;
                pVar.f7215e = view;
                int iIndexOfChild = w1Var.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (pVar.f7212b.f(iIndexOfChild)) {
                        pVar.h(view);
                    }
                    w1Var.removeViewAt(iIndexOfChild);
                }
                pVar.f7214d = 0;
                pVar.f7215e = null;
            } catch (Throwable th2) {
                pVar.f7214d = 0;
                pVar.f7215e = null;
                throw th2;
            }
        }

        public void removeViewAt(int i10) {
            if (getChildAt(i10) != null) {
                this.mChildHelper.g(i10);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.getPaddingLeft()
                int r1 = r8.getPaddingTop()
                int r2 = r8.getWidth()
                int r3 = r8.getPaddingRight()
                int r2 = r2 - r3
                int r3 = r8.getHeight()
                int r4 = r8.getPaddingBottom()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.getLayoutDirection()
                r7 = 1
                if (r3 != r7) goto L60
                if (r2 == 0) goto L5b
                goto L68
            L5b:
                int r2 = java.lang.Math.max(r6, r10)
                goto L68
            L60:
                if (r6 == 0) goto L63
                goto L67
            L63:
                int r6 = java.lang.Math.min(r4, r2)
            L67:
                r2 = r6
            L68:
                if (r1 == 0) goto L6b
                goto L6f
            L6b:
                int r1 = java.lang.Math.min(r5, r11)
            L6f:
                int[] r10 = new int[]{r2, r1}
                r11 = r10[r0]
                r10 = r10[r7]
                if (r13 == 0) goto Lb6
                android.view.View r13 = r9.getFocusedChild()
                if (r13 != 0) goto L80
                goto Lbb
            L80:
                int r1 = r8.getPaddingLeft()
                int r2 = r8.getPaddingTop()
                int r3 = r8.getWidth()
                int r4 = r8.getPaddingRight()
                int r3 = r3 - r4
                int r4 = r8.getHeight()
                int r5 = r8.getPaddingBottom()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.mRecyclerView
                android.graphics.Rect r5 = r5.mTempRect
                r8.getDecoratedBoundsWithMargins(r13, r5)
                int r13 = r5.left
                int r13 = r13 - r11
                if (r13 >= r3) goto Lbb
                int r13 = r5.right
                int r13 = r13 - r11
                if (r13 <= r1) goto Lbb
                int r13 = r5.top
                int r13 = r13 - r10
                if (r13 >= r4) goto Lbb
                int r13 = r5.bottom
                int r13 = r13 - r10
                if (r13 > r2) goto Lb6
                goto Lbb
            Lb6:
                if (r11 != 0) goto Lbc
                if (r10 == 0) goto Lbb
                goto Lbc
            Lbb:
                return r0
            Lbc:
                if (r12 == 0) goto Lc2
                r9.scrollBy(r11, r10)
                goto Lc5
            Lc2:
                r9.smoothScrollBy(r11, r10)
            Lc5:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.f.requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i10, j jVar, l lVar) {
            return 0;
        }

        public void scrollToPosition(int i10) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public int scrollVerticallyBy(int i10, j jVar, l lVar) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z10) {
            this.mAutoMeasure = z10;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z10) {
            if (z10 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z10;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.m();
                }
            }
        }

        public void setMeasureSpecs(int i10, int i11) {
            this.mWidth = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i10, int i11) {
            setMeasuredDimension(chooseSize(i10, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i11, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i10, int i11) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.mRecyclerView.mTempRect.set(i15, i13, i12, i14);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i10, i11);
        }

        public void setMeasurementCacheEnabled(boolean z10) {
            this.mMeasurementCacheEnabled = z10;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i10, int i11, g gVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) gVar).width) && b(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) gVar).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i10, int i11, g gVar) {
            return (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) gVar).width) && b(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) gVar).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, l lVar, int i10) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(k kVar) {
            k kVar2 = this.mSmoothScroller;
            if (kVar2 != null && kVar != kVar2 && kVar2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = kVar;
            kVar.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            k kVar = this.mSmoothScroller;
            if (kVar != null) {
                kVar.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i10) {
            a(view, i10, true);
        }

        public void addView(View view, int i10) {
            a(view, i10, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, j jVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(j jVar, l lVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            a aVar = this.mRecyclerView.mAdapter;
            if (aVar != null) {
                accessibilityEvent.setItemCount(aVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(j jVar, l lVar, y3.c cVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                cVar.addAction(Segment.SIZE);
                cVar.setScrollable(true);
                cVar.setGranularScrollingSupported(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                cVar.addAction(4096);
                cVar.setScrollable(true);
                cVar.setGranularScrollingSupported(true);
            }
            cVar.setCollectionInfo(y3.j.obtain(getRowCountForAccessibility(jVar, lVar), getColumnCountForAccessibility(jVar, lVar), isLayoutHierarchical(jVar, lVar), getSelectionModeForAccessibility(jVar, lVar)));
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
            onItemsUpdated(recyclerView, i10, i11);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, l lVar, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[PHI: r11
          0x0065: PHI (r11v8 int) = (r11v5 int), (r11v18 int) binds: [B:27:0x0081, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.j r11, androidx.recyclerview.widget.RecyclerView.l r12, int r13, android.os.Bundle r14) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.f.performAccessibilityAction(androidx.recyclerview.widget.RecyclerView$j, androidx.recyclerview.widget.RecyclerView$l, int, android.os.Bundle):boolean");
        }

        public boolean performAccessibilityActionForItem(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i10, bundle);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.f.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public g generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new g(context, attributeSet);
        }

        public void onInitializeAccessibilityNodeInfoForItem(j jVar, l lVar, View view, y3.c cVar) {
            cVar.setCollectionItemInfo(y3.k.obtain(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public void setMeasuredDimension(int i10, int i11) {
            this.mRecyclerView.setMeasuredDimension(i10, i11);
        }

        public void attachView(View view, int i10) {
            attachView(view, i10, (g) view.getLayoutParams());
        }

        public void attachView(View view) {
            attachView(view, -1);
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onLayoutCompleted(l lVar) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public void onScrollStateChanged(int i10) {
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z10, false);
        }

        public void collectInitialPrefetchPositions(int i10, h2 h2Var) {
        }

        public void onAdapterChanged(a aVar, a aVar2) {
        }

        public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        }

        public void collectAdjacentPrefetchPositions(int i10, int i11, l lVar, h2 h2Var) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class h {
        public abstract boolean onFling(int i10, int i11);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f6965a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        public int f6966b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final Set f6967c = Collections.newSetFromMap(new IdentityHashMap());

        public final k2 a(int i10) {
            SparseArray sparseArray = this.f6965a;
            k2 k2Var = (k2) sparseArray.get(i10);
            if (k2Var != null) {
                return k2Var;
            }
            k2 k2Var2 = new k2();
            sparseArray.put(i10, k2Var2);
            return k2Var2;
        }

        public void clear() {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f6965a;
                if (i10 >= sparseArray.size()) {
                    return;
                }
                k2 k2Var = (k2) sparseArray.valueAt(i10);
                Iterator it = k2Var.f7164a.iterator();
                while (it.hasNext()) {
                    g4.a.callPoolingContainerOnRelease(((n) it.next()).itemView);
                }
                k2Var.f7164a.clear();
                i10++;
            }
        }

        public n getRecycledView(int i10) {
            k2 k2Var = (k2) this.f6965a.get(i10);
            if (k2Var == null) {
                return null;
            }
            ArrayList arrayList = k2Var.f7164a;
            if (arrayList.isEmpty()) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((n) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (n) arrayList.remove(size);
                }
            }
            return null;
        }

        public int getRecycledViewCount(int i10) {
            return a(i10).f7164a.size();
        }

        public void putRecycledView(n nVar) {
            int itemViewType = nVar.getItemViewType();
            ArrayList arrayList = a(itemViewType).f7164a;
            if (((k2) this.f6965a.get(itemViewType)).f7165b <= arrayList.size()) {
                g4.a.callPoolingContainerOnRelease(nVar.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(nVar)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                nVar.resetInternal();
                arrayList.add(nVar);
            }
        }

        public void setMaxRecycledViews(int i10, int i11) {
            k2 k2VarA = a(i10);
            k2VarA.f7165b = i11;
            ArrayList arrayList = k2VarA.f7164a;
            while (arrayList.size() > i11) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public final class j {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f6968a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f6969b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f6970c;

        /* renamed from: d, reason: collision with root package name */
        public final List f6971d;

        /* renamed from: e, reason: collision with root package name */
        public int f6972e;

        /* renamed from: f, reason: collision with root package name */
        public int f6973f;

        /* renamed from: g, reason: collision with root package name */
        public i f6974g;

        /* renamed from: h, reason: collision with root package name */
        public m f6975h;

        public j() {
            ArrayList arrayList = new ArrayList();
            this.f6968a = arrayList;
            this.f6969b = null;
            this.f6970c = new ArrayList();
            this.f6971d = Collections.unmodifiableList(arrayList);
            this.f6972e = 2;
            this.f6973f = 2;
        }

        public static void c(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    c((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void a(n nVar, boolean z10) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(nVar);
            View view = nVar.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            r2 r2Var = recyclerView.mAccessibilityDelegate;
            if (r2Var != null) {
                x3.b itemDelegate = r2Var.getItemDelegate();
                x3.z1.setAccessibilityDelegate(view, itemDelegate instanceof r2.a ? (x3.b) ((r2.a) itemDelegate).f7236e.remove(view) : null);
            }
            if (z10) {
                if (recyclerView.mRecyclerListeners.size() > 0) {
                    recyclerView.mRecyclerListeners.get(0).getClass();
                    throw new ClassCastException();
                }
                a aVar = recyclerView.mAdapter;
                if (aVar != null) {
                    aVar.onViewRecycled(nVar);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(nVar);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "dispatchViewRecycled: " + nVar);
                }
            }
            nVar.mBindingAdapter = null;
            nVar.mOwnerRecyclerView = null;
            b().putRecycledView(nVar);
        }

        public final i b() {
            if (this.f6974g == null) {
                this.f6974g = new i();
                d();
            }
            return this.f6974g;
        }

        public void bindViewToPosition(View view, int i10) {
            g gVar;
            n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            RecyclerView recyclerView = RecyclerView.this;
            if (childViewHolderInt == null) {
                throw new IllegalArgumentException(a.b.h(recyclerView, new StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter")));
            }
            int iF = recyclerView.mAdapterHelper.f(i10, 0);
            if (iF < 0 || iF >= recyclerView.mAdapter.getItemCount()) {
                StringBuilder sbF = w0.i.f(i10, iF, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbF.append(recyclerView.mState.getItemCount());
                sbF.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbF.toString());
            }
            j(childViewHolderInt, iF, i10, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                gVar = (g) recyclerView.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(gVar);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                gVar = (g) layoutParams;
            } else {
                gVar = (g) recyclerView.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(gVar);
            }
            gVar.f6963c = true;
            gVar.f6961a = childViewHolderInt;
            gVar.f6964d = childViewHolderInt.itemView.getParent() == null;
        }

        public void clear() {
            this.f6968a.clear();
            f();
        }

        public int convertPreLayoutPositionToPostLayout(int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 >= 0 && i10 < recyclerView.mState.getItemCount()) {
                return !recyclerView.mState.isPreLayout() ? i10 : recyclerView.mAdapterHelper.f(i10, 0);
            }
            StringBuilder sbT = p0.o2.t(i10, "invalid position ", ". State item count is ");
            sbT.append(recyclerView.mState.getItemCount());
            sbT.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbT.toString());
        }

        public final void d() {
            if (this.f6974g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                i iVar = this.f6974g;
                iVar.f6967c.add(recyclerView.mAdapter);
            }
        }

        public final void e(a aVar, boolean z10) {
            i iVar = this.f6974g;
            if (iVar != null) {
                SparseArray sparseArray = iVar.f6965a;
                Set set = iVar.f6967c;
                set.remove(aVar);
                if (set.size() != 0 || z10) {
                    return;
                }
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((k2) sparseArray.get(sparseArray.keyAt(i10))).f7164a;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        g4.a.callPoolingContainerOnRelease(((n) arrayList.get(i11)).itemView);
                    }
                }
            }
        }

        public final void f() {
            ArrayList arrayList = this.f6970c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                g(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                u0 u0Var = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = u0Var.f7280c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                u0Var.f7281d = 0;
            }
        }

        public List<n> getScrapList() {
            return this.f6971d;
        }

        public View getViewForPosition(int i10) {
            return k(i10, Long.MAX_VALUE).itemView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:60:0x00d4, code lost:
        
            r4 = r4 - 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(androidx.recyclerview.widget.RecyclerView.n r12) {
            /*
                Method dump skipped, instructions count: 341
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.j.h(androidx.recyclerview.widget.RecyclerView$n):void");
        }

        public final void i(View view) {
            n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f6969b == null) {
                    this.f6969b = new ArrayList();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f6969b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(a.b.h(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f6968a.add(childViewHolderInt);
        }

        public final boolean j(n nVar, int i10, int i11, long j10) {
            nVar.mBindingAdapter = null;
            RecyclerView recyclerView = RecyclerView.this;
            nVar.mOwnerRecyclerView = recyclerView;
            int itemViewType = nVar.getItemViewType();
            long nanoTime = recyclerView.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE) {
                long j11 = this.f6974g.a(itemViewType).f7167d;
                if (j11 != 0 && j11 + nanoTime >= j10) {
                    return false;
                }
            }
            if (nVar.isTmpDetached()) {
                recyclerView.attachViewToParent(nVar.itemView, recyclerView.getChildCount(), nVar.itemView.getLayoutParams());
                z10 = true;
            }
            recyclerView.mAdapter.bindViewHolder(nVar, i10);
            if (z10) {
                recyclerView.detachViewFromParent(nVar.itemView);
            }
            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
            k2 k2VarA = this.f6974g.a(nVar.getItemViewType());
            long j12 = k2VarA.f7167d;
            if (j12 != 0) {
                nanoTime2 = (nanoTime2 / 4) + ((j12 / 4) * 3);
            }
            k2VarA.f7167d = nanoTime2;
            if (recyclerView.isAccessibilityEnabled()) {
                View view = nVar.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                r2 r2Var = recyclerView.mAccessibilityDelegate;
                if (r2Var != null) {
                    x3.b itemDelegate = r2Var.getItemDelegate();
                    if (itemDelegate instanceof r2.a) {
                        r2.a aVar = (r2.a) itemDelegate;
                        x3.b accessibilityDelegate = x3.z1.getAccessibilityDelegate(view);
                        if (accessibilityDelegate != null && accessibilityDelegate != aVar) {
                            aVar.f7236e.put(view, accessibilityDelegate);
                        }
                    }
                    x3.z1.setAccessibilityDelegate(view, itemDelegate);
                }
            }
            if (recyclerView.mState.isPreLayout()) {
                nVar.mPreLayoutPosition = i11;
            }
            return true;
        }

        public final void l(n nVar) {
            if (nVar.mInChangeScrap) {
                this.f6969b.remove(nVar);
            } else {
                this.f6968a.remove(nVar);
            }
            nVar.mScrapContainer = null;
            nVar.mInChangeScrap = false;
            nVar.clearReturnedFromScrapFlag();
        }

        public final void m() {
            f fVar = RecyclerView.this.mLayout;
            this.f6973f = this.f6972e + (fVar != null ? fVar.mPrefetchMaxCountObserved : 0);
            ArrayList arrayList = this.f6970c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f6973f; size--) {
                g(size);
            }
        }

        public void recycleView(View view) {
            n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            h(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.endAnimation(childViewHolderInt);
        }

        public void setViewCacheSize(int i10) {
            this.f6972e = i10;
            m();
        }

        public final void g(int i10) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                p0.o2.z(i10, KerkSviMAy.xKTlwC, RecyclerView.TAG);
            }
            ArrayList arrayList = this.f6970c;
            n nVar = (n) arrayList.get(i10);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "CachedViewHolder to be recycled: " + nVar);
            }
            a(nVar, true);
            arrayList.remove(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:220:0x03fa A[PHI: r1 r9
          0x03fa: PHI (r1v10 boolean) = (r1v9 boolean), (r1v15 boolean) binds: [B:131:0x0265, B:194:0x038c] A[DONT_GENERATE, DONT_INLINE]
          0x03fa: PHI (r9v3 androidx.recyclerview.widget.RecyclerView$n) = (r9v2 androidx.recyclerview.widget.RecyclerView$n), (r9v7 androidx.recyclerview.widget.RecyclerView$n) binds: [B:131:0x0265, B:194:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:254:0x04aa  */
        /* JADX WARN: Removed duplicated region for block: B:255:0x04b6  */
        /* JADX WARN: Removed duplicated region for block: B:263:0x04d3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.recyclerview.widget.RecyclerView.n k(int r21, long r22) {
            /*
                Method dump skipped, instructions count: 1275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.j.k(int, long):androidx.recyclerview.widget.RecyclerView$n");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class k {
        private f mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f6977a;

            /* renamed from: b, reason: collision with root package name */
            public int f6978b;

            /* renamed from: c, reason: collision with root package name */
            public int f6979c;

            /* renamed from: d, reason: collision with root package name */
            public int f6980d;

            /* renamed from: e, reason: collision with root package name */
            public Interpolator f6981e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f6982f;

            /* renamed from: g, reason: collision with root package name */
            public int f6983g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public final void a(RecyclerView recyclerView) {
                int i10 = this.f6980d;
                if (i10 >= 0) {
                    this.f6980d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i10);
                    this.f6982f = false;
                    return;
                }
                if (!this.f6982f) {
                    this.f6983g = 0;
                    return;
                }
                Interpolator interpolator = this.f6981e;
                if (interpolator != null && this.f6979c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i11 = this.f6979c;
                if (i11 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.smoothScrollBy(this.f6977a, this.f6978b, i11, interpolator);
                int i12 = this.f6983g + 1;
                this.f6983g = i12;
                if (i12 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f6982f = false;
            }

            public int getDuration() {
                return this.f6979c;
            }

            public int getDx() {
                return this.f6977a;
            }

            public int getDy() {
                return this.f6978b;
            }

            public Interpolator getInterpolator() {
                return this.f6981e;
            }

            public void jumpTo(int i10) {
                this.f6980d = i10;
            }

            public void setDuration(int i10) {
                this.f6982f = true;
                this.f6979c = i10;
            }

            public void setDx(int i10) {
                this.f6982f = true;
                this.f6977a = i10;
            }

            public void setDy(int i10) {
                this.f6982f = true;
                this.f6978b = i10;
            }

            public void setInterpolator(Interpolator interpolator) {
                this.f6982f = true;
                this.f6981e = interpolator;
            }

            public void update(int i10, int i11, int i12, Interpolator interpolator) {
                this.f6977a = i10;
                this.f6978b = i11;
                this.f6979c = i12;
                this.f6981e = interpolator;
                this.f6982f = true;
            }

            public a(int i10, int i11, int i12) {
                this(i10, i11, i12, null);
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f6980d = -1;
                this.f6982f = false;
                this.f6983g = 0;
                this.f6977a = i10;
                this.f6978b = i11;
                this.f6979c = i12;
                this.f6981e = interpolator;
            }
        }

        public PointF computeScrollVectorForPosition(int i10) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof o2) {
                return ((o2) layoutManager).computeScrollVectorForPosition(i10);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + o2.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i10) {
            return this.mRecyclerView.mLayout.findViewByPosition(i10);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public f getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i10) {
            this.mRecyclerView.scrollToPosition(i10);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i10, int i11) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f10 = pointFComputeScrollVectorForPosition.x;
                if (f10 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.a(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i10, i11, recyclerView.mState, this.mRecyclingAction);
                a aVar = this.mRecyclingAction;
                boolean z10 = aVar.f6980d >= 0;
                aVar.a(recyclerView);
                if (z10 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.a();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "smooth scroll target view has been attached");
                }
            }
        }

        public abstract void onSeekTargetStep(int i10, int i11, l lVar, a aVar);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, l lVar, a aVar);

        public void setTargetPosition(int i10) {
            this.mTargetPosition = i10;
        }

        public void start(RecyclerView recyclerView, f fVar) {
            recyclerView.mViewFlinger.stop();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = fVar;
            int i10 = this.mTargetPosition;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f6984a = i10;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.a();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f6984a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class l {

        /* renamed from: b, reason: collision with root package name */
        public SparseArray f6985b;

        /* renamed from: m, reason: collision with root package name */
        public int f6996m;

        /* renamed from: n, reason: collision with root package name */
        public long f6997n;

        /* renamed from: o, reason: collision with root package name */
        public int f6998o;

        /* renamed from: p, reason: collision with root package name */
        public int f6999p;

        /* renamed from: q, reason: collision with root package name */
        public int f7000q;

        /* renamed from: a, reason: collision with root package name */
        public int f6984a = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f6986c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f6987d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f6988e = 1;

        /* renamed from: f, reason: collision with root package name */
        public int f6989f = 0;

        /* renamed from: g, reason: collision with root package name */
        public boolean f6990g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f6991h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f6992i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f6993j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f6994k = false;

        /* renamed from: l, reason: collision with root package name */
        public boolean f6995l = false;

        public final void a(int i10) {
            if ((this.f6988e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f6988e));
        }

        public boolean didStructureChange() {
            return this.f6990g;
        }

        public <T> T get(int i10) {
            SparseArray sparseArray = this.f6985b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i10);
        }

        public int getItemCount() {
            return this.f6991h ? this.f6986c - this.f6987d : this.f6989f;
        }

        public int getRemainingScrollHorizontal() {
            return this.f6999p;
        }

        public int getRemainingScrollVertical() {
            return this.f7000q;
        }

        public int getTargetScrollPosition() {
            return this.f6984a;
        }

        public boolean hasTargetScrollPosition() {
            return this.f6984a != -1;
        }

        public boolean isMeasuring() {
            return this.f6993j;
        }

        public boolean isPreLayout() {
            return this.f6991h;
        }

        public void put(int i10, Object obj) {
            if (this.f6985b == null) {
                this.f6985b = new SparseArray();
            }
            this.f6985b.put(i10, obj);
        }

        public void remove(int i10) {
            SparseArray sparseArray = this.f6985b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i10);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
            sb2.append(this.f6984a);
            sb2.append(", mData=");
            sb2.append(this.f6985b);
            sb2.append(", mItemCount=");
            sb2.append(this.f6989f);
            sb2.append(", mIsMeasuring=");
            sb2.append(this.f6993j);
            sb2.append(", mPreviousLayoutItemCount=");
            sb2.append(this.f6986c);
            sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb2.append(this.f6987d);
            sb2.append(", mStructureChanged=");
            sb2.append(this.f6990g);
            sb2.append(", mInPreLayout=");
            sb2.append(this.f6991h);
            sb2.append(", mRunSimpleAnimations=");
            sb2.append(this.f6994k);
            sb2.append(", mRunPredictiveAnimations=");
            return a.b.p(sb2, this.f6995l, AbstractJsonLexerKt.END_OBJ);
        }

        public boolean willRunPredictiveAnimations() {
            return this.f6995l;
        }

        public boolean willRunSimpleAnimations() {
            return this.f6994k;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class m {
        public abstract View getViewForPositionAndType(j jVar, int i10, int i11);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class n {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f7001b = 0;
        public final View itemView;
        a mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        n mShadowedHolder = null;
        n mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        j mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public n(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
                return;
            }
            if ((1024 & this.mFlags) == 0) {
                if (this.mPayloads == null) {
                    ArrayList arrayList = new ArrayList();
                    this.mPayloads = arrayList;
                    this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
                }
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && x3.z1.hasTransientState(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final a getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            a adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !x3.z1.hasTransientState(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((g) this.itemView.getLayoutParams()).f6963c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        public void setScrapContainer(j jVar, boolean z10) {
            this.mScrapContainer = jVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbT = a.b.t(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbT.append(Integer.toHexString(hashCode()));
            sbT.append(" position=");
            sbT.append(this.mPosition);
            sbT.append(" id=");
            sbT.append(this.mItemId);
            sbT.append(", oldPos=");
            sbT.append(this.mOldPosition);
            sbT.append(", pLpos:");
            sbT.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sbT.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.l(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new t1();
        sDefaultEdgeEffectFactory = new p2();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(n nVar) {
        View view = nVar.itemView;
        boolean z10 = view.getParent() == this;
        this.mRecycler.l(getChildViewHolder(view));
        if (nVar.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        p pVar = this.mChildHelper;
        int iIndexOfChild = pVar.f7211a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        pVar.f7212b.h(iIndexOfChild);
        pVar.f7213c.add(view);
        pVar.f7211a.onEnteredHiddenState(view);
    }

    private void animateChange(n nVar, n nVar2, d.a aVar, d.a aVar2, boolean z10, boolean z11) {
        nVar.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(nVar);
        }
        if (nVar != nVar2) {
            if (z11) {
                addAnimatingView(nVar2);
            }
            nVar.mShadowedHolder = nVar2;
            addAnimatingView(nVar);
            this.mRecycler.l(nVar);
            nVar2.setIsRecyclable(false);
            nVar2.mShadowingHolder = nVar;
        }
        if (this.mItemAnimator.animateChange(nVar, nVar2, aVar, aVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(n nVar) {
        WeakReference<RecyclerView> weakReference = nVar.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == nVar.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            nVar.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && e4.i.getDistance(edgeEffect) != 0.0f) {
            int iRound = Math.round(e4.i.onPullDistance(edgeEffect, ((-i10) * FLING_DESTRETCH_FACTOR) / i11, 0.5f) * ((-i11) / FLING_DESTRETCH_FACTOR));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || e4.i.getDistance(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round(e4.i.onPullDistance(edgeEffect2, (i10 * FLING_DESTRETCH_FACTOR) / f10, 0.5f) * (f10 / FLING_DESTRETCH_FACTOR));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(f.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((f) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        y3.b.setContentChangeTypes(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        k3 k3Var;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f6993j = false;
        startInterceptRequestLayout();
        m3 m3Var = this.mViewInfoStore;
        m3Var.f7196a.clear();
        m3Var.f7197b.clear();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        l lVar = this.mState;
        lVar.f6992i = lVar.f6994k && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        lVar.f6991h = lVar.f6995l;
        lVar.f6989f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f6994k) {
            int iD = this.mChildHelper.d();
            for (int i10 = 0; i10 < iD; i10++) {
                n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    d.a aVarRecordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, d.a(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads());
                    z.t1 t1Var = this.mViewInfoStore.f7196a;
                    k3 k3VarA = (k3) t1Var.get(childViewHolderInt);
                    if (k3VarA == null) {
                        k3VarA = k3.a();
                        t1Var.put(childViewHolderInt, k3VarA);
                    }
                    k3VarA.f7170b = aVarRecordPreLayoutInformation;
                    k3VarA.f7169a |= 4;
                    if (this.mState.f6992i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f7197b.put(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f6995l) {
            saveOldPositions();
            l lVar2 = this.mState;
            boolean z10 = lVar2.f6990g;
            lVar2.f6990g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, lVar2);
            this.mState.f6990g = z10;
            for (int i11 = 0; i11 < this.mChildHelper.d(); i11++) {
                n childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.c(i11));
                if (!childViewHolderInt2.shouldIgnore() && ((k3Var = (k3) this.mViewInfoStore.f7196a.get(childViewHolderInt2)) == null || (k3Var.f7169a & 4) == 0)) {
                    int iA = d.a(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(Segment.SIZE);
                    if (!zHasAnyOfTheFlags) {
                        iA |= 4096;
                    }
                    d.a aVarRecordPreLayoutInformation2 = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, iA, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, aVarRecordPreLayoutInformation2);
                    } else {
                        z.t1 t1Var2 = this.mViewInfoStore.f7196a;
                        k3 k3VarA2 = (k3) t1Var2.get(childViewHolderInt2);
                        if (k3VarA2 == null) {
                            k3VarA2 = k3.a();
                            t1Var2.put(childViewHolderInt2, k3VarA2);
                        }
                        k3VarA2.f7169a |= 2;
                        k3VarA2.f7170b = aVarRecordPreLayoutInformation2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f6988e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f6989f = this.mAdapter.getItemCount();
        this.mState.f6987d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f6948e;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        l lVar = this.mState;
        lVar.f6991h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, lVar);
        l lVar2 = this.mState;
        lVar2.f6990g = false;
        lVar2.f6994k = lVar2.f6994k && this.mItemAnimator != null;
        lVar2.f6988e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        l lVar = this.mState;
        lVar.f6988e = 1;
        if (lVar.f6994k) {
            for (int iD = this.mChildHelper.d() - 1; iD >= 0; iD--) {
                n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(iD));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    d.a aVarRecordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    n nVar = (n) this.mViewInfoStore.f7197b.get(changedHolderKey);
                    if (nVar == null || nVar.shouldIgnore()) {
                        this.mViewInfoStore.a(childViewHolderInt, aVarRecordPostLayoutInformation);
                    } else {
                        k3 k3Var = (k3) this.mViewInfoStore.f7196a.get(nVar);
                        boolean z10 = (k3Var == null || (k3Var.f7169a & 1) == 0) ? false : true;
                        k3 k3Var2 = (k3) this.mViewInfoStore.f7196a.get(childViewHolderInt);
                        boolean z11 = (k3Var2 == null || (k3Var2.f7169a & 1) == 0) ? false : true;
                        if (z10 && nVar == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, aVarRecordPostLayoutInformation);
                        } else {
                            d.a aVarB = this.mViewInfoStore.b(nVar, 4);
                            this.mViewInfoStore.a(childViewHolderInt, aVarRecordPostLayoutInformation);
                            d.a aVarB2 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (aVarB == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, nVar);
                            } else {
                                animateChange(nVar, childViewHolderInt, aVarB, aVarB2, z10, z11);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            m3 m3Var = recyclerView.mViewInfoStore;
            l3 l3Var = recyclerView.mViewInfoProcessCallback;
            z.t1 t1Var = m3Var.f7196a;
            for (int size = t1Var.size() - 1; size >= 0; size--) {
                n nVar2 = (n) t1Var.keyAt(size);
                k3 k3Var3 = (k3) t1Var.removeAt(size);
                int i10 = k3Var3.f7169a;
                if ((i10 & 3) == 3) {
                    ((u1) l3Var).unused(nVar2);
                } else if ((i10 & 1) != 0) {
                    d.a aVar = k3Var3.f7170b;
                    if (aVar == null) {
                        ((u1) l3Var).unused(nVar2);
                    } else {
                        ((u1) l3Var).processDisappeared(nVar2, aVar, k3Var3.f7171c);
                    }
                } else if ((i10 & 14) == 14) {
                    ((u1) l3Var).processAppeared(nVar2, k3Var3.f7170b, k3Var3.f7171c);
                } else if ((i10 & 12) == 12) {
                    ((u1) l3Var).processPersistent(nVar2, k3Var3.f7170b, k3Var3.f7171c);
                } else if ((i10 & 4) != 0) {
                    ((u1) l3Var).processDisappeared(nVar2, k3Var3.f7170b, null);
                } else if ((i10 & 8) != 0) {
                    ((u1) l3Var).processAppeared(nVar2, k3Var3.f7170b, k3Var3.f7171c);
                }
                k3Var3.f7169a = 0;
                k3Var3.f7170b = null;
                k3Var3.f7171c = null;
                k3.f7168d.release(k3Var3);
            }
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.removeAndRecycleScrapInt(recyclerView.mRecycler);
        l lVar2 = recyclerView.mState;
        lVar2.f6986c = lVar2.f6989f;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        lVar2.f6994k = false;
        lVar2.f6995l = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = recyclerView.mRecycler.f6969b;
        if (arrayList != null) {
            arrayList.clear();
        }
        f fVar = recyclerView.mLayout;
        if (fVar.mPrefetchMaxObservedInInitialPrefetch) {
            fVar.mPrefetchMaxCountObserved = 0;
            fVar.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.mRecycler.m();
        }
        recyclerView.mLayout.onLayoutCompleted(recyclerView.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        m3 m3Var2 = recyclerView.mViewInfoStore;
        m3Var2.f7196a.clear();
        m3Var2.f7197b.clear();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        j2 j2Var = this.mInterceptingOnItemTouchListener;
        if (j2Var == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        ((s0) j2Var).onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            s0 s0Var = (s0) this.mOnItemTouchListeners.get(i10);
            if (s0Var.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = s0Var;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iD = this.mChildHelper.d();
        if (iD == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iD; i12++) {
            n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        n nVarFindViewHolderForAdapterPosition;
        l lVar = this.mState;
        int i10 = lVar.f6996m;
        if (i10 == -1) {
            i10 = 0;
        }
        int itemCount = lVar.getItemCount();
        for (int i11 = i10; i11 < itemCount; i11++) {
            n nVarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (nVarFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (nVarFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return nVarFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(itemCount, i10);
        do {
            iMin--;
            if (iMin < 0 || (nVarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!nVarFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return nVarFindViewHolderForAdapterPosition.itemView;
    }

    public static n getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((g) view.getLayoutParams()).f6961a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        g gVar = (g) view.getLayoutParams();
        Rect rect2 = gVar.f6962b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) gVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) gVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) gVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private x3.l0 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new x3.l0(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i10) {
        double dLog = Math.log((Math.abs(i10) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f10 = DECELERATION_RATE;
        return (float) (Math.exp((f10 / (f10 - 1.0d)) * dLog) * this.mPhysicalCoef * SCROLL_FRICTION);
    }

    private void handleMissingPreInfoForChangeError(long j10, n nVar, n nVar2) {
        int iD = this.mChildHelper.d();
        for (int i10 = 0; i10 < iD; i10++) {
            n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i10));
            if (childViewHolderInt != nVar && getChangedHolderKey(childViewHolderInt) == j10) {
                a aVar = this.mAdapter;
                if (aVar == null || !aVar.hasStableIds()) {
                    StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb2.append(childViewHolderInt);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(nVar);
                    throw new IllegalStateException(a.b.h(this, sb2));
                }
                StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb3.append(childViewHolderInt);
                sb3.append(" \n View Holder 2:");
                sb3.append(nVar);
                throw new IllegalStateException(a.b.h(this, sb3));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + nVar2 + " cannot be found but it is necessary for " + nVar + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iD = this.mChildHelper.d();
        for (int i10 = 0; i10 < iD; i10++) {
            n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        if (x3.z1.getImportantForAutofill(this) == 0) {
            x3.z1.setImportantForAutofill(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new p(new w1(this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c10 = 65535;
        int i12 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
        sb2.append(i10);
        throw new IllegalArgumentException(a.b.h(this, sb2));
    }

    private void nestedScrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        f fVar = this.mLayout;
        if (fVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = fVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i13 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i10 - releaseHorizontalGlow(i10, height);
        int iReleaseVerticalGlow = i11 - releaseVerticalGlow(i11, width);
        startNestedScroll(i13, i12);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i12)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, i12);
        w0 w0Var = this.mGapWorker;
        if (w0Var != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            w0Var.a(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i12);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        boolean z11 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.c cVar = this.mAdapterHelper;
            cVar.j(cVar.f7072b);
            cVar.j(cVar.f7073c);
            cVar.f7076f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.i();
        } else {
            this.mAdapterHelper.c();
        }
        boolean z12 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f6994k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z10 = this.mDataSetHasChangedAfterLayout) || z12 || this.mLayout.mRequestedSimpleAnimations) && (!z10 || this.mAdapter.hasStableIds());
        l lVar = this.mState;
        if (lVar.f6994k && z12 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z11 = true;
        }
        lVar.f6995l = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            e4.i.onPullDistance(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            e4.i.onPullDistance(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            e4.i.onPullDistance(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            e4.i.onPullDistance(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            r6.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void recoverFocusFromState() {
        /*
            r6 = this;
            boolean r0 = r6.mPreserveFocusAfterLayout
            if (r0 == 0) goto L99
            androidx.recyclerview.widget.RecyclerView$a r0 = r6.mAdapter
            if (r0 == 0) goto L99
            boolean r0 = r6.hasFocus()
            if (r0 == 0) goto L99
            int r0 = r6.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L99
            int r0 = r6.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L26
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L26
            goto L99
        L26:
            boolean r0 = r6.isFocused()
            if (r0 != 0) goto L3b
            android.view.View r0 = r6.getFocusedChild()
            androidx.recyclerview.widget.p r1 = r6.mChildHelper
            java.util.ArrayList r1 = r1.f7213c
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            goto L99
        L3b:
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.mState
            long r0 = r0.f6997n
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L57
            androidx.recyclerview.widget.RecyclerView$a r0 = r6.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L57
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.mState
            long r4 = r0.f6997n
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.findViewHolderForItemId(r4)
            goto L58
        L57:
            r0 = r1
        L58:
            if (r0 == 0) goto L72
            androidx.recyclerview.widget.p r4 = r6.mChildHelper
            android.view.View r5 = r0.itemView
            java.util.ArrayList r4 = r4.f7213c
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L72
            android.view.View r4 = r0.itemView
            boolean r4 = r4.hasFocusable()
            if (r4 != 0) goto L6f
            goto L72
        L6f:
            android.view.View r1 = r0.itemView
            goto L7e
        L72:
            androidx.recyclerview.widget.p r0 = r6.mChildHelper
            int r0 = r0.d()
            if (r0 <= 0) goto L7e
            android.view.View r1 = r6.findNextViewToFocus()
        L7e:
            if (r1 == 0) goto L99
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.mState
            int r0 = r0.f6998o
            long r4 = (long) r0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L96
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L96
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto L96
            r1 = r0
        L96:
            r1.requestFocus()
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.recoverFocusFromState():void");
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = 0.0f;
        if (edgeEffect == null || e4.i.getDistance(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && e4.i.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fOnPullDistance = e4.i.onPullDistance(this.mRightGlow, width, height);
                    if (e4.i.getDistance(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = fOnPullDistance;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -e4.i.onPullDistance(this.mLeftGlow, -width, 1.0f - height);
                if (e4.i.getDistance(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private int releaseVerticalGlow(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = 0.0f;
        if (edgeEffect == null || e4.i.getDistance(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && e4.i.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fOnPullDistance = e4.i.onPullDistance(this.mBottomGlow, height, 1.0f - width);
                    if (e4.i.getDistance(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = fOnPullDistance;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -e4.i.onPullDistance(this.mTopGlow, -height, width);
                if (e4.i.getDistance(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof g) {
            g gVar = (g) layoutParams;
            if (!gVar.f6963c) {
                Rect rect = gVar.f6962b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        l lVar = this.mState;
        lVar.f6997n = -1L;
        lVar.f6996m = -1;
        lVar.f6998o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        n nVarFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (nVarFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f6997n = this.mAdapter.hasStableIds() ? nVarFindContainingViewHolder.getItemId() : -1L;
        this.mState.f6996m = this.mDataSetHasChangedAfterLayout ? -1 : nVarFindContainingViewHolder.isRemoved() ? nVarFindContainingViewHolder.mOldPosition : nVarFindContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f6998o = getDeepestFocusedViewWithId(nVarFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(a aVar, boolean z10, boolean z11) {
        a aVar2 = this.mAdapter;
        if (aVar2 != null) {
            aVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.c cVar = this.mAdapterHelper;
        cVar.j(cVar.f7072b);
        cVar.j(cVar.f7073c);
        cVar.f7076f = 0;
        a aVar3 = this.mAdapter;
        this.mAdapter = aVar;
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.mObserver);
            aVar.onAttachedToRecyclerView(this);
        }
        f fVar = this.mLayout;
        if (fVar != null) {
            fVar.onAdapterChanged(aVar3, this.mAdapter);
        }
        j jVar = this.mRecycler;
        a aVar4 = this.mAdapter;
        jVar.clear();
        jVar.e(aVar3, true);
        i iVarB = jVar.b();
        if (aVar3 != null) {
            iVarB.f6966b--;
        }
        if (!z10 && iVarB.f6966b == 0) {
            iVarB.clear();
        }
        if (aVar4 != null) {
            iVarB.f6966b++;
        } else {
            iVarB.getClass();
        }
        jVar.d();
        this.mState.f6990g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        sDebugAssertionsEnabled = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        sVerboseLoggingEnabled = z10;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i10) < e4.i.getDistance(edgeEffect) * ((float) i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void startNestedScrollForType(int i10) {
        boolean zCanScrollHorizontally = this.mLayout.canScrollHorizontally();
        int i11 = zCanScrollHorizontally;
        if (this.mLayout.canScrollVertically()) {
            i11 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        startNestedScroll(i11, i10);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || e4.i.getDistance(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            e4.i.onPullDistance(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && e4.i.getDistance(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            e4.i.onPullDistance(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && e4.i.getDistance(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            e4.i.onPullDistance(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || e4.i.getDistance(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        e4.i.onPullDistance(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.stop();
        f fVar = this.mLayout;
        if (fVar != null) {
            fVar.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        f fVar = this.mLayout;
        if (fVar == null || !fVar.onAddFocusables(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void addItemDecoration(e eVar, int i10) {
        f fVar = this.mLayout;
        if (fVar != null) {
            fVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(eVar);
        } else {
            this.mItemDecorations.add(i10, eVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(i2 i2Var) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(i2Var);
    }

    public void addOnItemTouchListener(j2 j2Var) {
        this.mOnItemTouchListeners.add(j2Var);
    }

    public void addOnScrollListener(OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void addRecyclerListener(l2 l2Var) {
        w3.i.checkArgument(l2Var != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(l2Var);
    }

    public void animateAppearance(n nVar, d.a aVar, d.a aVar2) {
        nVar.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(nVar, aVar, aVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(n nVar, d.a aVar, d.a aVar2) {
        addAnimatingView(nVar);
        nVar.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(nVar, aVar, aVar2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(a.b.h(this, p0.o2.u(str)));
        }
        throw new IllegalStateException(a.b.h(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(a.b.h(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(a.b.h(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(n nVar) {
        d dVar = this.mItemAnimator;
        return dVar == null || dVar.canReuseUpdatedViewHolder(nVar, nVar.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && this.mLayout.checkLayoutParams((g) layoutParams);
    }

    public void clearOldPositions() {
        int childCount = this.mChildHelper.f7211a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f7211a.getChildAt(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        j jVar = this.mRecycler;
        ArrayList arrayList = jVar.f6968a;
        ArrayList arrayList2 = jVar.f6970c;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((n) arrayList2.get(i11)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((n) arrayList.get(i12)).clearOldPosition();
        }
        ArrayList arrayList3 = jVar.f6969b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((n) jVar.f6969b.get(i13)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<i2> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, x3.a1
    public int computeHorizontalScrollExtent() {
        f fVar = this.mLayout;
        if (fVar != null && fVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, x3.a1
    public int computeHorizontalScrollOffset() {
        f fVar = this.mLayout;
        if (fVar != null && fVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, x3.a1
    public int computeHorizontalScrollRange() {
        f fVar = this.mLayout;
        if (fVar != null && fVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, x3.a1
    public int computeVerticalScrollExtent() {
        f fVar = this.mLayout;
        if (fVar != null && fVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, x3.a1
    public int computeVerticalScrollOffset() {
        f fVar = this.mLayout;
        if (fVar != null && fVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, x3.a1
    public int computeVerticalScrollRange() {
        f fVar = this.mLayout;
        if (fVar != null && fVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            androidx.recyclerview.widget.c cVar = this.mAdapterHelper;
            int i10 = cVar.f7076f;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (cVar.g()) {
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.i();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i10, int i11) {
        setMeasuredDimension(f.chooseSize(i10, getPaddingRight() + getPaddingLeft(), x3.z1.getMinimumWidth(this)), f.chooseSize(i11, getPaddingBottom() + getPaddingTop(), x3.z1.getMinimumHeight(this)));
    }

    public void dispatchChildAttached(View view) {
        n childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        a aVar = this.mAdapter;
        if (aVar != null && childViewHolderInt != null) {
            aVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<i2> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((j6.f) this.mOnChildAttachStateListeners.get(size)).onChildViewAttachedToWindow(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        n childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        a aVar = this.mAdapter;
        if (aVar != null && childViewHolderInt != null) {
            aVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<i2> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((j6.f) this.mOnChildAttachStateListeners.get(size)).onChildViewDetachedFromWindow(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        f layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.canScrollVertically()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    smoothScrollBy(0, measuredHeight, null, Integer.MIN_VALUE);
                } else {
                    smoothScrollBy(0, -measuredHeight, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zIsLayoutReversed = layoutManager.isLayoutReversed();
                if (keyCode == 122) {
                    if (zIsLayoutReversed) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zIsLayoutReversed) {
                    itemCount = getAdapter().getItemCount();
                }
                smoothScrollToPosition(itemCount);
                return true;
            }
        } else if (layoutManager.canScrollHorizontally()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    smoothScrollBy(measuredWidth, 0, null, Integer.MIN_VALUE);
                } else {
                    smoothScrollBy(-measuredWidth, 0, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zIsLayoutReversed2 = layoutManager.isLayoutReversed();
                if (keyCode2 == 122) {
                    if (zIsLayoutReversed2) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zIsLayoutReversed2) {
                    itemCount = getAdapter().getItemCount();
                }
                smoothScrollToPosition(itemCount);
                return true;
            }
        }
        return false;
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f6993j = false;
        boolean z10 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f6988e == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            androidx.recyclerview.widget.c cVar = this.mAdapterHelper;
            if ((cVar.f7073c.isEmpty() || cVar.f7072b.isEmpty()) && !z10 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View, x3.i0, x3.k0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.View, x3.i0, x3.k0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.View, x3.i0, x3.k0
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, x3.i0, x3.k0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    public void dispatchOnScrollStateChanged(int i10) {
        f fVar = this.mLayout;
        if (fVar != null) {
            fVar.onScrollStateChanged(i10);
        }
        onScrollStateChanged(i10);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i10);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i10);
            }
        }
    }

    public void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i10, i11);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            n nVar = this.mPendingAccessibilityImportanceChange.get(size);
            if (nVar.itemView.getParent() == this && !nVar.shouldIgnore() && (i10 = nVar.mPendingAccessibilityState) != -1) {
                nVar.itemView.setImportantForAccessibility(i10);
                nVar.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mBottomGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mLeftGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mRightGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mTopGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(l lVar) {
        if (getScrollState() != 2) {
            lVar.f6999p = 0;
            lVar.f7000q = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.f7225e;
            lVar.f6999p = overScroller.getFinalX() - overScroller.getCurrX();
            lVar.f7000q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int iD = this.mChildHelper.d() - 1; iD >= 0; iD--) {
            View viewC = this.mChildHelper.c(iD);
            float translationX = viewC.getTranslationX();
            float translationY = viewC.getTranslationY();
            if (f10 >= viewC.getLeft() + translationX && f10 <= viewC.getRight() + translationX && f11 >= viewC.getTop() + translationY && f11 <= viewC.getBottom() + translationY) {
                return viewC;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public n findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public n findViewHolderForAdapterPosition(int i10) {
        n nVar = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int childCount = this.mChildHelper.f7211a.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f7211a.getChildAt(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i10) {
                p pVar = this.mChildHelper;
                if (!pVar.f7213c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                nVar = childViewHolderInt;
            }
        }
        return nVar;
    }

    public n findViewHolderForItemId(long j10) {
        a aVar = this.mAdapter;
        n nVar = null;
        if (aVar != null && aVar.hasStableIds()) {
            int childCount = this.mChildHelper.f7211a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f7211a.getChildAt(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    p pVar = this.mChildHelper;
                    if (!pVar.f7213c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    nVar = childViewHolderInt;
                }
            }
        }
        return nVar;
    }

    public n findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Deprecated
    public n findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    public boolean fling(int i10, int i11) {
        return fling(i10, i11, this.mMinFlingVelocity, this.mMaxFlingVelocity);
    }

    public boolean flingNoThresholdCheck(int i10, int i11) {
        return fling(i10, i11, 0, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0071  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        f fVar = this.mLayout;
        if (fVar != null) {
            return fVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(a.b.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        f fVar = this.mLayout;
        if (fVar != null) {
            return fVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(a.b.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public a getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(n nVar) {
        if (nVar.hasAnyOfTheFlags(IronSourceError.ERROR_PLACEMENT_CAPPED) || !nVar.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.applyPendingUpdatesToPosition(nVar.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        f fVar = this.mLayout;
        return fVar != null ? fVar.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(n nVar) {
        return this.mAdapter.hasStableIds() ? nVar.getItemId() : nVar.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        n childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public long getChildItemId(View view) {
        n childViewHolderInt;
        a aVar = this.mAdapter;
        if (aVar == null || !aVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        n childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public n getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public r2 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public c getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public d getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        g gVar = (g) view.getLayoutParams();
        boolean z10 = gVar.f6963c;
        Rect rect = gVar.f6962b;
        if (!z10 || (this.mState.isPreLayout() && (gVar.isItemChanged() || gVar.isViewInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i10).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i11 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        gVar.f6963c = false;
        return rect;
    }

    public e getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public f getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public h getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public i getRecycledViewPool() {
        return this.mRecycler.b();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View, x3.i0, x3.k0
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().hasNestedScrollingParent();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.c(new x1(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(a.b.h(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new s0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        f fVar = this.mLayout;
        if (fVar != null) {
            fVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        d dVar = this.mItemAnimator;
        return dVar != null && dVar.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, x3.i0, x3.k0
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().isNestedScrollingEnabled();
    }

    public void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i10);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int childCount = this.mChildHelper.f7211a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((g) this.mChildHelper.f7211a.getChildAt(i10).getLayoutParams()).f6963c = true;
        }
        ArrayList arrayList = this.mRecycler.f6970c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) ((n) arrayList.get(i11)).itemView.getLayoutParams();
            if (gVar != null) {
                gVar.f6963c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int childCount = this.mChildHelper.f7211a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f7211a.getChildAt(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        j jVar = this.mRecycler;
        ArrayList arrayList = jVar.f6970c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar != null) {
                nVar.addFlags(6);
                nVar.addChangePayload(null);
            }
        }
        a aVar = RecyclerView.this.mAdapter;
        if (aVar == null || !aVar.hasStableIds()) {
            jVar.f();
        }
    }

    public void nestedScrollBy(int i10, int i11) {
        nestedScrollByInternal(i10, i11, null, 1);
    }

    public void offsetChildrenHorizontal(int i10) {
        int iD = this.mChildHelper.d();
        for (int i11 = 0; i11 < iD; i11++) {
            this.mChildHelper.c(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int iD = this.mChildHelper.d();
        for (int i11 = 0; i11 < iD; i11++) {
            this.mChildHelper.c(i11).offsetTopAndBottom(i10);
        }
    }

    public void offsetPositionRecordsForInsert(int i10, int i11) {
        int childCount = this.mChildHelper.f7211a.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f7211a.getChildAt(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i11));
                }
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f6990g = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f6970c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            n nVar = (n) arrayList.get(i13);
            if (nVar != null && nVar.mPosition >= i10) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i13 + " holder " + nVar + " now at position " + (nVar.mPosition + i11));
                }
                nVar.offsetPosition(i11, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int childCount = this.mChildHelper.f7211a.getChildCount();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < childCount; i20++) {
            n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f7211a.getChildAt(i20));
            if (childViewHolderInt != null && (i18 = childViewHolderInt.mPosition) >= i13 && i18 <= i12) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i20 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f6990g = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f6970c;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i19 = 1;
            i16 = i11;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            n nVar = (n) arrayList.get(i21);
            if (nVar != null && (i17 = nVar.mPosition) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    nVar.offsetPosition(i11 - i10, false);
                } else {
                    nVar.offsetPosition(i19, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i21 + " holder " + nVar);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int childCount = this.mChildHelper.f7211a.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f7211a.getChildAt(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i11));
                    }
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f6990g = true;
                } else if (i14 >= i10) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f6990g = true;
                }
            }
        }
        j jVar = this.mRecycler;
        ArrayList arrayList = jVar.f6970c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar != null) {
                int i15 = nVar.mPosition;
                if (i15 >= i12) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + nVar + " now at position " + (nVar.mPosition - i11));
                    }
                    nVar.offsetPosition(-i11, z10);
                } else if (i15 >= i10) {
                    nVar.addFlags(8);
                    jVar.g(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$j r1 = r5.mRecycler
            r1.d()
            androidx.recyclerview.widget.RecyclerView$f r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L66
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.w0.f7296g
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.w0 r1 = (androidx.recyclerview.widget.w0) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.w0 r1 = new androidx.recyclerview.widget.w0
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = x3.z1.getDisplay(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.w0 r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f7300e = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.w0 r0 = r5.mGapWorker
            r0.add(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        w0 w0Var;
        super.onDetachedFromWindow();
        d dVar = this.mItemAnimator;
        if (dVar != null) {
            dVar.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        f fVar = this.mLayout;
        if (fVar != null) {
            fVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (k3.f7168d.acquire() != null) {
        }
        j jVar = this.mRecycler;
        ArrayList arrayList = jVar.f6970c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g4.a.callPoolingContainerOnRelease(((n) arrayList.get(i10)).itemView);
        }
        jVar.e(RecyclerView.this.mAdapter, false);
        g4.a.callPoolingContainerOnReleaseForChildren(this);
        if (!ALLOW_THREAD_GAP_WORK || (w0Var = this.mGapWorker) == null) {
            return;
        }
        w0Var.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float axisValue;
        RecyclerView recyclerView;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f10 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                z10 = false;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                f = f10;
                i10 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i10 = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    float f11 = -axisValue;
                    axisValue = 0.0f;
                    f = f11;
                } else if (!this.mLayout.canScrollHorizontally()) {
                    axisValue = 0.0f;
                }
                z10 = this.mLowResRotaryEncoderFeature;
            } else {
                i10 = 0;
                z10 = false;
                axisValue = 0.0f;
            }
            int i11 = (int) (f * this.mScaledVerticalScrollFactor);
            int i12 = (int) (axisValue * this.mScaledHorizontalScrollFactor);
            if (z10) {
                OverScroller overScroller = this.mViewFlinger.f7225e;
                recyclerView = this;
                recyclerView.smoothScrollBy((overScroller.getFinalX() - overScroller.getCurrX()) + i12, (overScroller.getFinalY() - overScroller.getCurrY()) + i11, null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                nestedScrollByInternal(i12, i11, motionEvent, 1);
            }
            if (i10 != 0 && !z10) {
                recyclerView.mDifferentialMotionFlingController.onMotionEvent(motionEvent, i10);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        f fVar = this.mLayout;
        if (fVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = fVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            startNestedScrollForType(0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i10 = x11 - this.mInitialTouchX;
                int i11 = y11 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i10) <= this.mTouchSlop) {
                    z10 = false;
                } else {
                    this.mLastTouchX = x11;
                    z10 = true;
                }
                if (zCanScrollVertically && Math.abs(i11) > this.mTouchSlop) {
                    this.mLastTouchY = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        f fVar = this.mLayout;
        if (fVar == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (fVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z10;
            if (z10 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f6988e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i10, i11);
            this.mState.f6993j = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i10, i11);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f6993j = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i10, i11);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            l lVar = this.mState;
            if (lVar.f6995l) {
                lVar.f6991h = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f6991h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f6995l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        a aVar = this.mAdapter;
        if (aVar != null) {
            this.mState.f6989f = aVar.getItemCount();
        } else {
            this.mState.f6989f = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
        stopInterceptRequestLayout(false);
        this.mState.f6991h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f6948e = savedState2.f6948e;
            return savedState;
        }
        f fVar = this.mLayout;
        if (fVar != null) {
            savedState.f6948e = fVar.onSaveInstanceState();
            return savedState;
        }
        savedState.f6948e = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[PHI: r1
      0x00dc: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c5, B:45:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        x3.z1.postOnAnimation(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(n nVar, d.a aVar) {
        nVar.setFlags(0, Segment.SIZE);
        if (this.mState.f6992i && nVar.isUpdated() && !nVar.isRemoved() && !nVar.shouldIgnore()) {
            this.mViewInfoStore.f7197b.put(getChangedHolderKey(nVar), nVar);
        }
        z.t1 t1Var = this.mViewInfoStore.f7196a;
        k3 k3VarA = (k3) t1Var.get(nVar);
        if (k3VarA == null) {
            k3VarA = k3.a();
            t1Var.put(nVar, k3VarA);
        }
        k3VarA.f7170b = aVar;
        k3VarA.f7169a |= 4;
    }

    public void removeAndRecycleViews() {
        d dVar = this.mItemAnimator;
        if (dVar != null) {
            dVar.endAnimations();
        }
        f fVar = this.mLayout;
        if (fVar != null) {
            fVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.clear();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        p pVar = this.mChildHelper;
        androidx.recyclerview.widget.n nVar = pVar.f7212b;
        w1 w1Var = pVar.f7211a;
        int i10 = pVar.f7214d;
        boolean z10 = false;
        z10 = false;
        if (i10 == 1) {
            if (pVar.f7215e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
        } else {
            if (i10 == 2) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
            }
            try {
                pVar.f7214d = 2;
                int iIndexOfChild = w1Var.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    pVar.h(view);
                } else if (nVar.d(iIndexOfChild)) {
                    nVar.f(iIndexOfChild);
                    pVar.h(view);
                    w1Var.removeViewAt(iIndexOfChild);
                }
                pVar.f7214d = 0;
                z10 = true;
            } finally {
                pVar.f7214d = 0;
            }
        }
        if (z10) {
            n childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.l(childViewHolderInt);
            this.mRecycler.h(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d(TAG, "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!z10);
        return z10;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        n childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(a.b.h(this, sb2));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(a.b.h(this, sb3));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(e eVar) {
        f fVar = this.mLayout;
        if (fVar != null) {
            fVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(eVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(i2 i2Var) {
        List<i2> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(i2Var);
    }

    public void removeOnItemTouchListener(j2 j2Var) {
        this.mOnItemTouchListeners.remove(j2Var);
        if (this.mInterceptingOnItemTouchListener == j2Var) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(l2 l2Var) {
        this.mRecyclerListeners.remove(l2Var);
    }

    public void repositionShadowingViews() {
        n nVar;
        int iD = this.mChildHelper.d();
        for (int i10 = 0; i10 < iD; i10++) {
            View viewC = this.mChildHelper.c(i10);
            n childViewHolder = getChildViewHolder(viewC);
            if (childViewHolder != null && (nVar = childViewHolder.mShadowingHolder) != null) {
                View view = nVar.itemView;
                int left = viewC.getLeft();
                int top = viewC.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s0) this.mOnItemTouchListeners.get(i10)).onRequestDisallowInterceptTouchEvent(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int childCount = this.mChildHelper.f7211a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f7211a.getChildAt(i10));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(a.b.h(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        f fVar = this.mLayout;
        if (fVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = fVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i10 = 0;
            }
            if (!zCanScrollVertically) {
                i11 = 0;
            }
            scrollByInternal(i10, i11, null, 0);
        }
    }

    public boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i13, i14, i15, i16, this.mScrollOffset, i12, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i24 = iArr5[0];
        this.mLastTouchX = i23 - i24;
        int i25 = this.mLastTouchY;
        int i26 = iArr5[1];
        this.mLastTouchY = i25 - i26;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !x3.h0.isFromSource(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i20, motionEvent.getY(), i22);
                if (Build.VERSION.SDK_INT >= 31 && x3.h0.isFromSource(motionEvent, 4194304)) {
                    releaseGlows();
                }
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            dispatchOnScrolled(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    public void scrollStep(int i10, int i11, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i10 != 0 ? this.mLayout.scrollHorizontallyBy(i10, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i11 != 0 ? this.mLayout.scrollVerticallyBy(i11, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        f fVar = this.mLayout;
        if (fVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            fVar.scrollToPosition(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(r2 r2Var) {
        this.mAccessibilityDelegate = r2Var;
        x3.z1.setAccessibilityDelegate(this, r2Var);
    }

    public void setAdapter(a aVar) {
        setLayoutFrozen(false);
        setAdapterInternal(aVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(b2 b2Var) {
        if (b2Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(n nVar, int i10) {
        if (!isComputingLayout()) {
            nVar.itemView.setImportantForAccessibility(i10);
            return true;
        }
        nVar.mPendingAccessibilityState = i10;
        this.mPendingAccessibilityImportanceChange.add(nVar);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(c cVar) {
        w3.i.checkNotNull(cVar);
        this.mEdgeEffectFactory = cVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(d dVar) {
        d dVar2 = this.mItemAnimator;
        if (dVar2 != null) {
            dVar2.endAnimations();
            this.mItemAnimator.f6949a = null;
        }
        this.mItemAnimator = dVar;
        if (dVar != null) {
            dVar.f6949a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.mRecycler.setViewCacheSize(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(f fVar) {
        if (fVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            d dVar = this.mItemAnimator;
            if (dVar != null) {
                dVar.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.clear();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.clear();
        }
        p pVar = this.mChildHelper;
        w1 w1Var = pVar.f7211a;
        pVar.f7212b.g();
        ArrayList arrayList = pVar.f7213c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w1Var.onLeftHiddenState((View) arrayList.get(size));
            arrayList.remove(size);
        }
        w1Var.removeAllViews();
        this.mLayout = fVar;
        if (fVar != null) {
            if (fVar.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(fVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(a.b.h(fVar.mRecyclerView, sb2));
            }
            fVar.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, x3.i0, x3.k0
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().setNestedScrollingEnabled(z10);
    }

    public void setOnFlingListener(h hVar) {
        this.mOnFlingListener = hVar;
    }

    @Deprecated
    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(i iVar) {
        j jVar = this.mRecycler;
        RecyclerView recyclerView = RecyclerView.this;
        jVar.e(recyclerView.mAdapter, false);
        if (jVar.f6974g != null) {
            r2.f6966b--;
        }
        jVar.f6974g = iVar;
        if (iVar != null && recyclerView.getAdapter() != null) {
            jVar.f6974g.f6966b++;
        }
        jVar.d();
    }

    public void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder sbT = p0.o2.t(i10, "setting scroll state to ", " from ");
            sbT.append(this.mScrollState);
            Log.d(TAG, sbT.toString(), new Exception());
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(m mVar) {
        this.mRecycler.f6975h = mVar;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? y3.b.getContentChangeTypes(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        f fVar = this.mLayout;
        if (fVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            fVar.smoothScrollToPosition(this, this.mState, i10);
        }
    }

    public void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View, x3.i0, x3.k0
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().startNestedScroll(i10);
    }

    public void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException(a.b.h(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, x3.i0, x3.k0
    public void stopNestedScroll() {
        getScrollingChildHelper().stopNestedScroll();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(a aVar, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(aVar, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int i13;
        int childCount = this.mChildHelper.f7211a.getChildCount();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = this.mChildHelper.f7211a.getChildAt(i15);
            n childViewHolderInt = getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i13 = childViewHolderInt.mPosition) >= i10 && i13 < i14) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((g) childAt.getLayoutParams()).f6963c = true;
            }
        }
        j jVar = this.mRecycler;
        ArrayList arrayList = jVar.f6970c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar != null && (i12 = nVar.mPosition) >= i10 && i12 < i14) {
                nVar.addFlags(2);
                jVar.g(size);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    private boolean fling(int i10, int i11, int i12, int i13) {
        int iMax;
        int i14;
        f fVar = this.mLayout;
        if (fVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        boolean zCanScrollHorizontally = fVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (!zCanScrollHorizontally || Math.abs(i10) < i12) {
            i10 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i11) < i12) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || e4.i.getDistance(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && e4.i.getDistance(edgeEffect2) != 0.0f) {
                    if (shouldAbsorb(this.mRightGlow, i10, getWidth())) {
                        this.mRightGlow.onAbsorb(i10);
                        i10 = 0;
                    }
                    iMax = i10;
                    i10 = 0;
                }
                iMax = 0;
            } else {
                int i15 = -i10;
                if (shouldAbsorb(this.mLeftGlow, i15, getWidth())) {
                    this.mLeftGlow.onAbsorb(i15);
                    i10 = 0;
                }
                iMax = i10;
                i10 = 0;
            }
        }
        if (i11 == 0) {
            i14 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || e4.i.getDistance(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 != null && e4.i.getDistance(edgeEffect4) != 0.0f) {
                    if (shouldAbsorb(this.mBottomGlow, i11, getHeight())) {
                        this.mBottomGlow.onAbsorb(i11);
                        i11 = 0;
                    }
                    i14 = 0;
                }
                i14 = i11;
                i11 = 0;
            } else {
                int i16 = -i11;
                if (shouldAbsorb(this.mTopGlow, i16, getHeight())) {
                    this.mTopGlow.onAbsorb(i16);
                    i11 = 0;
                }
                i14 = 0;
            }
        }
        if (iMax != 0 || i11 != 0) {
            int i17 = -i13;
            iMax = Math.max(i17, Math.min(iMax, i13));
            i11 = Math.max(i17, Math.min(i11, i13));
            startNestedScrollForType(1);
            this.mViewFlinger.fling(iMax, i11);
        }
        if (i10 == 0 && i14 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i14;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = zCanScrollHorizontally || zCanScrollVertically;
            dispatchNestedFling(f10, f11, z10);
            h hVar = this.mOnFlingListener;
            if (hVar != null && hVar.onFling(i10, i14)) {
                return true;
            }
            if (z10) {
                startNestedScrollForType(1);
                int i18 = -i13;
                this.mViewFlinger.fling(Math.max(i18, Math.min(i10, i13)), Math.max(i18, Math.min(i14, i13)));
                return true;
            }
        }
        return false;
    }

    @Override // x3.i0
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i10, i11, iArr, iArr2, i12);
    }

    @Override // x3.i0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().dispatchNestedScroll(i10, i11, i12, i13, iArr, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.n findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.p r0 = r5.mChildHelper
            androidx.recyclerview.widget.w1 r0 = r0.f7211a
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = 0
        La:
            if (r2 >= r0) goto L40
            androidx.recyclerview.widget.p r3 = r5.mChildHelper
            androidx.recyclerview.widget.w1 r3 = r3.f7211a
            android.view.View r3 = r3.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$n r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L3d
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L3d
            if (r7 == 0) goto L27
            int r4 = r3.mPosition
            if (r4 == r6) goto L2e
            goto L3d
        L27:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2e
            goto L3d
        L2e:
            androidx.recyclerview.widget.p r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            java.util.ArrayList r1 = r1.f7213c
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L3c
            r1 = r3
            goto L3d
        L3c:
            return r3
        L3d:
            int r2 = r2 + 1
            goto La
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$n");
    }

    @Override // x3.i0
    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().hasNestedScrollingParent(i10);
    }

    public void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            if (sDebugAssertionsEnabled && i10 < 0) {
                throw new IllegalStateException(a.b.h(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    @Override // x3.i0
    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().startNestedScroll(i10, i11);
    }

    @Override // x3.i0
    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().stopNestedScroll(i10);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i10);
        this.mObserver = new m2(this);
        this.mRecycler = new j();
        this.mViewInfoStore = new m3();
        this.mUpdateChildViewsRunnable = new r1(this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new e0();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new q2(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new u0() : null;
        this.mState = new l();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new e2(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new s1(this);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new u1(this);
        v1 v1Var = new v1(this);
        this.mDifferentialMotionFlingTarget = v1Var;
        this.mDifferentialMotionFlingController = new x3.q(getContext(), v1Var);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = x3.a2.getScaledHorizontalScrollFactor(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = x3.a2.getScaledVerticalScrollFactor(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f6949a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new r2(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i10, 0);
        x3.z1.saveAttributeDataForStyleable(this, context, androidx.recyclerview.R.styleable.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z10;
        if (z10) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.mLowResRotaryEncoderFeature = context.getPackageManager().hasSystemFeature(LOW_RES_ROTARY_ENCODER_FEATURE);
        createLayoutManager(context, string, attributeSet, i10, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        x3.z1.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        g4.a.setPoolingContainer(this, true);
    }

    @Override // x3.j0
    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().dispatchNestedScroll(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public n f6961a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f6962b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6963c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6964d;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6962b = new Rect();
            this.f6963c = true;
            this.f6964d = false;
        }

        public int getAbsoluteAdapterPosition() {
            return this.f6961a.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.f6961a.getBindingAdapterPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.f6961a.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.f6961a.getLayoutPosition();
        }

        @Deprecated
        public int getViewPosition() {
            return this.f6961a.getPosition();
        }

        public boolean isItemChanged() {
            return this.f6961a.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.f6961a.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.f6961a.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.f6961a.needsUpdate();
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f6962b = new Rect();
            this.f6963c = true;
            this.f6964d = false;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6962b = new Rect();
            this.f6963c = true;
            this.f6964d = false;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6962b = new Rect();
            this.f6963c = true;
            this.f6964d = false;
        }

        public g(g gVar) {
            super((ViewGroup.LayoutParams) gVar);
            this.f6962b = new Rect();
            this.f6963c = true;
            this.f6964d = false;
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        f fVar = this.mLayout;
        if (fVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!fVar.canScrollHorizontally()) {
            i10 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            startNestedScroll(i13, 1);
        }
        this.mViewFlinger.smoothScrollBy(i10, i11, i12, interpolator);
    }

    public void addItemDecoration(e eVar) {
        addItemDecoration(eVar, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        f fVar = this.mLayout;
        if (fVar != null) {
            return fVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(a.b.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i10) {
    }

    @Deprecated
    public void setRecyclerListener(l2 l2Var) {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class OnScrollListener {
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public void onScrolled(int i10, int i11) {
    }
}
