package com.unity3d.services.ads.adunit;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class AdUnitActivityController {
    private int _activityId;
    private final IAdUnitActivity _adUnitActivity;
    private final IAdUnitViewHandlerFactory _adUnitViewHandlerFactory;
    private int _displayCutoutMode;
    private final IEventSender _eventSender;
    boolean _keepScreenOn;
    private ArrayList<Integer> _keyEventList;
    protected AdUnitRelativeLayout _layout;
    private int _orientation = -1;
    private int _systemUiVisibility;
    private Map<String, IAdUnitViewHandler> _viewHandlers;
    private String[] _views;

    public AdUnitActivityController(IAdUnitActivity iAdUnitActivity, IEventSender iEventSender, IAdUnitViewHandlerFactory iAdUnitViewHandlerFactory) {
        this._adUnitActivity = iAdUnitActivity;
        this._eventSender = iEventSender;
        this._adUnitViewHandlerFactory = iAdUnitViewHandlerFactory;
    }

    private IAdUnitViewHandler createViewHandler(String str) {
        return this._adUnitViewHandlerFactory.createViewHandler(str);
    }

    private boolean handleViewPlacement(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (view == null) {
            this._adUnitActivity.finish();
            DeviceLog.error("Could not place view because it is null, finishing activity");
            return false;
        }
        if (view.getParent() != null && view.getParent().equals(this._layout)) {
            this._layout.bringChildToFront(view);
            return true;
        }
        ViewUtilities.removeViewFromParent(view);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.setMargins(0, 0, 0, 0);
        view.setPadding(0, 0, 0, 0);
        this._layout.addView(view, layoutParams);
        return true;
    }

    public void createLayout() {
        if (this._layout != null) {
            return;
        }
        AdUnitRelativeLayout adUnitRelativeLayout = new AdUnitRelativeLayout(this._adUnitActivity.getContext());
        this._layout = adUnitRelativeLayout;
        adUnitRelativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        ViewUtilities.setBackground(this._layout, new ColorDrawable(-16777216));
    }

    public AdUnitRelativeLayout getLayout() {
        return this._layout;
    }

    public Map<String, Integer> getViewFrame(String str) {
        IAdUnitViewHandler viewHandler = getViewHandler(str);
        if (str.equals("adunit")) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this._layout.getLayoutParams();
            HashMap map = new HashMap();
            map.put("x", Integer.valueOf(layoutParams.leftMargin));
            map.put("y", Integer.valueOf(layoutParams.topMargin));
            map.put("width", Integer.valueOf(this._layout.getWidth()));
            map.put("height", Integer.valueOf(this._layout.getHeight()));
            return map;
        }
        View view = viewHandler != null ? viewHandler.getView() : null;
        if (view == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        HashMap map2 = new HashMap();
        map2.put("x", Integer.valueOf(layoutParams2.leftMargin));
        map2.put("y", Integer.valueOf(layoutParams2.topMargin));
        map2.put("width", Integer.valueOf(view.getWidth()));
        map2.put("height", Integer.valueOf(view.getHeight()));
        return map2;
    }

    public IAdUnitViewHandler getViewHandler(String str) {
        Map<String, IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null && map.containsKey(str)) {
            return this._viewHandlers.get(str);
        }
        IAdUnitViewHandler iAdUnitViewHandlerCreateViewHandler = createViewHandler(str);
        if (iAdUnitViewHandlerCreateViewHandler != null) {
            if (this._viewHandlers == null) {
                this._viewHandlers = new HashMap();
            }
            this._viewHandlers.put(str, iAdUnitViewHandlerCreateViewHandler);
        }
        return iAdUnitViewHandlerCreateViewHandler;
    }

    public String[] getViews() {
        return this._views;
    }

    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AdUnitEvent adUnitEvent;
        if (!this._eventSender.canSend()) {
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onCreate");
            this._adUnitActivity.finish();
            return;
        }
        AdUnit.setAdUnitActivity(this._adUnitActivity);
        Intent.setActiveActivity(this._adUnitActivity.getActivity());
        createLayout();
        ViewUtilities.removeViewFromParent(this._layout);
        IAdUnitActivity iAdUnitActivity = this._adUnitActivity;
        AdUnitRelativeLayout adUnitRelativeLayout = this._layout;
        iAdUnitActivity.addContentView(adUnitRelativeLayout, adUnitRelativeLayout.getLayoutParams());
        if (bundle == null) {
            this._views = this._adUnitActivity.getIntent().getStringArrayExtra(AdUnitActivity.EXTRA_VIEWS);
            this._keyEventList = this._adUnitActivity.getIntent().getIntegerArrayListExtra(AdUnitActivity.EXTRA_KEY_EVENT_LIST);
            if (this._adUnitActivity.getIntent().hasExtra("orientation")) {
                this._orientation = this._adUnitActivity.getIntent().getIntExtra("orientation", -1);
            }
            if (this._adUnitActivity.getIntent().hasExtra(AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY)) {
                this._systemUiVisibility = this._adUnitActivity.getIntent().getIntExtra(AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, 0);
            }
            if (this._adUnitActivity.getIntent().hasExtra(AdUnitActivity.EXTRA_ACTIVITY_ID)) {
                this._activityId = this._adUnitActivity.getIntent().getIntExtra(AdUnitActivity.EXTRA_ACTIVITY_ID, -1);
            }
            if (this._adUnitActivity.getIntent().hasExtra(AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE)) {
                this._displayCutoutMode = this._adUnitActivity.getIntent().getIntExtra(AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE, 0);
            }
            adUnitEvent = AdUnitEvent.ON_CREATE;
        } else {
            this._views = bundle.getStringArray(AdUnitActivity.EXTRA_VIEWS);
            this._orientation = bundle.getInt("orientation", -1);
            this._systemUiVisibility = bundle.getInt(AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, 0);
            this._keyEventList = bundle.getIntegerArrayList(AdUnitActivity.EXTRA_KEY_EVENT_LIST);
            this._keepScreenOn = bundle.getBoolean(AdUnitActivity.EXTRA_KEEP_SCREEN_ON);
            this._activityId = bundle.getInt(AdUnitActivity.EXTRA_ACTIVITY_ID, -1);
            this._displayCutoutMode = bundle.getInt(AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE, 0);
            setKeepScreenOn(this._keepScreenOn);
            adUnitEvent = AdUnitEvent.ON_RESTORE;
        }
        setOrientation(this._orientation);
        setSystemUiVisibility(this._systemUiVisibility);
        setLayoutInDisplayCutoutMode(this._displayCutoutMode);
        String[] strArr = this._views;
        if (strArr != null) {
            for (String str : strArr) {
                IAdUnitViewHandler viewHandler = getViewHandler(str);
                if (viewHandler != null) {
                    viewHandler.onCreate(this._adUnitActivity, bundle);
                }
            }
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, adUnitEvent, Integer.valueOf(this._activityId));
    }

    public void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this._eventSender.canSend()) {
            if (this._adUnitActivity.isFinishing()) {
                return;
            }
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onDestroy");
            this._adUnitActivity.finish();
            return;
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_DESTROY, Boolean.valueOf(this._adUnitActivity.isFinishing()), Integer.valueOf(this._activityId));
        Map<String, IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null) {
            for (Map.Entry<String, IAdUnitViewHandler> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().onDestroy(this._adUnitActivity);
                }
            }
        }
        if (AdUnit.getCurrentAdUnitActivityId() == this._activityId) {
            AdUnit.setAdUnitActivity(null);
        }
        Intent.removeActiveActivity(this._adUnitActivity.getActivity());
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ArrayList<Integer> arrayList = this._keyEventList;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(i10))) {
            return false;
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.KEY_DOWN, Integer.valueOf(i10), Long.valueOf(keyEvent.getEventTime()), Long.valueOf(keyEvent.getDownTime()), Integer.valueOf(keyEvent.getRepeatCount()), Integer.valueOf(this._activityId));
        return true;
    }

    public void onPause() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this._eventSender.canSend()) {
            if (this._adUnitActivity.isFinishing()) {
                return;
            }
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onPause");
            this._adUnitActivity.finish();
            return;
        }
        if (WebViewApp.getCurrentApp().getWebView() == null) {
            DeviceLog.warning("Unity Ads web view is null, from onPause");
        } else if (this._adUnitActivity.isFinishing()) {
            ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
        }
        Map<String, IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null) {
            for (Map.Entry<String, IAdUnitViewHandler> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().onPause(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_PAUSE, Boolean.valueOf(this._adUnitActivity.isFinishing()), Integer.valueOf(this._activityId));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            for (int i11 : iArr) {
                jSONArray2.put(i11);
            }
            this._eventSender.sendEvent(WebViewEventCategory.PERMISSIONS, PermissionsEvent.PERMISSIONS_RESULT, Integer.valueOf(i10), jSONArray, jSONArray2);
        } catch (Exception e10) {
            this._eventSender.sendEvent(WebViewEventCategory.PERMISSIONS, PermissionsEvent.PERMISSIONS_ERROR, e10.getMessage());
        }
    }

    public void onResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this._eventSender.canSend()) {
            if (this._adUnitActivity.isFinishing()) {
                return;
            }
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onResume");
            this._adUnitActivity.finish();
            return;
        }
        setViews(this._views);
        Map<String, IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null) {
            for (Map.Entry<String, IAdUnitViewHandler> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().onResume(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_RESUME, Integer.valueOf(this._activityId));
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("orientation", this._orientation);
        bundle.putInt(AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, this._systemUiVisibility);
        bundle.putIntegerArrayList(AdUnitActivity.EXTRA_KEY_EVENT_LIST, this._keyEventList);
        bundle.putBoolean(AdUnitActivity.EXTRA_KEEP_SCREEN_ON, this._keepScreenOn);
        bundle.putStringArray(AdUnitActivity.EXTRA_VIEWS, this._views);
        bundle.putInt(AdUnitActivity.EXTRA_ACTIVITY_ID, this._activityId);
    }

    public void onStart() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this._eventSender.canSend()) {
            if (this._adUnitActivity.isFinishing()) {
                return;
            }
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onStart");
            this._adUnitActivity.finish();
            return;
        }
        Map<String, IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null) {
            for (Map.Entry<String, IAdUnitViewHandler> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().onStart(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_START, Integer.valueOf(this._activityId));
    }

    public void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this._eventSender.canSend()) {
            if (this._adUnitActivity.isFinishing()) {
                return;
            }
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onStop");
            this._adUnitActivity.finish();
            return;
        }
        Map<String, IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null) {
            for (Map.Entry<String, IAdUnitViewHandler> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().onStop(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_STOP, Integer.valueOf(this._activityId));
    }

    public void onWindowFocusChanged(boolean z10) {
        if (z10) {
            this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_FOCUS_GAINED, Integer.valueOf(this._activityId));
        } else {
            this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_FOCUS_LOST, Integer.valueOf(this._activityId));
        }
    }

    public boolean setKeepScreenOn(boolean z10) {
        this._keepScreenOn = z10;
        if (this._adUnitActivity.getWindow() == null) {
            return false;
        }
        if (z10) {
            this._adUnitActivity.getWindow().addFlags(128);
            return true;
        }
        this._adUnitActivity.getWindow().clearFlags(128);
        return true;
    }

    public void setKeyEventList(ArrayList<Integer> arrayList) {
        this._keyEventList = arrayList;
    }

    public void setLayoutInDisplayCutoutMode(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this._displayCutoutMode = i10;
        if (Build.VERSION.SDK_INT < 28 || this._adUnitActivity.getWindow() == null) {
            return;
        }
        WindowManager.LayoutParams attributes = this._adUnitActivity.getWindow().getAttributes();
        try {
            attributes.getClass().getField("layoutInDisplayCutoutMode").setInt(attributes, i10);
        } catch (IllegalAccessException e10) {
            DeviceLog.debug("Error setting layoutInDisplayCutoutMode", e10);
        } catch (NoSuchFieldException e11) {
            DeviceLog.debug("Error getting layoutInDisplayCutoutMode", e11);
        }
    }

    public void setOrientation(int i10) {
        this._orientation = i10;
        this._adUnitActivity.setRequestedOrientation(i10);
    }

    public boolean setSystemUiVisibility(int i10) {
        this._systemUiVisibility = i10;
        try {
            this._adUnitActivity.getWindow().getDecorView().setSystemUiVisibility(i10);
            return true;
        } catch (Exception e10) {
            DeviceLog.exception("Error while setting SystemUIVisibility", e10);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setViewFrame(java.lang.String r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            com.unity3d.services.ads.adunit.IAdUnitViewHandler r0 = r2.getViewHandler(r3)
            java.lang.String r1 = "adunit"
            boolean r3 = r3.equals(r1)
            r1 = 0
            if (r3 == 0) goto L1b
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r6, r7)
            r3.setMargins(r4, r5, r1, r1)
            com.unity3d.services.ads.adunit.AdUnitRelativeLayout r0 = r2._layout
            r0.setLayoutParams(r3)
            goto L22
        L1b:
            if (r0 == 0) goto L22
            android.view.View r3 = r0.getView()
            goto L23
        L22:
            r3 = 0
        L23:
            if (r3 == 0) goto L30
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r6, r7)
            r0.setMargins(r4, r5, r1, r1)
            r3.setLayoutParams(r0)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.adunit.AdUnitActivityController.setViewFrame(java.lang.String, int, int, int, int):void");
    }

    public void setViews(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (this._views == null) {
            this._views = new String[0];
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(this._views));
        arrayList2.removeAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            getViewHandler((String) it.next()).destroy();
        }
        this._views = strArr;
        for (String str : strArr) {
            if (str != null) {
                IAdUnitViewHandler viewHandler = getViewHandler(str);
                viewHandler.create(this._adUnitActivity);
                if (!handleViewPlacement(viewHandler.getView())) {
                    return;
                }
            }
        }
    }
}
