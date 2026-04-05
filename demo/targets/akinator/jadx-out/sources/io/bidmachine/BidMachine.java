package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.ironsource.C3191e4;
import com.ironsource.lh;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.protobuf.sdk.Placement;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.Session;
import io.bidmachine.protobuf.sdk.User;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class BidMachine {
    public static final String NAME = "BidMachine";
    private static final String TAG = "BidMachine";
    public static final String VERSION = "3.4.0";

    @Deprecated
    public static String getBidToken(Context context, AdsFormat adsFormat) {
        return getBidToken(context, new AdPlacementConfig.Builder(adsFormat).build());
    }

    public static Object getExtrasParam(Context context, String str) {
        return ExtraParamsManager.get().getPublic(context, str);
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    public static boolean isInitialized() {
        return n1.a().f61920c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getBidToken$8(String str) {
        return a.b.k("getBidToken - ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getBidToken$9(BidTokenCallback bidTokenCallback, Context context, AdPlacementConfig adPlacementConfig) {
        bidTokenCallback.onCollected(getBidToken(context, adPlacementConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$initialize$0(String str) {
        return a.b.k("initialize - ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setConsentConfig$3(boolean z10, String str) {
        return "setConsentConfig - " + z10 + ", " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setCoppa$5(Boolean bool) {
        return "setCoppa - " + bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setEndpoint$1(String str) {
        return a.b.k("setEndpoint - ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setGPP$7(String str, List list) {
        return e3.g.l("setGPP - ", str, ", [", nm.j.join(list), C3191e4.i.f36531e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setSubjectToGDPR$4(Boolean bool) {
        return "setSubjectToGDPR - " + bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setTestMode$2(boolean z10) {
        return j1.o2.n("setTestMode - ", z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setUSPrivacyString$6(String str) {
        return a.b.k("setUSPrivacyString - ", str);
    }

    public static void registerAdRequestListener(AdRequest.AdRequestListener<?> adRequestListener) {
        nm.a.d("BidMachine", "registerAdRequestListener");
        n1 n1VarA = n1.a();
        if (adRequestListener == null) {
            return;
        }
        n1VarA.f61930m.add(adRequestListener);
    }

    public static void registerNetworks(NetworkConfig... networkConfigArr) {
        nm.a.d("BidMachine", "registerNetworks with NetworkConfig array");
        NetworkRegistry.registerNetworks(networkConfigArr);
    }

    public static void setConsentConfig(boolean z10, String str) {
        nm.a.d("BidMachine", new com.google.firebase.messaging.c0(z10, str));
        n1.a().f61923f.setConsentConfig(z10, str);
    }

    public static void setCoppa(Boolean bool) {
        nm.a.d("BidMachine", new l0(0, bool));
        n1.a().f61923f.setCoppa(bool);
    }

    public static void setEndpoint(String str) {
        nm.a.d("BidMachine", new m0(str, 1));
        UrlProvider.setEndpoint(str);
    }

    public static void setGPP(String str, List<Integer> list) {
        nm.a.d("BidMachine", new ao.n(20, str, list));
        n1.a().f61923f.setGPP(str, list);
    }

    public static void setLoggingEnabled(boolean z10) {
        if (Debugger.isLoggingLock()) {
            nm.a.d("BidMachine", "setLoggingEnabled skipped");
            return;
        }
        if (z10) {
            nm.a.setLoggingEnabled(true);
            nm.a.d("BidMachine", "setLoggingEnabled - true");
        } else {
            nm.a.d("BidMachine", "setLoggingEnabled - false");
            nm.a.setLoggingEnabled(false);
        }
        NetworkRegistry.setLoggingEnabled(z10);
    }

    public static void setPublisher(Publisher publisher) {
        nm.a.d("BidMachine", "setPublisher");
        n1.a().f61936s = publisher;
    }

    public static void setSubjectToGDPR(Boolean bool) {
        nm.a.d("BidMachine", new l0(1, bool));
        n1.a().f61923f.setSubjectToGDPR(bool);
    }

    public static void setTestMode(boolean z10) {
        if (Debugger.isTestModeLock()) {
            nm.a.d("BidMachine", "setTestMode skipped");
        } else {
            nm.a.d("BidMachine", new com.google.android.exoplayer2.g0(z10, 3));
            n1.a().f61937t = z10;
        }
    }

    public static void setUSPrivacyString(String str) {
        nm.a.d("BidMachine", new m0(str, 2));
        n1.a().f61923f.setUSPrivacyString(str);
    }

    public static void unregisterAdRequestListener(AdRequest.AdRequestListener<?> adRequestListener) {
        nm.a.d("BidMachine", "unregisterAdRequestListener");
        n1 n1VarA = n1.a();
        if (adRequestListener == null) {
            return;
        }
        n1VarA.f61930m.remove(adRequestListener);
    }

    public static String getBidToken(Context context, AdPlacementConfig adPlacementConfig) {
        RequestTokenPayload requestTokenPayloadBuild;
        User.Builder builderNewBuilder;
        Device.Builder builderNewBuilder2;
        Context applicationContext = context.getApplicationContext();
        BidMachineTrackingObject bidMachineTrackingObject = u1.f62026a;
        AdsFormat adsFormat = adPlacementConfig.getAdsFormat();
        int i10 = 2;
        final int i11 = 0;
        try {
            AdsFormat adsFormat2 = adPlacementConfig.getAdsFormat();
            n1 n1VarA = n1.a();
            RequestTokenPayload.Builder builderNewBuilder3 = RequestTokenPayload.newBuilder();
            final Placement.Builder placementBuilder = builderNewBuilder3.getPlacementBuilder();
            placementBuilder.setAdType(adsFormat2.getAdsType().getName());
            nm.j.ifNotNull(adPlacementConfig.getPlacementId(), new Executable() { // from class: io.bidmachine.q1
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i11) {
                        case 0:
                            placementBuilder.setPlacementId(StringValue.of((String) obj));
                            break;
                        default:
                            Struct.Builder builderNewBuilder4 = Struct.newBuilder();
                            ((CustomParams) obj).fillStructBuilder(builderNewBuilder4);
                            if (builderNewBuilder4.getFieldsCount() > 0) {
                                placementBuilder.setCustomData(builderNewBuilder4);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            nm.j.ifNotNull(adPlacementConfig.getCustomParams(), new Executable() { // from class: io.bidmachine.q1
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i12) {
                        case 0:
                            placementBuilder.setPlacementId(StringValue.of((String) obj));
                            break;
                        default:
                            Struct.Builder builderNewBuilder4 = Struct.newBuilder();
                            ((CustomParams) obj).fillStructBuilder(builderNewBuilder4);
                            if (builderNewBuilder4.getFieldsCount() > 0) {
                                placementBuilder.setCustomData(builderNewBuilder4);
                                break;
                            }
                            break;
                    }
                }
            });
            App.Builder builderNewBuilder4 = App.newBuilder();
            n1VarA.f61925h.a(applicationContext, builderNewBuilder4);
            builderNewBuilder3.setAppData(builderNewBuilder4);
            try {
                f4 f4Var = n1VarA.f61923f;
                builderNewBuilder = User.newBuilder();
                f4Var.a(builderNewBuilder);
            } catch (Throwable unused) {
                builderNewBuilder = null;
            }
            if (builderNewBuilder != null) {
                builderNewBuilder3.setUserData(builderNewBuilder);
            }
            SDK.Builder sdkver = SDK.newBuilder().setSdk("BidMachine").setSdkver("3.4.0");
            fn.t.fill(sdkver);
            builderNewBuilder3.setPlacementData(sdkver);
            e2 e2Var = n1VarA.f61926i;
            f4 f4Var2 = n1VarA.f61923f;
            e2Var.getClass();
            try {
                builderNewBuilder2 = Device.newBuilder();
                e2Var.a(applicationContext, builderNewBuilder2, f4Var2);
            } catch (Throwable unused2) {
                builderNewBuilder2 = null;
            }
            nm.j.ifNotNull(builderNewBuilder2, new u0(builderNewBuilder3, i10));
            n1VarA.getSessionParams().getClass();
            Session.Builder builderB = a4.b(applicationContext, adsFormat2.getAdsType());
            if (builderB != null) {
                builderNewBuilder3.setSession(builderB);
            }
            u1.c(applicationContext, builderNewBuilder3, adsFormat2);
            Struct.Builder builderNewBuilder5 = Struct.newBuilder();
            Struct privateStruct = ExtraParamsManager.get().getPrivateStruct(applicationContext);
            if (privateStruct != null) {
                builderNewBuilder5.putAllFields(privateStruct.getFieldsMap());
            }
            if (builderNewBuilder5.getFieldsCount() > 0) {
                builderNewBuilder3.setExt(builderNewBuilder5.build());
            }
            requestTokenPayloadBuild = builderNewBuilder3.build();
        } catch (Throwable th2) {
            nm.a.w(th2);
            requestTokenPayloadBuild = null;
        }
        String str = "";
        if (requestTokenPayloadBuild == null) {
            u1.e(adsFormat, pr.a.internal("Failed to create RequestTokenPayload"));
        } else {
            try {
                String strEncodeToString = Base64.encodeToString(requestTokenPayloadBuild.toByteArray(), 2);
                u1.e(adsFormat, null);
                str = strEncodeToString;
            } catch (Exception e10) {
                u1.e(adsFormat, pr.a.throwable("Failed to encode RequestTokenPayload", e10));
                u1.d(requestTokenPayloadBuild.getTokenHashValue());
            }
        }
        nm.a.d("BidMachine", new m0(str, i11));
        return str;
    }

    public static void initialize(Context context, String str, InitializationCallback initializationCallback) {
        nm.a.d("BidMachine", new m0(str, 3));
        n1 n1VarA = n1.a();
        if (n1.A.compareAndSet(false, true)) {
            nm.j.runCatching(new j1(context, 0));
            nm.j.runCatching(new j1(context, 1));
        }
        if (n1VarA.f61920c.get()) {
            if (initializationCallback == null) {
                return;
            }
            nm.j.onUiThread(new t0(initializationCallback, 3));
            return;
        }
        if (context == null) {
            nm.a.d("Initialization fail: Context is not provided");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            nm.a.d("Initialization fail: Source id is not provided");
            return;
        }
        if (initializationCallback != null) {
            n1VarA.f61918a.add(initializationCallback);
        }
        if (n1VarA.f61919b.compareAndSet(false, true)) {
            Context applicationContext = context.getApplicationContext();
            SessionManager sessionManager = SessionManager.get();
            sessionManager.attachContext(applicationContext);
            n1VarA.f61933p = applicationContext;
            n1VarA.f61934q = str;
            sessionManager.resume();
            pr.c.register(applicationContext);
            UserAgentManager.initialize(context);
            zp.a.setUserAgentProvider(new m1(applicationContext));
            n1VarA.f61942y = new y2(applicationContext, str, n1VarA.f61943z);
            nm.j.onBackgroundThread(new im.k(5, n1VarA, applicationContext));
        }
    }

    public static void setTargetingParams(TargetingParams targetingParams) {
        nm.a.d(PtLatqAYjEFT.GSzgHMCO, "setTargetingParams");
        n1 n1VarA = n1.a();
        if (targetingParams == null) {
            targetingParams = new TargetingParams();
        }
        n1VarA.f61935r = targetingParams;
    }

    public static void registerNetworks(Context context, String str) {
        nm.a.d("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str);
    }

    public static void registerNetworks(Context context, String str, NetworkRegistryCallback networkRegistryCallback) {
        nm.a.d("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str, networkRegistryCallback);
    }

    @Deprecated
    public static void getBidToken(Context context, AdsFormat adsFormat, BidTokenCallback bidTokenCallback) {
        getBidToken(context, new AdPlacementConfig.Builder(adsFormat).build(), bidTokenCallback);
    }

    public static void getBidToken(Context context, AdPlacementConfig adPlacementConfig, BidTokenCallback bidTokenCallback) {
        BidTokenTaskManager.execute(new lh(bidTokenCallback, 29, context.getApplicationContext(), adPlacementConfig));
    }
}
