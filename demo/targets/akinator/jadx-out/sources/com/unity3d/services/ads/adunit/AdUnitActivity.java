package com.unity3d.services.ads.adunit;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class AdUnitActivity extends Activity implements IAdUnitActivity {
    public static final String EXTRA_ACTIVITY_ID = "activityId";
    public static final String EXTRA_DISPLAY_CUTOUT_MODE = "displayCutoutMode";
    public static final String EXTRA_KEEP_SCREEN_ON = "keepScreenOn";
    public static final String EXTRA_KEY_EVENT_LIST = "keyEvents";
    public static final String EXTRA_ORIENTATION = "orientation";
    public static final String EXTRA_SYSTEM_UI_VISIBILITY = "systemUiVisibility";
    public static final String EXTRA_VIEWS = "views";
    protected AdUnitActivityController _controller;

    public AdUnitActivityController createController() {
        return new AdUnitActivityController(this, SharedInstances.INSTANCE.getWebViewEventSender(), new AdUnitViewHandlerFactory());
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public AdUnitRelativeLayout getLayout() {
        return this._controller.getLayout();
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public Map<String, Integer> getViewFrame(String str) {
        return this._controller.getViewFrame(str);
    }

    public IAdUnitViewHandler getViewHandler(String str) {
        return this._controller.getViewHandler(str);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public String[] getViews() {
        return this._controller.getViews();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        AdUnitActivityController adUnitActivityControllerCreateController = createController();
        this._controller = adUnitActivityControllerCreateController;
        adUnitActivityControllerCreateController.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AdUnitActivityController adUnitActivityController = this._controller;
        if (adUnitActivityController != null) {
            adUnitActivityController.onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this._controller.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPause();
        this._controller.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this._controller.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onResume();
        this._controller.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this._controller.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStart();
        this._controller.onStart();
    }

    @Override // android.app.Activity
    public void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        this._controller.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        this._controller.onWindowFocusChanged(z10);
        super.onWindowFocusChanged(z10);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public boolean setKeepScreenOn(boolean z10) {
        return this._controller.setKeepScreenOn(z10);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setKeyEventList(ArrayList<Integer> arrayList) {
        this._controller.setKeyEventList(arrayList);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setLayoutInDisplayCutoutMode(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this._controller.setLayoutInDisplayCutoutMode(i10);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setOrientation(int i10) {
        this._controller.setOrientation(i10);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public boolean setSystemUiVisibility(int i10) {
        return this._controller.setSystemUiVisibility(i10);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setViewFrame(String str, int i10, int i11, int i12, int i13) {
        this._controller.setViewFrame(str, i10, i11, i12, i13);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setViews(String[] strArr) {
        this._controller.setViews(strArr);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public Activity getActivity() {
        return this;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public Context getContext() {
        return this;
    }
}
