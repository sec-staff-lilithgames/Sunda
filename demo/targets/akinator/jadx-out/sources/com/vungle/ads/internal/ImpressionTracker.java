package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.vungle.ads.internal.util.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ImpressionTracker {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final Map<View, TrackingInfo> trackedViews;
    private final Handler visibilityHandler;
    private final VisibilityRunnable visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ImpressionTracker";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ImpressionListener {
        void onImpression(View view);

        void onViewInvisible(View view);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TrackingInfo {
        private ImpressionListener impressionListener;
        private int minViewablePercent;

        public final ImpressionListener getImpressionListener() {
            return this.impressionListener;
        }

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setImpressionListener(ImpressionListener impressionListener) {
            this.impressionListener = impressionListener;
        }

        public final void setMinViewablePercent(int i10) {
            this.minViewablePercent = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VisibilityRunnable implements Runnable {
        private final ArrayList<View> visibleViews = new ArrayList<>();
        private final ArrayList<View> invisibleViews = new ArrayList<>();

        public VisibilityRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImpressionListener impressionListener;
            ImpressionListener impressionListener2;
            ImpressionTracker.this.isVisibilityScheduled = false;
            for (Map.Entry entry : ImpressionTracker.this.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (ImpressionTracker.this.isVisible(view, ((TrackingInfo) entry.getValue()).getMinViewablePercent())) {
                    this.visibleViews.add(view);
                } else {
                    this.invisibleViews.add(view);
                }
            }
            Iterator<View> it = this.visibleViews.iterator();
            while (it.hasNext()) {
                View view2 = it.next();
                TrackingInfo trackingInfo = (TrackingInfo) ImpressionTracker.this.trackedViews.get(view2);
                if (trackingInfo != null && (impressionListener2 = trackingInfo.getImpressionListener()) != null) {
                    impressionListener2.onImpression(view2);
                }
                ImpressionTracker impressionTracker = ImpressionTracker.this;
                e0.checkNotNullExpressionValue(view2, "view");
                impressionTracker.removeView(view2);
            }
            this.visibleViews.clear();
            Iterator<View> it2 = this.invisibleViews.iterator();
            while (it2.hasNext()) {
                View next = it2.next();
                TrackingInfo trackingInfo2 = (TrackingInfo) ImpressionTracker.this.trackedViews.get(next);
                if (trackingInfo2 != null && (impressionListener = trackingInfo2.getImpressionListener()) != null) {
                    impressionListener.onViewInvisible(next);
                }
            }
            this.invisibleViews.clear();
            if (ImpressionTracker.this.trackedViews.isEmpty() || ImpressionTracker.this.setViewTreeObserverSucceed) {
                return;
            }
            ImpressionTracker.this.scheduleVisibilityCheck();
        }
    }

    public ImpressionTracker(Context context, Map<View, TrackingInfo> trackedViews, Handler visibilityHandler) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(trackedViews, "trackedViews");
        e0.checkNotNullParameter(visibilityHandler, "visibilityHandler");
        this.trackedViews = trackedViews;
        this.visibilityHandler = visibilityHandler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new VisibilityRunnable();
        this.onPreDrawListener = new a(this, 0);
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m3589_init_$lambda0(ImpressionTracker this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.scheduleVisibilityCheck();
        return true;
    }

    private final View getTopView(Context context, View view) {
        Window window;
        View decorView;
        View viewFindViewById = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindViewById = decorView.findViewById(R.id.content);
        }
        if (viewFindViewById == null && view != null) {
            if (!z1.isAttachedToWindow(view)) {
                Logger.Companion companion = Logger.Companion;
                String TAG2 = TAG;
                e0.checkNotNullExpressionValue(TAG2, "TAG");
                companion.w(TAG2, "Trying to call View#rootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView != null) {
                viewFindViewById = rootView.findViewById(R.id.content);
            }
            if (viewFindViewById == null) {
                return rootView;
            }
        }
        return viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(View view, int i10) {
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() != 0) {
                    Logger.Companion.w("ImpressionTracker", "Parent visibility is not visible: " + parent);
                    return false;
                }
                parent = viewGroup.getParent();
            }
            if (!view.getGlobalVisibleRect(this.clipRect)) {
                return false;
            }
            long jHeight = this.clipRect.height() * this.clipRect.width();
            long height = view.getHeight() * view.getWidth();
            if (height > 0 && 100 * jHeight >= i10 * height) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private final boolean setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View topView = getTopView(context, view);
        if (topView == null) {
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            e0.checkNotNullExpressionValue(TAG2, "TAG");
            companion.d(TAG2, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
            return true;
        }
        Logger.Companion companion2 = Logger.Companion;
        String TAG3 = TAG;
        e0.checkNotNullExpressionValue(TAG3, "TAG");
        companion2.d(TAG3, "The root view tree observer was not alive");
        return false;
    }

    public final void addView(View view, ImpressionListener impressionListener) {
        e0.checkNotNullParameter(view, "view");
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        TrackingInfo trackingInfo = this.trackedViews.get(view);
        if (trackingInfo == null) {
            trackingInfo = new TrackingInfo();
            this.trackedViews.put(view, trackingInfo);
            scheduleVisibilityCheck();
        }
        trackingInfo.setMinViewablePercent(1);
        trackingInfo.setImpressionListener(impressionListener);
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    public final WeakReference<ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    public final void removeView(View view) {
        e0.checkNotNullParameter(view, "view");
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        e0.checkNotNullParameter(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImpressionTracker(Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        e0.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }
}
