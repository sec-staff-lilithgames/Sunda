package com.unity3d.services.ads.offerwall;

import av.e;
import bv.f;
import bv.n;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OfferwallAdapterBridge {
    private final MutableSharedFlow<OfferwallEventData> _offerwallEventFlow;
    private final SharedFlow<OfferwallEventData> offerwallEventFlow;
    private final HashMap<String, Object> placementsMap;
    private final CoroutineScope scope;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$showAd$1", f = "OfferwallAdapterBridge.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$showAd$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$placementName = str;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return OfferwallAdapterBridge.this.new AnonymousClass1(this.$placementName, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = OfferwallAdapterBridge.this._offerwallEventFlow;
                OfferwallEventData offerwallEventData = new OfferwallEventData(OfferwallEvent.SHOW_FAILED, this.$placementName, null, null, 12, null);
                this.label = 1;
                if (mutableSharedFlow.emit(offerwallEventData, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public OfferwallAdapterBridge(CoroutineScope scope) {
        e0.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        MutableSharedFlow<OfferwallEventData> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._offerwallEventFlow = mutableSharedFlowMutableSharedFlow$default;
        this.offerwallEventFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.placementsMap = new HashMap<>();
    }

    private final Object getPlacement(String str) {
        return Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getPlacement", String.class, Class.forName("com.tapjoy.TJPlacementListener")).invoke(null, str, Proxy.newProxyInstance(Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new Class[]{Class.forName("com.tapjoy.TJPlacementListener")}, tapjoyPlacementListener()));
    }

    private final String getPlacementName(Object obj) {
        return (String) obj.getClass().getDeclaredMethod("getName", null).invoke(obj, null);
    }

    private final InvocationHandler tapjoyPlacementListener() {
        return new a(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Object tapjoyPlacementListener$lambda$0(OfferwallAdapterBridge this$0, Object obj, Method method, Object[] objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(this$0, "this$0");
        String name = method.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1508301783:
                    if (name.equals("onContentReady")) {
                        Object obj2 = objArr[0];
                        e0.checkNotNullExpressionValue(obj2, "args[0]");
                        String placementName = this$0.getPlacementName(obj2);
                        DeviceLog.debug("Placement content ready: " + placementName);
                        BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(this$0, placementName, null), 3, null);
                        break;
                    }
                    break;
                case -1482787952:
                    if (name.equals("onContentDismiss")) {
                        Object obj3 = objArr[0];
                        e0.checkNotNullExpressionValue(obj3, "args[0]");
                        String placementName2 = this$0.getPlacementName(obj3);
                        DeviceLog.debug("Placement content dismissed: " + placementName2);
                        BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(this$0, placementName2, null), 3, null);
                        break;
                    }
                    break;
                case 89925559:
                    if (name.equals("onContentShow")) {
                        Object obj4 = objArr[0];
                        e0.checkNotNullExpressionValue(obj4, "args[0]");
                        String placementName3 = this$0.getPlacementName(obj4);
                        DeviceLog.debug("Placement content shown: " + placementName3);
                        BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(this$0, placementName3, null), 3, null);
                        break;
                    }
                    break;
                case 1356881459:
                    if (name.equals("onRequestSuccess")) {
                        Object placementObj = objArr[0];
                        e0.checkNotNullExpressionValue(placementObj, "placementObj");
                        String placementName4 = this$0.getPlacementName(placementObj);
                        Boolean bool = (Boolean) placementObj.getClass().getDeclaredMethod("isContentAvailable", null).invoke(placementObj, null);
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        DeviceLog.debug("Placement request succeeded: " + placementName4 + " - isContentAvailable: " + zBooleanValue);
                        BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(zBooleanValue, this$0, placementName4, null), 3, null);
                        break;
                    }
                    break;
                case 2137477050:
                    if (name.equals("onRequestFailure")) {
                        Object obj5 = objArr[0];
                        e0.checkNotNullExpressionValue(obj5, "args[0]");
                        String placementName5 = this$0.getPlacementName(obj5);
                        this$0.placementsMap.remove(placementName5 == null ? "" : placementName5);
                        Object obj6 = objArr[1];
                        DeviceLog.error("Placement request failed: " + placementName5 + " - errorCode: " + ((Integer) obj6.getClass().getField("code").get(obj6)) + ", errorMessage: " + ((String) obj6.getClass().getField(PglCryptUtils.KEY_MESSAGE).get(obj6)));
                        BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$2(this$0, placementName5, null), 3, null);
                        break;
                    }
                    break;
            }
        }
        return null;
    }

    public final SharedFlow<OfferwallEventData> getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    public final String getVersion() {
        try {
            String str = (String) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getVersion", null).invoke(null, null);
            return str == null ? "0.0.0" : str;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }

    public final boolean isAdReady(String placementName) {
        e0.checkNotNullParameter(placementName, "placementName");
        Object placement = getPlacement(placementName);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("isContentReady", null) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(placement, null) : null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isConnected() {
        try {
            Boolean bool = (Boolean) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("isConnected", null).invoke(null, null);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void loadAd(String placementName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(placementName, "placementName");
        Object placement = getPlacement(placementName);
        this.placementsMap.put(placementName, placement);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("requestContent", null) : null;
        if (declaredMethod != null) {
            declaredMethod.invoke(placement, null);
        }
    }

    public final void showAd(String placementName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(placementName, "placementName");
        Object obj = this.placementsMap.get(placementName);
        Method declaredMethod = obj != null ? obj.getClass().getDeclaredMethod("isContentAvailable", null) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(obj, null) : null);
        if (bool != null ? bool.booleanValue() : false) {
            Method declaredMethod2 = obj != null ? obj.getClass().getDeclaredMethod("showContent", null) : null;
            if (declaredMethod2 != null) {
                declaredMethod2.invoke(obj, null);
            }
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(placementName, null), 3, null);
        }
        this.placementsMap.remove(placementName);
    }
}
