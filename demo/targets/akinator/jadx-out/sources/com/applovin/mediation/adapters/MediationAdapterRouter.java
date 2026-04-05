package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class MediationAdapterRouter {
    private static final Map<String, MediationAdapterRouter> sharedInstances = new HashMap();
    private static final Object sharedInstancesLock = new Object();
    protected MaxAdapter.OnCompletionListener mOnCompletionListener;
    private final String mTag = getClass().getSimpleName();
    private final Map<String, List<MediationAdapterRouterListenerWrapper>> listeners = new HashMap();
    private final Object listenersLock = new Object();
    private final Set<MaxAdapter> loadedAdapters = Collections.synchronizedSet(new HashSet());
    private final Set<MaxAdapter> showingAdapters = Collections.synchronizedSet(new HashSet());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class MediationAdapterRouterListenerWrapper {
        private View mAdView;
        private final MaxAdapter mAdapter;
        private final MaxAdapterListener mListener;
        private final RouterAdLoadType mLoadType;

        public MediationAdapterRouterListenerWrapper(MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, RouterAdLoadType routerAdLoadType, View view) {
            this.mAdapter = maxAdapter;
            this.mListener = maxAdapterListener;
            this.mLoadType = routerAdLoadType;
            this.mAdView = view;
        }

        public View getAdView() {
            return this.mAdView;
        }

        public MaxAdapter getAdapter() {
            return this.mAdapter;
        }

        public MaxAdapterListener getListener() {
            return this.mListener;
        }

        public RouterAdLoadType getLoadType() {
            return this.mLoadType;
        }

        public void setAdView(View view) {
            this.mAdView = view;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum RouterAdLoadType {
        INTERSTITIAL,
        APPOPEN,
        REWARDED,
        ADVIEW
    }

    private void addAdapter(MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, String str, RouterAdLoadType routerAdLoadType, View view) throws Throwable {
        synchronized (this.listenersLock) {
            try {
                try {
                    MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper = new MediationAdapterRouterListenerWrapper(maxAdapter, maxAdapterListener, routerAdLoadType, view);
                    List<MediationAdapterRouterListenerWrapper> arrayList = this.listeners.get(str) != null ? this.listeners.get(str) : new ArrayList<>(1);
                    arrayList.add(mediationAdapterRouterListenerWrapper);
                    this.listeners.put(str, arrayList);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private List<MediationAdapterRouterListenerWrapper> getListenerWrappers(String str) {
        if (this.listeners.containsKey(str)) {
            return new ArrayList(this.listeners.get(str));
        }
        return null;
    }

    private List<MediationAdapterRouterListenerWrapper> getLoadingListenerWrappers(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
                if (listenerWrappers == null || listenerWrappers.size() <= 0) {
                    return null;
                }
                for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
                    if (!isAdLoaded(mediationAdapterRouterListenerWrapper.getAdapter())) {
                        arrayList.add(mediationAdapterRouterListenerWrapper);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static MediationAdapterRouter getSharedInstance(Class cls) {
        MediationAdapterRouter mediationAdapterRouter;
        synchronized (sharedInstancesLock) {
            try {
                String name = cls.getName();
                mediationAdapterRouter = sharedInstances.get(name);
                if (mediationAdapterRouter == null) {
                    try {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        mediationAdapterRouter = (MediationAdapterRouter) declaredConstructor.newInstance(null);
                    } catch (Throwable unused) {
                    }
                    sharedInstances.put(name, mediationAdapterRouter);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediationAdapterRouter;
    }

    private List<MediationAdapterRouterListenerWrapper> getShowingListenerWrappers(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
                if (listenerWrappers == null || listenerWrappers.size() <= 0) {
                    return null;
                }
                for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
                    if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                        arrayList.add(mediationAdapterRouterListenerWrapper);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean isAdLoaded(MaxAdapter maxAdapter) {
        return this.loadedAdapters.contains(maxAdapter);
    }

    private boolean isAdShowing(MaxAdapter maxAdapter) {
        return this.showingAdapters.contains(maxAdapter);
    }

    public void addAdViewAdapter(MaxAdapter maxAdapter, MaxAdViewAdapterListener maxAdViewAdapterListener, String str, View view) throws Throwable {
        addAdapter(maxAdapter, maxAdViewAdapterListener, str, RouterAdLoadType.ADVIEW, view);
    }

    public void addAppOpenAdapter(MaxAdapter maxAdapter, MaxAppOpenAdapterListener maxAppOpenAdapterListener, String str) throws Throwable {
        addAdapter(maxAdapter, maxAppOpenAdapterListener, str, RouterAdLoadType.APPOPEN, null);
    }

    public void addInterstitialAdapter(MaxAdapter maxAdapter, MaxInterstitialAdapterListener maxInterstitialAdapterListener, String str) throws Throwable {
        addAdapter(maxAdapter, maxInterstitialAdapterListener, str, RouterAdLoadType.INTERSTITIAL, null);
    }

    public void addRewardedAdapter(MaxAdapter maxAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener, String str) throws Throwable {
        addAdapter(maxAdapter, maxRewardedAdapterListener, str, RouterAdLoadType.REWARDED, null);
    }

    public void addShowingAdapter(MaxAdapter maxAdapter) {
        this.showingAdapters.add(maxAdapter);
    }

    public MaxReward getReward(String str) {
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
                if (listenerWrappers != null && listenerWrappers.size() > 0) {
                    MaxAdapter adapter = listenerWrappers.get(0).getAdapter();
                    if (adapter instanceof MediationAdapterBase) {
                        return ((MediationAdapterBase) adapter).getReward();
                    }
                }
                return MaxRewardImpl.createDefault();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener);

    public void log(String str) {
        k kVar = k.D0;
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (o.a()) {
            k.D0.O().d(this.mTag, str);
        }
    }

    public void onAdClicked(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial clicked");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdClicked();
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open clicked");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdClicked();
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded clicked");
                ((MaxRewardedAdapterListener) listener).onRewardedAdClicked();
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView clicked");
                ((MaxAdViewAdapterListener) listener).onAdViewAdClicked();
            }
        }
    }

    public void onAdDisplayFailed(String str, MaxAdapterError maxAdapterError) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial failed to display with error: " + maxAdapterError.toString());
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open failed to display with error: " + maxAdapterError.toString());
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdDisplayFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded failed to display with error: " + maxAdapterError.toString());
                ((MaxRewardedAdapterListener) listener).onRewardedAdDisplayFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView failed to display with error: " + maxAdapterError.toString());
                ((MaxAdViewAdapterListener) listener).onAdViewAdDisplayFailed(maxAdapterError);
            }
        }
    }

    public void onAdDisplayed(String str) {
        onAdDisplayed(str, null);
    }

    public void onAdHidden(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial hidden");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdHidden();
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open hidden");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdHidden();
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded hidden");
                ((MaxRewardedAdapterListener) listener).onRewardedAdHidden();
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView hidden");
                ((MaxAdViewAdapterListener) listener).onAdViewAdHidden();
            }
        }
    }

    public void onAdLoadFailed(String str, MaxAdapterError maxAdapterError) {
        List<MediationAdapterRouterListenerWrapper> loadingListenerWrappers = getLoadingListenerWrappers(str);
        if (loadingListenerWrappers == null || loadingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : loadingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial failed to load with error: " + maxAdapterError.toString());
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdLoadFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open failed to load with error: " + maxAdapterError.toString());
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdLoadFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded failed to load with error: " + maxAdapterError.toString());
                ((MaxRewardedAdapterListener) listener).onRewardedAdLoadFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView failed to load with error: " + maxAdapterError.toString());
                ((MaxAdViewAdapterListener) listener).onAdViewAdLoadFailed(maxAdapterError);
            }
        }
    }

    public void onAdLoaded(String str) {
        onAdLoaded(str, null);
    }

    public void onAdViewAdCollapsed(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView collapsed");
                ((MaxAdViewAdapterListener) listener).onAdViewAdCollapsed();
            }
        }
    }

    public void onAdViewAdExpanded(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView expanded");
                ((MaxAdViewAdapterListener) listener).onAdViewAdExpanded();
            }
        }
    }

    public void onUserRewarded(String str, MaxReward maxReward) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded user with reward: " + maxReward);
                ((MaxRewardedAdapterListener) listener).onUserRewarded(maxReward);
            }
        }
    }

    public void removeAdapter(MaxAdapter maxAdapter, String str) {
        MediationAdapterRouterListenerWrapper next;
        this.loadedAdapters.remove(maxAdapter);
        this.showingAdapters.remove(maxAdapter);
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> list = this.listeners.get(str);
                if (list != null && list.size() > 0) {
                    Iterator<MediationAdapterRouterListenerWrapper> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (next.getAdapter() == maxAdapter) {
                            }
                        }
                    }
                    if (next != null) {
                        list.remove(next);
                    }
                }
            } finally {
            }
        }
    }

    public boolean shouldAlwaysRewardUser(String str) {
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
                if (listenerWrappers != null && listenerWrappers.size() > 0) {
                    MaxAdapter adapter = listenerWrappers.get(0).getAdapter();
                    if (adapter instanceof MediationAdapterBase) {
                        return ((MediationAdapterBase) adapter).shouldAlwaysRewardUser();
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void updateAdView(View view, String str) {
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
                if (listenerWrappers != null && listenerWrappers.size() > 0) {
                    Iterator<MediationAdapterRouterListenerWrapper> it = listenerWrappers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MediationAdapterRouterListenerWrapper next = it.next();
                        if (next.getAdView() == null) {
                            next.setAdView(view);
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onAdDisplayed(String str, Bundle bundle) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial shown");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayed(bundle);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open shown");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdDisplayed(bundle);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded shown");
                ((MaxRewardedAdapterListener) listener).onRewardedAdDisplayed(bundle);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView shown");
                ((MaxAdViewAdapterListener) listener).onAdViewAdDisplayed(bundle);
            }
        }
    }

    public void onAdLoaded(String str, Bundle bundle) {
        List<MediationAdapterRouterListenerWrapper> loadingListenerWrappers = getLoadingListenerWrappers(str);
        if (loadingListenerWrappers == null || loadingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : loadingListenerWrappers) {
            this.loadedAdapters.add(mediationAdapterRouterListenerWrapper.getAdapter());
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial loaded");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdLoaded(bundle);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open loaded");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdLoaded(bundle);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded loaded");
                ((MaxRewardedAdapterListener) listener).onRewardedAdLoaded(bundle);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView loaded");
                ((MaxAdViewAdapterListener) listener).onAdViewAdLoaded(mediationAdapterRouterListenerWrapper.getAdView(), bundle);
            }
        }
    }

    public void log(String str, Throwable th2) {
        k kVar = k.D0;
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (o.a()) {
            k.D0.O().a(this.mTag, str, th2);
        }
    }
}
