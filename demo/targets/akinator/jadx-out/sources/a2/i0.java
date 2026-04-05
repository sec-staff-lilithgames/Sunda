package a2;

import a2.t;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.digidust.elokence.akinator.freemium.R;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends x3.b {
    public static final int[] A;

    /* renamed from: d, reason: collision with root package name */
    public final t f3618d;

    /* renamed from: e, reason: collision with root package name */
    public int f3619e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f3620f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3621g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f3622h;

    /* renamed from: i, reason: collision with root package name */
    public final y3.n f3623i;

    /* renamed from: j, reason: collision with root package name */
    public int f3624j;

    /* renamed from: k, reason: collision with root package name */
    public final z.u1 f3625k;

    /* renamed from: l, reason: collision with root package name */
    public final z.u1 f3626l;

    /* renamed from: m, reason: collision with root package name */
    public int f3627m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f3628n;

    /* renamed from: o, reason: collision with root package name */
    public final z.g f3629o;

    /* renamed from: p, reason: collision with root package name */
    public final Channel f3630p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3631q;

    /* renamed from: r, reason: collision with root package name */
    public c f3632r;

    /* renamed from: s, reason: collision with root package name */
    public Map f3633s;

    /* renamed from: t, reason: collision with root package name */
    public final z.g f3634t;

    /* renamed from: u, reason: collision with root package name */
    public Map f3635u;

    /* renamed from: v, reason: collision with root package name */
    public d f3636v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3637w;

    /* renamed from: x, reason: collision with root package name */
    public final s f3638x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f3639y;

    /* renamed from: z, reason: collision with root package name */
    public final m0 f3640z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends AccessibilityNodeProvider {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo info, String extraDataKey, Bundle bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
            kotlin.jvm.internal.e0.checkNotNullParameter(extraDataKey, "extraDataKey");
            i0.access$addExtraDataToAccessibilityNodeInfoHelper(i0.this, i10, info, extraDataKey, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            return i0.access$createNodeInfo(i0.this, i10);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return i0.access$performActionHelper(i0.this, i10, i11, bundle);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final e2.c0 f3642a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3643b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3644c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3645d;

        /* renamed from: e, reason: collision with root package name */
        public final int f3646e;

        /* renamed from: f, reason: collision with root package name */
        public final long f3647f;

        public c(e2.c0 node, int i10, int i11, int i12, int i13, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
            this.f3642a = node;
            this.f3643b = i10;
            this.f3644c = i11;
            this.f3645d = i12;
            this.f3646e = i13;
            this.f3647f = j10;
        }

        public final int getAction() {
            return this.f3643b;
        }

        public final int getFromIndex() {
            return this.f3645d;
        }

        public final int getGranularity() {
            return this.f3644c;
        }

        public final e2.c0 getNode() {
            return this.f3642a;
        }

        public final int getToIndex() {
            return this.f3646e;
        }

        public final long getTraverseTime() {
            return this.f3647f;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final e2.p f3648a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedHashSet f3649b;

        public d(e2.c0 semanticsNode, Map<Integer, q4> currentSemanticsNodes) {
            kotlin.jvm.internal.e0.checkNotNullParameter(semanticsNode, "semanticsNode");
            kotlin.jvm.internal.e0.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
            this.f3648a = semanticsNode.getUnmergedConfig$ui_release();
            this.f3649b = new LinkedHashSet();
            List<e2.c0> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                e2.c0 c0Var = replacedChildren$ui_release.get(i10);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(c0Var.getId()))) {
                    this.f3649b.add(Integer.valueOf(c0Var.getId()));
                }
            }
        }

        public final Set<Integer> getChildren() {
            return this.f3649b;
        }

        public final e2.p getUnmergedConfig() {
            return this.f3648a;
        }

        public final boolean hasPaneTitle() {
            return this.f3648a.contains(e2.n0.f53555a.getPaneTitle());
        }
    }

    static {
        new a(null);
        A = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    }

    public i0(t view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f3618d = view;
        this.f3619e = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.f3620f = (AccessibilityManager) systemService;
        this.f3622h = new Handler(Looper.getMainLooper());
        this.f3623i = new y3.n(new b());
        this.f3624j = Integer.MIN_VALUE;
        this.f3625k = new z.u1();
        this.f3626l = new z.u1();
        this.f3627m = -1;
        this.f3629o = new z.g();
        this.f3630p = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.f3631q = true;
        this.f3633s = uu.p1.emptyMap();
        this.f3634t = new z.g();
        this.f3635u = new LinkedHashMap();
        this.f3636v = new d(view.getSemanticsOwner().getUnmergedRootSemanticsNode(), uu.p1.emptyMap());
        view.addOnAttachStateChangeListener(new f0(this));
        this.f3638x = new s(this, 1);
        this.f3639y = new ArrayList();
        this.f3640z = new m0(this);
    }

    public static final void access$addExtraDataToAccessibilityNodeInfoHelper(i0 i0Var, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        e2.c0 semanticsNode;
        String str2;
        RectF rectF;
        q4 q4Var = (q4) i0Var.d().get(Integer.valueOf(i10));
        if (q4Var == null || (semanticsNode = q4Var.getSemanticsNode()) == null) {
            return;
        }
        String strE = e(semanticsNode);
        e2.p unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        e2.o oVar = e2.o.f53581a;
        if (!unmergedConfig$ui_release.contains(oVar.getGetTextLayoutResult()) || bundle == null || !kotlin.jvm.internal.e0.areEqual(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            e2.p unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
            e2.n0 n0Var = e2.n0.f53555a;
            if (!unmergedConfig$ui_release2.contains(n0Var.getTestTag()) || bundle == null || !kotlin.jvm.internal.e0.areEqual(str, "androidx.compose.ui.semantics.testTag") || (str2 = (String) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var.getTestTag())) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
            return;
        }
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i12 > 0 && i11 >= 0) {
            if (i11 < (strE != null ? strE.length() : Integer.MAX_VALUE)) {
                ArrayList arrayList = new ArrayList();
                kv.l lVar = (kv.l) ((e2.a) semanticsNode.getUnmergedConfig$ui_release().get(oVar.getGetTextLayoutResult())).getAction();
                if (kotlin.jvm.internal.e0.areEqual(lVar != null ? (Boolean) lVar.invoke(arrayList) : null, Boolean.TRUE)) {
                    g2.x1 x1Var = (g2.x1) arrayList.get(0);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = i11 + i13;
                        if (i14 >= x1Var.getLayoutInput().getText().length()) {
                            arrayList2.add(null);
                        } else {
                            i1.j boundingBox = x1Var.getBoundingBox(i14);
                            t tVar = i0Var.f3618d;
                            i1.j jVarM4216translatek4lQ0M = boundingBox.m4216translatek4lQ0M(semanticsNode.m3804getPositionInRootF1C5BW0());
                            i1.j boundsInRoot = semanticsNode.getBoundsInRoot();
                            i1.j jVarIntersect = jVarM4216translatek4lQ0M.overlaps(boundsInRoot) ? jVarM4216translatek4lQ0M.intersect(boundsInRoot) : null;
                            if (jVarIntersect != null) {
                                long jMo57localToScreenMKHz9U = tVar.mo57localToScreenMKHz9U(i1.i.Offset(jVarIntersect.getLeft(), jVarIntersect.getTop()));
                                long jMo57localToScreenMKHz9U2 = tVar.mo57localToScreenMKHz9U(i1.i.Offset(jVarIntersect.getRight(), jVarIntersect.getBottom()));
                                rectF = new RectF(i1.h.m4185getXimpl(jMo57localToScreenMKHz9U), i1.h.m4186getYimpl(jMo57localToScreenMKHz9U), i1.h.m4185getXimpl(jMo57localToScreenMKHz9U2), i1.h.m4186getYimpl(jMo57localToScreenMKHz9U2));
                            } else {
                                rectF = null;
                            }
                            arrayList2.add(rectF);
                        }
                    }
                    Bundle extras = accessibilityNodeInfo.getExtras();
                    Object[] array = arrayList2.toArray(new RectF[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    extras.putParcelableArray(str, (Parcelable[]) array);
                    return;
                }
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public static final AccessibilityNodeInfo access$createNodeInfo(i0 i0Var, int i10) {
        androidx.lifecycle.b1 lifecycleOwner;
        androidx.lifecycle.k0 lifecycle;
        t tVar = i0Var.f3618d;
        t.b viewTreeOwners = tVar.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == androidx.lifecycle.j0.f6614b) {
            return null;
        }
        y3.c cVarObtain = y3.c.obtain();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(cVarObtain, "obtain()");
        q4 q4Var = (q4) i0Var.d().get(Integer.valueOf(i10));
        if (q4Var == null) {
            cVarObtain.recycle();
            return null;
        }
        e2.c0 semanticsNode = q4Var.getSemanticsNode();
        if (i10 == -1) {
            Object parentForAccessibility = x3.z1.getParentForAccessibility(tVar);
            cVarObtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            if (semanticsNode.getParent() == null) {
                throw new IllegalStateException(p0.o2.k(i10, "semanticsNode ", " has null parent"));
            }
            e2.c0 parent = semanticsNode.getParent();
            kotlin.jvm.internal.e0.checkNotNull(parent);
            int id2 = parent.getId();
            cVarObtain.setParent(tVar, id2 != tVar.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? id2 : -1);
        }
        cVarObtain.setSource(tVar, i10);
        Rect adjustedBounds = q4Var.getAdjustedBounds();
        long jMo57localToScreenMKHz9U = tVar.mo57localToScreenMKHz9U(i1.i.Offset(adjustedBounds.left, adjustedBounds.top));
        long jMo57localToScreenMKHz9U2 = tVar.mo57localToScreenMKHz9U(i1.i.Offset(adjustedBounds.right, adjustedBounds.bottom));
        cVarObtain.setBoundsInScreen(new Rect((int) Math.floor(i1.h.m4185getXimpl(jMo57localToScreenMKHz9U)), (int) Math.floor(i1.h.m4186getYimpl(jMo57localToScreenMKHz9U)), (int) Math.ceil(i1.h.m4185getXimpl(jMo57localToScreenMKHz9U2)), (int) Math.ceil(i1.h.m4186getYimpl(jMo57localToScreenMKHz9U2))));
        i0Var.populateAccessibilityNodeInfoProperties(i10, cVarObtain, semanticsNode);
        return cVarObtain.unwrap();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:56:0x0100
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00ff -> B:56:0x0100). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean access$performActionHelper(a2.i0 r17, int r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.i0.access$performActionHelper(a2.i0, int, int, android.os.Bundle):boolean");
    }

    public static final void access$sendScrollEventIfNeeded(i0 i0Var, p4 p4Var) {
        i0Var.getClass();
        if (p4Var.isValid()) {
            i0Var.f3618d.getSnapshotObserver().observeReads$ui_release(p4Var, i0Var.f3640z, new l0(i0Var, p4Var));
        }
    }

    public static String e(e2.c0 c0Var) {
        g2.b bVar;
        if (c0Var == null) {
            return null;
        }
        e2.p unmergedConfig$ui_release = c0Var.getUnmergedConfig$ui_release();
        e2.n0 n0Var = e2.n0.f53555a;
        if (unmergedConfig$ui_release.contains(n0Var.getContentDescription())) {
            return e1.z.fastJoinToString$default((List) c0Var.getUnmergedConfig$ui_release().get(n0Var.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (c0Var.getUnmergedConfig$ui_release().contains(e2.o.f53581a.getSetText())) {
            g2.b bVarF = f(c0Var.getUnmergedConfig$ui_release());
            if (bVarF != null) {
                return bVarF.getText();
            }
            return null;
        }
        List list = (List) e2.r.getOrNull(c0Var.getUnmergedConfig$ui_release(), n0Var.getText());
        if (list == null || (bVar = (g2.b) uu.y0.firstOrNull(list)) == null) {
            return null;
        }
        return bVar.getText();
    }

    public static g2.b f(e2.p pVar) {
        return (g2.b) e2.r.getOrNull(pVar, e2.n0.f53555a.getEditableText());
    }

    public static final boolean i(e2.n nVar, float f10) {
        if (f10 >= 0.0f || ((Number) nVar.getValue().invoke()).floatValue() <= 0.0f) {
            return f10 > 0.0f && ((Number) nVar.getValue().invoke()).floatValue() < ((Number) nVar.getMaxValue().invoke()).floatValue();
        }
        return true;
    }

    public static final boolean j(e2.n nVar) {
        if (((Number) nVar.getValue().invoke()).floatValue() <= 0.0f || nVar.getReverseScrolling()) {
            return ((Number) nVar.getValue().invoke()).floatValue() < ((Number) nVar.getMaxValue().invoke()).floatValue() && nVar.getReverseScrolling();
        }
        return true;
    }

    public static final boolean k(e2.n nVar) {
        if (((Number) nVar.getValue().invoke()).floatValue() >= ((Number) nVar.getMaxValue().invoke()).floatValue() || nVar.getReverseScrolling()) {
            return ((Number) nVar.getValue().invoke()).floatValue() > 0.0f && nVar.getReverseScrolling();
        }
        return true;
    }

    public static /* synthetic */ void o(i0 i0Var, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        i0Var.n(i10, i11, num, null);
    }

    public static CharSequence u(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int length = charSequence.length();
        int i10 = DefaultOggSeeker.MATCH_BYTE_RANGE;
        if (length <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(DefaultOggSeeker.MATCH_BYTE_RANGE))) {
            i10 = 99999;
        }
        return charSequence.subSequence(0, i10);
    }

    public final AccessibilityEvent a(int i10, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(i10, Segment.SIZE);
        if (num != null) {
            accessibilityEventCreateEvent$ui_release.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventCreateEvent$ui_release.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventCreateEvent$ui_release.setItemCount(num3.intValue());
        }
        if (str != null) {
            accessibilityEventCreateEvent$ui_release.getText().add(str);
        }
        return accessibilityEventCreateEvent$ui_release;
    }

    public final int b(e2.c0 c0Var) {
        e2.p unmergedConfig$ui_release = c0Var.getUnmergedConfig$ui_release();
        e2.n0 n0Var = e2.n0.f53555a;
        return (unmergedConfig$ui_release.contains(n0Var.getContentDescription()) || !c0Var.getUnmergedConfig$ui_release().contains(n0Var.getTextSelectionRange())) ? this.f3627m : g2.a2.m3955getEndimpl(((g2.a2) c0Var.getUnmergedConfig$ui_release().get(n0Var.getTextSelectionRange())).m3964unboximpl());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(100, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:25:0x0057, B:29:0x0069, B:31:0x0071, B:34:0x007c, B:36:0x0083, B:37:0x0092, B:39:0x0099, B:40:0x00a2, B:20:0x0044), top: B:49:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b3 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop(zu.d<? super tu.x0> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof a2.j0
            if (r0 == 0) goto L13
            r0 = r12
            a2.j0 r0 = (a2.j0) r0
            int r1 = r0.f3663n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3663n = r1
            goto L18
        L13:
            a2.j0 r0 = new a2.j0
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f3661l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3663n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            kotlinx.coroutines.channels.ChannelIterator r2 = r0.f3660k
            z.g r5 = r0.f3659j
            a2.i0 r6 = r0.f3658i
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L33
        L31:
            r12 = r5
            goto L57
        L33:
            r12 = move-exception
            goto Lc0
        L36:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3e:
            kotlinx.coroutines.channels.ChannelIterator r2 = r0.f3660k
            z.g r5 = r0.f3659j
            a2.i0 r6 = r0.f3658i
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L33
            goto L69
        L48:
            tu.a0.throwOnFailure(r12)
            z.g r12 = new z.g     // Catch: java.lang.Throwable -> Lbe
            r12.<init>()     // Catch: java.lang.Throwable -> Lbe
            kotlinx.coroutines.channels.Channel r2 = r11.f3630p     // Catch: java.lang.Throwable -> Lbe
            kotlinx.coroutines.channels.ChannelIterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lbe
            r6 = r11
        L57:
            r0.f3658i = r6     // Catch: java.lang.Throwable -> L33
            r0.f3659j = r12     // Catch: java.lang.Throwable -> L33
            r0.f3660k = r2     // Catch: java.lang.Throwable -> L33
            r0.f3663n = r4     // Catch: java.lang.Throwable -> L33
            java.lang.Object r5 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L33
            if (r5 != r1) goto L66
            goto Lb5
        L66:
            r10 = r5
            r5 = r12
            r12 = r10
        L69:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L33
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r12 == 0) goto Lb6
            r2.next()     // Catch: java.lang.Throwable -> L33
            boolean r12 = r6.g()     // Catch: java.lang.Throwable -> L33
            z.g r7 = r6.f3629o
            if (r12 == 0) goto La2
            int r12 = r7.size()     // Catch: java.lang.Throwable -> L33
            r8 = 0
        L81:
            if (r8 >= r12) goto L92
            java.lang.Object r9 = r7.valueAt(r8)     // Catch: java.lang.Throwable -> L33
            kotlin.jvm.internal.e0.checkNotNull(r9)     // Catch: java.lang.Throwable -> L33
            z1.b0 r9 = (z1.b0) r9     // Catch: java.lang.Throwable -> L33
            r6.s(r9, r5)     // Catch: java.lang.Throwable -> L33
            int r8 = r8 + 1
            goto L81
        L92:
            r5.clear()     // Catch: java.lang.Throwable -> L33
            boolean r12 = r6.f3637w     // Catch: java.lang.Throwable -> L33
            if (r12 != 0) goto La2
            r6.f3637w = r4     // Catch: java.lang.Throwable -> L33
            android.os.Handler r12 = r6.f3622h     // Catch: java.lang.Throwable -> L33
            a2.s r8 = r6.f3638x     // Catch: java.lang.Throwable -> L33
            r12.post(r8)     // Catch: java.lang.Throwable -> L33
        La2:
            r7.clear()     // Catch: java.lang.Throwable -> L33
            r0.f3658i = r6     // Catch: java.lang.Throwable -> L33
            r0.f3659j = r5     // Catch: java.lang.Throwable -> L33
            r0.f3660k = r2     // Catch: java.lang.Throwable -> L33
            r0.f3663n = r3     // Catch: java.lang.Throwable -> L33
            r7 = 100
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r7, r0)     // Catch: java.lang.Throwable -> L33
            if (r12 != r1) goto L31
        Lb5:
            return r1
        Lb6:
            z.g r12 = r6.f3629o
            r12.clear()
            tu.x0 r12 = tu.x0.f87415a
            return r12
        Lbe:
            r12 = move-exception
            r6 = r11
        Lc0:
            z.g r0 = r6.f3629o
            r0.clear()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.i0.boundsUpdatesEventLoop(zu.d):java.lang.Object");
    }

    public final int c(e2.c0 c0Var) {
        e2.p unmergedConfig$ui_release = c0Var.getUnmergedConfig$ui_release();
        e2.n0 n0Var = e2.n0.f53555a;
        return (unmergedConfig$ui_release.contains(n0Var.getContentDescription()) || !c0Var.getUnmergedConfig$ui_release().contains(n0Var.getTextSelectionRange())) ? this.f3627m : g2.a2.m3960getStartimpl(((g2.a2) c0Var.getUnmergedConfig$ui_release().get(n0Var.getTextSelectionRange())).m3964unboximpl());
    }

    /* renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m37canScroll0AR0LA0$ui_release(boolean z10, int i10, long j10) {
        return m38canScrollmoWRBKg$ui_release(d().values(), z10, i10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* renamed from: canScroll-moWRBKg$ui_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m38canScrollmoWRBKg$ui_release(java.util.Collection<a2.q4> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
            i1.g r0 = i1.h.f59344b
            long r0 = r0.m4172getUnspecifiedF1C5BW0()
            boolean r0 = i1.h.m4182equalsimpl0(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lbd
            boolean r0 = i1.h.m4188isValidimpl(r9)
            if (r0 != 0) goto L1a
            goto Lbd
        L1a:
            r0 = 1
            if (r7 != r0) goto L24
            e2.n0 r7 = e2.n0.f53555a
            e2.t0 r7 = r7.getVerticalScrollAxisRange()
            goto L2c
        L24:
            if (r7 != 0) goto Lb7
            e2.n0 r7 = e2.n0.f53555a
            e2.t0 r7 = r7.getHorizontalScrollAxisRange()
        L2c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
            return r1
        L38:
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb6
            java.lang.Object r2 = r6.next()
            a2.q4 r2 = (a2.q4) r2
            android.graphics.Rect r3 = r2.getAdjustedBounds()
            i1.j r3 = j1.w1.toComposeRect(r3)
            boolean r3 = r3.m4205containsk4lQ0M(r9)
            if (r3 != 0) goto L58
        L56:
            r2 = r1
            goto Lb3
        L58:
            e2.c0 r2 = r2.getSemanticsNode()
            e2.p r2 = r2.getConfig()
            java.lang.Object r2 = e2.r.getOrNull(r2, r7)
            e2.n r2 = (e2.n) r2
            if (r2 != 0) goto L69
            goto L56
        L69:
            boolean r3 = r2.getReverseScrolling()
            if (r3 == 0) goto L71
            int r3 = -r8
            goto L72
        L71:
            r3 = r8
        L72:
            if (r8 != 0) goto L7b
            boolean r4 = r2.getReverseScrolling()
            if (r4 == 0) goto L7b
            r3 = -1
        L7b:
            if (r3 >= 0) goto L92
            kv.a r2 = r2.getValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L56
        L90:
            r2 = r0
            goto Lb3
        L92:
            kv.a r3 = r2.getValue()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            kv.a r2 = r2.getMaxValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L56
            goto L90
        Lb3:
            if (r2 == 0) goto L3c
            return r0
        Lb6:
            return r1
        Lb7:
            tu.t r6 = new tu.t
            r6.<init>()
            throw r6
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.i0.m38canScrollmoWRBKg$ui_release(java.util.Collection, boolean, int, long):boolean");
    }

    public final AccessibilityEvent createEvent$ui_release(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(accessibilityEventObtain, "obtain(eventType)");
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        t tVar = this.f3618d;
        accessibilityEventObtain.setPackageName(tVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(tVar, i10);
        q4 q4Var = (q4) d().get(Integer.valueOf(i10));
        if (q4Var != null) {
            accessibilityEventObtain.setPassword(q4Var.getSemanticsNode().getConfig().contains(e2.n0.f53555a.getPassword()));
        }
        return accessibilityEventObtain;
    }

    public final Map d() {
        if (this.f3631q) {
            this.f3633s = q0.getAllUncoveredSemanticsNodesToMap(this.f3618d.getSemanticsOwner());
            this.f3631q = false;
        }
        return this.f3633s;
    }

    public final boolean dispatchHoverEvent(MotionEvent event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (!g()) {
            return false;
        }
        int action = event.getAction();
        t tVar = this.f3618d;
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = tVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            int i10 = this.f3619e;
            if (i10 != iHitTestSemanticsAt$ui_release) {
                this.f3619e = iHitTestSemanticsAt$ui_release;
                o(this, iHitTestSemanticsAt$ui_release, 128, null, 12);
                o(this, i10, NotificationCompat.FLAG_LOCAL_ONLY, null, 12);
            }
            if (iHitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
        } else {
            if (action != 10) {
                return false;
            }
            int i11 = this.f3619e;
            if (i11 == Integer.MIN_VALUE) {
                return tVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f3619e = Integer.MIN_VALUE;
                o(this, Integer.MIN_VALUE, 128, null, 12);
                o(this, i11, NotificationCompat.FLAG_LOCAL_ONLY, null, 12);
                return true;
            }
        }
        return true;
    }

    public final boolean g() {
        if (this.f3621g) {
            return true;
        }
        AccessibilityManager accessibilityManager = this.f3620f;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.f3621g;
    }

    @Override // x3.b
    public y3.n getAccessibilityNodeProvider(View host) {
        kotlin.jvm.internal.e0.checkNotNullParameter(host, "host");
        return this.f3623i;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.f3619e;
    }

    public final Map<Integer, d> getPreviousSemanticsNodes$ui_release() {
        return this.f3635u;
    }

    public final t getView() {
        return this.f3618d;
    }

    public final void h(z1.b0 b0Var) {
        if (this.f3629o.add(b0Var)) {
            this.f3630p.mo5139trySendJP2dKIU(tu.x0.f87415a);
        }
    }

    public final int hitTestSemanticsAt$ui_release(float f10, float f11) {
        z1.b0 layoutNode;
        t tVar = this.f3618d;
        e2.s outerSemantics = null;
        z1.s1.measureAndLayout$default(tVar, false, 1, null);
        z1.s sVar = new z1.s();
        z1.b0.m8019hitTestSemanticsM_7yMNQ$ui_release$default(tVar.getRoot(), i1.i.Offset(f10, f11), sVar, false, false, 12, null);
        e2.s sVar2 = (e2.s) uu.y0.lastOrNull((List) sVar);
        if (sVar2 != null && (layoutNode = sVar2.getLayoutNode()) != null) {
            outerSemantics = e2.d0.getOuterSemantics(layoutNode);
        }
        if (outerSemantics == null) {
            return Integer.MIN_VALUE;
        }
        e2.c0 c0Var = new e2.c0(outerSemantics, false);
        z1.u0 u0VarFindWrapperToGetBounds$ui_release = c0Var.findWrapperToGetBounds$ui_release();
        if (c0Var.getUnmergedConfig$ui_release().contains(e2.n0.f53555a.getInvisibleToUser()) || u0VarFindWrapperToGetBounds$ui_release.isTransparent() || tVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(outerSemantics.getLayoutNode()) != null) {
            return Integer.MIN_VALUE;
        }
        return l(((e2.t) outerSemantics.getModifier()).getId());
    }

    public final int l(int i10) {
        if (i10 == this.f3618d.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i10;
    }

    public final boolean m(AccessibilityEvent accessibilityEvent) {
        if (!g()) {
            return false;
        }
        View view = this.f3618d;
        return view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean n(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !g()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(i10, i11);
        if (num != null) {
            accessibilityEventCreateEvent$ui_release.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventCreateEvent$ui_release.setContentDescription(e1.z.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        return m(accessibilityEventCreateEvent$ui_release);
    }

    public final void onLayoutChange$ui_release(z1.b0 layoutNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        this.f3631q = true;
        if (g()) {
            h(layoutNode);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.f3631q = true;
        if (!g() || this.f3637w) {
            return;
        }
        this.f3637w = true;
        this.f3622h.post(this.f3638x);
    }

    public final void p(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(l(i10), 32);
        accessibilityEventCreateEvent$ui_release.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventCreateEvent$ui_release.getText().add(str);
        }
        m(accessibilityEventCreateEvent$ui_release);
    }

    public final void populateAccessibilityNodeInfoProperties(int i10, y3.c info, e2.c0 semanticsNode) {
        z1.u0 u0VarFindWrapperToGetBounds$ui_release;
        int iCoerceIn;
        boolean zBooleanValue;
        g2.b bVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        kotlin.jvm.internal.e0.checkNotNullParameter(semanticsNode, "semanticsNode");
        info.setClassName("android.view.View");
        e2.p unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        e2.n0 n0Var = e2.n0.f53555a;
        e2.m mVar = (e2.m) e2.r.getOrNull(unmergedConfig$ui_release, n0Var.getRole());
        t tVar = this.f3618d;
        if (mVar != null) {
            int iM3827unboximpl = mVar.m3827unboximpl();
            if (semanticsNode.isFake$ui_release() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                e2.l lVar = e2.m.f53544b;
                if (e2.m.m3824equalsimpl0(mVar.m3827unboximpl(), lVar.m3821getTabo7Vup1c())) {
                    info.setRoleDescription(tVar.getContext().getResources().getString(R.string.tab));
                } else {
                    String str = e2.m.m3824equalsimpl0(iM3827unboximpl, lVar.m3816getButtono7Vup1c()) ? "android.widget.Button" : e2.m.m3824equalsimpl0(iM3827unboximpl, lVar.m3817getCheckboxo7Vup1c()) ? "android.widget.CheckBox" : e2.m.m3824equalsimpl0(iM3827unboximpl, lVar.m3820getSwitcho7Vup1c()) ? "android.widget.Switch" : e2.m.m3824equalsimpl0(iM3827unboximpl, lVar.m3819getRadioButtono7Vup1c()) ? "android.widget.RadioButton" : e2.m.m3824equalsimpl0(iM3827unboximpl, lVar.m3818getImageo7Vup1c()) ? "android.widget.ImageView" : null;
                    if (!e2.m.m3824equalsimpl0(mVar.m3827unboximpl(), lVar.m3818getImageo7Vup1c()) || q0.access$findClosestParentNode(semanticsNode.getLayoutNode$ui_release(), k0.f3690e) == null || semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                        info.setClassName(str);
                    }
                }
            }
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(e2.o.f53581a.getSetText())) {
            info.setClassName("android.widget.EditText");
        }
        if (semanticsNode.getConfig().contains(n0Var.getText())) {
            info.setClassName("android.widget.TextView");
        }
        info.setPackageName(tVar.getContext().getPackageName());
        List<e2.c0> replacedChildrenSortedByBounds$ui_release = semanticsNode.getReplacedChildrenSortedByBounds$ui_release();
        int size = replacedChildrenSortedByBounds$ui_release.size();
        for (int i11 = 0; i11 < size; i11++) {
            e2.c0 c0Var = replacedChildrenSortedByBounds$ui_release.get(i11);
            if (d().containsKey(Integer.valueOf(c0Var.getId()))) {
                View view = (u2.o) tVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c0Var.getLayoutNode$ui_release());
                if (view != null) {
                    info.addChild(view);
                } else {
                    info.addChild(tVar, c0Var.getId());
                }
            }
        }
        if (this.f3624j == i10) {
            info.setAccessibilityFocused(true);
            info.addAction(c.a.f94041i);
        } else {
            info.setAccessibilityFocused(false);
            info.addAction(c.a.f94040h);
        }
        l2.y fontFamilyResolver = tVar.getFontFamilyResolver();
        g2.b bVarF = f(semanticsNode.getUnmergedConfig$ui_release());
        CharSequence charSequence = (SpannableString) u(bVarF != null ? o2.a.toAccessibilitySpannableString(bVarF, tVar.getDensity(), fontFamilyResolver) : null);
        e2.p unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
        e2.n0 n0Var2 = e2.n0.f53555a;
        List list = (List) e2.r.getOrNull(unmergedConfig$ui_release2, n0Var2.getText());
        CharSequence charSequence2 = (SpannableString) u((list == null || (bVar = (g2.b) uu.y0.firstOrNull(list)) == null) ? null : o2.a.toAccessibilitySpannableString(bVar, tVar.getDensity(), fontFamilyResolver));
        if (charSequence == null) {
            charSequence = charSequence2;
        }
        info.setText(charSequence);
        if (semanticsNode.getUnmergedConfig$ui_release().contains(n0Var2.getError())) {
            info.setContentInvalid(true);
            info.setError((CharSequence) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var2.getError()));
        }
        info.setStateDescription((CharSequence) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var2.getStateDescription()));
        f2.a aVar = (f2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var2.getToggleableState());
        if (aVar != null) {
            info.setCheckable(true);
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                info.setChecked(true);
                if ((mVar == null ? false : e2.m.m3824equalsimpl0(mVar.m3827unboximpl(), e2.m.f53544b.m3820getSwitcho7Vup1c())) && info.getStateDescription() == null) {
                    info.setStateDescription(tVar.getContext().getResources().getString(R.string.on));
                }
            } else if (iOrdinal == 1) {
                info.setChecked(false);
                if ((mVar == null ? false : e2.m.m3824equalsimpl0(mVar.m3827unboximpl(), e2.m.f53544b.m3820getSwitcho7Vup1c())) && info.getStateDescription() == null) {
                    info.setStateDescription(tVar.getContext().getResources().getString(R.string.off));
                }
            } else if (iOrdinal == 2 && info.getStateDescription() == null) {
                info.setStateDescription(tVar.getContext().getResources().getString(R.string.indeterminate));
            }
        }
        Boolean bool = (Boolean) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var2.getSelected());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (mVar == null ? false : e2.m.m3824equalsimpl0(mVar.m3827unboximpl(), e2.m.f53544b.m3821getTabo7Vup1c())) {
                info.setSelected(zBooleanValue2);
            } else {
                info.setCheckable(true);
                info.setChecked(zBooleanValue2);
                if (info.getStateDescription() == null) {
                    info.setStateDescription(zBooleanValue2 ? tVar.getContext().getResources().getString(R.string.selected) : tVar.getContext().getResources().getString(R.string.not_selected));
                }
            }
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            List list2 = (List) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var2.getContentDescription());
            info.setContentDescription(list2 != null ? (String) uu.y0.firstOrNull(list2) : null);
        }
        if (semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
            info.setScreenReaderFocusable(true);
        }
        String str2 = (String) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var2.getTestTag());
        if (str2 != null) {
            e2.c0 parent = semanticsNode;
            while (true) {
                if (parent == null) {
                    zBooleanValue = false;
                    break;
                }
                e2.p unmergedConfig$ui_release3 = parent.getUnmergedConfig$ui_release();
                e2.p0 p0Var = e2.p0.f53602a;
                if (unmergedConfig$ui_release3.contains(p0Var.getTestTagsAsResourceId())) {
                    zBooleanValue = ((Boolean) parent.getUnmergedConfig$ui_release().get(p0Var.getTestTagsAsResourceId())).booleanValue();
                    break;
                }
                parent = parent.getParent();
            }
            if (zBooleanValue) {
                info.setViewIdResourceName(str2);
            }
        }
        e2.p unmergedConfig$ui_release4 = semanticsNode.getUnmergedConfig$ui_release();
        e2.n0 n0Var3 = e2.n0.f53555a;
        if (((tu.x0) e2.r.getOrNull(unmergedConfig$ui_release4, n0Var3.getHeading())) != null) {
            info.setHeading(true);
        }
        info.setPassword(semanticsNode.getConfig().contains(e2.n0.f53555a.getPassword()));
        info.setEditable(semanticsNode.getUnmergedConfig$ui_release().contains(e2.o.f53581a.getSetText()));
        info.setEnabled(q0.access$enabled(semanticsNode));
        info.setFocusable(semanticsNode.getUnmergedConfig$ui_release().contains(n0Var3.getFocused()));
        if (info.isFocusable()) {
            info.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui_release().get(n0Var3.getFocused())).booleanValue());
            if (info.isFocused()) {
                info.addAction(2);
            } else {
                info.addAction(1);
            }
        }
        if (semanticsNode.isFake$ui_release()) {
            e2.c0 parent2 = semanticsNode.getParent();
            u0VarFindWrapperToGetBounds$ui_release = parent2 != null ? parent2.findWrapperToGetBounds$ui_release() : null;
        } else {
            u0VarFindWrapperToGetBounds$ui_release = semanticsNode.findWrapperToGetBounds$ui_release();
        }
        info.setVisibleToUser(!(u0VarFindWrapperToGetBounds$ui_release != null ? u0VarFindWrapperToGetBounds$ui_release.isTransparent() : false) && e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var3.getInvisibleToUser()) == null);
        e2.f fVar = (e2.f) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var3.getLiveRegion());
        if (fVar != null) {
            int iM3814unboximpl = fVar.m3814unboximpl();
            e2.e eVar = e2.f.f53518b;
            info.setLiveRegion((e2.f.m3811equalsimpl0(iM3814unboximpl, eVar.m3808getPolite0phEisY()) || !e2.f.m3811equalsimpl0(iM3814unboximpl, eVar.m3807getAssertive0phEisY())) ? 1 : 2);
        }
        info.setClickable(false);
        e2.p unmergedConfig$ui_release5 = semanticsNode.getUnmergedConfig$ui_release();
        e2.o oVar = e2.o.f53581a;
        e2.a aVar2 = (e2.a) e2.r.getOrNull(unmergedConfig$ui_release5, oVar.getOnClick());
        if (aVar2 != null) {
            boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var3.getSelected()), Boolean.TRUE);
            info.setClickable(!zAreEqual);
            if (q0.access$enabled(semanticsNode) && !zAreEqual) {
                info.addAction(new c.a(16, aVar2.getLabel()));
            }
        }
        info.setLongClickable(false);
        e2.a aVar3 = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), oVar.getOnLongClick());
        if (aVar3 != null) {
            info.setLongClickable(true);
            if (q0.access$enabled(semanticsNode)) {
                info.addAction(new c.a(32, aVar3.getLabel()));
            }
        }
        e2.a aVar4 = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), oVar.getCopyText());
        if (aVar4 != null) {
            info.addAction(new c.a(16384, aVar4.getLabel()));
        }
        if (q0.access$enabled(semanticsNode)) {
            e2.a aVar5 = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), oVar.getSetText());
            if (aVar5 != null) {
                info.addAction(new c.a(2097152, aVar5.getLabel()));
            }
            e2.a aVar6 = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), oVar.getCutText());
            if (aVar6 != null) {
                info.addAction(new c.a(C.DEFAULT_BUFFER_SEGMENT_SIZE, aVar6.getLabel()));
            }
            e2.a aVar7 = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), oVar.getPasteText());
            if (aVar7 != null && info.isFocused() && tVar.getClipboardManager().hasText()) {
                info.addAction(new c.a(32768, aVar7.getLabel()));
            }
        }
        String strE = e(semanticsNode);
        if (!(strE == null || strE.length() == 0)) {
            info.setTextSelection(c(semanticsNode), b(semanticsNode));
            e2.a aVar8 = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), oVar.getSetSelection());
            info.addAction(new c.a(131072, aVar8 != null ? aVar8.getLabel() : null));
            info.addAction(NotificationCompat.FLAG_LOCAL_ONLY);
            info.addAction(512);
            info.setMovementGranularities(11);
            List list3 = (List) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var3.getContentDescription());
            if ((list3 == null || list3.isEmpty()) && semanticsNode.getUnmergedConfig$ui_release().contains(oVar.getGetTextLayoutResult()) && !q0.access$excludeLineAndPageGranularities(semanticsNode)) {
                info.setMovementGranularities(info.getMovementGranularities() | 20);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence text = info.getText();
            if (!(text == null || text.length() == 0) && semanticsNode.getUnmergedConfig$ui_release().contains(oVar.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(n0Var3.getTestTag())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            if (!arrayList.isEmpty()) {
                AccessibilityNodeInfo accessibilityNodeInfoUnwrap = info.unwrap();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(accessibilityNodeInfoUnwrap, "info.unwrap()");
                k.f3689a.setAvailableExtraData(accessibilityNodeInfoUnwrap, arrayList);
            }
        }
        e2.k kVar = (e2.k) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var3.getProgressBarRangeInfo());
        if (kVar != null) {
            if (semanticsNode.getUnmergedConfig$ui_release().contains(oVar.getSetProgress())) {
                info.setClassName("android.widget.SeekBar");
            } else {
                info.setClassName("android.widget.ProgressBar");
            }
            if (kVar != e2.k.f53537d.getIndeterminate()) {
                info.setRangeInfo(c.b.obtain(1, ((Number) kVar.getRange().getStart()).floatValue(), ((Number) kVar.getRange().getEndInclusive()).floatValue(), kVar.getCurrent()));
                if (info.getStateDescription() == null) {
                    qv.f range = kVar.getRange();
                    float fCoerceIn = qv.v.coerceIn(((((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue()) > 0.0f ? 1 : ((((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (kVar.getCurrent() - ((Number) range.getStart()).floatValue()) / (((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue()), 0.0f, 1.0f);
                    if (fCoerceIn == 0.0f) {
                        iCoerceIn = 0;
                    } else {
                        iCoerceIn = 100;
                        if (!(fCoerceIn == 1.0f)) {
                            iCoerceIn = qv.v.coerceIn(mv.d.roundToInt(fCoerceIn * 100), 1, 99);
                        }
                    }
                    info.setStateDescription(tVar.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(iCoerceIn)));
                }
            } else if (info.getStateDescription() == null) {
                info.setStateDescription(tVar.getContext().getResources().getString(R.string.in_progress));
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(oVar.getSetProgress()) && q0.access$enabled(semanticsNode)) {
                if (kVar.getCurrent() < qv.v.coerceAtLeast(((Number) kVar.getRange().getEndInclusive()).floatValue(), ((Number) kVar.getRange().getStart()).floatValue())) {
                    info.addAction(c.a.f94042j);
                }
                if (kVar.getCurrent() > qv.v.coerceAtMost(((Number) kVar.getRange().getStart()).floatValue(), ((Number) kVar.getRange().getEndInclusive()).floatValue())) {
                    info.addAction(c.a.f94043k);
                }
            }
        }
        g0.addSetProgressAction(info, semanticsNode);
        b2.c.setCollectionInfo(semanticsNode, info);
        b2.c.setCollectionItemInfo(semanticsNode, info);
        e2.n nVar = (e2.n) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var3.getHorizontalScrollAxisRange());
        e2.a aVar9 = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), oVar.getScrollBy());
        if (nVar != null && aVar9 != null) {
            if (!b2.c.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.HorizontalScrollView");
            }
            if (((Number) nVar.getMaxValue().invoke()).floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            if (q0.access$enabled(semanticsNode)) {
                if (k(nVar)) {
                    info.addAction(c.a.f94042j);
                    info.addAction(!q0.access$isRtl(semanticsNode) ? c.a.f94051s : c.a.f94049q);
                }
                if (j(nVar)) {
                    info.addAction(c.a.f94043k);
                    info.addAction(!q0.access$isRtl(semanticsNode) ? c.a.f94049q : c.a.f94051s);
                }
            }
        }
        e2.n nVar2 = (e2.n) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var3.getVerticalScrollAxisRange());
        if (nVar2 != null && aVar9 != null) {
            if (!b2.c.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.ScrollView");
            }
            if (((Number) nVar2.getMaxValue().invoke()).floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            if (q0.access$enabled(semanticsNode)) {
                if (k(nVar2)) {
                    info.addAction(c.a.f94042j);
                    info.addAction(c.a.f94050r);
                }
                if (j(nVar2)) {
                    info.addAction(c.a.f94043k);
                    info.addAction(c.a.f94048p);
                }
            }
        }
        info.setPaneTitle((CharSequence) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), n0Var3.getPaneTitle()));
        if (q0.access$enabled(semanticsNode)) {
            e2.a aVar10 = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), oVar.getExpand());
            if (aVar10 != null) {
                info.addAction(new c.a(262144, aVar10.getLabel()));
            }
            e2.a aVar11 = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), oVar.getCollapse());
            if (aVar11 != null) {
                info.addAction(new c.a(524288, aVar11.getLabel()));
            }
            e2.a aVar12 = (e2.a) e2.r.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), oVar.getDismiss());
            if (aVar12 != null) {
                info.addAction(new c.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, aVar12.getLabel()));
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(oVar.getCustomActions())) {
                List list4 = (List) semanticsNode.getUnmergedConfig$ui_release().get(oVar.getCustomActions());
                int size2 = list4.size();
                int[] iArr = A;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException(a.b.f(iArr.length, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                }
                z.u1 u1Var = new z.u1();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                z.u1 u1Var2 = this.f3626l;
                if (u1Var2.containsKey(i10)) {
                    Map map = (Map) u1Var2.get(i10);
                    List<Integer> mutableList = uu.k0.toMutableList(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list4.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        e2.d dVar = (e2.d) list4.get(i12);
                        kotlin.jvm.internal.e0.checkNotNull(map);
                        if (map.containsKey(dVar.getLabel())) {
                            Integer num = (Integer) map.get(dVar.getLabel());
                            kotlin.jvm.internal.e0.checkNotNull(num);
                            u1Var.put(num.intValue(), dVar.getLabel());
                            linkedHashMap.put(dVar.getLabel(), num);
                            mutableList.remove(num);
                            info.addAction(new c.a(num.intValue(), dVar.getLabel()));
                        } else {
                            arrayList2.add(dVar);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        e2.d dVar2 = (e2.d) arrayList2.get(i13);
                        int iIntValue = mutableList.get(i13).intValue();
                        u1Var.put(iIntValue, dVar2.getLabel());
                        linkedHashMap.put(dVar2.getLabel(), Integer.valueOf(iIntValue));
                        info.addAction(new c.a(iIntValue, dVar2.getLabel()));
                    }
                } else {
                    int size5 = list4.size();
                    for (int i14 = 0; i14 < size5; i14++) {
                        e2.d dVar3 = (e2.d) list4.get(i14);
                        int i15 = iArr[i14];
                        u1Var.put(i15, dVar3.getLabel());
                        linkedHashMap.put(dVar3.getLabel(), Integer.valueOf(i15));
                        info.addAction(new c.a(i15, dVar3.getLabel()));
                    }
                }
                this.f3625k.put(i10, u1Var);
                u1Var2.put(i10, linkedHashMap);
            }
        }
    }

    public final void q(int i10) {
        c cVar = this.f3632r;
        if (cVar != null) {
            if (i10 != cVar.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - cVar.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(l(cVar.getNode().getId()), 131072);
                accessibilityEventCreateEvent$ui_release.setFromIndex(cVar.getFromIndex());
                accessibilityEventCreateEvent$ui_release.setToIndex(cVar.getToIndex());
                accessibilityEventCreateEvent$ui_release.setAction(cVar.getAction());
                accessibilityEventCreateEvent$ui_release.setMovementGranularity(cVar.getGranularity());
                accessibilityEventCreateEvent$ui_release.getText().add(e(cVar.getNode()));
                m(accessibilityEventCreateEvent$ui_release);
            }
        }
        this.f3632r = null;
    }

    public final void r(e2.c0 c0Var, d dVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<e2.c0> replacedChildren$ui_release = c0Var.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            e2.c0 c0Var2 = replacedChildren$ui_release.get(i10);
            if (d().containsKey(Integer.valueOf(c0Var2.getId()))) {
                if (!dVar.getChildren().contains(Integer.valueOf(c0Var2.getId()))) {
                    h(c0Var.getLayoutNode$ui_release());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(c0Var2.getId()));
            }
        }
        Iterator<Integer> it = dVar.getChildren().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                h(c0Var.getLayoutNode$ui_release());
                return;
            }
        }
        List<e2.c0> replacedChildren$ui_release2 = c0Var.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            e2.c0 c0Var3 = replacedChildren$ui_release2.get(i11);
            if (d().containsKey(Integer.valueOf(c0Var3.getId()))) {
                Object obj = this.f3635u.get(Integer.valueOf(c0Var3.getId()));
                kotlin.jvm.internal.e0.checkNotNull(obj);
                r(c0Var3, (d) obj);
            }
        }
    }

    public final void s(z1.b0 b0Var, z.g gVar) {
        z1.b0 b0VarAccess$findClosestParentNode;
        e2.s outerSemantics;
        if (b0Var.isAttached() && !this.f3618d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(b0Var)) {
            e2.s outerSemantics2 = e2.d0.getOuterSemantics(b0Var);
            if (outerSemantics2 == null) {
                z1.b0 b0VarAccess$findClosestParentNode2 = q0.access$findClosestParentNode(b0Var, o0.f3741e);
                outerSemantics2 = b0VarAccess$findClosestParentNode2 != null ? e2.d0.getOuterSemantics(b0VarAccess$findClosestParentNode2) : null;
                if (outerSemantics2 == null) {
                    return;
                }
            }
            if (!outerSemantics2.collapsedSemanticsConfiguration().isMergingSemanticsOfDescendants() && (b0VarAccess$findClosestParentNode = q0.access$findClosestParentNode(b0Var, n0.f3731e)) != null && (outerSemantics = e2.d0.getOuterSemantics(b0VarAccess$findClosestParentNode)) != null) {
                outerSemantics2 = outerSemantics;
            }
            int id2 = ((e2.t) outerSemantics2.getModifier()).getId();
            if (gVar.add(Integer.valueOf(id2))) {
                o(this, l(id2), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0466  */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v7, types: [g2.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendSemanticsPropertyChangeEvents$ui_release(java.util.Map<java.lang.Integer, a2.q4> r35) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.i0.sendSemanticsPropertyChangeEvents$ui_release(java.util.Map):void");
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z10) {
        this.f3621g = z10;
    }

    public final void setHoveredVirtualViewId$ui_release(int i10) {
        this.f3619e = i10;
    }

    public final void setPreviousSemanticsNodes$ui_release(Map<Integer, d> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<set-?>");
        this.f3635u = map;
    }

    public final boolean t(e2.c0 c0Var, int i10, int i11, boolean z10) {
        String strE;
        e2.p unmergedConfig$ui_release = c0Var.getUnmergedConfig$ui_release();
        e2.o oVar = e2.o.f53581a;
        if (unmergedConfig$ui_release.contains(oVar.getSetSelection()) && q0.access$enabled(c0Var)) {
            kv.q qVar = (kv.q) ((e2.a) c0Var.getUnmergedConfig$ui_release().get(oVar.getSetSelection())).getAction();
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
        } else if ((i10 != i11 || i11 != this.f3627m) && (strE = e(c0Var)) != null) {
            if (i10 < 0 || i10 != i11 || i11 > strE.length()) {
                i10 = -1;
            }
            this.f3627m = i10;
            boolean z11 = strE.length() > 0;
            m(a(l(c0Var.getId()), z11 ? Integer.valueOf(this.f3627m) : null, z11 ? Integer.valueOf(this.f3627m) : null, z11 ? Integer.valueOf(strE.length()) : null, strE));
            q(c0Var.getId());
            return true;
        }
        return false;
    }

    public static /* synthetic */ void getPreviousSemanticsNodes$ui_release$annotations() {
    }
}
