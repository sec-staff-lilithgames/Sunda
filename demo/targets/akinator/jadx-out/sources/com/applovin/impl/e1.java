package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.ironsource.C3191e4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13927a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.browser.customtabs.v f13928b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends androidx.browser.customtabs.d0 {
        public a() {
        }

        @Override // androidx.browser.customtabs.d0
        public void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.v vVar) {
            e1.this.f13927a.O();
            if (com.applovin.impl.sdk.o.a()) {
                e1.this.f13927a.O().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            e1.this.f13928b = vVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            e1.this.f13927a.O();
            if (com.applovin.impl.sdk.o.a()) {
                e1.this.f13927a.O().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            e1.this.f13928b = null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends androidx.browser.customtabs.e {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f13930a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f13930a = new WeakReference(aVar);
        }

        @Override // androidx.browser.customtabs.e
        public void onNavigationEvent(int i10, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f13930a.get();
            if (aVar == null) {
                e1.this.f13927a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    e1.this.f13927a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarG = aVar.g();
            if (bVarG == null) {
                e1.this.f13927a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    e1.this.f13927a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (bVarG.Y0()) {
                        e1.this.f13927a.k().trackCustomTabsNavigationStarted(bVarG);
                        break;
                    }
                    break;
                case 2:
                    if (bVarG.Y0()) {
                        e1.this.f13927a.k().trackCustomTabsNavigationFinished(bVarG);
                        break;
                    }
                    break;
                case 3:
                    if (bVarG.Y0()) {
                        e1.this.f13927a.k().trackCustomTabsNavigationFailed(bVarG);
                        break;
                    }
                    break;
                case 4:
                    if (bVarG.Y0()) {
                        e1.this.f13927a.k().trackCustomTabsNavigationAborted(bVarG);
                        break;
                    }
                    break;
                case 5:
                    if (bVarG.Y0()) {
                        e1.this.f13927a.k().trackCustomTabsTabShown(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    q2.c(aVar.e(), bVarG, aVar.i());
                    break;
                case 6:
                    if (bVarG.Y0()) {
                        e1.this.f13927a.k().trackCustomTabsTabHidden(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    q2.a(aVar.e(), bVarG, aVar.i());
                    break;
                default:
                    e1.this.f13927a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        e1.this.f13927a.O().a("CustomTabsManager", "Unknown navigation event: " + i10);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.e
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            e1.this.f13927a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = e1.this.f13927a.O();
                StringBuilder sb2 = new StringBuilder("Validation ");
                sb2.append(z10 ? "succeeded" : C3191e4.h.f36509t);
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                oVarO.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public e1(com.applovin.impl.sdk.k kVar) {
        this.f13927a = kVar;
    }

    public void b(List list, androidx.browser.customtabs.k0 k0Var) {
        if (list.isEmpty()) {
            return;
        }
        if (k0Var != null) {
            a("warmup urls", new androidx.browser.customtabs.g(this, 11, list, k0Var));
            return;
        }
        this.f13927a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f13927a.O().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public void a() {
        if (((Boolean) this.f13927a.a(v4.Q6)).booleanValue() && this.f13928b == null) {
            String packageName = androidx.browser.customtabs.v.getPackageName(com.applovin.impl.sdk.k.o(), this.f13927a.c(v4.R6), true);
            String packageName2 = androidx.browser.customtabs.v.getPackageName(com.applovin.impl.sdk.k.o(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f13927a.a(v4.S6)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f13927a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13927a.O().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    private void a(LinkedList linkedList) {
        boolean zIsEmpty;
        boolean zBindCustomTabsService = false;
        try {
            zBindCustomTabsService = androidx.browser.customtabs.v.bindCustomTabsService(com.applovin.impl.sdk.k.o(), (String) linkedList.poll(), new a());
            if (!zBindCustomTabsService) {
                this.f13927a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13927a.O().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
        } catch (Throwable th2) {
            try {
                this.f13927a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13927a.O().a("CustomTabsManager", "Failed to bind to service", th2);
                }
                if (zBindCustomTabsService) {
                    return;
                } else {
                    if (zIsEmpty) {
                        return;
                    }
                }
            } finally {
                if (!zBindCustomTabsService && !linkedList.isEmpty()) {
                    this.f13927a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f13927a.O().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
        if (zBindCustomTabsService || linkedList.isEmpty()) {
            return;
        }
        this.f13927a.O();
        if (com.applovin.impl.sdk.o.a()) {
        }
    }

    public androidx.browser.customtabs.k0 a(com.applovin.impl.adview.a aVar) {
        if (this.f13928b == null) {
            this.f13927a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13927a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f13927a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f13927a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            androidx.browser.customtabs.k0 k0VarNewSession = this.f13928b.newSession(new b(aVar));
            a(k0VarNewSession, aVar.g());
            return k0VarNewSession;
        } catch (Exception e10) {
            this.f13927a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13927a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, androidx.browser.customtabs.k0 k0Var) {
        this.f13927a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f13927a.O().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CustomTabsService.KEY_URL, Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean zMayLaunchUrl = k0Var.mayLaunchUrl(Uri.parse(str), null, arrayList);
        this.f13927a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f13927a.O().a("CustomTabsManager", "Warmup for URLs ".concat(zMayLaunchUrl ? "succeeded" : C3191e4.h.f36509t));
        }
    }

    public void a(String str, com.applovin.impl.adview.a aVar, Activity activity) {
        if (a("launch url", new al.a(this, aVar, activity, str))) {
            this.f13927a.n0().pauseForClick();
        } else {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, String str) {
        a(aVar, activity).launchUrl(activity, Uri.parse(str));
    }

    private void a(androidx.browser.customtabs.k0 k0Var, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.F0()) {
            return;
        }
        a("client warmup", new androidx.browser.customtabs.g(this, 10, bVar, k0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, androidx.browser.customtabs.k0 k0Var) {
        this.f13928b.warmup(0L);
        f1 f1VarA = bVar.A();
        if (f1VarA == null) {
            return;
        }
        Integer numE = f1VarA.e();
        String strB = f1VarA.b();
        if (numE == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (k0Var == null) {
            this.f13927a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13927a.O().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f13927a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f13927a.O().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        k0Var.validateRelationship(numE.intValue(), Uri.parse(strB), null);
    }

    private androidx.browser.customtabs.z a(com.applovin.impl.adview.a aVar, Activity activity) {
        this.f13927a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f13927a.O().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        androidx.browser.customtabs.y yVar = new androidx.browser.customtabs.y(aVar.h());
        f1 f1VarA = bVarG != null ? bVarG.A() : null;
        if (((Boolean) this.f13927a.a(v4.T6)).booleanValue()) {
            yVar.setStartAnimations(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation);
            yVar.setExitAnimations(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation);
        }
        if (f1VarA != null) {
            Integer numH = f1VarA.h();
            if (numH != null) {
                yVar.setDefaultColorSchemeParams(new androidx.browser.customtabs.c().setToolbarColor(numH.intValue()).build());
            }
            Integer numA = f1VarA.a();
            if (numA != null) {
                yVar.setColorSchemeParams(2, new androidx.browser.customtabs.c().setToolbarColor(numA.intValue()).build());
            }
            Boolean boolI = f1VarA.i();
            if (boolI != null) {
                yVar.setUrlBarHidingEnabled(boolI.booleanValue());
            }
            Boolean boolG = f1VarA.g();
            if (boolG != null) {
                yVar.setShowTitle(boolG.booleanValue());
            }
            Boolean boolC = f1VarA.c();
            if (boolC != null) {
                yVar.setInstantAppsEnabled(boolC.booleanValue());
            }
            Integer numF = f1VarA.f();
            if (numF != null) {
                yVar.setShareState(numF.intValue());
            }
        }
        androidx.browser.customtabs.z zVarBuild = yVar.build();
        if (f1VarA != null) {
            String strD = f1VarA.d();
            if (strD != null) {
                zVarBuild.f5302a.putExtra("android.intent.extra.REFERRER", Uri.parse(strD));
            }
            Bundle bundleV = bVarG.v();
            if (!bundleV.isEmpty()) {
                zVarBuild.f5302a.putExtra("com.android.browser.headers", bundleV);
            }
        }
        return zVarBuild;
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f13927a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13927a.O().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f13927a.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return true;
            }
            this.f13927a.O().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th2) {
            this.f13927a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13927a.O().a("CustomTabsManager", "Failed to run operation: " + str, th2);
            }
            this.f13927a.E().a("CustomTabsManager", str, th2);
            return false;
        }
    }
}
